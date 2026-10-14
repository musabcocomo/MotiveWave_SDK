// Compiled from DataSeries.java (version 25 : 69.0, no super bit)
public abstract interface com.motivewave.platform.sdk.common.DataSeries {
  
  // Method descriptor #20 ()I
  public abstract int size();
  
  // Method descriptor #22 ()Lcom/motivewave/platform/sdk/common/BarSize;
  public abstract com.motivewave.platform.sdk.common.BarSize getBarSize();
  
  // Method descriptor #24 (Lcom/motivewave/platform/sdk/common/Instrument;)Z
  public abstract boolean hasData(com.motivewave.platform.sdk.common.Instrument arg0);
  
  // Method descriptor #25 ()Z
  public abstract boolean hasData();
  
  // Method descriptor #27 ()Lcom/motivewave/platform/sdk/common/Enums$BarData;
  public abstract com.motivewave.platform.sdk.common.Enums.BarData getBarData();
  
  // Method descriptor #29 ()Lcom/motivewave/platform/sdk/common/Instrument;
  public abstract com.motivewave.platform.sdk.common.Instrument getInstrument();
  
  // Method descriptor #31 (I)F
  public abstract float getHigh(int arg0);
  
  // Method descriptor #12 ()F
  public abstract float getHigh();
  
  // Method descriptor #32 (ILcom/motivewave/platform/sdk/common/Instrument;)F
  public abstract float getHigh(int arg0, com.motivewave.platform.sdk.common.Instrument arg1);
  
  // Method descriptor #33 (Lcom/motivewave/platform/sdk/common/Instrument;)F
  public abstract float getHigh(com.motivewave.platform.sdk.common.Instrument arg0);
  
  // Method descriptor #31 (I)F
  public abstract float getAskHigh(int arg0);
  
  // Method descriptor #12 ()F
  public abstract float getAskHigh();
  
  // Method descriptor #32 (ILcom/motivewave/platform/sdk/common/Instrument;)F
  public abstract float getAskHigh(int arg0, com.motivewave.platform.sdk.common.Instrument arg1);
  
  // Method descriptor #33 (Lcom/motivewave/platform/sdk/common/Instrument;)F
  public abstract float getAskHigh(com.motivewave.platform.sdk.common.Instrument arg0);
  
  // Method descriptor #31 (I)F
  public abstract float getBidHigh(int arg0);
  
  // Method descriptor #12 ()F
  public abstract float getBidHigh();
  
  // Method descriptor #32 (ILcom/motivewave/platform/sdk/common/Instrument;)F
  public abstract float getBidHigh(int arg0, com.motivewave.platform.sdk.common.Instrument arg1);
  
  // Method descriptor #33 (Lcom/motivewave/platform/sdk/common/Instrument;)F
  public abstract float getBidHigh(com.motivewave.platform.sdk.common.Instrument arg0);
  
  // Method descriptor #31 (I)F
  public abstract float getRealHigh(int arg0);
  
  // Method descriptor #12 ()F
  public abstract float getRealHigh();
  
  // Method descriptor #31 (I)F
  public abstract float getLow(int arg0);
  
  // Method descriptor #12 ()F
  public abstract float getLow();
  
  // Method descriptor #31 (I)F
  public abstract float getAskLow(int arg0);
  
  // Method descriptor #12 ()F
  public abstract float getAskLow();
  
  // Method descriptor #31 (I)F
  public abstract float getBidLow(int arg0);
  
  // Method descriptor #12 ()F
  public abstract float getBidLow();
  
  // Method descriptor #32 (ILcom/motivewave/platform/sdk/common/Instrument;)F
  public abstract float getLow(int arg0, com.motivewave.platform.sdk.common.Instrument arg1);
  
  // Method descriptor #33 (Lcom/motivewave/platform/sdk/common/Instrument;)F
  public abstract float getLow(com.motivewave.platform.sdk.common.Instrument arg0);
  
  // Method descriptor #32 (ILcom/motivewave/platform/sdk/common/Instrument;)F
  public abstract float getAskLow(int arg0, com.motivewave.platform.sdk.common.Instrument arg1);
  
  // Method descriptor #33 (Lcom/motivewave/platform/sdk/common/Instrument;)F
  public abstract float getAskLow(com.motivewave.platform.sdk.common.Instrument arg0);
  
  // Method descriptor #32 (ILcom/motivewave/platform/sdk/common/Instrument;)F
  public abstract float getBidLow(int arg0, com.motivewave.platform.sdk.common.Instrument arg1);
  
  // Method descriptor #33 (Lcom/motivewave/platform/sdk/common/Instrument;)F
  public abstract float getBidLow(com.motivewave.platform.sdk.common.Instrument arg0);
  
  // Method descriptor #31 (I)F
  public abstract float getRealLow(int arg0);
  
  // Method descriptor #12 ()F
  public abstract float getRealLow();
  
  // Method descriptor #31 (I)F
  public abstract float getOpen(int arg0);
  
