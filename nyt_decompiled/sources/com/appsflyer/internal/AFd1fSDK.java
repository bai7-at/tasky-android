package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;

/* loaded from: classes2.dex */
public final class AFd1fSDK {
    static void AFInAppEventType(Map<String, Object> map) {
        if (AFa1aSDK.valueOf != null) {
            StringBuilder sb = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
            sb.append(map.toString());
            AFLogger.afDebugLog(sb.toString());
            AFa1aSDK.valueOf.onConversionDataSuccess(map);
        }
    }

    static void values(String str) {
        if (AFa1aSDK.valueOf != null) {
            AFLogger.afDebugLog("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(str)));
            AFa1aSDK.valueOf.onConversionDataFail(str);
        }
    }
}
