package androidx.compose.foundation.relocation;

import androidx.compose.ui.Modifier;
import defpackage.ct0;
import defpackage.cz3;
import defpackage.kv4;
import defpackage.pc0;
import defpackage.tc0;
import defpackage.zy3;

/* loaded from: classes.dex */
public abstract class a extends Modifier.c implements kv4, zy3, ct0 {
    private final pc0 n = tc0.b(this);
    private cz3 r;

    private final pc0 f2() {
        return (pc0) l(BringIntoViewKt.a());
    }

    @Override // defpackage.zy3
    public void F0(cz3 cz3Var) {
        this.r = cz3Var;
    }

    protected final cz3 e2() {
        cz3 cz3Var = this.r;
        if (cz3Var == null || !cz3Var.m()) {
            return null;
        }
        return cz3Var;
    }

    protected final pc0 g2() {
        pc0 f2 = f2();
        return f2 == null ? this.n : f2;
    }
}