  // Method descriptor #12 ()F
  public abstract float getOpen();
  
  // Method descriptor #31 (I)F
  public abstract float getAskOpen(int arg0);
  
  // Method descriptor #12 ()F
  public abstract float getAskOpen();
  
  // Method descriptor #31 (I)F
  public abstract float getBidOpen(int arg0);
  
  // Method descriptor #12 ()F
  public abstract float getBidOpen();
  
  // Method descriptor #32 (ILcom/motivewave/platform/sdk/common/Instrument;)F
  public abstract float getOpen(int arg0, com.motivewave.platform.sdk.common.Instrument arg1);
  
  // Method descriptor #33 (Lcom/motivewave/platform/sdk/common/Instrument;)F
  public abstract float getOpen(com.motivewave.platform.sdk.common.Instrument arg0);
  
  // Method descriptor #32 (ILcom/motivewave/platform/sdk/common/Instrument;)F
  public abstract float getAskOpen(int arg0, com.motivewave.platform.sdk.common.Instrument arg1);
  
  // Method descriptor #33 (Lcom/motivewave/platform/sdk/common/Instrument;)F
  public abstract float getAskOpen(com.motivewave.platform.sdk.common.Instrument arg0);
  
  // Method descriptor #32 (ILcom/motivewave/platform/sdk/common/Instrument;)F
  public abstract float getBidOpen(int arg0, com.motivewave.platform.sdk.common.Instrument arg1);
  
  // Method descriptor #33 (Lcom/motivewave/platform/sdk/common/Instrument;)F
  public abstract float getBidOpen(com.motivewave.platform.sdk.common.Instrument arg0);
  
  // Method descriptor #31 (I)F
  public abstract float getClose(int arg0);
  
  // Method descriptor #12 ()F
  public abstract float getClose();
  
  // Method descriptor #31 (I)F
  public abstract float getAskClose(int arg0);
  
  // Method descriptor #12 ()F
  public abstract float getAskClose();
  
  // Method descriptor #31 (I)F
  public abstract float getBidClose(int arg0);
  
  // Method descriptor #12 ()F
  public abstract float getBidClose();
  
  // Method descriptor #32 (ILcom/motivewave/platform/sdk/common/Instrument;)F
  public abstract float getClose(int arg0, com.motivewave.platform.sdk.common.Instrument arg1);
  
  // Method descriptor #33 (Lcom/motivewave/platform/sdk/common/Instrument;)F
  public abstract float getClose(com.motivewave.platform.sdk.common.Instrument arg0);
  
  // Method descriptor #32 (ILcom/motivewave/platform/sdk/common/Instrument;)F
  public abstract float getAskClose(int arg0, com.motivewave.platform.sdk.common.Instrument arg1);
  
  // Method descriptor #33 (Lcom/motivewave/platform/sdk/common/Instrument;)F
  public abstract float getAskClose(com.motivewave.platform.sdk.common.Instrument arg0);
  
  // Method descriptor #32 (ILcom/motivewave/platform/sdk/common/Instrument;)F
  public abstract float getBidClose(int arg0, com.motivewave.platform.sdk.common.Instrument arg1);
  
  // Method descriptor #33 (Lcom/motivewave/platform/sdk/common/Instrument;)F
  public abstract float getBidClose(com.motivewave.platform.sdk.common.Instrument arg0);
  
  // Method descriptor #48 (I)J
  public abstract long getVolume(int arg0);
  
  // Method descriptor #31 (I)F
  public abstract float getVolumeAsFloat(int arg0);
  
  // Method descriptor #50 ()J
  public abstract long getVolume();
  
  // Method descriptor #12 ()F
  public abstract float getVolumeAsFloat();
  
  // Method descriptor #51 (ILcom/motivewave/platform/sdk/common/Instrument;)J
  public abstract long getVolume(int arg0, com.motivewave.platform.sdk.common.Instrument arg1);
  
  // Method descriptor #32 (ILcom/motivewave/platform/sdk/common/Instrument;)F
  public abstract float getVolumeAsFloat(int arg0, com.motivewave.platform.sdk.common.Instrument arg1);
  
  // Method descriptor #52 (Lcom/motivewave/platform/sdk/common/Instrument;)J
  public abstract long getVolume(com.motivewave.platform.sdk.common.Instrument arg0);
  
  // Method descriptor #33 (Lcom/motivewave/platform/sdk/common/Instrument;)F
  public abstract float getVolumeAsFloat(com.motivewave.platform.sdk.common.Instrument arg0);
  
  // Method descriptor #48 (I)J
  public abstract long getOpenInterest(int arg0);
  
  // Method descriptor #50 ()J
  public abstract long getOpenInterest();
  
  // Method descriptor #51 (ILcom/motivewave/platform/sdk/common/Instrument;)J
  public abstract long getOpenInterest(int arg0, com.motivewave.platform.sdk.common.Instrument arg1);
  
