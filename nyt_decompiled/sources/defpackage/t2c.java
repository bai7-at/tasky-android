package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes3.dex */
final class t2c extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ x3c a;

    t2c(x3c x3cVar) {
        this.a = x3cVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (x3c.class) {
            this.a.a = networkCapabilities;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (x3c.class) {
            this.a.a = null;
        }
    }
}
