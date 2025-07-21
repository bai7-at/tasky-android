package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.l;
import defpackage.bu1;
import defpackage.fm1;
import defpackage.fv0;
import defpackage.iv0;
import defpackage.qg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.ww8;
import defpackage.xq3;
import defpackage.yq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class SizeNode extends Modifier.c implements androidx.compose.ui.node.c {
    private float n;
    private float r;
    private float s;
    private float t;
    private boolean u;

    public /* synthetic */ SizeNode(float f, float f2, float f3, float f4, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z);
    }

    private final long e2(fm1 fm1Var) {
        int i;
        int d;
        float f = this.s;
        bu1.a aVar = bu1.b;
        int i2 = 0;
        int d2 = !bu1.j(f, aVar.c()) ? uo6.d(fm1Var.l0(this.s), 0) : Integer.MAX_VALUE;
        int d3 = !bu1.j(this.t, aVar.c()) ? uo6.d(fm1Var.l0(this.t), 0) : Integer.MAX_VALUE;
        if (bu1.j(this.n, aVar.c()) || (i = uo6.d(uo6.i(fm1Var.l0(this.n), d2), 0)) == Integer.MAX_VALUE) {
            i = 0;
        }
        if (!bu1.j(this.r, aVar.c()) && (d = uo6.d(uo6.i(fm1Var.l0(this.r), d3), 0)) != Integer.MAX_VALUE) {
            i2 = d;
        }
        return iv0.a(i, d2, i2, d3);
    }

    @Override // androidx.compose.ui.node.c
    public sg4 d(androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j) {
        long a;
        long e2 = e2(fVar);
        if (this.u) {
            a = iv0.e(j, e2);
        } else {
            float f = this.n;
            bu1.a aVar = bu1.b;
            a = iv0.a(!bu1.j(f, aVar.c()) ? fv0.p(e2) : uo6.i(fv0.p(j), fv0.n(e2)), !bu1.j(this.s, aVar.c()) ? fv0.n(e2) : uo6.d(fv0.n(j), fv0.p(e2)), !bu1.j(this.r, aVar.c()) ? fv0.o(e2) : uo6.i(fv0.o(j), fv0.m(e2)), !bu1.j(this.t, aVar.c()) ? fv0.m(e2) : uo6.d(fv0.m(j), fv0.o(e2)));
        }
        final androidx.compose.ui.layout.l W = qg4Var.W(a);
        return androidx.compose.ui.layout.f.J(fVar, W.F0(), W.v0(), null, new ss2() { // from class: androidx.compose.foundation.layout.SizeNode$measure$1
            {
                super(1);
            }

            public final void b(l.a aVar2) {
                l.a.j(aVar2, androidx.compose.ui.layout.l.this, 0, 0, 0.0f, 4, null);
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
        long e2 = e2(yq3Var);
        return fv0.l(e2) ? fv0.n(e2) : iv0.g(e2, xq3Var.S(i));
    }

    public final void f2(boolean z) {
        this.u = z;
    }

    public final void g2(float f) {
        this.t = f;
    }

    public final void h2(float f) {
        this.s = f;
    }

    public final void i2(float f) {
        this.r = f;
    }

    public final void j2(float f) {
        this.n = f;
    }

    @Override // androidx.compose.ui.node.c
    public int m(yq3 yq3Var, xq3 xq3Var, int i) {
        long e2 = e2(yq3Var);
        return fv0.k(e2) ? fv0.m(e2) : iv0.f(e2, xq3Var.i(i));
    }

    @Override // androidx.compose.ui.node.c
    public int o(yq3 yq3Var, xq3 xq3Var, int i) {
        long e2 = e2(yq3Var);
        return fv0.k(e2) ? fv0.m(e2) : iv0.f(e2, xq3Var.H(i));
    }

    @Override // androidx.compose.ui.node.c
    public int u(yq3 yq3Var, xq3 xq3Var, int i) {
        long e2 = e2(yq3Var);
        return fv0.l(e2) ? fv0.n(e2) : iv0.g(e2, xq3Var.V(i));
    }

    private SizeNode(float f, float f2, float f3, float f4, boolean z) {
        this.n = f;
        this.r = f2;
        this.s = f3;
        this.t = f4;
        this.u = z;
    }
}
