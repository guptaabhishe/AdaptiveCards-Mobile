/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class RatingLabelParser extends BaseCardElementParser {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected RatingLabelParser(long cPtr, boolean cMemoryOwn) {
    super(AdaptiveCardObjectModelJNI.RatingLabelParser_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RatingLabelParser obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwnDerived = own;
    super.swigSetCMemOwn(own);
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        AdaptiveCardObjectModelJNI.delete_RatingLabelParser(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RatingLabelParser() {
    this(AdaptiveCardObjectModelJNI.new_RatingLabelParser__SWIG_0(), true);
  }

  public RatingLabelParser(RatingLabelParser arg0) {
    this(AdaptiveCardObjectModelJNI.new_RatingLabelParser__SWIG_1(RatingLabelParser.getCPtr(arg0), arg0), true);
  }

  public BaseCardElement Deserialize(ParseContext context, JsonValue root) {
    long cPtr = AdaptiveCardObjectModelJNI.RatingLabelParser_Deserialize(swigCPtr, this, ParseContext.getCPtr(context), context, JsonValue.getCPtr(root), root);
    return (cPtr == 0) ? null : new BaseCardElement(cPtr, true);
  }

  public BaseCardElement DeserializeFromString(ParseContext context, String jsonString) {
    long cPtr = AdaptiveCardObjectModelJNI.RatingLabelParser_DeserializeFromString(swigCPtr, this, ParseContext.getCPtr(context), context, jsonString);
    return (cPtr == 0) ? null : new BaseCardElement(cPtr, true);
  }

}
