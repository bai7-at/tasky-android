package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import defpackage.p50;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d60 implements p50.b, iw3, xv1 {
    private final LottieDrawable e;
    protected final com.airbnb.lottie.model.layer.a f;
    private final float[] h;
    final Paint i;
    private final p50 j;
    private final p50 k;
    private final List l;
    private final p50 m;
    private p50 n;
    private p50 o;
    float p;
    private kw1 q;
    private final PathMeasure a = new PathMeasure();
    private final Path b = new Path();
    private final Path c = new Path();
    private final RectF d = new RectF();
    private final List g = new ArrayList();

    private static final class b {
        private final List a;
        private final bt8 b;

        private b(bt8 bt8Var) {
            this.a = new ArrayList();
            this.b = bt8Var;
        }
    }

    d60(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, Paint.Cap cap, Paint.Join join, float f, fh fhVar, dh dhVar, List list, dh dhVar2) {
        zx3 zx3Var = new zx3(1);
        this.i = zx3Var;
        this.p = 0.0f;
        this.e = lottieDrawable;
        this.f = aVar;
        zx3Var.setStyle(Paint.Style.STROKE);
        zx3Var.setStrokeCap(cap);
        zx3Var.setStrokeJoin(join);
        zx3Var.setStrokeMiter(f);
        this.k = fhVar.a();
        this.j = dhVar.a();
        if (dhVar2 == null) {
            this.m = null;
        } else {
            this.m = dhVar2.a();
        }
        this.l = new ArrayList(list.size());
        this.h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.l.add(((dh) list.get(i)).a());
        }
        aVar.i(this.k);
        aVar.i(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            aVar.i((p50) this.l.get(i2));
        }
        p50 p50Var = this.m;
        if (p50Var != null) {
            aVar.i(p50Var);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((p50) this.l.get(i3)).a(this);
        }
        p50 p50Var2 = this.m;
        if (p50Var2 != null) {
            p50Var2.a(this);
        }
        if (aVar.w() != null) {
            p50 a2 = aVar.w().a().a();
            this.o = a2;
            a2.a(this);
            aVar.i(this.o);
        }
        if (aVar.y() != null) {
            this.q = new kw1(this, aVar, aVar.y());
        }
    }

    private void e(Matrix matrix) {
        yx3.b("StrokeContent#applyDashPattern");
        if (this.l.isEmpty()) {
            yx3.c("StrokeContent#applyDashPattern");
            return;
        }
        float g = l29.g(matrix);
        for (int i = 0; i < this.l.size(); i++) {
            this.h[i] = ((Float) ((p50) this.l.get(i)).h()).floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.h;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.h;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.h;
            fArr3[i] = fArr3[i] * g;
        }
        p50 p50Var = this.m;
        this.i.setPathEffect(new DashPathEffect(this.h, p50Var == null ? 0.0f : g * ((Float) p50Var.h()).floatValue()));
        yx3.c("StrokeContent#applyDashPattern");
    }

    private void i(Canvas canvas, b bVar, Matrix matrix) {
        yx3.b("StrokeContent#applyTrimPath");
        if (bVar.b == null) {
            yx3.c("StrokeContent#applyTrimPath");
            return;
        }
        this.b.reset();
        for (int size = bVar.a.size() - 1; size >= 0; size--) {
            this.b.addPath(((lp5) bVar.a.get(size)).getPath(), matrix);
        }
        float floatValue = ((Float) bVar.b.i().h()).floatValue() / 100.0f;
        float floatValue2 = ((Float) bVar.b.f().h()).floatValue() / 100.0f;
        float floatValue3 = ((Float) bVar.b.g().h()).floatValue() / 360.0f;
        if (floatValue < 0.01f && floatValue2 > 0.99f) {
            canvas.drawPath(this.b, this.i);
            yx3.c("StrokeContent#applyTrimPath");
            return;
        }
        this.a.setPath(this.b, false);
        float length = this.a.getLength();
        while (this.a.nextContour()) {
            length += this.a.getLength();
        }
        float f = floatValue3 * length;
        float f2 = (floatValue * length) + f;
        float min = Math.min((floatValue2 * length) + f, (f2 + length) - 1.0f);
        float f3 = 0.0f;
        for (int size2 = bVar.a.size() - 1; size2 >= 0; size2--) {
            this.c.set(((lp5) bVar.a.get(size2)).getPath());
            this.c.transform(matrix);
            this.a.setPath(this.c, false);
            float length2 = this.a.getLength();
            if (min > length) {
                float f4 = min - length;
                if (f4 < f3 + length2 && f3 < f4) {
                    l29.a(this.c, f2 > length ? (f2 - length) / length2 : 0.0f, Math.min(f4 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.c, this.i);
                    f3 += length2;
                }
            }
            float f5 = f3 + length2;
            if (f5 >= f2 && f3 <= min) {
                if (f5 > min || f2 >= f3) {
                    l29.a(this.c, f2 < f3 ? 0.0f : (f2 - f3) / length2, min > f5 ? 1.0f : (min - f3) / length2, 0.0f);
                    canvas.drawPath(this.c, this.i);
                } else {
                    canvas.drawPath(this.c, this.i);
                }
            }
            f3 += length2;
        }
        yx3.c("StrokeContent#applyTrimPath");
    }

    @Override // p50.b
    public void a() {
        this.e.invalidateSelf();
    }

    @Override // defpackage.tv0
    public void b(List list, List list2) {
        bt8 bt8Var = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            tv0 tv0Var = (tv0) list.get(size);
            if (tv0Var instanceof bt8) {
                bt8 bt8Var2 = (bt8) tv0Var;
                if (bt8Var2.j() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    bt8Var = bt8Var2;
                }
            }
        }
        if (bt8Var != null) {
            bt8Var.e(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            tv0 tv0Var2 = (tv0) list2.get(size2);
            if (tv0Var2 instanceof bt8) {
                bt8 bt8Var3 = (bt8) tv0Var2;
                if (bt8Var3.j() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.g.add(bVar);
                    }
                    bVar = new b(bt8Var3);
                    bt8Var3.e(this);
                }
            }
            if (tv0Var2 instanceof lp5) {
                if (bVar == null) {
                    bVar = new b(bt8Var);
                }
                bVar.a.add((lp5) tv0Var2);
            }
        }
        if (bVar != null) {
            this.g.add(bVar);
        }
    }

    @Override // defpackage.xv1
    public void d(RectF rectF, Matrix matrix, boolean z) {
        yx3.b("StrokeContent#getBounds");
        this.b.reset();
        for (int i = 0; i < this.g.size(); i++) {
            b bVar = (b) this.g.get(i);
            for (int i2 = 0; i2 < bVar.a.size(); i2++) {
                this.b.addPath(((lp5) bVar.a.get(i2)).getPath(), matrix);
            }
        }
        this.b.computeBounds(this.d, false);
        float q = ((zk2) this.j).q();
        RectF rectF2 = this.d;
        float f = q / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        yx3.c("StrokeContent#getBounds");
    }

    @Override // defpackage.hw3
    public void f(Object obj, cd4 cd4Var) {
        kw1 kw1Var;
        kw1 kw1Var2;
        kw1 kw1Var3;
        kw1 kw1Var4;
        kw1 kw1Var5;
        if (obj == wc4.d) {
            this.k.o(cd4Var);
            return;
        }
        if (obj == wc4.s) {
            this.j.o(cd4Var);
            return;
        }
        if (obj == wc4.K) {
            p50 p50Var = this.n;
            if (p50Var != null) {
                this.f.H(p50Var);
            }
            if (cd4Var == null) {
                this.n = null;
                return;
            }
            r39 r39Var = new r39(cd4Var);
            this.n = r39Var;
            r39Var.a(this);
            this.f.i(this.n);
            return;
        }
        if (obj == wc4.j) {
            p50 p50Var2 = this.o;
            if (p50Var2 != null) {
                p50Var2.o(cd4Var);
                return;
            }
            r39 r39Var2 = new r39(cd4Var);
            this.o = r39Var2;
            r39Var2.a(this);
            this.f.i(this.o);
            return;
        }
        if (obj == wc4.e && (kw1Var5 = this.q) != null) {
            kw1Var5.c(cd4Var);
            return;
        }
        if (obj == wc4.G && (kw1Var4 = this.q) != null) {
            kw1Var4.f(cd4Var);
            return;
        }
        if (obj == wc4.H && (kw1Var3 = this.q) != null) {
            kw1Var3.d(cd4Var);
            return;
        }
        if (obj == wc4.I && (kw1Var2 = this.q) != null) {
            kw1Var2.e(cd4Var);
        } else {
            if (obj != wc4.J || (kw1Var = this.q) == null) {
                return;
            }
            kw1Var.g(cd4Var);
        }
    }

    @Override // defpackage.hw3
    public void g(gw3 gw3Var, int i, List list, gw3 gw3Var2) {
        nu4.k(gw3Var, i, list, gw3Var2, this);
    }

    @Override // defpackage.xv1
    public void h(Canvas canvas, Matrix matrix, int i) {
        yx3.b("StrokeContent#draw");
        if (l29.h(matrix)) {
            yx3.c("StrokeContent#draw");
            return;
        }
        this.i.setAlpha(nu4.c((int) ((((i / 255.0f) * ((on3) this.k).q()) / 100.0f) * 255.0f), 0, 255));
        this.i.setStrokeWidth(((zk2) this.j).q() * l29.g(matrix));
        if (this.i.getStrokeWidth() <= 0.0f) {
            yx3.c("StrokeContent#draw");
            return;
        }
        e(matrix);
        p50 p50Var = this.n;
        if (p50Var != null) {
            this.i.setColorFilter((ColorFilter) p50Var.h());
        }
        p50 p50Var2 = this.o;
        if (p50Var2 != null) {
            float floatValue = ((Float) p50Var2.h()).floatValue();
            if (floatValue == 0.0f) {
                this.i.setMaskFilter(null);
            } else if (floatValue != this.p) {
                this.i.setMaskFilter(this.f.x(floatValue));
            }
            this.p = floatValue;
        }
        kw1 kw1Var = this.q;
        if (kw1Var != null) {
            kw1Var.b(this.i);
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            b bVar = (b) this.g.get(i2);
            if (bVar.b != null) {
                i(canvas, bVar, matrix);
            } else {
                yx3.b("StrokeContent#buildPath");
                this.b.reset();
                for (int size = bVar.a.size() - 1; size >= 0; size--) {
                    this.b.addPath(((lp5) bVar.a.get(size)).getPath(), matrix);
                }
                yx3.c("StrokeContent#buildPath");
                yx3.b("StrokeContent#drawPath");
                canvas.drawPath(this.b, this.i);
                yx3.c("StrokeContent#drawPath");
            }
        }
        yx3.c("StrokeContent#draw");
    }
}
