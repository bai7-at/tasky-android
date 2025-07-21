package com.appsflyer.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AFd1gSDK extends AFc1hSDK<Map<String, Object>> {
    private static final List<String> afRDLog = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private final AFc1ySDK AFLogger$LogLevel;
    private final AFd1pSDK AFVersionDeclaration;

    @Nullable
    private Map<String, Object> afWarnLog;
    private final AFb1dSDK getLevel;
    private final AFd1cSDK init;

    @Nullable
    private String onAppOpenAttributionNative;

    public AFd1gSDK(@NonNull AFc1xSDK aFc1xSDK) {
        super(AFc1jSDK.GCDSDK, new AFc1jSDK[]{AFc1jSDK.RC_CDN}, aFc1xSDK, "GCD-FETCH");
        this.AFLogger$LogLevel = aFc1xSDK.AFKeystoreWrapper();
        this.AFVersionDeclaration = aFc1xSDK.afErrorLog();
        this.init = aFc1xSDK.afInfoLog();
        this.getLevel = aFc1xSDK.values();
        this.values.add(AFc1jSDK.CONVERSION);
        this.values.add(AFc1jSDK.LAUNCH);
    }

    @Override // com.appsflyer.internal.AFc1hSDK
    public final AFb1bSDK<Map<String, Object>> AFInAppEventParameterName(@NonNull String str) {
        String str2;
        String AFKeystoreWrapper = AFa1aSDK.AFKeystoreWrapper(this.AFVersionDeclaration, this.getLevel.values());
        if (AFKeystoreWrapper != null && !AFKeystoreWrapper.trim().isEmpty()) {
            if (!afRDLog.contains(AFKeystoreWrapper.toLowerCase())) {
                str2 = "-".concat(AFKeystoreWrapper);
                AFb1bSDK<Map<String, Object>> AFInAppEventParameterName = this.AFLogger$LogLevel.AFInAppEventParameterName(str2, str);
                StringBuilder sb = new StringBuilder("[GCD-B01] URL: ");
                sb.append(AFInAppEventParameterName.valueOf.AFInAppEventParameterName);
                AFb1tSDK.AFInAppEventType(sb.toString());
                return AFInAppEventParameterName;
            }
            AFLogger.afWarnLog(String.format("[GCD] AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", AFKeystoreWrapper));
        }
        str2 = "";
        AFb1bSDK<Map<String, Object>> AFInAppEventParameterName2 = this.AFLogger$LogLevel.AFInAppEventParameterName(str2, str);
        StringBuilder sb2 = new StringBuilder("[GCD-B01] URL: ");
        sb2.append(AFInAppEventParameterName2.valueOf.AFInAppEventParameterName);
        AFb1tSDK.AFInAppEventType(sb2.toString());
        return AFInAppEventParameterName2;
    }

    @Override // com.appsflyer.internal.AFc1hSDK, com.appsflyer.internal.AFc1nSDK
    public final boolean AFInAppEventType() {
        return false;
    }

    @Override // com.appsflyer.internal.AFc1hSDK
    @Nullable
    public final AppsFlyerRequestListener afErrorLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFc1hSDK
    public final boolean afInfoLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFc1hSDK, com.appsflyer.internal.AFc1nSDK
    public final void values() {
        super.values();
        Map<String, Object> map = this.afWarnLog;
        String str = this.onAppOpenAttributionNative;
        if (map != null) {
            AFd1fSDK.AFInAppEventType(map);
        } else if (str == null || str.isEmpty()) {
            AFd1fSDK.values("Unknown error");
        } else {
            AFd1fSDK.values(str);
        }
    }

    @Override // com.appsflyer.internal.AFc1hSDK, com.appsflyer.internal.AFc1nSDK
    @NonNull
    public final AFc1rSDK AFInAppEventParameterName() throws Exception {
        AFc1rSDK aFc1rSDK;
        AFc1rSDK aFc1rSDK2;
        if (!((AFc1hSDK) this).AFLogger.values()) {
            AFc1rSDK aFc1rSDK3 = AFc1rSDK.FAILURE;
            int i = 0;
            while (i <= 2) {
                boolean z = true;
                boolean z2 = i >= 2;
                this.init.init = System.currentTimeMillis();
                try {
                    try {
                        aFc1rSDK = super.AFInAppEventParameterName();
                        ResponseNetwork responseNetwork = this.afInfoLog;
                        if (responseNetwork != null) {
                            int statusCode = responseNetwork.getStatusCode();
                            if (statusCode != 403 && statusCode < 500) {
                                z = false;
                            }
                            if (!responseNetwork.isSuccessful() && statusCode != 404) {
                                if (!z2) {
                                    if (!z) {
                                    }
                                }
                                this.onAppOpenAttributionNative = "Error connection to server: ".concat(String.valueOf(statusCode));
                                aFc1rSDK2 = AFc1rSDK.FAILURE;
                                return aFc1rSDK2;
                            }
                            Map<String, Object> map = (Map) responseNetwork.getBody();
                            int statusCode2 = responseNetwork.getStatusCode();
                            Boolean bool = (Boolean) map.get("iscache");
                            if (statusCode2 == 404) {
                                map.remove("error_reason");
                                map.remove("status_code");
                                map.put("af_status", "Organic");
                                map.put("af_message", "organic install");
                            }
                            if (bool != null && !bool.booleanValue()) {
                                this.AFVersionDeclaration.AFInAppEventType("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                            }
                            if (map.containsKey("af_siteid")) {
                                if (map.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
                                    StringBuilder sb = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                    sb.append(map.get(AFInAppEventParameterName.AF_CHANNEL));
                                    AFLogger.afDebugLog(sb.toString());
                                } else {
                                    AFLogger.afDebugLog(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", map.get("af_siteid")));
                                }
                            }
                            map.put("is_first_launch", Boolean.FALSE);
                            this.AFVersionDeclaration.AFInAppEventParameterName("attributionId", new JSONObject(map).toString());
                            if (!this.AFVersionDeclaration.valueOf("sixtyDayConversionData")) {
                                map.put("is_first_launch", Boolean.TRUE);
                            }
                            this.afWarnLog = map;
                            aFc1rSDK2 = AFc1rSDK.SUCCESS;
                            return aFc1rSDK2;
                        }
                    } catch (AFc1iSDK e) {
                        AFLogger.afDebugLog("[GCD-E05] AppsFlyer dev key is missing");
                        this.onAppOpenAttributionNative = "AppsFlyer dev key is missing";
                        throw e;
                    } catch (Exception e2) {
                        StringBuilder sb2 = new StringBuilder("[GCD] Error: ");
                        sb2.append(e2.getMessage());
                        AFLogger.afErrorLog(sb2.toString(), e2);
                        aFc1rSDK = AFc1rSDK.FAILURE;
                        if (z2) {
                            this.onAppOpenAttributionNative = e2.getMessage();
                            throw e2;
                        }
                    }
                    aFc1rSDK3 = aFc1rSDK;
                    i++;
                } finally {
                    this.init.AFKeystoreWrapper(i);
                    AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                }
            }
            return aFc1rSDK3;
        }
        AFLogger.afDebugLog("[GCD-E03] 'isStopTracking' enabled");
        this.onAppOpenAttributionNative = "'isStopTracking' enabled";
        throw new AFc1mSDK();
    }
}
