package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.layout.l;
import defpackage.qg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.ww8;

/* loaded from: classes.dex */
public final class ZIndexNode extends Modifier.c implements androidx.compose.ui.node.c {
    private float n;

    public ZIndexNode(float f) {
        this.n = f;
    }

    @Override // androidx.compose.ui.node.c
    public sg4 d(f fVar, qg4 qg4Var, long j) {
        final l W = qg4Var.W(j);
        return f.J(fVar, W.F0(), W.v0(), null, new ss2() { // from class: androidx.compose.ui.ZIndexNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(l.a aVar) {
                aVar.e(l.this, 0, 0, this.e2());
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((l.a) obj);
                return ww8.a;
            }
        }, 4, null);
    }

    public final float e2() {
        return this.n;
    }

    public final void f2(float f) {
        this.n = f;
    }

    public String toString() {
        return "ZIndexModifier(zIndex=" + this.n + ')';
    }
}
