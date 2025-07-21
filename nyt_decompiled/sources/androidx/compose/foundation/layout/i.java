package androidx.compose.foundation.layout;

import defpackage.fv0;
import defpackage.qg4;
import defpackage.xq3;
import defpackage.yq3;

/* loaded from: classes.dex */
final class i extends IntrinsicSizeModifier {
    private IntrinsicSize n;
    private boolean r;

    public i(IntrinsicSize intrinsicSize, boolean z) {
        this.n = intrinsicSize;
        this.r = z;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public long e2(androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j) {
        int H = this.n == IntrinsicSize.Min ? qg4Var.H(fv0.n(j)) : qg4Var.i(fv0.n(j));
        if (H < 0) {
            H = 0;
        }
        return fv0.b.d(H);
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
    public int m(yq3 yq3Var, xq3 xq3Var, int i) {
        return this.n == IntrinsicSize.Min ? xq3Var.H(i) : xq3Var.i(i);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.c
    public int o(yq3 yq3Var, xq3 xq3Var, int i) {
        return this.n == IntrinsicSize.Min ? xq3Var.H(i) : xq3Var.i(i);
    }
}
