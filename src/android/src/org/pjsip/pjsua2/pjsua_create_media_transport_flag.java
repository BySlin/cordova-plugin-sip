/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public final class pjsua_create_media_transport_flag {
    public final static pjsua_create_media_transport_flag PJSUA_MED_TP_CLOSE_MEMBER = new pjsua_create_media_transport_flag("PJSUA_MED_TP_CLOSE_MEMBER", pjsua2JNI.PJSUA_MED_TP_CLOSE_MEMBER_get());
    private static pjsua_create_media_transport_flag[] swigValues = {PJSUA_MED_TP_CLOSE_MEMBER};
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;

    private pjsua_create_media_transport_flag(String swigName) {
        this.swigName = swigName;
        this.swigValue = swigNext++;
    }

    private pjsua_create_media_transport_flag(String swigName, int swigValue) {
        this.swigName = swigName;
        this.swigValue = swigValue;
        swigNext = swigValue + 1;
    }

    private pjsua_create_media_transport_flag(String swigName, pjsua_create_media_transport_flag swigEnum) {
        this.swigName = swigName;
        this.swigValue = swigEnum.swigValue;
        swigNext = this.swigValue + 1;
    }

    public static pjsua_create_media_transport_flag swigToEnum(int swigValue) {
        if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
            return swigValues[swigValue];
        for (int i = 0; i < swigValues.length; i++)
            if (swigValues[i].swigValue == swigValue)
                return swigValues[i];
        throw new IllegalArgumentException("No enum " + pjsua_create_media_transport_flag.class + " with value " + swigValue);
    }

    public final int swigValue() {
        return swigValue;
    }

    public String toString() {
        return swigName;
    }
}

