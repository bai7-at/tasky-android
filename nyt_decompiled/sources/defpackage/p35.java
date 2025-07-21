package defpackage;

import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public abstract class p35 {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        zq3.h(connectivityManager, "<this>");
        zq3.h(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
