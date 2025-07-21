package com.appsflyer.internal;

import android.support.annotation.Nullable;

/* loaded from: classes2.dex */
public final class AFe1wSDK extends AFa1qSDK {

    @Nullable
    public final AFc1jSDK AFLogger$LogLevel;

    @Deprecated
    public AFe1wSDK() {
        this.AFLogger$LogLevel = null;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFc1jSDK AFInAppEventParameterName() {
        AFc1jSDK aFc1jSDK = this.AFLogger$LogLevel;
        return aFc1jSDK != null ? aFc1jSDK : AFc1jSDK.CACHED_EVENT;
    }

    public AFe1wSDK(String str, byte[] bArr, String str2, @Nullable AFc1jSDK aFc1jSDK) {
        super(null, str, Boolean.FALSE, null);
        this.AFLogger = str2;
        AFInAppEventParameterName(bArr);
        this.AFLogger$LogLevel = aFc1jSDK;
    }
}
