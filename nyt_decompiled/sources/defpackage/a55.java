package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* loaded from: classes.dex */
public abstract class a55 {
    private static final String a;

    static {
        String i = h94.i("NetworkStateTracker");
        zq3.g(i, "tagWithPrefix(\"NetworkStateTracker\")");
        a = i;
    }

    public static final dv0 a(Context context, rg8 rg8Var) {
        zq3.h(context, "context");
        zq3.h(rg8Var, "taskExecutor");
        return new z45(context, rg8Var);
    }

    public static final y45 c(ConnectivityManager connectivityManager) {
        zq3.h(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z = false;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean e = e(connectivityManager);
        boolean a2 = mu0.a(connectivityManager);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z = true;
        }
        return new y45(z2, e, a2, z);
    }

    public static final y45 d(NetworkCapabilities networkCapabilities) {
        zq3.h(networkCapabilities, "<this>");
        return new y45(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18));
    }

    public static final boolean e(ConnectivityManager connectivityManager) {
        zq3.h(connectivityManager, "<this>");
        try {
            NetworkCapabilities a2 = n35.a(connectivityManager, o35.a(connectivityManager));
            if (a2 != null) {
                return n35.b(a2, 16);
            }
            return false;
        } catch (SecurityException e) {
            h94.e().d(a, "Unable to validate active network", e);
            return false;
        }
    }
}
