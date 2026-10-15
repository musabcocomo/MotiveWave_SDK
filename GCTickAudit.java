package study_examples;

import com.motivewave.platform.sdk.common.DataContext;
import com.motivewave.platform.sdk.common.DataSeries;
import com.motivewave.platform.sdk.common.Defaults;
import com.motivewave.platform.sdk.common.Tick;
import com.motivewave.platform.sdk.common.desc.PathDescriptor;
import com.motivewave.platform.sdk.common.desc.ValueDescriptor;
import com.motivewave.platform.sdk.study.Study;
import com.motivewave.platform.sdk.study.StudyHeader;

@StudyHeader(
    namespace = "com.mycompany",
    id = "GC_TICK_AUDIT",
    rb = "study_examples.nls.strings",
    name = "GC Tick Audit",
    desc = "Audits tick volume, quote classification, and repeated-looking ticks",
    overlay = false,
    studyOverlay = false
)
public class GCTickAudit extends Study {

    enum Values {
        TICK_MARKER
    }

    private static final String MARKER_PATH = "MARKER_PATH";
    private static final long SUMMARY_EVERY = 500;
    private static final long SAMPLE_EVERY = 25;
    private static final int MAX_OUTSIDE_EXAMPLES = 20;
    private static final int MAX_REPEAT_EXAMPLES = 20;
    private static final double PRICE_TOLERANCE = 0.000001;

    private long tickCount;
    private long validVolumeTicks;
    private long invalidVolumeTicks;

    private long askFlagTicks;
    private long bidFlagTicks;
    private double flagAskVolume;
    private double flagBidVolume;

    private long strictAskTicks;
    private long strictBidTicks;
    private double strictAskVolume;
    private double strictBidVolume;

    private long unclassifiedTicks;
    private double unclassifiedVolume;

    private long outsideQuoteTicks;
    private double outsideQuoteVolume;
    private long outsideAskFlagTicks;
    private long outsideBidFlagTicks;
    private double outsideAskFlagVolume;
    private double outsideBidFlagVolume;

    private long insideSpreadTicks;
    private long lockedQuoteTicks;
    private long invalidQuoteTicks;
    private long sideMismatches;

    // Previous tick fields for adjacent-pattern diagnostics.
    private boolean havePreviousTick;
    private long previousTime;
    private double previousPrice;
    private double previousBid;
    private double previousAsk;
    private double previousVolume;
    private boolean previousAskFlag;

    // Adjacent matches with identical market fields and the same timestamp.
    private long adjacentSameTimestampMatches;

    // Adjacent matches with identical market fields but different timestamps.
    private long adjacentDifferentTimestampMatches;

    // All adjacent matches on market fields, regardless of timestamp.
    private long adjacentMatchingFieldMatches;

    // Consecutive run length of matching market fields.
    private long currentMatchingFieldRun;
    private long longestMatchingFieldRun;
    private long longestRunEndingAtTick;
    private long longestRunStartTime;
    private long longestRunEndTime;

    private int repeatExamplesLogged;
    private int outsideExamplesLogged;

    @Override
    public void initialize(Defaults defaults) {
        var sd = createSD();
        var tab = sd.addTab("General");
        var group = tab.addGroup("Tick Audit");

        group.addRow(
            new PathDescriptor(
                MARKER_PATH,
                "Diagnostic Line",
                defaults.getLineColor(),
                2.0f,
                null
            )
        );

        var rd = createRD();

        rd.exportValue(
            new ValueDescriptor(
                Values.TICK_MARKER,
                "Tick Audit Marker"
            )
        );

        rd.declarePath(Values.TICK_MARKER, MARKER_PATH);
    }

