package defpackage;

import android.text.TextPaint;
import defpackage.ph8;

/* loaded from: classes.dex */
public final class mg extends TextPaint {
    private final ao5 a;
    private ph8 b;
    private jo7 c;
    private gv1 d;

    public mg(int i, float f) {
        super(i);
        ((TextPaint) this).density = f;
        this.a = uf.b(this);
        this.b = ph8.b.c();
        this.c = jo7.d.a();
    }

    public final int a() {
        return this.a.m();
    }

    public final void b(int i) {
        this.a.e(i);
    }

    public final void c(yc0 yc0Var, long j, float f) {
        if (((yc0Var instanceof ox7) && ((ox7) yc0Var).b() != nn0.b.g()) || ((yc0Var instanceof ho7) && j != zt7.b.a())) {
            yc0Var.a(j, this.a, Float.isNaN(f) ? this.a.a() : uo6.l(f, 0.0f, 1.0f));
        } else if (yc0Var == null) {
            this.a.q(null);
        }
    }

    public final void d(long j) {
        if (j != nn0.b.g()) {
            this.a.k(j);
            this.a.q(null);
        }
    }

    public final void e(gv1 gv1Var) {
        if (gv1Var == null || zq3.c(this.d, gv1Var)) {
            return;
        }
        this.d = gv1Var;
        if (zq3.c(gv1Var, qf2.a)) {
            this.a.v(eo5.a.a());
            return;
        }
        if (gv1Var instanceof u48) {
            this.a.v(eo5.a.b());
            u48 u48Var = (u48) gv1Var;
            this.a.w(u48Var.f());
            this.a.s(u48Var.d());
            this.a.j(u48Var.c());
            this.a.d(u48Var.b());
            ao5 ao5Var = this.a;
            u48Var.e();
            ao5Var.g(null);
        }
    }

    public final void f(jo7 jo7Var) {
        if (jo7Var == null || zq3.c(this.c, jo7Var)) {
            return;
        }
        this.c = jo7Var;
        if (zq3.c(jo7Var, jo7.d.a())) {
            clearShadowLayer();
        } else {
            setShadowLayer(lj8.b(this.c.b()), fd5.o(this.c.d()), fd5.p(this.c.d()), wn0.k(this.c.c()));
        }
    }

    public final void g(ph8 ph8Var) {
        if (ph8Var == null || zq3.c(this.b, ph8Var)) {
            return;
        }
        this.b = ph8Var;
        ph8.a aVar = ph8.b;
        setUnderlineText(ph8Var.d(aVar.d()));
        setStrikeThruText(this.b.d(aVar.b()));
    }
}
