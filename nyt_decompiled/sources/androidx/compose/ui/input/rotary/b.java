package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier;
import defpackage.ss2;
import defpackage.v27;
import defpackage.w27;

/* loaded from: classes.dex */
final class b extends Modifier.c implements v27 {
    private ss2 n;
    private ss2 r;

    public b(ss2 ss2Var, ss2 ss2Var2) {
        this.n = ss2Var;
        this.r = ss2Var2;
    }

    @Override // defpackage.v27
    public boolean W(w27 w27Var) {
        ss2 ss2Var = this.r;
        if (ss2Var != null) {
            return ((Boolean) ss2Var.invoke(w27Var)).booleanValue();
        }
        return false;
    }

    public final void e2(ss2 ss2Var) {
        this.n = ss2Var;
    }

    public final void f2(ss2 ss2Var) {
        this.r = ss2Var;
    }

    @Override // defpackage.v27
    public boolean v0(w27 w27Var) {
        ss2 ss2Var = this.n;
        if (ss2Var != null) {
            return ((Boolean) ss2Var.invoke(w27Var)).booleanValue();
        }
        return false;
    }
}
