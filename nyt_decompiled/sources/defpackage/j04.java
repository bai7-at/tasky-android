package defpackage;

import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public final class j04 extends Modifier.c implements vo5 {
    private ph2 n;
    private ph2 r;

    public j04(ph2 ph2Var, ph2 ph2Var2) {
        this.n = ph2Var;
        this.r = ph2Var2;
    }

    public final ph2 e2() {
        return this.n;
    }

    public final ph2 f2() {
        return this.r;
    }

    public final void g2(ph2 ph2Var) {
        this.n = ph2Var;
    }

    public final void h2(ph2 ph2Var) {
        this.r = ph2Var;
    }

    @Override // defpackage.vo5
    public Object i(fm1 fm1Var, Object obj) {
        return this;
    }
}
