package defpackage;

import androidx.compose.ui.text.style.TextForegroundStyle;

/* loaded from: classes.dex */
public final class mj8 {
    public static final mj8 a = new mj8();

    private mj8() {
    }

    public final void a(ph0 ph0Var, aj8 aj8Var) {
        boolean z = aj8Var.i() && !kj8.e(aj8Var.l().f(), kj8.a.c());
        if (z) {
            kt6 b = nt6.b(fd5.b.c(), du7.a(hn3.g(aj8Var.B()), hn3.f(aj8Var.B())));
            ph0Var.t();
            ph0.h(ph0Var, b, 0, 2, null);
        }
        jy7 C = aj8Var.l().i().C();
        ph8 u = C.u();
        if (u == null) {
            u = ph8.b.c();
        }
        ph8 ph8Var = u;
        jo7 t = C.t();
        if (t == null) {
            t = jo7.d.a();
        }
        jo7 jo7Var = t;
        gv1 j = C.j();
        if (j == null) {
            j = qf2.a;
        }
        gv1 gv1Var = j;
        try {
            yc0 h = C.h();
            if (h != null) {
                aj8Var.w().D(ph0Var, h, (r17 & 4) != 0 ? Float.NaN : C.v() != TextForegroundStyle.b.b ? C.v().a() : 1.0f, (r17 & 8) != 0 ? null : jo7Var, (r17 & 16) != 0 ? null : ph8Var, (r17 & 32) != 0 ? null : gv1Var, (r17 & 64) != 0 ? fv1.p.a() : 0);
            } else {
                aj8Var.w().B(ph0Var, (r14 & 2) != 0 ? nn0.b.g() : C.v() != TextForegroundStyle.b.b ? C.v().b() : nn0.b.a(), (r14 & 4) != 0 ? null : jo7Var, (r14 & 8) != 0 ? null : ph8Var, (r14 & 16) == 0 ? gv1Var : null, (r14 & 32) != 0 ? fv1.p.a() : 0);
            }
            if (z) {
                ph0Var.k();
            }
        } catch (Throwable th) {
            if (z) {
                ph0Var.k();
            }
            throw th;
        }
    }
}
