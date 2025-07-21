package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: classes4.dex */
public final class w88 {
    private final ConnectivityManager a;

    public w88(ConnectivityManager connectivityManager) {
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
