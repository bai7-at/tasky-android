package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import androidx.compose.ui.Modifier;
import defpackage.ss2;
import defpackage.sv3;
import defpackage.zv3;

/* loaded from: classes.dex */
final class b extends Modifier.c implements zv3 {
    private ss2 n;
    private ss2 r;

    public b(ss2 ss2Var, ss2 ss2Var2) {
        this.n = ss2Var;
        this.r = ss2Var2;
    }

    @Override // defpackage.zv3
    public boolean B0(KeyEvent keyEvent) {
        ss2 ss2Var = this.r;
        if (ss2Var != null) {
            return ((Boolean) ss2Var.invoke(sv3.a(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.zv3
    public boolean S0(KeyEvent keyEvent) {
        ss2 ss2Var = this.n;
        if (ss2Var != null) {
            return ((Boolean) ss2Var.invoke(sv3.a(keyEvent))).booleanValue();
        }
        return false;
    }

    public final void e2(ss2 ss2Var) {
        this.n = ss2Var;
    }

    public final void f2(ss2 ss2Var) {
        this.r = ss2Var;
    }
}
