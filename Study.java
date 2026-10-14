// Compiled from Study.java (version 25 : 69.0, super bit)
public class com.motivewave.platform.sdk.study.Study implements java.lang.Cloneable {
  
  // Field descriptor #33 I
  public static final int SHIFT_DOWN = 64;
  
  // Field descriptor #33 I
  public static final int CTRL_DOWN = 128;
  
  // Field descriptor #33 I
  public static final int META_DOWN = 256;
  
  // Field descriptor #33 I
  public static final int ALT_DOWN = 512;
  
  // Field descriptor #21 Ljava/util/Map;
  // Signature: Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lcom/motivewave/platform/sdk/draw/Figure;>;>;
  private java.util.Map figureMap;
  
  // Field descriptor #29 Lcom/motivewave/platform/sdk/study/RuntimeDescriptor;
  private com.motivewave.platform.sdk.study.RuntimeDescriptor runtimeDescriptor;
  
  // Field descriptor #264 Lcom/motivewave/platform/sdk/common/desc/SettingsDescriptor;
  private com.motivewave.platform.sdk.common.desc.SettingsDescriptor settingsDescriptor;
  
  // Field descriptor #268 Lcom/motivewave/platform/sdk/common/Settings;
  private com.motivewave.platform.sdk.common.Settings settings;
  
  // Field descriptor #769 Lcom/motivewave/platform/databean/StudyInfo;
  private com.motivewave.platform.databean.StudyInfo info;
  
  // Field descriptor #33 I
  private int minBars;
  
  // Field descriptor #21 Ljava/util/Map;
  // Signature: Ljava/util/Map<Lcom/motivewave/platform/sdk/common/BarSize;Ljava/lang/Integer;>;
  private java.util.Map minBarMap;
  
  // Field descriptor #40 Ljava/lang/Long;
  private java.lang.Long minStartTime;
  
  // Field descriptor #33 I
  private int figureUpdateCount;
  
  // Field descriptor #47 Z
  private boolean figureUpdatePending;
  
  // Field descriptor #47 Z
  private boolean cancelInProgress;
  
  // Field descriptor #47 Z
  private boolean ignoreFigureUpdates;
  
  // Field descriptor #47 Z
  private boolean vetoClosePosition;
  
  // Field descriptor #47 Z
  private boolean destroyed;
  
  // Field descriptor #65 Lcom/motivewave/platform/sdk/common/Enums$StrategyState;
  private com.motivewave.platform.sdk.common.Enums$StrategyState state;
  
  // Field descriptor #74 Lcom/motivewave/platform/sdk/common/Enums$EntryState;
  private com.motivewave.platform.sdk.common.Enums$EntryState entryState;
  
  // Field descriptor #81 Ljava/lang/Boolean;
  private java.lang.Boolean iLong;
  
  // Field descriptor #21 Ljava/util/Map;
  // Signature: Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
  private java.util.Map labelMap;
  
  // Field descriptor #88 Ljava/lang/Float;
  private java.lang.Float stopPrice;
  
  // Field descriptor #88 Ljava/lang/Float;
  private java.lang.Float targetPrice;
  
  // Field descriptor #95 Lcom/motivewave/platform/sdk/common/DataContext;
  private com.motivewave.platform.sdk.common.DataContext dataCtx;
  
  // Field descriptor #33 I
  private int lastSize;
  
  // Field descriptor #107 Lcom/motivewave/common/util/WeakPropertyChangeSupport;
  private com.motivewave.common.util.WeakPropertyChangeSupport weakSupport;
  
  // Field descriptor #81 Ljava/lang/Boolean;
  private java.lang.Boolean overlay;
  
  // Field descriptor #114 J
  private long lastRangeUpdate;
  
  // Field descriptor #114 J
  private long lastRedraw;
  
  // Field descriptor #114 J
  private long lastValuesUpdated;
  
  // Method descriptor #6 ()V
  // Stack: 4, Locals: 1
  public Study();
      0  aload_0 [this]
      1  invokespecial java.lang.Object() [1]
      4  aload_0 [this]
      5  new java.util.HashMap [7]
      8  dup
      9  invokespecial java.util.HashMap() [9]
     12  invokestatic java.util.Collections.synchronizedMap(java.util.Map) : java.util.Map [10]
     15  putfield com.motivewave.platform.sdk.study.Study.figureMap : java.util.Map [16]
     18  aload_0 [this]
     19  aload_0 [this]
     20  invokevirtual com.motivewave.platform.sdk.study.Study.createRD() : com.motivewave.platform.sdk.study.RuntimeDescriptor [22]
     23  putfield com.motivewave.platform.sdk.study.Study.runtimeDescriptor : com.motivewave.platform.sdk.study.RuntimeDescriptor [26]
     26  aload_0 [this]
     27  bipush 20
     29  putfield com.motivewave.platform.sdk.study.Study.minBars : int [30]
     32  aload_0 [this]
     33  new java.util.HashMap [7]
     36  dup
     37  invokespecial java.util.HashMap() [9]
     40  putfield com.motivewave.platform.sdk.study.Study.minBarMap : java.util.Map [34]
     43  aload_0 [this]
     44  aconst_null
     45  putfield com.motivewave.platform.sdk.study.Study.minStartTime : java.lang.Long [37]
     48  aload_0 [this]
     49  iconst_0
     50  putfield com.motivewave.platform.sdk.study.Study.figureUpdateCount : int [41]
     53  aload_0 [this]
     54  iconst_0
     55  putfield com.motivewave.platform.sdk.study.Study.figureUpdatePending : boolean [44]
     58  aload_0 [this]
     59  iconst_0
     60  putfield com.motivewave.platform.sdk.study.Study.cancelInProgress : boolean [48]
     63  aload_0 [this]
     64  iconst_0
     65  putfield com.motivewave.platform.sdk.study.Study.ignoreFigureUpdates : boolean [51]
     68  aload_0 [this]
     69  iconst_0
     70  putfield com.motivewave.platform.sdk.study.Study.vetoClosePosition : boolean [54]
     73  aload_0 [this]
     74  iconst_0
     75  putfield com.motivewave.platform.sdk.study.Study.destroyed : boolean [57]
     78  aload_0 [this]
     79  getstatic com.motivewave.platform.sdk.common.Enums$StrategyState.INACTIVE : com.motivewave.platform.sdk.common.Enums.StrategyState [60]
     82  putfield com.motivewave.platform.sdk.study.Study.state : com.motivewave.platform.sdk.common.Enums.StrategyState [66]
     85  aload_0 [this]
     86  getstatic com.motivewave.platform.sdk.common.Enums$EntryState.NONE : com.motivewave.platform.sdk.common.Enums.EntryState [69]
     89  putfield com.motivewave.platform.sdk.study.Study.entryState : com.motivewave.platform.sdk.common.Enums.EntryState [75]
     92  aload_0 [this]
     93  aconst_null
     94  putfield com.motivewave.platform.sdk.study.Study.iLong : java.lang.Boolean [78]
     97  aload_0 [this]
     98  new java.util.HashMap [7]
    101  dup
    102  invokespecial java.util.HashMap() [9]
    105  invokestatic java.util.Collections.synchronizedMap(java.util.Map) : java.util.Map [10]
    108  putfield com.motivewave.platform.sdk.study.Study.labelMap : java.util.Map [82]
    111  aload_0 [this]
    112  aconst_null
    113  putfield com.motivewave.platform.sdk.study.Study.stopPrice : java.lang.Float [85]
    116  aload_0 [this]
    117  aconst_null
    118  putfield com.motivewave.platform.sdk.study.Study.targetPrice : java.lang.Float [89]
    121  aload_0 [this]
    122  aconst_null
    123  putfield com.motivewave.platform.sdk.study.Study.dataCtx : com.motivewave.platform.sdk.common.DataContext [92]
    126  aload_0 [this]
    127  iconst_m1
    128  putfield com.motivewave.platform.sdk.study.Study.lastSize : int [96]
    131  aload_0 [this]
    132  new com.motivewave.common.util.WeakPropertyChangeSupport [99]
    135  dup
    136  aload_0 [this]
    137  invokespecial com.motivewave.common.util.WeakPropertyChangeSupport(java.lang.Object) [101]
    140  putfield com.motivewave.platform.sdk.study.Study.weakSupport : com.motivewave.common.util.WeakPropertyChangeSupport [104]
    143  aload_0 [this]
    144  aconst_null
    145  putfield com.motivewave.platform.sdk.study.Study.overlay : java.lang.Boolean [108]
    148  aload_0 [this]
    149  lconst_0
    150  putfield com.motivewave.platform.sdk.study.Study.lastRangeUpdate : long [111]
    153  aload_0 [this]
    154  lconst_0
    155  putfield com.motivewave.platform.sdk.study.Study.lastRedraw : long [115]
    158  aload_0 [this]
    159  lconst_0
    160  putfield com.motivewave.platform.sdk.study.Study.lastValuesUpdated : long [118]
    163  return
      Line numbers:
        [pc: 0, line: 45]
        [pc: 4, line: 56]
        [pc: 18, line: 57]
        [pc: 26, line: 61]
        [pc: 32, line: 62]
        [pc: 43, line: 63]
        [pc: 48, line: 64]
        [pc: 53, line: 65]
        [pc: 78, line: 67]
        [pc: 85, line: 68]
        [pc: 92, line: 69]
        [pc: 97, line: 70]
        [pc: 111, line: 72]
        [pc: 116, line: 73]
        [pc: 121, line: 74]
        [pc: 126, line: 75]
        [pc: 131, line: 77]
        [pc: 143, line: 78]
        [pc: 148, line: 79]
  
  // Method descriptor #799 (Lcom/motivewave/platform/sdk/common/Defaults;)V
  // Stack: 0, Locals: 2
  public void initialize(com.motivewave.platform.sdk.common.Defaults arg0);
    0  return
      Line numbers:
        [pc: 0, line: 88]
  
  // Method descriptor #799 (Lcom/motivewave/platform/sdk/common/Defaults;)V
  // Stack: 0, Locals: 2
  public void onLoad(com.motivewave.platform.sdk.common.Defaults arg0);
    0  return
      Line numbers:
        [pc: 0, line: 94]
  
  // Method descriptor #213 (Lcom/motivewave/platform/sdk/common/DataContext;)V
  // Stack: 0, Locals: 2
  protected void precalculate(com.motivewave.platform.sdk.common.DataContext arg0);
    0  return
      Line numbers:
        [pc: 0, line: 98]
  
  // Method descriptor #213 (Lcom/motivewave/platform/sdk/common/DataContext;)V
  // Stack: 0, Locals: 2
  protected void postcalculate(com.motivewave.platform.sdk.common.DataContext arg0);
    0  return
      Line numbers:
        [pc: 0, line: 102]
  
  // Method descriptor #206 (ILcom/motivewave/platform/sdk/common/DataContext;)V
  // Stack: 0, Locals: 3
  protected void calculate(int arg0, com.motivewave.platform.sdk.common.DataContext arg1);
    0  return
      Line numbers:
        [pc: 0, line: 109]
  
  // Method descriptor #213 (Lcom/motivewave/platform/sdk/common/DataContext;)V
  // Stack: 3, Locals: 8
  protected void calculateValues(com.motivewave.platform.sdk.common.DataContext arg0);
      0  aload_0 [this]
      1  aload_1 [arg0]
      2  putfield com.motivewave.platform.sdk.study.Study.dataCtx : com.motivewave.platform.sdk.common.DataContext [92]
      5  aload_1 [arg0]
      6  ifnonnull 10
      9  return
     10  aload_1 [arg0]
     11  invokeinterface com.motivewave.platform.sdk.common.DataContext.getDataSeries() : com.motivewave.platform.sdk.common.DataSeries [121] [nargs: 1]
     16  astore_2
     17  aload_0 [this]
     18  invokevirtual com.motivewave.platform.sdk.study.Study.getInfo() : com.motivewave.platform.databean.StudyInfo [127]
     21  invokevirtual com.motivewave.platform.databean.StudyInfo.isMultipleInstruments() : boolean [131]
     24  ifeq 92
     27  aload_0 [this]
     28  invokevirtual com.motivewave.platform.sdk.study.Study.getInstruments() : java.util.List [137]
     31  astore_3
     32  aload_3
     33  invokestatic com.motivewave.platform.sdk.common.Util.isEmpty(java.lang.Object) : boolean [141]
     36  ifne 92
     39  aload_3
     40  invokeinterface java.util.List.iterator() : java.util.Iterator [147] [nargs: 1]
     45  astore 4
     47  aload 4
     49  invokeinterface java.util.Iterator.hasNext() : boolean [153] [nargs: 1]
     54  ifeq 92
     57  aload 4
     59  invokeinterface java.util.Iterator.next() : java.lang.Object [158] [nargs: 1]
     64  checkcast com.motivewave.platform.sdk.common.Instrument [162]
     67  astore 5
     69  aload 5
     71  ifnonnull 77
     74  goto 47
     77  aload_2
     78  aload 5
     80  invokeinterface com.motivewave.platform.sdk.common.DataSeries.hasData(com.motivewave.platform.sdk.common.Instrument) : boolean [164] [nargs: 2]
     85  ifne 89
     88  return
     89  goto 47
     92  aload_0 [this]
     93  invokevirtual com.motivewave.platform.sdk.study.Study.getBarSizes() : java.util.List [170]
     96  astore_3
     97  aload_3
     98  invokestatic com.motivewave.platform.sdk.common.Util.isEmpty(java.lang.Object) : boolean [141]
    101  ifne 163
    104  aload_3
    105  invokeinterface java.util.List.iterator() : java.util.Iterator [147] [nargs: 1]
    110  astore 4
    112  aload 4
    114  invokeinterface java.util.Iterator.hasNext() : boolean [153] [nargs: 1]
    119  ifeq 163
    122  aload 4
    124  invokeinterface java.util.Iterator.next() : java.lang.Object [158] [nargs: 1]
    129  checkcast com.motivewave.platform.sdk.common.BarSize [173]
    132  astore 5
    134  aload_1 [arg0]
    135  aload 5
    137  invokeinterface com.motivewave.platform.sdk.common.DataContext.getDataSeries(com.motivewave.platform.sdk.common.BarSize) : com.motivewave.platform.sdk.common.DataSeries [175] [nargs: 2]
    142  astore 6
    144  aload 6
    146  ifnull 159
    149  aload 6
    151  invokeinterface com.motivewave.platform.sdk.common.DataSeries.hasData() : boolean [178] [nargs: 1]
    156  ifne 160
    159  return
    160  goto 112
    163  aload_2
    164  ifnonnull 168
    167  return
    168  aload_0 [this]
    169  invokevirtual com.motivewave.platform.sdk.study.Study.getInfo() : com.motivewave.platform.databean.StudyInfo [127]
    172  astore 4
    174  aload_0 [this]
    175  invokevirtual com.motivewave.platform.sdk.study.Study.getSettings() : com.motivewave.platform.sdk.common.Settings [180]
    178  invokevirtual com.motivewave.platform.sdk.common.Settings.isBarUpdates() : boolean [184]
    181  ifne 197
    184  aload 4
    186  ifnull 201
    189  aload 4
    191  invokevirtual com.motivewave.platform.databean.StudyInfo.isRequiresBarUpdates() : boolean [189]
    194  ifeq 201
    197  iconst_1
    198  goto 202
    201  iconst_0
    202  istore 5
    204  iconst_0
    205  istore 6
    207  aload_0 [this]
    208  getfield com.motivewave.platform.sdk.study.Study.lastSize : int [96]
    211  aload_2
    212  invokeinterface com.motivewave.platform.sdk.common.DataSeries.size() : int [192] [nargs: 1]
    217  if_icmple 225
    220  aload_0 [this]
    221  iconst_m1
    222  putfield com.motivewave.platform.sdk.study.Study.lastSize : int [96]
    225  aload_2
    226  invokeinterface com.motivewave.platform.sdk.common.DataSeries.size() : int [192] [nargs: 1]
    231  aload_0 [this]
    232  getfield com.motivewave.platform.sdk.study.Study.lastSize : int [96]
    235  isub
    236  iconst_1
    237  if_icmpne 281
    240  aload_2
    241  invokeinterface com.motivewave.platform.sdk.common.DataSeries.size() : int [192] [nargs: 1]
    246  iconst_1
    247  isub
    248  istore 7
    250  iload 7
    252  iflt 281
    255  aload_2
    256  iload 7
    258  invokeinterface com.motivewave.platform.sdk.common.DataSeries.isComplete(int) : boolean [196] [nargs: 2]
    263  ifeq 275
    266  iload 7
    268  iconst_1
    269  iadd
    270  istore 6
    272  goto 281
    275  iinc 7 -1
    278  goto 250
    281  iload 6
    283  istore 7
    285  iload 7
    287  aload_2
    288  invokeinterface com.motivewave.platform.sdk.common.DataSeries.size() : int [192] [nargs: 1]
    293  if_icmpge 342
    296  aload_2
    297  iload 7
    299  invokeinterface com.motivewave.platform.sdk.common.DataSeries.isComplete(int) : boolean [196] [nargs: 2]
    304  ifeq 310
    307  goto 336
    310  iload 5
    312  ifne 329
    315  aload_2
    316  iload 7
    318  invokeinterface com.motivewave.platform.sdk.common.DataSeries.isBarComplete(int) : boolean [200] [nargs: 2]
    323  ifne 329
    326  goto 336
    329  aload_0 [this]
    330  iload 7
    332  aload_1 [arg0]
    333  invokevirtual com.motivewave.platform.sdk.study.Study.calculate(int, com.motivewave.platform.sdk.common.DataContext) : void [203]
    336  iinc 7 1
    339  goto 285
    342  aload_0 [this]
    343  aload_2
    344  invokeinterface com.motivewave.platform.sdk.common.DataSeries.size() : int [192] [nargs: 1]
    349  putfield com.motivewave.platform.sdk.study.Study.lastSize : int [96]
    352  aload_0 [this]
    353  invokevirtual com.motivewave.platform.sdk.study.Study.notifyRangeUpdated() : void [207]
    356  return
      Line numbers:
        [pc: 0, line: 114]
        [pc: 5, line: 115]
        [pc: 10, line: 117]
        [pc: 17, line: 118]
        [pc: 27, line: 119]
        [pc: 32, line: 120]
        [pc: 39, line: 121]
        [pc: 69, line: 122]
        [pc: 77, line: 123]
        [pc: 89, line: 124]
        [pc: 92, line: 128]
        [pc: 97, line: 129]
        [pc: 104, line: 130]
        [pc: 134, line: 131]
        [pc: 144, line: 132]
        [pc: 160, line: 133]
        [pc: 163, line: 136]
        [pc: 168, line: 137]
        [pc: 174, line: 138]
        [pc: 204, line: 140]
        [pc: 207, line: 141]
        [pc: 225, line: 142]
        [pc: 240, line: 143]
        [pc: 255, line: 144]
        [pc: 266, line: 145]
        [pc: 272, line: 146]
        [pc: 275, line: 143]
        [pc: 281, line: 151]
        [pc: 296, line: 153]
        [pc: 310, line: 154]
        [pc: 329, line: 155]
        [pc: 336, line: 151]
        [pc: 342, line: 157]
        [pc: 352, line: 158]
        [pc: 356, line: 159]
      Stack map table: number of frames 22
        [pc: 10, same]
        [pc: 47, append: {com.motivewave.platform.sdk.common.DataSeries, java.util.List, java.util.Iterator}]
        [pc: 77, append: {com.motivewave.platform.sdk.common.Instrument}]
        [pc: 89, chop 1 local(s)]
        [pc: 92, chop 2 local(s)]
        [pc: 112, append: {java.util.List, java.util.Iterator}]
        [pc: 159, append: {com.motivewave.platform.sdk.common.BarSize, com.motivewave.platform.sdk.common.DataSeries}]
        [pc: 160, chop 2 local(s)]
        [pc: 163, chop 1 local(s)]
        [pc: 168, same]
        [pc: 197, append: {com.motivewave.platform.databean.StudyInfo}]
        [pc: 201, same]
        [pc: 202, same_locals_1_stack_item, stack: {int}]
        [pc: 225, append: {int, int}]
        [pc: 250, append: {int}]
        [pc: 275, same]
        [pc: 281, chop 1 local(s)]
        [pc: 285, append: {int}]
        [pc: 310, same]
        [pc: 329, same]
        [pc: 336, same]
        [pc: 342, chop 1 local(s)]
  
  // Method descriptor #136 ()Z
  // Stack: 1, Locals: 1
  public boolean isRepaintAllOnUpdate();
    0  iconst_0
    1  ireturn
      Line numbers:
        [pc: 0, line: 165]
  
  // Method descriptor #136 ()Z
  // Stack: 1, Locals: 1
  public boolean hasFooter();
    0  iconst_0
    1  ireturn
      Line numbers:
        [pc: 0, line: 167]
  
  // Method descriptor #213 (Lcom/motivewave/platform/sdk/common/DataContext;)V
  // Stack: 2, Locals: 2
  public void onBarOpen(com.motivewave.platform.sdk.common.DataContext arg0);
    0  aload_0 [this]
    1  aload_1 [arg0]
    2  invokevirtual com.motivewave.platform.sdk.study.Study.onBarUpdate(com.motivewave.platform.sdk.common.DataContext) : void [210]
    5  return
      Line numbers:
        [pc: 0, line: 172]
  
  // Method descriptor #213 (Lcom/motivewave/platform/sdk/common/DataContext;)V
  // Stack: 3, Locals: 3
  public void onBarUpdate(com.motivewave.platform.sdk.common.DataContext arg0);
     0  aload_0 [this]
     1  aload_1 [arg0]
     2  putfield com.motivewave.platform.sdk.study.Study.dataCtx : com.motivewave.platform.sdk.common.DataContext [92]
     5  aload_0 [this]
     6  invokevirtual com.motivewave.platform.sdk.study.Study.getInfo() : com.motivewave.platform.databean.StudyInfo [127]
     9  astore_2
    10  aload_0 [this]
    11  invokevirtual com.motivewave.platform.sdk.study.Study.getSettings() : com.motivewave.platform.sdk.common.Settings [180]
    14  invokevirtual com.motivewave.platform.sdk.common.Settings.isBarUpdates() : boolean [184]
    17  ifne 31
    20  aload_2
    21  ifnull 49
    24  aload_2
    25  invokevirtual com.motivewave.platform.databean.StudyInfo.isRequiresBarUpdates() : boolean [189]
    28  ifeq 49
    31  aload_0 [this]
    32  aload_1 [arg0]
    33  invokeinterface com.motivewave.platform.sdk.common.DataContext.getDataSeries() : com.motivewave.platform.sdk.common.DataSeries [121] [nargs: 1]
    38  invokeinterface com.motivewave.platform.sdk.common.DataSeries.size() : int [192] [nargs: 1]
    43  iconst_1
    44  isub
    45  aload_1 [arg0]
    46  invokevirtual com.motivewave.platform.sdk.study.Study.calculate(int, com.motivewave.platform.sdk.common.DataContext) : void [203]
    49  return
      Line numbers:
        [pc: 0, line: 177]
        [pc: 5, line: 178]
        [pc: 10, line: 179]
        [pc: 31, line: 180]
        [pc: 49, line: 182]
      Stack map table: number of frames 2
        [pc: 31, append: {com.motivewave.platform.databean.StudyInfo}]
        [pc: 49, same]
  
  // Method descriptor #806 (Lcom/motivewave/platform/sdk/common/DataContext;Lcom/motivewave/platform/sdk/common/Tick;)V
  // Stack: 0, Locals: 3
  public void onTick(com.motivewave.platform.sdk.common.DataContext arg0, com.motivewave.platform.sdk.common.Tick arg1);
    0  return
      Line numbers:
        [pc: 0, line: 186]
  
  // Method descriptor #213 (Lcom/motivewave/platform/sdk/common/DataContext;)V
  // Stack: 3, Locals: 2
  public void onBarClose(com.motivewave.platform.sdk.common.DataContext arg0);
     0  aload_0 [this]
     1  aload_1 [arg0]
     2  putfield com.motivewave.platform.sdk.study.Study.dataCtx : com.motivewave.platform.sdk.common.DataContext [92]
     5  aload_0 [this]
     6  aload_1 [arg0]
     7  invokeinterface com.motivewave.platform.sdk.common.DataContext.getDataSeries() : com.motivewave.platform.sdk.common.DataSeries [121] [nargs: 1]
    12  invokeinterface com.motivewave.platform.sdk.common.DataSeries.size() : int [192] [nargs: 1]
    17  iconst_1
    18  isub
    19  aload_1 [arg0]
    20  invokevirtual com.motivewave.platform.sdk.study.Study.calculate(int, com.motivewave.platform.sdk.common.DataContext) : void [203]
    23  return
      Line numbers:
        [pc: 0, line: 192]
        [pc: 5, line: 193]
        [pc: 23, line: 194]
  
  // Method descriptor #213 (Lcom/motivewave/platform/sdk/common/DataContext;)V
  // Stack: 2, Locals: 2
  public void onDataSeriesMoved(com.motivewave.platform.sdk.common.DataContext arg0);
    0  aload_0 [this]
    1  aload_1 [arg0]
    2  putfield com.motivewave.platform.sdk.study.Study.dataCtx : com.motivewave.platform.sdk.common.DataContext [92]
    5  return
      Line numbers:
        [pc: 0, line: 198]
  
