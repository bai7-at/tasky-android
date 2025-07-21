package com.appsflyer.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AFb1qSDK {
    private boolean AFInAppEventType;

    @NonNull
    public AFe1rSDK valueOf;

    public AFb1qSDK() {
    }

    @Nullable
    static JSONObject values(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
            if (!jSONObject.optBoolean("monitor", false) || z) {
                AFb1oSDK.AFInAppEventType().values();
                AFb1oSDK.AFInAppEventType().valueOf();
            } else {
                AFb1oSDK.AFInAppEventType().AFKeystoreWrapper();
            }
            if (!jSONObject.has("ol_id")) {
                return jSONObject;
            }
            String optString = jSONObject.optString("ol_scheme", null);
            String optString2 = jSONObject.optString("ol_domain", null);
            String optString3 = jSONObject.optString("ol_ver", null);
            if (optString != null) {
                AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_SCHEME, optString);
            }
            if (optString2 != null) {
                AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_DOMAIN, optString2);
            }
            if (optString3 == null) {
                return jSONObject;
            }
            AppsFlyerProperties.getInstance().set("onelinkVersion", optString3);
            return jSONObject;
        } catch (Throwable th2) {
            th = th2;
            jSONObject2 = jSONObject;
            AFLogger.afErrorLog(th.getMessage(), th);
            AFb1oSDK.AFInAppEventType().values();
            AFb1oSDK.AFInAppEventType().valueOf();
            return jSONObject2;
        }
    }

    public final boolean AFInAppEventType() {
        return this.AFInAppEventType;
    }

    public AFb1qSDK(boolean z, AFe1rSDK aFe1rSDK) {
        this.AFInAppEventType = z;
        this.valueOf = aFe1rSDK;
    }
}
