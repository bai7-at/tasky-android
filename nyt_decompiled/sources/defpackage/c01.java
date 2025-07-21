package defpackage;

import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public final class c01 extends Modifier.c implements ej7 {
    private boolean n;
    private boolean r;
    private ss2 s;

    public c01(boolean z, boolean z2, ss2 ss2Var) {
        this.n = z;
        this.r = z2;
        this.s = ss2Var;
    }

    @Override // defpackage.ej7
    public boolean O() {
        return this.r;
    }

    public final void e2(boolean z) {
        this.n = z;
    }

    public final void f2(ss2 ss2Var) {
        this.s = ss2Var;
    }

    @Override // defpackage.ej7
    public void u0(lj7 lj7Var) {
        this.s.invoke(lj7Var);
    }

    @Override // defpackage.ej7
    public boolean x1() {
        return this.n;
    }
}
