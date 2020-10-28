/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class AudDevManager {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected AudDevManager(long cPtr, boolean cMemoryOwn) {
        swigCMemOwn = cMemoryOwn;
        swigCPtr = cPtr;
    }

    protected static long getCPtr(AudDevManager obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    public synchronized void delete() {
        if (swigCPtr != 0) {
            if (swigCMemOwn) {
                swigCMemOwn = false;
                throw new UnsupportedOperationException("C++ destructor does not have public access");
            }
            swigCPtr = 0;
        }
    }

    public int getCaptureDev() throws java.lang.Exception {
        return pjsua2JNI.AudDevManager_getCaptureDev(swigCPtr, this);
    }

    public void setCaptureDev(int capture_dev) throws java.lang.Exception {
        pjsua2JNI.AudDevManager_setCaptureDev(swigCPtr, this, capture_dev);
    }

    public AudioMedia getCaptureDevMedia() throws java.lang.Exception {
        return new AudioMedia(pjsua2JNI.AudDevManager_getCaptureDevMedia(swigCPtr, this), false);
    }

    public int getPlaybackDev() throws java.lang.Exception {
        return pjsua2JNI.AudDevManager_getPlaybackDev(swigCPtr, this);
    }

    public void setPlaybackDev(int playback_dev) throws java.lang.Exception {
        pjsua2JNI.AudDevManager_setPlaybackDev(swigCPtr, this, playback_dev);
    }

    public AudioMedia getPlaybackDevMedia() throws java.lang.Exception {
        return new AudioMedia(pjsua2JNI.AudDevManager_getPlaybackDevMedia(swigCPtr, this), false);
    }

    public AudioDevInfoVector enumDev() throws java.lang.Exception {
        return new AudioDevInfoVector(pjsua2JNI.AudDevManager_enumDev(swigCPtr, this), false);
    }

    public void setNullDev() throws java.lang.Exception {
        pjsua2JNI.AudDevManager_setNullDev(swigCPtr, this);
    }

    public SWIGTYPE_p_p_void setNoDev() {
        long cPtr = pjsua2JNI.AudDevManager_setNoDev(swigCPtr, this);
        return (cPtr == 0) ? null : new SWIGTYPE_p_p_void(cPtr, false);
    }

    public void setSndDevMode(long mode) throws java.lang.Exception {
        pjsua2JNI.AudDevManager_setSndDevMode(swigCPtr, this, mode);
    }

    public void setEcOptions(long tail_msec, long options) throws java.lang.Exception {
        pjsua2JNI.AudDevManager_setEcOptions(swigCPtr, this, tail_msec, options);
    }

    public long getEcTail() throws java.lang.Exception {
        return pjsua2JNI.AudDevManager_getEcTail(swigCPtr, this);
    }

    public boolean sndIsActive() {
        return pjsua2JNI.AudDevManager_sndIsActive(swigCPtr, this);
    }

    public void refreshDevs() throws java.lang.Exception {
        pjsua2JNI.AudDevManager_refreshDevs(swigCPtr, this);
    }

    public long getDevCount() {
        return pjsua2JNI.AudDevManager_getDevCount(swigCPtr, this);
    }

    public AudioDevInfo getDevInfo(int id) throws java.lang.Exception {
        return new AudioDevInfo(pjsua2JNI.AudDevManager_getDevInfo(swigCPtr, this, id), true);
    }

    public int lookupDev(String drv_name, String dev_name) throws java.lang.Exception {
        return pjsua2JNI.AudDevManager_lookupDev(swigCPtr, this, drv_name, dev_name);
    }

    public String capName(pjmedia_aud_dev_cap cap) {
        return pjsua2JNI.AudDevManager_capName(swigCPtr, this, cap.swigValue());
    }

    public void setExtFormat(MediaFormatAudio format, boolean keep) throws java.lang.Exception {
        pjsua2JNI.AudDevManager_setExtFormat__SWIG_0(swigCPtr, this, MediaFormatAudio.getCPtr(format), format, keep);
    }

    public MediaFormatAudio getExtFormat() throws java.lang.Exception {
        return new MediaFormatAudio(pjsua2JNI.AudDevManager_getExtFormat(swigCPtr, this), true);
    }

    public void setExtFormat(MediaFormatAudio format) throws java.lang.Exception {
        pjsua2JNI.AudDevManager_setExtFormat__SWIG_1(swigCPtr, this, MediaFormatAudio.getCPtr(format), format);
    }

    public void setInputLatency(long latency_msec, boolean keep) throws java.lang.Exception {
        pjsua2JNI.AudDevManager_setInputLatency__SWIG_0(swigCPtr, this, latency_msec, keep);
    }

    public long getInputLatency() throws java.lang.Exception {
        return pjsua2JNI.AudDevManager_getInputLatency(swigCPtr, this);
    }

    public void setInputLatency(long latency_msec) throws java.lang.Exception {
        pjsua2JNI.AudDevManager_setInputLatency__SWIG_1(swigCPtr, this, latency_msec);
    }

    public void setOutputLatency(long latency_msec, boolean keep) throws java.lang.Exception {
        pjsua2JNI.AudDevManager_setOutputLatency__SWIG_0(swigCPtr, this, latency_msec, keep);
    }

    public long getOutputLatency() throws java.lang.Exception {
        return pjsua2JNI.AudDevManager_getOutputLatency(swigCPtr, this);
    }

    public void setOutputLatency(long latency_msec) throws java.lang.Exception {
        pjsua2JNI.AudDevManager_setOutputLatency__SWIG_1(swigCPtr, this, latency_msec);
    }

    public void setInputVolume(long volume, boolean keep) throws java.lang.Exception {
        pjsua2JNI.AudDevManager_setInputVolume__SWIG_0(swigCPtr, this, volume, keep);
    }

    public long getInputVolume() throws java.lang.Exception {
        return pjsua2JNI.AudDevManager_getInputVolume(swigCPtr, this);
    }

    public void setInputVolume(long volume) throws java.lang.Exception {
        pjsua2JNI.AudDevManager_setInputVolume__SWIG_1(swigCPtr, this, volume);
    }

    public void setOutputVolume(long volume, boolean keep) throws java.lang.Exception {
        pjsua2JNI.AudDevManager_setOutputVolume__SWIG_0(swigCPtr, this, volume, keep);
    }

    public long getOutputVolume() throws java.lang.Exception {
        return pjsua2JNI.AudDevManager_getOutputVolume(swigCPtr, this);
    }

    public void setOutputVolume(long volume) throws java.lang.Exception {
        pjsua2JNI.AudDevManager_setOutputVolume__SWIG_1(swigCPtr, this, volume);
    }

    public long getInputSignal() throws java.lang.Exception {
        return pjsua2JNI.AudDevManager_getInputSignal(swigCPtr, this);
    }

    public long getOutputSignal() throws java.lang.Exception {
        return pjsua2JNI.AudDevManager_getOutputSignal(swigCPtr, this);
    }

    public void setInputRoute(pjmedia_aud_dev_route route, boolean keep) throws java.lang.Exception {
        pjsua2JNI.AudDevManager_setInputRoute__SWIG_0(swigCPtr, this, route.swigValue(), keep);
    }

    public pjmedia_aud_dev_route getInputRoute() throws java.lang.Exception {
        return pjmedia_aud_dev_route.swigToEnum(pjsua2JNI.AudDevManager_getInputRoute(swigCPtr, this));
    }

    public void setInputRoute(pjmedia_aud_dev_route route) throws java.lang.Exception {
        pjsua2JNI.AudDevManager_setInputRoute__SWIG_1(swigCPtr, this, route.swigValue());
    }

    public void setOutputRoute(pjmedia_aud_dev_route route, boolean keep) throws java.lang.Exception {
        pjsua2JNI.AudDevManager_setOutputRoute__SWIG_0(swigCPtr, this, route.swigValue(), keep);
    }

    public pjmedia_aud_dev_route getOutputRoute() throws java.lang.Exception {
        return pjmedia_aud_dev_route.swigToEnum(pjsua2JNI.AudDevManager_getOutputRoute(swigCPtr, this));
    }

    public void setOutputRoute(pjmedia_aud_dev_route route) throws java.lang.Exception {
        pjsua2JNI.AudDevManager_setOutputRoute__SWIG_1(swigCPtr, this, route.swigValue());
    }

    public void setVad(boolean enable, boolean keep) throws java.lang.Exception {
        pjsua2JNI.AudDevManager_setVad__SWIG_0(swigCPtr, this, enable, keep);
    }

    public boolean getVad() throws java.lang.Exception {
        return pjsua2JNI.AudDevManager_getVad(swigCPtr, this);
    }

    public void setVad(boolean enable) throws java.lang.Exception {
        pjsua2JNI.AudDevManager_setVad__SWIG_1(swigCPtr, this, enable);
    }

    public void setCng(boolean enable, boolean keep) throws java.lang.Exception {
        pjsua2JNI.AudDevManager_setCng__SWIG_0(swigCPtr, this, enable, keep);
    }

    public boolean getCng() throws java.lang.Exception {
        return pjsua2JNI.AudDevManager_getCng(swigCPtr, this);
    }

    public void setCng(boolean enable) throws java.lang.Exception {
        pjsua2JNI.AudDevManager_setCng__SWIG_1(swigCPtr, this, enable);
    }

    public void setPlc(boolean enable, boolean keep) throws java.lang.Exception {
        pjsua2JNI.AudDevManager_setPlc__SWIG_0(swigCPtr, this, enable, keep);
    }

    public boolean getPlc() throws java.lang.Exception {
        return pjsua2JNI.AudDevManager_getPlc(swigCPtr, this);
    }

    public void setPlc(boolean enable) throws java.lang.Exception {
        pjsua2JNI.AudDevManager_setPlc__SWIG_1(swigCPtr, this, enable);
    }

}
