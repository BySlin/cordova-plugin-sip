/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class OnCallTsxStateParam {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected OnCallTsxStateParam(long cPtr, boolean cMemoryOwn) {
        swigCMemOwn = cMemoryOwn;
        swigCPtr = cPtr;
    }

    public OnCallTsxStateParam() {
        this(pjsua2JNI.new_OnCallTsxStateParam(), true);
    }

    protected static long getCPtr(OnCallTsxStateParam obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (swigCPtr != 0) {
            if (swigCMemOwn) {
                swigCMemOwn = false;
                pjsua2JNI.delete_OnCallTsxStateParam(swigCPtr);
            }
            swigCPtr = 0;
        }
    }

    public SipEvent getE() {
        long cPtr = pjsua2JNI.OnCallTsxStateParam_e_get(swigCPtr, this);
        return (cPtr == 0) ? null : new SipEvent(cPtr, false);
    }

    public void setE(SipEvent value) {
        pjsua2JNI.OnCallTsxStateParam_e_set(swigCPtr, this, SipEvent.getCPtr(value), value);
    }

}
