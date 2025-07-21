package com.appsflyer.internal;

/* loaded from: classes2.dex */
public final class AFd1aSDK extends AFa1qSDK {
    public AFd1aSDK() {
        super(null, null, Boolean.FALSE, null);
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFc1jSDK AFInAppEventParameterName() {
        return AFc1jSDK.ADREVENUE;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFa1qSDK AFInAppEventType(String str) {
        return super.AFInAppEventType(AFKeystoreWrapper(str));
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final boolean AFLogger() {
        return false;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final boolean afDebugLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final boolean afInfoLog() {
        return false;
    }
}
