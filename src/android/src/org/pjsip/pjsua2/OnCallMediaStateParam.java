/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class OnCallMediaStateParam {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected OnCallMediaStateParam(long cPtr, boolean cMemoryOwn) {
        swigCMemOwn = cMemoryOwn;
        swigCPtr = cPtr;
    }

    public OnCallMediaStateParam() {
        this(pjsua2JNI.new_OnCallMediaStateParam(), true);
    }

    protected static long getCPtr(OnCallMediaStateParam obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (swigCPtr != 0) {
            if (swigCMemOwn) {
                swigCMemOwn = false;
                pjsua2JNI.delete_OnCallMediaStateParam(swigCPtr);
            }
            swigCPtr = 0;
        }
    }

}
