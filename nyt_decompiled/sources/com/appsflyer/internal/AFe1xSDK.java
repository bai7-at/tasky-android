package com.appsflyer.internal;

import android.content.Context;
import android.support.annotation.Nullable;

/* loaded from: classes2.dex */
public abstract class AFe1xSDK extends AFd1dSDK {
    AFe1xSDK() {
        this(null, null, null);
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

    AFe1xSDK(@Nullable String str, @Nullable Boolean bool, @Nullable Context context) {
        super(str, null, Boolean.FALSE, null, bool, context);
    }
}