  // Method descriptor #213 (Lcom/motivewave/platform/sdk/common/DataContext;)V
  // Stack: 2, Locals: 3
  public void onDataSeriesUpdated(com.motivewave.platform.sdk.common.DataContext arg0);
     0  aload_0 [this]
     1  iconst_1
     2  putfield com.motivewave.platform.sdk.study.Study.ignoreFigureUpdates : boolean [51]
     5  aload_0 [this]
     6  aload_1 [arg0]
     7  putfield com.motivewave.platform.sdk.study.Study.dataCtx : com.motivewave.platform.sdk.common.DataContext [92]
    10  aload_0 [this]
    11  aload_1 [arg0]
    12  invokevirtual com.motivewave.platform.sdk.study.Study.precalculate(com.motivewave.platform.sdk.common.DataContext) : void [214]
    15  aload_0 [this]
    16  aload_1 [arg0]
    17  invokevirtual com.motivewave.platform.sdk.study.Study.calculateValues(com.motivewave.platform.sdk.common.DataContext) : void [217]
    20  aload_0 [this]
    21  aload_1 [arg0]
    22  invokevirtual com.motivewave.platform.sdk.study.Study.postcalculate(com.motivewave.platform.sdk.common.DataContext) : void [220]
    25  aload_0 [this]
    26  iconst_0
    27  putfield com.motivewave.platform.sdk.study.Study.ignoreFigureUpdates : boolean [51]
    30  goto 41
    33  astore_2
    34  aload_0 [this]
    35  iconst_0
    36  putfield com.motivewave.platform.sdk.study.Study.ignoreFigureUpdates : boolean [51]
    39  aload_2
    40  athrow
    41  aload_0 [this]
    42  invokevirtual com.motivewave.platform.sdk.study.Study.notifyFiguresUpdated() : void [223]
    45  return
      Exception Table:
        [pc: 5, pc: 25] -> 33 when : any
      Line numbers:
        [pc: 0, line: 207]
        [pc: 5, line: 209]
        [pc: 25, line: 212]
        [pc: 30, line: 213]
        [pc: 33, line: 212]
        [pc: 39, line: 213]
        [pc: 41, line: 214]
        [pc: 45, line: 215]
      Stack map table: number of frames 2
        [pc: 33, same_locals_1_stack_item, stack: {java.lang.Throwable}]
        [pc: 41, same]
  
  // Method descriptor #213 (Lcom/motivewave/platform/sdk/common/DataContext;)V
  // Stack: 2, Locals: 3
  public void onNewDataSeries(com.motivewave.platform.sdk.common.DataContext arg0);
     0  aload_0 [this]
     1  iconst_1
     2  putfield com.motivewave.platform.sdk.study.Study.ignoreFigureUpdates : boolean [51]
     5  aload_0 [this]
     6  iconst_m1
     7  putfield com.motivewave.platform.sdk.study.Study.lastSize : int [96]
    10  aload_0 [this]
    11  aload_1 [arg0]
    12  putfield com.motivewave.platform.sdk.study.Study.dataCtx : com.motivewave.platform.sdk.common.DataContext [92]
    15  aload_0 [this]
    16  invokevirtual com.motivewave.platform.sdk.study.Study.clearFigures() : void [226]
    19  aload_0 [this]
    20  aload_1 [arg0]
    21  invokevirtual com.motivewave.platform.sdk.study.Study.precalculate(com.motivewave.platform.sdk.common.DataContext) : void [214]
    24  aload_0 [this]
    25  aload_1 [arg0]
    26  invokevirtual com.motivewave.platform.sdk.study.Study.calculateValues(com.motivewave.platform.sdk.common.DataContext) : void [217]
    29  aload_0 [this]
    30  aload_1 [arg0]
    31  invokevirtual com.motivewave.platform.sdk.study.Study.postcalculate(com.motivewave.platform.sdk.common.DataContext) : void [220]
    34  aload_0 [this]
    35  iconst_0
    36  putfield com.motivewave.platform.sdk.study.Study.ignoreFigureUpdates : boolean [51]
    39  goto 50
    42  astore_2
    43  aload_0 [this]
    44  iconst_0
    45  putfield com.motivewave.platform.sdk.study.Study.ignoreFigureUpdates : boolean [51]
    48  aload_2
    49  athrow
    50  aload_0 [this]
    51  invokevirtual com.motivewave.platform.sdk.study.Study.notifyFiguresUpdated() : void [223]
    54  return
      Exception Table:
        [pc: 5, pc: 34] -> 42 when : any
      Line numbers:
        [pc: 0, line: 221]
        [pc: 5, line: 223]
        [pc: 10, line: 224]
        [pc: 15, line: 225]
        [pc: 19, line: 226]
        [pc: 24, line: 227]
        [pc: 29, line: 228]
        [pc: 34, line: 231]
        [pc: 39, line: 232]
        [pc: 42, line: 231]
        [pc: 48, line: 232]
        [pc: 50, line: 233]
        [pc: 54, line: 234]
      Stack map table: number of frames 2
        [pc: 42, same_locals_1_stack_item, stack: {java.lang.Throwable}]
        [pc: 50, same]
  
  // Method descriptor #213 (Lcom/motivewave/platform/sdk/common/DataContext;)V
  // Stack: 0, Locals: 2
  public void onSettingsUpdated(com.motivewave.platform.sdk.common.DataContext arg0);
    0  return
      Line numbers:
        [pc: 0, line: 238]
  
  // Method descriptor #213 (Lcom/motivewave/platform/sdk/common/DataContext;)V
  // Stack: 2, Locals: 4
  public void recalculate(com.motivewave.platform.sdk.common.DataContext arg0);
     0  aload_0 [this]
     1  iconst_1
     2  putfield com.motivewave.platform.sdk.study.Study.ignoreFigureUpdates : boolean [51]
     5  aload_0 [this]
     6  aload_1 [arg0]
     7  putfield com.motivewave.platform.sdk.study.Study.dataCtx : com.motivewave.platform.sdk.common.DataContext [92]
    10  aload_0 [this]
    11  invokevirtual com.motivewave.platform.sdk.study.Study.clearFigures() : void [226]
    14  aload_0 [this]
    15  getfield com.motivewave.platform.sdk.study.Study.labelMap : java.util.Map [82]
    18  invokeinterface java.util.Map.clear() : void [229] [nargs: 1]
    23  aload_0 [this]
    24  invokevirtual com.motivewave.platform.sdk.study.Study.updateDefaultGuides() : void [234]
    27  aload_1 [arg0]
    28  invokeinterface com.motivewave.platform.sdk.common.DataContext.getDataSeries() : com.motivewave.platform.sdk.common.DataSeries [121] [nargs: 1]
    33  astore_2
    34  aload_2
    35  ifnull 62
    38  aload_2
    39  invokeinterface com.motivewave.platform.sdk.common.DataSeries.hasData() : boolean [178] [nargs: 1]
    44  ifeq 62
    47  aload_0 [this]
    48  aload_1 [arg0]
    49  invokevirtual com.motivewave.platform.sdk.study.Study.precalculate(com.motivewave.platform.sdk.common.DataContext) : void [214]
    52  aload_0 [this]
    53  aload_1 [arg0]
    54  invokevirtual com.motivewave.platform.sdk.study.Study.calculateValues(com.motivewave.platform.sdk.common.DataContext) : void [217]
    57  aload_0 [this]
    58  aload_1 [arg0]
    59  invokevirtual com.motivewave.platform.sdk.study.Study.postcalculate(com.motivewave.platform.sdk.common.DataContext) : void [220]
    62  aload_0 [this]
    63  iconst_0
    64  putfield com.motivewave.platform.sdk.study.Study.ignoreFigureUpdates : boolean [51]
    67  goto 78
    70  astore_3
    71  aload_0 [this]
    72  iconst_0
    73  putfield com.motivewave.platform.sdk.study.Study.ignoreFigureUpdates : boolean [51]
    76  aload_3
    77  athrow
    78  aload_0 [this]
    79  invokevirtual com.motivewave.platform.sdk.study.Study.notifyFiguresUpdated() : void [223]
    82  return
      Exception Table:
        [pc: 5, pc: 62] -> 70 when : any
      Line numbers:
        [pc: 0, line: 241]
        [pc: 5, line: 243]
        [pc: 10, line: 244]
        [pc: 14, line: 245]
        [pc: 23, line: 246]
        [pc: 27, line: 247]
        [pc: 34, line: 248]
        [pc: 47, line: 249]
        [pc: 52, line: 250]
        [pc: 57, line: 251]
        [pc: 62, line: 255]
        [pc: 67, line: 256]
        [pc: 70, line: 255]
        [pc: 76, line: 256]
        [pc: 78, line: 257]
        [pc: 82, line: 258]
      Stack map table: number of frames 3
        [pc: 62, same]
        [pc: 70, same_locals_1_stack_item, stack: {java.lang.Throwable}]
        [pc: 78, same]
  
  // Method descriptor #814 (Ljava/lang/String;Ljava/awt/Point;Lcom/motivewave/platform/sdk/common/DrawContext;)Lcom/motivewave/platform/sdk/common/menu/MenuDescriptor;
  // Stack: 1, Locals: 4
  public com.motivewave.platform.sdk.common.menu.MenuDescriptor onMenu(java.lang.String arg0, java.awt.Point arg1, com.motivewave.platform.sdk.common.DrawContext arg2);
    0  aconst_null
    1  areturn
      Line numbers:
        [pc: 0, line: 264]
  
  // Method descriptor #816 (Lcom/motivewave/platform/sdk/draw/ResizePoint;Lcom/motivewave/platform/sdk/common/DrawContext;)V
  // Stack: 0, Locals: 3
  public void onBeginResize(com.motivewave.platform.sdk.draw.ResizePoint arg0, com.motivewave.platform.sdk.common.DrawContext arg1);
    0  return
      Line numbers:
        [pc: 0, line: 269]
  
  // Method descriptor #816 (Lcom/motivewave/platform/sdk/draw/ResizePoint;Lcom/motivewave/platform/sdk/common/DrawContext;)V
  // Stack: 0, Locals: 3
  public void onResize(com.motivewave.platform.sdk.draw.ResizePoint arg0, com.motivewave.platform.sdk.common.DrawContext arg1);
    0  return
      Line numbers:
        [pc: 0, line: 273]
  
  // Method descriptor #816 (Lcom/motivewave/platform/sdk/draw/ResizePoint;Lcom/motivewave/platform/sdk/common/DrawContext;)V
  // Stack: 0, Locals: 3
  public void onEndResize(com.motivewave.platform.sdk.draw.ResizePoint arg0, com.motivewave.platform.sdk.common.DrawContext arg1);
    0  return
      Line numbers:
        [pc: 0, line: 278]
  
  // Method descriptor #136 ()Z
  // Stack: 1, Locals: 1
  public boolean supportsDrag();
    0  iconst_0
    1  ireturn
      Line numbers:
        [pc: 0, line: 284]
  
  // Method descriptor #821 (Ljava/awt/geom/Point2D;ILcom/motivewave/platform/sdk/common/DrawContext;)V
  // Stack: 0, Locals: 4
  public void onHover(java.awt.geom.Point2D arg0, int arg1, com.motivewave.platform.sdk.common.DrawContext arg2);
    0  return
      Line numbers:
        [pc: 0, line: 291]
  
  // Method descriptor #821 (Ljava/awt/geom/Point2D;ILcom/motivewave/platform/sdk/common/DrawContext;)V
  // Stack: 0, Locals: 4
  public void onHoverLost(java.awt.geom.Point2D arg0, int arg1, com.motivewave.platform.sdk.common.DrawContext arg2);
    0  return
      Line numbers:
        [pc: 0, line: 297]
  
  // Method descriptor #821 (Ljava/awt/geom/Point2D;ILcom/motivewave/platform/sdk/common/DrawContext;)V
  // Stack: 0, Locals: 4
  public void onBeginDrag(java.awt.geom.Point2D arg0, int arg1, com.motivewave.platform.sdk.common.DrawContext arg2);
    0  return
      Line numbers:
        [pc: 0, line: 304]
  
  // Method descriptor #821 (Ljava/awt/geom/Point2D;ILcom/motivewave/platform/sdk/common/DrawContext;)V
  // Stack: 0, Locals: 4
  public void onDrag(java.awt.geom.Point2D arg0, int arg1, com.motivewave.platform.sdk.common.DrawContext arg2);
    0  return
      Line numbers:
        [pc: 0, line: 310]
  
  // Method descriptor #821 (Ljava/awt/geom/Point2D;ILcom/motivewave/platform/sdk/common/DrawContext;)V
  // Stack: 0, Locals: 4
  public void onEndDrag(java.awt.geom.Point2D arg0, int arg1, com.motivewave.platform.sdk.common.DrawContext arg2);
    0  return
      Line numbers:
        [pc: 0, line: 316]
  
  // Method descriptor #827 (Ljava/awt/Point;I)Z
  // Stack: 1, Locals: 3
  public boolean onDoubleClick(java.awt.Point arg0, int arg1);
    0  iconst_1
    1  ireturn
      Line numbers:
        [pc: 0, line: 322]
  
  // Method descriptor #827 (Ljava/awt/Point;I)Z
  // Stack: 1, Locals: 3
  public boolean onClick(java.awt.Point arg0, int arg1);
    0  iconst_1
    1  ireturn
      Line numbers:
        [pc: 0, line: 328]
  
  // Method descriptor #830 (Ljava/awt/Point;II)Z
  // Stack: 1, Locals: 4
  public boolean onWheelMoved(java.awt.Point arg0, int arg1, int arg2);
    0  iconst_1
    1  ireturn
      Line numbers:
        [pc: 0, line: 335]
  
  // Method descriptor #6 ()V
  // Stack: 2, Locals: 1
  public void clearState();
     0  aload_0 [this]
     1  getfield com.motivewave.platform.sdk.study.Study.labelMap : java.util.Map [82]
     4  invokeinterface java.util.Map.clear() : void [229] [nargs: 1]
     9  aload_0 [this]
    10  invokevirtual com.motivewave.platform.sdk.study.Study.clearFigures() : void [226]
    13  aload_0 [this]
    14  iconst_m1
    15  putfield com.motivewave.platform.sdk.study.Study.lastSize : int [96]
    18  return
      Line numbers:
        [pc: 0, line: 341]
        [pc: 9, line: 342]
        [pc: 13, line: 343]
        [pc: 18, line: 344]
  
  // Method descriptor #25 ()Lcom/motivewave/platform/sdk/study/RuntimeDescriptor;
  // Stack: 2, Locals: 2
  public final com.motivewave.platform.sdk.study.RuntimeDescriptor createRD();
     0  new com.motivewave.platform.sdk.study.RuntimeDescriptor [237]
     3  dup
     4  invokespecial com.motivewave.platform.sdk.study.RuntimeDescriptor() [239]
     7  astore_1
     8  aload_0 [this]
     9  aload_1
    10  invokevirtual com.motivewave.platform.sdk.study.Study.setRuntimeDescriptor(com.motivewave.platform.sdk.study.RuntimeDescriptor) : void [240]
    13  aload_1
    14  areturn
      Line numbers:
        [pc: 0, line: 354]
        [pc: 8, line: 355]
        [pc: 13, line: 356]
  
  // Method descriptor #25 ()Lcom/motivewave/platform/sdk/study/RuntimeDescriptor;
  // Stack: 1, Locals: 1
  public final com.motivewave.platform.sdk.study.RuntimeDescriptor getRuntimeDescriptor();
    0  aload_0 [this]
    1  getfield com.motivewave.platform.sdk.study.Study.runtimeDescriptor : com.motivewave.platform.sdk.study.RuntimeDescriptor [26]
    4  areturn
      Line numbers:
        [pc: 0, line: 363]
  
  // Method descriptor #243 (Lcom/motivewave/platform/sdk/study/RuntimeDescriptor;)V
  // Stack: 4, Locals: 3
  public final void setRuntimeDescriptor(com.motivewave.platform.sdk.study.RuntimeDescriptor arg0);
     0  aload_1 [arg0]
     1  ifnonnull 7
     4  invokestatic com.motivewave.common.Util.printStackTrace() : void [244]
     7  aload_1 [arg0]
     8  aload_0 [this]
     9  getfield com.motivewave.platform.sdk.study.Study.runtimeDescriptor : com.motivewave.platform.sdk.study.RuntimeDescriptor [26]
    12  if_acmpne 16
    15  return
    16  aload_0 [this]
    17  getfield com.motivewave.platform.sdk.study.Study.runtimeDescriptor : com.motivewave.platform.sdk.study.RuntimeDescriptor [26]
    20  astore_2
    21  aload_0 [this]
    22  aload_1 [arg0]
    23  putfield com.motivewave.platform.sdk.study.Study.runtimeDescriptor : com.motivewave.platform.sdk.study.RuntimeDescriptor [26]
    26  aload_0 [this]
    27  ldc <String "runtimeDescriptor"> [249]
    29  aload_2
    30  aload_0 [this]
    31  getfield com.motivewave.platform.sdk.study.Study.runtimeDescriptor : com.motivewave.platform.sdk.study.RuntimeDescriptor [26]
    34  invokevirtual com.motivewave.platform.sdk.study.Study.firePropertyChange(java.lang.String, java.lang.Object, java.lang.Object) : void [250]
    37  return
      Line numbers:
        [pc: 0, line: 368]
        [pc: 4, line: 369]
        [pc: 7, line: 371]
        [pc: 16, line: 372]
        [pc: 21, line: 373]
        [pc: 26, line: 374]
        [pc: 37, line: 375]
      Stack map table: number of frames 2
        [pc: 7, same]
        [pc: 16, same]
  
  // Method descriptor #292 ()Lcom/motivewave/platform/sdk/common/desc/SettingsDescriptor;
  // Stack: 2, Locals: 2
  public final com.motivewave.platform.sdk.common.desc.SettingsDescriptor createSD();
     0  new com.motivewave.platform.sdk.common.desc.SettingsDescriptor [254]
     3  dup
     4  invokespecial com.motivewave.platform.sdk.common.desc.SettingsDescriptor() [256]
     7  astore_1
     8  aload_0 [this]
     9  aload_1
    10  invokevirtual com.motivewave.platform.sdk.study.Study.setSettingsDescriptor(com.motivewave.platform.sdk.common.desc.SettingsDescriptor) : void [257]
    13  aload_1
    14  areturn
      Line numbers:
        [pc: 0, line: 381]
        [pc: 8, line: 382]
        [pc: 13, line: 383]
  
  // Method descriptor #292 ()Lcom/motivewave/platform/sdk/common/desc/SettingsDescriptor;
  // Stack: 1, Locals: 1
  public final com.motivewave.platform.sdk.common.desc.SettingsDescriptor getSettingsDescriptor();
    0  aload_0 [this]
    1  getfield com.motivewave.platform.sdk.study.Study.settingsDescriptor : com.motivewave.platform.sdk.common.desc.SettingsDescriptor [261]
    4  areturn
      Line numbers:
        [pc: 0, line: 388]
  
  // Method descriptor #260 (Lcom/motivewave/platform/sdk/common/desc/SettingsDescriptor;)V
  // Stack: 4, Locals: 3
  public final void setSettingsDescriptor(com.motivewave.platform.sdk.common.desc.SettingsDescriptor arg0);
     0  aload_1 [arg0]
     1  aload_0 [this]
     2  getfield com.motivewave.platform.sdk.study.Study.settingsDescriptor : com.motivewave.platform.sdk.common.desc.SettingsDescriptor [261]
     5  if_acmpne 9
     8  return
     9  aload_0 [this]
    10  getfield com.motivewave.platform.sdk.study.Study.settingsDescriptor : com.motivewave.platform.sdk.common.desc.SettingsDescriptor [261]
    13  astore_2
    14  aload_0 [this]
    15  aload_1 [arg0]
    16  putfield com.motivewave.platform.sdk.study.Study.settingsDescriptor : com.motivewave.platform.sdk.common.desc.SettingsDescriptor [261]
    19  aload_0 [this]
    20  getfield com.motivewave.platform.sdk.study.Study.settings : com.motivewave.platform.sdk.common.Settings [265]
    23  ifnull 34
    26  aload_0 [this]
    27  getfield com.motivewave.platform.sdk.study.Study.settings : com.motivewave.platform.sdk.common.Settings [265]
    30  aload_1 [arg0]
    31  invokevirtual com.motivewave.platform.sdk.common.Settings.setDescriptor(com.motivewave.platform.sdk.common.desc.SettingsDescriptor) : void [269]
    34  aload_0 [this]
    35  ldc_w <String "settingsDescriptor"> [272]
    38  aload_2
    39  aload_0 [this]
    40  getfield com.motivewave.platform.sdk.study.Study.settingsDescriptor : com.motivewave.platform.sdk.common.desc.SettingsDescriptor [261]
    43  invokevirtual com.motivewave.platform.sdk.study.Study.firePropertyChange(java.lang.String, java.lang.Object, java.lang.Object) : void [250]
    46  return
      Line numbers:
        [pc: 0, line: 392]
        [pc: 9, line: 393]
        [pc: 14, line: 394]
        [pc: 19, line: 395]
        [pc: 34, line: 396]
        [pc: 46, line: 397]
      Stack map table: number of frames 2
        [pc: 9, same]
        [pc: 34, append: {com.motivewave.platform.sdk.common.desc.SettingsDescriptor}]
  
  // Method descriptor #183 ()Lcom/motivewave/platform/sdk/common/Settings;
  // Stack: 4, Locals: 1
  public final com.motivewave.platform.sdk.common.Settings getSettings();
     0  aload_0 [this]
     1  getfield com.motivewave.platform.sdk.study.Study.settings : com.motivewave.platform.sdk.common.Settings [265]
     4  ifnonnull 22
     7  aload_0 [this]
     8  new com.motivewave.platform.sdk.common.Settings [185]
    11  dup
    12  aload_0 [this]
    13  getfield com.motivewave.platform.sdk.study.Study.settingsDescriptor : com.motivewave.platform.sdk.common.desc.SettingsDescriptor [261]
    16  invokespecial com.motivewave.platform.sdk.common.Settings(com.motivewave.platform.sdk.common.desc.SettingsDescriptor) [273]
    19  putfield com.motivewave.platform.sdk.study.Study.settings : com.motivewave.platform.sdk.common.Settings [265]
    22  aload_0 [this]
    23  getfield com.motivewave.platform.sdk.study.Study.settings : com.motivewave.platform.sdk.common.Settings [265]
    26  areturn
      Line numbers:
        [pc: 0, line: 402]
        [pc: 7, line: 403]
        [pc: 22, line: 405]
      Stack map table: number of frames 1
        [pc: 22, same]
  
  // Method descriptor #834 (Lcom/motivewave/platform/sdk/common/Settings;)V
  // Stack: 4, Locals: 5
  public final void setSettings(com.motivewave.platform.sdk.common.Settings arg0);
      0  aload_0 [this]
      1  getfield com.motivewave.platform.sdk.study.Study.settings : com.motivewave.platform.sdk.common.Settings [265]
      4  astore_2
      5  aload_0 [this]
      6  aload_1 [arg0]
      7  putfield com.motivewave.platform.sdk.study.Study.settings : com.motivewave.platform.sdk.common.Settings [265]
     10  aload_0 [this]
     11  getfield com.motivewave.platform.sdk.study.Study.labelMap : java.util.Map [82]
     14  invokeinterface java.util.Map.clear() : void [229] [nargs: 1]
     19  aload_1 [arg0]
     20  ifnull 93
     23  aload_1 [arg0]
     24  aload_0 [this]
     25  getfield com.motivewave.platform.sdk.study.Study.settingsDescriptor : com.motivewave.platform.sdk.common.desc.SettingsDescriptor [261]
     28  invokevirtual com.motivewave.platform.sdk.common.Settings.setDescriptor(com.motivewave.platform.sdk.common.desc.SettingsDescriptor) : void [269]
     31  aload_0 [this]
     32  invokevirtual com.motivewave.platform.sdk.study.Study.updateDefaultGuides() : void [234]
     35  aload_0 [this]
     36  getfield com.motivewave.platform.sdk.study.Study.settingsDescriptor : com.motivewave.platform.sdk.common.desc.SettingsDescriptor [261]
     39  invokevirtual com.motivewave.platform.sdk.common.desc.SettingsDescriptor.getDependencies() : java.util.List [275]
     42  invokeinterface java.util.List.iterator() : java.util.Iterator [147] [nargs: 1]
     47  astore_3
     48  aload_3
     49  invokeinterface java.util.Iterator.hasNext() : boolean [153] [nargs: 1]
     54  ifeq 93
     57  aload_3
     58  invokeinterface java.util.Iterator.next() : java.lang.Object [158] [nargs: 1]
     63  checkcast com.motivewave.platform.sdk.common.desc.InputDependency [278]
     66  astore 4
     68  aload 4
     70  aload_0 [this]
     71  getfield com.motivewave.platform.sdk.study.Study.settingsDescriptor : com.motivewave.platform.sdk.common.desc.SettingsDescriptor [261]
     74  invokevirtual com.motivewave.platform.sdk.common.desc.InputDependency.setSettingsDescriptor(com.motivewave.platform.sdk.common.desc.SettingsDescriptor) : void [280]
     77  aload 4
     79  aload_1 [arg0]
     80  new java.util.HashMap [7]
     83  dup
     84  invokespecial java.util.HashMap() [9]
     87  invokevirtual com.motivewave.platform.sdk.common.desc.InputDependency.onSourceUpdated(com.motivewave.platform.sdk.common.SettingsBase, java.util.Map) : void [281]
     90  goto 48
     93  aload_0 [this]
     94  ldc_w <String "settings"> [285]
     97  aload_2
     98  aload_0 [this]
     99  getfield com.motivewave.platform.sdk.study.Study.settings : com.motivewave.platform.sdk.common.Settings [265]
    102  invokevirtual com.motivewave.platform.sdk.study.Study.firePropertyChange(java.lang.String, java.lang.Object, java.lang.Object) : void [250]
    105  return
      Line numbers:
        [pc: 0, line: 412]
        [pc: 5, line: 413]
        [pc: 10, line: 414]
        [pc: 19, line: 415]
        [pc: 23, line: 416]
        [pc: 31, line: 417]
        [pc: 35, line: 419]
        [pc: 68, line: 420]
        [pc: 77, line: 421]
        [pc: 90, line: 422]
        [pc: 93, line: 424]
        [pc: 105, line: 425]
      Stack map table: number of frames 2
        [pc: 48, append: {com.motivewave.platform.sdk.common.Settings, java.util.Iterator}]
        [pc: 93, chop 1 local(s)]
  
