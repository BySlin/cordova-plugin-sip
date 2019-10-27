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
import org.json.JSONObject;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Sip extends CordovaPlugin {

    private Context mContext;

    private final String SET_ACCOUNT_ACTION = "setAccount";
    private final String REMOVE_ACCOUNT_ACTION = "removeAccount";
    private final String MAKE_CALL_ACTION = "makeCall";
    private final String HANG_UP_CALL_ACTION = "hangUpCall";
    private final String GET_REGISTRATION_STATUS_ACTION = "getRegistrationStatus";
    private final String SEND_DTMF_ACTION = "sendDTMF";
    private final String ACCEPT_INCOMING_CALL = "acceptIncomingCall";
    private final String TRANSFER_CALL = "transferCall";

    private static CallbackContext mCallbackContext;

    private final Set<String> idUris = new HashSet<>();

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
            int regExpirationTimeout = args.getInt(4);
            boolean isTcp = args.getBoolean(5);
            SipAccountData sipAccountData = new SipAccountData()
                    .setUsername(username)
                    .setPassword(password)
                    .setHost(host)
                    .setRealm(host)
                    .setPort(port)
                    .setRegExpirationTimeout(regExpirationTimeout)
                    .setTcpTransport(isTcp);
            idUris.add(sipAccountData.getIdUri());
            SipServiceCommand.setAccount(mContext, sipAccountData);
            mCallbackContext = callbackContext;
            return true;
        } else if (REMOVE_ACCOUNT_ACTION.equals(action)) {
            String accountID = args.getString(0);
            SipServiceCommand.removeAccount(mContext, accountID);
            return true;
        } else if (MAKE_CALL_ACTION.equals(action)) {
            String accountID = args.getString(0);
            String number = args.getString(1);
            SipServiceCommand.makeCall(mContext, accountID, number);
            return true;
        } else if (HANG_UP_CALL_ACTION.equals(action)) {
            String accountID = args.getString(0);
            int callId = args.getInt(1);
            SipServiceCommand.hangUpCall(mContext, accountID, callId);
            return true;
        } else if (GET_REGISTRATION_STATUS_ACTION.equals(action)) {
            String accountID = args.getString(0);
            SipServiceCommand.getRegistrationStatus(mContext, accountID);
            return true;
        } else if (SEND_DTMF_ACTION.equals(action)) {
            String accountID = args.getString(0);
            int callId = args.getInt(1);
            String dtmf = args.getString(2);
            SipServiceCommand.sendDTMF(mContext, accountID, callId, dtmf);
            return true;
        } else if (ACCEPT_INCOMING_CALL.equals(action)) {
            String accountID = args.getString(0);
            int callId = args.getInt(1);
            SipServiceCommand.acceptIncomingCall(mContext, accountID, callId);
            return true;
        } else if (TRANSFER_CALL.equals(action)) {
            String accountID = args.getString(0);
            int callId = args.getInt(1);
            String number = args.getString(2);
            SipServiceCommand.transferCall(mContext, accountID, callId, number);
            return true;
        }
        return false;
    }

    @Override
    public void onDestroy() {
        for (String key : idUris) {
            SipServiceCommand.removeAccount(mContext, key);
        }
    }

    public static void sendPluginResult(JSONObject jsonObject) {
        PluginResult pluginResult = new PluginResult(PluginResult.Status.OK, jsonObject);
        pluginResult.setKeepCallback(true);
        if (mCallbackContext != null) {
            mCallbackContext.sendPluginResult(pluginResult);
        }
    }
}
