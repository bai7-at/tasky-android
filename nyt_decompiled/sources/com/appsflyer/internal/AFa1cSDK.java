package com.appsflyer.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.internal.AFc1lSDK.AnonymousClass4;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AFa1cSDK implements Runnable {
    private static String AFKeystoreWrapper = null;
    private static String valueOf = "https://%ssdk-services.%s/validate-android-signature";
    private String AFInAppEventParameterName;
    private WeakReference<Context> AFInAppEventType;
    private Map<String, String> AFLogger;
    private String afDebugLog;
    private String afErrorLog;
    private String afInfoLog;
    private String afRDLog;
    private String values;

    static {
        StringBuilder sb = new StringBuilder("https://%svalidate.%s/api/v");
        sb.append(AFa1aSDK.AFKeystoreWrapper);
        sb.append("/androidevent?buildnumber=6.8.2&app_id=");
        AFKeystoreWrapper = sb.toString();
    }

    AFa1cSDK(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.AFInAppEventType = new WeakReference<>(context);
        this.values = str;
        this.AFInAppEventParameterName = str2;
        this.afDebugLog = str4;
        this.afRDLog = str5;
        this.afErrorLog = str6;
        this.AFLogger = map;
        this.afInfoLog = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.values;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        try {
            Context context = this.AFInAppEventType.get();
            if (context == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("public-key", this.AFInAppEventParameterName);
            hashMap.put("sig-data", this.afDebugLog);
            hashMap.put("signature", this.afInfoLog);
            Object hashMap2 = new HashMap(hashMap);
            Object obj = this.AFLogger;
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), AFa1aSDK.values().getHostName()));
            sb.append(context.getPackageName());
            String obj2 = sb.toString();
            String string = AFa1aSDK.AFInAppEventType(context).getString("referrer", "");
            AFa1qSDK aFe1tSDK = new AFe1tSDK(context);
            aFe1tSDK.afDebugLog = string;
            AFa1aSDK values = AFa1aSDK.values();
            Map<String, Object> AFKeystoreWrapper2 = values.AFKeystoreWrapper(aFe1tSDK);
            AFKeystoreWrapper2.put("price", this.afRDLog);
            AFKeystoreWrapper2.put("currency", this.afErrorLog);
            AFKeystoreWrapper2.put("receipt_data", hashMap2);
            if (obj != null) {
                AFKeystoreWrapper2.put("extra_prms", obj);
            }
            AFKeystoreWrapper2.putAll(values.AFInAppEventParameterName().AFLogger$LogLevel().valueOf());
            AFInAppEventType(context, (AFe1tSDK) aFe1tSDK.AFInAppEventType((Map<String, ?>) AFKeystoreWrapper2).AFInAppEventType(obj2));
            hashMap.put("dev_key", this.values);
            hashMap.put("app_id", context.getPackageName());
            hashMap.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            String string2 = AppsFlyerProperties.getInstance().getString("advertiserId");
            if (string2 != null) {
                hashMap.put("advertiserId", string2);
            }
            AFe1pSDK aFe1pSDK = (AFe1pSDK) new AFe1pSDK().AFInAppEventType(hashMap).AFInAppEventType(String.format(valueOf, AppsFlyerLib.getInstance().getHostPrefix(), AFa1aSDK.values().getHostName()));
            final AFd1uSDK AFInAppEventType = AFInAppEventType(context, aFe1pSDK);
            aFe1pSDK.valueOf = new AppsFlyerRequestListener() { // from class: com.appsflyer.internal.AFa1cSDK.2
                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onError(int i, @NonNull String str2) {
                    ResponseNetwork responseNetwork;
                    if (i == RequestError.RESPONSE_CODE_FAILURE && (responseNetwork = AFInAppEventType.afInfoLog) != null) {
                        str2 = responseNetwork.toString();
                    }
                    AFa1cSDK.values(false, AFa1cSDK.this.afDebugLog, AFa1cSDK.this.afRDLog, AFa1cSDK.this.afErrorLog, str2);
                }

                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onSuccess() {
                    try {
                        JSONObject jSONObject = new JSONObject((String) AFInAppEventType.afInfoLog.getBody());
                        AFLogger.afInfoLog("Validate response ok: ".concat(String.valueOf(jSONObject)));
                        AFa1cSDK.values(jSONObject.optBoolean("result"), AFa1cSDK.this.afDebugLog, AFa1cSDK.this.afRDLog, AFa1cSDK.this.afErrorLog, jSONObject.toString());
                    } catch (Exception e) {
                        AFLogger.afErrorLog("Failed Validate request: ".concat(String.valueOf(e)), e);
                        AFa1cSDK.values(false, AFa1cSDK.this.afDebugLog, AFa1cSDK.this.afRDLog, AFa1cSDK.this.afErrorLog, e.getMessage());
                    }
                }
            };
        } catch (Throwable th) {
            if (AFa1aSDK.AFInAppEventParameterName != null) {
                AFLogger.afErrorLog("Failed Validate request + ex", th);
                values(false, this.afDebugLog, this.afRDLog, this.afErrorLog, th.getMessage());
            }
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    private static AFd1uSDK AFInAppEventType(Context context, @NonNull AFe1xSDK aFe1xSDK) {
        AFa1aSDK.values().AFInAppEventParameterName(context);
        AFc1xSDK AFInAppEventParameterName = AFa1aSDK.values().AFInAppEventParameterName();
        AFd1uSDK aFd1uSDK = new AFd1uSDK(aFe1xSDK, AFInAppEventParameterName);
        AFc1lSDK afRDLog = AFInAppEventParameterName.afRDLog();
        afRDLog.AFKeystoreWrapper.execute(afRDLog.new AnonymousClass4(aFd1uSDK));
        return aFd1uSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void values(boolean z, String str, String str2, String str3, String str4) {
        if (AFa1aSDK.AFInAppEventParameterName != null) {
            StringBuilder sb = new StringBuilder("Validate callback parameters: ");
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            sb.append(" ");
            sb.append(str3);
            AFLogger.afDebugLog(sb.toString());
            if (z) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AFa1aSDK.AFInAppEventParameterName.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFa1aSDK.AFInAppEventParameterName;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }
}
