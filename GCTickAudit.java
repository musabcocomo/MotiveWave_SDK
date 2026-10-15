package study_examples;

import com.motivewave.platform.sdk.common.DataContext;
import com.motivewave.platform.sdk.common.Defaults;
import com.motivewave.platform.sdk.common.Tick;
import com.motivewave.platform.sdk.study.Study;
import com.motivewave.platform.sdk.study.StudyHeader;

@StudyHeader(
    namespace = "com.mycompany",
    id = "GC_TICK_AUDIT",
    rb = "study_examples.nls.strings",
    name = "GC Tick Audit",
    desc = "Audits incoming GC trade ticks and attached bid/ask quotes",
    overlay = false,
    studyOverlay = false
)
public class GCTickAudit extends Study {

    private static final long SUMMARY_EVERY = 500;
    private static final long SAMPLE_EVERY = 25;
    private static final int MAX_ANOMALY_EXAMPLES = 10;
    private static final double PRICE_TOLERANCE = 0.000001;

    private long callbackCount;
    private long validVolumeCount;
    private long invalidVolumeCount;

    private long askFlagCount;
    private long bidFlagCount;
    private double askFlagVolume;
    private double bidFlagVolume;

    private long strictAskCount;
    private long strictBidCount;
    private double strictAskVolume;
    private double strictBidVolume;

    private long unclassifiedCount;
    private double unclassifiedVolume;
    private long sideMismatchCount;

    private long outsideQuoteCount;
    private double outsideQuoteVolume;
    private long insideSpreadCount;
    private long lockedQuoteCount;
    private long invalidQuoteCount;

    private boolean havePrevious;
    private long previousTime;
    private double previousPrice;
    private double previousBid;
    private double previousAsk;
    private double previousVolume;
    private boolean previousAskFlag;

    private long matchingAdjacentCount;
    private long sameTimestampMatchCount;
    private long differentTimestampMatchCount;
    private long currentMatchRun;
    private long longestMatchRun;

    private int outsideExamplesLogged;
    private int repeatExamplesLogged;

    @Override
    public void initialize(Defaults defaults) {
        // Required by MotiveWave: create the settings descriptor.
        // No custom study settings or dummy chart plots are needed.
        createSD();
    }

    @Override
    public void onTick(DataContext ctx, Tick tick) {
        if (ctx == null || tick == null) return;

        double price = tick.getPrice();
        double bid = tick.getBidPrice();
        double ask = tick.getAskPrice();
        double volume = tick.getVolume();
        boolean askFlag = tick.isAskTick();
        long time = tick.getTime();

        synchronized (this) {
            callbackCount++;

            boolean validVolume =
                Double.isFinite(volume) && volume > 0.0;

            String classification = classify(price, bid, ask);

            if (validVolume) {
                validVolumeCount++;

                if (askFlag) {
                    askFlagCount++;
                    askFlagVolume += volume;
                }
                else {
                    bidFlagCount++;
                    bidFlagVolume += volume;
                }
            }
            else {
                invalidVolumeCount++;
            }

            switch (classification) {
                case "AT_ASK":
                    if (validVolume && askFlag) {
                        strictAskCount++;
                        strictAskVolume += volume;
                    }
                    else if (validVolume) {
                        sideMismatchCount++;
                        addUnclassified(true, volume);
                    }
                    else {
                        addUnclassified(false, volume);
                    }
                    break;

                case "AT_BID":
                    if (validVolume && !askFlag) {
                        strictBidCount++;
                        strictBidVolume += volume;
                    }
                    else if (validVolume) {
                        sideMismatchCount++;
                        addUnclassified(true, volume);
                    }
                    else {
                        addUnclassified(false, volume);
                    }
                    break;

                case "OUTSIDE_QUOTE":
                    outsideQuoteCount++;

                    if (validVolume) {
                        outsideQuoteVolume += volume;
                    }

                    addUnclassified(validVolume, volume);

                    logAnomaly(
                        "OUTSIDE_QUOTE",
                        time, price, bid, ask, volume,
                        askFlag, true
                    );
                    break;

                case "INSIDE_SPREAD":
                    insideSpreadCount++;
                    addUnclassified(validVolume, volume);
                    break;

                case "LOCKED_QUOTE":
                    lockedQuoteCount++;
                    addUnclassified(validVolume, volume);
                    break;

                default:
                    invalidQuoteCount++;
                    addUnclassified(validVolume, volume);
                    break;
            }

            checkAdjacent(
                time, price, bid, ask, volume, askFlag
            );

            if (callbackCount % SUMMARY_EVERY == 0) {
                logSummary();
            }
            else if (callbackCount % SAMPLE_EVERY == 0) {
                info(
                    "GC Tick Sample"
                    + " | callback=" + callbackCount
                    + " | time=" + time
                    + " | price=" + price
                    + " | bid=" + bid
                    + " | ask=" + ask
                    + " | volume=" + volume
                    + " | isAskTick=" + askFlag
                    + " | classification=" + classification
                );
            }
        }
    }

