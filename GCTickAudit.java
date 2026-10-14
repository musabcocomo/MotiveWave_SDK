
package study_examples;

import com.motivewave.platform.sdk.common.DataContext;
import com.motivewave.platform.sdk.common.Tick;
import com.motivewave.platform.sdk.study.Study;
import com.motivewave.platform.sdk.study.StudyHeader;

@StudyHeader(
    namespace = "com.mycompany",
    id = "GC_TICK_AUDIT",
    rb = "study_examples.nls.strings",
    name = "GC Tick Audit",
    desc = "Logs live tick fields for data validation",
    overlay = false,
    studyOverlay = false
)
public class GCTickAudit extends Study {

    private static final long LOG_EVERY = 25;

    private long tickCount = 0;

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