  // Method descriptor #52 (Lcom/motivewave/platform/sdk/common/Instrument;)J
  public abstract long getOpenInterest(com.motivewave.platform.sdk.common.Instrument arg0);
  
  // Method descriptor #50 ()J
  public abstract long getStartTime();
  
  // Method descriptor #52 (Lcom/motivewave/platform/sdk/common/Instrument;)J
  public abstract long getStartTime(com.motivewave.platform.sdk.common.Instrument arg0);
  
  // Method descriptor #48 (I)J
  public abstract long getStartTime(int arg0);
  
  // Method descriptor #50 ()J
  public abstract long getEndTime();
  
  // Method descriptor #52 (Lcom/motivewave/platform/sdk/common/Instrument;)J
  public abstract long getEndTime(com.motivewave.platform.sdk.common.Instrument arg0);
  
  // Method descriptor #48 (I)J
  public abstract long getEndTime(int arg0);
  
  // Method descriptor #20 ()I
  public abstract int getStartIndex();
  
  // Method descriptor #50 ()J
  public abstract long getVisibleStartTime();
  
  // Method descriptor #20 ()I
  public abstract int getEndIndex();
  
  // Method descriptor #50 ()J
  public abstract long getVisibleEndTime();
  
  // Method descriptor #25 ()Z
  public abstract boolean isLatestData();
  
  // Method descriptor #62 (I)V
  public abstract void setComplete(int arg0);
  
  // Method descriptor #63 (IZ)V
  public abstract void setComplete(int arg0, boolean arg1);
  
  // Method descriptor #65 (I)Z
  public abstract boolean isComplete(int arg0);
  
  // Method descriptor #25 ()Z
  public abstract boolean isLastBarComplete();
  
  // Method descriptor #65 (I)Z
  public abstract boolean isBarComplete(int arg0);
  
  // Method descriptor #68 (ILjava/lang/Object;)V
  public abstract void setComplete(int arg0, java.lang.Object arg1);
  
  // Method descriptor #69 (ILjava/lang/Object;Z)V
  public abstract void setComplete(int arg0, java.lang.Object arg1, boolean arg2);
  
  // Method descriptor #70 (ILjava/lang/Object;)Z
  public abstract boolean isComplete(int arg0, java.lang.Object arg1);
  
  // Method descriptor #72 (ILjava/lang/Object;Ljava/lang/Double;)V
  public abstract void setDouble(int arg0, java.lang.Object arg1, java.lang.Double arg2);
  
  // Method descriptor #73 (Ljava/lang/Object;Ljava/lang/Double;)V
  public abstract void setDouble(java.lang.Object arg0, java.lang.Double arg1);
  
  // Method descriptor #75 (ILjava/lang/Object;)Ljava/lang/Double;
  public abstract java.lang.Double getDouble(int arg0, java.lang.Object arg1);
  
  // Method descriptor #76 (ILcom/motivewave/platform/sdk/common/Enums$BarInput;Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Double;
  public abstract java.lang.Double getDouble(int arg0, com.motivewave.platform.sdk.common.Enums.BarInput arg1, com.motivewave.platform.sdk.common.Instrument arg2);
  
  // Method descriptor #77 (ILjava/lang/Object;D)D
  public abstract double getDouble(int arg0, java.lang.Object arg1, double arg2);
  
  // Method descriptor #78 (JLjava/lang/Object;)Ljava/lang/Double;
  public abstract java.lang.Double getDouble(long arg0, java.lang.Object arg1);
  
  // Method descriptor #79 (JLcom/motivewave/platform/sdk/common/Enums$BarInput;Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Double;
  public abstract java.lang.Double getDouble(long arg0, com.motivewave.platform.sdk.common.Enums.BarInput arg1, com.motivewave.platform.sdk.common.Instrument arg2);
  
  // Method descriptor #80 (Ljava/lang/Object;)Ljava/lang/Double;
  public abstract java.lang.Double getDouble(java.lang.Object arg0);
  
  // Method descriptor #81 (Lcom/motivewave/platform/sdk/common/Enums$BarInput;Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Double;
  public abstract java.lang.Double getDouble(com.motivewave.platform.sdk.common.Enums.BarInput arg0, com.motivewave.platform.sdk.common.Instrument arg1);
  
  // Method descriptor #83 (ILjava/lang/Object;Ljava/lang/Float;)V
  public abstract void setFloat(int arg0, java.lang.Object arg1, java.lang.Float arg2);
  
  // Method descriptor #84 (Ljava/lang/Object;Ljava/lang/Float;)V
  public abstract void setFloat(java.lang.Object arg0, java.lang.Float arg1);
  
  // Method descriptor #85 (ILjava/lang/Object;)Ljava/lang/Float;
  public abstract java.lang.Float getFloat(int arg0, java.lang.Object arg1);
  
