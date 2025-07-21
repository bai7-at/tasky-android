package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.l;
import defpackage.bu1;
import defpackage.iv0;
import defpackage.qg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.ym5;

/* loaded from: classes.dex */
final class PaddingValuesModifier extends Modifier.c implements androidx.compose.ui.node.c {
    private ym5 n;

    public PaddingValuesModifier(ym5 ym5Var) {
        this.n = ym5Var;
    }

    @Override // androidx.compose.ui.node.c
    public sg4 d(final androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j) {
        float f = 0;
        if (bu1.f(this.n.b(fVar.getLayoutDirection()), bu1.g(f)) < 0 || bu1.f(this.n.d(), bu1.g(f)) < 0 || bu1.f(this.n.c(fVar.getLayoutDirection()), bu1.g(f)) < 0 || bu1.f(this.n.a(), bu1.g(f)) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
        int l0 = fVar.l0(this.n.b(fVar.getLayoutDirection())) + fVar.l0(this.n.c(fVar.getLayoutDirection()));
        int l02 = fVar.l0(this.n.d()) + fVar.l0(this.n.a());
        final androidx.compose.ui.layout.l W = qg4Var.W(iv0.i(j, -l0, -l02));
        return androidx.compose.ui.layout.f.J(fVar, iv0.g(j, W.F0() + l0), iv0.f(j, W.v0() + l02), null, new ss2() { // from class: androidx.compose.foundation.layout.PaddingValuesModifier$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(l.a aVar) {
                l.a.f(aVar, androidx.compose.ui.layout.l.this, fVar.l0(this.e2().b(fVar.getLayoutDirection())), fVar.l0(this.e2().d()), 0.0f, 4, null);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((l.a) obj);
                return ww8.a;
            }
        }, 4, null);
    }

    public final ym5 e2() {
        return this.n;
    }

    public final void f2(ym5 ym5Var) {
        this.n = ym5Var;
    }
}
