package com.appsflyer.internal;

import android.support.annotation.NonNull;

/* loaded from: classes2.dex */
public final class AFb1mSDK {
    public int AFInAppEventParameterName;
    public String AFInAppEventType;
    public long AFKeystoreWrapper;
    public AFe1rSDK AFLogger;
    public Throwable afInfoLog;

    @NonNull
    public String valueOf;
    public long values;

    public AFb1mSDK() {
    }

    public AFb1mSDK(String str, String str2, long j, long j2, int i, AFe1rSDK aFe1rSDK, Throwable th) {
        this.AFInAppEventType = str;
        this.valueOf = str2;
        this.AFKeystoreWrapper = j;
        this.values = j2;
        this.AFInAppEventParameterName = i;
        this.AFLogger = aFe1rSDK;
        this.afInfoLog = th;
    }
}
