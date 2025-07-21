package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.l;
import defpackage.qg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.vm3;
import defpackage.ww8;

/* loaded from: classes.dex */
final class OffsetPxNode extends Modifier.c implements androidx.compose.ui.node.c {
    private ss2 n;
    private boolean r;

    public OffsetPxNode(ss2 ss2Var, boolean z) {
        this.n = ss2Var;
        this.r = z;
    }

    @Override // androidx.compose.ui.node.c
    public sg4 d(final androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j) {
        final androidx.compose.ui.layout.l W = qg4Var.W(j);
        return androidx.compose.ui.layout.f.J(fVar, W.F0(), W.v0(), null, new ss2() { // from class: androidx.compose.foundation.layout.OffsetPxNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(l.a aVar) {
                long n = ((vm3) OffsetPxNode.this.e2().invoke(fVar)).n();
                if (OffsetPxNode.this.f2()) {
                    l.a.n(aVar, W, vm3.j(n), vm3.k(n), 0.0f, null, 12, null);
                } else {
                    l.a.r(aVar, W, vm3.j(n), vm3.k(n), 0.0f, null, 12, null);
                }
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((l.a) obj);
                return ww8.a;
            }
        }, 4, null);
    }

    public final ss2 e2() {
        return this.n;
    }

    public final boolean f2() {
        return this.r;
    }

    public final void g2(ss2 ss2Var) {
        this.n = ss2Var;
    }

    public final void h2(boolean z) {
        this.r = z;
    }
}
