package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.l;
import defpackage.fv0;
import defpackage.gt2;
import defpackage.hn3;
import defpackage.in3;
import defpackage.iv0;
import defpackage.qg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.vm3;
import defpackage.ww8;

/* loaded from: classes.dex */
final class WrapContentNode extends Modifier.c implements androidx.compose.ui.node.c {
    private Direction n;
    private boolean r;
    private gt2 s;

    public WrapContentNode(Direction direction, boolean z, gt2 gt2Var) {
        this.n = direction;
        this.r = z;
        this.s = gt2Var;
    }

    @Override // androidx.compose.ui.node.c
    public sg4 d(final androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j) {
        Direction direction = this.n;
        Direction direction2 = Direction.Vertical;
        int p = direction != direction2 ? 0 : fv0.p(j);
        Direction direction3 = this.n;
        Direction direction4 = Direction.Horizontal;
        final androidx.compose.ui.layout.l W = qg4Var.W(iv0.a(p, (this.n == direction2 || !this.r) ? fv0.n(j) : Integer.MAX_VALUE, direction3 == direction4 ? fv0.o(j) : 0, (this.n == direction4 || !this.r) ? fv0.m(j) : Integer.MAX_VALUE));
        final int m = uo6.m(W.F0(), fv0.p(j), fv0.n(j));
        final int m2 = uo6.m(W.v0(), fv0.o(j), fv0.m(j));
        return androidx.compose.ui.layout.f.J(fVar, m, m2, null, new ss2() { // from class: androidx.compose.foundation.layout.WrapContentNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(l.a aVar) {
                l.a.h(aVar, W, ((vm3) WrapContentNode.this.e2().invoke(hn3.b(in3.a(m - W.F0(), m2 - W.v0())), fVar.getLayoutDirection())).n(), 0.0f, 2, null);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((l.a) obj);
                return ww8.a;
            }
        }, 4, null);
    }

    public final gt2 e2() {
        return this.s;
    }

    public final void f2(gt2 gt2Var) {
        this.s = gt2Var;
    }

    public final void g2(Direction direction) {
        this.n = direction;
    }

    public final void h2(boolean z) {
        this.r = z;
    }
}
