function Sip(
  username,
  password,
  host,
  port,
  realm,
  regExpirationTimeout,
  isTcp,
  listener
) {
  var accountID = "";
  var callID = "";

  this.onEvent = function(data) {
    if (data.callID != null) {
      callID = data.callID;
    }
    if (data.accountID != null) {
      accountID = data.accountID;
    }
    listener(data);
  };

  this.makeCall = function(number) {
    cordova.exec(null, null, "Sip", "makeCall", [accountID, number]);
  };

  this.hangUpCall = function() {
    cordova.exec(null, null, "Sip", "hangUpCall", [accountID, callID]);
  };

  this.hangUpCalls = function () {
    cordova.exec(null, null, "Sip", "hangUpActiveCalls", [accountID]);
  };

  this.getRegistrationStatus = function() {
    cordova.exec(null, null, "Sip", "getRegistrationStatus", [accountID]);
  };

  this.sendDTMF = function(dtmf) {
    cordova.exec(null, null, "Sip", "sendDTMF", [accountID, callID, dtmf]);
  };

  this.acceptIncomingCall = function() {
    cordova.exec(null, null, "Sip", "acceptIncomingCall", [accountID, callID]);
  };

  this.transferCall = function(number) {
    cordova.exec(null, null, "Sip", "transferCall", [
      accountID,
      callID,
      number
    ]);
  };

  this.unregister = function() {
    cordova.exec(null, null, "Sip", "removeAccount", [accountID]);
  };

  cordova.exec(this.onEvent, null, "Sip", "setAccount", [
    username,
    password,
    host,
    port,
    realm,
    regExpirationTimeout,
    isTcp
  ]);
}

module.exports = Sip;
