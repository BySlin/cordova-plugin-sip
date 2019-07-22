/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public final class pjsip_tsx_state_e {
    public final static pjsip_tsx_state_e PJSIP_TSX_STATE_NULL = new pjsip_tsx_state_e("PJSIP_TSX_STATE_NULL");
    public final static pjsip_tsx_state_e PJSIP_TSX_STATE_CALLING = new pjsip_tsx_state_e("PJSIP_TSX_STATE_CALLING");
    public final static pjsip_tsx_state_e PJSIP_TSX_STATE_TRYING = new pjsip_tsx_state_e("PJSIP_TSX_STATE_TRYING");
    public final static pjsip_tsx_state_e PJSIP_TSX_STATE_PROCEEDING = new pjsip_tsx_state_e("PJSIP_TSX_STATE_PROCEEDING");
    public final static pjsip_tsx_state_e PJSIP_TSX_STATE_COMPLETED = new pjsip_tsx_state_e("PJSIP_TSX_STATE_COMPLETED");
    public final static pjsip_tsx_state_e PJSIP_TSX_STATE_CONFIRMED = new pjsip_tsx_state_e("PJSIP_TSX_STATE_CONFIRMED");
    public final static pjsip_tsx_state_e PJSIP_TSX_STATE_TERMINATED = new pjsip_tsx_state_e("PJSIP_TSX_STATE_TERMINATED");
    public final static pjsip_tsx_state_e PJSIP_TSX_STATE_DESTROYED = new pjsip_tsx_state_e("PJSIP_TSX_STATE_DESTROYED");
    public final static pjsip_tsx_state_e PJSIP_TSX_STATE_MAX = new pjsip_tsx_state_e("PJSIP_TSX_STATE_MAX");
    private static pjsip_tsx_state_e[] swigValues = {PJSIP_TSX_STATE_NULL, PJSIP_TSX_STATE_CALLING, PJSIP_TSX_STATE_TRYING, PJSIP_TSX_STATE_PROCEEDING, PJSIP_TSX_STATE_COMPLETED, PJSIP_TSX_STATE_CONFIRMED, PJSIP_TSX_STATE_TERMINATED, PJSIP_TSX_STATE_DESTROYED, PJSIP_TSX_STATE_MAX};
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;

    private pjsip_tsx_state_e(String swigName) {
        this.swigName = swigName;
        this.swigValue = swigNext++;
    }

    private pjsip_tsx_state_e(String swigName, int swigValue) {
        this.swigName = swigName;
        this.swigValue = swigValue;
        swigNext = swigValue + 1;
    }

    private pjsip_tsx_state_e(String swigName, pjsip_tsx_state_e swigEnum) {
        this.swigName = swigName;
        this.swigValue = swigEnum.swigValue;
        swigNext = this.swigValue + 1;
    }

    public static pjsip_tsx_state_e swigToEnum(int swigValue) {
        if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
            return swigValues[swigValue];
        for (int i = 0; i < swigValues.length; i++)
            if (swigValues[i].swigValue == swigValue)
                return swigValues[i];
        throw new IllegalArgumentException("No enum " + pjsip_tsx_state_e.class + " with value " + swigValue);
    }

    public final int swigValue() {
        return swigValue;
    }

    public String toString() {
        return swigName;
    }
}

