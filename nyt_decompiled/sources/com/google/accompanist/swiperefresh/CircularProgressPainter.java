package com.google.accompanist.swiperefresh;

import androidx.compose.runtime.b0;
import androidx.compose.ui.graphics.painter.Painter;
import defpackage.bu1;
import defpackage.c04;
import defpackage.cg;
import defpackage.du7;
import defpackage.fd5;
import defpackage.fv1;
import defpackage.hd5;
import defpackage.ip5;
import defpackage.kt6;
import defpackage.nn0;
import defpackage.np5;
import defpackage.qs2;
import defpackage.sy4;
import defpackage.u48;
import defpackage.v48;
import defpackage.zq3;
import defpackage.zt7;
import defpackage.zu1;
import kotlin.c;

/* loaded from: classes2.dex */
public final class CircularProgressPainter extends Painter {
    private final sy4 g = b0.e(nn0.j(nn0.b.g()), null, 2, null);
    private final sy4 h;
    private final sy4 i;
    private final sy4 j;
    private final sy4 k;
    private final sy4 l;
    private final sy4 m;
    private final sy4 n;
    private final c04 r;
    private final sy4 s;
    private final sy4 t;
    private final sy4 u;

    public CircularProgressPainter() {
        Float valueOf = Float.valueOf(1.0f);
        this.h = b0.e(valueOf, null, 2, null);
        float f = 0;
        this.i = b0.e(bu1.d(bu1.g(f)), null, 2, null);
        this.j = b0.e(bu1.d(bu1.g(5)), null, 2, null);
        this.k = b0.e(Boolean.FALSE, null, 2, null);
        this.l = b0.e(bu1.d(bu1.g(f)), null, 2, null);
        this.m = b0.e(bu1.d(bu1.g(f)), null, 2, null);
        this.n = b0.e(valueOf, null, 2, null);
        this.r = c.a(new qs2() { // from class: com.google.accompanist.swiperefresh.CircularProgressPainter$arrow$2
            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ip5 mo865invoke() {
                ip5 a2 = cg.a();
                a2.A(np5.a.a());
                return a2;
            }
        });
        Float valueOf2 = Float.valueOf(0.0f);
        this.s = b0.e(valueOf2, null, 2, null);
        this.t = b0.e(valueOf2, null, 2, null);
        this.u = b0.e(valueOf2, null, 2, null);
    }

    private final void n(fv1 fv1Var, float f, float f2, kt6 kt6Var) {
        q().a();
        q().r(0.0f, 0.0f);
        q().t(fv1Var.f1(u()) * t(), 0.0f);
        q().t((fv1Var.f1(u()) * t()) / 2, fv1Var.f1(s()) * t());
        q().C(hd5.a(((Math.min(kt6Var.n(), kt6Var.h()) / 2.0f) + fd5.o(kt6Var.g())) - ((fv1Var.f1(u()) * t()) / 2.0f), fd5.p(kt6Var.g()) + (fv1Var.f1(z()) / 2.0f)));
        q().close();
        long t1 = fv1Var.t1();
        zu1 i1 = fv1Var.i1();
        long b = i1.b();
        i1.c().t();
        i1.a().f(f + f2, t1);
        fv1.k0(fv1Var, q(), v(), o(), null, null, 0, 56, null);
        i1.c().k();
        i1.d(b);
    }

    private final ip5 q() {
        return (ip5) this.r.getValue();
    }

    public final void A(float f) {
        this.h.setValue(Float.valueOf(f));
    }

    public final void B(float f) {
        this.i.setValue(bu1.d(f));
    }

    public final void C(boolean z) {
        this.k.setValue(Boolean.valueOf(z));
    }

    public final void D(float f) {
        this.m.setValue(bu1.d(f));
    }

    public final void E(float f) {
        this.n.setValue(Float.valueOf(f));
    }

    public final void F(float f) {
        this.l.setValue(bu1.d(f));
    }

    public final void G(long j) {
        this.g.setValue(nn0.j(j));
    }

    public final void H(float f) {
        this.t.setValue(Float.valueOf(f));
    }

    public final void I(float f) {
        this.u.setValue(Float.valueOf(f));
    }

    public final void J(float f) {
        this.s.setValue(Float.valueOf(f));
    }

    public final void K(float f) {
        this.j.setValue(bu1.d(f));
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean a(float f) {
        A(f);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public long k() {
        return zt7.b.a();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void m(fv1 fv1Var) {
        zq3.h(fv1Var, "<this>");
        float x = x();
        long t1 = fv1Var.t1();
        zu1 i1 = fv1Var.i1();
        long b = i1.b();
        i1.c().t();
        i1.a().f(x, t1);
        float f1 = fv1Var.f1(p()) + (fv1Var.f1(z()) / 2.0f);
        kt6 kt6Var = new kt6(fd5.o(du7.b(fv1Var.b())) - f1, fd5.p(du7.b(fv1Var.b())) - f1, fd5.o(du7.b(fv1Var.b())) + f1, fd5.p(du7.b(fv1Var.b())) + f1);
        float f = 360;
        float y = (y() + x()) * f;
        float w = ((w() + x()) * f) - y;
        fv1.K0(fv1Var, v(), y, w, false, kt6Var.m(), kt6Var.k(), o(), new u48(fv1Var.f1(z()), 0.0f, v48.a.c(), 0, null, 26, null), null, 0, 768, null);
        if (r()) {
            n(fv1Var, y, w, kt6Var);
        }
        i1.c().k();
        i1.d(b);
    }

    public final float o() {
        return ((Number) this.h.getValue()).floatValue();
    }

    public final float p() {
        return ((bu1) this.i.getValue()).n();
    }

    public final boolean r() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final float s() {
        return ((bu1) this.m.getValue()).n();
    }

    public final float t() {
        return ((Number) this.n.getValue()).floatValue();
    }

    public final float u() {
        return ((bu1) this.l.getValue()).n();
    }

    public final long v() {
        return ((nn0) this.g.getValue()).B();
    }

    public final float w() {
        return ((Number) this.t.getValue()).floatValue();
    }

    public final float x() {
        return ((Number) this.u.getValue()).floatValue();
    }

    public final float y() {
        return ((Number) this.s.getValue()).floatValue();
    }

    public final float z() {
        return ((bu1) this.j.getValue()).n();
    }
}
