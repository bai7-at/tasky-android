package androidx.compose.foundation.layout;

import defpackage.fv0;
import defpackage.qg4;
import defpackage.xq3;
import defpackage.yq3;

/* loaded from: classes.dex */
final class j extends IntrinsicSizeModifier {
    private IntrinsicSize n;
    private boolean r;

    public j(IntrinsicSize intrinsicSize, boolean z) {
        this.n = intrinsicSize;
        this.r = z;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public long e2(androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j) {
        int S = this.n == IntrinsicSize.Min ? qg4Var.S(fv0.m(j)) : qg4Var.V(fv0.m(j));
        if (S < 0) {
            S = 0;
        }
        return fv0.b.e(S);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.c
    public int f(yq3 yq3Var, xq3 xq3Var, int i) {
        return this.n == IntrinsicSize.Min ? xq3Var.S(i) : xq3Var.V(i);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public boolean f2() {
        return this.r;
    }

    public void g2(boolean z) {
        this.r = z;
    }

    public final void h2(IntrinsicSize intrinsicSize) {
        this.n = intrinsicSize;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.c
    public int u(yq3 yq3Var, xq3 xq3Var, int i) {
        return this.n == IntrinsicSize.Min ? xq3Var.S(i) : xq3Var.V(i);
    }
}
