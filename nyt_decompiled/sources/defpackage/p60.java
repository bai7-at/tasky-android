package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: classes4.dex */
public final class p60 {
    private final ConnectivityManager a;

    public p60(ConnectivityManager connectivityManager) {
        zq3.h(connectivityManager, "connectivityManager");
        this.a = connectivityManager;
    }

    public final boolean a() {
        NetworkInfo activeNetworkInfo = this.a.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isConnected();
        }
        return false;
    }
}
