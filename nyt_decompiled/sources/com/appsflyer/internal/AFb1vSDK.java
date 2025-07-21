package com.appsflyer.internal;

import android.support.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AFb1vSDK {

    @NonNull
    public final String AFInAppEventParameterName;

    @NonNull
    public final AFe1qSDK AFInAppEventType;

    @NonNull
    public final String valueOf;
    private final boolean values;

    public AFb1vSDK() {
    }

    public static Map<String, String> AFInAppEventParameterName(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                hashMap.put(URLEncoder.encode(entry.getKey(), "utf-8"), URLEncoder.encode(entry.getValue(), "utf-8"));
            } catch (UnsupportedEncodingException e) {
                AFLogger.afErrorLog(e);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AFb1vSDK.class != obj.getClass()) {
            return false;
        }
        AFb1vSDK aFb1vSDK = (AFb1vSDK) obj;
        if (this.values == aFb1vSDK.values && this.valueOf.equals(aFb1vSDK.valueOf)) {
            return this.AFInAppEventParameterName.equals(aFb1vSDK.AFInAppEventParameterName);
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.values ? 1 : 0) * 31) + this.valueOf.hashCode()) * 31) + this.AFInAppEventParameterName.hashCode();
    }

    public AFb1vSDK(String str) throws JSONException {
        if (str == null) {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("ver");
            this.valueOf = string;
            this.values = jSONObject.optBoolean("test_mode");
            this.AFInAppEventParameterName = str;
            this.AFInAppEventType = string.startsWith("default") ? AFe1qSDK.DEFAULT : AFe1qSDK.CUSTOM;
        } catch (JSONException unused) {
            throw new JSONException("Failed to parse remote configuration JSON");
        }
    }
}
