package androidx.compose.ui.graphics;

import defpackage.nn0;
import defpackage.no7;
import defpackage.ov4;
import defpackage.yw6;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class GraphicsLayerElement extends ov4 {
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;
    private final float j;
    private final float k;
    private final long l;
    private final no7 m;
    private final boolean n;
    private final long o;
    private final long p;
    private final int q;

    public /* synthetic */ GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, no7 no7Var, boolean z, yw6 yw6Var, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, no7Var, z, yw6Var, j2, j3, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.b, graphicsLayerElement.b) == 0 && Float.compare(this.c, graphicsLayerElement.c) == 0 && Float.compare(this.d, graphicsLayerElement.d) == 0 && Float.compare(this.e, graphicsLayerElement.e) == 0 && Float.compare(this.f, graphicsLayerElement.f) == 0 && Float.compare(this.g, graphicsLayerElement.g) == 0 && Float.compare(this.h, graphicsLayerElement.h) == 0 && Float.compare(this.i, graphicsLayerElement.i) == 0 && Float.compare(this.j, graphicsLayerElement.j) == 0 && Float.compare(this.k, graphicsLayerElement.k) == 0 && e.e(this.l, graphicsLayerElement.l) && zq3.c(this.m, graphicsLayerElement.m) && this.n == graphicsLayerElement.n && zq3.c(null, null) && nn0.t(this.o, graphicsLayerElement.o) && nn0.t(this.p, graphicsLayerElement.p) && a.e(this.q, graphicsLayerElement.q);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return (((((((((((((((((((((((((((((Float.hashCode(this.b) * 31) + Float.hashCode(this.c)) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.e)) * 31) + Float.hashCode(this.f)) * 31) + Float.hashCode(this.g)) * 31) + Float.hashCode(this.h)) * 31) + Float.hashCode(this.i)) * 31) + Float.hashCode(this.j)) * 31) + Float.hashCode(this.k)) * 31) + e.h(this.l)) * 31) + this.m.hashCode()) * 31) + Boolean.hashCode(this.n)) * 961) + nn0.z(this.o)) * 31) + nn0.z(this.p)) * 31) + a.f(this.q);
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public SimpleGraphicsLayerModifier l() {
        return new SimpleGraphicsLayerModifier(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, null, this.o, this.p, this.q, null);
    }

    public String toString() {
        return "GraphicsLayerElement(scaleX=" + this.b + ", scaleY=" + this.c + ", alpha=" + this.d + ", translationX=" + this.e + ", translationY=" + this.f + ", shadowElevation=" + this.g + ", rotationX=" + this.h + ", rotationY=" + this.i + ", rotationZ=" + this.j + ", cameraDistance=" + this.k + ", transformOrigin=" + ((Object) e.i(this.l)) + ", shape=" + this.m + ", clip=" + this.n + ", renderEffect=" + ((Object) null) + ", ambientShadowColor=" + ((Object) nn0.A(this.o)) + ", spotShadowColor=" + ((Object) nn0.A(this.p)) + ", compositingStrategy=" + ((Object) a.g(this.q)) + ')';
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
        simpleGraphicsLayerModifier.n(this.b);
        simpleGraphicsLayerModifier.t(this.c);
        simpleGraphicsLayerModifier.c(this.d);
        simpleGraphicsLayerModifier.x(this.e);
        simpleGraphicsLayerModifier.g(this.f);
        simpleGraphicsLayerModifier.G0(this.g);
        simpleGraphicsLayerModifier.q(this.h);
        simpleGraphicsLayerModifier.r(this.i);
        simpleGraphicsLayerModifier.s(this.j);
        simpleGraphicsLayerModifier.p(this.k);
        simpleGraphicsLayerModifier.m0(this.l);
        simpleGraphicsLayerModifier.e1(this.m);
        simpleGraphicsLayerModifier.i0(this.n);
        simpleGraphicsLayerModifier.h(null);
        simpleGraphicsLayerModifier.b0(this.o);
        simpleGraphicsLayerModifier.n0(this.p);
        simpleGraphicsLayerModifier.j(this.q);
        simpleGraphicsLayerModifier.n2();
    }

    private GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, no7 no7Var, boolean z, yw6 yw6Var, long j2, long j3, int i) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = f8;
        this.j = f9;
        this.k = f10;
        this.l = j;
        this.m = no7Var;
        this.n = z;
        this.o = j2;
        this.p = j3;
        this.q = i;
    }
}
