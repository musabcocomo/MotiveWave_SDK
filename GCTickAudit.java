
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
    desc = "Validates live tick data through diagnostic logging",
    overlay = false,
    studyOverlay = false
)
public class GCTickAudit extends Study {

    enum Values {
        TICK_MARKER
    }

    private static final String MARKER_PATH = "MARKER_PATH";
    private static final long LOG_EVERY = 25;

    private long tickCount = 0;

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
        DataSeries series = ctx.getDataSeries();

        if (series == null) return;

        series.setDouble(index, Values.TICK_MARKER, 0.0);
    }

    @Override
    public void onTick(DataContext ctx, Tick tick) {
        if (ctx == null || tick == null) return;

        long count;

        synchronized (this) {
            tickCount++;
            count = tickCount;
        }

        if (count % LOG_EVERY != 0) return;

        info(
            "GC Tick Audit"
            + " | count=" + count
            + " | time=" + tick.getTime()
            + " | price=" + tick.getPrice()
            + " | volume=" + tick.getVolume()
            + " | bid=" + tick.getBidPrice()
            + " | bidSize=" + tick.getBidSize()
            + " | ask=" + tick.getAskPrice()
            + " | askSize=" + tick.getAskSize()
            + " | isAskTick=" + tick.isAskTick()
        );
    }
}
