package com.appsflyer.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import com.appsflyer.AFInAppEventType;

/* loaded from: classes2.dex */
public final class AFe1tSDK extends AFe1xSDK {
    public AFe1tSDK(@NonNull Context context) {
        super(AFInAppEventType.PURCHASE, Boolean.TRUE, context);
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFc1jSDK AFInAppEventParameterName() {
        return AFc1jSDK.PURCHASE_VALIDATE;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFa1qSDK AFInAppEventType(String str) {
        return super.AFInAppEventType(AFKeystoreWrapper(str));
    }
}
