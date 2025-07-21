package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.colorspace.Rgb;
import defpackage.eg9;
import defpackage.hf3;
import defpackage.ss2;
import defpackage.st1;
import defpackage.tq8;
import defpackage.uo6;
import defpackage.wn0;
import defpackage.zq3;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class Rgb extends c {
    public static final a t = new a(null);
    private static final st1 u = new st1() { // from class: u17
        @Override // defpackage.st1
        public final double a(double d) {
            double t2;
            t2 = Rgb.t(d);
            return t2;
        }
    };
    private final eg9 e;
    private final float f;
    private final float g;
    private final tq8 h;
    private final float[] i;
    private final float[] j;
    private final float[] k;
    private final st1 l;
    private final ss2 m;
    private final st1 n;
    private final st1 o;
    private final ss2 p;
    private final st1 q;
    private final boolean r;
    private final boolean s;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float e(float[] fArr) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            return f7 < 0.0f ? -f7 : f7;
        }

        private final boolean f(double d, st1 st1Var, st1 st1Var2) {
            return Math.abs(st1Var.a(d) - st1Var2.a(d)) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] g(float[] fArr, eg9 eg9Var) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float a = eg9Var.a();
            float b = eg9Var.b();
            float f7 = 1;
            float f8 = (f7 - f) / f2;
            float f9 = (f7 - f3) / f4;
            float f10 = (f7 - f5) / f6;
            float f11 = (f7 - a) / b;
            float f12 = f / f2;
            float f13 = (f3 / f4) - f12;
            float f14 = (a / b) - f12;
            float f15 = f9 - f8;
            float f16 = (f5 / f6) - f12;
            float f17 = (((f11 - f8) * f13) - (f14 * f15)) / (((f10 - f8) * f13) - (f15 * f16));
            float f18 = (f14 - (f16 * f17)) / f13;
            float f19 = (1.0f - f18) - f17;
            float f20 = f19 / f2;
            float f21 = f18 / f4;
            float f22 = f17 / f6;
            return new float[]{f20 * f, f19, f20 * ((1.0f - f) - f2), f21 * f3, f18, f21 * ((1.0f - f3) - f4), f22 * f5, f17, f22 * ((1.0f - f5) - f6)};
        }

        private final boolean h(float[] fArr, float[] fArr2) {
            float f = fArr[0];
            float f2 = fArr2[0];
            float f3 = fArr[1];
            float f4 = fArr2[1];
            float f5 = fArr[2] - fArr2[2];
            float f6 = fArr[3] - fArr2[3];
            float f7 = fArr[4];
            float f8 = fArr2[4];
            float f9 = fArr[5];
            float f10 = fArr2[5];
            float[] fArr3 = {f - f2, f3 - f4, f5, f6, f7 - f8, f9 - f10};
            return i(fArr3[0], fArr3[1], f2 - f8, f4 - f10) >= 0.0f && i(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) >= 0.0f && i(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) >= 0.0f && i(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) >= 0.0f && i(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) >= 0.0f && i(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) >= 0.0f;
        }

        private final float i(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean j(float[] fArr, eg9 eg9Var, st1 st1Var, st1 st1Var2, float f, float f2, int i) {
            if (i == 0) {
                return true;
            }
            e eVar = e.a;
            if (!d.g(fArr, eVar.x()) || !d.f(eg9Var, hf3.a.e()) || f != 0.0f || f2 != 1.0f) {
                return false;
            }
            Rgb w = eVar.w();
            for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                if (!f(d, st1Var, w.J()) || !f(d, st1Var2, w.F())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k(float[] fArr, float f, float f2) {
            float e = e(fArr);
            e eVar = e.a;
            return (e / e(eVar.s()) > 0.9f && h(fArr, eVar.x())) || (f < 0.0f && f2 > 1.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] l(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length == 9) {
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = f + f2 + fArr[2];
                fArr2[0] = f / f3;
                fArr2[1] = f2 / f3;
                float f4 = fArr[3];
                float f5 = fArr[4];
                float f6 = f4 + f5 + fArr[5];
                fArr2[2] = f4 / f6;
                fArr2[3] = f5 / f6;
                float f7 = fArr[6];
                float f8 = fArr[7];
                float f9 = f7 + f8 + fArr[8];
                fArr2[4] = f7 / f9;
                fArr2[5] = f8 / f9;
            } else {
                kotlin.collections.d.m(fArr, fArr2, 0, 0, 6, 6, null);
            }
            return fArr2;
        }

        private a() {
        }
    }

    public Rgb(String str, float[] fArr, eg9 eg9Var, float[] fArr2, st1 st1Var, st1 st1Var2, float f, float f2, tq8 tq8Var, int i) {
        super(str, b.a.b(), i, null);
        this.e = eg9Var;
        this.f = f;
        this.g = f2;
        this.h = tq8Var;
        this.l = st1Var;
        this.m = new ss2() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            {
                super(1);
            }

            public final Double b(double d) {
                float f3;
                float f4;
                double a2 = Rgb.this.J().a(d);
                f3 = Rgb.this.f;
                f4 = Rgb.this.g;
                return Double.valueOf(uo6.k(a2, f3, f4));
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).doubleValue());
            }
        };
        this.n = new st1() { // from class: s17
            @Override // defpackage.st1
            public final double a(double d) {
                double O;
                O = Rgb.O(Rgb.this, d);
                return O;
            }
        };
        this.o = st1Var2;
        this.p = new ss2() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            {
                super(1);
            }

            public final Double b(double d) {
                float f3;
                float f4;
                st1 F = Rgb.this.F();
                f3 = Rgb.this.f;
                f4 = Rgb.this.g;
                return Double.valueOf(F.a(uo6.k(d, f3, f4)));
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).doubleValue());
            }
        };
        this.q = new st1() { // from class: t17
            @Override // defpackage.st1
            public final double a(double d) {
                double C;
                C = Rgb.C(Rgb.this, d);
                return C;
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f >= f2) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        a aVar = t;
        float[] l = aVar.l(fArr);
        this.i = l;
        if (fArr2 == null) {
            this.j = aVar.g(l, eg9Var);
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.j = fArr2;
        }
        this.k = d.j(this.j);
        this.r = aVar.k(l, f, f2);
        this.s = aVar.j(l, eg9Var, st1Var, st1Var2, f, f2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double C(Rgb rgb, double d) {
        return rgb.o.a(uo6.k(d, rgb.f, rgb.g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double O(Rgb rgb, double d) {
        return uo6.k(rgb.l.a(d), rgb.f, rgb.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double t(double d) {
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double u(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, 1.0d / d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double v(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double w(tq8 tq8Var, double d) {
        return d.q(d, tq8Var.a(), tq8Var.b(), tq8Var.c(), tq8Var.d(), tq8Var.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double x(tq8 tq8Var, double d) {
        return d.r(d, tq8Var.a(), tq8Var.b(), tq8Var.c(), tq8Var.d(), tq8Var.e(), tq8Var.f(), tq8Var.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double y(tq8 tq8Var, double d) {
        return d.s(d, tq8Var.a(), tq8Var.b(), tq8Var.c(), tq8Var.d(), tq8Var.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double z(tq8 tq8Var, double d) {
        return d.t(d, tq8Var.a(), tq8Var.b(), tq8Var.c(), tq8Var.d(), tq8Var.e(), tq8Var.f(), tq8Var.g());
    }

    public final ss2 D() {
        return this.p;
    }

    public final st1 E() {
        return this.q;
    }

    public final st1 F() {
        return this.o;
    }

    public final float[] G() {
        return this.k;
    }

    public final ss2 H() {
        return this.m;
    }

    public final st1 I() {
        return this.n;
    }

    public final st1 J() {
        return this.l;
    }

    public final float[] K() {
        return this.i;
    }

    public final tq8 L() {
        return this.h;
    }

    public final float[] M() {
        return this.j;
    }

    public final eg9 N() {
        return this.e;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float c(int i) {
        return this.g;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float d(int i) {
        return this.f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Rgb.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        Rgb rgb = (Rgb) obj;
        if (Float.compare(rgb.f, this.f) != 0 || Float.compare(rgb.g, this.g) != 0 || !zq3.c(this.e, rgb.e) || !Arrays.equals(this.i, rgb.i)) {
            return false;
        }
        tq8 tq8Var = this.h;
        if (tq8Var != null) {
            return zq3.c(tq8Var, rgb.h);
        }
        if (rgb.h == null) {
            return true;
        }
        if (zq3.c(this.l, rgb.l)) {
            return zq3.c(this.o, rgb.o);
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public boolean g() {
        return this.s;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public long h(float f, float f2, float f3) {
        float a2 = (float) this.q.a(f);
        float a3 = (float) this.q.a(f2);
        float a4 = (float) this.q.a(f3);
        float n = d.n(this.j, a2, a3, a4);
        float o = d.o(this.j, a2, a3, a4);
        return (Float.floatToRawIntBits(n) << 32) | (4294967295L & Float.floatToRawIntBits(o));
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public int hashCode() {
        int hashCode = ((((super.hashCode() * 31) + this.e.hashCode()) * 31) + Arrays.hashCode(this.i)) * 31;
        float f = this.f;
        int floatToIntBits = (hashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.g;
        int floatToIntBits2 = (floatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        tq8 tq8Var = this.h;
        int hashCode2 = floatToIntBits2 + (tq8Var != null ? tq8Var.hashCode() : 0);
        return this.h == null ? (((hashCode2 * 31) + this.l.hashCode()) * 31) + this.o.hashCode() : hashCode2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float i(float f, float f2, float f3) {
        return d.p(this.j, (float) this.q.a(f), (float) this.q.a(f2), (float) this.q.a(f3));
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public long j(float f, float f2, float f3, float f4, c cVar) {
        return wn0.a((float) this.n.a(d.n(this.k, f, f2, f3)), (float) this.n.a(d.o(this.k, f, f2, f3)), (float) this.n.a(d.p(this.k, f, f2, f3)), f4, cVar);
    }

    public Rgb(String str, float[] fArr, eg9 eg9Var, final tq8 tq8Var, int i) {
        this(str, fArr, eg9Var, null, (tq8Var.e() == 0.0d && tq8Var.f() == 0.0d) ? new st1() { // from class: x17
            @Override // defpackage.st1
            public final double a(double d) {
                double w;
                w = Rgb.w(tq8.this, d);
                return w;
            }
        } : new st1() { // from class: y17
            @Override // defpackage.st1
            public final double a(double d) {
                double x;
                x = Rgb.x(tq8.this, d);
                return x;
            }
        }, (tq8Var.e() == 0.0d && tq8Var.f() == 0.0d) ? new st1() { // from class: z17
            @Override // defpackage.st1
            public final double a(double d) {
                double y;
                y = Rgb.y(tq8.this, d);
                return y;
            }
        } : new st1() { // from class: a27
            @Override // defpackage.st1
            public final double a(double d) {
                double z;
                z = Rgb.z(tq8.this, d);
                return z;
            }
        }, 0.0f, 1.0f, tq8Var, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Rgb(java.lang.String r21, float[] r22, defpackage.eg9 r23, final double r24, float r26, float r27, int r28) {
        /*
            r20 = this;
            r1 = r24
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto Ld
            st1 r3 = androidx.compose.ui.graphics.colorspace.Rgb.u
        La:
            r17 = r3
            goto L13
        Ld:
            v17 r3 = new v17
            r3.<init>()
            goto La
        L13:
            if (r0 != 0) goto L1a
            st1 r0 = androidx.compose.ui.graphics.colorspace.Rgb.u
        L17:
            r18 = r0
            goto L20
        L1a:
            w17 r0 = new w17
            r0.<init>()
            goto L17
        L20:
            tq8 r19 = new tq8
            r0 = r19
            r15 = 96
            r16 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r1 = r24
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r16)
            r8 = 0
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r9 = r17
            r10 = r18
            r11 = r26
            r12 = r27
            r13 = r19
            r14 = r28
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], eg9, double, float, float, int):void");
    }

    public Rgb(Rgb rgb, float[] fArr, eg9 eg9Var) {
        this(rgb.f(), rgb.i, eg9Var, fArr, rgb.l, rgb.o, rgb.f, rgb.g, rgb.h, -1);
    }
}
