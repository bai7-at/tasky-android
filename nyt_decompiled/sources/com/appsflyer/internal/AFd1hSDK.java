package com.appsflyer.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.AFLogger;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class AFd1hSDK extends AFc1nSDK<Void> {

    @Nullable
    private final Throwable AFLogger;
    private final AFd1pSDK afDebugLog;

    @Nullable
    private final AFc1oSDK<String> afRDLog;

    public AFd1hSDK(AFd1tSDK aFd1tSDK, AFd1pSDK aFd1pSDK) {
        super(AFc1jSDK.GCDSDK, new AFc1jSDK[]{AFc1jSDK.RC_CDN}, "GCD-CHECK");
        this.AFLogger = aFd1tSDK.afDebugLog();
        this.afRDLog = aFd1tSDK.afInfoLog;
        this.afDebugLog = aFd1pSDK;
    }

    @Nullable
    private Map<String, Object> afInfoLog() {
        String valueOf = this.afDebugLog.valueOf("attributionId", null);
        if (valueOf == null) {
            return null;
        }
        try {
            return AFc1zSDK.valueOf(valueOf);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("[GCD] Failed to parse GCD response: ");
            sb.append(e.getMessage());
            AFLogger.afErrorLog(sb.toString(), e);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFc1nSDK
    @NonNull
    public final AFc1rSDK AFInAppEventParameterName() throws Exception {
        AFLogger.afDebugLog("[GCD-A01] Loading conversion data. Counter: ".concat(String.valueOf(this.afDebugLog.values("appsFlyerCount"))));
        long AFInAppEventParameterName = this.afDebugLog.AFInAppEventParameterName("appsflyerConversionDataCacheExpiration");
        if (AFInAppEventParameterName != 0 && System.currentTimeMillis() - AFInAppEventParameterName > 5184000000L) {
            AFLogger.afDebugLog("[GCD-E02] Cached conversion data expired");
            this.afDebugLog.AFInAppEventParameterName("sixtyDayConversionData", true);
            this.afDebugLog.AFInAppEventParameterName("attributionId", (String) null);
            this.afDebugLog.AFInAppEventType("appsflyerConversionDataCacheExpiration", 0L);
        }
        Map<String, Object> afInfoLog = afInfoLog();
        if (afInfoLog != null) {
            try {
                if (!afInfoLog.containsKey("is_first_launch")) {
                    afInfoLog.put("is_first_launch", Boolean.FALSE);
                }
                AFd1fSDK.AFInAppEventType(afInfoLog);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("[GCD] Error executing conversion data callback: ");
                sb.append(e.getLocalizedMessage());
                AFLogger.afErrorLog(sb.toString(), e);
            }
            return AFc1rSDK.SUCCESS;
        }
        try {
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder("[GCD] Error executing conversion data callback: ");
            sb2.append(e2.getLocalizedMessage());
            AFLogger.afErrorLog(sb2.toString(), e2);
        }
        if (this.AFLogger != null) {
            StringBuilder sb3 = new StringBuilder("Launch exception: ");
            sb3.append(this.AFLogger.getMessage());
            AFd1fSDK.values(sb3.toString());
            return AFc1rSDK.SUCCESS;
        }
        AFc1oSDK<String> aFc1oSDK = this.afRDLog;
        if (aFc1oSDK != null && !aFc1oSDK.isSuccessful()) {
            StringBuilder sb4 = new StringBuilder("Launch status code: ");
            sb4.append(this.afRDLog.getStatusCode());
            AFd1fSDK.values(sb4.toString());
            return AFc1rSDK.SUCCESS;
        }
        return AFc1rSDK.FAILURE;
    }

    @Override // com.appsflyer.internal.AFc1nSDK
    public final boolean AFInAppEventType() {
        return false;
    }

    @Override // com.appsflyer.internal.AFc1nSDK
    public final long AFKeystoreWrapper() {
        return 1000L;
    }
}