  // Method descriptor #86 (ILcom/motivewave/platform/sdk/common/Enums$BarInput;Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Float;
  public abstract java.lang.Float getFloat(int arg0, com.motivewave.platform.sdk.common.Enums.BarInput arg1, com.motivewave.platform.sdk.common.Instrument arg2);
  
  // Method descriptor #87 (ILjava/lang/Object;F)F
  public abstract float getFloat(int arg0, java.lang.Object arg1, float arg2);
  
  // Method descriptor #88 (JLjava/lang/Object;)Ljava/lang/Float;
  public abstract java.lang.Float getFloat(long arg0, java.lang.Object arg1);
  
  // Method descriptor #89 (JLcom/motivewave/platform/sdk/common/Enums$BarInput;Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Float;
  public abstract java.lang.Float getFloat(long arg0, com.motivewave.platform.sdk.common.Enums.BarInput arg1, com.motivewave.platform.sdk.common.Instrument arg2);
  
  // Method descriptor #6 (Ljava/lang/Object;)Ljava/lang/Float;
  public abstract java.lang.Float getFloat(java.lang.Object arg0);
  
  // Method descriptor #90 (Ljava/lang/Object;F)Ljava/lang/Float;
  // Stack: 2, Locals: 4
  public java.lang.Float getFloat(java.lang.Object arg0, float arg1);
     0  aload_0 [this]
     1  aload_1 [arg0]
     2  invokeinterface com.motivewave.platform.sdk.common.DataSeries.getFloat(java.lang.Object) : java.lang.Float [1] [nargs: 2]
     7  astore_3
     8  aload_3
     9  ifnonnull 16
    12  fload_2 [arg1]
    13  goto 20
    16  aload_3
    17  invokevirtual java.lang.Float.floatValue() : float [7]
    20  invokestatic java.lang.Float.valueOf(float) : java.lang.Float [13]
    23  areturn
      Line numbers:
        [pc: 0, line: 558]
        [pc: 8, line: 559]
      Stack map table: number of frames 2
        [pc: 16, append: {java.lang.Float}]
        [pc: 20, same_locals_1_stack_item, stack: {float}]
  
  // Method descriptor #94 (Lcom/motivewave/platform/sdk/common/Enums$BarInput;Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Float;
  public abstract java.lang.Float getFloat(com.motivewave.platform.sdk.common.Enums.BarInput arg0, com.motivewave.platform.sdk.common.Instrument arg1);
  
  // Method descriptor #96 (J)I
  public abstract int findIndex(long arg0);
  
  // Method descriptor #98 (ILjava/lang/Object;)I
  public abstract int getInt(int arg0, java.lang.Object arg1);
  
  // Method descriptor #99 (Ljava/lang/Object;)I
  public abstract int getInt(java.lang.Object arg0);
  
  // Method descriptor #101 (ILjava/lang/Object;I)V
  public abstract void setInt(int arg0, java.lang.Object arg1, int arg2);
  
  // Method descriptor #102 (Ljava/lang/Object;I)V
  public abstract void setInt(java.lang.Object arg0, int arg1);
  
  // Method descriptor #104 (ILjava/lang/Object;Ljava/lang/Boolean;)V
  public abstract void setBoolean(int arg0, java.lang.Object arg1, java.lang.Boolean arg2);
  
  // Method descriptor #105 (Ljava/lang/Object;Ljava/lang/Boolean;)V
  public abstract void setBoolean(java.lang.Object arg0, java.lang.Boolean arg1);
  
  // Method descriptor #107 (Ljava/lang/Object;)Ljava/lang/Boolean;
  public abstract java.lang.Boolean getBoolean(java.lang.Object arg0);
  
  // Method descriptor #108 (Ljava/lang/Object;Z)Z
  public abstract boolean getBoolean(java.lang.Object arg0, boolean arg1);
  
  // Method descriptor #109 (ILjava/lang/Object;)Ljava/lang/Boolean;
  public abstract java.lang.Boolean getBoolean(int arg0, java.lang.Object arg1);
  
  // Method descriptor #110 (ILjava/lang/Object;Z)Z
  public abstract boolean getBoolean(int arg0, java.lang.Object arg1, boolean arg2);
  
  // Method descriptor #112 (ILjava/lang/Object;Ljava/lang/Object;)V
  public abstract void setValue(int arg0, java.lang.Object arg1, java.lang.Object arg2);
  
  // Method descriptor #113 (Ljava/lang/Object;Ljava/lang/Object;)V
  public abstract void setValue(java.lang.Object arg0, java.lang.Object arg1);
  
  // Method descriptor #115 (ILjava/lang/Object;)Ljava/lang/Object;
  public abstract java.lang.Object getValue(int arg0, java.lang.Object arg1);
  
  // Method descriptor #116 (Ljava/lang/Object;)Ljava/lang/Object;
  public abstract java.lang.Object getValue(java.lang.Object arg0);
  
  // Method descriptor #117 (Lcom/motivewave/platform/sdk/common/Enums$BarInput;Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Object;
  public abstract java.lang.Object getValue(com.motivewave.platform.sdk.common.Enums.BarInput arg0, com.motivewave.platform.sdk.common.Instrument arg1);
  
