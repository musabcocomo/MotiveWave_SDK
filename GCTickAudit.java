
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
    desc = "Compares quote-validated tick volume with tick-side volume",
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

        synchronized (this) {
            tickCount++;

            boolean validVolume =
                Double.isFinite(volume) && volume > 0.0;

            if (validVolume) {
                validVolumeTicks++;

                // Independent measurement: use the tick-side flag only.
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
                        + " | time=" + tick.getTime()
                        + " | price=" + price
                        + " | bid=" + bid
                        + " | ask=" + ask
                        + " | volume=" + volume
                        + " | isAskTick=" + askFlag
                    );
                }
            }

            // Strict measurement: require price and side flag to agree.
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
                    + " | time=" + tick.getTime()
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

    private String classifyPrice(double price, double bid, double ask) {
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
        );
    }
}
