package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import defpackage.et0;
import defpackage.rl1;

/* loaded from: classes.dex */
public final class e extends Modifier.c {
    private et0 n;

    public e(et0 et0Var) {
        this.n = et0Var;
    }

    @Override // androidx.compose.ui.Modifier.c
    public void O1() {
        rl1.k(this).m(this.n);
    }

    public final void e2(et0 et0Var) {
        this.n = et0Var;
        rl1.k(this).m(et0Var);
    }
}
