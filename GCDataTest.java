package study_examples;

import com.motivewave.platform.sdk.common.DataContext;
import com.motivewave.platform.sdk.common.DataSeries;
import com.motivewave.platform.sdk.common.Defaults;
import com.motivewave.platform.sdk.common.Enums;
import com.motivewave.platform.sdk.common.desc.InputDescriptor;
import com.motivewave.platform.sdk.common.desc.PathDescriptor;
import com.motivewave.platform.sdk.common.desc.ValueDescriptor;
import com.motivewave.platform.sdk.study.Study;
import com.motivewave.platform.sdk.study.StudyHeader;

@StudyHeader(
    namespace = "com.mycompany",
    id = "GC_DATA_TEST",
    rb = "study_examples.nls.strings",
    name = "GC Data Test",
    desc = "Plots closing prices to validate chart data",
    overlay = true,
    studyOverlay = true
)
public class GCDataTest extends Study {

    enum Values {
        CLOSE_CHECK
    }

    private static final String INPUT = "INPUT";
    private static final String CLOSE_PATH = "CLOSE_PATH";

    @Override
    public void initialize(Defaults defaults) {
        var sd = createSD();
        var tab = sd.addTab("General");
        var group = tab.addGroup("Inputs");

        group.addRow(
            new InputDescriptor(INPUT, "Price Input", Enums.BarInput.CLOSE)
        );

        group.addRow(
            new PathDescriptor(
                CLOSE_PATH,
                "Close Line",
                defaults.getLineColor(),
                2.0f,
                null
            )
        );

        var rd = createRD();

        rd.exportValue(
            new ValueDescriptor(
                Values.CLOSE_CHECK,
                "Close Check",
                new String[] { INPUT }
            )
        );

        rd.declarePath(Values.CLOSE_CHECK, CLOSE_PATH);
    }

    @Override
    protected void calculate(int index, DataContext ctx) {
        DataSeries series = ctx.getDataSeries();
        float close = series.getClose(index);

        if (Float.isNaN(close)) {
            return;
        }

        series.setDouble(index, Values.CLOSE_CHECK, (double) close);
    }
}