  // Method descriptor #140 ()Ljava/util/List;
  // Signature: ()Ljava/util/List<Lcom/motivewave/platform/sdk/common/BarSize;>;
  // Stack: 2, Locals: 8
  public java.util.List getBarSizes();
      0  new java.util.ArrayList [286]
      3  dup
      4  invokespecial java.util.ArrayList() [288]
      7  astore_1
      8  aload_0 [this]
      9  invokevirtual com.motivewave.platform.sdk.study.Study.getSettings() : com.motivewave.platform.sdk.common.Settings [180]
     12  astore_2
     13  aload_2
     14  ifnonnull 19
     17  aload_1
     18  areturn
     19  aload_0 [this]
     20  invokevirtual com.motivewave.platform.sdk.study.Study.getSettingsDescriptor() : com.motivewave.platform.sdk.common.desc.SettingsDescriptor [289]
     23  astore_3
     24  aload_2
     25  invokevirtual com.motivewave.platform.sdk.common.Settings.getBarSizes() : java.util.Set [293]
     28  invokeinterface java.util.Set.iterator() : java.util.Iterator [296] [nargs: 1]
     33  astore 4
     35  aload 4
     37  invokeinterface java.util.Iterator.hasNext() : boolean [153] [nargs: 1]
     42  ifeq 112
     45  aload 4
     47  invokeinterface java.util.Iterator.next() : java.lang.Object [158] [nargs: 1]
     52  checkcast java.lang.String [299]
     55  astore 5
     57  aload_2
     58  aload 5
     60  invokevirtual com.motivewave.platform.sdk.common.Settings.getBarSize(java.lang.String) : com.motivewave.platform.sdk.common.BarSize [301]
     63  astore 6
     65  aload_3
     66  aload 5
     68  invokevirtual com.motivewave.platform.sdk.common.desc.SettingsDescriptor.getSetting(java.lang.String) : com.motivewave.platform.sdk.common.desc.SettingDescriptor [305]
     71  astore 7
     73  aload 7
     75  ifnull 89
     78  aload 7
     80  invokevirtual com.motivewave.platform.sdk.common.desc.SettingDescriptor.isEnabled() : boolean [309]
     83  ifne 89
     86  goto 35
     89  aload_1
     90  aload 6
     92  invokeinterface java.util.List.contains(java.lang.Object) : boolean [314] [nargs: 2]
     97  ifne 109
    100  aload_1
    101  aload 6
    103  invokeinterface java.util.List.add(java.lang.Object) : boolean [317] [nargs: 2]
    108  pop
    109  goto 35
    112  aload_1
    113  areturn
      Line numbers:
        [pc: 0, line: 432]
        [pc: 8, line: 433]
        [pc: 13, line: 434]
        [pc: 19, line: 435]
        [pc: 24, line: 436]
        [pc: 57, line: 437]
        [pc: 65, line: 438]
        [pc: 73, line: 439]
        [pc: 89, line: 440]
        [pc: 109, line: 441]
        [pc: 112, line: 442]
      Stack map table: number of frames 5
        [pc: 19, append: {java.util.List, com.motivewave.platform.sdk.common.Settings}]
        [pc: 35, append: {com.motivewave.platform.sdk.common.desc.SettingsDescriptor, java.util.Iterator}]
        [pc: 89, append: {java.lang.String, com.motivewave.platform.sdk.common.BarSize, com.motivewave.platform.sdk.common.desc.SettingDescriptor}]
        [pc: 109, chop 3 local(s)]
        [pc: 112, chop 1 local(s)]
  
  // Method descriptor #140 ()Ljava/util/List;
  // Signature: ()Ljava/util/List<Lcom/motivewave/platform/sdk/common/Instrument;>;
  // Stack: 2, Locals: 8
  public java.util.List getInstruments();
      0  aload_0 [this]
      1  invokevirtual com.motivewave.platform.sdk.study.Study.getSettings() : com.motivewave.platform.sdk.common.Settings [180]
      4  astore_1
      5  new java.util.ArrayList [286]
      8  dup
      9  invokespecial java.util.ArrayList() [288]
     12  astore_2
     13  aload_1
     14  ifnonnull 19
     17  aload_2
     18  areturn
     19  aload_0 [this]
     20  invokevirtual com.motivewave.platform.sdk.study.Study.getSettingsDescriptor() : com.motivewave.platform.sdk.common.desc.SettingsDescriptor [289]
     23  astore_3
     24  aload_1
     25  invokevirtual com.motivewave.platform.sdk.common.Settings.getInstruments() : java.util.Set [320]
     28  invokeinterface java.util.Set.iterator() : java.util.Iterator [296] [nargs: 1]
     33  astore 4
     35  aload 4
     37  invokeinterface java.util.Iterator.hasNext() : boolean [153] [nargs: 1]
     42  ifeq 109
     45  aload 4
     47  invokeinterface java.util.Iterator.next() : java.lang.Object [158] [nargs: 1]
     52  checkcast java.lang.String [299]
     55  astore 5
     57  aload_1
     58  aload 5
     60  invokevirtual com.motivewave.platform.sdk.common.Settings.getInstrument(java.lang.String) : com.motivewave.platform.sdk.common.Instrument [322]
     63  astore 6
     65  aload 6
     67  ifnonnull 73
     70  goto 35
     73  aload_3
     74  aload 5
     76  invokevirtual com.motivewave.platform.sdk.common.desc.SettingsDescriptor.getSetting(java.lang.String) : com.motivewave.platform.sdk.common.desc.SettingDescriptor [305]
     79  astore 7
     81  aload 7
     83  ifnull 97
     86  aload 7
     88  invokevirtual com.motivewave.platform.sdk.common.desc.SettingDescriptor.isEnabled() : boolean [309]
     91  ifne 97
     94  goto 35
     97  aload_2
     98  aload 6
    100  invokeinterface java.util.List.add(java.lang.Object) : boolean [317] [nargs: 2]
    105  pop
    106  goto 35
    109  aload_2
    110  areturn
      Line numbers:
        [pc: 0, line: 450]
        [pc: 5, line: 451]
        [pc: 13, line: 452]
        [pc: 19, line: 454]
        [pc: 24, line: 455]
        [pc: 57, line: 456]
        [pc: 65, line: 457]
        [pc: 73, line: 458]
        [pc: 81, line: 459]
        [pc: 97, line: 460]
        [pc: 106, line: 461]
        [pc: 109, line: 463]
      Stack map table: number of frames 5
        [pc: 19, append: {com.motivewave.platform.sdk.common.Settings, java.util.List}]
        [pc: 35, append: {com.motivewave.platform.sdk.common.desc.SettingsDescriptor, java.util.Iterator}]
        [pc: 73, append: {java.lang.String, com.motivewave.platform.sdk.common.Instrument}]
        [pc: 97, append: {com.motivewave.platform.sdk.common.desc.SettingDescriptor}]
        [pc: 109, full, stack: {}, locals: {com.motivewave.platform.sdk.study.Study, com.motivewave.platform.sdk.common.Settings, java.util.List, com.motivewave.platform.sdk.common.desc.SettingsDescriptor}]
  
  // Method descriptor #6 ()V
  // Stack: 2, Locals: 8
  private void updateDefaultGuides();
      0  aload_0 [this]
      1  getfield com.motivewave.platform.sdk.study.Study.runtimeDescriptor : com.motivewave.platform.sdk.study.RuntimeDescriptor [26]
      4  invokevirtual com.motivewave.platform.sdk.study.RuntimeDescriptor.getDefaultPlot() : com.motivewave.platform.sdk.study.Plot [326]
      7  astore_1
      8  aload_0 [this]
      9  getfield com.motivewave.platform.sdk.study.Study.settings : com.motivewave.platform.sdk.common.Settings [265]
     12  invokevirtual com.motivewave.platform.sdk.common.Settings.getGuides() : java.util.Set [330]
     15  invokeinterface java.util.Set.iterator() : java.util.Iterator [296] [nargs: 1]
     20  astore_2
     21  aload_2
     22  invokeinterface java.util.Iterator.hasNext() : boolean [153] [nargs: 1]
     27  ifeq 135
     30  aload_2
     31  invokeinterface java.util.Iterator.next() : java.lang.Object [158] [nargs: 1]
     36  checkcast java.lang.String [299]
     39  astore_3
     40  iconst_0
     41  istore 4
     43  aload_0 [this]
     44  getfield com.motivewave.platform.sdk.study.Study.runtimeDescriptor : com.motivewave.platform.sdk.study.RuntimeDescriptor [26]
     47  invokevirtual com.motivewave.platform.sdk.study.RuntimeDescriptor.getPlotKeys() : java.util.Set [333]
     50  invokeinterface java.util.Set.iterator() : java.util.Iterator [296] [nargs: 1]
     55  astore 5
     57  aload 5
     59  invokeinterface java.util.Iterator.hasNext() : boolean [153] [nargs: 1]
     64  ifeq 122
     67  aload 5
     69  invokeinterface java.util.Iterator.next() : java.lang.Object [158] [nargs: 1]
     74  checkcast java.lang.String [299]
     77  astore 6
     79  aload_0 [this]
     80  getfield com.motivewave.platform.sdk.study.Study.runtimeDescriptor : com.motivewave.platform.sdk.study.RuntimeDescriptor [26]
     83  aload 6
     85  invokevirtual com.motivewave.platform.sdk.study.RuntimeDescriptor.getPlot(java.lang.String) : com.motivewave.platform.sdk.study.Plot [336]
     88  astore 7
     90  aload 7
     92  aload_1
     93  if_acmpne 99
     96  goto 57
     99  aload 7
    101  invokevirtual com.motivewave.platform.sdk.study.Plot.getGuides() : java.util.Set [340]
    104  aload_3
    105  invokeinterface java.util.Set.contains(java.lang.Object) : boolean [343] [nargs: 2]
    110  ifeq 119
    113  iconst_1
    114  istore 4
    116  goto 122
    119  goto 57
    122  iload 4
    124  ifne 132
    127  aload_1
    128  aload_3
    129  invokevirtual com.motivewave.platform.sdk.study.Plot.declareGuide(java.lang.String) : void [344]
    132  goto 21
    135  return
      Line numbers:
        [pc: 0, line: 468]
        [pc: 8, line: 469]
        [pc: 40, line: 471]
        [pc: 43, line: 472]
        [pc: 79, line: 473]
        [pc: 90, line: 474]
        [pc: 99, line: 475]
        [pc: 113, line: 476]
        [pc: 116, line: 477]
        [pc: 119, line: 479]
        [pc: 122, line: 481]
        [pc: 132, line: 482]
        [pc: 135, line: 483]
      Stack map table: number of frames 7
        [pc: 21, append: {com.motivewave.platform.sdk.study.Plot, java.util.Iterator}]
        [pc: 57, append: {java.lang.String, int, java.util.Iterator}]
        [pc: 99, append: {java.lang.String, com.motivewave.platform.sdk.study.Plot}]
        [pc: 119, chop 2 local(s)]
        [pc: 122, chop 1 local(s)]
        [pc: 132, chop 2 local(s)]
        [pc: 135, chop 1 local(s)]
  
  // Method descriptor #359 (DDLcom/motivewave/platform/sdk/common/DrawContext;)Ljava/lang/String;
  // Stack: 6, Locals: 9
  public java.lang.String getPopupMessage(double arg0, double arg1, com.motivewave.platform.sdk.common.DrawContext arg2);
     0  aload_0 [this]
     1  invokevirtual com.motivewave.platform.sdk.study.Study.getFigures() : java.util.List [348]
     4  invokeinterface java.util.List.iterator() : java.util.Iterator [147] [nargs: 1]
     9  astore 6
    11  aload 6
    13  invokeinterface java.util.Iterator.hasNext() : boolean [153] [nargs: 1]
    18  ifeq 78
    21  aload 6
    23  invokeinterface java.util.Iterator.next() : java.lang.Object [158] [nargs: 1]
    28  checkcast com.motivewave.platform.sdk.draw.Figure [351]
    31  astore 7
    33  aload 7
    35  ifnull 11
    38  aload 7
    40  dload_1 [arg0]
    41  dload_3 [arg1]
    42  aload 5 [arg2]
    44  invokevirtual com.motivewave.platform.sdk.draw.Figure.contains(double, double, com.motivewave.platform.sdk.common.DrawContext) : boolean [353]
    47  ifne 53
    50  goto 11
    53  aload 7
    55  dload_1 [arg0]
    56  dload_3 [arg1]
    57  aload 5 [arg2]
    59  invokevirtual com.motivewave.platform.sdk.draw.Figure.getPopupMessage(double, double, com.motivewave.platform.sdk.common.DrawContext) : java.lang.String [356]
    62  astore 8
    64  aload 8
    66  invokestatic com.motivewave.platform.sdk.common.Util.isEmpty(java.lang.Object) : boolean [141]
    69  ifne 75
    72  aload 8
    74  areturn
    75  goto 11
    78  ldc_w <String ""> [360]
    81  areturn
      Line numbers:
        [pc: 0, line: 493]
        [pc: 33, line: 494]
        [pc: 53, line: 495]
        [pc: 64, line: 496]
        [pc: 75, line: 497]
        [pc: 78, line: 498]
      Stack map table: number of frames 4
        [pc: 11, append: {java.util.Iterator}]
        [pc: 53, append: {com.motivewave.platform.sdk.draw.Figure}]
        [pc: 75, chop 1 local(s)]
        [pc: 78, chop 1 local(s)]
  
  // Method descriptor #773 ()Lcom/motivewave/platform/sdk/study/StudyHeader;
  // Stack: 2, Locals: 1
  public final com.motivewave.platform.sdk.study.StudyHeader getHeader();
     0  aload_0 [this]
     1  invokevirtual java.lang.Object.getClass() : java.lang.Class [362]
     4  ldc_w <Class com.motivewave.platform.sdk.study.StudyHeader> [366]
     7  invokevirtual java.lang.Class.getAnnotation(java.lang.Class) : java.lang.annotation.Annotation [368]
    10  checkcast com.motivewave.platform.sdk.study.StudyHeader [366]
    13  areturn
      Line numbers:
        [pc: 0, line: 503]
  
  // Method descriptor #396 ()Ljava/lang/String;
  // Stack: 2, Locals: 1
  public java.lang.String getLabel();
    0  aload_0 [this]
    1  ldc_w <String "__DEFAULT__"> [374]
    4  invokevirtual com.motivewave.platform.sdk.study.Study.getLabel(java.lang.String) : java.lang.String [376]
    7  areturn
      Line numbers:
        [pc: 0, line: 507]
  
  // Method descriptor #379 (Ljava/lang/String;)Ljava/lang/String;
  // Stack: 3, Locals: 18
  public java.lang.String getLabel(java.lang.String arg0);
      0  aload_0 [this]
      1  getfield com.motivewave.platform.sdk.study.Study.labelMap : java.util.Map [82]
      4  aload_1 [arg0]
      5  invokeinterface java.util.Map.get(java.lang.Object) : java.lang.Object [380] [nargs: 2]
     10  checkcast java.lang.String [299]
     13  astore_2
     14  aload_2
     15  ifnull 20
     18  aload_2
     19  areturn
     20  aload_0 [this]
     21  invokevirtual com.motivewave.platform.sdk.study.Study.getRuntimeDescriptor() : com.motivewave.platform.sdk.study.RuntimeDescriptor [384]
     24  astore_3
     25  aload_0 [this]
     26  invokestatic com.motivewave.platform.ui.draw.figure.study.StudyFactory.getStudyInfo(com.motivewave.platform.sdk.study.Study) : com.motivewave.platform.databean.StudyInfo [387]
     29  astore 4
     31  aload 4
     33  ifnonnull 40
     36  ldc_w <String ""> [360]
     39  areturn
     40  aload 4
     42  invokevirtual com.motivewave.platform.databean.StudyInfo.getGraphLabel() : java.lang.String [393]
     45  astore 5
     47  aload_3
     48  ifnonnull 54
     51  aload 5
     53  areturn
     54  aload_3
     55  aload_1 [arg0]
     56  invokevirtual com.motivewave.platform.sdk.study.RuntimeDescriptor.getPlot(java.lang.String) : com.motivewave.platform.sdk.study.Plot [336]
     59  astore 6
     61  aload 6
     63  ifnonnull 69
     66  aload 5
     68  areturn
     69  aload 6
     71  invokevirtual com.motivewave.platform.sdk.study.Plot.getLabelSettings() : java.util.List [397]
     74  astore 7
     76  aload 6
     78  invokevirtual com.motivewave.platform.sdk.study.Plot.getLabelPrefix() : java.lang.String [400]
     81  ifnull 91
     84  aload 6
     86  invokevirtual com.motivewave.platform.sdk.study.Plot.getLabelPrefix() : java.lang.String [400]
     89  astore 5
     91  aload 7
     93  invokestatic com.motivewave.platform.sdk.common.Util.isEmpty(java.lang.Object) : boolean [141]
     96  ifeq 102
     99  aload 5
    101  areturn
    102  aload_0 [this]
    103  invokevirtual com.motivewave.platform.sdk.study.Study.getSettingsDescriptor() : com.motivewave.platform.sdk.common.desc.SettingsDescriptor [289]
    106  astore 8
    108  aload_0 [this]
    109  invokevirtual com.motivewave.platform.sdk.study.Study.getSettings() : com.motivewave.platform.sdk.common.Settings [180]
    112  astore 9
    114  aload 9
    116  ifnull 395
    119  ldc_w <String "("> [403]
    122  astore 10
    124  iconst_1
    125  istore 11
    127  aload 7
    129  invokeinterface java.util.List.iterator() : java.util.Iterator [147] [nargs: 1]
    134  astore 12
    136  aload 12
    138  invokeinterface java.util.Iterator.hasNext() : boolean [153] [nargs: 1]
    143  ifeq 364
    146  aload 12
    148  invokeinterface java.util.Iterator.next() : java.lang.Object [158] [nargs: 1]
    153  checkcast java.lang.String [299]
    156  astore 13
    158  aconst_null
    159  astore 14
    161  aload 8
    163  ifnull 175
    166  aload 8
    168  aload 13
    170  invokevirtual com.motivewave.platform.sdk.common.desc.SettingsDescriptor.getSetting(java.lang.String) : com.motivewave.platform.sdk.common.desc.SettingDescriptor [305]
    173  astore 14
    175  aload 14
    177  ifnull 191
    180  aload 14
    182  invokevirtual com.motivewave.platform.sdk.common.desc.SettingDescriptor.isEnabled() : boolean [309]
    185  ifne 191
    188  goto 136
    191  aload 9
    193  aload 13
    195  invokevirtual com.motivewave.platform.sdk.common.Settings.getSetting(java.lang.String) : java.lang.Object [405]
    198  astore 15
    200  aload 15
    202  ifnonnull 253
    205  aload 14
    207  ifnull 253
    210  aload 14
    212  invokevirtual com.motivewave.platform.sdk.common.desc.SettingDescriptor.getDefaultValue() : java.lang.Object [408]
    215  astore 15
    217  aload 15
    219  ifnonnull 253
    222  aload_0 [this]
    223  getfield com.motivewave.platform.sdk.study.Study.dataCtx : com.motivewave.platform.sdk.common.DataContext [92]
    226  ifnull 253
    229  aload 14
    231  instanceof com.motivewave.platform.sdk.common.desc.InstrumentDescriptor [411]
    234  ifeq 253
    237  aload_0 [this]
    238  getfield com.motivewave.platform.sdk.study.Study.dataCtx : com.motivewave.platform.sdk.common.DataContext [92]
    241  invokeinterface com.motivewave.platform.sdk.common.DataContext.getInstrument() : com.motivewave.platform.sdk.common.Instrument [413] [nargs: 1]
    246  invokeinterface com.motivewave.platform.sdk.common.Instrument.getSymbol() : java.lang.String [416] [nargs: 1]
    251  astore 15
    253  aload 15
    255  aload 14
    257  invokestatic com.motivewave.platform.common.MWUtil.isIgnoreParam(java.lang.Object, com.motivewave.platform.sdk.common.desc.SettingDescriptor) : boolean [419]
    260  ifeq 266
    263  goto 136
    266  aload 14
    268  ifnull 310
    271  aload 14
    273  instanceof com.motivewave.platform.sdk.common.desc.DiscreteDescriptor [425]
    276  ifeq 310
    279  aload 14
    281  checkcast com.motivewave.platform.sdk.common.desc.DiscreteDescriptor [425]
    284  astore 16
    286  aload 16
    288  aload 15
    290  invokestatic com.motivewave.common.Util.toString(java.lang.Object) : java.lang.String [427]
    293  invokevirtual com.motivewave.platform.sdk.common.desc.DiscreteDescriptor.findNVP(java.lang.String) : com.motivewave.platform.sdk.common.NVP [431]
    296  astore 17
    298  aload 17
    300  ifnull 310
    303  aload 17
    305  invokevirtual com.motivewave.platform.sdk.common.NVP.getName() : java.lang.String [435]
    308  astore 15
    310  aload 15
    312  aload 14
    314  invokestatic com.motivewave.platform.common.MWUtil.toStr(java.lang.Object, com.motivewave.platform.sdk.common.desc.SettingDescriptor) : java.lang.String [440]
    317  astore 16
    319  aload 16
    321  invokestatic com.motivewave.platform.sdk.common.Util.isEmpty(java.lang.Object) : boolean [141]
    324  ifeq 330
    327  goto 136
    330  iload 11
    332  ifeq 341
    335  iconst_0
    336  istore 11
    338  goto 350
    341  aload 10
    343  invokedynamic 0 makeConcatWithConstants(java.lang.String) : java.lang.String [444]
    348  astore 10
    350  aload 10
    352  aload 16
    354  invokedynamic 1 makeConcatWithConstants(java.lang.String, java.lang.String) : java.lang.String [447]
    359  astore 10
    361  goto 136
    364  aload 10
    366  invokedynamic 2 makeConcatWithConstants(java.lang.String) : java.lang.String [450]
    371  astore 10
    373  aload 10
    375  ldc_w <String "()"> [451]
    378  invokestatic com.motivewave.platform.sdk.common.Util.compare(java.lang.Object, java.lang.Object) : boolean [453]
    381  ifne 395
    384  aload 5
    386  aload 10
    388  invokedynamic 1 makeConcatWithConstants(java.lang.String, java.lang.String) : java.lang.String [447]
    393  astore 5
    395  aload_0 [this]
    396  getfield com.motivewave.platform.sdk.study.Study.labelMap : java.util.Map [82]
    399  aload_1 [arg0]
    400  aload 5
    402  invokeinterface java.util.Map.put(java.lang.Object, java.lang.Object) : java.lang.Object [457] [nargs: 3]
    407  pop
    408  aload 5
    410  areturn
      Line numbers:
        [pc: 0, line: 513]
        [pc: 14, line: 514]
        [pc: 20, line: 515]
        [pc: 25, line: 516]
        [pc: 31, line: 517]
        [pc: 40, line: 518]
        [pc: 47, line: 519]
        [pc: 54, line: 521]
        [pc: 61, line: 522]
        [pc: 69, line: 524]
        [pc: 76, line: 525]
        [pc: 91, line: 527]
        [pc: 102, line: 529]
        [pc: 108, line: 531]
        [pc: 114, line: 532]
        [pc: 119, line: 533]
        [pc: 124, line: 534]
        [pc: 127, line: 535]
        [pc: 158, line: 536]
        [pc: 161, line: 537]
        [pc: 175, line: 538]
        [pc: 191, line: 540]
        [pc: 200, line: 541]
        [pc: 210, line: 542]
        [pc: 217, line: 544]
        [pc: 253, line: 547]
        [pc: 266, line: 550]
        [pc: 279, line: 551]
        [pc: 286, line: 552]
        [pc: 298, line: 553]
        [pc: 310, line: 556]
        [pc: 319, line: 557]
        [pc: 330, line: 559]
        [pc: 341, line: 560]
        [pc: 350, line: 561]
        [pc: 361, line: 562]
        [pc: 364, line: 563]
        [pc: 373, line: 564]
        [pc: 395, line: 567]
        [pc: 408, line: 568]
      Stack map table: number of frames 17
        [pc: 20, append: {java.lang.String}]
        [pc: 40, append: {com.motivewave.platform.sdk.study.RuntimeDescriptor, com.motivewave.platform.databean.StudyInfo}]
        [pc: 54, append: {java.lang.String}]
        [pc: 69, append: {com.motivewave.platform.sdk.study.Plot}]
        [pc: 91, append: {java.util.List}]
        [pc: 102, same]
        [pc: 136, full, stack: {}, locals: {com.motivewave.platform.sdk.study.Study, java.lang.String, java.lang.String, com.motivewave.platform.sdk.study.RuntimeDescriptor, com.motivewave.platform.databean.StudyInfo, java.lang.String, com.motivewave.platform.sdk.study.Plot, java.util.List, com.motivewave.platform.sdk.common.desc.SettingsDescriptor, com.motivewave.platform.sdk.common.Settings, java.lang.String, int, java.util.Iterator}]
        [pc: 175, append: {java.lang.String, com.motivewave.platform.sdk.common.desc.SettingDescriptor}]
        [pc: 191, same]
        [pc: 253, append: {java.lang.Object}]
        [pc: 266, same]
        [pc: 310, same]
        [pc: 330, append: {java.lang.String}]
        [pc: 341, same]
        [pc: 350, same]
        [pc: 364, full, stack: {}, locals: {com.motivewave.platform.sdk.study.Study, java.lang.String, java.lang.String, com.motivewave.platform.sdk.study.RuntimeDescriptor, com.motivewave.platform.databean.StudyInfo, java.lang.String, com.motivewave.platform.sdk.study.Plot, java.util.List, com.motivewave.platform.sdk.common.desc.SettingsDescriptor, com.motivewave.platform.sdk.common.Settings, java.lang.String, int}]
        [pc: 395, chop 2 local(s)]
  
