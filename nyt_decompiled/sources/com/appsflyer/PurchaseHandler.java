package com.appsflyer;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.internal.AFb1dSDK;
import com.appsflyer.internal.AFb1sSDK;
import com.appsflyer.internal.AFc1lSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* loaded from: classes2.dex */
public final class PurchaseHandler {

    @NonNull
    private final AFb1dSDK AFInAppEventParameterName;

    @NonNull
    public final AFc1xSDK valueOf;

    @NonNull
    public final AFc1lSDK values;

    public interface PurchaseValidationCallback {
        void onFailure(@NonNull Throwable th);

        void onResponse(@NonNull ResponseNetwork<String> responseNetwork);
    }

    public PurchaseHandler(@NonNull AFc1xSDK aFc1xSDK) {
        this.valueOf = aFc1xSDK;
        this.AFInAppEventParameterName = aFc1xSDK.values();
        this.values = aFc1xSDK.afRDLog();
    }

    public final boolean AFInAppEventParameterName(Map<String, Object> map, @Nullable PurchaseValidationCallback purchaseValidationCallback, String... strArr) {
        boolean AFInAppEventParameterName = AFb1sSDK.AFInAppEventParameterName(map, strArr, this.AFInAppEventParameterName);
        if (!AFInAppEventParameterName && purchaseValidationCallback != null) {
            purchaseValidationCallback.onFailure(new IllegalArgumentException("Invalid Request Data"));
        }
        return AFInAppEventParameterName;
    }
}
