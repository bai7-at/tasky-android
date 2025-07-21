package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import defpackage.rh0;

/* loaded from: classes.dex */
public final class xu1 {
    private sf3 a;
    private ph0 b;
    private fm1 c;
    private LayoutDirection d = LayoutDirection.Ltr;
    private long e = hn3.b.a();
    private int f = tf3.b.b();
    private final rh0 g = new rh0();

    private final void a(fv1 fv1Var) {
        fv1.a0(fv1Var, nn0.b.a(), 0L, 0L, 0.0f, null, null, b90.a.a(), 62, null);
    }

    public final void b(int i, long j, fm1 fm1Var, LayoutDirection layoutDirection, ss2 ss2Var) {
        this.c = fm1Var;
        this.d = layoutDirection;
        sf3 sf3Var = this.a;
        ph0 ph0Var = this.b;
        if (sf3Var == null || ph0Var == null || hn3.g(j) > sf3Var.getWidth() || hn3.f(j) > sf3Var.getHeight() || !tf3.i(this.f, i)) {
            sf3Var = uf3.b(hn3.g(j), hn3.f(j), i, false, null, 24, null);
            ph0Var = uh0.a(sf3Var);
            this.a = sf3Var;
            this.b = ph0Var;
            this.f = i;
        }
        this.e = j;
        rh0 rh0Var = this.g;
        long c = in3.c(j);
        rh0.a u = rh0Var.u();
        fm1 a = u.a();
        LayoutDirection b = u.b();
        ph0 c2 = u.c();
        long d = u.d();
        rh0.a u2 = rh0Var.u();
        u2.j(fm1Var);
        u2.k(layoutDirection);
        u2.i(ph0Var);
        u2.l(c);
        ph0Var.t();
        a(rh0Var);
        ss2Var.invoke(rh0Var);
        ph0Var.k();
        rh0.a u3 = rh0Var.u();
        u3.j(a);
        u3.k(b);
        u3.i(c2);
        u3.l(d);
        sf3Var.a();
    }

    public final void c(fv1 fv1Var, float f, qn0 qn0Var) {
        sf3 sf3Var = this.a;
        if (sf3Var == null) {
            throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        fv1.C0(fv1Var, sf3Var, 0L, this.e, 0L, 0L, f, null, qn0Var, 0, 0, 858, null);
    }

    public final sf3 d() {
        return this.a;
    }
}
