package com.byslin.sip;

import net.gotev.sipservice.BroadcastEventReceiver;

public class SipBroadcastEventReceiver extends BroadcastEventReceiver {
  @Override
  public void onRegistration(String accountID, int registrationStateCode) {
    super.onRegistration(accountID, registrationStateCode);
    Sip.sendPluginResult(accountID, JSONResult.builder()
      .put("action", "onRegistration")
      .put("accountID", accountID)
      .put("registrationStateCode", registrationStateCode)
      .build());
  }

  @Override
  public void onIncomingCall(String accountID, int callID, String displayName, String remoteUri, boolean isVideo) {
    super.onIncomingCall(accountID, callID, displayName, remoteUri, isVideo);
    Sip.sendPluginResult(accountID, JSONResult.builder()
      .put("action", "onIncomingCall")
      .put("accountID", accountID)
      .put("callID", callID)
      .put("displayName", displayName)
      .put("remoteUri", remoteUri)
      .build());
  }

  @Override
  public void onCallState(String accountID, int callID, int callStateCode, int callStatusCode, long connectTimestamp, boolean isLocalHold, boolean isLocalMute, boolean isLocalVideoMute) {
    super.onCallState(accountID, callID, callStateCode, callStatusCode, connectTimestamp, isLocalHold, isLocalMute, isLocalVideoMute);
    Sip.sendPluginResult(accountID, JSONResult.builder()
      .put("action", "onCallState")
      .put("accountID", accountID)
      .put("callID", callID)
      .put("callStateCode", callStateCode)
      .put("callStatusCode", callStatusCode)
      .put("connectTimestamp", connectTimestamp)
      .put("isLocalHold", isLocalHold)
      .put("isLocalMute", isLocalMute)
      .put("isLocalVideoMute", isLocalVideoMute)
      .build());
  }

  @Override
  public void onOutgoingCall(String accountID, int callID, String number, boolean isVideo, boolean isVideoConference) {
    super.onOutgoingCall(accountID, callID, number, isVideo, isVideoConference);
    Sip.sendPluginResult(accountID, JSONResult.builder()
      .put("action", "onOutgoingCall")
      .put("accountID", accountID)
      .put("callID", callID)
      .put("number", number)
      .build());
  }
}