  // Method descriptor #118 (ILcom/motivewave/platform/sdk/common/Enums$BarInput;Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Object;
  public abstract java.lang.Object getValue(int arg0, com.motivewave.platform.sdk.common.Enums.BarInput arg1, com.motivewave.platform.sdk.common.Instrument arg2);
  
  // Method descriptor #120 (ILjava/awt/Color;)V
  public abstract void setPriceBarColor(int arg0, java.awt.Color arg1);
  
  // Method descriptor #121 (Ljava/awt/Color;)V
  public abstract void setPriceBarColor(java.awt.Color arg0);
  
  // Method descriptor #123 (I)Ljava/awt/Color;
  public abstract java.awt.Color getPriceBarColor(int arg0);
  
  // Method descriptor #124 ()Ljava/awt/Color;
  public abstract java.awt.Color getPriceBarColor();
  
  // Method descriptor #126 (ILjava/lang/Object;Ljava/awt/Color;)V
  public abstract void setBarColor(int arg0, java.lang.Object arg1, java.awt.Color arg2);
  
  // Method descriptor #127 (Ljava/lang/Object;Ljava/awt/Color;)V
  public abstract void setBarColor(java.lang.Object arg0, java.awt.Color arg1);
  
  // Method descriptor #129 (ILjava/lang/Object;)Ljava/awt/Color;
  public abstract java.awt.Color getBarColor(int arg0, java.lang.Object arg1);
  
  // Method descriptor #130 (Ljava/lang/Object;)Ljava/awt/Color;
  public abstract java.awt.Color getBarColor(java.lang.Object arg0);
  
  // Method descriptor #126 (ILjava/lang/Object;Ljava/awt/Color;)V
  public abstract void setPathColor(int arg0, java.lang.Object arg1, java.awt.Color arg2);
  
  // Method descriptor #127 (Ljava/lang/Object;Ljava/awt/Color;)V
  public abstract void setPathColor(java.lang.Object arg0, java.awt.Color arg1);
  
  // Method descriptor #129 (ILjava/lang/Object;)Ljava/awt/Color;
  public abstract java.awt.Color getPathColor(int arg0, java.lang.Object arg1);
  
  // Method descriptor #130 (Ljava/lang/Object;)Ljava/awt/Color;
  public abstract java.awt.Color getPathColor(java.lang.Object arg0);
  
  // Method descriptor #134 (I)Ljava/lang/Float;
  public abstract java.lang.Float getTrueRange(int arg0);
  
  // Method descriptor #135 ()Ljava/lang/Float;
  public abstract java.lang.Float getTrueRange();
  
  // Method descriptor #136 (ILcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Float;
  public abstract java.lang.Float getTrueRange(int arg0, com.motivewave.platform.sdk.common.Instrument arg1);
  
  // Method descriptor #137 (Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Float;
  public abstract java.lang.Float getTrueRange(com.motivewave.platform.sdk.common.Instrument arg0);
  
  // Method descriptor #134 (I)Ljava/lang/Float;
  public abstract java.lang.Float getTypicalPrice(int arg0);
  
  // Method descriptor #135 ()Ljava/lang/Float;
  public abstract java.lang.Float getTypicalPrice();
  
  // Method descriptor #136 (ILcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Float;
  public abstract java.lang.Float getTypicalPrice(int arg0, com.motivewave.platform.sdk.common.Instrument arg1);
  
  // Method descriptor #137 (Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Float;
  public abstract java.lang.Float getTypicalPrice(com.motivewave.platform.sdk.common.Instrument arg0);
  
  // Method descriptor #135 ()Ljava/lang/Float;
  public abstract java.lang.Float getRange();
  
  // Method descriptor #137 (Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Float;
  public abstract java.lang.Float getRange(com.motivewave.platform.sdk.common.Instrument arg0);
  
  // Method descriptor #134 (I)Ljava/lang/Float;
  public abstract java.lang.Float getRange(int arg0);
  
  // Method descriptor #136 (ILcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Float;
  public abstract java.lang.Float getRange(int arg0, com.motivewave.platform.sdk.common.Instrument arg1);
  
  // Method descriptor #135 ()Ljava/lang/Float;
  public abstract java.lang.Float getPositiveDM();
  
  // Method descriptor #137 (Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Float;
  public abstract java.lang.Float getPositiveDM(com.motivewave.platform.sdk.common.Instrument arg0);
  
  // Method descriptor #134 (I)Ljava/lang/Float;
  public abstract java.lang.Float getPositiveDM(int arg0);
  
  // Method descriptor #136 (ILcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Float;
  public abstract java.lang.Float getPositiveDM(int arg0, com.motivewave.platform.sdk.common.Instrument arg1);
  
  // Method descriptor #135 ()Ljava/lang/Float;
  public abstract java.lang.Float getNegativeDM();
  