  // Method descriptor #6 ()V
  // Stack: 2, Locals: 2
  protected final void clearFigures();
     0  aload_0 [this]
     1  getfield com.motivewave.platform.sdk.study.Study.figureMap : java.util.Map [16]
     4  invokeinterface java.util.Map.isEmpty() : boolean [461] [nargs: 1]
     9  istore_1
    10  aload_0 [this]
    11  getfield com.motivewave.platform.sdk.study.Study.figureMap : java.util.Map [16]
    14  invokeinterface java.util.Map.clear() : void [229] [nargs: 1]
    19  iload_1
    20  ifne 28
    23  aload_0 [this]
    24  iconst_1
    25  putfield com.motivewave.platform.sdk.study.Study.figureUpdatePending : boolean [44]
    28  aload_0 [this]
    29  invokevirtual com.motivewave.platform.sdk.study.Study.notifyFiguresUpdated() : void [223]
    32  return
      Line numbers:
        [pc: 0, line: 577]
        [pc: 10, line: 578]
        [pc: 19, line: 579]
        [pc: 28, line: 580]
        [pc: 32, line: 581]
      Stack map table: number of frames 1
        [pc: 28, append: {int}]
  
  // Method descriptor #347 (Ljava/lang/String;)V
  // Stack: 2, Locals: 4
  protected final void clearFigures(java.lang.String arg0);
     0  aload_0 [this]
     1  getfield com.motivewave.platform.sdk.study.Study.figureMap : java.util.Map [16]
     4  aload_1 [arg0]
     5  invokeinterface java.util.Map.get(java.lang.Object) : java.lang.Object [380] [nargs: 2]
    10  checkcast java.util.List [148]
    13  astore_2
    14  aload_2
    15  ifnonnull 19
    18  return
    19  aload_2
    20  invokeinterface java.util.List.isEmpty() : boolean [463] [nargs: 1]
    25  istore_3
    26  aload_2
    27  invokeinterface java.util.List.clear() : void [464] [nargs: 1]
    32  iload_3
    33  ifne 41
    36  aload_0 [this]
    37  iconst_1
    38  putfield com.motivewave.platform.sdk.study.Study.figureUpdatePending : boolean [44]
    41  aload_0 [this]
    42  invokevirtual com.motivewave.platform.sdk.study.Study.notifyFiguresUpdated() : void [223]
    45  return
      Line numbers:
        [pc: 0, line: 586]
        [pc: 14, line: 587]
        [pc: 19, line: 588]
        [pc: 26, line: 589]
        [pc: 32, line: 590]
        [pc: 41, line: 591]
        [pc: 45, line: 592]
      Stack map table: number of frames 2
        [pc: 19, append: {java.util.List}]
        [pc: 41, append: {int}]
  
  // Method descriptor #838 (Lcom/motivewave/platform/sdk/common/DrawContext;)V
  // Stack: 0, Locals: 2
  public void onFiguresLaidOut(com.motivewave.platform.sdk.common.DrawContext arg0);
    0  return
      Line numbers:
        [pc: 0, line: 595]
  
  // Method descriptor #839 (Lcom/motivewave/platform/sdk/draw/Figure;)V
  // Stack: 3, Locals: 2
  protected final void addFigure(com.motivewave.platform.sdk.draw.Figure arg0);
    0  aload_0 [this]
    1  ldc_w <String "__DEFAULT__"> [374]
    4  aload_1 [arg0]
    5  invokevirtual com.motivewave.platform.sdk.study.Study.addFigure(java.lang.String, com.motivewave.platform.sdk.draw.Figure) : void [465]
    8  return
      Line numbers:
        [pc: 0, line: 599]
  
  // Method descriptor #840 (Ljava/util/List;)V
  // Signature: (Ljava/util/List<+Lcom/motivewave/platform/sdk/draw/Figure;>;)V
  // Stack: 3, Locals: 2
  protected final void setFigures(java.util.List arg0);
    0  aload_0 [this]
    1  ldc_w <String "__DEFAULT__"> [374]
    4  aload_1 [arg0]
    5  invokevirtual com.motivewave.platform.sdk.study.Study.setFigures(java.lang.String, java.util.List) : void [469]
    8  return
      Line numbers:
        [pc: 0, line: 601]
  
  // Method descriptor #839 (Lcom/motivewave/platform/sdk/draw/Figure;)V
  // Stack: 3, Locals: 2
  protected final void addFigureFront(com.motivewave.platform.sdk.draw.Figure arg0);
    0  aload_0 [this]
    1  ldc_w <String "__DEFAULT__"> [374]
    4  aload_1 [arg0]
    5  invokevirtual com.motivewave.platform.sdk.study.Study.addFigureFront(java.lang.String, com.motivewave.platform.sdk.draw.Figure) : void [473]
    8  return
      Line numbers:
        [pc: 0, line: 605]
  
  // Method descriptor #468 (Ljava/lang/String;Lcom/motivewave/platform/sdk/draw/Figure;)V
  // Stack: 3, Locals: 4
  protected final void addFigure(java.lang.String arg0, com.motivewave.platform.sdk.draw.Figure arg1);
     0  aload_2 [arg1]
     1  ifnonnull 5
     4  return
     5  aload_0 [this]
     6  getfield com.motivewave.platform.sdk.study.Study.figureMap : java.util.Map [16]
     9  aload_1 [arg0]
    10  invokeinterface java.util.Map.get(java.lang.Object) : java.lang.Object [380] [nargs: 2]
    15  checkcast java.util.List [148]
    18  astore_3
    19  aload_3
    20  ifnonnull 43
    23  new java.util.ArrayList [286]
    26  dup
    27  invokespecial java.util.ArrayList() [288]
    30  astore_3
    31  aload_0 [this]
    32  getfield com.motivewave.platform.sdk.study.Study.figureMap : java.util.Map [16]
    35  aload_1 [arg0]
    36  aload_3
    37  invokeinterface java.util.Map.put(java.lang.Object, java.lang.Object) : java.lang.Object [457] [nargs: 3]
    42  pop
    43  aload_0 [this]
    44  aload_3
    45  aload_2 [arg1]
    46  invokevirtual com.motivewave.platform.sdk.study.Study.contains(java.util.List, com.motivewave.platform.sdk.draw.Figure) : boolean [476]
    49  ifeq 53
    52  return
    53  aload_3
    54  aload_2 [arg1]
    55  invokeinterface java.util.List.add(java.lang.Object) : boolean [317] [nargs: 2]
    60  pop
    61  aload_0 [this]
    62  iconst_1
    63  putfield com.motivewave.platform.sdk.study.Study.figureUpdatePending : boolean [44]
    66  aload_0 [this]
    67  invokevirtual com.motivewave.platform.sdk.study.Study.notifyFiguresUpdated() : void [223]
    70  return
      Line numbers:
        [pc: 0, line: 611]
        [pc: 5, line: 612]
        [pc: 19, line: 613]
        [pc: 23, line: 614]
        [pc: 31, line: 615]
        [pc: 43, line: 618]
        [pc: 53, line: 619]
        [pc: 61, line: 620]
        [pc: 66, line: 621]
        [pc: 70, line: 622]
      Stack map table: number of frames 3
        [pc: 5, same]
        [pc: 43, append: {java.util.List}]
        [pc: 53, same]
  
  // Method descriptor #472 (Ljava/lang/String;Ljava/util/List;)V
  // Signature: (Ljava/lang/String;Ljava/util/List<+Lcom/motivewave/platform/sdk/draw/Figure;>;)V
  // Stack: 5, Locals: 3
  protected final void setFigures(java.lang.String arg0, java.util.List arg1);
     0  aload_2 [arg1]
     1  invokestatic com.motivewave.platform.sdk.common.Util.isEmpty(java.lang.Object) : boolean [141]
     4  ifeq 28
     7  aload_0 [this]
     8  getfield com.motivewave.platform.sdk.study.Study.figureMap : java.util.Map [16]
    11  aload_1 [arg0]
    12  new java.util.ArrayList [286]
    15  dup
    16  invokespecial java.util.ArrayList() [288]
    19  invokeinterface java.util.Map.put(java.lang.Object, java.lang.Object) : java.lang.Object [457] [nargs: 3]
    24  pop
    25  goto 47
    28  aload_0 [this]
    29  getfield com.motivewave.platform.sdk.study.Study.figureMap : java.util.Map [16]
    32  aload_1 [arg0]
    33  new java.util.ArrayList [286]
    36  dup
    37  aload_2 [arg1]
    38  invokespecial java.util.ArrayList(java.util.Collection) [479]
    41  invokeinterface java.util.Map.put(java.lang.Object, java.lang.Object) : java.lang.Object [457] [nargs: 3]
    46  pop
    47  aload_0 [this]
    48  iconst_1
    49  putfield com.motivewave.platform.sdk.study.Study.figureUpdatePending : boolean [44]
    52  aload_0 [this]
    53  invokevirtual com.motivewave.platform.sdk.study.Study.notifyFiguresUpdated() : void [223]
    56  return
      Line numbers:
        [pc: 0, line: 628]
        [pc: 28, line: 629]
        [pc: 47, line: 630]
        [pc: 52, line: 631]
        [pc: 56, line: 632]
      Stack map table: number of frames 2
        [pc: 28, same]
        [pc: 47, same]
  
  // Method descriptor #481 (Ljava/util/Collection;)V
  // Signature: (Ljava/util/Collection<+Lcom/motivewave/platform/sdk/draw/Figure;>;)V
  // Stack: 3, Locals: 2
  protected final void addFigures(java.util.Collection arg0);
    0  aload_0 [this]
    1  ldc_w <String "__DEFAULT__"> [374]
    4  aload_1 [arg0]
    5  invokevirtual com.motivewave.platform.sdk.study.Study.addFigures(java.lang.String, java.util.Collection) : void [482]
    8  return
      Line numbers:
        [pc: 0, line: 636]
  
  // Method descriptor #485 (Ljava/lang/String;Ljava/util/Collection;)V
  // Signature: (Ljava/lang/String;Ljava/util/Collection<+Lcom/motivewave/platform/sdk/draw/Figure;>;)V
  // Stack: 3, Locals: 7
  protected final void addFigures(java.lang.String arg0, java.util.Collection arg1);
      0  aload_2 [arg1]
      1  invokestatic com.motivewave.platform.sdk.common.Util.isEmpty(java.lang.Object) : boolean [141]
      4  ifeq 8
      7  return
      8  aload_0 [this]
      9  getfield com.motivewave.platform.sdk.study.Study.figureMap : java.util.Map [16]
     12  aload_1 [arg0]
     13  invokeinterface java.util.Map.get(java.lang.Object) : java.lang.Object [380] [nargs: 2]
     18  checkcast java.util.List [148]
     21  astore_3
     22  aload_3
     23  ifnonnull 46
     26  new java.util.ArrayList [286]
     29  dup
     30  invokespecial java.util.ArrayList() [288]
     33  astore_3
     34  aload_0 [this]
     35  getfield com.motivewave.platform.sdk.study.Study.figureMap : java.util.Map [16]
     38  aload_1 [arg0]
     39  aload_3
     40  invokeinterface java.util.Map.put(java.lang.Object, java.lang.Object) : java.lang.Object [457] [nargs: 3]
     45  pop
     46  iconst_1
     47  istore 4
     49  aload_2 [arg1]
     50  invokeinterface java.util.Collection.iterator() : java.util.Iterator [486] [nargs: 1]
     55  astore 5
     57  aload 5
     59  invokeinterface java.util.Iterator.hasNext() : boolean [153] [nargs: 1]
     64  ifeq 98
     67  aload 5
     69  invokeinterface java.util.Iterator.next() : java.lang.Object [158] [nargs: 1]
     74  checkcast com.motivewave.platform.sdk.draw.Figure [351]
     77  astore 6
     79  aload_0 [this]
     80  aload_3
     81  aload 6
     83  invokevirtual com.motivewave.platform.sdk.study.Study.contains(java.util.List, com.motivewave.platform.sdk.draw.Figure) : boolean [476]
     86  ifne 95
     89  iconst_0
     90  istore 4
     92  goto 98
     95  goto 57
     98  iload 4
    100  ifeq 104
    103  return
    104  aload_3
    105  aload_2 [arg1]
    106  invokeinterface java.util.List.removeAll(java.util.Collection) : boolean [489] [nargs: 2]
    111  pop
    112  aload_3
    113  aload_2 [arg1]
    114  invokeinterface java.util.List.addAll(java.util.Collection) : boolean [493] [nargs: 2]
    119  pop
    120  aload_0 [this]
    121  iconst_1
    122  putfield com.motivewave.platform.sdk.study.Study.figureUpdatePending : boolean [44]
    125  aload_0 [this]
    126  invokevirtual com.motivewave.platform.sdk.study.Study.notifyFiguresUpdated() : void [223]
    129  return
      Line numbers:
        [pc: 0, line: 642]
        [pc: 8, line: 643]
        [pc: 22, line: 644]
        [pc: 26, line: 645]
        [pc: 34, line: 646]
        [pc: 46, line: 649]
        [pc: 49, line: 650]
        [pc: 79, line: 651]
        [pc: 89, line: 652]
        [pc: 92, line: 653]
        [pc: 95, line: 655]
        [pc: 98, line: 656]
        [pc: 104, line: 658]
        [pc: 112, line: 659]
        [pc: 120, line: 661]
        [pc: 125, line: 662]
        [pc: 129, line: 663]
      Stack map table: number of frames 6
        [pc: 8, same]
        [pc: 46, append: {java.util.List}]
        [pc: 57, append: {int, java.util.Iterator}]
        [pc: 95, same]
        [pc: 98, chop 1 local(s)]
        [pc: 104, same]
  
  // Method descriptor #845 (ILcom/motivewave/platform/sdk/draw/Figure;)V
  // Stack: 4, Locals: 3
  protected final void addFigure(int arg0, com.motivewave.platform.sdk.draw.Figure arg1);
     0  aload_0 [this]
     1  ldc_w <String "__DEFAULT__"> [374]
     4  iload_1 [arg0]
     5  aload_2 [arg1]
     6  invokevirtual com.motivewave.platform.sdk.study.Study.addFigure(java.lang.String, int, com.motivewave.platform.sdk.draw.Figure) : void [496]
     9  return
      Line numbers:
        [pc: 0, line: 668]
  
  // Method descriptor #498 (Ljava/lang/String;ILcom/motivewave/platform/sdk/draw/Figure;)V
  // Stack: 3, Locals: 5
  protected final void addFigure(java.lang.String arg0, int arg1, com.motivewave.platform.sdk.draw.Figure arg2);
      0  aload_3 [arg2]
      1  ifnonnull 5
      4  return
      5  aload_0 [this]
      6  getfield com.motivewave.platform.sdk.study.Study.figureMap : java.util.Map [16]
      9  aload_1 [arg0]
     10  invokeinterface java.util.Map.get(java.lang.Object) : java.lang.Object [380] [nargs: 2]
     15  checkcast java.util.List [148]
     18  astore 4
     20  aload 4
     22  ifnonnull 47
     25  new java.util.ArrayList [286]
     28  dup
     29  invokespecial java.util.ArrayList() [288]
     32  astore 4
     34  aload_0 [this]
     35  getfield com.motivewave.platform.sdk.study.Study.figureMap : java.util.Map [16]
     38  aload_1 [arg0]
     39  aload 4
     41  invokeinterface java.util.Map.put(java.lang.Object, java.lang.Object) : java.lang.Object [457] [nargs: 3]
     46  pop
     47  aload 4
     49  aload_3 [arg2]
     50  invokeinterface java.util.List.remove(java.lang.Object) : boolean [499] [nargs: 2]
     55  pop
     56  aload 4
     58  invokestatic com.motivewave.platform.sdk.common.Util.isEmpty(java.lang.Object) : boolean [141]
     61  ifeq 76
     64  aload 4
     66  aload_3 [arg2]
     67  invokeinterface java.util.List.add(java.lang.Object) : boolean [317] [nargs: 2]
     72  pop
     73  goto 126
     76  iload_2 [arg1]
     77  ifge 92
     80  aload 4
     82  iconst_0
     83  aload_3 [arg2]
     84  invokeinterface java.util.List.add(int, java.lang.Object) : void [502] [nargs: 3]
     89  goto 126
     92  iload_2 [arg1]
     93  aload 4
     95  invokeinterface java.util.List.size() : int [505] [nargs: 1]
    100  iconst_1
    101  isub
    102  if_icmplt 117
    105  aload 4
    107  aload_3 [arg2]
    108  invokeinterface java.util.List.add(java.lang.Object) : boolean [317] [nargs: 2]
    113  pop
    114  goto 126
    117  aload 4
    119  iload_2 [arg1]
    120  aload_3 [arg2]
    121  invokeinterface java.util.List.add(int, java.lang.Object) : void [502] [nargs: 3]
    126  aload_0 [this]
    127  iconst_1
    128  putfield com.motivewave.platform.sdk.study.Study.figureUpdatePending : boolean [44]
    131  aload_0 [this]
    132  invokevirtual com.motivewave.platform.sdk.study.Study.notifyFiguresUpdated() : void [223]
    135  return
      Line numbers:
        [pc: 0, line: 675]
        [pc: 5, line: 676]
        [pc: 20, line: 677]
        [pc: 25, line: 678]
        [pc: 34, line: 679]
        [pc: 47, line: 681]
        [pc: 56, line: 682]
        [pc: 76, line: 684]
        [pc: 92, line: 685]
        [pc: 117, line: 686]
        [pc: 126, line: 688]
        [pc: 131, line: 689]
        [pc: 135, line: 690]
      Stack map table: number of frames 6
        [pc: 5, same]
        [pc: 47, append: {java.util.List}]
        [pc: 76, same]
        [pc: 92, same]
        [pc: 117, same]
        [pc: 126, same]
  
  // Method descriptor #468 (Ljava/lang/String;Lcom/motivewave/platform/sdk/draw/Figure;)V
  // Stack: 3, Locals: 4
  protected final void addFigureFront(java.lang.String arg0, com.motivewave.platform.sdk.draw.Figure arg1);
     0  aload_2 [arg1]
     1  ifnonnull 5
     4  return
     5  aload_0 [this]
     6  getfield com.motivewave.platform.sdk.study.Study.figureMap : java.util.Map [16]
     9  aload_1 [arg0]
    10  invokeinterface java.util.Map.get(java.lang.Object) : java.lang.Object [380] [nargs: 2]
    15  checkcast java.util.List [148]
    18  astore_3
    19  aload_3
    20  ifnonnull 43
    23  new java.util.ArrayList [286]
    26  dup
    27  invokespecial java.util.ArrayList() [288]
    30  astore_3
    31  aload_0 [this]
    32  getfield com.motivewave.platform.sdk.study.Study.figureMap : java.util.Map [16]
    35  aload_1 [arg0]
    36  aload_3
    37  invokeinterface java.util.Map.put(java.lang.Object, java.lang.Object) : java.lang.Object [457] [nargs: 3]
    42  pop
    43  aload_0 [this]
    44  aload_3
    45  aload_2 [arg1]
    46  invokevirtual com.motivewave.platform.sdk.study.Study.contains(java.util.List, com.motivewave.platform.sdk.draw.Figure) : boolean [476]
    49  ifeq 60
    52  aload_3
    53  aload_2 [arg1]
    54  invokeinterface java.util.List.remove(java.lang.Object) : boolean [499] [nargs: 2]
    59  pop
    60  aload_3
    61  invokestatic com.motivewave.platform.sdk.common.Util.isEmpty(java.lang.Object) : boolean [141]
    64  ifeq 78
    67  aload_3
    68  aload_2 [arg1]
    69  invokeinterface java.util.List.add(java.lang.Object) : boolean [317] [nargs: 2]
    74  pop
    75  goto 86
    78  aload_3
    79  iconst_0
    80  aload_2 [arg1]
    81  invokeinterface java.util.List.add(int, java.lang.Object) : void [502] [nargs: 3]
    86  aload_0 [this]
    87  iconst_1
    88  putfield com.motivewave.platform.sdk.study.Study.figureUpdatePending : boolean [44]
    91  aload_0 [this]
    92  invokevirtual com.motivewave.platform.sdk.study.Study.notifyFiguresUpdated() : void [223]
    95  return
      Line numbers:
        [pc: 0, line: 696]
        [pc: 5, line: 697]
        [pc: 19, line: 698]
        [pc: 23, line: 699]
        [pc: 31, line: 700]
        [pc: 43, line: 702]
        [pc: 60, line: 703]
        [pc: 78, line: 704]
        [pc: 86, line: 705]
        [pc: 91, line: 706]
        [pc: 95, line: 707]
      Stack map table: number of frames 5
        [pc: 5, same]
        [pc: 43, append: {java.util.List}]
        [pc: 60, same]
        [pc: 78, same]
        [pc: 86, same]
  
  // Method descriptor #839 (Lcom/motivewave/platform/sdk/draw/Figure;)V
  // Stack: 3, Locals: 2
  protected final void removeFigure(com.motivewave.platform.sdk.draw.Figure arg0);
    0  aload_0 [this]
    1  ldc_w <String "__DEFAULT__"> [374]
    4  aload_1 [arg0]
    5  invokevirtual com.motivewave.platform.sdk.study.Study.removeFigure(java.lang.String, com.motivewave.platform.sdk.draw.Figure) : void [506]
    8  return
      Line numbers:
        [pc: 0, line: 711]
  
  // Method descriptor #468 (Ljava/lang/String;Lcom/motivewave/platform/sdk/draw/Figure;)V
  // Stack: 2, Locals: 4
  protected final void removeFigure(java.lang.String arg0, com.motivewave.platform.sdk.draw.Figure arg1);
     0  aload_2 [arg1]
     1  ifnonnull 5
     4  return
     5  aload_0 [this]
     6  getfield com.motivewave.platform.sdk.study.Study.figureMap : java.util.Map [16]
     9  aload_1 [arg0]
    10  invokeinterface java.util.Map.get(java.lang.Object) : java.lang.Object [380] [nargs: 2]
    15  checkcast java.util.List [148]
    18  astore_3
    19  aload_3
    20  ifnonnull 24
    23  return
    24  aload_3
    25  aload_2 [arg1]
    26  invokeinterface java.util.List.contains(java.lang.Object) : boolean [314] [nargs: 2]
    31  ifne 35
    34  return
    35  aload_3
    36  aload_2 [arg1]
    37  invokeinterface java.util.List.remove(java.lang.Object) : boolean [499] [nargs: 2]
    42  pop
    43  aload_0 [this]
    44  iconst_1
    45  putfield com.motivewave.platform.sdk.study.Study.figureUpdatePending : boolean [44]
    48  aload_0 [this]
    49  invokevirtual com.motivewave.platform.sdk.study.Study.notifyFiguresUpdated() : void [223]
    52  return
      Line numbers:
        [pc: 0, line: 717]
        [pc: 5, line: 718]
        [pc: 19, line: 719]
        [pc: 24, line: 720]
        [pc: 35, line: 721]
        [pc: 43, line: 722]
        [pc: 48, line: 723]
        [pc: 52, line: 724]
      Stack map table: number of frames 3
        [pc: 5, same]
        [pc: 24, append: {java.util.List}]
        [pc: 35, same]
  
  // Method descriptor #478 (Ljava/util/List;Lcom/motivewave/platform/sdk/draw/Figure;)Z
  // Signature: (Ljava/util/List<Lcom/motivewave/platform/sdk/draw/Figure;>;Lcom/motivewave/platform/sdk/draw/Figure;)Z
  // Stack: 3, Locals: 5
  private boolean contains(java.util.List arg0, com.motivewave.platform.sdk.draw.Figure arg1);
     0  aload_1 [arg0]
     1  invokeinterface java.util.List.size() : int [505] [nargs: 1]
     6  istore_3
     7  iload_3
     8  bipush 10
    10  if_icmpgt 21
    13  aload_1 [arg0]
    14  aload_2 [arg1]
    15  invokeinterface java.util.List.contains(java.lang.Object) : boolean [314] [nargs: 2]
    20  ireturn
    21  iload_3
    22  iconst_1
    23  isub
    24  istore 4
    26  iload 4
    28  iload_3
    29  bipush 10
    31  isub
    32  if_icmplt 72
    35  iload 4
    37  aload_1 [arg0]
    38  invokeinterface java.util.List.size() : int [505] [nargs: 1]
    43  if_icmpge 72
    46  aload_1 [arg0]
    47  iload 4
    49  invokeinterface java.util.List.get(int) : java.lang.Object [509] [nargs: 2]
    54  checkcast com.motivewave.platform.sdk.draw.Figure [351]
    57  aload_2 [arg1]
    58  invokevirtual java.lang.Object.equals(java.lang.Object) : boolean [512]
    61  ifeq 66
    64  iconst_1
    65  ireturn
    66  iinc 4 -1
    69  goto 26
    72  iconst_0
    73  ireturn
      Line numbers:
        [pc: 0, line: 728]
        [pc: 7, line: 729]
        [pc: 21, line: 730]
        [pc: 26, line: 731]
        [pc: 46, line: 732]
        [pc: 66, line: 733]
        [pc: 72, line: 735]
      Stack map table: number of frames 4
        [pc: 21, append: {int}]
        [pc: 26, append: {int}]
        [pc: 66, same]
        [pc: 72, same]
  
  // Method descriptor #481 (Ljava/util/Collection;)V
  // Signature: (Ljava/util/Collection<+Lcom/motivewave/platform/sdk/draw/Figure;>;)V
  // Stack: 3, Locals: 2
  protected final void removeFigures(java.util.Collection arg0);
    0  aload_0 [this]
    1  ldc_w <String "__DEFAULT__"> [374]
    4  aload_1 [arg0]
    5  invokevirtual com.motivewave.platform.sdk.study.Study.removeFigures(java.lang.String, java.util.Collection) : void [515]
    8  return
      Line numbers:
        [pc: 0, line: 740]
  
