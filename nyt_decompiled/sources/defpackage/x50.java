package defpackage;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import androidx.preference.g;

/* loaded from: classes4.dex */
public final class x50 {
    public final qu4 a(t68 t68Var) {
        zq3.h(t68Var, "subauthDependencyProvider");
        SharedPreferences b = g.b(t68Var.j());
        Resources resources = t68Var.getResources();
        zq3.e(b);
        return new qu4(b, resources);
    }

    public final ru4 b(t68 t68Var) {
        zq3.h(t68Var, "subauthDependencyProvider");
        SharedPreferences b = g.b(t68Var.j());
        Resources resources = t68Var.getResources();
        zq3.e(b);
        return new ru4(b, resources);
    }

    public final su4 c(qu4 qu4Var, ru4 ru4Var) {
        zq3.h(qu4Var, "purrFactory");
        zq3.h(ru4Var, "subauthFactory");
        return new su4(qu4Var, ru4Var);
    }

    public final w88 d(t68 t68Var) {
        zq3.h(t68Var, "subauthDependencyProvider");
        Object systemService = t68Var.j().getSystemService("connectivity");
        zq3.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return new w88((ConnectivityManager) systemService);
    }
}