  // Method descriptor #134 (I)Ljava/lang/Float;
  public abstract java.lang.Float getNegativeDM(int arg0);
  
  // Method descriptor #137 (Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Float;
  public abstract java.lang.Float getNegativeDM(com.motivewave.platform.sdk.common.Instrument arg0);
  
  // Method descriptor #136 (ILcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Float;
  public abstract java.lang.Float getNegativeDM(int arg0, com.motivewave.platform.sdk.common.Instrument arg1);
  
  // Method descriptor #143 (I)Ljava/lang/Double;
  public abstract java.lang.Double atr(int arg0);
  
  // Method descriptor #144 (ILcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Double;
  public abstract java.lang.Double atr(int arg0, com.motivewave.platform.sdk.common.Instrument arg1);
  
  // Method descriptor #145 (II)Ljava/lang/Double;
  public abstract java.lang.Double atr(int arg0, int arg1);
  
  // Method descriptor #146 (IILcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Double;
  public abstract java.lang.Double atr(int arg0, int arg1, com.motivewave.platform.sdk.common.Instrument arg2);
  
  // Method descriptor #148 (Lcom/motivewave/platform/sdk/common/Enums$MAMethod;IILjava/lang/Object;)Ljava/lang/Double;
  public abstract java.lang.Double ma(com.motivewave.platform.sdk.common.Enums.MAMethod arg0, int arg1, int arg2, java.lang.Object arg3);
  
  // Method descriptor #149 (Lcom/motivewave/platform/sdk/common/Enums$MAMethod;IILcom/motivewave/platform/sdk/common/Enums$BarInput;Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Double;
  public abstract java.lang.Double ma(com.motivewave.platform.sdk.common.Enums.MAMethod arg0, int arg1, int arg2, com.motivewave.platform.sdk.common.Enums.BarInput arg3, com.motivewave.platform.sdk.common.Instrument arg4);
  
  // Method descriptor #151 (IILjava/lang/Object;)Ljava/lang/Double;
  public abstract java.lang.Double stochasticK(int arg0, int arg1, java.lang.Object arg2);
  
  // Method descriptor #145 (II)Ljava/lang/Double;
  public abstract java.lang.Double stochasticK(int arg0, int arg1);
  
  // Method descriptor #152 (IILcom/motivewave/platform/sdk/common/Enums$BarInput;Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Double;
  public abstract java.lang.Double stochasticK(int arg0, int arg1, com.motivewave.platform.sdk.common.Enums.BarInput arg2, com.motivewave.platform.sdk.common.Instrument arg3);
  
  // Method descriptor #146 (IILcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Double;
  public abstract java.lang.Double stochasticK(int arg0, int arg1, com.motivewave.platform.sdk.common.Instrument arg2);
  
  // Method descriptor #31 (I)F
  public abstract float mfm(int arg0);
  
  // Method descriptor #32 (ILcom/motivewave/platform/sdk/common/Instrument;)F
  public abstract float mfm(int arg0, com.motivewave.platform.sdk.common.Instrument arg1);
  
  // Method descriptor #151 (IILjava/lang/Object;)Ljava/lang/Double;
  public abstract java.lang.Double roc(int arg0, int arg1, java.lang.Object arg2);
  
  // Method descriptor #152 (IILcom/motivewave/platform/sdk/common/Enums$BarInput;Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Double;
  public abstract java.lang.Double roc(int arg0, int arg1, com.motivewave.platform.sdk.common.Enums.BarInput arg2, com.motivewave.platform.sdk.common.Instrument arg3);
  
  // Method descriptor #151 (IILjava/lang/Object;)Ljava/lang/Double;
  public abstract java.lang.Double std(int arg0, int arg1, java.lang.Object arg2);
  
  // Method descriptor #152 (IILcom/motivewave/platform/sdk/common/Enums$BarInput;Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Double;
  public abstract java.lang.Double std(int arg0, int arg1, com.motivewave.platform.sdk.common.Enums.BarInput arg2, com.motivewave.platform.sdk.common.Instrument arg3);
  
  // Method descriptor #151 (IILjava/lang/Object;)Ljava/lang/Double;
  public abstract java.lang.Double sma(int arg0, int arg1, java.lang.Object arg2);
  
  // Method descriptor #152 (IILcom/motivewave/platform/sdk/common/Enums$BarInput;Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Double;
  public abstract java.lang.Double sma(int arg0, int arg1, com.motivewave.platform.sdk.common.Enums.BarInput arg2, com.motivewave.platform.sdk.common.Instrument arg3);
  
  // Method descriptor #151 (IILjava/lang/Object;)Ljava/lang/Double;
  public abstract java.lang.Double wma(int arg0, int arg1, java.lang.Object arg2);
  
  // Method descriptor #152 (IILcom/motivewave/platform/sdk/common/Enums$BarInput;Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Double;
  public abstract java.lang.Double wma(int arg0, int arg1, com.motivewave.platform.sdk.common.Enums.BarInput arg2, com.motivewave.platform.sdk.common.Instrument arg3);
  