  // Method descriptor #485 (Ljava/lang/String;Ljava/util/Collection;)V
  // Signature: (Ljava/lang/String;Ljava/util/Collection<+Lcom/motivewave/platform/sdk/draw/Figure;>;)V
  // Stack: 2, Locals: 7
  protected final void removeFigures(java.lang.String arg0, java.util.Collection arg1);
      0  aload_2 [arg1]
      1  invokestatic com.motivewave.platform.sdk.common.Util.isEmpty(java.lang.Object) : boolean [141]
      4  ifeq 8
      7  return
      8  aload_0 [this]
      9  getfield com.motivewave.platform.sdk.study.Study.figureMap : java.util.Map [16]
     12  aload_1 [arg0]
     13  invokeinterface java.util.Map.get(java.lang.Object) : java.lang.Object [380] [nargs: 2]
     18  checkcast java.util.List [148]
     21  astore_3
     22  aload_3
     23  ifnonnull 27
     26  return
     27  iconst_0
     28  istore 4
     30  aload_2 [arg1]
     31  invokeinterface java.util.Collection.iterator() : java.util.Iterator [486] [nargs: 1]
     36  astore 5
     38  aload 5
     40  invokeinterface java.util.Iterator.hasNext() : boolean [153] [nargs: 1]
     45  ifeq 80
     48  aload 5
     50  invokeinterface java.util.Iterator.next() : java.lang.Object [158] [nargs: 1]
     55  checkcast com.motivewave.platform.sdk.draw.Figure [351]
     58  astore 6
     60  aload_3
     61  aload 6
     63  invokeinterface java.util.List.contains(java.lang.Object) : boolean [314] [nargs: 2]
     68  ifeq 77
     71  iconst_1
     72  istore 4
     74  goto 80
     77  goto 38
     80  iload 4
     82  ifne 86
     85  return
     86  aload_3
     87  aload_2 [arg1]
     88  invokeinterface java.util.List.removeAll(java.util.Collection) : boolean [489] [nargs: 2]
     93  pop
     94  aload_0 [this]
     95  iconst_1
     96  putfield com.motivewave.platform.sdk.study.Study.figureUpdatePending : boolean [44]
     99  aload_0 [this]
    100  invokevirtual com.motivewave.platform.sdk.study.Study.notifyFiguresUpdated() : void [223]
    103  return
      Line numbers:
        [pc: 0, line: 746]
        [pc: 8, line: 747]
        [pc: 22, line: 748]
        [pc: 27, line: 749]
        [pc: 30, line: 750]
        [pc: 60, line: 751]
        [pc: 71, line: 752]
        [pc: 74, line: 753]
        [pc: 77, line: 755]
        [pc: 80, line: 756]
        [pc: 86, line: 757]
        [pc: 94, line: 758]
        [pc: 99, line: 759]
        [pc: 103, line: 760]
      Stack map table: number of frames 6
        [pc: 8, same]
        [pc: 27, append: {java.util.List}]
        [pc: 38, append: {int, java.util.Iterator}]
        [pc: 77, same]
        [pc: 80, chop 1 local(s)]
        [pc: 86, same]
  
  // Method descriptor #140 ()Ljava/util/List;
  // Signature: ()Ljava/util/List<Lcom/motivewave/platform/sdk/draw/Figure;>;
  // Stack: 2, Locals: 1
  public final java.util.List getFigures();
    0  aload_0 [this]
    1  ldc_w <String "__DEFAULT__"> [374]
    4  invokevirtual com.motivewave.platform.sdk.study.Study.getFigures(java.lang.String) : java.util.List [518]
    7  areturn
      Line numbers:
        [pc: 0, line: 764]
  
  // Method descriptor #520 (Ljava/lang/String;)Ljava/util/List;
  // Signature: (Ljava/lang/String;)Ljava/util/List<Lcom/motivewave/platform/sdk/draw/Figure;>;
  // Stack: 3, Locals: 3
  public final java.util.List getFigures(java.lang.String arg0);
     0  aload_0 [this]
     1  getfield com.motivewave.platform.sdk.study.Study.figureMap : java.util.Map [16]
     4  aload_1 [arg0]
     5  invokeinterface java.util.Map.get(java.lang.Object) : java.lang.Object [380] [nargs: 2]
    10  checkcast java.util.List [148]
    13  astore_2
    14  aload_2
    15  ifnonnull 26
    18  new java.util.ArrayList [286]
    21  dup
    22  invokespecial java.util.ArrayList() [288]
    25  areturn
    26  new java.util.ArrayList [286]
    29  dup
    30  aload_2
    31  invokespecial java.util.ArrayList(java.util.Collection) [479]
    34  areturn
      Line numbers:
        [pc: 0, line: 770]
        [pc: 14, line: 771]
        [pc: 26, line: 772]
      Stack map table: number of frames 1
        [pc: 26, append: {java.util.List}]
  
  // Method descriptor #195 ()I
  // Stack: 5, Locals: 11
  public int getMinBars();
      0  aload_0 [this]
      1  getfield com.motivewave.platform.sdk.study.Study.minBars : int [30]
      4  bipush 20
      6  if_icmpeq 14
      9  aload_0 [this]
     10  getfield com.motivewave.platform.sdk.study.Study.minBars : int [30]
     13  ireturn
     14  aload_0 [this]
     15  invokevirtual com.motivewave.platform.sdk.study.Study.getSettings() : com.motivewave.platform.sdk.common.Settings [180]
     18  astore_1
     19  aload_1
     20  ldc_w <String "period"> [523]
     23  iconst_0
     24  invokevirtual com.motivewave.platform.sdk.common.Settings.getInteger(java.lang.String, int) : int [525]
     27  istore_2
     28  aload_1
     29  ldc_w <String "period2"> [529]
     32  iconst_0
     33  invokevirtual com.motivewave.platform.sdk.common.Settings.getInteger(java.lang.String, int) : int [525]
     36  istore_3
     37  aload_1
     38  ldc_w <String "period3"> [531]
     41  iconst_0
     42  invokevirtual com.motivewave.platform.sdk.common.Settings.getInteger(java.lang.String, int) : int [525]
     45  istore 4
     47  aload_1
     48  ldc_w <String "period4"> [533]
     51  iconst_0
     52  invokevirtual com.motivewave.platform.sdk.common.Settings.getInteger(java.lang.String, int) : int [525]
     55  istore 5
     57  iload_2
     58  iload_3
     59  iadd
     60  iload 4
     62  iadd
     63  iload 5
     65  iadd
     66  istore 6
     68  iconst_1
     69  istore 7
     71  aload_1
     72  invokevirtual com.motivewave.platform.sdk.common.Settings.getMAMethods() : java.util.Set [535]
     75  invokeinterface java.util.Set.iterator() : java.util.Iterator [296] [nargs: 1]
     80  astore 8
     82  aload 8
     84  invokeinterface java.util.Iterator.hasNext() : boolean [153] [nargs: 1]
     89  ifeq 202
     92  aload 8
     94  invokeinterface java.util.Iterator.next() : java.lang.Object [158] [nargs: 1]
     99  checkcast java.lang.String [299]
    102  astore 9
    104  aload_1
    105  aload 9
    107  invokevirtual com.motivewave.platform.sdk.common.Settings.getMAMethod(java.lang.String) : com.motivewave.platform.sdk.common.Enums$MAMethod [538]
    110  astore 10
    112  aload 10
    114  iconst_2
    115  anewarray java.lang.Object [2]
    118  dup
    119  iconst_0
    120  getstatic com.motivewave.platform.sdk.common.Enums$MAMethod.EMA : com.motivewave.platform.sdk.common.Enums.MAMethod [542]
    123  aastore
    124  dup
    125  iconst_1
    126  getstatic com.motivewave.platform.sdk.common.Enums$MAMethod.MEMA : com.motivewave.platform.sdk.common.Enums.MAMethod [548]
    129  aastore
    130  invokestatic com.motivewave.platform.sdk.common.Util.in(java.lang.Object, java.lang.Object[]) : boolean [551]
    133  ifeq 145
    136  iload 7
    138  iconst_2
    139  if_icmpge 145
    142  iconst_2
    143  istore 7
    145  aload 10
    147  iconst_1
    148  anewarray java.lang.Object [2]
    151  dup
    152  iconst_0
    153  getstatic com.motivewave.platform.sdk.common.Enums$MAMethod.DEMA : com.motivewave.platform.sdk.common.Enums.MAMethod [555]
    156  aastore
    157  invokestatic com.motivewave.platform.sdk.common.Util.in(java.lang.Object, java.lang.Object[]) : boolean [551]
    160  ifeq 172
    163  iload 7
    165  iconst_4
    166  if_icmpge 172
    169  iconst_3
    170  istore 7
    172  aload 10
    174  iconst_1
    175  anewarray java.lang.Object [2]
    178  dup
    179  iconst_0
    180  getstatic com.motivewave.platform.sdk.common.Enums$MAMethod.DEMA : com.motivewave.platform.sdk.common.Enums.MAMethod [555]
    183  aastore
    184  invokestatic com.motivewave.platform.sdk.common.Util.in(java.lang.Object, java.lang.Object[]) : boolean [551]
    187  ifeq 199
    190  iload 7
    192  iconst_4
    193  if_icmpge 199
    196  iconst_4
    197  istore 7
    199  goto 82
    202  iload 6
    204  iload 7
    206  imul
    207  istore 6
    209  iload 6
    211  ifle 217
    214  iload 6
    216  ireturn
    217  aload_0 [this]
    218  getfield com.motivewave.platform.sdk.study.Study.minBars : int [30]
    221  ireturn
      Line numbers:
        [pc: 0, line: 778]
        [pc: 14, line: 779]
        [pc: 19, line: 780]
        [pc: 28, line: 781]
        [pc: 37, line: 782]
        [pc: 47, line: 783]
        [pc: 57, line: 784]
        [pc: 68, line: 786]
        [pc: 71, line: 787]
        [pc: 104, line: 788]
        [pc: 112, line: 789]
        [pc: 136, line: 790]
        [pc: 145, line: 792]
        [pc: 163, line: 793]
        [pc: 172, line: 795]
        [pc: 190, line: 796]
        [pc: 199, line: 798]
        [pc: 202, line: 799]
        [pc: 209, line: 800]
        [pc: 217, line: 801]
      Stack map table: number of frames 7
        [pc: 14, same]
        [pc: 82, full, stack: {}, locals: {com.motivewave.platform.sdk.study.Study, com.motivewave.platform.sdk.common.Settings, int, int, int, int, int, int, java.util.Iterator}]
        [pc: 145, append: {java.lang.String, com.motivewave.platform.sdk.common.Enums$MAMethod}]
        [pc: 172, same]
        [pc: 199, chop 2 local(s)]
        [pc: 202, chop 1 local(s)]
        [pc: 217, same]
  
  // Method descriptor #849 (Lcom/motivewave/platform/sdk/common/DataContext;)I
  // Stack: 1, Locals: 2
  public int getMinBars(com.motivewave.platform.sdk.common.DataContext arg0);
    0  aload_0 [this]
    1  invokevirtual com.motivewave.platform.sdk.study.Study.getMinBars() : int [558]
    4  ireturn
      Line numbers:
        [pc: 0, line: 807]
  
  // Method descriptor #850 (Lcom/motivewave/platform/sdk/common/DataContext;Lcom/motivewave/platform/sdk/common/BarSize;)I
  // Stack: 2, Locals: 4
  public int getMinBars(com.motivewave.platform.sdk.common.DataContext arg0, com.motivewave.platform.sdk.common.BarSize arg1);
     0  aload_0 [this]
     1  getfield com.motivewave.platform.sdk.study.Study.minBarMap : java.util.Map [34]
     4  aload_2 [arg1]
     5  invokeinterface java.util.Map.get(java.lang.Object) : java.lang.Object [380] [nargs: 2]
    10  checkcast java.lang.Integer [561]
    13  astore_3
    14  aload_3
    15  ifnull 23
    18  aload_3
    19  invokevirtual java.lang.Integer.intValue() : int [563]
    22  ireturn
    23  aload_0 [this]
    24  invokevirtual com.motivewave.platform.sdk.study.Study.getMinBars() : int [558]
    27  ireturn
      Line numbers:
        [pc: 0, line: 814]
        [pc: 14, line: 815]
        [pc: 23, line: 816]
      Stack map table: number of frames 1
        [pc: 23, append: {java.lang.Integer}]
  
  // Method descriptor #852 (I)V
  // Stack: 2, Locals: 2
  public void setMinBars(int arg0);
    0  aload_0 [this]
    1  iload_1 [arg0]
    2  putfield com.motivewave.platform.sdk.study.Study.minBars : int [30]
    5  return
      Line numbers:
        [pc: 0, line: 821]
  
  // Method descriptor #853 (ILcom/motivewave/platform/sdk/common/BarSize;)V
  // Stack: 3, Locals: 3
  public void setMinBars(int arg0, com.motivewave.platform.sdk.common.BarSize arg1);
     0  aload_0 [this]
     1  getfield com.motivewave.platform.sdk.study.Study.minBarMap : java.util.Map [34]
     4  aload_2 [arg1]
     5  iload_1 [arg0]
     6  invokestatic java.lang.Integer.valueOf(int) : java.lang.Integer [566]
     9  invokeinterface java.util.Map.put(java.lang.Object, java.lang.Object) : java.lang.Object [457] [nargs: 3]
    14  pop
    15  return
      Line numbers:
        [pc: 0, line: 826]
  
  // Method descriptor #573 ()Ljava/lang/Long;
  // Stack: 1, Locals: 1
  public java.lang.Long getMinStartTime();
    0  aload_0 [this]
    1  getfield com.motivewave.platform.sdk.study.Study.minStartTime : java.lang.Long [37]
    4  areturn
      Line numbers:
        [pc: 0, line: 830]
  
  // Method descriptor #854 (Lcom/motivewave/platform/sdk/common/DataContext;)Ljava/lang/Long;
  // Stack: 1, Locals: 2
  public java.lang.Long getMinStartTime(com.motivewave.platform.sdk.common.DataContext arg0);
    0  aload_0 [this]
    1  invokevirtual com.motivewave.platform.sdk.study.Study.getMinStartTime() : java.lang.Long [570]
    4  areturn
      Line numbers:
        [pc: 0, line: 835]
  
  // Method descriptor #856 (Ljava/lang/Long;)V
  // Stack: 2, Locals: 2
  public void setMinStartTime(java.lang.Long arg0);
    0  aload_0 [this]
    1  aload_1 [arg0]
    2  putfield com.motivewave.platform.sdk.study.Study.minStartTime : java.lang.Long [37]
    5  return
      Line numbers:
        [pc: 0, line: 839]
  
  // Method descriptor #591 (Lcom/motivewave/platform/sdk/order_mgmt/OrderContext;)V
  // Stack: 0, Locals: 2
  public void onActivate(com.motivewave.platform.sdk.order_mgmt.OrderContext arg0);
    0  return
      Line numbers:
        [pc: 0, line: 846]
  
  // Method descriptor #859 (Lcom/motivewave/platform/sdk/order_mgmt/OrderContext;Lcom/motivewave/platform/sdk/common/TimeFrame;)V
  // Stack: 0, Locals: 3
  public void onSessionStarted(com.motivewave.platform.sdk.order_mgmt.OrderContext arg0, com.motivewave.platform.sdk.common.TimeFrame arg1);
    0  return
      Line numbers:
        [pc: 0, line: 851]
  
  // Method descriptor #859 (Lcom/motivewave/platform/sdk/order_mgmt/OrderContext;Lcom/motivewave/platform/sdk/common/TimeFrame;)V
  // Stack: 2, Locals: 3
  public void onSessionEnded(com.motivewave.platform.sdk.order_mgmt.OrderContext arg0, com.motivewave.platform.sdk.common.TimeFrame arg1);
     0  aload_0 [this]
     1  invokevirtual com.motivewave.platform.sdk.study.Study.getSettings() : com.motivewave.platform.sdk.common.Settings [180]
     4  invokevirtual com.motivewave.platform.sdk.common.Settings.isCloseOnSessionEnd() : boolean [574]
     7  ifeq 16
    10  aload_1 [arg0]
    11  invokeinterface com.motivewave.platform.sdk.order_mgmt.OrderContext.closeAtMarket() : void [577] [nargs: 1]
    16  aload_0 [this]
    17  getstatic com.motivewave.platform.sdk.common.Enums$StrategyState.DORMANT : com.motivewave.platform.sdk.common.Enums.StrategyState [582]
    20  invokevirtual com.motivewave.platform.sdk.study.Study.setState(com.motivewave.platform.sdk.common.Enums$StrategyState) : void [585]
    23  return
      Line numbers:
        [pc: 0, line: 857]
        [pc: 10, line: 858]
        [pc: 16, line: 860]
        [pc: 23, line: 861]
      Stack map table: number of frames 1
        [pc: 16, same]
  
  // Method descriptor #591 (Lcom/motivewave/platform/sdk/order_mgmt/OrderContext;)V
  // Stack: 2, Locals: 2
  public void onBarOpen(com.motivewave.platform.sdk.order_mgmt.OrderContext arg0);
    0  aload_0 [this]
    1  aload_1 [arg0]
    2  invokevirtual com.motivewave.platform.sdk.study.Study.onBarUpdate(com.motivewave.platform.sdk.order_mgmt.OrderContext) : void [589]
    5  return
      Line numbers:
        [pc: 0, line: 866]
  
  // Method descriptor #591 (Lcom/motivewave/platform/sdk/order_mgmt/OrderContext;)V
  // Stack: 0, Locals: 2
  public void onBarUpdate(com.motivewave.platform.sdk.order_mgmt.OrderContext arg0);
    0  return
      Line numbers:
        [pc: 0, line: 870]
  
  // Method descriptor #591 (Lcom/motivewave/platform/sdk/order_mgmt/OrderContext;)V
  // Stack: 2, Locals: 2
  public void onBarClose(com.motivewave.platform.sdk.order_mgmt.OrderContext arg0);
    0  aload_0 [this]
    1  aload_1 [arg0]
    2  invokevirtual com.motivewave.platform.sdk.study.Study.onBarUpdate(com.motivewave.platform.sdk.order_mgmt.OrderContext) : void [589]
    5  return
      Line numbers:
        [pc: 0, line: 876]
        [pc: 5, line: 877]
  
  // Method descriptor #862 (Lcom/motivewave/platform/sdk/order_mgmt/OrderContext;Ljava/lang/Object;)V
  // Stack: 0, Locals: 3
  public void onSignal(com.motivewave.platform.sdk.order_mgmt.OrderContext arg0, java.lang.Object arg1);
    0  return
      Line numbers:
        [pc: 0, line: 883]
  
  // Method descriptor #591 (Lcom/motivewave/platform/sdk/order_mgmt/OrderContext;)V
  // Stack: 2, Locals: 2
  public void onDeactivate(com.motivewave.platform.sdk.order_mgmt.OrderContext arg0);
     0  aload_0 [this]
     1  invokevirtual com.motivewave.platform.sdk.study.Study.getSettings() : com.motivewave.platform.sdk.common.Settings [180]
     4  invokevirtual com.motivewave.platform.sdk.common.Settings.isCloseOnDeactivate() : boolean [592]
     7  ifeq 23
    10  aload_0 [this]
    11  getfield com.motivewave.platform.sdk.study.Study.vetoClosePosition : boolean [54]
    14  ifne 23
    17  aload_1 [arg0]
    18  invokeinterface com.motivewave.platform.sdk.order_mgmt.OrderContext.closeAtMarket() : void [577] [nargs: 1]
    23  aload_1 [arg0]
    24  invokeinterface com.motivewave.platform.sdk.order_mgmt.OrderContext.cancelOrders() : void [595] [nargs: 1]
    29  aload_0 [this]
    30  getstatic com.motivewave.platform.sdk.common.Enums$StrategyState.INACTIVE : com.motivewave.platform.sdk.common.Enums.StrategyState [60]
    33  invokevirtual com.motivewave.platform.sdk.study.Study.setState(com.motivewave.platform.sdk.common.Enums$StrategyState) : void [585]
    36  return
      Line numbers:
        [pc: 0, line: 888]
        [pc: 17, line: 889]
        [pc: 23, line: 891]
        [pc: 29, line: 892]
        [pc: 36, line: 893]
      Stack map table: number of frames 1
        [pc: 23, same]
  
  // Method descriptor #865 (Z)V
  // Stack: 2, Locals: 2
  public void setVetoCloseOnDeactivate(boolean arg0);
    0  aload_0 [this]
    1  iload_1 [arg0]
    2  putfield com.motivewave.platform.sdk.study.Study.vetoClosePosition : boolean [54]
    5  return
      Line numbers:
        [pc: 0, line: 895]
  
  // Method descriptor #591 (Lcom/motivewave/platform/sdk/order_mgmt/OrderContext;)V
  // Stack: 2, Locals: 2
  public void onReset(com.motivewave.platform.sdk.order_mgmt.OrderContext arg0);
     0  aload_0 [this]
     1  getstatic com.motivewave.platform.sdk.common.Enums$StrategyState.INACTIVE : com.motivewave.platform.sdk.common.Enums.StrategyState [60]
     4  invokevirtual com.motivewave.platform.sdk.study.Study.setState(com.motivewave.platform.sdk.common.Enums$StrategyState) : void [585]
     7  aload_0 [this]
     8  aconst_null
     9  invokevirtual com.motivewave.platform.sdk.study.Study.setLong(java.lang.Boolean) : void [598]
    12  return
      Line numbers:
        [pc: 0, line: 900]
        [pc: 7, line: 901]
        [pc: 12, line: 902]
  
  // Method descriptor #591 (Lcom/motivewave/platform/sdk/order_mgmt/OrderContext;)V
  // Stack: 0, Locals: 2
  public void onPositionClosed(com.motivewave.platform.sdk.order_mgmt.OrderContext arg0);
    0  return
      Line numbers:
        [pc: 0, line: 906]
  
  // Method descriptor #591 (Lcom/motivewave/platform/sdk/order_mgmt/OrderContext;)V
  // Stack: 0, Locals: 2
  public void onEnterNow(com.motivewave.platform.sdk.order_mgmt.OrderContext arg0);
    0  return
      Line numbers:
        [pc: 0, line: 911]
  
  // Method descriptor #870 (Lcom/motivewave/platform/sdk/order_mgmt/OrderContext;Lcom/motivewave/platform/sdk/order_mgmt/Order;)V
  // Stack: 0, Locals: 3
  public void onOrderFilled(com.motivewave.platform.sdk.order_mgmt.OrderContext arg0, com.motivewave.platform.sdk.order_mgmt.Order arg1);
    0  return
      Line numbers:
        [pc: 0, line: 919]
  
  // Method descriptor #870 (Lcom/motivewave/platform/sdk/order_mgmt/OrderContext;Lcom/motivewave/platform/sdk/order_mgmt/Order;)V
  // Stack: 0, Locals: 3
  public void onOrderCancelled(com.motivewave.platform.sdk.order_mgmt.OrderContext arg0, com.motivewave.platform.sdk.order_mgmt.Order arg1);
    0  return
      Line numbers:
        [pc: 0, line: 924]
  
  // Method descriptor #870 (Lcom/motivewave/platform/sdk/order_mgmt/OrderContext;Lcom/motivewave/platform/sdk/order_mgmt/Order;)V
  // Stack: 0, Locals: 3
  public void onOrderRejected(com.motivewave.platform.sdk.order_mgmt.OrderContext arg0, com.motivewave.platform.sdk.order_mgmt.Order arg1);
    0  return
      Line numbers:
        [pc: 0, line: 929]
  
  // Method descriptor #870 (Lcom/motivewave/platform/sdk/order_mgmt/OrderContext;Lcom/motivewave/platform/sdk/order_mgmt/Order;)V
  // Stack: 0, Locals: 3
  public void onOrderModified(com.motivewave.platform.sdk.order_mgmt.OrderContext arg0, com.motivewave.platform.sdk.order_mgmt.Order arg1);
    0  return
      Line numbers:
        [pc: 0, line: 934]
  
  // Method descriptor #875 ()Lcom/motivewave/platform/sdk/common/Enums$StrategyState;
  // Stack: 1, Locals: 1
  public final com.motivewave.platform.sdk.common.Enums.StrategyState getState();
    0  aload_0 [this]
    1  getfield com.motivewave.platform.sdk.study.Study.state : com.motivewave.platform.sdk.common.Enums.StrategyState [66]
    4  areturn
      Line numbers:
        [pc: 0, line: 942]
  
  // Method descriptor #588 (Lcom/motivewave/platform/sdk/common/Enums$StrategyState;)V
  // Stack: 4, Locals: 3
  public final void setState(com.motivewave.platform.sdk.common.Enums.StrategyState arg0);
     0  aload_1 [arg0]
     1  aload_0 [this]
     2  getfield com.motivewave.platform.sdk.study.Study.state : com.motivewave.platform.sdk.common.Enums.StrategyState [66]
     5  if_acmpne 9
     8  return
     9  aload_0 [this]
    10  getfield com.motivewave.platform.sdk.study.Study.state : com.motivewave.platform.sdk.common.Enums.StrategyState [66]
    13  astore_2
    14  aload_0 [this]
    15  aload_1 [arg0]
    16  putfield com.motivewave.platform.sdk.study.Study.state : com.motivewave.platform.sdk.common.Enums.StrategyState [66]
    19  aload_0 [this]
    20  ldc_w <String "state"> [602]
    23  aload_2
    24  aload_0 [this]
    25  getfield com.motivewave.platform.sdk.study.Study.state : com.motivewave.platform.sdk.common.Enums.StrategyState [66]
    28  invokevirtual com.motivewave.platform.sdk.study.Study.firePropertyChange(java.lang.String, java.lang.Object, java.lang.Object) : void [250]
    31  return
      Line numbers:
        [pc: 0, line: 946]
        [pc: 9, line: 947]
        [pc: 14, line: 948]
        [pc: 19, line: 949]
        [pc: 31, line: 950]
      Stack map table: number of frames 1
        [pc: 9, same]
  