    @Override
    protected void calculate(int index, DataContext ctx) {
        if (ctx == null) return;

        DataSeries series = ctx.getDataSeries();
        if (series == null) return;

        series.setDouble(index, Values.TICK_MARKER, 0.0);
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
            tickCount++;

            boolean validVolume =
                Double.isFinite(volume) && volume > 0.0;

            // Diagnostic only: never discard, merge, or alter a tick.
            checkAdjacentPatterns(
                time, price, bid, ask, volume, askFlag
            );

            if (validVolume) {
                validVolumeTicks++;

                if (askFlag) {
                    askFlagTicks++;
                    flagAskVolume += volume;
                }
                else {
                    bidFlagTicks++;
                    flagBidVolume += volume;
                }
            }
            else {
                invalidVolumeTicks++;
            }

            String priceClass = classifyPrice(price, bid, ask);

            if ("LOCKED_QUOTE".equals(priceClass)) {
                lockedQuoteTicks++;
            }
            else if ("INVALID_QUOTE".equals(priceClass)) {
                invalidQuoteTicks++;
            }
            else if ("INSIDE_SPREAD".equals(priceClass)) {
                insideSpreadTicks++;
            }
            else if ("OUTSIDE_QUOTE".equals(priceClass)) {
                outsideQuoteTicks++;

                if (validVolume) {
                    outsideQuoteVolume += volume;

                    if (askFlag) {
                        outsideAskFlagTicks++;
                        outsideAskFlagVolume += volume;
                    }
                    else {
                        outsideBidFlagTicks++;
                        outsideBidFlagVolume += volume;
                    }
                }

                if (outsideExamplesLogged < MAX_OUTSIDE_EXAMPLES) {
                    outsideExamplesLogged++;

                    info(
                        "GC Tick Outside Quote"
                        + " | count=" + tickCount
                        + " | time=" + time
                        + " | price=" + price
                        + " | bid=" + bid
                        + " | ask=" + ask
                        + " | volume=" + volume
                        + " | isAskTick=" + askFlag
                    );
                }
            }

            // Strict delta: trade price and side flag must agree.
            if (validVolume && "AT_ASK".equals(priceClass)) {
                if (askFlag) {
                    strictAskTicks++;
                    strictAskVolume += volume;
                }
                else {
                    sideMismatches++;
                    unclassifiedTicks++;
                    unclassifiedVolume += volume;
                }
            }
            else if (validVolume && "AT_BID".equals(priceClass)) {
                if (!askFlag) {
                    strictBidTicks++;
                    strictBidVolume += volume;
                }
                else {
                    sideMismatches++;
                    unclassifiedTicks++;
                    unclassifiedVolume += volume;
                }
            }
            else {
                unclassifiedTicks++;

                if (validVolume) {
                    unclassifiedVolume += volume;
                }
            }

            if (tickCount % SUMMARY_EVERY == 0) {
                logSummary();
            }
            else if (tickCount % SAMPLE_EVERY == 0) {
                info(
                    "GC Tick Sample"
                    + " | count=" + tickCount
                    + " | time=" + time
                    + " | price=" + price
                    + " | bid=" + bid
                    + " | ask=" + ask
                    + " | volume=" + volume
                    + " | priceClass=" + priceClass
                    + " | isAskTick=" + askFlag
                );
            }
        }
    }

    private void checkAdjacentPatterns(
        long time,
        double price,
        double bid,
        double ask,
        double volume,
        boolean askFlag
    ) {
        boolean sameMarketFields =
            havePreviousTick
            && sameDouble(price, previousPrice)
            && sameDouble(bid, previousBid)
            && sameDouble(ask, previousAsk)
            && sameDouble(volume, previousVolume)
            && askFlag == previousAskFlag;

        boolean sameTimestamp =
            sameMarketFields && time == previousTime;

        if (sameMarketFields) {
            adjacentMatchingFieldMatches++;
            currentMatchingFieldRun++;

            if (sameTimestamp) {
                adjacentSameTimestampMatches++;
            }
            else {
                adjacentDifferentTimestampMatches++;
            }

            if (currentMatchingFieldRun > longestMatchingFieldRun) {
                longestMatchingFieldRun = currentMatchingFieldRun;
                longestRunEndingAtTick = tickCount;
                longestRunStartTime = previousTime;
                longestRunEndTime = time;
            }

            if (repeatExamplesLogged < MAX_REPEAT_EXAMPLES) {
                repeatExamplesLogged++;

                String timestampType = sameTimestamp
                    ? "SAME_TIMESTAMP"
                    : "DIFFERENT_TIMESTAMP";

                info(
                    "GC Tick Adjacent Pattern"
                    + " | tick=" + tickCount
                    + " | type=" + timestampType
                    + " | previousTime=" + previousTime
                    + " | currentTime=" + time
                    + " | price=" + price
                    + " | bid=" + bid
                    + " | ask=" + ask
                    + " | volume=" + volume
                    + " | isAskTick=" + askFlag
                    + " | matchingFieldRun=" + currentMatchingFieldRun
                );
            }
        }
        else {
            currentMatchingFieldRun = 1;
        }

        // Always remember the immediately preceding tick.
        previousTime = time;
        previousPrice = price;
        previousBid = bid;
        previousAsk = ask;
        previousVolume = volume;
        previousAskFlag = askFlag;
        havePreviousTick = true;
    }

    private boolean sameDouble(double a, double b) {
        return Double.doubleToLongBits(a)
            == Double.doubleToLongBits(b);
    }

    private String classifyPrice(
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

    private void logSummary() {
        double strictDelta = strictAskVolume - strictBidVolume;
        double flagDelta = flagAskVolume - flagBidVolume;
        double outsideFlagDelta =
            outsideAskFlagVolume - outsideBidFlagVolume;

        info(
            "GC Tick Audit Summary"
            + " | ticks=" + tickCount
            + " | validVolumeTicks=" + validVolumeTicks
            + " | invalidVolumeTicks=" + invalidVolumeTicks

            + " | strictAskTicks=" + strictAskTicks
            + " | strictBidTicks=" + strictBidTicks
            + " | strictAskVolume=" + strictAskVolume
            + " | strictBidVolume=" + strictBidVolume
            + " | strictDelta=" + strictDelta

            + " | askFlagTicks=" + askFlagTicks
            + " | bidFlagTicks=" + bidFlagTicks
            + " | flagAskVolume=" + flagAskVolume
            + " | flagBidVolume=" + flagBidVolume
            + " | flagDelta=" + flagDelta

            + " | outsideQuoteTicks=" + outsideQuoteTicks
            + " | outsideQuoteVolume=" + outsideQuoteVolume
            + " | outsideAskFlagTicks=" + outsideAskFlagTicks
            + " | outsideBidFlagTicks=" + outsideBidFlagTicks
            + " | outsideAskFlagVolume=" + outsideAskFlagVolume
            + " | outsideBidFlagVolume=" + outsideBidFlagVolume
            + " | outsideFlagDelta=" + outsideFlagDelta

            + " | unclassifiedTicks=" + unclassifiedTicks
            + " | unclassifiedVolume=" + unclassifiedVolume
            + " | sideMismatches=" + sideMismatches
            + " | insideSpread=" + insideSpreadTicks
            + " | lockedQuote=" + lockedQuoteTicks
            + " | invalidQuote=" + invalidQuoteTicks

            + " | adjacentMatchingFieldMatches="
            + adjacentMatchingFieldMatches
            + " | adjacentSameTimestampMatches="
            + adjacentSameTimestampMatches
            + " | adjacentDifferentTimestampMatches="
            + adjacentDifferentTimestampMatches
            + " | currentMatchingFieldRun=" + currentMatchingFieldRun
            + " | longestMatchingFieldRun=" + longestMatchingFieldRun
            + " | longestRunEndingAtTick=" + longestRunEndingAtTick
            + " | longestRunStartTime=" + longestRunStartTime
            + " | longestRunEndTime=" + longestRunEndTime
            + " | repeatExamplesLogged=" + repeatExamplesLogged
        );
    }
}
