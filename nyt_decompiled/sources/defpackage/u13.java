package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.a;

/* loaded from: classes.dex */
public class u13 extends d60 {
    private final p50 A;
    private r39 B;
    private final String r;
    private final boolean s;
    private final lb4 t;
    private final lb4 u;
    private final RectF v;
    private final GradientType w;
    private final int x;
    private final p50 y;
    private final p50 z;

    public u13(LottieDrawable lottieDrawable, a aVar, com.airbnb.lottie.model.content.a aVar2) {
        super(lottieDrawable, aVar, aVar2.b().toPaintCap(), aVar2.g().toPaintJoin(), aVar2.i(), aVar2.k(), aVar2.m(), aVar2.h(), aVar2.c());
        this.t = new lb4();
        this.u = new lb4();
        this.v = new RectF();
        this.r = aVar2.j();
        this.w = aVar2.f();
        this.s = aVar2.n();
        this.x = (int) (lottieDrawable.K().d() / 32.0f);
        p50 a = aVar2.e().a();
        this.y = a;
        a.a(this);
        aVar.i(a);
        p50 a2 = aVar2.l().a();
        this.z = a2;
        a2.a(this);
        aVar.i(a2);
        p50 a3 = aVar2.d().a();
        this.A = a3;
        a3.a(this);
        aVar.i(a3);
    }

    private int[] j(int[] iArr) {
        r39 r39Var = this.B;
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

    private int k() {
        int round = Math.round(this.z.f() * this.x);
        int round2 = Math.round(this.A.f() * this.x);
        int round3 = Math.round(this.y.f() * this.x);
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private LinearGradient l() {
        long k = k();
        LinearGradient linearGradient = (LinearGradient) this.t.d(k);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.z.h();
        PointF pointF2 = (PointF) this.A.h();
        n13 n13Var = (n13) this.y.h();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, j(n13Var.d()), n13Var.e(), Shader.TileMode.CLAMP);
        this.t.h(k, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient m() {
        long k = k();
        RadialGradient radialGradient = (RadialGradient) this.u.d(k);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.z.h();
        PointF pointF2 = (PointF) this.A.h();
        n13 n13Var = (n13) this.y.h();
        int[] j = j(n13Var.d());
        float[] e = n13Var.e();
        RadialGradient radialGradient2 = new RadialGradient(pointF.x, pointF.y, (float) Math.hypot(pointF2.x - r7, pointF2.y - r8), j, e, Shader.TileMode.CLAMP);
        this.u.h(k, radialGradient2);
        return radialGradient2;
    }

    @Override // defpackage.d60, defpackage.hw3
    public void f(Object obj, cd4 cd4Var) {
        super.f(obj, cd4Var);
        if (obj == wc4.L) {
            r39 r39Var = this.B;
            if (r39Var != null) {
                this.f.H(r39Var);
            }
            if (cd4Var == null) {
                this.B = null;
                return;
            }
            r39 r39Var2 = new r39(cd4Var);
            this.B = r39Var2;
            r39Var2.a(this);
            this.f.i(this.B);
        }
    }

    @Override // defpackage.tv0
    public String getName() {
        return this.r;
    }

    @Override // defpackage.d60, defpackage.xv1
    public void h(Canvas canvas, Matrix matrix, int i) {
        if (this.s) {
            return;
        }
        d(this.v, matrix, false);
        Shader l = this.w == GradientType.LINEAR ? l() : m();
        l.setLocalMatrix(matrix);
        this.i.setShader(l);
        super.h(canvas, matrix, i);
    }
}
