package coil.compose;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.c;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.q;
import defpackage.bv1;
import defpackage.dg4;
import defpackage.du7;
import defpackage.fv0;
import defpackage.iv0;
import defpackage.lh4;
import defpackage.ml3;
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
import defpackage.zq3;
import defpackage.zt7;

/* loaded from: classes.dex */
public final class ContentPainterModifier extends q implements c, bv1 {
    private final Painter c;
    private final Alignment d;
    private final ContentScale e;
    private final float f;
    private final qn0 g;

    public ContentPainterModifier(final Painter painter, final Alignment alignment, final ContentScale contentScale, final float f, final qn0 qn0Var) {
        super(InspectableValueKt.c() ? new ss2() { // from class: coil.compose.ContentPainterModifier$special$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(ml3 ml3Var) {
                zq3.h(ml3Var, "$this$null");
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                b(null);
                return ww8.a;
            }
        } : InspectableValueKt.a());
        this.c = painter;
        this.d = alignment;
        this.e = contentScale;
        this.f = f;
        this.g = qn0Var;
    }

    private final long l(long j) {
        if (zt7.k(j)) {
            return zt7.b.b();
        }
        long k = this.c.k();
        if (k == zt7.b.a()) {
            return j;
        }
        float i = zt7.i(k);
        if (Float.isInfinite(i) || Float.isNaN(i)) {
            i = zt7.i(j);
        }
        float g = zt7.g(k);
        if (Float.isInfinite(g) || Float.isNaN(g)) {
            g = zt7.g(j);
        }
        long a = du7.a(i, g);
        return na7.b(a, this.e.a(a, j));
    }

    private final long r(long j) {
        float p;
        int o;
        float a;
        boolean l = fv0.l(j);
        boolean k = fv0.k(j);
        if (l && k) {
            return j;
        }
        boolean z = fv0.j(j) && fv0.i(j);
        long k2 = this.c.k();
        if (k2 == zt7.b.a()) {
            return z ? fv0.e(j, fv0.n(j), 0, fv0.m(j), 0, 10, null) : j;
        }
        if (z && (l || k)) {
            p = fv0.n(j);
            o = fv0.m(j);
        } else {
            float i = zt7.i(k2);
            float g = zt7.g(k2);
            p = (Float.isInfinite(i) || Float.isNaN(i)) ? fv0.p(j) : UtilsKt.b(j, i);
            if (!Float.isInfinite(g) && !Float.isNaN(g)) {
                a = UtilsKt.a(j, g);
                long l2 = l(du7.a(p, a));
                return fv0.e(j, iv0.g(j, dg4.d(zt7.i(l2))), 0, iv0.f(j, dg4.d(zt7.g(l2))), 0, 10, null);
            }
            o = fv0.o(j);
        }
        a = o;
        long l22 = l(du7.a(p, a));
        return fv0.e(j, iv0.g(j, dg4.d(zt7.i(l22))), 0, iv0.f(j, dg4.d(zt7.g(l22))), 0, 10, null);
    }

    @Override // androidx.compose.ui.layout.c
    public sg4 d(f fVar, qg4 qg4Var, long j) {
        final l W = qg4Var.W(r(j));
        return f.J(fVar, W.F0(), W.v0(), null, new ss2() { // from class: coil.compose.ContentPainterModifier$measure$1
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterModifier)) {
            return false;
        }
        ContentPainterModifier contentPainterModifier = (ContentPainterModifier) obj;
        return zq3.c(this.c, contentPainterModifier.c) && zq3.c(this.d, contentPainterModifier.d) && zq3.c(this.e, contentPainterModifier.e) && zq3.c(Float.valueOf(this.f), Float.valueOf(contentPainterModifier.f)) && zq3.c(this.g, contentPainterModifier.g);
    }

    @Override // androidx.compose.ui.layout.c
    public int f(yq3 yq3Var, xq3 xq3Var, int i) {
        if (this.c.k() == zt7.b.a()) {
            return xq3Var.S(i);
        }
        int S = xq3Var.S(fv0.m(r(iv0.b(0, 0, 0, i, 7, null))));
        return Math.max(dg4.d(zt7.i(l(du7.a(S, i)))), S);
    }

    public int hashCode() {
        int hashCode = ((((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + Float.hashCode(this.f)) * 31;
        qn0 qn0Var = this.g;
        return hashCode + (qn0Var == null ? 0 : qn0Var.hashCode());
    }

    @Override // androidx.compose.ui.layout.c
    public int m(yq3 yq3Var, xq3 xq3Var, int i) {
        if (this.c.k() == zt7.b.a()) {
            return xq3Var.i(i);
        }
        int i2 = xq3Var.i(fv0.n(r(iv0.b(0, i, 0, 0, 13, null))));
        return Math.max(dg4.d(zt7.g(l(du7.a(i, i2)))), i2);
    }

    @Override // androidx.compose.ui.layout.c
    public int o(yq3 yq3Var, xq3 xq3Var, int i) {
        if (this.c.k() == zt7.b.a()) {
            return xq3Var.H(i);
        }
        int H = xq3Var.H(fv0.n(r(iv0.b(0, i, 0, 0, 13, null))));
        return Math.max(dg4.d(zt7.g(l(du7.a(i, H)))), H);
    }

    public String toString() {
        return "ContentPainterModifier(painter=" + this.c + ", alignment=" + this.d + ", contentScale=" + this.e + ", alpha=" + this.f + ", colorFilter=" + this.g + ')';
    }

    @Override // androidx.compose.ui.layout.c
    public int u(yq3 yq3Var, xq3 xq3Var, int i) {
        if (this.c.k() == zt7.b.a()) {
            return xq3Var.V(i);
        }
        int V = xq3Var.V(fv0.m(r(iv0.b(0, 0, 0, i, 7, null))));
        return Math.max(dg4.d(zt7.i(l(du7.a(V, i)))), V);
    }

    @Override // defpackage.bv1
    public void w(yv0 yv0Var) {
        long l = l(yv0Var.b());
        long a = this.d.a(UtilsKt.f(l), UtilsKt.f(yv0Var.b()), yv0Var.getLayoutDirection());
        float c = vm3.c(a);
        float d = vm3.d(a);
        yv0Var.i1().a().c(c, d);
        this.c.j(yv0Var, l, this.f, this.g);
        yv0Var.i1().a().c(-c, -d);
        yv0Var.A1();
    }
}
