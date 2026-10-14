// Compiled from Tick.java (version 25 : 69.0, no super bit)
public abstract interface com.motivewave.platform.sdk.common.Tick {
  
  // Method descriptor #6 ()F
  public abstract float getPrice();
  
  // Method descriptor #8 ()I
  public abstract int getVolume();
  
  // Method descriptor #6 ()F
  public abstract float getVolumeAsFloat();
  
  // Method descriptor #6 ()F
  public abstract float getAskPrice();
  
  // Method descriptor #8 ()I
  public abstract int getAskSize();
  
  // Method descriptor #6 ()F
  public abstract float getAskSizeAsFloat();
  
  // Method descriptor #6 ()F
  public abstract float getBidPrice();
  
  // Method descriptor #8 ()I
  public abstract int getBidSize();
  
  // Method descriptor #6 ()F
  public abstract float getBidSizeAsFloat();
  
  // Method descriptor #17 ()J
  public abstract long getTime();
  
  // Method descriptor #19 ()Z
  public abstract boolean isAskTick();
  
  // Method descriptor #20 (Lcom/motivewave/platform/sdk/common/Enums$BarData;)F
  public abstract float getPrice(com.motivewave.platform.sdk.common.Enums.BarData arg0);
  
  // Method descriptor #17 ()J
  public abstract long getExchOrderId();
  
  // Method descriptor #17 ()J
  public abstract long getAggExchOrderId();

  Inner classes:
    [inner class info: #26 com/motivewave/platform/sdk/common/Enums$BarData, outer class info: #28 com/motivewave/platform/sdk/common/Enums
     inner name: #30 BarData, accessflags: 16409 public static final]
}
