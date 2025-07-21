package com.appsflyer.internal;

/* loaded from: classes2.dex */
public final class AFe1ySDK extends AFa1qSDK {
    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFc1jSDK AFInAppEventParameterName() {
        return this.afRDLog == 1 ? AFc1jSDK.CONVERSION : AFc1jSDK.LAUNCH;
    }
}
