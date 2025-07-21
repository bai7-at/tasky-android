package defpackage;

import androidx.compose.foundation.pager.PagerLazyLayoutItemProvider;
import androidx.compose.foundation.pager.PagerState;

/* loaded from: classes.dex */
public final class sn5 {
    private final PagerState a;
    private final cy4 b;
    private final yx4 c;
    private boolean d;
    private Object e;
    private final t04 f;

    public sn5(int i, float f, PagerState pagerState) {
        this.a = pagerState;
        this.b = ow7.a(i);
        this.c = t26.a(f);
        this.f = new t04(i, 30, 100);
    }

    private final void h(int i) {
        this.b.f(i);
    }

    private final void i(float f) {
        this.c.r(f);
    }

    private final void j(int i, float f) {
        h(i);
        this.f.o(i);
        if (Math.abs(f) == 0.0f) {
            f = 0.0f;
        }
        i(f);
    }

    public final void a(int i) {
        i(d() + (this.a.G() == 0 ? 0.0f : i / this.a.G()));
    }

    public final int b() {
        return dg4.d((c() + d()) * this.a.G());
    }

    public final int c() {
        return this.b.d();
    }

    public final float d() {
        return this.c.a();
    }

    public final t04 e() {
        return this.f;
    }

    public final int f(PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i) {
        int a = p04.a(pagerLazyLayoutItemProvider, this.e, i);
        if (i != a) {
            h(a);
            this.f.o(i);
        }
        return a;
    }

    public final void g(int i, float f) {
        j(i, f);
        this.e = null;
    }

    public final void k(float f) {
        i(f);
    }

    public final void l(on5 on5Var) {
        ug4 m = on5Var.m();
        this.e = m != null ? m.d() : null;
        if (this.d || !on5Var.i().isEmpty()) {
            this.d = true;
            ug4 m2 = on5Var.m();
            j(m2 != null ? m2.getIndex() : 0, on5Var.n());
        }
    }
}
