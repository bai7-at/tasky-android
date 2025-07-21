package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class AFc1gSDK extends AFc1hSDK<String> {

    @NonNull
    private final Map<String, Object> AFVersionDeclaration;
    private final AFb1dSDK afRDLog;

    @Nullable
    private final PurchaseHandler.PurchaseValidationCallback afWarnLog;
    private final AFd1pSDK getLevel;

    public AFc1gSDK(@NonNull AFc1jSDK aFc1jSDK, @NonNull AFc1jSDK[] aFc1jSDKArr, @NonNull AFc1xSDK aFc1xSDK, @Nullable String str, Map<String, Object> map, @Nullable PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        super(aFc1jSDK, aFc1jSDKArr, aFc1xSDK, str);
        AFb1dSDK values = aFc1xSDK.values();
        this.afRDLog = values;
        AFd1pSDK afErrorLog = aFc1xSDK.afErrorLog();
        this.getLevel = afErrorLog;
        HashMap hashMap = new HashMap(new HashMap(map));
        hashMap.put("app_id", values.AFInAppEventType.AFKeystoreWrapper.getPackageName());
        String valueOf = AFb1dSDK.valueOf();
        if (valueOf != null) {
            hashMap.put("cuid", valueOf);
        }
        Context context = values.AFInAppEventType.AFKeystoreWrapper;
        hashMap.put("app_version_name", AFb1wSDK.valueOf(context, context.getPackageName()));
        HashMap hashMap2 = new HashMap();
        AFa1rSDK values2 = AFb1ySDK.values(values.AFInAppEventType.AFKeystoreWrapper, new HashMap());
        String str2 = values2 != null ? values2.AFKeystoreWrapper : null;
        if (!AFb1nSDK.AFInAppEventType(str2)) {
            hashMap2.put("advertising_id", str2);
        }
        AFa1rSDK valueOf2 = AFb1ySDK.valueOf(values.AFInAppEventType.AFKeystoreWrapper.getContentResolver());
        String str3 = valueOf2 != null ? valueOf2.AFKeystoreWrapper : null;
        if (!AFb1nSDK.AFInAppEventType(str3)) {
            hashMap2.put("oaid", str3);
        }
        AFa1rSDK valueOf3 = AFb1ySDK.valueOf(values.AFInAppEventType.AFKeystoreWrapper.getContentResolver());
        String str4 = valueOf3 != null ? valueOf3.AFKeystoreWrapper : null;
        if (!AFb1nSDK.AFInAppEventType(str4)) {
            hashMap2.put("amazon_aid", str4);
        }
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            String AFInAppEventParameterName = ((AFc1hSDK) this).AFLogger.AFInAppEventParameterName(afErrorLog);
            if (!AFb1nSDK.AFInAppEventType(AFInAppEventParameterName)) {
                hashMap2.put("imei", AFInAppEventParameterName);
            }
        }
        hashMap2.put("appsflyer_id", AFb1rSDK.AFInAppEventParameterName(new WeakReference(values.AFInAppEventType.AFKeystoreWrapper)));
        StringBuilder sb = new StringBuilder();
        sb.append(Build.VERSION.SDK_INT);
        hashMap2.put("os_version", sb.toString());
        hashMap2.put("sdk_version", AFa1aSDK.AFKeystoreWrapper);
        hashMap.put("device_data", hashMap2);
        this.AFVersionDeclaration = hashMap;
        this.afWarnLog = purchaseValidationCallback;
    }

    @Override // com.appsflyer.internal.AFc1hSDK
    @Nullable
    protected final AppsFlyerRequestListener afErrorLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFc1hSDK
    protected final boolean afInfoLog() {
        return true;
    }

    @NonNull
    protected final Map<String, Object> init() {
        return this.AFVersionDeclaration;
    }

    @Override // com.appsflyer.internal.AFc1hSDK, com.appsflyer.internal.AFc1nSDK
    public final void values() {
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback2;
        super.values();
        Throwable afDebugLog = afDebugLog();
        if (afDebugLog != null && (purchaseValidationCallback2 = this.afWarnLog) != null) {
            purchaseValidationCallback2.onFailure(afDebugLog);
        }
        ResponseNetwork<String> responseNetwork = this.afInfoLog;
        if (responseNetwork == null || (purchaseValidationCallback = this.afWarnLog) == null) {
            return;
        }
        purchaseValidationCallback.onResponse(responseNetwork);
    }
}
