package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.colorspace.b;
import androidx.compose.ui.graphics.colorspace.f;
import defpackage.eg9;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class d {
    public static final double a(double d, double d2, double d3, double d4, double d5, double d6) {
        return Math.copySign(q(d < 0.0d ? -d : d, d2, d3, d4, d5, d6), d);
    }

    public static final double b(double d, double d2, double d3, double d4, double d5, double d6) {
        return Math.copySign(s(d < 0.0d ? -d : d, d2, d3, d4, d5, d6), d);
    }

    public static final c c(c cVar, eg9 eg9Var, a aVar) {
        if (!b.e(cVar.e(), b.a.b())) {
            return cVar;
        }
        zq3.f(cVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        Rgb rgb = (Rgb) cVar;
        if (f(rgb.N(), eg9Var)) {
            return cVar;
        }
        return new Rgb(rgb, k(e(aVar.b(), rgb.N().c(), eg9Var.c()), rgb.M()), eg9Var);
    }

    public static /* synthetic */ c d(c cVar, eg9 eg9Var, a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            aVar = a.b.a();
        }
        return c(cVar, eg9Var, aVar);
    }

    public static final float[] e(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] m = m(fArr, fArr2);
        float[] m2 = m(fArr, fArr3);
        return k(j(fArr), l(new float[]{m2[0] / m[0], m2[1] / m[1], m2[2] / m[2]}, fArr));
    }

    public static final boolean f(eg9 eg9Var, eg9 eg9Var2) {
        if (eg9Var == eg9Var2) {
            return true;
        }
        return Math.abs(eg9Var.a() - eg9Var2.a()) < 0.001f && Math.abs(eg9Var.b() - eg9Var2.b()) < 0.001f;
    }

    public static final boolean g(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (Float.compare(fArr[i], fArr2[i]) != 0 && Math.abs(fArr[i] - fArr2[i]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    public static final f h(c cVar, c cVar2, int i) {
        e eVar = e.a;
        if (cVar == eVar.w()) {
            if (cVar2 == eVar.w()) {
                return f.g.d();
            }
            if (cVar2 == eVar.t() && i.e(i, i.a.b())) {
                return f.g.e();
            }
        } else if (cVar == eVar.t() && cVar2 == eVar.w() && i.e(i, i.a.b())) {
            return f.g.c();
        }
        if (cVar == cVar2) {
            return f.g.f(cVar);
        }
        long e = cVar.e();
        b.a aVar = b.a;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (!b.e(e, aVar.b()) || !b.e(cVar2.e(), aVar.b())) {
            return new f(cVar, cVar2, i, defaultConstructorMarker);
        }
        zq3.f(cVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        zq3.f(cVar2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        return new f.b((Rgb) cVar, (Rgb) cVar2, i, defaultConstructorMarker);
    }

    public static /* synthetic */ f i(c cVar, c cVar2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cVar2 = e.a.w();
        }
        if ((i2 & 2) != 0) {
            i = i.a.b();
        }
        return h(cVar, cVar2, i);
    }

    public static final float[] j(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f * f10) + (f2 * f11) + (f3 * f12);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    public static final float[] k(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6);
        float f8 = fArr[1];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = (f8 * f2) + (f9 * f4) + (f10 * f6);
        float f12 = fArr[2];
        float f13 = fArr[5];
        float f14 = fArr[8];
        float f15 = (f2 * f12) + (f4 * f13) + (f6 * f14);
        float f16 = fArr2[3];
        float f17 = fArr2[4];
        float f18 = fArr2[5];
        float f19 = (f * f16) + (f3 * f17) + (f5 * f18);
        float f20 = (f8 * f16) + (f9 * f17) + (f10 * f18);
        float f21 = (f16 * f12) + (f17 * f13) + (f18 * f14);
        float f22 = fArr2[6];
        float f23 = fArr2[7];
        float f24 = (f * f22) + (f3 * f23);
        float f25 = fArr2[8];
        return new float[]{f7, f11, f15, f19, f20, f21, f24 + (f5 * f25), (f8 * f22) + (f9 * f23) + (f10 * f25), (f12 * f22) + (f13 * f23) + (f14 * f25)};
    }

    public static final float[] l(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr2[0] * f;
        float f3 = fArr[1];
        float f4 = fArr2[1] * f3;
        float f5 = fArr[2];
        return new float[]{f2, f4, fArr2[2] * f5, fArr2[3] * f, fArr2[4] * f3, fArr2[5] * f5, f * fArr2[6], f3 * fArr2[7], f5 * fArr2[8]};
    }

    public static final float[] m(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
        fArr2[1] = (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
        fArr2[2] = (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
        return fArr2;
    }

    public static final float n(float[] fArr, float f, float f2, float f3) {
        return (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
    }

    public static final float o(float[] fArr, float f, float f2, float f3) {
        return (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
    }

    public static final float p(float[] fArr, float f, float f2, float f3) {
        return (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
    }

    public static final double q(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 * d4 ? (Math.pow(d, 1.0d / d6) - d3) / d2 : d / d4;
    }

    public static final double r(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return d >= d5 * d4 ? (Math.pow(d - d6, 1.0d / d8) - d3) / d2 : (d - d7) / d4;
    }

    public static final double s(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d6) : d * d4;
    }

    public static final double t(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d8) + d6 : (d4 * d) + d7;
    }
}
