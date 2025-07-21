package com.appsflyer.internal;

import android.support.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class AFe1fSDK {
    public final List<AFe1lSDK> valueOf = new ArrayList();

    public final synchronized void valueOf(AFe1lSDK aFe1lSDK) {
        this.valueOf.add(aFe1lSDK);
    }

    @NonNull
    public final synchronized AFe1lSDK[] values() {
        return (AFe1lSDK[]) this.valueOf.toArray(new AFe1lSDK[0]);
    }
}
