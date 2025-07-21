package androidx.compose.foundation.text.selection;

import defpackage.fd5;
import defpackage.r99;
import defpackage.vx5;

/* loaded from: classes.dex */
final class b {
    private final r99 a;
    private int b;
    private vx5 c;

    public b(r99 r99Var) {
        this.a = r99Var;
    }

    public final int a() {
        return this.b;
    }

    public final boolean b(vx5 vx5Var, vx5 vx5Var2) {
        return ((double) fd5.m(fd5.s(vx5Var2.i(), vx5Var.i()))) < 100.0d;
    }

    public final boolean c(vx5 vx5Var, vx5 vx5Var2) {
        return vx5Var2.p() - vx5Var.p() < this.a.a();
    }

    public final void d(androidx.compose.ui.input.pointer.c cVar) {
        vx5 vx5Var = this.c;
        vx5 vx5Var2 = (vx5) cVar.c().get(0);
        if (vx5Var != null && c(vx5Var, vx5Var2) && b(vx5Var, vx5Var2)) {
            this.b++;
        } else {
            this.b = 1;
        }
        this.c = vx5Var2;
    }
}
