package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.node.NodeCoordinator;
import defpackage.a85;
import defpackage.nn0;
import defpackage.no7;
import defpackage.qg4;
import defpackage.rl1;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.yw6;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class SimpleGraphicsLayerModifier extends Modifier.c implements androidx.compose.ui.node.c {
    private float B;
    private float H;
    private long L;
    private no7 M;
    private boolean N;
    private long Q;
    private long S;
    private int X;
    private ss2 Y;
    private float n;
    private float r;
    private float s;
    private float t;
    private float u;
    private float w;
    private float x;
    private float y;

    public /* synthetic */ SimpleGraphicsLayerModifier(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, no7 no7Var, boolean z, yw6 yw6Var, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, no7Var, z, yw6Var, j2, j3, i);
    }

    public final float D0() {
        return this.n;
    }

    public final void G0(float f) {
        this.w = f;
    }

    @Override // androidx.compose.ui.Modifier.c
    public boolean J1() {
        return false;
    }

    public final float M() {
        return this.y;
    }

    public final float R() {
        return this.B;
    }

    public final void b0(long j) {
        this.Q = j;
    }

    public final void c(float f) {
        this.s = f;
    }

    @Override // androidx.compose.ui.node.c
    public sg4 d(f fVar, qg4 qg4Var, long j) {
        final l W = qg4Var.W(j);
        return f.J(fVar, W.F0(), W.v0(), null, new ss2() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(l.a aVar) {
                ss2 ss2Var;
                l lVar = l.this;
                ss2Var = this.Y;
                l.a.r(aVar, lVar, 0, 0, 0.0f, ss2Var, 4, null);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((l.a) obj);
                return ww8.a;
            }
        }, 4, null);
    }

    public final float d1() {
        return this.u;
    }

    public final void e1(no7 no7Var) {
        this.M = no7Var;
    }

    public final float f0() {
        return this.H;
    }

    public final float f2() {
        return this.s;
    }

    public final void g(float f) {
        this.u = f;
    }

    public final long g2() {
        return this.Q;
    }

    public final void h(yw6 yw6Var) {
    }

    public final boolean h2() {
        return this.N;
    }

    public final void i0(boolean z) {
        this.N = z;
    }

    public final int i2() {
        return this.X;
    }

    public final void j(int i) {
        this.X = i;
    }

    public final long j0() {
        return this.L;
    }

    public final yw6 j2() {
        return null;
    }

    public final float k2() {
        return this.w;
    }

    public final no7 l2() {
        return this.M;
    }

    public final void m0(long j) {
        this.L = j;
    }

    public final float m1() {
        return this.t;
    }

    public final long m2() {
        return this.S;
    }

    public final void n(float f) {
        this.n = f;
    }

    public final void n0(long j) {
        this.S = j;
    }

    public final void n2() {
        NodeCoordinator l2 = rl1.h(this, a85.a(2)).l2();
        if (l2 != null) {
            l2.W2(this.Y, true);
        }
    }

    public final float o1() {
        return this.x;
    }

    public final void p(float f) {
        this.H = f;
    }

    public final void q(float f) {
        this.x = f;
    }

    public final void r(float f) {
        this.y = f;
    }

    public final void s(float f) {
        this.B = f;
    }

    public final void t(float f) {
        this.r = f;
    }

    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.n + ", scaleY=" + this.r + ", alpha = " + this.s + ", translationX=" + this.t + ", translationY=" + this.u + ", shadowElevation=" + this.w + ", rotationX=" + this.x + ", rotationY=" + this.y + ", rotationZ=" + this.B + ", cameraDistance=" + this.H + ", transformOrigin=" + ((Object) e.i(this.L)) + ", shape=" + this.M + ", clip=" + this.N + ", renderEffect=" + ((Object) null) + ", ambientShadowColor=" + ((Object) nn0.A(this.Q)) + ", spotShadowColor=" + ((Object) nn0.A(this.S)) + ", compositingStrategy=" + ((Object) a.g(this.X)) + ')';
    }

    public final void x(float f) {
        this.t = f;
    }

    public final float y1() {
        return this.r;
    }

    private SimpleGraphicsLayerModifier(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, no7 no7Var, boolean z, yw6 yw6Var, long j2, long j3, int i) {
        this.n = f;
        this.r = f2;
        this.s = f3;
        this.t = f4;
        this.u = f5;
        this.w = f6;
        this.x = f7;
        this.y = f8;
        this.B = f9;
        this.H = f10;
        this.L = j;
        this.M = no7Var;
        this.N = z;
        this.Q = j2;
        this.S = j3;
        this.X = i;
        this.Y = new ss2() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$layerBlock$1
            {
                super(1);
            }

            public final void b(c cVar) {
                cVar.n(SimpleGraphicsLayerModifier.this.D0());
                cVar.t(SimpleGraphicsLayerModifier.this.y1());
                cVar.c(SimpleGraphicsLayerModifier.this.f2());
                cVar.x(SimpleGraphicsLayerModifier.this.m1());
                cVar.g(SimpleGraphicsLayerModifier.this.d1());
                cVar.G0(SimpleGraphicsLayerModifier.this.k2());
                cVar.q(SimpleGraphicsLayerModifier.this.o1());
                cVar.r(SimpleGraphicsLayerModifier.this.M());
                cVar.s(SimpleGraphicsLayerModifier.this.R());
                cVar.p(SimpleGraphicsLayerModifier.this.f0());
                cVar.m0(SimpleGraphicsLayerModifier.this.j0());
                cVar.e1(SimpleGraphicsLayerModifier.this.l2());
                cVar.i0(SimpleGraphicsLayerModifier.this.h2());
                SimpleGraphicsLayerModifier.this.j2();
                cVar.h(null);
                cVar.b0(SimpleGraphicsLayerModifier.this.g2());
                cVar.n0(SimpleGraphicsLayerModifier.this.m2());
                cVar.j(SimpleGraphicsLayerModifier.this.i2());
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((c) obj);
                return ww8.a;
            }
        };
    }
}
