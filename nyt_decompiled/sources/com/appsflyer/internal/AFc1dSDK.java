package com.appsflyer.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.PurchaseHandler;
import java.util.Map;

/* loaded from: classes2.dex */
public final class AFc1dSDK extends AFc1gSDK {
    public AFc1dSDK(@NonNull Map<String, Object> map, @Nullable PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull AFc1xSDK aFc1xSDK) {
        super(AFc1jSDK.ARS_VALIDATE, new AFc1jSDK[]{AFc1jSDK.RC_CDN}, aFc1xSDK, null, map, purchaseValidationCallback);
        this.values.add(AFc1jSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFc1hSDK
    protected final AFb1bSDK<String> AFInAppEventParameterName(@NonNull String str) {
        return ((AFc1hSDK) this).afDebugLog.AFInAppEventType(init(), str);
    }
}
