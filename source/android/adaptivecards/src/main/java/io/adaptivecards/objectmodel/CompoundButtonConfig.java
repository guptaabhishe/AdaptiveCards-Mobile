/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class CompoundButtonConfig {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CompoundButtonConfig(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CompoundButtonConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_CompoundButtonConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBadgeConfig(BadgeConfig value) {
    AdaptiveCardObjectModelJNI.CompoundButtonConfig_badgeConfig_set(swigCPtr, this, BadgeConfig.getCPtr(value), value);
  }

  public BadgeConfig getBadgeConfig() {
    long cPtr = AdaptiveCardObjectModelJNI.CompoundButtonConfig_badgeConfig_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BadgeConfig(cPtr, false);
  }

  public static CompoundButtonConfig Deserialize(JsonValue json, CompoundButtonConfig defaultValue) {
    return new CompoundButtonConfig(AdaptiveCardObjectModelJNI.CompoundButtonConfig_Deserialize(JsonValue.getCPtr(json), json, CompoundButtonConfig.getCPtr(defaultValue), defaultValue), true);
  }

  public CompoundButtonConfig() {
    this(AdaptiveCardObjectModelJNI.new_CompoundButtonConfig(), true);
  }

}