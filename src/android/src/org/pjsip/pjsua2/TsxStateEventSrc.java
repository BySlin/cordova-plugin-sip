/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class TsxStateEventSrc {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected TsxStateEventSrc(long cPtr, boolean cMemoryOwn) {
        swigCMemOwn = cMemoryOwn;
        swigCPtr = cPtr;
    }

    public TsxStateEventSrc() {
        this(pjsua2JNI.new_TsxStateEventSrc(), true);
    }

    protected static long getCPtr(TsxStateEventSrc obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (swigCPtr != 0) {
            if (swigCMemOwn) {
                swigCMemOwn = false;
                pjsua2JNI.delete_TsxStateEventSrc(swigCPtr);
            }
            swigCPtr = 0;
        }
    }

    public SipRxData getRdata() {
        long cPtr = pjsua2JNI.TsxStateEventSrc_rdata_get(swigCPtr, this);
        return (cPtr == 0) ? null : new SipRxData(cPtr, false);
    }

    public void setRdata(SipRxData value) {
        pjsua2JNI.TsxStateEventSrc_rdata_set(swigCPtr, this, SipRxData.getCPtr(value), value);
    }

    public SipTxData getTdata() {
        long cPtr = pjsua2JNI.TsxStateEventSrc_tdata_get(swigCPtr, this);
        return (cPtr == 0) ? null : new SipTxData(cPtr, false);
    }

    public void setTdata(SipTxData value) {
        pjsua2JNI.TsxStateEventSrc_tdata_set(swigCPtr, this, SipTxData.getCPtr(value), value);
    }

    public SWIGTYPE_p_void getTimer() {
        long cPtr = pjsua2JNI.TsxStateEventSrc_timer_get(swigCPtr, this);
        return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
    }

    public void setTimer(SWIGTYPE_p_void value) {
        pjsua2JNI.TsxStateEventSrc_timer_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
    }

    public int getStatus() {
        return pjsua2JNI.TsxStateEventSrc_status_get(swigCPtr, this);
    }

    public void setStatus(int value) {
        pjsua2JNI.TsxStateEventSrc_status_set(swigCPtr, this, value);
    }

    public SWIGTYPE_p_void getData() {
        long cPtr = pjsua2JNI.TsxStateEventSrc_data_get(swigCPtr, this);
        return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
    }

    public void setData(SWIGTYPE_p_void value) {
        pjsua2JNI.TsxStateEventSrc_data_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
    }

}
