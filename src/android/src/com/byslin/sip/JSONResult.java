package com.byslin.sip;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONResult {

  private JSONResult() {
  }

  private JSONObject jsonObject = new JSONObject();


  public JSONResult put(String name, String value) {
    try {
      jsonObject.put(name, value);
    } catch (JSONException ignored) {
    }
    return this;
  }

  public JSONResult put(String name, int value) {
    try {
      jsonObject.put(name, value);
    } catch (JSONException ignored) {
    }
    return this;
  }

  public JSONResult put(String name, long value) {
    try {
      jsonObject.put(name, value);
    } catch (JSONException ignored) {
    }
    return this;
  }

  public JSONResult put(String name, boolean value) {
    try {
      jsonObject.put(name, value);
    } catch (JSONException ignored) {
    }
    return this;
  }

  public JSONResult put(String name, Object value) {
    try {
      jsonObject.put(name, value);
    } catch (JSONException ignored) {
    }
    return this;
  }

  public JSONObject build() {
    return jsonObject;
  }

  public static JSONResult builder() {
    return new JSONResult();
  }

}
