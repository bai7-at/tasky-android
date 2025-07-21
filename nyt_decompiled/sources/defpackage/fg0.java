package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public final class fg0 implements fm1 {
    private zd0 a = i02.a;
    private ev1 b;

    public final long b() {
        return this.a.b();
    }

    @Override // defpackage.an2
    public float c1() {
        return this.a.getDensity().c1();
    }

    public final ev1 d() {
        return this.b;
    }

    public final ev1 e(ss2 ss2Var) {
        ev1 ev1Var = new ev1(ss2Var);
        this.b = ev1Var;
        return ev1Var;
    }

    public final void f(zd0 zd0Var) {
        this.a = zd0Var;
    }

    @Override // defpackage.fm1
    public float getDensity() {
        return this.a.getDensity().getDensity();
    }

    public final LayoutDirection getLayoutDirection() {
        return this.a.getLayoutDirection();
    }

    public final void i(ev1 ev1Var) {
        this.b = ev1Var;
    }
}
