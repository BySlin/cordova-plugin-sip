/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class OnIncomingSubscribeParam {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected OnIncomingSubscribeParam(long cPtr, boolean cMemoryOwn) {
        swigCMemOwn = cMemoryOwn;
        swigCPtr = cPtr;
    }

    public OnIncomingSubscribeParam() {
        this(pjsua2JNI.new_OnIncomingSubscribeParam(), true);
    }

    protected static long getCPtr(OnIncomingSubscribeParam obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (swigCPtr != 0) {
            if (swigCMemOwn) {
                swigCMemOwn = false;
                pjsua2JNI.delete_OnIncomingSubscribeParam(swigCPtr);
            }
            swigCPtr = 0;
        }
    }

    public SWIGTYPE_p_void getSrvPres() {
        long cPtr = pjsua2JNI.OnIncomingSubscribeParam_srvPres_get(swigCPtr, this);
        return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
    }

    public void setSrvPres(SWIGTYPE_p_void value) {
        pjsua2JNI.OnIncomingSubscribeParam_srvPres_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
    }

    public String getFromUri() {
        return pjsua2JNI.OnIncomingSubscribeParam_fromUri_get(swigCPtr, this);
    }

    public void setFromUri(String value) {
        pjsua2JNI.OnIncomingSubscribeParam_fromUri_set(swigCPtr, this, value);
    }

    public SipRxData getRdata() {
        long cPtr = pjsua2JNI.OnIncomingSubscribeParam_rdata_get(swigCPtr, this);
        return (cPtr == 0) ? null : new SipRxData(cPtr, false);
    }

    public void setRdata(SipRxData value) {
        pjsua2JNI.OnIncomingSubscribeParam_rdata_set(swigCPtr, this, SipRxData.getCPtr(value), value);
    }

    public pjsip_status_code getCode() {
        return pjsip_status_code.swigToEnum(pjsua2JNI.OnIncomingSubscribeParam_code_get(swigCPtr, this));
    }

    public void setCode(pjsip_status_code value) {
        pjsua2JNI.OnIncomingSubscribeParam_code_set(swigCPtr, this, value.swigValue());
    }

    public String getReason() {
        return pjsua2JNI.OnIncomingSubscribeParam_reason_get(swigCPtr, this);
    }

    public void setReason(String value) {
        pjsua2JNI.OnIncomingSubscribeParam_reason_set(swigCPtr, this, value);
    }

    public SipTxOption getTxOption() {
        long cPtr = pjsua2JNI.OnIncomingSubscribeParam_txOption_get(swigCPtr, this);
        return (cPtr == 0) ? null : new SipTxOption(cPtr, false);
    }

    public void setTxOption(SipTxOption value) {
        pjsua2JNI.OnIncomingSubscribeParam_txOption_set(swigCPtr, this, SipTxOption.getCPtr(value), value);
    }

}
