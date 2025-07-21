package com.appsflyer.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AFc1cSDK extends AFc1gSDK {
    private final AFb1dSDK afRDLog;

    public AFc1cSDK(@NonNull Map<String, Object> map, @Nullable PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull AFc1xSDK aFc1xSDK) {
        super(AFc1jSDK.PURCHASE_VALIDATE, new AFc1jSDK[]{AFc1jSDK.RC_CDN}, aFc1xSDK, null, map, purchaseValidationCallback);
        this.afRDLog = aFc1xSDK.values();
        this.values.add(AFc1jSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFc1hSDK
    protected final AFb1bSDK<String> AFInAppEventParameterName(@NonNull String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("https://%sviap.%s/api/v1/android/validate_purchase?app_id=", AppsFlyerLib.getInstance().getHostPrefix(), AFa1aSDK.values().getHostName()));
        sb.append(this.afRDLog.AFInAppEventType.AFKeystoreWrapper.getPackageName());
        String obj = sb.toString();
        String jSONObject = new JSONObject(init()).toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this);
        sb2.append(": preparing data: ");
        sb2.append(jSONObject);
        AFb1tSDK.AFInAppEventType(sb2.toString());
        ((AFc1hSDK) this).afErrorLog.values(obj, jSONObject);
        return ((AFc1hSDK) this).afDebugLog.AFInAppEventParameterName(init(), str);
    }

    @Override // com.appsflyer.internal.AFc1hSDK, com.appsflyer.internal.AFc1nSDK
    public final boolean AFInAppEventType() {
        ResponseNetwork responseNetwork = this.afInfoLog;
        if (responseNetwork == null || responseNetwork.getStatusCode() != 503) {
            return super.AFInAppEventType();
        }
        return true;
    }
}
