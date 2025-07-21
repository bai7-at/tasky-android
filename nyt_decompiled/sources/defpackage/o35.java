package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes.dex */
public abstract class o35 {
    public static final Network a(ConnectivityManager connectivityManager) {
        zq3.h(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
