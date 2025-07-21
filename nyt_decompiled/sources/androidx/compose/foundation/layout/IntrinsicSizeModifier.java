package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.l;
import defpackage.iv0;
import defpackage.qg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.vm3;
import defpackage.ww8;
import defpackage.xq3;
import defpackage.yq3;

/* loaded from: classes.dex */
abstract class IntrinsicSizeModifier extends Modifier.c implements androidx.compose.ui.node.c {
    @Override // androidx.compose.ui.node.c
    public final sg4 d(androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j) {
        long e2 = e2(fVar, qg4Var, j);
        if (f2()) {
            e2 = iv0.e(j, e2);
        }
        final androidx.compose.ui.layout.l W = qg4Var.W(e2);
        return androidx.compose.ui.layout.f.J(fVar, W.F0(), W.v0(), null, new ss2() { // from class: androidx.compose.foundation.layout.IntrinsicSizeModifier$measure$1
            {
                super(1);
            }

            public final void b(l.a aVar) {
                l.a.l(aVar, androidx.compose.ui.layout.l.this, vm3.b.a(), 0.0f, 2, null);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((l.a) obj);
                return ww8.a;
            }
        }, 4, null);
    }

    public abstract long e2(androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j);

    @Override // androidx.compose.ui.node.c
    public int f(yq3 yq3Var, xq3 xq3Var, int i) {
        return xq3Var.S(i);
    }

    public abstract boolean f2();

    @Override // androidx.compose.ui.node.c
    public int m(yq3 yq3Var, xq3 xq3Var, int i) {
        return xq3Var.i(i);
    }

    @Override // androidx.compose.ui.node.c
    public int o(yq3 yq3Var, xq3 xq3Var, int i) {
        return xq3Var.H(i);
    }

    @Override // androidx.compose.ui.node.c
    public int u(yq3 yq3Var, xq3 xq3Var, int i) {
        return xq3Var.V(i);
    }
}
