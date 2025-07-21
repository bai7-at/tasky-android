package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.a;
import defpackage.p50;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class s13 implements xv1, p50.b, iw3 {
    private final String a;
    private final boolean b;
    private final a c;
    private final lb4 d = new lb4();
    private final lb4 e = new lb4();
    private final Path f;
    private final Paint g;
    private final RectF h;
    private final List i;
    private final GradientType j;
    private final p50 k;
    private final p50 l;
    private final p50 m;
    private final p50 n;
    private p50 o;
    private r39 p;
    private final LottieDrawable q;
    private final int r;
    private p50 s;
    float t;
    private kw1 u;

    public s13(LottieDrawable lottieDrawable, LottieComposition lottieComposition, a aVar, r13 r13Var) {
        Path path = new Path();
        this.f = path;
        this.g = new zx3(1);
        this.h = new RectF();
        this.i = new ArrayList();
        this.t = 0.0f;
        this.c = aVar;
        this.a = r13Var.f();
        this.b = r13Var.i();
        this.q = lottieDrawable;
        this.j = r13Var.e();
        path.setFillType(r13Var.c());
        this.r = (int) (lottieComposition.d() / 32.0f);
        p50 a = r13Var.d().a();
        this.k = a;
        a.a(this);
        aVar.i(a);
        p50 a2 = r13Var.g().a();
        this.l = a2;
        a2.a(this);
        aVar.i(a2);
        p50 a3 = r13Var.h().a();
        this.m = a3;
        a3.a(this);
        aVar.i(a3);
        p50 a4 = r13Var.b().a();
        this.n = a4;
        a4.a(this);
        aVar.i(a4);
        if (aVar.w() != null) {
            p50 a5 = aVar.w().a().a();
            this.s = a5;
            a5.a(this);
            aVar.i(this.s);
        }
        if (aVar.y() != null) {
            this.u = new kw1(this, aVar, aVar.y());
        }
    }

    private int[] e(int[] iArr) {
        r39 r39Var = this.p;
        if (r39Var != null) {
            Integer[] numArr = (Integer[]) r39Var.h();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    private int i() {
        int round = Math.round(this.m.f() * this.r);
        int round2 = Math.round(this.n.f() * this.r);
        int round3 = Math.round(this.k.f() * this.r);
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private LinearGradient j() {
        long i = i();
        LinearGradient linearGradient = (LinearGradient) this.d.d(i);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.m.h();
        PointF pointF2 = (PointF) this.n.h();
        n13 n13Var = (n13) this.k.h();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, e(n13Var.d()), n13Var.e(), Shader.TileMode.CLAMP);
        this.d.h(i, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient k() {
        long i = i();
        RadialGradient radialGradient = (RadialGradient) this.e.d(i);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.m.h();
        PointF pointF2 = (PointF) this.n.h();
        n13 n13Var = (n13) this.k.h();
        int[] e = e(n13Var.d());
        float[] e2 = n13Var.e();
        float f = pointF.x;
        float f2 = pointF.y;
        float hypot = (float) Math.hypot(pointF2.x - f, pointF2.y - f2);
        if (hypot <= 0.0f) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f, f2, hypot, e, e2, Shader.TileMode.CLAMP);
        this.e.h(i, radialGradient2);
        return radialGradient2;
    }

    @Override // p50.b
    public void a() {
        this.q.invalidateSelf();
    }

    @Override // defpackage.tv0
    public void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            tv0 tv0Var = (tv0) list2.get(i);
            if (tv0Var instanceof lp5) {
                this.i.add((lp5) tv0Var);
            }
        }
    }

    @Override // defpackage.xv1
    public void d(RectF rectF, Matrix matrix, boolean z) {
        this.f.reset();
        for (int i = 0; i < this.i.size(); i++) {
            this.f.addPath(((lp5) this.i.get(i)).getPath(), matrix);
        }
        this.f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // defpackage.hw3
    public void f(Object obj, cd4 cd4Var) {
        kw1 kw1Var;
        kw1 kw1Var2;
        kw1 kw1Var3;
        kw1 kw1Var4;
        kw1 kw1Var5;
        if (obj == wc4.d) {
            this.l.o(cd4Var);
            return;
        }
        if (obj == wc4.K) {
            p50 p50Var = this.o;
            if (p50Var != null) {
                this.c.H(p50Var);
            }
            if (cd4Var == null) {
                this.o = null;
                return;
            }
            r39 r39Var = new r39(cd4Var);
            this.o = r39Var;
            r39Var.a(this);
            this.c.i(this.o);
            return;
        }
        if (obj == wc4.L) {
            r39 r39Var2 = this.p;
            if (r39Var2 != null) {
                this.c.H(r39Var2);
            }
            if (cd4Var == null) {
                this.p = null;
                return;
            }
            this.d.a();
            this.e.a();
            r39 r39Var3 = new r39(cd4Var);
            this.p = r39Var3;
            r39Var3.a(this);
            this.c.i(this.p);
            return;
        }
        if (obj == wc4.j) {
            p50 p50Var2 = this.s;
            if (p50Var2 != null) {
                p50Var2.o(cd4Var);
                return;
            }
            r39 r39Var4 = new r39(cd4Var);
            this.s = r39Var4;
            r39Var4.a(this);
            this.c.i(this.s);
            return;
        }
        if (obj == wc4.e && (kw1Var5 = this.u) != null) {
            kw1Var5.c(cd4Var);
            return;
        }
        if (obj == wc4.G && (kw1Var4 = this.u) != null) {
            kw1Var4.f(cd4Var);
            return;
        }
        if (obj == wc4.H && (kw1Var3 = this.u) != null) {
            kw1Var3.d(cd4Var);
            return;
        }
        if (obj == wc4.I && (kw1Var2 = this.u) != null) {
            kw1Var2.e(cd4Var);
        } else {
            if (obj != wc4.J || (kw1Var = this.u) == null) {
                return;
            }
            kw1Var.g(cd4Var);
        }
    }

    @Override // defpackage.hw3
    public void g(gw3 gw3Var, int i, List list, gw3 gw3Var2) {
        nu4.k(gw3Var, i, list, gw3Var2, this);
    }

    @Override // defpackage.tv0
    public String getName() {
        return this.a;
    }

    @Override // defpackage.xv1
    public void h(Canvas canvas, Matrix matrix, int i) {
        if (this.b) {
            return;
        }
        yx3.b("GradientFillContent#draw");
        this.f.reset();
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            this.f.addPath(((lp5) this.i.get(i2)).getPath(), matrix);
        }
        this.f.computeBounds(this.h, false);
        Shader j = this.j == GradientType.LINEAR ? j() : k();
        j.setLocalMatrix(matrix);
        this.g.setShader(j);
        p50 p50Var = this.o;
        if (p50Var != null) {
            this.g.setColorFilter((ColorFilter) p50Var.h());
        }
        p50 p50Var2 = this.s;
        if (p50Var2 != null) {
            float floatValue = ((Float) p50Var2.h()).floatValue();
            if (floatValue == 0.0f) {
                this.g.setMaskFilter(null);
            } else if (floatValue != this.t) {
                this.g.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.t = floatValue;
        }
        kw1 kw1Var = this.u;
        if (kw1Var != null) {
            kw1Var.b(this.g);
        }
        this.g.setAlpha(nu4.c((int) ((((i / 255.0f) * ((Integer) this.l.h()).intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f, this.g);
        yx3.c("GradientFillContent#draw");
    }
}
