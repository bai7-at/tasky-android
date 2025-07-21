package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class up5 {
    private final boolean a;
    private final boolean b;

    public static final class a extends up5 {
        private final float c;
        private final float d;
        private final float e;
        private final boolean f;
        private final boolean g;
        private final float h;
        private final float i;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(float r4, float r5, float r6, boolean r7, boolean r8, float r9, float r10) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.c = r4
                r3.d = r5
                r3.e = r6
                r3.f = r7
                r3.g = r8
                r3.h = r9
                r3.i = r10
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: up5.a.<init>(float, float, float, boolean, boolean, float, float):void");
        }

        public final float c() {
            return this.h;
        }

        public final float d() {
            return this.i;
        }

        public final float e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.c, aVar.c) == 0 && Float.compare(this.d, aVar.d) == 0 && Float.compare(this.e, aVar.e) == 0 && this.f == aVar.f && this.g == aVar.g && Float.compare(this.h, aVar.h) == 0 && Float.compare(this.i, aVar.i) == 0;
        }

        public final float f() {
            return this.e;
        }

        public final float g() {
            return this.d;
        }

        public final boolean h() {
            return this.f;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.c) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.e)) * 31) + Boolean.hashCode(this.f)) * 31) + Boolean.hashCode(this.g)) * 31) + Float.hashCode(this.h)) * 31) + Float.hashCode(this.i);
        }

        public final boolean i() {
            return this.g;
        }

        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.c + ", verticalEllipseRadius=" + this.d + ", theta=" + this.e + ", isMoreThanHalf=" + this.f + ", isPositiveArc=" + this.g + ", arcStartX=" + this.h + ", arcStartY=" + this.i + ')';
        }
    }

    public static final class b extends up5 {
        public static final b c = new b();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private b() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: up5.b.<init>():void");
        }
    }

    public static final class c extends up5 {
        private final float c;
        private final float d;
        private final float e;
        private final float f;
        private final float g;
        private final float h;

        public c(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, null);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
            this.g = f5;
            this.h = f6;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.e;
        }

        public final float e() {
            return this.g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Float.compare(this.c, cVar.c) == 0 && Float.compare(this.d, cVar.d) == 0 && Float.compare(this.e, cVar.e) == 0 && Float.compare(this.f, cVar.f) == 0 && Float.compare(this.g, cVar.g) == 0 && Float.compare(this.h, cVar.h) == 0;
        }

        public final float f() {
            return this.d;
        }

        public final float g() {
            return this.f;
        }

        public final float h() {
            return this.h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.c) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.e)) * 31) + Float.hashCode(this.f)) * 31) + Float.hashCode(this.g)) * 31) + Float.hashCode(this.h);
        }

        public String toString() {
            return "CurveTo(x1=" + this.c + ", y1=" + this.d + ", x2=" + this.e + ", y2=" + this.f + ", x3=" + this.g + ", y3=" + this.h + ')';
        }
    }

    public static final class d extends up5 {
        private final float c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public d(float r4) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.c = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: up5.d.<init>(float):void");
        }

        public final float c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Float.compare(this.c, ((d) obj).c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.c);
        }

        public String toString() {
            return "HorizontalTo(x=" + this.c + ')';
        }
    }

    public static final class e extends up5 {
        private final float c;
        private final float d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public e(float r4, float r5) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.c = r4
                r3.d = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: up5.e.<init>(float, float):void");
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Float.compare(this.c, eVar.c) == 0 && Float.compare(this.d, eVar.d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.c) * 31) + Float.hashCode(this.d);
        }

        public String toString() {
            return "LineTo(x=" + this.c + ", y=" + this.d + ')';
        }
    }

    public static final class f extends up5 {
        private final float c;
        private final float d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public f(float r4, float r5) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.c = r4
                r3.d = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: up5.f.<init>(float, float):void");
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Float.compare(this.c, fVar.c) == 0 && Float.compare(this.d, fVar.d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.c) * 31) + Float.hashCode(this.d);
        }

        public String toString() {
            return "MoveTo(x=" + this.c + ", y=" + this.d + ')';
        }
    }

    public static final class g extends up5 {
        private final float c;
        private final float d;
        private final float e;
        private final float f;

        public g(float f, float f2, float f3, float f4) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.e;
        }

        public final float e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Float.compare(this.c, gVar.c) == 0 && Float.compare(this.d, gVar.d) == 0 && Float.compare(this.e, gVar.e) == 0 && Float.compare(this.f, gVar.f) == 0;
        }

        public final float f() {
            return this.f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.c) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.e)) * 31) + Float.hashCode(this.f);
        }

        public String toString() {
            return "QuadTo(x1=" + this.c + ", y1=" + this.d + ", x2=" + this.e + ", y2=" + this.f + ')';
        }
    }

    public static final class h extends up5 {
        private final float c;
        private final float d;
        private final float e;
        private final float f;

        public h(float f, float f2, float f3, float f4) {
            super(true, false, 2, null);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.e;
        }

        public final float e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Float.compare(this.c, hVar.c) == 0 && Float.compare(this.d, hVar.d) == 0 && Float.compare(this.e, hVar.e) == 0 && Float.compare(this.f, hVar.f) == 0;
        }

        public final float f() {
            return this.f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.c) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.e)) * 31) + Float.hashCode(this.f);
        }

        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.c + ", y1=" + this.d + ", x2=" + this.e + ", y2=" + this.f + ')';
        }
    }

    public static final class i extends up5 {
        private final float c;
        private final float d;

        public i(float f, float f2) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.c = f;
            this.d = f2;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Float.compare(this.c, iVar.c) == 0 && Float.compare(this.d, iVar.d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.c) * 31) + Float.hashCode(this.d);
        }

        public String toString() {
            return "ReflectiveQuadTo(x=" + this.c + ", y=" + this.d + ')';
        }
    }

    public static final class j extends up5 {
        private final float c;
        private final float d;
        private final float e;
        private final boolean f;
        private final boolean g;
        private final float h;
        private final float i;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public j(float r4, float r5, float r6, boolean r7, boolean r8, float r9, float r10) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.c = r4
                r3.d = r5
                r3.e = r6
                r3.f = r7
                r3.g = r8
                r3.h = r9
                r3.i = r10
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: up5.j.<init>(float, float, float, boolean, boolean, float, float):void");
        }

        public final float c() {
            return this.h;
        }

        public final float d() {
            return this.i;
        }

        public final float e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Float.compare(this.c, jVar.c) == 0 && Float.compare(this.d, jVar.d) == 0 && Float.compare(this.e, jVar.e) == 0 && this.f == jVar.f && this.g == jVar.g && Float.compare(this.h, jVar.h) == 0 && Float.compare(this.i, jVar.i) == 0;
        }

        public final float f() {
            return this.e;
        }

        public final float g() {
            return this.d;
        }

        public final boolean h() {
            return this.f;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.c) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.e)) * 31) + Boolean.hashCode(this.f)) * 31) + Boolean.hashCode(this.g)) * 31) + Float.hashCode(this.h)) * 31) + Float.hashCode(this.i);
        }

        public final boolean i() {
            return this.g;
        }

        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.c + ", verticalEllipseRadius=" + this.d + ", theta=" + this.e + ", isMoreThanHalf=" + this.f + ", isPositiveArc=" + this.g + ", arcStartDx=" + this.h + ", arcStartDy=" + this.i + ')';
        }
    }

    public static final class k extends up5 {
        private final float c;
        private final float d;
        private final float e;
        private final float f;
        private final float g;
        private final float h;

        public k(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, null);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
            this.g = f5;
            this.h = f6;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.e;
        }

        public final float e() {
            return this.g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return Float.compare(this.c, kVar.c) == 0 && Float.compare(this.d, kVar.d) == 0 && Float.compare(this.e, kVar.e) == 0 && Float.compare(this.f, kVar.f) == 0 && Float.compare(this.g, kVar.g) == 0 && Float.compare(this.h, kVar.h) == 0;
        }

        public final float f() {
            return this.d;
        }

        public final float g() {
            return this.f;
        }

        public final float h() {
            return this.h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.c) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.e)) * 31) + Float.hashCode(this.f)) * 31) + Float.hashCode(this.g)) * 31) + Float.hashCode(this.h);
        }

        public String toString() {
            return "RelativeCurveTo(dx1=" + this.c + ", dy1=" + this.d + ", dx2=" + this.e + ", dy2=" + this.f + ", dx3=" + this.g + ", dy3=" + this.h + ')';
        }
    }

    public static final class l extends up5 {
        private final float c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public l(float r4) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.c = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: up5.l.<init>(float):void");
        }

        public final float c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Float.compare(this.c, ((l) obj).c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.c);
        }

        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.c + ')';
        }
    }

    public static final class m extends up5 {
        private final float c;
        private final float d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public m(float r4, float r5) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.c = r4
                r3.d = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: up5.m.<init>(float, float):void");
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return Float.compare(this.c, mVar.c) == 0 && Float.compare(this.d, mVar.d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.c) * 31) + Float.hashCode(this.d);
        }

        public String toString() {
            return "RelativeLineTo(dx=" + this.c + ", dy=" + this.d + ')';
        }
    }

    public static final class n extends up5 {
        private final float c;
        private final float d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public n(float r4, float r5) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.c = r4
                r3.d = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: up5.n.<init>(float, float):void");
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Float.compare(this.c, nVar.c) == 0 && Float.compare(this.d, nVar.d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.c) * 31) + Float.hashCode(this.d);
        }

        public String toString() {
            return "RelativeMoveTo(dx=" + this.c + ", dy=" + this.d + ')';
        }
    }

    public static final class o extends up5 {
        private final float c;
        private final float d;
        private final float e;
        private final float f;

        public o(float f, float f2, float f3, float f4) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.e;
        }

        public final float e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return Float.compare(this.c, oVar.c) == 0 && Float.compare(this.d, oVar.d) == 0 && Float.compare(this.e, oVar.e) == 0 && Float.compare(this.f, oVar.f) == 0;
        }

        public final float f() {
            return this.f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.c) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.e)) * 31) + Float.hashCode(this.f);
        }

        public String toString() {
            return "RelativeQuadTo(dx1=" + this.c + ", dy1=" + this.d + ", dx2=" + this.e + ", dy2=" + this.f + ')';
        }
    }

    public static final class p extends up5 {
        private final float c;
        private final float d;
        private final float e;
        private final float f;

        public p(float f, float f2, float f3, float f4) {
            super(true, false, 2, null);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.e;
        }

        public final float e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return Float.compare(this.c, pVar.c) == 0 && Float.compare(this.d, pVar.d) == 0 && Float.compare(this.e, pVar.e) == 0 && Float.compare(this.f, pVar.f) == 0;
        }

        public final float f() {
            return this.f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.c) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.e)) * 31) + Float.hashCode(this.f);
        }

        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.c + ", dy1=" + this.d + ", dx2=" + this.e + ", dy2=" + this.f + ')';
        }
    }

    public static final class q extends up5 {
        private final float c;
        private final float d;

        public q(float f, float f2) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.c = f;
            this.d = f2;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return Float.compare(this.c, qVar.c) == 0 && Float.compare(this.d, qVar.d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.c) * 31) + Float.hashCode(this.d);
        }

        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.c + ", dy=" + this.d + ')';
        }
    }

    public static final class r extends up5 {
        private final float c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public r(float r4) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.c = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: up5.r.<init>(float):void");
        }

        public final float c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && Float.compare(this.c, ((r) obj).c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.c);
        }

        public String toString() {
            return "RelativeVerticalTo(dy=" + this.c + ')';
        }
    }

    public static final class s extends up5 {
        private final float c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public s(float r4) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.c = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: up5.s.<init>(float):void");
        }

        public final float c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && Float.compare(this.c, ((s) obj).c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.c);
        }

        public String toString() {
            return "VerticalTo(y=" + this.c + ')';
        }
    }

    public /* synthetic */ up5(boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2);
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    private up5(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public /* synthetic */ up5(boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, null);
    }
}
