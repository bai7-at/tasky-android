package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import defpackage.p50;
import java.util.List;

/* loaded from: classes.dex */
public class lz5 implements lp5, p50.b, iw3 {
    private final String e;
    private final LottieDrawable f;
    private final PolystarShape.Type g;
    private final boolean h;
    private final boolean i;
    private final p50 j;
    private final p50 k;
    private final p50 l;
    private final p50 m;
    private final p50 n;
    private final p50 o;
    private final p50 p;
    private boolean r;
    private final Path a = new Path();
    private final Path b = new Path();
    private final PathMeasure c = new PathMeasure();
    private final float[] d = new float[2];
    private final kt0 q = new kt0();

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PolystarShape.Type.values().length];
            a = iArr;
            try {
                iArr[PolystarShape.Type.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[PolystarShape.Type.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public lz5(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, PolystarShape polystarShape) {
        this.f = lottieDrawable;
        this.e = polystarShape.d();
        PolystarShape.Type j = polystarShape.j();
        this.g = j;
        this.h = polystarShape.k();
        this.i = polystarShape.l();
        p50 a2 = polystarShape.g().a();
        this.j = a2;
        p50 a3 = polystarShape.h().a();
        this.k = a3;
        p50 a4 = polystarShape.i().a();
        this.l = a4;
        p50 a5 = polystarShape.e().a();
        this.n = a5;
        p50 a6 = polystarShape.f().a();
        this.p = a6;
        PolystarShape.Type type2 = PolystarShape.Type.STAR;
        if (j == type2) {
            this.m = polystarShape.b().a();
            this.o = polystarShape.c().a();
        } else {
            this.m = null;
            this.o = null;
        }
        aVar.i(a2);
        aVar.i(a3);
        aVar.i(a4);
        aVar.i(a5);
        aVar.i(a6);
        if (j == type2) {
            aVar.i(this.m);
            aVar.i(this.o);
        }
        a2.a(this);
        a3.a(this);
        a4.a(this);
        a5.a(this);
        a6.a(this);
        if (j == type2) {
            this.m.a(this);
            this.o.a(this);
        }
    }

    private void e() {
        double d;
        float f;
        lz5 lz5Var;
        lz5 lz5Var2 = this;
        int floor = (int) Math.floor(((Float) lz5Var2.j.h()).floatValue());
        double radians = Math.toRadians((lz5Var2.l == null ? 0.0d : ((Float) r2.h()).floatValue()) - 90.0d);
        double d2 = floor;
        float floatValue = ((Float) lz5Var2.p.h()).floatValue() / 100.0f;
        float floatValue2 = ((Float) lz5Var2.n.h()).floatValue();
        double d3 = floatValue2;
        float cos = (float) (Math.cos(radians) * d3);
        float sin = (float) (Math.sin(radians) * d3);
        lz5Var2.a.moveTo(cos, sin);
        double d4 = (float) (6.283185307179586d / d2);
        double ceil = Math.ceil(d2);
        double d5 = radians + d4;
        int i = 0;
        while (true) {
            double d6 = i;
            if (d6 >= ceil) {
                lz5 lz5Var3 = lz5Var2;
                PointF pointF = (PointF) lz5Var3.k.h();
                lz5Var3.a.offset(pointF.x, pointF.y);
                lz5Var3.a.close();
                return;
            }
            int i2 = i;
            float cos2 = (float) (d3 * Math.cos(d5));
            double d7 = d4;
            float sin2 = (float) (d3 * Math.sin(d5));
            if (floatValue != 0.0f) {
                d = d3;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                float sin3 = (float) Math.sin(atan2);
                f = sin2;
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float f2 = floatValue2 * floatValue * 0.25f;
                float f3 = cos3 * f2;
                float f4 = sin3 * f2;
                float cos4 = ((float) Math.cos(atan22)) * f2;
                float sin4 = f2 * ((float) Math.sin(atan22));
                if (d6 == ceil - 1.0d) {
                    lz5Var = this;
                    lz5Var.b.reset();
                    lz5Var.b.moveTo(cos, sin);
                    float f5 = cos - f3;
                    float f6 = sin - f4;
                    float f7 = cos2 + cos4;
                    float f8 = sin4 + f;
                    lz5Var.b.cubicTo(f5, f6, f7, f8, cos2, f);
                    lz5Var.c.setPath(lz5Var.b, false);
                    PathMeasure pathMeasure = lz5Var.c;
                    pathMeasure.getPosTan(pathMeasure.getLength() * 0.9999f, lz5Var.d, null);
                    Path path = lz5Var.a;
                    float[] fArr = lz5Var.d;
                    path.cubicTo(f5, f6, f7, f8, fArr[0], fArr[1]);
                } else {
                    lz5Var = this;
                    lz5Var.a.cubicTo(cos - f3, sin - f4, cos2 + cos4, f + sin4, cos2, f);
                }
            } else {
                d = d3;
                f = sin2;
                lz5Var = lz5Var2;
                if (d6 == ceil - 1.0d) {
                    sin = f;
                    cos = cos2;
                    d4 = d7;
                    i = i2 + 1;
                    lz5Var2 = lz5Var;
                    d3 = d;
                } else {
                    lz5Var.a.lineTo(cos2, f);
                }
            }
            d5 += d7;
            sin = f;
            cos = cos2;
            d4 = d7;
            i = i2 + 1;
            lz5Var2 = lz5Var;
            d3 = d;
        }
    }

    private void i() {
        int i;
        float f;
        float f2;
        double d;
        float f3;
        float f4;
        float f5;
        float f6;
        double d2;
        float f7;
        float f8;
        float f9;
        double d3;
        float floatValue = ((Float) this.j.h()).floatValue();
        double radians = Math.toRadians((this.l == null ? 0.0d : ((Float) r2.h()).floatValue()) - 90.0d);
        double d4 = floatValue;
        float f10 = (float) (6.283185307179586d / d4);
        if (this.i) {
            f10 *= -1.0f;
        }
        float f11 = f10 / 2.0f;
        float f12 = floatValue - ((int) floatValue);
        int i2 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            radians += (1.0f - f12) * f11;
        }
        float floatValue2 = ((Float) this.n.h()).floatValue();
        float floatValue3 = ((Float) this.m.h()).floatValue();
        p50 p50Var = this.o;
        float floatValue4 = p50Var != null ? ((Float) p50Var.h()).floatValue() / 100.0f : 0.0f;
        p50 p50Var2 = this.p;
        float floatValue5 = p50Var2 != null ? ((Float) p50Var2.h()).floatValue() / 100.0f : 0.0f;
        if (i2 != 0) {
            f4 = ((floatValue2 - floatValue3) * f12) + floatValue3;
            i = i2;
            double d5 = f4;
            float cos = (float) (d5 * Math.cos(radians));
            f3 = (float) (d5 * Math.sin(radians));
            this.a.moveTo(cos, f3);
            d = radians + ((f10 * f12) / 2.0f);
            f = cos;
            f2 = f11;
        } else {
            i = i2;
            double d6 = floatValue2;
            float cos2 = (float) (Math.cos(radians) * d6);
            float sin = (float) (d6 * Math.sin(radians));
            this.a.moveTo(cos2, sin);
            f = cos2;
            f2 = f11;
            d = radians + f2;
            f3 = sin;
            f4 = 0.0f;
        }
        double ceil = Math.ceil(d4) * 2.0d;
        int i3 = 0;
        float f13 = f2;
        float f14 = f;
        boolean z = false;
        while (true) {
            double d7 = i3;
            if (d7 >= ceil) {
                PointF pointF = (PointF) this.k.h();
                this.a.offset(pointF.x, pointF.y);
                this.a.close();
                return;
            }
            float f15 = z ? floatValue2 : floatValue3;
            if (f4 == 0.0f || d7 != ceil - 2.0d) {
                f5 = f10;
                f6 = f13;
            } else {
                f5 = f10;
                f6 = (f10 * f12) / 2.0f;
            }
            if (f4 == 0.0f || d7 != ceil - 1.0d) {
                d2 = d7;
                f7 = f4;
                f4 = f15;
            } else {
                d2 = d7;
                f7 = f4;
            }
            double d8 = f4;
            double d9 = ceil;
            float cos3 = (float) (d8 * Math.cos(d));
            float sin2 = (float) (d8 * Math.sin(d));
            if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                this.a.lineTo(cos3, sin2);
                d3 = d;
                f8 = floatValue4;
                f9 = floatValue5;
            } else {
                f8 = floatValue4;
                double atan2 = (float) (Math.atan2(f3, f14) - 1.5707963267948966d);
                float cos4 = (float) Math.cos(atan2);
                float sin3 = (float) Math.sin(atan2);
                f9 = floatValue5;
                d3 = d;
                double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                float cos5 = (float) Math.cos(atan22);
                float sin4 = (float) Math.sin(atan22);
                float f16 = z ? f8 : f9;
                float f17 = z ? f9 : f8;
                float f18 = (z ? floatValue3 : floatValue2) * f16 * 0.47829f;
                float f19 = cos4 * f18;
                float f20 = f18 * sin3;
                float f21 = (z ? floatValue2 : floatValue3) * f17 * 0.47829f;
                float f22 = cos5 * f21;
                float f23 = f21 * sin4;
                if (i != 0) {
                    if (i3 == 0) {
                        f19 *= f12;
                        f20 *= f12;
                    } else if (d2 == d9 - 1.0d) {
                        f22 *= f12;
                        f23 *= f12;
                    }
                }
                this.a.cubicTo(f14 - f19, f3 - f20, cos3 + f22, sin2 + f23, cos3, sin2);
            }
            d = d3 + f6;
            z = !z;
            i3++;
            f14 = cos3;
            f3 = sin2;
            floatValue5 = f9;
            floatValue4 = f8;
            f4 = f7;
            f10 = f5;
            ceil = d9;
        }
    }

    private void j() {
        this.r = false;
        this.f.invalidateSelf();
    }

    @Override // p50.b
    public void a() {
        j();
    }

    @Override // defpackage.tv0
    public void b(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            tv0 tv0Var = (tv0) list.get(i);
            if (tv0Var instanceof bt8) {
                bt8 bt8Var = (bt8) tv0Var;
                if (bt8Var.j() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.q.a(bt8Var);
                    bt8Var.e(this);
                }
            }
        }
    }

    @Override // defpackage.hw3
    public void f(Object obj, cd4 cd4Var) {
        p50 p50Var;
        p50 p50Var2;
        if (obj == wc4.w) {
            this.j.o(cd4Var);
            return;
        }
        if (obj == wc4.x) {
            this.l.o(cd4Var);
            return;
        }
        if (obj == wc4.n) {
            this.k.o(cd4Var);
            return;
        }
        if (obj == wc4.y && (p50Var2 = this.m) != null) {
            p50Var2.o(cd4Var);
            return;
        }
        if (obj == wc4.z) {
            this.n.o(cd4Var);
            return;
        }
        if (obj == wc4.A && (p50Var = this.o) != null) {
            p50Var.o(cd4Var);
        } else if (obj == wc4.B) {
            this.p.o(cd4Var);
        }
    }

    @Override // defpackage.hw3
    public void g(gw3 gw3Var, int i, List list, gw3 gw3Var2) {
        nu4.k(gw3Var, i, list, gw3Var2, this);
    }

    @Override // defpackage.tv0
    public String getName() {
        return this.e;
    }

    @Override // defpackage.lp5
    public Path getPath() {
        if (this.r) {
            return this.a;
        }
        this.a.reset();
        if (this.h) {
            this.r = true;
            return this.a;
        }
        int i = a.a[this.g.ordinal()];
        if (i == 1) {
            i();
        } else if (i == 2) {
            e();
        }
        this.a.close();
        this.q.b(this.a);
        this.r = true;
        return this.a;
    }
}