  // Method descriptor #877 ()Lcom/motivewave/platform/sdk/common/Enums$EntryState;
  // Stack: 1, Locals: 1
  public final com.motivewave.platform.sdk.common.Enums.EntryState getEntryState();
    0  aload_0 [this]
    1  getfield com.motivewave.platform.sdk.study.Study.entryState : com.motivewave.platform.sdk.common.Enums.EntryState [75]
    4  areturn
      Line numbers:
        [pc: 0, line: 954]
  
  // Method descriptor #879 (Lcom/motivewave/platform/sdk/common/Enums$EntryState;)V
  // Stack: 4, Locals: 3
  public final void setEntryState(com.motivewave.platform.sdk.common.Enums.EntryState arg0);
     0  aload_1 [arg0]
     1  aload_0 [this]
     2  getfield com.motivewave.platform.sdk.study.Study.entryState : com.motivewave.platform.sdk.common.Enums.EntryState [75]
     5  if_acmpne 9
     8  return
     9  aload_0 [this]
    10  getfield com.motivewave.platform.sdk.study.Study.entryState : com.motivewave.platform.sdk.common.Enums.EntryState [75]
    13  astore_2
    14  aload_0 [this]
    15  aload_1 [arg0]
    16  putfield com.motivewave.platform.sdk.study.Study.entryState : com.motivewave.platform.sdk.common.Enums.EntryState [75]
    19  aload_0 [this]
    20  ldc_w <String "entryState"> [603]
    23  aload_2
    24  aload_0 [this]
    25  getfield com.motivewave.platform.sdk.study.Study.entryState : com.motivewave.platform.sdk.common.Enums.EntryState [75]
    28  invokevirtual com.motivewave.platform.sdk.study.Study.firePropertyChange(java.lang.String, java.lang.Object, java.lang.Object) : void [250]
    31  return
      Line numbers:
        [pc: 0, line: 958]
        [pc: 9, line: 959]
        [pc: 14, line: 960]
        [pc: 19, line: 961]
        [pc: 31, line: 962]
      Stack map table: number of frames 1
        [pc: 9, same]
  
  // Method descriptor #136 ()Z
  // Stack: 1, Locals: 1
  public final boolean isLong();
     0  aload_0 [this]
     1  getfield com.motivewave.platform.sdk.study.Study.iLong : java.lang.Boolean [78]
     4  ifnonnull 9
     7  iconst_0
     8  ireturn
     9  aload_0 [this]
    10  getfield com.motivewave.platform.sdk.study.Study.iLong : java.lang.Boolean [78]
    13  invokevirtual java.lang.Boolean.booleanValue() : boolean [604]
    16  ireturn
      Line numbers:
        [pc: 0, line: 967]
        [pc: 9, line: 968]
      Stack map table: number of frames 1
        [pc: 9, same]
  
  // Method descriptor #136 ()Z
  // Stack: 1, Locals: 1
  public final boolean isShort();
     0  aload_0 [this]
     1  getfield com.motivewave.platform.sdk.study.Study.iLong : java.lang.Boolean [78]
     4  ifnonnull 9
     7  iconst_0
     8  ireturn
     9  aload_0 [this]
    10  getfield com.motivewave.platform.sdk.study.Study.iLong : java.lang.Boolean [78]
    13  invokevirtual java.lang.Boolean.booleanValue() : boolean [604]
    16  ifne 23
    19  iconst_1
    20  goto 24
    23  iconst_0
    24  ireturn
      Line numbers:
        [pc: 0, line: 974]
        [pc: 9, line: 975]
      Stack map table: number of frames 3
        [pc: 9, same]
        [pc: 23, same]
        [pc: 24, same_locals_1_stack_item, stack: {int}]
  
  // Method descriptor #601 (Ljava/lang/Boolean;)V
  // Stack: 4, Locals: 3
  public final void setLong(java.lang.Boolean arg0);
     0  aload_1 [arg0]
     1  aload_0 [this]
     2  getfield com.motivewave.platform.sdk.study.Study.iLong : java.lang.Boolean [78]
     5  if_acmpne 9
     8  return
     9  aload_0 [this]
    10  getfield com.motivewave.platform.sdk.study.Study.iLong : java.lang.Boolean [78]
    13  astore_2
    14  aload_0 [this]
    15  aload_1 [arg0]
    16  putfield com.motivewave.platform.sdk.study.Study.iLong : java.lang.Boolean [78]
    19  aload_0 [this]
    20  ldc_w <String "long"> [609]
    23  aload_2
    24  aload_0 [this]
    25  getfield com.motivewave.platform.sdk.study.Study.iLong : java.lang.Boolean [78]
    28  invokevirtual com.motivewave.platform.sdk.study.Study.firePropertyChange(java.lang.String, java.lang.Object, java.lang.Object) : void [250]
    31  return
      Line numbers:
        [pc: 0, line: 981]
        [pc: 9, line: 982]
        [pc: 14, line: 983]
        [pc: 19, line: 984]
        [pc: 31, line: 985]
      Stack map table: number of frames 1
        [pc: 9, same]
  
  // Method descriptor #136 ()Z
  // Stack: 1, Locals: 1
  public final boolean isCancelInProgress();
    0  aload_0 [this]
    1  getfield com.motivewave.platform.sdk.study.Study.cancelInProgress : boolean [48]
    4  ireturn
      Line numbers:
        [pc: 0, line: 989]
  
  // Method descriptor #865 (Z)V
  // Stack: 4, Locals: 3
  public final void setCancelInProgress(boolean arg0);
     0  aload_0 [this]
     1  getfield com.motivewave.platform.sdk.study.Study.cancelInProgress : boolean [48]
     4  iload_1 [arg0]
     5  if_icmpne 9
     8  return
     9  aload_0 [this]
    10  getfield com.motivewave.platform.sdk.study.Study.cancelInProgress : boolean [48]
    13  istore_2
    14  aload_0 [this]
    15  iload_1 [arg0]
    16  putfield com.motivewave.platform.sdk.study.Study.cancelInProgress : boolean [48]
    19  aload_0 [this]
    20  ldc_w <String "cancelInProgress"> [611]
    23  iload_2
    24  invokestatic java.lang.Boolean.valueOf(boolean) : java.lang.Boolean [612]
    27  aload_0 [this]
    28  getfield com.motivewave.platform.sdk.study.Study.cancelInProgress : boolean [48]
    31  invokestatic java.lang.Boolean.valueOf(boolean) : java.lang.Boolean [612]
    34  invokevirtual com.motivewave.platform.sdk.study.Study.firePropertyChange(java.lang.String, java.lang.Object, java.lang.Object) : void [250]
    37  return
      Line numbers:
        [pc: 0, line: 993]
        [pc: 9, line: 994]
        [pc: 14, line: 995]
        [pc: 19, line: 996]
        [pc: 37, line: 997]
      Stack map table: number of frames 1
        [pc: 9, same]
  
  // Method descriptor #885 ()Ljava/lang/Float;
  // Stack: 1, Locals: 1
  public final java.lang.Float getStopPrice();
    0  aload_0 [this]
    1  getfield com.motivewave.platform.sdk.study.Study.stopPrice : java.lang.Float [85]
    4  areturn
      Line numbers:
        [pc: 0, line: 1002]
  
  // Method descriptor #887 (Ljava/lang/Float;)V
  // Stack: 4, Locals: 3
  public final void setStopPrice(java.lang.Float arg0);
     0  aload_1 [arg0]
     1  aload_0 [this]
     2  getfield com.motivewave.platform.sdk.study.Study.stopPrice : java.lang.Float [85]
     5  if_acmpne 9
     8  return
     9  aload_0 [this]
    10  getfield com.motivewave.platform.sdk.study.Study.stopPrice : java.lang.Float [85]
    13  astore_2
    14  aload_0 [this]
    15  aload_1 [arg0]
    16  putfield com.motivewave.platform.sdk.study.Study.stopPrice : java.lang.Float [85]
    19  aload_0 [this]
    20  ldc_w <String "stopPrice"> [615]
    23  aload_2
    24  aload_0 [this]
    25  getfield com.motivewave.platform.sdk.study.Study.stopPrice : java.lang.Float [85]
    28  invokevirtual com.motivewave.platform.sdk.study.Study.firePropertyChange(java.lang.String, java.lang.Object, java.lang.Object) : void [250]
    31  return
      Line numbers:
        [pc: 0, line: 1006]
        [pc: 9, line: 1007]
        [pc: 14, line: 1008]
        [pc: 19, line: 1009]
        [pc: 31, line: 1010]
      Stack map table: number of frames 1
        [pc: 9, same]
  
  // Method descriptor #885 ()Ljava/lang/Float;
  // Stack: 1, Locals: 1
  public final java.lang.Float getTargetPrice();
    0  aload_0 [this]
    1  getfield com.motivewave.platform.sdk.study.Study.targetPrice : java.lang.Float [89]
    4  areturn
      Line numbers:
        [pc: 0, line: 1015]
  
  // Method descriptor #887 (Ljava/lang/Float;)V
  // Stack: 4, Locals: 3
  public final void setTargetPrice(java.lang.Float arg0);
     0  aload_1 [arg0]
     1  aload_0 [this]
     2  getfield com.motivewave.platform.sdk.study.Study.targetPrice : java.lang.Float [89]
     5  if_acmpne 9
     8  return
     9  aload_0 [this]
    10  getfield com.motivewave.platform.sdk.study.Study.targetPrice : java.lang.Float [89]
    13  astore_2
    14  aload_0 [this]
    15  aload_1 [arg0]
    16  putfield com.motivewave.platform.sdk.study.Study.targetPrice : java.lang.Float [89]
    19  aload_0 [this]
    20  ldc_w <String "targetPrice"> [616]
    23  aload_2
    24  aload_0 [this]
    25  getfield com.motivewave.platform.sdk.study.Study.targetPrice : java.lang.Float [89]
    28  invokevirtual com.motivewave.platform.sdk.study.Study.firePropertyChange(java.lang.String, java.lang.Object, java.lang.Object) : void [250]
    31  return
      Line numbers:
        [pc: 0, line: 1019]
        [pc: 9, line: 1020]
        [pc: 14, line: 1021]
        [pc: 19, line: 1022]
        [pc: 31, line: 1023]
      Stack map table: number of frames 1
        [pc: 9, same]
  
  // Method descriptor #213 (Lcom/motivewave/platform/sdk/common/DataContext;)V
  // Stack: 2, Locals: 2
  public final void setDataContext(com.motivewave.platform.sdk.common.DataContext arg0);
    0  aload_0 [this]
    1  aload_1 [arg0]
    2  putfield com.motivewave.platform.sdk.study.Study.dataCtx : com.motivewave.platform.sdk.common.DataContext [92]
    5  return
      Line numbers:
        [pc: 0, line: 1026]
  
  // Method descriptor #892 ()Lcom/motivewave/platform/sdk/common/DataContext;
  // Stack: 1, Locals: 1
  public com.motivewave.platform.sdk.common.DataContext getDataContext();
    0  aload_0 [this]
    1  getfield com.motivewave.platform.sdk.study.Study.dataCtx : com.motivewave.platform.sdk.common.DataContext [92]
    4  areturn
      Line numbers:
        [pc: 0, line: 1027]
  
  // Method descriptor #619 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  // Stack: 3, Locals: 4
  public final java.lang.String get(java.lang.String arg0, java.lang.Object... arg1);
     0  aload_0 [this]
     1  invokevirtual com.motivewave.platform.sdk.study.Study.getInfo() : com.motivewave.platform.databean.StudyInfo [127]
     4  ifnonnull 9
     7  aconst_null
     8  areturn
     9  aload_0 [this]
    10  invokevirtual com.motivewave.platform.sdk.study.Study.getInfo() : com.motivewave.platform.databean.StudyInfo [127]
    13  aload_1 [arg0]
    14  aload_2 [arg1]
    15  invokevirtual com.motivewave.platform.databean.StudyInfo.get(java.lang.String, java.lang.Object[]) : java.lang.String [617]
    18  areturn
    19  astore_3
    20  aload_1 [arg0]
    21  areturn
      Exception Table:
        [pc: 9, pc: 18] -> 19 when : java.lang.Exception
      Line numbers:
        [pc: 0, line: 1038]
        [pc: 9, line: 1040]
        [pc: 19, line: 1042]
        [pc: 20, line: 1043]
      Stack map table: number of frames 2
        [pc: 9, same]
        [pc: 19, same_locals_1_stack_item, stack: {java.lang.Exception}]
  
  // Method descriptor #628 (D)D
  // Stack: 4, Locals: 5
  public final double round(double arg0);
     0  aload_0 [this]
     1  getfield com.motivewave.platform.sdk.study.Study.dataCtx : com.motivewave.platform.sdk.common.DataContext [92]
     4  ifnull 19
     7  aload_0 [this]
     8  getfield com.motivewave.platform.sdk.study.Study.dataCtx : com.motivewave.platform.sdk.common.DataContext [92]
    11  invokeinterface com.motivewave.platform.sdk.common.DataContext.getInstrument() : com.motivewave.platform.sdk.common.Instrument [413] [nargs: 1]
    16  ifnonnull 21
    19  dload_1 [arg0]
    20  dreturn
    21  aload_0 [this]
    22  invokevirtual com.motivewave.platform.sdk.study.Study.isOverlay() : boolean [622]
    25  ifeq 49
    28  aload_0 [this]
    29  getfield com.motivewave.platform.sdk.study.Study.dataCtx : com.motivewave.platform.sdk.common.DataContext [92]
    32  invokeinterface com.motivewave.platform.sdk.common.DataContext.getInstrument() : com.motivewave.platform.sdk.common.Instrument [413] [nargs: 1]
    37  dload_1 [arg0]
    38  invokeinterface com.motivewave.platform.sdk.common.Instrument.round(double) : double [625] [nargs: 3]
    43  bipush 8
    45  invokestatic com.motivewave.platform.sdk.common.Util.round(double, int) : double [629]
    48  dreturn
    49  aload_0 [this]
    50  getfield com.motivewave.platform.sdk.study.Study.runtimeDescriptor : com.motivewave.platform.sdk.study.RuntimeDescriptor [26]
    53  ifnull 66
    56  aload_0 [this]
    57  getfield com.motivewave.platform.sdk.study.Study.runtimeDescriptor : com.motivewave.platform.sdk.study.RuntimeDescriptor [26]
    60  invokevirtual com.motivewave.platform.sdk.study.RuntimeDescriptor.getMinTick() : java.lang.Double [632]
    63  ifnonnull 68
    66  dload_1 [arg0]
    67  dreturn
    68  aload_0 [this]
    69  getfield com.motivewave.platform.sdk.study.Study.runtimeDescriptor : com.motivewave.platform.sdk.study.RuntimeDescriptor [26]
    72  invokevirtual com.motivewave.platform.sdk.study.RuntimeDescriptor.getMinTick() : java.lang.Double [632]
    75  invokevirtual java.lang.Double.doubleValue() : double [636]
    78  dstore_3
    79  dload_3
    80  dconst_0
    81  dcmpl
    82  ifne 87
    85  dload_1 [arg0]
    86  dreturn
    87  dload_1 [arg0]
    88  dload_3
    89  invokestatic com.motivewave.platform.sdk.common.Util.round(double, double) : double [642]
    92  bipush 8
    94  invokestatic com.motivewave.platform.sdk.common.Util.round(double, int) : double [629]
    97  dreturn
      Line numbers:
        [pc: 0, line: 1055]
        [pc: 21, line: 1057]
        [pc: 28, line: 1058]
        [pc: 49, line: 1060]
        [pc: 68, line: 1061]
        [pc: 79, line: 1062]
        [pc: 87, line: 1063]
      Stack map table: number of frames 6
        [pc: 19, same]
        [pc: 21, same]
        [pc: 49, same]
        [pc: 66, same]
        [pc: 68, same]
        [pc: 87, append: {double}]
  
  // Method descriptor #647 (D)Ljava/lang/String;
  // Stack: 4, Locals: 5
  public final java.lang.String format(double arg0);
      0  aload_0 [this]
      1  getfield com.motivewave.platform.sdk.study.Study.dataCtx : com.motivewave.platform.sdk.common.DataContext [92]
      4  ifnull 19
      7  aload_0 [this]
      8  getfield com.motivewave.platform.sdk.study.Study.dataCtx : com.motivewave.platform.sdk.common.DataContext [92]
     11  invokeinterface com.motivewave.platform.sdk.common.DataContext.getInstrument() : com.motivewave.platform.sdk.common.Instrument [413] [nargs: 1]
     16  ifnonnull 26
     19  dload_1 [arg0]
     20  invokedynamic 3 makeConcatWithConstants(double) : java.lang.String [645]
     25  areturn
     26  aload_0 [this]
     27  invokevirtual com.motivewave.platform.sdk.study.Study.isOverlay() : boolean [622]
     30  ifeq 49
     33  aload_0 [this]
     34  getfield com.motivewave.platform.sdk.study.Study.dataCtx : com.motivewave.platform.sdk.common.DataContext [92]
     37  invokeinterface com.motivewave.platform.sdk.common.DataContext.getInstrument() : com.motivewave.platform.sdk.common.Instrument [413] [nargs: 1]
     42  dload_1 [arg0]
     43  invokeinterface com.motivewave.platform.sdk.common.Instrument.format(double) : java.lang.String [648] [nargs: 3]
     48  areturn
     49  aload_0 [this]
     50  getfield com.motivewave.platform.sdk.study.Study.runtimeDescriptor : com.motivewave.platform.sdk.study.RuntimeDescriptor [26]
     53  ifnull 66
     56  aload_0 [this]
     57  getfield com.motivewave.platform.sdk.study.Study.runtimeDescriptor : com.motivewave.platform.sdk.study.RuntimeDescriptor [26]
     60  invokevirtual com.motivewave.platform.sdk.study.RuntimeDescriptor.getMinTick() : java.lang.Double [632]
     63  ifnonnull 73
     66  dload_1 [arg0]
     67  invokedynamic 3 makeConcatWithConstants(double) : java.lang.String [645]
     72  areturn
     73  aload_0 [this]
     74  getfield com.motivewave.platform.sdk.study.Study.runtimeDescriptor : com.motivewave.platform.sdk.study.RuntimeDescriptor [26]
     77  invokevirtual com.motivewave.platform.sdk.study.RuntimeDescriptor.getMinTick() : java.lang.Double [632]
     80  invokevirtual java.lang.Double.doubleValue() : double [636]
     83  dstore_3
     84  dload_3
     85  dconst_0
     86  dcmpl
     87  ifne 97
     90  dload_1 [arg0]
     91  invokedynamic 3 makeConcatWithConstants(double) : java.lang.String [645]
     96  areturn
     97  dload_1 [arg0]
     98  dload_3
     99  invokestatic com.motivewave.platform.sdk.common.Util.round(double, double) : double [642]
    102  bipush 8
    104  invokestatic com.motivewave.platform.sdk.common.Util.round(double, int) : double [629]
    107  invokedynamic 3 makeConcatWithConstants(double) : java.lang.String [645]
    112  areturn
      Line numbers:
        [pc: 0, line: 1071]
        [pc: 26, line: 1072]
        [pc: 33, line: 1073]
        [pc: 49, line: 1075]
        [pc: 73, line: 1076]
        [pc: 84, line: 1077]
        [pc: 97, line: 1078]
      Stack map table: number of frames 6
        [pc: 19, same]
        [pc: 26, same]
        [pc: 49, same]
        [pc: 66, same]
        [pc: 73, same]
        [pc: 97, append: {double}]
  
  // Method descriptor #456 (Ljava/lang/Object;Ljava/lang/Object;)Z
  // Stack: 5, Locals: 4
  public final boolean crossedAbove(java.lang.Object arg0, java.lang.Object arg1);
     0  aload_0 [this]
     1  getfield com.motivewave.platform.sdk.study.Study.dataCtx : com.motivewave.platform.sdk.common.DataContext [92]
     4  ifnonnull 9
     7  iconst_0
     8  ireturn
     9  aload_0 [this]
    10  getfield com.motivewave.platform.sdk.study.Study.dataCtx : com.motivewave.platform.sdk.common.DataContext [92]
    13  invokeinterface com.motivewave.platform.sdk.common.DataContext.getDataSeries() : com.motivewave.platform.sdk.common.DataSeries [121] [nargs: 1]
    18  astore_3
    19  aload_3
    20  ifnonnull 25
    23  iconst_0
    24  ireturn
    25  aload_0 [this]
    26  aload_3
    27  aload_3
    28  invokeinterface com.motivewave.platform.sdk.common.DataSeries.size() : int [192] [nargs: 1]
    33  iconst_1
    34  isub
    35  aload_1 [arg0]
    36  aload_2 [arg1]
    37  invokevirtual com.motivewave.platform.sdk.study.Study.crossedAbove(com.motivewave.platform.sdk.common.DataSeries, int, java.lang.Object, java.lang.Object) : boolean [651]
    40  ireturn
      Line numbers:
        [pc: 0, line: 1089]
        [pc: 9, line: 1090]
        [pc: 19, line: 1091]
        [pc: 25, line: 1092]
      Stack map table: number of frames 2
        [pc: 9, same]
        [pc: 25, append: {com.motivewave.platform.sdk.common.DataSeries}]
  
  // Method descriptor #654 (Lcom/motivewave/platform/sdk/common/DataSeries;ILjava/lang/Object;Ljava/lang/Object;)Z
  // Stack: 5, Locals: 8
  public final boolean crossedAbove(com.motivewave.platform.sdk.common.DataSeries arg0, int arg1, java.lang.Object arg2, java.lang.Object arg3);
      0  aload_1 [arg0]
      1  ifnonnull 6
      4  iconst_0
      5  ireturn
      6  iload_2 [arg1]
      7  ifgt 12
     10  iconst_0
     11  ireturn
     12  aload_3 [arg2]
     13  ifnull 21
     16  aload 4 [arg3]
     18  ifnonnull 23
     21  iconst_0
     22  ireturn
     23  aload_1 [arg0]
     24  iload_2 [arg1]
     25  aload_3 [arg2]
     26  invokeinterface com.motivewave.platform.sdk.common.DataSeries.getDouble(int, java.lang.Object) : java.lang.Double [655] [nargs: 3]
     31  astore 5
     33  aload_1 [arg0]
     34  iload_2 [arg1]
     35  aload 4 [arg3]
     37  invokeinterface com.motivewave.platform.sdk.common.DataSeries.getDouble(int, java.lang.Object) : java.lang.Double [655] [nargs: 3]
     42  astore 6
     44  aload 5
     46  ifnull 54
     49  aload 6
     51  ifnonnull 56
     54  iconst_0
     55  ireturn
     56  aload_0 [this]
     57  aload 5
     59  invokevirtual java.lang.Double.doubleValue() : double [636]
     62  invokevirtual com.motivewave.platform.sdk.study.Study.round2(double) : double [659]
     65  aload_0 [this]
     66  aload 6
     68  invokevirtual java.lang.Double.doubleValue() : double [636]
     71  invokevirtual com.motivewave.platform.sdk.study.Study.round2(double) : double [659]
     74  dcmpg
     75  ifgt 80
     78  iconst_0
     79  ireturn
     80  aload_0 [this]
     81  aload_1 [arg0]
     82  iload_2 [arg1]
     83  iconst_1
     84  isub
     85  aload_3 [arg2]
     86  aload 4 [arg3]
     88  invokevirtual com.motivewave.platform.sdk.study.Study.getNonEqualPair(com.motivewave.platform.sdk.common.DataSeries, int, java.lang.Object, java.lang.Object) : double[] [662]
     91  astore 7
     93  aload 7
     95  ifnonnull 100
     98  iconst_0
     99  ireturn
    100  aload 7
    102  iconst_0
    103  daload
    104  aload 7
    106  iconst_1
    107  daload
    108  dcmpg
    109  ifge 116
    112  iconst_1
    113  goto 117
    116  iconst_0
    117  ireturn
      Line numbers:
        [pc: 0, line: 1105]
        [pc: 6, line: 1106]
        [pc: 12, line: 1107]
        [pc: 23, line: 1108]
        [pc: 33, line: 1109]
        [pc: 44, line: 1110]
        [pc: 56, line: 1111]
        [pc: 80, line: 1113]
        [pc: 93, line: 1114]
        [pc: 100, line: 1116]
      Stack map table: number of frames 10
        [pc: 6, same]
        [pc: 12, same]
        [pc: 21, same]
        [pc: 23, same]
        [pc: 54, append: {java.lang.Double, java.lang.Double}]
        [pc: 56, same]
        [pc: 80, same]
        [pc: 100, append: {double[]}]
        [pc: 116, same]
        [pc: 117, same_locals_1_stack_item, stack: {int}]
  
  // Method descriptor #895 (Ljava/lang/Object;D)Z
  // Stack: 6, Locals: 5
  public final boolean crossedAbove(java.lang.Object arg0, double arg1);
     0  aload_0 [this]
     1  getfield com.motivewave.platform.sdk.study.Study.dataCtx : com.motivewave.platform.sdk.common.DataContext [92]
     4  ifnonnull 9
     7  iconst_0
     8  ireturn
     9  aload_0 [this]
    10  getfield com.motivewave.platform.sdk.study.Study.dataCtx : com.motivewave.platform.sdk.common.DataContext [92]
    13  invokeinterface com.motivewave.platform.sdk.common.DataContext.getDataSeries() : com.motivewave.platform.sdk.common.DataSeries [121] [nargs: 1]
    18  astore 4
    20  aload 4
    22  ifnonnull 27
    25  iconst_0
    26  ireturn
    27  aload_0 [this]
    28  aload 4
    30  aload 4
    32  invokeinterface com.motivewave.platform.sdk.common.DataSeries.size() : int [192] [nargs: 1]
    37  iconst_1
    38  isub
    39  aload_1 [arg0]
    40  dload_2 [arg1]
    41  invokevirtual com.motivewave.platform.sdk.study.Study.crossedAbove(com.motivewave.platform.sdk.common.DataSeries, int, java.lang.Object, double) : boolean [666]
    44  ireturn
      Line numbers:
        [pc: 0, line: 1125]
        [pc: 9, line: 1126]
        [pc: 20, line: 1127]
        [pc: 27, line: 1128]
      Stack map table: number of frames 2
        [pc: 9, same]
        [pc: 27, append: {com.motivewave.platform.sdk.common.DataSeries}]
  
