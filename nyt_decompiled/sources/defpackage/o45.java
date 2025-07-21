package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import defpackage.n45;

/* loaded from: classes.dex */
public abstract class o45 {
    public static final n45 a(Context context, n45.a aVar, i94 i94Var) {
        ConnectivityManager connectivityManager = (ConnectivityManager) mx0.j(context, ConnectivityManager.class);
        if (connectivityManager == null || !f.e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            if (i94Var != null && i94Var.getLevel() <= 5) {
                i94Var.a("NetworkObserver", 5, "Unable to register network observer.", null);
            }
            return new n02();
        }
        try {
            return new ir6(connectivityManager, aVar);
        } catch (Exception e) {
            if (i94Var != null) {
                l.a(i94Var, "NetworkObserver", new RuntimeException("Failed to register network observer.", e));
            }
            return new n02();
        }
    }
}
