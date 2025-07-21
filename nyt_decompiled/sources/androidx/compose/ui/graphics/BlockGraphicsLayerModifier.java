package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.node.NodeCoordinator;
import defpackage.a85;
import defpackage.qg4;
import defpackage.rl1;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.ww8;

/* loaded from: classes.dex */
final class BlockGraphicsLayerModifier extends Modifier.c implements androidx.compose.ui.node.c {
    private ss2 n;

    public BlockGraphicsLayerModifier(ss2 ss2Var) {
        this.n = ss2Var;
    }

    @Override // androidx.compose.ui.Modifier.c
    public boolean J1() {
        return false;
    }

    @Override // androidx.compose.ui.node.c
    public sg4 d(f fVar, qg4 qg4Var, long j) {
        final l W = qg4Var.W(j);
        return f.J(fVar, W.F0(), W.v0(), null, new ss2() { // from class: androidx.compose.ui.graphics.BlockGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(l.a aVar) {
                l.a.r(aVar, l.this, 0, 0, 0.0f, this.e2(), 4, null);
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

    public final void f2() {
        NodeCoordinator l2 = rl1.h(this, a85.a(2)).l2();
        if (l2 != null) {
            l2.W2(this.n, true);
        }
    }

    public final void g2(ss2 ss2Var) {
        this.n = ss2Var;
    }

    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.n + ')';
    }
}
