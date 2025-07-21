package com.appsflyer.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class AFb1nSDK {
    public final WeakReference<Context> AFKeystoreWrapper;
    public String valueOf;

    public AFb1nSDK() {
    }

    public static boolean AFInAppEventType(@Nullable String str) {
        return str == null || str.length() == 0;
    }

    public AFb1nSDK(Context context) {
        this.AFKeystoreWrapper = new WeakReference<>(context);
    }
}
