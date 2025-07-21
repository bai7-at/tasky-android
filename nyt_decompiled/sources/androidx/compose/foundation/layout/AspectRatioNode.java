package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.l;
import defpackage.dg4;
import defpackage.fv0;
import defpackage.hn3;
import defpackage.in3;
import defpackage.iv0;
import defpackage.qg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.xq3;
import defpackage.yq3;

/* loaded from: classes.dex */
final class AspectRatioNode extends Modifier.c implements androidx.compose.ui.node.c {
    private float n;
    private boolean r;

    public AspectRatioNode(float f, boolean z) {
        this.n = f;
        this.r = z;
    }

    private final long e2(long j) {
        if (this.r) {
            long i2 = i2(this, j, false, 1, null);
            hn3.a aVar = hn3.b;
            if (!hn3.e(i2, aVar.a())) {
                return i2;
            }
            long k2 = k2(this, j, false, 1, null);
            if (!hn3.e(k2, aVar.a())) {
                return k2;
            }
            long m2 = m2(this, j, false, 1, null);
            if (!hn3.e(m2, aVar.a())) {
                return m2;
            }
            long o2 = o2(this, j, false, 1, null);
            if (!hn3.e(o2, aVar.a())) {
                return o2;
            }
            long h2 = h2(j, false);
            if (!hn3.e(h2, aVar.a())) {
                return h2;
            }
            long j2 = j2(j, false);
            if (!hn3.e(j2, aVar.a())) {
                return j2;
            }
            long l2 = l2(j, false);
            if (!hn3.e(l2, aVar.a())) {
                return l2;
            }
            long n2 = n2(j, false);
            if (!hn3.e(n2, aVar.a())) {
                return n2;
            }
        } else {
            long k22 = k2(this, j, false, 1, null);
            hn3.a aVar2 = hn3.b;
            if (!hn3.e(k22, aVar2.a())) {
                return k22;
            }
            long i22 = i2(this, j, false, 1, null);
            if (!hn3.e(i22, aVar2.a())) {
                return i22;
            }
            long o22 = o2(this, j, false, 1, null);
            if (!hn3.e(o22, aVar2.a())) {
                return o22;
            }
            long m22 = m2(this, j, false, 1, null);
            if (!hn3.e(m22, aVar2.a())) {
                return m22;
            }
            long j22 = j2(j, false);
            if (!hn3.e(j22, aVar2.a())) {
                return j22;
            }
            long h22 = h2(j, false);
            if (!hn3.e(h22, aVar2.a())) {
                return h22;
            }
            long n22 = n2(j, false);
            if (!hn3.e(n22, aVar2.a())) {
                return n22;
            }
            long l22 = l2(j, false);
            if (!hn3.e(l22, aVar2.a())) {
                return l22;
            }
        }
        return hn3.b.a();
    }

    private final long h2(long j, boolean z) {
        int d;
        int m = fv0.m(j);
        if (m != Integer.MAX_VALUE && (d = dg4.d(m * this.n)) > 0) {
            long a = in3.a(d, m);
            if (!z || iv0.h(j, a)) {
                return a;
            }
        }
        return hn3.b.a();
    }

    static /* synthetic */ long i2(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.h2(j, z);
    }

    private final long j2(long j, boolean z) {
        int d;
        int n = fv0.n(j);
        if (n != Integer.MAX_VALUE && (d = dg4.d(n / this.n)) > 0) {
            long a = in3.a(n, d);
            if (!z || iv0.h(j, a)) {
                return a;
            }
        }
        return hn3.b.a();
    }

    static /* synthetic */ long k2(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.j2(j, z);
    }

    private final long l2(long j, boolean z) {
        int o = fv0.o(j);
        int d = dg4.d(o * this.n);
        if (d > 0) {
            long a = in3.a(d, o);
            if (!z || iv0.h(j, a)) {
                return a;
            }
        }
        return hn3.b.a();
    }

    static /* synthetic */ long m2(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.l2(j, z);
    }

    private final long n2(long j, boolean z) {
        int p = fv0.p(j);
        int d = dg4.d(p / this.n);
        if (d > 0) {
            long a = in3.a(p, d);
            if (!z || iv0.h(j, a)) {
                return a;
            }
        }
        return hn3.b.a();
    }

    static /* synthetic */ long o2(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.n2(j, z);
    }

    @Override // androidx.compose.ui.node.c
    public sg4 d(androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j) {
        long e2 = e2(j);
        if (!hn3.e(e2, hn3.b.a())) {
            j = fv0.b.c(hn3.g(e2), hn3.f(e2));
        }
        final androidx.compose.ui.layout.l W = qg4Var.W(j);
        return androidx.compose.ui.layout.f.J(fVar, W.F0(), W.v0(), null, new ss2() { // from class: androidx.compose.foundation.layout.AspectRatioNode$measure$1
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

    @Override // androidx.compose.ui.node.c
    public int f(yq3 yq3Var, xq3 xq3Var, int i) {
        return i != Integer.MAX_VALUE ? dg4.d(i * this.n) : xq3Var.S(i);
    }

    public final void f2(float f) {
        this.n = f;
    }

    public final void g2(boolean z) {
        this.r = z;
    }

    @Override // androidx.compose.ui.node.c
    public int m(yq3 yq3Var, xq3 xq3Var, int i) {
        return i != Integer.MAX_VALUE ? dg4.d(i / this.n) : xq3Var.i(i);
    }

    @Override // androidx.compose.ui.node.c
    public int o(yq3 yq3Var, xq3 xq3Var, int i) {
        return i != Integer.MAX_VALUE ? dg4.d(i / this.n) : xq3Var.H(i);
    }

    @Override // androidx.compose.ui.node.c
    public int u(yq3 yq3Var, xq3 xq3Var, int i) {
        return i != Integer.MAX_VALUE ? dg4.d(i * this.n) : xq3Var.V(i);
    }
}
