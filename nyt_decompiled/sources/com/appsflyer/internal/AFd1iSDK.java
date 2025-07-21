package com.appsflyer.internal;

import android.content.Context;

/* loaded from: classes2.dex */
public final class AFd1iSDK {
    public static boolean AFKeystoreWrapper(Context context) {
        return context.getPackageManager().isInstantApp();
    }
}
