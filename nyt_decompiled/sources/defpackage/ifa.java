package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes3.dex */
final class ifa extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ jfa a;

    ifa(jfa jfaVar) {
        this.a = jfaVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (jfa.class) {
            this.a.a = networkCapabilities;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (jfa.class) {
            this.a.a = null;
        }
    }
}
