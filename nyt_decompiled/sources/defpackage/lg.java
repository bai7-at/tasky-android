package defpackage;

import android.view.View;
import android.view.Window;

/* loaded from: classes2.dex */
public final class lg implements ve8 {
    private final View a;
    private final Window b;
    private final ph9 c;

    public lg(View view, Window window) {
        zq3.h(view, "view");
        this.a = view;
        this.b = window;
        this.c = window != null ? kg9.a(window, view) : null;
    }

    @Override // defpackage.ve8
    public void c(long j, boolean z, boolean z2, ss2 ss2Var) {
        ph9 ph9Var;
        zq3.h(ss2Var, "transformColorForLightContent");
        g(z);
        f(z2);
        Window window = this.b;
        if (window == null) {
            return;
        }
        if (z && ((ph9Var = this.c) == null || !ph9Var.b())) {
            j = ((nn0) ss2Var.invoke(nn0.j(j))).B();
        }
        window.setNavigationBarColor(wn0.k(j));
    }

    @Override // defpackage.ve8
    public void d(long j, boolean z, ss2 ss2Var) {
        ph9 ph9Var;
        zq3.h(ss2Var, "transformColorForLightContent");
        h(z);
        Window window = this.b;
        if (window == null) {
            return;
        }
        if (z && ((ph9Var = this.c) == null || !ph9Var.c())) {
            j = ((nn0) ss2Var.invoke(nn0.j(j))).B();
        }
        window.setStatusBarColor(wn0.k(j));
    }

    public void f(boolean z) {
        Window window = this.b;
        if (window == null) {
            return;
        }
        window.setNavigationBarContrastEnforced(z);
    }

    public void g(boolean z) {
        ph9 ph9Var = this.c;
        if (ph9Var == null) {
            return;
        }
        ph9Var.d(z);
    }

    public void h(boolean z) {
        ph9 ph9Var = this.c;
        if (ph9Var == null) {
            return;
        }
        ph9Var.e(z);
    }
}
