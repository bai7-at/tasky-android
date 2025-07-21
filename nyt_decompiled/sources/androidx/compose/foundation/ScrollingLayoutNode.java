package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.l;
import defpackage.fv0;
import defpackage.hk0;
import defpackage.qg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.ww8;
import defpackage.xq3;
import defpackage.yq3;

/* loaded from: classes.dex */
public final class ScrollingLayoutNode extends Modifier.c implements androidx.compose.ui.node.c {
    private ScrollState n;
    private boolean r;
    private boolean s;

    public ScrollingLayoutNode(ScrollState scrollState, boolean z, boolean z2) {
        this.n = scrollState;
        this.r = z;
        this.s = z2;
    }

    @Override // androidx.compose.ui.node.c
    public sg4 d(androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j) {
        hk0.a(j, this.s ? Orientation.Vertical : Orientation.Horizontal);
        final l W = qg4Var.W(fv0.e(j, 0, this.s ? fv0.n(j) : Integer.MAX_VALUE, 0, this.s ? Integer.MAX_VALUE : fv0.m(j), 5, null));
        int i = uo6.i(W.F0(), fv0.n(j));
        int i2 = uo6.i(W.v0(), fv0.m(j));
        final int v0 = W.v0() - i2;
        int F0 = W.F0() - i;
        if (!this.s) {
            v0 = F0;
        }
        this.n.o(v0);
        this.n.q(this.s ? i2 : i);
        return androidx.compose.ui.layout.f.J(fVar, i, i2, null, new ss2() { // from class: androidx.compose.foundation.ScrollingLayoutNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(l.a aVar) {
                int m = uo6.m(ScrollingLayoutNode.this.e2().n(), 0, v0);
                int i3 = ScrollingLayoutNode.this.f2() ? m - v0 : -m;
                l.a.n(aVar, W, ScrollingLayoutNode.this.g2() ? 0 : i3, ScrollingLayoutNode.this.g2() ? i3 : 0, 0.0f, null, 12, null);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((l.a) obj);
                return ww8.a;
            }
        }, 4, null);
    }

    public final ScrollState e2() {
        return this.n;
    }

    @Override // androidx.compose.ui.node.c
    public int f(yq3 yq3Var, xq3 xq3Var, int i) {
        return this.s ? xq3Var.S(Integer.MAX_VALUE) : xq3Var.S(i);
    }

    public final boolean f2() {
        return this.r;
    }

    public final boolean g2() {
        return this.s;
    }

    public final void h2(boolean z) {
        this.r = z;
    }

    public final void i2(ScrollState scrollState) {
        this.n = scrollState;
    }

    public final void j2(boolean z) {
        this.s = z;
    }

    @Override // androidx.compose.ui.node.c
    public int m(yq3 yq3Var, xq3 xq3Var, int i) {
        return this.s ? xq3Var.i(i) : xq3Var.i(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.c
    public int o(yq3 yq3Var, xq3 xq3Var, int i) {
        return this.s ? xq3Var.H(i) : xq3Var.H(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.c
    public int u(yq3 yq3Var, xq3 xq3Var, int i) {
        return this.s ? xq3Var.V(Integer.MAX_VALUE) : xq3Var.V(i);
    }
}
