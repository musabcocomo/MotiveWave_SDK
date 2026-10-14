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
    desc = "Verifies live tick callbacks using rate-limited logging",
    overlay = false,
    studyOverlay = false
)
public class GCTickAudit extends Study {

    enum Values {
        TICK_SIGNAL
    }

    private static final String SIGNAL_PATH = "SIGNAL_PATH";
    private static final long LOG_EVERY = 100;

    private long tickCount = 0;

    @Override
    public void initialize(Defaults defaults) {
        var sd = createSD();
        var tab = sd.addTab("General");
        var group = tab.addGroup("Tick Callback Diagnostic");

        group.addRow(
            new PathDescriptor(
                SIGNAL_PATH,
                "Tick Signal",
                defaults.getLineColor(),
                2.0f,
                null
            )
        );

        var rd = createRD();
        rd.exportValue(
            new ValueDescriptor(
                Values.TICK_SIGNAL,
                "Tick Callback Signal"
            )
        );
        rd.declarePath(Values.TICK_SIGNAL, SIGNAL_PATH);
    }

    @Override
    protected void calculate(int index, DataContext ctx) {
        DataSeries series = ctx.getDataSeries();

        if (series != null) {
            series.setDouble(index, Values.TICK_SIGNAL, 0.0);
        }
    }

    @Override
    public void onTick(DataContext ctx, Tick tick) {
        if (ctx == null || tick == null) return;

        long count;

        synchronized (this) {
            tickCount++;
            count = tickCount;
        }

        if (count % LOG_EVERY == 0) {
            info(
                "GC Tick Audit: callbacks=" + count
                + ", price=" + tick.getPrice()
                + ", volume=" + tick.getVolume()
                + ", time=" + tick.getTime()
            );
        }

        DataSeries series = ctx.getDataSeries();
        if (series == null) return;

        int index = series.getEndIndex();
        if (index < 0 || index >= series.size()) return;

        synchronized (this) {
            double signal = (count % 2 == 0) ? 0.0 : 1.0;
            series.setDouble(index, Values.TICK_SIGNAL, signal);
        }

        notifyRangeUpdated();
    }
}
