package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.wifi.WifiManager;

/* loaded from: classes3.dex */
final class dp {
    private final WifiManager a;

    public dp(Context context) {
        this.a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }
}