  // Method descriptor #668 (Lcom/motivewave/platform/sdk/common/DataSeries;ILjava/lang/Object;D)Z
  // Stack: 6, Locals: 8
  public final boolean crossedAbove(com.motivewave.platform.sdk.common.DataSeries arg0, int arg1, java.lang.Object arg2, double arg3);
     0  aload_1 [arg0]
     1  ifnonnull 6
     4  iconst_0
     5  ireturn
     6  iload_2 [arg1]
     7  ifgt 12
    10  iconst_0
    11  ireturn
    12  aload_3 [arg2]
    13  ifnonnull 18
    16  iconst_0
    17  ireturn
    18  aload_1 [arg0]
    19  iload_2 [arg1]
    20  aload_3 [arg2]
    21  invokeinterface com.motivewave.platform.sdk.common.DataSeries.getDouble(int, java.lang.Object) : java.lang.Double [655] [nargs: 3]
    26  astore 6
    28  aload 6
    30  ifnonnull 35
    33  iconst_0
    34  ireturn
    35  aload_0 [this]
    36  aload 6
    38  invokevirtual java.lang.Double.doubleValue() : double [636]
    41  invokevirtual com.motivewave.platform.sdk.study.Study.round2(double) : double [659]
    44  aload_0 [this]
    45  dload 4 [arg3]
    47  invokevirtual com.motivewave.platform.sdk.study.Study.round2(double) : double [659]
    50  dcmpg
    51  ifgt 56
    54  iconst_0
    55  ireturn
    56  aload_0 [this]
    57  aload_1 [arg0]
    58  iload_2 [arg1]
    59  iconst_1
    60  isub
    61  aload_3 [arg2]
    62  dload 4 [arg3]
    64  invokevirtual com.motivewave.platform.sdk.study.Study.getNonEqualValue(com.motivewave.platform.sdk.common.DataSeries, int, java.lang.Object, double) : java.lang.Double [669]
    67  astore 7
    69  aload 7
    71  ifnonnull 76
    74  iconst_0
    75  ireturn
    76  aload 7
    78  invokevirtual java.lang.Double.doubleValue() : double [636]
    81  dload 4 [arg3]
    83  dcmpg
    84  ifge 91
    87  iconst_1
    88  goto 92
    91  iconst_0
    92  ireturn
      Line numbers:
        [pc: 0, line: 1138]
        [pc: 6, line: 1139]
        [pc: 12, line: 1140]
        [pc: 18, line: 1141]
        [pc: 28, line: 1142]
        [pc: 35, line: 1143]
        [pc: 56, line: 1144]
        [pc: 69, line: 1145]
        [pc: 76, line: 1146]
      Stack map table: number of frames 8
        [pc: 6, same]
        [pc: 12, same]
        [pc: 18, same]
        [pc: 35, append: {java.lang.Double}]
        [pc: 56, same]
        [pc: 76, append: {java.lang.Double}]
        [pc: 91, same]
        [pc: 92, same_locals_1_stack_item, stack: {int}]
  
  // Method descriptor #456 (Ljava/lang/Object;Ljava/lang/Object;)Z
  // Stack: 5, Locals: 4
  public final boolean crossedBelow(java.lang.Object arg0, java.lang.Object arg1);
     0  aload_0 [this]
     1  getfield com.motivewave.platform.sdk.study.Study.dataCtx : com.motivewave.platform.sdk.common.DataContext [92]
     4  ifnonnull 9
     7  iconst_0
     8  ireturn
     9  aload_0 [this]
    10  getfield com.motivewave.platform.sdk.study.Study.dataCtx : com.motivewave.platform.sdk.common.DataContext [92]
    13  invokeinterface com.motivewave.platform.sdk.common.DataContext.getDataSeries() : com.motivewave.platform.sdk.common.DataSeries [121] [nargs: 1]
    18  astore_3
    19  aload_3
    20  ifnonnull 25
    23  iconst_0
    24  ireturn
    25  aload_0 [this]
    26  aload_3
    27  aload_3
    28  invokeinterface com.motivewave.platform.sdk.common.DataSeries.size() : int [192] [nargs: 1]
    33  iconst_1
    34  isub
    35  aload_1 [arg0]
    36  aload_2 [arg1]
    37  invokevirtual com.motivewave.platform.sdk.study.Study.crossedBelow(com.motivewave.platform.sdk.common.DataSeries, int, java.lang.Object, java.lang.Object) : boolean [673]
    40  ireturn
      Line numbers:
        [pc: 0, line: 1157]
        [pc: 9, line: 1158]
        [pc: 19, line: 1159]
        [pc: 25, line: 1160]
      Stack map table: number of frames 2
        [pc: 9, same]
        [pc: 25, append: {com.motivewave.platform.sdk.common.DataSeries}]
  
  // Method descriptor #654 (Lcom/motivewave/platform/sdk/common/DataSeries;ILjava/lang/Object;Ljava/lang/Object;)Z
  // Stack: 5, Locals: 8
  public final boolean crossedBelow(com.motivewave.platform.sdk.common.DataSeries arg0, int arg1, java.lang.Object arg2, java.lang.Object arg3);
      0  aload_1 [arg0]
      1  ifnonnull 6
      4  iconst_0
      5  ireturn
      6  iload_2 [arg1]
      7  ifgt 12
     10  iconst_0
     11  ireturn
     12  aload_3 [arg2]
     13  ifnull 21
     16  aload 4 [arg3]
     18  ifnonnull 23
     21  iconst_0
     22  ireturn
     23  aload_1 [arg0]
     24  iload_2 [arg1]
     25  aload_3 [arg2]
     26  invokeinterface com.motivewave.platform.sdk.common.DataSeries.getDouble(int, java.lang.Object) : java.lang.Double [655] [nargs: 3]
     31  astore 5
     33  aload_1 [arg0]
     34  iload_2 [arg1]
     35  aload 4 [arg3]
     37  invokeinterface com.motivewave.platform.sdk.common.DataSeries.getDouble(int, java.lang.Object) : java.lang.Double [655] [nargs: 3]
     42  astore 6
     44  aload 5
     46  ifnull 54
     49  aload 6
     51  ifnonnull 56
     54  iconst_0
     55  ireturn
     56  aload_0 [this]
     57  aload 5
     59  invokevirtual java.lang.Double.doubleValue() : double [636]
     62  invokevirtual com.motivewave.platform.sdk.study.Study.round2(double) : double [659]
     65  aload_0 [this]
     66  aload 6
     68  invokevirtual java.lang.Double.doubleValue() : double [636]
     71  invokevirtual com.motivewave.platform.sdk.study.Study.round2(double) : double [659]
     74  dcmpl
     75  iflt 80
     78  iconst_0
     79  ireturn
     80  aload_0 [this]
     81  aload_1 [arg0]
     82  iload_2 [arg1]
     83  iconst_1
     84  isub
     85  aload_3 [arg2]
     86  aload 4 [arg3]
     88  invokevirtual com.motivewave.platform.sdk.study.Study.getNonEqualPair(com.motivewave.platform.sdk.common.DataSeries, int, java.lang.Object, java.lang.Object) : double[] [662]
     91  astore 7
     93  aload 7
     95  ifnonnull 100
     98  iconst_0
     99  ireturn
    100  aload 7
    102  iconst_0
    103  daload
    104  aload 7
    106  iconst_1
    107  daload
    108  dcmpl
    109  ifle 116
    112  iconst_1
    113  goto 117
    116  iconst_0
    117  ireturn
      Line numbers:
        [pc: 0, line: 1173]
        [pc: 6, line: 1174]
        [pc: 12, line: 1175]
        [pc: 23, line: 1176]
        [pc: 33, line: 1177]
        [pc: 44, line: 1178]
        [pc: 56, line: 1179]
        [pc: 80, line: 1181]
        [pc: 93, line: 1182]
        [pc: 100, line: 1184]
      Stack map table: number of frames 10
        [pc: 6, same]
        [pc: 12, same]
        [pc: 21, same]
        [pc: 23, same]
        [pc: 54, append: {java.lang.Double, java.lang.Double}]
        [pc: 56, same]
        [pc: 80, same]
        [pc: 100, append: {double[]}]
        [pc: 116, same]
        [pc: 117, same_locals_1_stack_item, stack: {int}]
  
  // Method descriptor #895 (Ljava/lang/Object;D)Z
  // Stack: 6, Locals: 5
  public final boolean crossedBelow(java.lang.Object arg0, double arg1);
     0  aload_0 [this]
     1  getfield com.motivewave.platform.sdk.study.Study.dataCtx : com.motivewave.platform.sdk.common.DataContext [92]
     4  ifnonnull 9
     7  iconst_0
     8  ireturn
     9  aload_0 [this]
    10  getfield com.motivewave.platform.sdk.study.Study.dataCtx : com.motivewave.platform.sdk.common.DataContext [92]
    13  invokeinterface com.motivewave.platform.sdk.common.DataContext.getDataSeries() : com.motivewave.platform.sdk.common.DataSeries [121] [nargs: 1]
    18  astore 4
    20  aload 4
    22  ifnonnull 27
    25  iconst_0
    26  ireturn
    27  aload_0 [this]
    28  aload 4
    30  aload 4
    32  invokeinterface com.motivewave.platform.sdk.common.DataSeries.size() : int [192] [nargs: 1]
    37  iconst_1
    38  isub
    39  aload_1 [arg0]
    40  dload_2 [arg1]
    41  invokevirtual com.motivewave.platform.sdk.study.Study.crossedBelow(com.motivewave.platform.sdk.common.DataSeries, int, java.lang.Object, double) : boolean [676]
    44  ireturn
      Line numbers:
        [pc: 0, line: 1193]
        [pc: 9, line: 1194]
        [pc: 20, line: 1195]
        [pc: 27, line: 1196]
      Stack map table: number of frames 2
        [pc: 9, same]
        [pc: 27, append: {com.motivewave.platform.sdk.common.DataSeries}]
  
  // Method descriptor #668 (Lcom/motivewave/platform/sdk/common/DataSeries;ILjava/lang/Object;D)Z
  // Stack: 6, Locals: 8
  public final boolean crossedBelow(com.motivewave.platform.sdk.common.DataSeries arg0, int arg1, java.lang.Object arg2, double arg3);
     0  aload_1 [arg0]
     1  ifnonnull 6
     4  iconst_0
     5  ireturn
     6  iload_2 [arg1]
     7  ifgt 12
    10  iconst_0
    11  ireturn
    12  aload_3 [arg2]
    13  ifnonnull 18
    16  iconst_0
    17  ireturn
    18  aload_1 [arg0]
    19  iload_2 [arg1]
    20  aload_3 [arg2]
    21  invokeinterface com.motivewave.platform.sdk.common.DataSeries.getDouble(int, java.lang.Object) : java.lang.Double [655] [nargs: 3]
    26  astore 6
    28  aload 6
    30  ifnonnull 35
    33  iconst_0
    34  ireturn
    35  aload_0 [this]
    36  aload 6
    38  invokevirtual java.lang.Double.doubleValue() : double [636]
    41  invokevirtual com.motivewave.platform.sdk.study.Study.round2(double) : double [659]
    44  aload_0 [this]
    45  dload 4 [arg3]
    47  invokevirtual com.motivewave.platform.sdk.study.Study.round2(double) : double [659]
    50  dcmpl
    51  iflt 56
    54  iconst_0
    55  ireturn
    56  aload_0 [this]
    57  aload_1 [arg0]
    58  iload_2 [arg1]
    59  iconst_1
    60  isub
    61  aload_3 [arg2]
    62  dload 4 [arg3]
    64  invokevirtual com.motivewave.platform.sdk.study.Study.getNonEqualValue(com.motivewave.platform.sdk.common.DataSeries, int, java.lang.Object, double) : java.lang.Double [669]
    67  astore 7
    69  aload 7
    71  ifnonnull 76
    74  iconst_0
    75  ireturn
    76  aload 7
    78  invokevirtual java.lang.Double.doubleValue() : double [636]
    81  dload 4 [arg3]
    83  dcmpl
    84  ifle 91
    87  iconst_1
    88  goto 92
    91  iconst_0
    92  ireturn
      Line numbers:
        [pc: 0, line: 1206]
        [pc: 6, line: 1207]
        [pc: 12, line: 1208]
        [pc: 18, line: 1209]
        [pc: 28, line: 1210]
        [pc: 35, line: 1211]
        [pc: 56, line: 1213]
        [pc: 69, line: 1214]
        [pc: 76, line: 1216]
      Stack map table: number of frames 8
        [pc: 6, same]
        [pc: 12, same]
        [pc: 18, same]
        [pc: 35, append: {java.lang.Double}]
        [pc: 56, same]
        [pc: 76, append: {java.lang.Double}]
        [pc: 91, same]
        [pc: 92, same_locals_1_stack_item, stack: {int}]
  
  // Method descriptor #665 (Lcom/motivewave/platform/sdk/common/DataSeries;ILjava/lang/Object;Ljava/lang/Object;)[D
  // Stack: 5, Locals: 7
  private double[] getNonEqualPair(com.motivewave.platform.sdk.common.DataSeries arg0, int arg1, java.lang.Object arg2, java.lang.Object arg3);
      0  iload_2 [arg1]
      1  ifge 6
      4  aconst_null
      5  areturn
      6  aconst_null
      7  astore 5
      9  aconst_null
     10  astore 6
     12  iload_2 [arg1]
     13  iflt 114
     16  aload_1 [arg0]
     17  iload_2 [arg1]
     18  aload_3 [arg2]
     19  invokeinterface com.motivewave.platform.sdk.common.DataSeries.getDouble(int, java.lang.Object) : java.lang.Double [655] [nargs: 3]
     24  astore 5
     26  aload 5
     28  ifnonnull 37
     31  iinc 2 -1 [arg1]
     34  goto 12
     37  aload_1 [arg0]
     38  iload_2 [arg1]
     39  aload 4 [arg3]
     41  invokeinterface com.motivewave.platform.sdk.common.DataSeries.getDouble(int, java.lang.Object) : java.lang.Double [655] [nargs: 3]
     46  astore 6
     48  aload 6
     50  ifnonnull 59
     53  iinc 2 -1 [arg1]
     56  goto 12
     59  aload_0 [this]
     60  aload 5
     62  invokevirtual java.lang.Double.doubleValue() : double [636]
     65  invokevirtual com.motivewave.platform.sdk.study.Study.round2(double) : double [659]
     68  invokestatic java.lang.Double.valueOf(double) : java.lang.Double [678]
     71  astore 5
     73  aload_0 [this]
     74  aload 6
     76  invokevirtual java.lang.Double.doubleValue() : double [636]
     79  invokevirtual com.motivewave.platform.sdk.study.Study.round2(double) : double [659]
     82  invokestatic java.lang.Double.valueOf(double) : java.lang.Double [678]
     85  astore 6
     87  aload 5
     89  invokevirtual java.lang.Double.doubleValue() : double [636]
     92  aload 6
     94  invokevirtual java.lang.Double.doubleValue() : double [636]
     97  dsub
     98  invokestatic java.lang.Math.abs(double) : double [681]
    101  ldc2_w <Double 1.0E-9> [686]
    104  dcmpg
    105  ifge 114
    108  iinc 2 -1 [arg1]
    111  goto 12
    114  iload_2 [arg1]
    115  ifge 120
    118  aconst_null
    119  areturn
    120  aload 5
    122  ifnull 130
    125  aload 6
    127  ifnonnull 132
    130  aconst_null
    131  areturn
    132  iconst_2
    133  newarray double [7]
    135  dup
    136  iconst_0
    137  aload 5
    139  invokevirtual java.lang.Double.doubleValue() : double [636]
    142  dastore
    143  dup
    144  iconst_1
    145  aload 6
    147  invokevirtual java.lang.Double.doubleValue() : double [636]
    150  dastore
    151  areturn
      Line numbers:
        [pc: 0, line: 1220]
        [pc: 6, line: 1221]
        [pc: 12, line: 1222]
        [pc: 16, line: 1223]
        [pc: 26, line: 1224]
        [pc: 31, line: 1225]
        [pc: 34, line: 1226]
        [pc: 37, line: 1228]
        [pc: 48, line: 1229]
        [pc: 53, line: 1230]
        [pc: 56, line: 1231]
        [pc: 59, line: 1234]
        [pc: 73, line: 1235]
        [pc: 87, line: 1237]
        [pc: 108, line: 1238]
        [pc: 111, line: 1239]
        [pc: 114, line: 1245]
        [pc: 120, line: 1246]
        [pc: 132, line: 1248]
      Stack map table: number of frames 8
        [pc: 6, same]
        [pc: 12, append: {java.lang.Double, java.lang.Double}]
        [pc: 37, same]
        [pc: 59, same]
        [pc: 114, same]
        [pc: 120, same]
        [pc: 130, same]
        [pc: 132, same]
  
  // Method descriptor #672 (Lcom/motivewave/platform/sdk/common/DataSeries;ILjava/lang/Object;D)Ljava/lang/Double;
  // Stack: 4, Locals: 8
  private java.lang.Double getNonEqualValue(com.motivewave.platform.sdk.common.DataSeries arg0, int arg1, java.lang.Object arg2, double arg3);
     0  iconst_0
     1  istore 6
     3  iload_2 [arg1]
     4  iflt 96
     7  iinc 6 1
    10  iload 6
    12  sipush 200
    15  if_icmple 20
    18  aconst_null
    19  areturn
    20  iload_2 [arg1]
    21  ifge 26
    24  aconst_null
    25  areturn
    26  aload_1 [arg0]
    27  iload_2 [arg1]
    28  aload_3 [arg2]
    29  invokeinterface com.motivewave.platform.sdk.common.DataSeries.getDouble(int, java.lang.Object) : java.lang.Double [655] [nargs: 3]
    34  astore 7
    36  aload 7
    38  ifnonnull 47
    41  iinc 2 -1 [arg1]
    44  goto 3
    47  aload_0 [this]
    48  aload 7
    50  invokevirtual java.lang.Double.doubleValue() : double [636]
    53  invokevirtual com.motivewave.platform.sdk.study.Study.round2(double) : double [659]
    56  invokestatic java.lang.Double.valueOf(double) : java.lang.Double [678]
    59  astore 7
    61  aload_0 [this]
    62  dload 4 [arg3]
    64  invokevirtual com.motivewave.platform.sdk.study.Study.round2(double) : double [659]
    67  dstore 4 [arg3]
    69  aload 7
    71  invokevirtual java.lang.Double.doubleValue() : double [636]
    74  dload 4 [arg3]
    76  dsub
    77  invokestatic java.lang.Math.abs(double) : double [681]
    80  ldc2_w <Double 1.0E-9> [686]
    83  dcmpg
    84  ifge 93
    87  iinc 2 -1 [arg1]
    90  goto 3
    93  aload 7
    95  areturn
    96  aconst_null
    97  areturn
      Line numbers:
        [pc: 0, line: 1252]
        [pc: 3, line: 1253]
        [pc: 7, line: 1254]
        [pc: 10, line: 1255]
        [pc: 20, line: 1257]
        [pc: 26, line: 1258]
        [pc: 36, line: 1259]
        [pc: 41, line: 1260]
        [pc: 44, line: 1261]
        [pc: 47, line: 1264]
        [pc: 61, line: 1265]
        [pc: 69, line: 1266]
        [pc: 87, line: 1267]
        [pc: 90, line: 1268]
        [pc: 93, line: 1270]
        [pc: 96, line: 1272]
      Stack map table: number of frames 6
        [pc: 3, append: {int}]
        [pc: 20, same]
        [pc: 26, same]
        [pc: 47, append: {java.lang.Double}]
        [pc: 93, same]
        [pc: 96, chop 1 local(s)]
  
  // Method descriptor #628 (D)D
  // Stack: 4, Locals: 5
  private final double round2(double arg0);
      0  aload_0 [this]
      1  getfield com.motivewave.platform.sdk.study.Study.dataCtx : com.motivewave.platform.sdk.common.DataContext [92]
      4  ifnull 19
      7  aload_0 [this]
      8  getfield com.motivewave.platform.sdk.study.Study.dataCtx : com.motivewave.platform.sdk.common.DataContext [92]
     11  invokeinterface com.motivewave.platform.sdk.common.DataContext.getInstrument() : com.motivewave.platform.sdk.common.Instrument [413] [nargs: 1]
     16  ifnonnull 21
     19  dload_1 [arg0]
     20  dreturn
     21  aload_0 [this]
     22  invokevirtual com.motivewave.platform.sdk.study.Study.isOverlay() : boolean [622]
     25  ifeq 58
     28  aload_0 [this]
     29  getfield com.motivewave.platform.sdk.study.Study.dataCtx : com.motivewave.platform.sdk.common.DataContext [92]
     32  invokeinterface com.motivewave.platform.sdk.common.DataContext.getInstrument() : com.motivewave.platform.sdk.common.Instrument [413] [nargs: 1]
     37  invokeinterface com.motivewave.platform.sdk.common.Instrument.getTickSize() : double [688] [nargs: 1]
     42  ldc2_w <Double 10.0> [691]
     45  ddiv
     46  dstore_3
     47  dload_1 [arg0]
     48  dload_3
     49  invokestatic com.motivewave.platform.sdk.common.Util.round(double, double) : double [642]
     52  bipush 8
     54  invokestatic com.motivewave.platform.sdk.common.Util.round(double, int) : double [629]
     57  dreturn
     58  aload_0 [this]
     59  getfield com.motivewave.platform.sdk.study.Study.runtimeDescriptor : com.motivewave.platform.sdk.study.RuntimeDescriptor [26]
     62  ifnull 75
     65  aload_0 [this]
     66  getfield com.motivewave.platform.sdk.study.Study.runtimeDescriptor : com.motivewave.platform.sdk.study.RuntimeDescriptor [26]
     69  invokevirtual com.motivewave.platform.sdk.study.RuntimeDescriptor.getMinTick() : java.lang.Double [632]
     72  ifnonnull 77
     75  dload_1 [arg0]
     76  dreturn
     77  aload_0 [this]
     78  getfield com.motivewave.platform.sdk.study.Study.runtimeDescriptor : com.motivewave.platform.sdk.study.RuntimeDescriptor [26]
     81  invokevirtual com.motivewave.platform.sdk.study.RuntimeDescriptor.getMinTick() : java.lang.Double [632]
     84  invokevirtual java.lang.Double.doubleValue() : double [636]
     87  dstore_3
     88  dload_3
     89  dconst_0
     90  dcmpl
     91  ifne 96
     94  dload_1 [arg0]
     95  dreturn
     96  dload_1 [arg0]
     97  dload_3
     98  invokestatic com.motivewave.platform.sdk.common.Util.round(double, double) : double [642]
    101  bipush 8
    103  invokestatic com.motivewave.platform.sdk.common.Util.round(double, int) : double [629]
    106  dreturn
      Line numbers:
        [pc: 0, line: 1276]
        [pc: 21, line: 1277]
        [pc: 28, line: 1278]
        [pc: 47, line: 1279]
        [pc: 58, line: 1282]
        [pc: 77, line: 1283]
        [pc: 88, line: 1284]
        [pc: 96, line: 1285]
      Stack map table: number of frames 6
        [pc: 19, same]
        [pc: 21, same]
        [pc: 58, same]
        [pc: 75, same]
        [pc: 77, same]
        [pc: 96, append: {double}]
  
  // Method descriptor #347 (Ljava/lang/String;)V
  // Stack: 3, Locals: 2
  public final void debug(java.lang.String arg0);
    0  aload_0 [this]
    1  getstatic com.motivewave.platform.common.Enums$LogType.DEBUG : com.motivewave.platform.common.Enums.LogType [693]
    4  aload_1 [arg0]
    5  invokestatic com.motivewave.platform.ui.draw.figure.study.StudyLog.log(com.motivewave.platform.sdk.study.Study, com.motivewave.platform.common.Enums$LogType, java.lang.String) : void [699]
    8  return
      Line numbers:
        [pc: 0, line: 1294]
        [pc: 8, line: 1295]
  
  // Method descriptor #347 (Ljava/lang/String;)V
  // Stack: 3, Locals: 2
  public final void info(java.lang.String arg0);
    0  aload_0 [this]
    1  getstatic com.motivewave.platform.common.Enums$LogType.INFO : com.motivewave.platform.common.Enums.LogType [705]
    4  aload_1 [arg0]
    5  invokestatic com.motivewave.platform.ui.draw.figure.study.StudyLog.log(com.motivewave.platform.sdk.study.Study, com.motivewave.platform.common.Enums$LogType, java.lang.String) : void [699]
    8  return
      Line numbers:
        [pc: 0, line: 1300]
        [pc: 8, line: 1301]
  
  // Method descriptor #347 (Ljava/lang/String;)V
  // Stack: 3, Locals: 2
  public final void warning(java.lang.String arg0);
    0  aload_0 [this]
    1  getstatic com.motivewave.platform.common.Enums$LogType.WARNING : com.motivewave.platform.common.Enums.LogType [708]
    4  aload_1 [arg0]
    5  invokestatic com.motivewave.platform.ui.draw.figure.study.StudyLog.log(com.motivewave.platform.sdk.study.Study, com.motivewave.platform.common.Enums$LogType, java.lang.String) : void [699]
    8  return
      Line numbers:
        [pc: 0, line: 1306]
        [pc: 8, line: 1307]
  
