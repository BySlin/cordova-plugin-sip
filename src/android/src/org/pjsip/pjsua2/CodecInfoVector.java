/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class CodecInfoVector {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected CodecInfoVector(long cPtr, boolean cMemoryOwn) {
        swigCMemOwn = cMemoryOwn;
        swigCPtr = cPtr;
    }

    public CodecInfoVector() {
        this(pjsua2JNI.new_CodecInfoVector__SWIG_0(), true);
    }

    public CodecInfoVector(long n) {
        this(pjsua2JNI.new_CodecInfoVector__SWIG_1(n), true);
    }

    protected static long getCPtr(CodecInfoVector obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (swigCPtr != 0) {
            if (swigCMemOwn) {
                swigCMemOwn = false;
                pjsua2JNI.delete_CodecInfoVector(swigCPtr);
            }
            swigCPtr = 0;
        }
    }

    public long size() {
        return pjsua2JNI.CodecInfoVector_size(swigCPtr, this);
    }

    public long capacity() {
        return pjsua2JNI.CodecInfoVector_capacity(swigCPtr, this);
    }

    public void reserve(long n) {
        pjsua2JNI.CodecInfoVector_reserve(swigCPtr, this, n);
    }

    public boolean isEmpty() {
        return pjsua2JNI.CodecInfoVector_isEmpty(swigCPtr, this);
    }

    public void clear() {
        pjsua2JNI.CodecInfoVector_clear(swigCPtr, this);
    }

    public void add(CodecInfo x) {
        pjsua2JNI.CodecInfoVector_add(swigCPtr, this, CodecInfo.getCPtr(x), x);
    }

    public CodecInfo get(int i) {
        long cPtr = pjsua2JNI.CodecInfoVector_get(swigCPtr, this, i);
        return (cPtr == 0) ? null : new CodecInfo(cPtr, false);
    }

    public void set(int i, CodecInfo val) {
        pjsua2JNI.CodecInfoVector_set(swigCPtr, this, i, CodecInfo.getCPtr(val), val);
    }

}
