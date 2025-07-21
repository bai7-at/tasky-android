package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.layout.l;
import defpackage.cv1;
import defpackage.dg4;
import defpackage.du7;
import defpackage.fv0;
import defpackage.in3;
import defpackage.iv0;
import defpackage.na7;
import defpackage.qg4;
import defpackage.qn0;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.vm3;
import defpackage.ww8;
import defpackage.xq3;
import defpackage.yq3;
import defpackage.yv0;
import defpackage.zt7;

/* loaded from: classes.dex */
final class PainterNode extends Modifier.c implements androidx.compose.ui.node.c, cv1 {
    private Painter n;
    private boolean r;
    private Alignment s;
    private ContentScale t;
    private float u;
    private qn0 w;

    public PainterNode(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f, qn0 qn0Var) {
        this.n = painter;
        this.r = z;
        this.s = alignment;
        this.t = contentScale;
        this.u = f;
        this.w = qn0Var;
    }

    private final long e2(long j) {
        if (!h2()) {
            return j;
        }
        long a = du7.a(!j2(this.n.k()) ? zt7.i(j) : zt7.i(this.n.k()), !i2(this.n.k()) ? zt7.g(j) : zt7.g(this.n.k()));
        return (zt7.i(j) == 0.0f || zt7.g(j) == 0.0f) ? zt7.b.b() : na7.b(a, this.t.a(a, j));
    }

    private final boolean h2() {
        return this.r && this.n.k() != zt7.b.a();
    }

    private final boolean i2(long j) {
        if (!zt7.f(j, zt7.b.a())) {
            float g = zt7.g(j);
            if (!Float.isInfinite(g) && !Float.isNaN(g)) {
                return true;
            }
        }
        return false;
    }

    private final boolean j2(long j) {
        if (!zt7.f(j, zt7.b.a())) {
            float i = zt7.i(j);
            if (!Float.isInfinite(i) && !Float.isNaN(i)) {
                return true;
            }
        }
        return false;
    }

    private final long k2(long j) {
        boolean z = false;
        boolean z2 = fv0.j(j) && fv0.i(j);
        if (fv0.l(j) && fv0.k(j)) {
            z = true;
        }
        if ((!h2() && z2) || z) {
            return fv0.e(j, fv0.n(j), 0, fv0.m(j), 0, 10, null);
        }
        long k = this.n.k();
        long e2 = e2(du7.a(iv0.g(j, j2(k) ? dg4.d(zt7.i(k)) : fv0.p(j)), iv0.f(j, i2(k) ? dg4.d(zt7.g(k)) : fv0.o(j))));
        return fv0.e(j, iv0.g(j, dg4.d(zt7.i(e2))), 0, iv0.f(j, dg4.d(zt7.g(e2))), 0, 10, null);
    }

    @Override // androidx.compose.ui.Modifier.c
    public boolean J1() {
        return false;
    }

    public final void c(float f) {
        this.u = f;
    }

    @Override // androidx.compose.ui.node.c
    public sg4 d(f fVar, qg4 qg4Var, long j) {
        final l W = qg4Var.W(k2(j));
        return f.J(fVar, W.F0(), W.v0(), null, new ss2() { // from class: androidx.compose.ui.draw.PainterNode$measure$1
            {
                super(1);
            }

            public final void b(l.a aVar) {
                l.a.j(aVar, l.this, 0, 0, 0.0f, 4, null);
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
        if (!h2()) {
            return xq3Var.S(i);
        }
        long k2 = k2(iv0.b(0, 0, 0, i, 7, null));
        return Math.max(fv0.p(k2), xq3Var.S(i));
    }

    public final Painter f2() {
        return this.n;
    }

    public final boolean g2() {
        return this.r;
    }

    public final void l2(Alignment alignment) {
        this.s = alignment;
    }

    @Override // androidx.compose.ui.node.c
    public int m(yq3 yq3Var, xq3 xq3Var, int i) {
        if (!h2()) {
            return xq3Var.i(i);
        }
        long k2 = k2(iv0.b(0, i, 0, 0, 13, null));
        return Math.max(fv0.o(k2), xq3Var.i(i));
    }

    public final void m2(qn0 qn0Var) {
        this.w = qn0Var;
    }

    public final void n2(ContentScale contentScale) {
        this.t = contentScale;
    }

    @Override // androidx.compose.ui.node.c
    public int o(yq3 yq3Var, xq3 xq3Var, int i) {
        if (!h2()) {
            return xq3Var.H(i);
        }
        long k2 = k2(iv0.b(0, i, 0, 0, 13, null));
        return Math.max(fv0.o(k2), xq3Var.H(i));
    }

    public final void o2(Painter painter) {
        this.n = painter;
    }

    public final void p2(boolean z) {
        this.r = z;
    }

    public String toString() {
        return "PainterModifier(painter=" + this.n + ", sizeToIntrinsics=" + this.r + ", alignment=" + this.s + ", alpha=" + this.u + ", colorFilter=" + this.w + ')';
    }

    @Override // androidx.compose.ui.node.c
    public int u(yq3 yq3Var, xq3 xq3Var, int i) {
        if (!h2()) {
            return xq3Var.V(i);
        }
        long k2 = k2(iv0.b(0, 0, 0, i, 7, null));
        return Math.max(fv0.p(k2), xq3Var.V(i));
    }

    @Override // defpackage.cv1
    public void w(yv0 yv0Var) {
        long k = this.n.k();
        long a = du7.a(j2(k) ? zt7.i(k) : zt7.i(yv0Var.b()), i2(k) ? zt7.g(k) : zt7.g(yv0Var.b()));
        long b = (zt7.i(yv0Var.b()) == 0.0f || zt7.g(yv0Var.b()) == 0.0f) ? zt7.b.b() : na7.b(a, this.t.a(a, yv0Var.b()));
        long a2 = this.s.a(in3.a(dg4.d(zt7.i(b)), dg4.d(zt7.g(b))), in3.a(dg4.d(zt7.i(yv0Var.b())), dg4.d(zt7.g(yv0Var.b()))), yv0Var.getLayoutDirection());
        float j = vm3.j(a2);
        float k2 = vm3.k(a2);
        yv0Var.i1().a().c(j, k2);
        this.n.j(yv0Var, b, this.u, this.w);
        yv0Var.i1().a().c(-j, -k2);
        yv0Var.A1();
    }
}
