package defpackage;

import android.app.Activity;

/* loaded from: classes4.dex */
public final class yr6 implements br {
    private final xr6 a;
    private final Activity b;

    public yr6(xr6 xr6Var, Activity activity) {
        zq3.h(xr6Var, "recentlyViewedAnalytics");
        zq3.h(activity, "activity");
        this.a = xr6Var;
        this.b = activity;
    }

    @Override // defpackage.br
    public void c(j38 j38Var) {
        zq3.h(j38Var, "lockup");
        this.a.b(j38Var.d(), j38Var.c());
        ys7 ys7Var = ys7.a;
        Activity activity = this.b;
        String c = j38Var.c();
        String d = j38Var.d();
        if (d == null) {
            d = "";
        }
        this.b.startActivity(ys7Var.b(activity, c, d));
    }
}
