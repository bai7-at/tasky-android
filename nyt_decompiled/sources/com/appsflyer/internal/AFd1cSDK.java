package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AFd1cSDK {
    public long AFInAppEventParameterName;
    public final AFd1pSDK AFInAppEventType;
    public final Map<String, Object> AFKeystoreWrapper;
    public final long[] AFLogger;
    public final long[] afDebugLog;
    public long afErrorLog;
    public long afInfoLog;
    public final long[] afRDLog;
    public long afWarnLog;
    public long init;
    public final Map<String, Object> valueOf;
    public final Map<String, Object> values;

    public AFd1cSDK(AFd1pSDK aFd1pSDK) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.valueOf = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.AFKeystoreWrapper = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        this.values = concurrentHashMap3;
        this.AFInAppEventParameterName = 0L;
        this.afErrorLog = 0L;
        this.afRDLog = new long[2];
        this.afDebugLog = new long[2];
        this.AFLogger = new long[2];
        this.afInfoLog = 0L;
        this.init = 0L;
        this.AFInAppEventType = aFd1pSDK;
        concurrentHashMap.putAll(AFInAppEventType("first_launch"));
        concurrentHashMap2.putAll(AFInAppEventType("ddl"));
        concurrentHashMap3.putAll(AFInAppEventType("gcd"));
        this.afWarnLog = aFd1pSDK.AFInAppEventParameterName("prev_session_dur");
    }

    private Map<String, Object> AFInAppEventType(String str) {
        Map<String, Object> emptyMap = Collections.emptyMap();
        String valueOf = this.AFInAppEventType.valueOf(str, null);
        if (valueOf == null) {
            return emptyMap;
        }
        try {
            return AFa1pSDK.values(new JSONObject(valueOf));
        } catch (Exception e) {
            AFLogger.afErrorLog("Error while parsing cached json data", e, true);
            return emptyMap;
        }
    }

    public final void AFKeystoreWrapper(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.init;
        if (j != 0) {
            this.values.put("net", Long.valueOf(currentTimeMillis - j));
        } else {
            AFLogger.afInfoLog("Metrics: gcdStart ts is missing");
        }
        this.values.put("retries", Integer.valueOf(i));
        this.AFInAppEventType.AFInAppEventParameterName("gcd", new JSONObject(this.values).toString());
    }

    public final void valueOf() {
        this.afErrorLog = System.currentTimeMillis();
        if (values()) {
            long j = this.AFInAppEventParameterName;
            if (j == 0) {
                AFLogger.afInfoLog("Metrics: init ts is missing");
                return;
            }
            this.valueOf.put("init_to_fg", Long.valueOf(this.afErrorLog - j));
            this.AFInAppEventType.AFInAppEventParameterName("first_launch", new JSONObject(this.valueOf).toString());
        }
    }

    public final void values(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        this.afInfoLog = currentTimeMillis;
        if (i == 1) {
            long j = this.afErrorLog;
            if (j == 0) {
                AFLogger.afInfoLog("Metrics: fg ts is missing");
                return;
            }
            this.valueOf.put("from_fg", Long.valueOf(currentTimeMillis - j));
            this.AFInAppEventType.AFInAppEventParameterName("first_launch", new JSONObject(this.valueOf).toString());
        }
    }

    public final boolean values() {
        return this.AFInAppEventType.values("appsFlyerCount") == 0;
    }

    public final void valueOf(AFd1eSDK aFd1eSDK) {
        if (values()) {
            this.valueOf.put("start_with", aFd1eSDK.toString());
            this.AFInAppEventType.AFInAppEventParameterName("first_launch", new JSONObject(this.valueOf).toString());
        }
    }

    public final void valueOf(DeepLinkResult deepLinkResult, long j) {
        this.AFKeystoreWrapper.put("status", deepLinkResult.getStatus().toString());
        this.AFKeystoreWrapper.put("timeout_value", Long.valueOf(j));
        this.AFInAppEventType.AFInAppEventParameterName("ddl", new JSONObject(this.AFKeystoreWrapper).toString());
    }
}
