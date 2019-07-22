package com.byslin.sip;

import android.content.Context;

import net.gotev.sipservice.SipAccountData;
import net.gotev.sipservice.SipServiceCommand;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

public class Sip extends CordovaPlugin {

    private Context mContext;

    private String SET_ACCOUNT_ACTION = "setAccount";
    private String MAKE_CALL_ACTION = "makeCall";
    private String HANG_UP_CALL_ACTION = "hangUpCall";
    private String GET_REGISTRATION_STATUS_ACTION = "getRegistrationStatus";
    private String SEND_DTMF_ACTION = "sendDTMF";

    private SipAccountData currentSipAccount;

    private static CallbackContext mCallbackContext;

    private static int callId;

    public static void setCallId(int callId) {
        Sip.callId = callId;
    }

    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        mContext = cordova.getActivity();
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (SET_ACCOUNT_ACTION.equals(action)) {
            String username = args.getString(0);
            String password = args.getString(1);
            String host = args.getString(2);
            int port = args.getInt(3);
            if (currentSipAccount != null) {
                SipServiceCommand.removeAccount(mContext, currentSipAccount.getIdUri());
            }
            currentSipAccount = new SipAccountData()
                    .setUsername(username)
                    .setPassword(password)
                    .setHost(host)
                    .setRealm(host)
                    .setPort(port);
            SipServiceCommand.setAccount(mContext, currentSipAccount);
            mCallbackContext = callbackContext;
            return true;
        } else if (MAKE_CALL_ACTION.equals(action)) {
            String number = args.getString(0);
            SipServiceCommand.makeCall(mContext, currentSipAccount.getIdUri(), number);
            return true;
        } else if (HANG_UP_CALL_ACTION.equals(action)) {
            SipServiceCommand.hangUpCall(mContext, currentSipAccount.getIdUri(), callId);
            return true;
        } else if (GET_REGISTRATION_STATUS_ACTION.equals(action)) {
            SipServiceCommand.getRegistrationStatus(mContext, currentSipAccount.getIdUri());
            return true;
        } else if (SEND_DTMF_ACTION.equals(action)) {
            String dtmf = args.getString(0);
            SipServiceCommand.sendDTMF(mContext, currentSipAccount.getIdUri(), callId, dtmf);
            return true;
        }
        return false;
    }

    @Override
    public void onDestroy() {
        if (currentSipAccount != null) {
            SipServiceCommand.removeAccount(mContext, currentSipAccount.getIdUri());
            currentSipAccount = null;
        }
    }

    public static void sendPluginResult(PluginResult pluginResult) {
        pluginResult.setKeepCallback(true);
        if (mCallbackContext != null) {
            mCallbackContext.sendPluginResult(pluginResult);
        }
    }
}