  // Method descriptor #151 (IILjava/lang/Object;)Ljava/lang/Double;
  public abstract java.lang.Double ema(int arg0, int arg1, java.lang.Object arg2);
  
  // Method descriptor #152 (IILcom/motivewave/platform/sdk/common/Enums$BarInput;Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Double;
  public abstract java.lang.Double ema(int arg0, int arg1, com.motivewave.platform.sdk.common.Enums.BarInput arg2, com.motivewave.platform.sdk.common.Instrument arg3);
  
  // Method descriptor #151 (IILjava/lang/Object;)Ljava/lang/Double;
  public abstract java.lang.Double dema(int arg0, int arg1, java.lang.Object arg2);
  
  // Method descriptor #152 (IILcom/motivewave/platform/sdk/common/Enums$BarInput;Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Double;
  public abstract java.lang.Double dema(int arg0, int arg1, com.motivewave.platform.sdk.common.Enums.BarInput arg2, com.motivewave.platform.sdk.common.Instrument arg3);
  
  // Method descriptor #151 (IILjava/lang/Object;)Ljava/lang/Double;
  public abstract java.lang.Double tema(int arg0, int arg1, java.lang.Object arg2);
  
  // Method descriptor #152 (IILcom/motivewave/platform/sdk/common/Enums$BarInput;Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Double;
  public abstract java.lang.Double tema(int arg0, int arg1, com.motivewave.platform.sdk.common.Enums.BarInput arg2, com.motivewave.platform.sdk.common.Instrument arg3);
  
  // Method descriptor #151 (IILjava/lang/Object;)Ljava/lang/Double;
  public abstract java.lang.Double tma(int arg0, int arg1, java.lang.Object arg2);
  
  // Method descriptor #152 (IILcom/motivewave/platform/sdk/common/Enums$BarInput;Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Double;
  public abstract java.lang.Double tma(int arg0, int arg1, com.motivewave.platform.sdk.common.Enums.BarInput arg2, com.motivewave.platform.sdk.common.Instrument arg3);
  
  // Method descriptor #151 (IILjava/lang/Object;)Ljava/lang/Double;
  public abstract java.lang.Double mema(int arg0, int arg1, java.lang.Object arg2);
  
  // Method descriptor #152 (IILcom/motivewave/platform/sdk/common/Enums$BarInput;Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Double;
  public abstract java.lang.Double mema(int arg0, int arg1, com.motivewave.platform.sdk.common.Enums.BarInput arg2, com.motivewave.platform.sdk.common.Instrument arg3);
  
  // Method descriptor #151 (IILjava/lang/Object;)Ljava/lang/Double;
  public abstract java.lang.Double smma(int arg0, int arg1, java.lang.Object arg2);
  
  // Method descriptor #152 (IILcom/motivewave/platform/sdk/common/Enums$BarInput;Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Double;
  public abstract java.lang.Double smma(int arg0, int arg1, com.motivewave.platform.sdk.common.Enums.BarInput arg2, com.motivewave.platform.sdk.common.Instrument arg3);
  
  // Method descriptor #151 (IILjava/lang/Object;)Ljava/lang/Double;
  public abstract java.lang.Double vwma(int arg0, int arg1, java.lang.Object arg2);
  
  // Method descriptor #152 (IILcom/motivewave/platform/sdk/common/Enums$BarInput;Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Double;
  public abstract java.lang.Double vwma(int arg0, int arg1, com.motivewave.platform.sdk.common.Enums.BarInput arg2, com.motivewave.platform.sdk.common.Instrument arg3);
  
  // Method descriptor #151 (IILjava/lang/Object;)Ljava/lang/Double;
  public abstract java.lang.Double kama(int arg0, int arg1, java.lang.Object arg2);
  
  // Method descriptor #152 (IILcom/motivewave/platform/sdk/common/Enums$BarInput;Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Double;
  public abstract java.lang.Double kama(int arg0, int arg1, com.motivewave.platform.sdk.common.Enums.BarInput arg2, com.motivewave.platform.sdk.common.Instrument arg3);
  
  // Method descriptor #166 (IIDLjava/lang/Object;)Ljava/lang/Double;
  public abstract java.lang.Double kama(int arg0, int arg1, double arg2, java.lang.Object arg3);
  
  // Method descriptor #167 (IIDLcom/motivewave/platform/sdk/common/Enums$BarInput;Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Double;
  public abstract java.lang.Double kama(int arg0, int arg1, double arg2, com.motivewave.platform.sdk.common.Enums.BarInput arg3, com.motivewave.platform.sdk.common.Instrument arg4);
  
  // Method descriptor #151 (IILjava/lang/Object;)Ljava/lang/Double;
  public abstract java.lang.Double highest(int arg0, int arg1, java.lang.Object arg2);
  
  // Method descriptor #151 (IILjava/lang/Object;)Ljava/lang/Double;
  public abstract java.lang.Double lowest(int arg0, int arg1, java.lang.Object arg2);
  
