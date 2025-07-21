package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* loaded from: classes3.dex */
public final class x3c {
    private NetworkCapabilities a;

    x3c(ConnectivityManager connectivityManager) {
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new t2c(this));
            } catch (RuntimeException unused) {
                synchronized (x3c.class) {
                    this.a = null;
                }
            }
        }
    }

    public final NetworkCapabilities a() {
        return this.a;
    }
}
