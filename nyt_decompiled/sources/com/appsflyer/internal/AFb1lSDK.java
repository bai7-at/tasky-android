package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class AFb1lSDK {
    public static void AFInAppEventParameterName(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (AFa1tSDK.AFKeystoreWrapper().AFInAppEventParameterName == null) {
            valueOf(map);
            return;
        }
        try {
            try {
                DeepLink valueOf = DeepLink.valueOf(map);
                valueOf.valueOf.put("is_deferred", false);
                deepLinkResult = new DeepLinkResult(valueOf, null);
            } catch (JSONException e) {
                AFLogger.afErrorLog("[DDL] Error occurred", e, true);
                deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
            }
            values(deepLinkResult);
        } catch (Throwable th) {
            values(new DeepLinkResult(null, null));
            throw th;
        }
    }

    public static void AFInAppEventType(String str, DeepLinkResult.Error error) {
        if (AFa1tSDK.AFKeystoreWrapper().AFInAppEventParameterName == null) {
            valueOf(str);
        } else {
            AFLogger.afDebugLog("[DDL] Error occurred: ".concat(String.valueOf(str)));
            values(new DeepLinkResult(null, error));
        }
    }

    private static void valueOf(Map<String, String> map) {
        if (AFa1aSDK.valueOf != null) {
            try {
                StringBuilder sb = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb.append(map.toString());
                AFLogger.afDebugLog(sb.toString());
                AFa1aSDK.valueOf.onAppOpenAttribution(map);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    static void values(DeepLinkResult deepLinkResult) {
        if (AFa1tSDK.AFKeystoreWrapper().AFInAppEventParameterName == null) {
            AFLogger.afDebugLog("[DDL] skipping, no callback registered");
            return;
        }
        StringBuilder sb = new StringBuilder("[DDL] Calling onDeepLinking with:\n");
        sb.append(deepLinkResult.toString());
        AFLogger.afDebugLog(sb.toString());
        try {
            AFa1tSDK.AFKeystoreWrapper().AFInAppEventParameterName.onDeepLinking(deepLinkResult);
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getLocalizedMessage(), th);
        }
    }

    private static void valueOf(String str) {
        if (AFa1aSDK.valueOf != null) {
            try {
                AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                AFa1aSDK.valueOf.onAttributionFailure(str);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }
}
