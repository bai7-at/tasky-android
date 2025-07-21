package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import defpackage.ql2;
import defpackage.ss2;
import defpackage.zl2;
import defpackage.zq3;

/* loaded from: classes.dex */
final class c extends Modifier.c implements ql2 {
    private ss2 n;
    private zl2 r;

    public c(ss2 ss2Var) {
        this.n = ss2Var;
    }

    public final void e2(ss2 ss2Var) {
        this.n = ss2Var;
    }

    @Override // defpackage.ql2
    public void h1(zl2 zl2Var) {
        if (zq3.c(this.r, zl2Var)) {
            return;
        }
        this.r = zl2Var;
        this.n.invoke(zl2Var);
    }
}