    private void addUnclassified(
        boolean validVolume,
        double volume
    ) {
        unclassifiedCount++;

        if (validVolume) {
            unclassifiedVolume += volume;
        }
    }

    private String classify(
        double price,
        double bid,
        double ask
    ) {
        if (!Double.isFinite(price)
            || !Double.isFinite(bid)
            || !Double.isFinite(ask)
            || bid <= 0.0
            || ask <= 0.0
            || bid > ask) {
            return "INVALID_QUOTE";
        }

        if (Math.abs(ask - bid) <= PRICE_TOLERANCE) {
            return "LOCKED_QUOTE";
        }

        if (Math.abs(price - ask) <= PRICE_TOLERANCE) {
            return "AT_ASK";
        }

        if (Math.abs(price - bid) <= PRICE_TOLERANCE) {
            return "AT_BID";
        }

        if (price > bid && price < ask) {
            return "INSIDE_SPREAD";
        }

        return "OUTSIDE_QUOTE";
    }

    private void checkAdjacent(
        long time,
        double price,
        double bid,
        double ask,
        double volume,
        boolean askFlag
    ) {
        boolean sameFields =
            havePrevious
            && same(price, previousPrice)
            && same(bid, previousBid)
            && same(ask, previousAsk)
            && same(volume, previousVolume)
            && askFlag == previousAskFlag;

        if (sameFields) {
            matchingAdjacentCount++;
            currentMatchRun++;

            if (time == previousTime) {
                sameTimestampMatchCount++;
            }
            else {
                differentTimestampMatchCount++;
            }

            if (currentMatchRun > longestMatchRun) {
                longestMatchRun = currentMatchRun;
            }

            logAnomaly(
                time == previousTime
                    ? "ADJACENT_MATCH_SAME_TIMESTAMP"
                    : "ADJACENT_MATCH_DIFFERENT_TIMESTAMP",
                time, price, bid, ask, volume, askFlag, false
            );
        }
        else {
            currentMatchRun = 1;
        }

        previousTime = time;
        previousPrice = price;
        previousBid = bid;
        previousAsk = ask;
        previousVolume = volume;
        previousAskFlag = askFlag;
        havePrevious = true;
    }

    private boolean same(double a, double b) {
        return Double.doubleToLongBits(a)
            == Double.doubleToLongBits(b);
    }

    private void logAnomaly(
        String type,
        long time,
        double price,
        double bid,
        double ask,
        double volume,
        boolean askFlag,
        boolean outsideQuoteExample
    ) {
        if (outsideQuoteExample) {
            if (outsideExamplesLogged >= MAX_ANOMALY_EXAMPLES) {
                return;
            }

            outsideExamplesLogged++;
        }
        else {
            if (repeatExamplesLogged >= MAX_ANOMALY_EXAMPLES) {
                return;
            }

            repeatExamplesLogged++;
        }

        info(
            "GC Tick Audit Example"
            + " | type=" + type
            + " | callback=" + callbackCount
            + " | time=" + time
            + " | price=" + price
            + " | bid=" + bid
            + " | ask=" + ask
            + " | volume=" + volume
            + " | isAskTick=" + askFlag
        );
    }

    private void logSummary() {
        info(
            "GC Tick Audit Summary"
            + " | callbacks=" + callbackCount
            + " | validVolumeCallbacks=" + validVolumeCount
            + " | invalidVolumeCallbacks=" + invalidVolumeCount

            + " | askFlagCount=" + askFlagCount
            + " | bidFlagCount=" + bidFlagCount
            + " | askFlagVolume=" + askFlagVolume
            + " | bidFlagVolume=" + bidFlagVolume
            + " | flagDelta=" + (askFlagVolume - bidFlagVolume)

            + " | strictAskCount=" + strictAskCount
            + " | strictBidCount=" + strictBidCount
            + " | strictAskVolume=" + strictAskVolume
            + " | strictBidVolume=" + strictBidVolume
            + " | strictDelta=" + (strictAskVolume - strictBidVolume)

            + " | unclassifiedCount=" + unclassifiedCount
            + " | unclassifiedVolume=" + unclassifiedVolume
            + " | sideMismatchCount=" + sideMismatchCount

            + " | outsideQuoteCount=" + outsideQuoteCount
            + " | outsideQuoteVolume=" + outsideQuoteVolume
            + " | insideSpreadCount=" + insideSpreadCount
            + " | lockedQuoteCount=" + lockedQuoteCount
            + " | invalidQuoteCount=" + invalidQuoteCount

            + " | matchingAdjacentCount=" + matchingAdjacentCount
            + " | sameTimestampMatches=" + sameTimestampMatchCount
            + " | differentTimestampMatches="
            + differentTimestampMatchCount
            + " | currentMatchRun=" + currentMatchRun
            + " | longestMatchRun=" + longestMatchRun
        );
    }
}
