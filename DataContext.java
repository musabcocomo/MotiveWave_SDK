// Compiled from DataContext.java (version 25 : 69.0, no super bit)
public abstract interface com.motivewave.platform.sdk.common.DataContext {
  
  // Method descriptor #16 ()Lcom/motivewave/platform/sdk/common/DataSeries;
  public abstract com.motivewave.platform.sdk.common.DataSeries getDataSeries();
  
  // Method descriptor #18 ()Lcom/motivewave/platform/sdk/common/BarSize;
  public abstract com.motivewave.platform.sdk.common.BarSize getChartBarSize();
  
  // Method descriptor #19 (Lcom/motivewave/platform/sdk/common/BarSize;)Lcom/motivewave/platform/sdk/common/DataSeries;
  public abstract com.motivewave.platform.sdk.common.DataSeries getDataSeries(com.motivewave.platform.sdk.common.BarSize arg0);
  
  // Method descriptor #21 ()Lcom/motivewave/platform/sdk/common/Instrument;
  public abstract com.motivewave.platform.sdk.common.Instrument getInstrument();
  
  // Method descriptor #21 ()Lcom/motivewave/platform/sdk/common/Instrument;
  public abstract com.motivewave.platform.sdk.common.Instrument getTradeInstrument();
  
  // Method descriptor #24 ()Ljava/util/List;
  // Signature: ()Ljava/util/List<Lcom/motivewave/platform/sdk/common/Instrument;>;
  public abstract java.util.List getInstruments();
  
  // Method descriptor #28 (ILjava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
  public abstract void signal(int arg0, java.lang.Object arg1, java.lang.String arg2, java.lang.Object arg3);
  
  // Method descriptor #30 (ILjava/lang/Object;)V
  public abstract void clearSignal(int arg0, java.lang.Object arg1);
  
  // Method descriptor #32 (Ljava/lang/Object;)Z
  public abstract boolean isSignalEnabled(java.lang.Object arg0);
  
  // Method descriptor #34 ()Z
  public abstract boolean isRTH();
  
  // Method descriptor #36 ()J
  public abstract long getCurrentTime();
  
  // Method descriptor #38 ()Ljava/util/TimeZone;
  public abstract java.util.TimeZone getTimeZone();
  
  // Method descriptor #40 ()Lcom/motivewave/platform/sdk/common/Defaults;
  public abstract com.motivewave.platform.sdk.common.Defaults getDefaults();
  
  // Method descriptor #34 ()Z
  public abstract boolean isLoadingData();
  
  // Method descriptor #34 ()Z
  public abstract boolean isReplayMode();
  
  // Method descriptor #12 (FLjava/lang/String;Lcom/motivewave/platform/sdk/common/TextStyle;)Ljava/lang/Object;
  public abstract java.lang.Object addNote(float arg0, java.lang.String arg1, com.motivewave.platform.sdk.common.TextStyle arg2);
  
  // Method descriptor #43 (FLjava/lang/String;Ljava/awt/Color;)Ljava/lang/Object;
  // Stack: 8, Locals: 4
  public java.lang.Object addNote(float arg0, java.lang.String arg1, java.awt.Color arg2);
     0  aload_0 [this]
     1  fload_1 [arg0]
     2  aload_2 [arg1]
     3  new com.motivewave.platform.sdk.common.TextStyle [1]
     6  dup
     7  aconst_null
     8  aconst_null
     9  aload_3 [arg2]
    10  invokespecial com.motivewave.platform.sdk.common.TextStyle(java.awt.Font, java.awt.Color, java.awt.Color) [3]
    13  invokeinterface com.motivewave.platform.sdk.common.DataContext.addNote(float, java.lang.String, com.motivewave.platform.sdk.common.TextStyle) : java.lang.Object [7] [nargs: 4]
    18  areturn
      Line numbers:
        [pc: 0, line: 91]
  
  // Method descriptor #47 (Ljava/lang/Object;FLjava/lang/String;Lcom/motivewave/platform/sdk/common/TextStyle;)Z
  public abstract boolean updateNote(java.lang.Object arg0, float arg1, java.lang.String arg2, com.motivewave.platform.sdk.common.TextStyle arg3);
  
  // Method descriptor #32 (Ljava/lang/Object;)Z
  public abstract boolean removeNote(java.lang.Object arg0);
  
  // Method descriptor #50 ()V
  public abstract void removeAllNotes();
  
  // Method descriptor #50 ()V
  public abstract void clearBarWidths();
  
  // Method descriptor #53 (ID)V
  public abstract void setBarWidthAt(int arg0, double arg1);
  
  // Method descriptor #55 (I)D
  public abstract double getBarWidthAt(int arg0);
}
