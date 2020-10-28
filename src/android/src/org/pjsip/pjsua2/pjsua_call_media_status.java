/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public final class pjsua_call_media_status {
    public final static pjsua_call_media_status PJSUA_CALL_MEDIA_NONE = new pjsua_call_media_status("PJSUA_CALL_MEDIA_NONE");
    public final static pjsua_call_media_status PJSUA_CALL_MEDIA_ACTIVE = new pjsua_call_media_status("PJSUA_CALL_MEDIA_ACTIVE");
    public final static pjsua_call_media_status PJSUA_CALL_MEDIA_LOCAL_HOLD = new pjsua_call_media_status("PJSUA_CALL_MEDIA_LOCAL_HOLD");
    public final static pjsua_call_media_status PJSUA_CALL_MEDIA_REMOTE_HOLD = new pjsua_call_media_status("PJSUA_CALL_MEDIA_REMOTE_HOLD");
    public final static pjsua_call_media_status PJSUA_CALL_MEDIA_ERROR = new pjsua_call_media_status("PJSUA_CALL_MEDIA_ERROR");
    private static pjsua_call_media_status[] swigValues = {PJSUA_CALL_MEDIA_NONE, PJSUA_CALL_MEDIA_ACTIVE, PJSUA_CALL_MEDIA_LOCAL_HOLD, PJSUA_CALL_MEDIA_REMOTE_HOLD, PJSUA_CALL_MEDIA_ERROR};
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;

    private pjsua_call_media_status(String swigName) {
        this.swigName = swigName;
        this.swigValue = swigNext++;
    }

    private pjsua_call_media_status(String swigName, int swigValue) {
        this.swigName = swigName;
        this.swigValue = swigValue;
        swigNext = swigValue + 1;
    }

    private pjsua_call_media_status(String swigName, pjsua_call_media_status swigEnum) {
        this.swigName = swigName;
        this.swigValue = swigEnum.swigValue;
        swigNext = this.swigValue + 1;
    }

    public static pjsua_call_media_status swigToEnum(int swigValue) {
        if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
            return swigValues[swigValue];
        for (int i = 0; i < swigValues.length; i++)
            if (swigValues[i].swigValue == swigValue)
                return swigValues[i];
        throw new IllegalArgumentException("No enum " + pjsua_call_media_status.class + " with value " + swigValue);
    }

    public final int swigValue() {
        return swigValue;
    }

    public String toString() {
        return swigName;
    }
}

