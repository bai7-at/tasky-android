package com.google.android.exoplayer2;

import android.content.Context;
import android.net.wifi.WifiManager;
import defpackage.a84;

/* loaded from: classes2.dex */
final class j2 {
    private final WifiManager a;
    private WifiManager.WifiLock b;
    private boolean c;
    private boolean d;

    public j2(Context context) {
        this.a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    private void c() {
        WifiManager.WifiLock wifiLock = this.b;
        if (wifiLock == null) {
            return;
        }
        if (this.c && this.d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public void a(boolean z) {
        if (z && this.b == null) {
            WifiManager wifiManager = this.a;
            if (wifiManager == null) {
                a84.j("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.b = createWifiLock;
                createWifiLock.setReferenceCounted(false);
            }
        }
        this.c = z;
        c();
    }

    public void b(boolean z) {
        this.d = z;
        c();
    }
}
