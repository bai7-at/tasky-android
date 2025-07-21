package defpackage;

import androidx.compose.foundation.FocusedBoundsKt;
import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public final class fm2 extends Modifier.c implements kv4, f13 {
    private boolean n;
    private cz3 r;

    private final ss2 e2() {
        if (L1()) {
            return (ss2) l(FocusedBoundsKt.a());
        }
        return null;
    }

    private final void f2() {
        ss2 e2;
        cz3 cz3Var = this.r;
        if (cz3Var != null) {
            zq3.e(cz3Var);
            if (!cz3Var.m() || (e2 = e2()) == null) {
                return;
            }
            e2.invoke(this.r);
        }
    }

    public final void g2(boolean z) {
        if (z == this.n) {
            return;
        }
        if (z) {
            f2();
        } else {
            ss2 e2 = e2();
            if (e2 != null) {
                e2.invoke(null);
            }
        }
        this.n = z;
    }

    @Override // defpackage.f13
    public void k(cz3 cz3Var) {
        this.r = cz3Var;
        if (this.n) {
            if (cz3Var.m()) {
                f2();
                return;
            }
            ss2 e2 = e2();
            if (e2 != null) {
                e2.invoke(null);
            }
        }
    }
}
