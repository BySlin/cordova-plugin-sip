function Sip(
  username,
  password,
  host,
  port,
  regExpirationTimeout,
  isTcp,
  listener
) {
  this.accountID = "";
  this.callID = "";

  this.onEvent = function(data) {
    if (data.callID) {
      this.callID = data.callID;
    }
    if (data.accountID) {
      this.accountID = data.accountID;
    }
    listener(data);
  };

  this.makeCall = function(number) {
    cordova.exec(null, null, "Sip", "makeCall", [this.accountID, number]);
  };

  this.hangUpCall = function() {
    cordova.exec(null, null, "Sip", "hangUpCall", [
      this.accountID,
      this.callID
    ]);
  };

  this.getRegistrationStatus = function() {
    cordova.exec(null, null, "Sip", "getRegistrationStatus", [this.accountID]);
  };

  this.sendDTMF = function(dtmf) {
    cordova.exec(null, null, "Sip", "sendDTMF", [
      this.accountID,
      this.callID,
      dtmf
    ]);
  };

  this.acceptIncomingCall = function() {
    cordova.exec(null, null, "Sip", "acceptIncomingCall", [
      this.accountID,
      this.callID
    ]);
  };

  this.transferCall = function(number) {
    cordova.exec(null, null, "Sip", "transferCall", [
      this.accountID,
      this.callID,
      number
    ]);
  };

  this.unregister = function() {
    cordova.exec(null, null, "Sip", "removeAccount", [this.accountID]);
  };

  cordova.exec(this.onEvent, null, "Sip", "setAccount", [
    username,
    password,
    host,
    port,
    regExpirationTimeout,
    isTcp
  ]);
}

module.exports = Sip;
