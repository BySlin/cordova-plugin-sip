module.exports = function Sip(username, password, host, port, listener) {
  cordova.exec(
    listener,
    null,
    "Sip",
    "setAccount",
    [username, password, host, port]
  );

  this.makeCall = function (number) {
    cordova.exec(
      null,
      null,
      "Sip",
      "makeCall",
      [number]
    );
  };

  this.hangUpCall = function () {
    cordova.exec(
      null,
      null,
      "Sip",
      "hangUpCall",
      []
    );
  };

  this.getRegistrationStatus = function () {
    cordova.exec(
      null,
      null,
      "Sip",
      "getRegistrationStatus",
      []
    );
  };

  this.sendDTMF = function (dtmf) {
    cordova.exec(
      null,
      null,
      "Sip",
      "sendDTMF",
      [dtmf]
    );
  };
}
