package androidx.compose.foundation.lazy;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.node.c;
import defpackage.dg4;
import defpackage.fv0;
import defpackage.iv0;
import defpackage.qg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.x08;

/* loaded from: classes.dex */
final class ParentSizeNode extends Modifier.c implements c {
    private float n;
    private x08 r;
    private x08 s;

    public ParentSizeNode(float f, x08 x08Var, x08 x08Var2) {
        this.n = f;
        this.r = x08Var;
        this.s = x08Var2;
    }

    @Override // androidx.compose.ui.node.c
    public sg4 d(f fVar, qg4 qg4Var, long j) {
        x08 x08Var = this.r;
        int d = (x08Var == null || ((Number) x08Var.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : dg4.d(((Number) x08Var.getValue()).floatValue() * this.n);
        x08 x08Var2 = this.s;
        int d2 = (x08Var2 == null || ((Number) x08Var2.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : dg4.d(((Number) x08Var2.getValue()).floatValue() * this.n);
        int p = d != Integer.MAX_VALUE ? d : fv0.p(j);
        int o = d2 != Integer.MAX_VALUE ? d2 : fv0.o(j);
        if (d == Integer.MAX_VALUE) {
            d = fv0.n(j);
        }
        if (d2 == Integer.MAX_VALUE) {
            d2 = fv0.m(j);
        }
        final l W = qg4Var.W(iv0.a(p, d, o, d2));
        return f.J(fVar, W.F0(), W.v0(), null, new ss2() { // from class: androidx.compose.foundation.lazy.ParentSizeNode$measure$1
            {
                super(1);
            }

            public final void b(l.a aVar) {
                l.a.f(aVar, l.this, 0, 0, 0.0f, 4, null);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((l.a) obj);
                return ww8.a;
            }
        }, 4, null);
    }

    public final void e2(float f) {
        this.n = f;
    }

    public final void f2(x08 x08Var) {
        this.s = x08Var;
    }

    public final void g2(x08 x08Var) {
        this.r = x08Var;
    }
}
