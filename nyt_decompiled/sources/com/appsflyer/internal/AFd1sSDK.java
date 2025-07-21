package com.appsflyer.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class AFd1sSDK extends AFc1hSDK<String> {
    private final Map<String, Object> afRDLog;

    public AFd1sSDK(@NonNull Map<String, Object> map, @NonNull AFc1xSDK aFc1xSDK) {
        super(AFc1jSDK.MONITORSDK, new AFc1jSDK[]{AFc1jSDK.RC_CDN}, aFc1xSDK, String.valueOf(map.hashCode()));
        this.afRDLog = new HashMap(map);
    }

    @Override // com.appsflyer.internal.AFc1hSDK
    protected final AFb1bSDK<String> AFInAppEventParameterName(@NonNull String str) {
        return ((AFc1hSDK) this).afDebugLog.valueOf(this.afRDLog);
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
}