  // Method descriptor #347 (Ljava/lang/String;)V
  // Stack: 3, Locals: 2
  public final void error(java.lang.String arg0);
    0  aload_0 [this]
    1  getstatic com.motivewave.platform.common.Enums$LogType.ERROR : com.motivewave.platform.common.Enums.LogType [711]
    4  aload_1 [arg0]
    5  invokestatic com.motivewave.platform.ui.draw.figure.study.StudyLog.log(com.motivewave.platform.sdk.study.Study, com.motivewave.platform.common.Enums$LogType, java.lang.String) : void [699]
    8  return
      Line numbers:
        [pc: 0, line: 1312]
        [pc: 8, line: 1313]
  
  // Method descriptor #717 (Ljava/beans/PropertyChangeListener;)V
  // Stack: 2, Locals: 4
  public void addPropertyChangeListener(java.beans.PropertyChangeListener arg0);
     0  aload_1 [arg0]
     1  ifnonnull 5
     4  return
     5  aload_0 [this]
     6  getfield com.motivewave.platform.sdk.study.Study.weakSupport : com.motivewave.common.util.WeakPropertyChangeSupport [104]
     9  dup
    10  astore_2
    11  monitorenter
    12  aload_0 [this]
    13  getfield com.motivewave.platform.sdk.study.Study.weakSupport : com.motivewave.common.util.WeakPropertyChangeSupport [104]
    16  aload_1 [arg0]
    17  invokevirtual com.motivewave.common.util.WeakPropertyChangeSupport.removePropertyChangeListener(java.beans.PropertyChangeListener) : void [714]
    20  aload_0 [this]
    21  getfield com.motivewave.platform.sdk.study.Study.weakSupport : com.motivewave.common.util.WeakPropertyChangeSupport [104]
    24  aload_1 [arg0]
    25  invokevirtual com.motivewave.common.util.WeakPropertyChangeSupport.addPropertyChangeListener(java.beans.PropertyChangeListener) : void [718]
    28  aload_2
    29  monitorexit
    30  goto 38
    33  astore_3
    34  aload_2
    35  monitorexit
    36  aload_3
    37  athrow
    38  return
      Exception Table:
        [pc: 12, pc: 30] -> 33 when : any
        [pc: 33, pc: 36] -> 33 when : any
      Line numbers:
        [pc: 0, line: 1321]
        [pc: 5, line: 1322]
        [pc: 12, line: 1323]
        [pc: 20, line: 1324]
        [pc: 28, line: 1325]
        [pc: 38, line: 1326]
      Stack map table: number of frames 3
        [pc: 5, same]
        [pc: 33, full, stack: {java.lang.Throwable}, locals: {com.motivewave.platform.sdk.study.Study, java.beans.PropertyChangeListener, java.lang.Object}]
        [pc: 38, chop 1 local(s)]
  
  // Method descriptor #723 (Ljava/lang/String;Ljava/beans/PropertyChangeListener;)V
  // Stack: 3, Locals: 5
  public void addPropertyChangeListener(java.lang.String arg0, java.beans.PropertyChangeListener arg1);
     0  aload_2 [arg1]
     1  ifnonnull 5
     4  return
     5  aload_0 [this]
     6  getfield com.motivewave.platform.sdk.study.Study.weakSupport : com.motivewave.common.util.WeakPropertyChangeSupport [104]
     9  dup
    10  astore_3
    11  monitorenter
    12  aload_0 [this]
    13  getfield com.motivewave.platform.sdk.study.Study.weakSupport : com.motivewave.common.util.WeakPropertyChangeSupport [104]
    16  aload_1 [arg0]
    17  aload_2 [arg1]
    18  invokevirtual com.motivewave.common.util.WeakPropertyChangeSupport.removePropertyChangeListener(java.lang.String, java.beans.PropertyChangeListener) : void [721]
    21  aload_0 [this]
    22  getfield com.motivewave.platform.sdk.study.Study.weakSupport : com.motivewave.common.util.WeakPropertyChangeSupport [104]
    25  aload_1 [arg0]
    26  aload_2 [arg1]
    27  invokevirtual com.motivewave.common.util.WeakPropertyChangeSupport.addPropertyChangeListener(java.lang.String, java.beans.PropertyChangeListener) : void [724]
    30  aload_3
    31  monitorexit
    32  goto 42
    35  astore 4
    37  aload_3
    38  monitorexit
    39  aload 4
    41  athrow
    42  return
      Exception Table:
        [pc: 12, pc: 32] -> 35 when : any
        [pc: 35, pc: 39] -> 35 when : any
      Line numbers:
        [pc: 0, line: 1332]
        [pc: 5, line: 1333]
        [pc: 12, line: 1334]
        [pc: 21, line: 1335]
        [pc: 30, line: 1336]
        [pc: 42, line: 1337]
      Stack map table: number of frames 3
        [pc: 5, same]
        [pc: 35, full, stack: {java.lang.Throwable}, locals: {com.motivewave.platform.sdk.study.Study, java.lang.String, java.beans.PropertyChangeListener, java.lang.Object}]
        [pc: 42, chop 1 local(s)]
  
  // Method descriptor #717 (Ljava/beans/PropertyChangeListener;)V
  // Stack: 2, Locals: 2
  public void removePropertyChangeListener(java.beans.PropertyChangeListener arg0);
    0  aload_0 [this]
    1  getfield com.motivewave.platform.sdk.study.Study.weakSupport : com.motivewave.common.util.WeakPropertyChangeSupport [104]
    4  aload_1 [arg0]
    5  invokevirtual com.motivewave.common.util.WeakPropertyChangeSupport.removePropertyChangeListener(java.beans.PropertyChangeListener) : void [714]
    8  return
      Line numbers:
        [pc: 0, line: 1342]
        [pc: 8, line: 1343]
  
  // Method descriptor #723 (Ljava/lang/String;Ljava/beans/PropertyChangeListener;)V
  // Stack: 3, Locals: 3
  public void removePropertyChangeListener(java.lang.String arg0, java.beans.PropertyChangeListener arg1);
     0  aload_0 [this]
     1  getfield com.motivewave.platform.sdk.study.Study.weakSupport : com.motivewave.common.util.WeakPropertyChangeSupport [104]
     4  aload_1 [arg0]
     5  aload_2 [arg1]
     6  invokevirtual com.motivewave.common.util.WeakPropertyChangeSupport.removePropertyChangeListener(java.lang.String, java.beans.PropertyChangeListener) : void [721]
     9  return
      Line numbers:
        [pc: 0, line: 1349]
        [pc: 9, line: 1350]
  
  // Method descriptor #253 (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
  // Stack: 4, Locals: 5
  protected void firePropertyChange(java.lang.String arg0, java.lang.Object arg1, java.lang.Object arg2);
     0  aload_0 [this]
     1  getfield com.motivewave.platform.sdk.study.Study.weakSupport : com.motivewave.common.util.WeakPropertyChangeSupport [104]
     4  ifnonnull 8
     7  return
     8  aload_0 [this]
     9  getfield com.motivewave.platform.sdk.study.Study.weakSupport : com.motivewave.common.util.WeakPropertyChangeSupport [104]
    12  aload_1 [arg0]
    13  aload_2 [arg1]
    14  aload_3 [arg2]
    15  invokevirtual com.motivewave.common.util.WeakPropertyChangeSupport.firePropertyChange(java.lang.String, java.lang.Object, java.lang.Object) : void [726]
    18  goto 28
    21  astore 4
    23  aload 4
    25  invokevirtual java.lang.Exception.printStackTrace() : void [727]
    28  return
      Exception Table:
        [pc: 0, pc: 7] -> 21 when : java.lang.Exception
        [pc: 8, pc: 18] -> 21 when : java.lang.Exception
      Line numbers:
        [pc: 0, line: 1358]
        [pc: 8, line: 1359]
        [pc: 18, line: 1363]
        [pc: 21, line: 1361]
        [pc: 23, line: 1362]
        [pc: 28, line: 1364]
      Stack map table: number of frames 3
        [pc: 8, same]
        [pc: 21, same_locals_1_stack_item, stack: {java.lang.Exception}]
        [pc: 28, same]
  
  // Method descriptor #6 ()V
  // Stack: 2, Locals: 1
  public void destroy();
     0  aload_0 [this]
     1  getfield com.motivewave.platform.sdk.study.Study.destroyed : boolean [57]
     4  ifeq 8
     7  return
     8  aload_0 [this]
     9  iconst_1
    10  putfield com.motivewave.platform.sdk.study.Study.destroyed : boolean [57]
    13  aload_0 [this]
    14  getfield com.motivewave.platform.sdk.study.Study.figureMap : java.util.Map [16]
    17  invokeinterface java.util.Map.clear() : void [229] [nargs: 1]
    22  aload_0 [this]
    23  getfield com.motivewave.platform.sdk.study.Study.weakSupport : com.motivewave.common.util.WeakPropertyChangeSupport [104]
    26  invokevirtual com.motivewave.common.util.WeakPropertyChangeSupport.removeAllListeners() : void [728]
    29  aload_0 [this]
    30  getfield com.motivewave.platform.sdk.study.Study.settings : com.motivewave.platform.sdk.common.Settings [265]
    33  instanceof com.motivewave.platform.ui.draw.figure.study.SettingsWrapper [731]
    36  ifeq 49
    39  aload_0 [this]
    40  getfield com.motivewave.platform.sdk.study.Study.settings : com.motivewave.platform.sdk.common.Settings [265]
    43  checkcast com.motivewave.platform.ui.draw.figure.study.SettingsWrapper [731]
    46  invokevirtual com.motivewave.platform.ui.draw.figure.study.SettingsWrapper.destroy() : void [733]
    49  return
      Line numbers:
        [pc: 0, line: 1368]
        [pc: 8, line: 1369]
        [pc: 13, line: 1370]
        [pc: 22, line: 1371]
        [pc: 29, line: 1372]
        [pc: 49, line: 1377]
      Stack map table: number of frames 2
        [pc: 8, same]
        [pc: 49, same]
  
  // Method descriptor #6 ()V
  // Stack: 4, Locals: 1
  protected void notifyRangeUpdated();
     0  invokestatic java.lang.System.currentTimeMillis() : long [736]
     3  aload_0 [this]
     4  getfield com.motivewave.platform.sdk.study.Study.lastRangeUpdate : long [111]
     7  lsub
     8  ldc2_w <Long 300> [742]
    11  lcmp
    12  ifge 16
    15  return
    16  aload_0 [this]
    17  ldc_w <String "rangeUpdated"> [744]
    20  iconst_0
    21  invokestatic java.lang.Boolean.valueOf(boolean) : java.lang.Boolean [612]
    24  iconst_1
    25  invokestatic java.lang.Boolean.valueOf(boolean) : java.lang.Boolean [612]
    28  invokevirtual com.motivewave.platform.sdk.study.Study.firePropertyChange(java.lang.String, java.lang.Object, java.lang.Object) : void [250]
    31  aload_0 [this]
    32  invokestatic java.lang.System.currentTimeMillis() : long [736]
    35  putfield com.motivewave.platform.sdk.study.Study.lastRangeUpdate : long [111]
    38  return
      Line numbers:
        [pc: 0, line: 1382]
        [pc: 15, line: 1383]
        [pc: 16, line: 1386]
        [pc: 31, line: 1387]
        [pc: 38, line: 1388]
      Stack map table: number of frames 1
        [pc: 16, same]
  
  // Method descriptor #6 ()V
  // Stack: 4, Locals: 1
  protected void notifyValuesUpdated();
     0  invokestatic java.lang.System.currentTimeMillis() : long [736]
     3  aload_0 [this]
     4  getfield com.motivewave.platform.sdk.study.Study.lastValuesUpdated : long [118]
     7  lsub
     8  ldc2_w <Long 300> [742]
    11  lcmp
    12  ifge 16
    15  return
    16  aload_0 [this]
    17  ldc_w <String "valuesUpdated"> [746]
    20  iconst_0
    21  invokestatic java.lang.Boolean.valueOf(boolean) : java.lang.Boolean [612]
    24  iconst_1
    25  invokestatic java.lang.Boolean.valueOf(boolean) : java.lang.Boolean [612]
    28  invokevirtual com.motivewave.platform.sdk.study.Study.firePropertyChange(java.lang.String, java.lang.Object, java.lang.Object) : void [250]
    31  aload_0 [this]
    32  invokestatic java.lang.System.currentTimeMillis() : long [736]
    35  putfield com.motivewave.platform.sdk.study.Study.lastValuesUpdated : long [118]
    38  return
      Line numbers:
        [pc: 0, line: 1393]
        [pc: 15, line: 1394]
        [pc: 16, line: 1397]
        [pc: 31, line: 1398]
        [pc: 38, line: 1399]
      Stack map table: number of frames 1
        [pc: 16, same]
  
  // Method descriptor #6 ()V
  // Stack: 6, Locals: 5
  protected void notifyRedraw();
     0  invokestatic com.motivewave.platform.common.Config.getUIUpdateInterval() : int [748]
     3  iconst_2
     4  idiv
     5  i2l
     6  lstore_1
     7  invokestatic java.lang.System.currentTimeMillis() : long [736]
    10  lload_1
    11  ldiv
    12  lload_1
    13  lmul
    14  lstore_3
    15  aload_0 [this]
    16  getfield com.motivewave.platform.sdk.study.Study.lastRedraw : long [115]
    19  lload_3
    20  lload_1
    21  lsub
    22  lcmp
    23  ifle 27
    26  return
    27  aload_0 [this]
    28  lload_3
    29  putfield com.motivewave.platform.sdk.study.Study.lastRedraw : long [115]
    32  aload_0 [this]
    33  ldc_w <String "redraw"> [753]
    36  iconst_0
    37  invokestatic java.lang.Boolean.valueOf(boolean) : java.lang.Boolean [612]
    40  iconst_1
    41  invokestatic java.lang.Boolean.valueOf(boolean) : java.lang.Boolean [612]
    44  invokevirtual com.motivewave.platform.sdk.study.Study.firePropertyChange(java.lang.String, java.lang.Object, java.lang.Object) : void [250]
    47  return
      Line numbers:
        [pc: 0, line: 1404]
        [pc: 7, line: 1405]
        [pc: 15, line: 1406]
        [pc: 27, line: 1407]
        [pc: 32, line: 1409]
        [pc: 47, line: 1410]
      Stack map table: number of frames 1
        [pc: 27, append: {long, long}]
  
  // Method descriptor #780 ()Lcom/motivewave/platform/sdk/study/Study;
  // Stack: 5, Locals: 5
  public com.motivewave.platform.sdk.study.Study clone();
      0  aload_0 [this]
      1  invokespecial java.lang.Object.clone() : java.lang.Object [755]
      4  checkcast com.motivewave.platform.sdk.study.Study [17]
      7  astore_1
      8  aload_0 [this]
      9  getfield com.motivewave.platform.sdk.study.Study.figureMap : java.util.Map [16]
     12  ifnull 109
     15  aload_1
     16  new java.util.HashMap [7]
     19  dup
     20  invokespecial java.util.HashMap() [9]
     23  invokestatic java.util.Collections.synchronizedMap(java.util.Map) : java.util.Map [10]
     26  putfield com.motivewave.platform.sdk.study.Study.figureMap : java.util.Map [16]
     29  aload_0 [this]
     30  getfield com.motivewave.platform.sdk.study.Study.figureMap : java.util.Map [16]
     33  invokeinterface java.util.Map.keySet() : java.util.Set [758] [nargs: 1]
     38  invokeinterface java.util.Set.iterator() : java.util.Iterator [296] [nargs: 1]
     43  astore_2
     44  aload_2
     45  invokeinterface java.util.Iterator.hasNext() : boolean [153] [nargs: 1]
     50  ifeq 109
     53  aload_2
     54  invokeinterface java.util.Iterator.next() : java.lang.Object [158] [nargs: 1]
     59  checkcast java.lang.String [299]
     62  astore_3
     63  aload_0 [this]
     64  getfield com.motivewave.platform.sdk.study.Study.figureMap : java.util.Map [16]
     67  aload_3
     68  invokeinterface java.util.Map.get(java.lang.Object) : java.lang.Object [380] [nargs: 2]
     73  checkcast java.util.List [148]
     76  astore 4
     78  aload 4
     80  ifnonnull 86
     83  goto 44
     86  aload_1
     87  getfield com.motivewave.platform.sdk.study.Study.figureMap : java.util.Map [16]
     90  aload_3
     91  new java.util.ArrayList [286]
     94  dup
     95  aload 4
     97  invokespecial java.util.ArrayList(java.util.Collection) [479]
    100  invokeinterface java.util.Map.put(java.lang.Object, java.lang.Object) : java.lang.Object [457] [nargs: 3]
    105  pop
    106  goto 44
    109  aload_0 [this]
    110  getfield com.motivewave.platform.sdk.study.Study.settings : com.motivewave.platform.sdk.common.Settings [265]
    113  ifnull 127
    116  aload_1
    117  aload_0 [this]
    118  getfield com.motivewave.platform.sdk.study.Study.settings : com.motivewave.platform.sdk.common.Settings [265]
    121  invokevirtual com.motivewave.platform.sdk.common.Settings.clone() : com.motivewave.platform.sdk.common.Settings [761]
    124  putfield com.motivewave.platform.sdk.study.Study.settings : com.motivewave.platform.sdk.common.Settings [265]
    127  aload_1
    128  areturn
    129  astore_1
    130  aload_1
    131  invokevirtual java.lang.Throwable.printStackTrace() : void [765]
    134  aconst_null
    135  areturn
      Exception Table:
        [pc: 0, pc: 128] -> 129 when : java.lang.Throwable
      Line numbers:
        [pc: 0, line: 1417]
        [pc: 8, line: 1418]
        [pc: 15, line: 1419]
        [pc: 29, line: 1420]
        [pc: 63, line: 1421]
        [pc: 78, line: 1422]
        [pc: 86, line: 1423]
        [pc: 106, line: 1424]
        [pc: 109, line: 1426]
        [pc: 127, line: 1427]
        [pc: 129, line: 1429]
        [pc: 130, line: 1430]
        [pc: 134, line: 1432]
      Stack map table: number of frames 5
        [pc: 44, append: {com.motivewave.platform.sdk.study.Study, java.util.Iterator}]
        [pc: 86, append: {java.lang.String, java.util.List}]
        [pc: 109, chop 3 local(s)]
        [pc: 127, same]
        [pc: 129, full, stack: {java.lang.Throwable}, locals: {com.motivewave.platform.sdk.study.Study}]
  
  // Method descriptor #130 ()Lcom/motivewave/platform/databean/StudyInfo;
  // Stack: 2, Locals: 1
  private com.motivewave.platform.databean.StudyInfo getInfo();
     0  aload_0 [this]
     1  getfield com.motivewave.platform.sdk.study.Study.info : com.motivewave.platform.databean.StudyInfo [766]
     4  ifnonnull 15
     7  aload_0 [this]
     8  aload_0 [this]
     9  invokestatic com.motivewave.platform.ui.draw.figure.study.StudyFactory.getStudyInfo(com.motivewave.platform.sdk.study.Study) : com.motivewave.platform.databean.StudyInfo [387]
    12  putfield com.motivewave.platform.sdk.study.Study.info : com.motivewave.platform.databean.StudyInfo [766]
    15  aload_0 [this]
    16  getfield com.motivewave.platform.sdk.study.Study.info : com.motivewave.platform.databean.StudyInfo [766]
    19  areturn
      Line numbers:
        [pc: 0, line: 1436]
        [pc: 15, line: 1437]
      Stack map table: number of frames 1
        [pc: 15, same]
  
  // Method descriptor #136 ()Z
  // Stack: 2, Locals: 1
  private boolean isOverlay();
     0  aload_0 [this]
     1  getfield com.motivewave.platform.sdk.study.Study.overlay : java.lang.Boolean [108]
     4  ifnull 15
     7  aload_0 [this]
     8  getfield com.motivewave.platform.sdk.study.Study.overlay : java.lang.Boolean [108]
    11  invokevirtual java.lang.Boolean.booleanValue() : boolean [604]
    14  ireturn
    15  aload_0 [this]
    16  aload_0 [this]
    17  invokevirtual com.motivewave.platform.sdk.study.Study.getHeader() : com.motivewave.platform.sdk.study.StudyHeader [770]
    20  invokeinterface com.motivewave.platform.sdk.study.StudyHeader.overlay() : boolean [774] [nargs: 1]
    25  invokestatic java.lang.Boolean.valueOf(boolean) : java.lang.Boolean [612]
    28  putfield com.motivewave.platform.sdk.study.Study.overlay : java.lang.Boolean [108]
    31  aload_0 [this]
    32  getfield com.motivewave.platform.sdk.study.Study.overlay : java.lang.Boolean [108]
    35  invokevirtual java.lang.Boolean.booleanValue() : boolean [604]
    38  ireturn
      Line numbers:
        [pc: 0, line: 1441]
        [pc: 15, line: 1442]
        [pc: 31, line: 1443]
      Stack map table: number of frames 1
        [pc: 15, same]
  
  // Method descriptor #6 ()V
  // Stack: 3, Locals: 1
  public void beginFigureUpdate();
     0  aload_0 [this]
     1  dup
     2  getfield com.motivewave.platform.sdk.study.Study.figureUpdateCount : int [41]
     5  iconst_1
     6  iadd
     7  putfield com.motivewave.platform.sdk.study.Study.figureUpdateCount : int [41]
    10  return
      Line numbers:
        [pc: 0, line: 1446]
  
  // Method descriptor #6 ()V
  // Stack: 3, Locals: 1
  public void endFigureUpdate();
     0  aload_0 [this]
     1  dup
     2  getfield com.motivewave.platform.sdk.study.Study.figureUpdateCount : int [41]
     5  iconst_1
     6  isub
     7  putfield com.motivewave.platform.sdk.study.Study.figureUpdateCount : int [41]
    10  aload_0 [this]
    11  getfield com.motivewave.platform.sdk.study.Study.figureUpdateCount : int [41]
    14  ifge 22
    17  aload_0 [this]
    18  iconst_0
    19  putfield com.motivewave.platform.sdk.study.Study.figureUpdateCount : int [41]
    22  aload_0 [this]
    23  invokevirtual com.motivewave.platform.sdk.study.Study.notifyFiguresUpdated() : void [223]
    26  return
      Line numbers:
        [pc: 0, line: 1449]
        [pc: 10, line: 1450]
        [pc: 22, line: 1451]
        [pc: 26, line: 1452]
      Stack map table: number of frames 1
        [pc: 22, same]
  
  // Method descriptor #6 ()V
  // Stack: 4, Locals: 1
  private void notifyFiguresUpdated();
     0  aload_0 [this]
     1  getfield com.motivewave.platform.sdk.study.Study.ignoreFigureUpdates : boolean [51]
     4  ifne 14
     7  aload_0 [this]
     8  getfield com.motivewave.platform.sdk.study.Study.figureUpdateCount : int [41]
    11  ifle 15
    14  return
    15  aload_0 [this]
    16  getfield com.motivewave.platform.sdk.study.Study.figureUpdatePending : boolean [44]
    19  ifeq 43
    22  aload_0 [this]
    23  iconst_0
    24  putfield com.motivewave.platform.sdk.study.Study.figureUpdatePending : boolean [44]
    27  aload_0 [this]
    28  ldc_w <String "figures"> [776]
    31  aconst_null
    32  ldc_w <String ""> [360]
    35  invokevirtual com.motivewave.platform.sdk.study.Study.firePropertyChange(java.lang.String, java.lang.Object, java.lang.Object) : void [250]
    38  aload_0 [this]
    39  iconst_0
    40  putfield com.motivewave.platform.sdk.study.Study.figureUpdatePending : boolean [44]
    43  return
      Line numbers:
        [pc: 0, line: 1455]
        [pc: 15, line: 1456]
        [pc: 22, line: 1457]
        [pc: 27, line: 1458]
        [pc: 38, line: 1459]
        [pc: 43, line: 1461]
      Stack map table: number of frames 3
        [pc: 14, same]
        [pc: 15, same]
        [pc: 43, same]
  
  // Method descriptor #161 ()Ljava/lang/Object;
  // Stack: 1, Locals: 1
  public bridge synthetic java.lang.Object clone() throws java.lang.CloneNotSupportedException;
    0  aload_0 [this]
    1  invokevirtual com.motivewave.platform.sdk.study.Study.clone() : com.motivewave.platform.sdk.study.Study [778]
    4  areturn
      Line numbers:
        [pc: 0, line: 45]

  Inner classes:
    [inner class info: #61 com/motivewave/platform/sdk/common/Enums$StrategyState, outer class info: #926 com/motivewave/platform/sdk/common/Enums
     inner name: #928 StrategyState, accessflags: 16409 public static final],
    [inner class info: #70 com/motivewave/platform/sdk/common/Enums$EntryState, outer class info: #926 com/motivewave/platform/sdk/common/Enums
     inner name: #929 EntryState, accessflags: 16409 public static final],
    [inner class info: #543 com/motivewave/platform/sdk/common/Enums$MAMethod, outer class info: #926 com/motivewave/platform/sdk/common/Enums
     inner name: #930 MAMethod, accessflags: 16409 public static final],
    [inner class info: #694 com/motivewave/platform/common/Enums$LogType, outer class info: #931 com/motivewave/platform/common/Enums
     inner name: #933 LogType, accessflags: 16409 public static final],
    [inner class info: #934 java/lang/invoke/MethodHandles$Lookup, outer class info: #936 java/lang/invoke/MethodHandles
     inner name: #938 Lookup, accessflags: 25 public static final]
Bootstrap methods:
  0 : # 919 invokestatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
	Method arguments:
		#911 ,,
  1 : # 919 invokestatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
	Method arguments:
		#913 ,
  2 : # 919 invokestatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
	Method arguments:
		#915 ),
  3 : # 919 invokestatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
	Method arguments:
		#917 
}
