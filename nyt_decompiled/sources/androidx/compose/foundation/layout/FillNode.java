package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.l;
import defpackage.dg4;
import defpackage.fv0;
import defpackage.iv0;
import defpackage.qg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.ww8;

/* loaded from: classes.dex */
final class FillNode extends Modifier.c implements androidx.compose.ui.node.c {
    private Direction n;
    private float r;

    public FillNode(Direction direction, float f) {
        this.n = direction;
        this.r = f;
    }

    @Override // androidx.compose.ui.node.c
    public sg4 d(androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j) {
        int p;
        int n;
        int o;
        int m;
        if (!fv0.j(j) || this.n == Direction.Vertical) {
            p = fv0.p(j);
            n = fv0.n(j);
        } else {
            p = uo6.m(dg4.d(fv0.n(j) * this.r), fv0.p(j), fv0.n(j));
            n = p;
        }
        if (!fv0.i(j) || this.n == Direction.Horizontal) {
            o = fv0.o(j);
            m = fv0.m(j);
        } else {
            o = uo6.m(dg4.d(fv0.m(j) * this.r), fv0.o(j), fv0.m(j));
            m = o;
        }
        final androidx.compose.ui.layout.l W = qg4Var.W(iv0.a(p, n, o, m));
        return androidx.compose.ui.layout.f.J(fVar, W.F0(), W.v0(), null, new ss2() { // from class: androidx.compose.foundation.layout.FillNode$measure$1
            {
                super(1);
            }

            public final void b(l.a aVar) {
                l.a.j(aVar, androidx.compose.ui.layout.l.this, 0, 0, 0.0f, 4, null);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((l.a) obj);
                return ww8.a;
            }
        }, 4, null);
    }

    public final void e2(Direction direction) {
        this.n = direction;
    }

    public final void f2(float f) {
        this.r = f;
    }
}