  // Method descriptor #80 (Ljava/lang/Object;)Ljava/lang/Double;
  public abstract java.lang.Double highestVisible(java.lang.Object arg0);
  
  // Method descriptor #80 (Ljava/lang/Object;)Ljava/lang/Double;
  public abstract java.lang.Double lowestVisible(java.lang.Object arg0);
  
  // Method descriptor #152 (IILcom/motivewave/platform/sdk/common/Enums$BarInput;Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Double;
  public abstract java.lang.Double highest(int arg0, int arg1, com.motivewave.platform.sdk.common.Enums.BarInput arg2, com.motivewave.platform.sdk.common.Instrument arg3);
  
  // Method descriptor #152 (IILcom/motivewave/platform/sdk/common/Enums$BarInput;Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Double;
  public abstract java.lang.Double lowest(int arg0, int arg1, com.motivewave.platform.sdk.common.Enums.BarInput arg2, com.motivewave.platform.sdk.common.Instrument arg3);
  
  // Method descriptor #172 (IILcom/motivewave/platform/sdk/common/Enums$BarInput;)Ljava/lang/Double;
  public abstract java.lang.Double lowest(int arg0, int arg1, com.motivewave.platform.sdk.common.Enums.BarInput arg2);
  
  // Method descriptor #81 (Lcom/motivewave/platform/sdk/common/Enums$BarInput;Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Double;
  public abstract java.lang.Double highestVisible(com.motivewave.platform.sdk.common.Enums.BarInput arg0, com.motivewave.platform.sdk.common.Instrument arg1);
  
  // Method descriptor #81 (Lcom/motivewave/platform/sdk/common/Enums$BarInput;Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Double;
  public abstract java.lang.Double lowestVisible(com.motivewave.platform.sdk.common.Enums.BarInput arg0, com.motivewave.platform.sdk.common.Instrument arg1);
  
  // Method descriptor #151 (IILjava/lang/Object;)Ljava/lang/Double;
  public abstract java.lang.Double sum(int arg0, int arg1, java.lang.Object arg2);
  
  // Method descriptor #152 (IILcom/motivewave/platform/sdk/common/Enums$BarInput;Lcom/motivewave/platform/sdk/common/Instrument;)Ljava/lang/Double;
  public abstract java.lang.Double sum(int arg0, int arg1, com.motivewave.platform.sdk.common.Enums.BarInput arg2, com.motivewave.platform.sdk.common.Instrument arg3);
  
  // Method descriptor #175 (ZI)Ljava/util/List;
  // Signature: (ZI)Ljava/util/List<Lcom/motivewave/platform/sdk/common/SwingPoint;>;
  public abstract java.util.List calcSwingPoints(boolean arg0, int arg1);
  
  // Method descriptor #178 (ZII)Ljava/util/List;
  // Signature: (ZII)Ljava/util/List<Lcom/motivewave/platform/sdk/common/SwingPoint;>;
  public abstract java.util.List calcSwingPoints(boolean arg0, int arg1, int arg2);
  
  // Method descriptor #180 (I)Ljava/util/List;
  // Signature: (I)Ljava/util/List<Lcom/motivewave/platform/sdk/common/SwingPoint;>;
  public abstract java.util.List calcSwingPoints(int arg0);
  
  // Method descriptor #182 (II)Ljava/util/List;
  // Signature: (II)Ljava/util/List<Lcom/motivewave/platform/sdk/common/SwingPoint;>;
  public abstract java.util.List calcSwingPoints(int arg0, int arg1);
  
  // Method descriptor #70 (ILjava/lang/Object;)Z
  public abstract boolean isSignalTriggered(int arg0, java.lang.Object arg1);
  
  // Method descriptor #69 (ILjava/lang/Object;Z)V
  public abstract void setSignalTriggered(int arg0, java.lang.Object arg1, boolean arg2);
  
  // Method descriptor #70 (ILjava/lang/Object;)Z
  public abstract boolean isPathBreak(int arg0, java.lang.Object arg1);
  
  // Method descriptor #69 (ILjava/lang/Object;Z)V
  public abstract void setPathBreak(int arg0, java.lang.Object arg1, boolean arg2);

  Inner classes:
    [inner class info: #191 com/motivewave/platform/sdk/common/Enums$BarData, outer class info: #193 com/motivewave/platform/sdk/common/Enums
     inner name: #195 BarData, accessflags: 16409 public static final],
    [inner class info: #196 com/motivewave/platform/sdk/common/Enums$BarInput, outer class info: #193 com/motivewave/platform/sdk/common/Enums
     inner name: #198 BarInput, accessflags: 16409 public static final],
    [inner class info: #199 com/motivewave/platform/sdk/common/Enums$MAMethod, outer class info: #193 com/motivewave/platform/sdk/common/Enums
     inner name: #201 MAMethod, accessflags: 16409 public static final]
}
