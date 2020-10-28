/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class SipHeaderVector {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected SipHeaderVector(long cPtr, boolean cMemoryOwn) {
        swigCMemOwn = cMemoryOwn;
        swigCPtr = cPtr;
    }

    public SipHeaderVector() {
        this(pjsua2JNI.new_SipHeaderVector__SWIG_0(), true);
    }

    public SipHeaderVector(long n) {
        this(pjsua2JNI.new_SipHeaderVector__SWIG_1(n), true);
    }

    protected static long getCPtr(SipHeaderVector obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (swigCPtr != 0) {
            if (swigCMemOwn) {
                swigCMemOwn = false;
                pjsua2JNI.delete_SipHeaderVector(swigCPtr);
            }
            swigCPtr = 0;
        }
    }

    public long size() {
        return pjsua2JNI.SipHeaderVector_size(swigCPtr, this);
    }

    public long capacity() {
        return pjsua2JNI.SipHeaderVector_capacity(swigCPtr, this);
    }

    public void reserve(long n) {
        pjsua2JNI.SipHeaderVector_reserve(swigCPtr, this, n);
    }

    public boolean isEmpty() {
        return pjsua2JNI.SipHeaderVector_isEmpty(swigCPtr, this);
    }

    public void clear() {
        pjsua2JNI.SipHeaderVector_clear(swigCPtr, this);
    }

    public void add(SipHeader x) {
        pjsua2JNI.SipHeaderVector_add(swigCPtr, this, SipHeader.getCPtr(x), x);
    }

    public SipHeader get(int i) {
        return new SipHeader(pjsua2JNI.SipHeaderVector_get(swigCPtr, this, i), false);
    }

    public void set(int i, SipHeader val) {
        pjsua2JNI.SipHeaderVector_set(swigCPtr, this, i, SipHeader.getCPtr(val), val);
    }

}
