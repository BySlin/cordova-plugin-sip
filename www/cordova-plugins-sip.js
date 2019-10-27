function Sip(
  username,
  password,
  host,
  port,
  regExpirationTimeout,
  isTcp,
  listener
) {
  this.listener = listener;

  cordova.exec(this.onEvent, null, "Sip", "setAccount", [
    username,
    password,
    host,
    port,
    regExpirationTimeout,
    isTcp
  ]);
}

Sip.prototype.accountID = "";
Sip.prototype.callID = "";

Sip.prototype.onEvent = function(data) {
  if (data.callID) {
    this.callID = data.callID;
  }
  if (data.accountID) {
    this.accountID = data.accountID;
  }
  this.listener(data);
};

Sip.prototype.makeCall = function(number) {
  cordova.exec(null, null, "Sip", "makeCall", [this.accountID, number]);
};

Sip.prototype.hangUpCall = function() {
  cordova.exec(null, null, "Sip", "hangUpCall", [this.accountID, this.callID]);
};

Sip.prototype.getRegistrationStatus = function() {
  cordova.exec(null, null, "Sip", "getRegistrationStatus", [this.accountID]);
};

Sip.prototype.sendDTMF = function(dtmf) {
  cordova.exec(null, null, "Sip", "sendDTMF", [
    this.accountID,
    this.callID,
    dtmf
  ]);
};

Sip.prototype.acceptIncomingCall = function() {
  cordova.exec(null, null, "Sip", "acceptIncomingCall", [
    this.accountID,
    this.callID
  ]);
};

Sip.prototype.transferCall = function(number) {
  cordova.exec(null, null, "Sip", "transferCall", [
    this.accountID,
    this.callID,
    number
  ]);
};

Sip.prototype.unregister = function() {
  cordova.exec(null, null, "Sip", "removeAccount", [this.accountID]);
};

module.exports = Sip;
