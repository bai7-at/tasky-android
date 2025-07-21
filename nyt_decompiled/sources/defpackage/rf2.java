package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;
import defpackage.p50;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class rf2 implements xv1, p50.b, iw3 {
    private final Path a;
    private final Paint b;
    private final a c;
    private final String d;
    private final boolean e;
    private final List f;
    private final p50 g;
    private final p50 h;
    private p50 i;
    private final LottieDrawable j;
    private p50 k;
    float l;
    private kw1 m;

    public rf2(LottieDrawable lottieDrawable, a aVar, vo7 vo7Var) {
        Path path = new Path();
        this.a = path;
        zx3 zx3Var = new zx3(1);
        this.b = zx3Var;
        this.f = new ArrayList();
        this.c = aVar;
        this.d = vo7Var.d();
        this.e = vo7Var.f();
        this.j = lottieDrawable;
        if (aVar.w() != null) {
            p50 a = aVar.w().a().a();
            this.k = a;
            a.a(this);
            aVar.i(this.k);
        }
        if (aVar.y() != null) {
            this.m = new kw1(this, aVar, aVar.y());
        }
        if (vo7Var.b() == null || vo7Var.e() == null) {
            this.g = null;
            this.h = null;
            return;
        }
        bo5.b(zx3Var, aVar.v().toNativeBlendMode());
        path.setFillType(vo7Var.c());
        p50 a2 = vo7Var.b().a();
        this.g = a2;
        a2.a(this);
        aVar.i(a2);
        p50 a3 = vo7Var.e().a();
        this.h = a3;
        a3.a(this);
        aVar.i(a3);
    }

    @Override // p50.b
    public void a() {
        this.j.invalidateSelf();
    }

    @Override // defpackage.tv0
    public void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            tv0 tv0Var = (tv0) list2.get(i);
            if (tv0Var instanceof lp5) {
                this.f.add((lp5) tv0Var);
            }
        }
    }

    @Override // defpackage.xv1
    public void d(RectF rectF, Matrix matrix, boolean z) {
        this.a.reset();
        for (int i = 0; i < this.f.size(); i++) {
            this.a.addPath(((lp5) this.f.get(i)).getPath(), matrix);
        }
        this.a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // defpackage.hw3
    public void f(Object obj, cd4 cd4Var) {
        kw1 kw1Var;
        kw1 kw1Var2;
        kw1 kw1Var3;
        kw1 kw1Var4;
        kw1 kw1Var5;
        if (obj == wc4.a) {
            this.g.o(cd4Var);
            return;
        }
        if (obj == wc4.d) {
            this.h.o(cd4Var);
            return;
        }
        if (obj == wc4.K) {
            p50 p50Var = this.i;
            if (p50Var != null) {
                this.c.H(p50Var);
            }
            if (cd4Var == null) {
                this.i = null;
                return;
            }
            r39 r39Var = new r39(cd4Var);
            this.i = r39Var;
            r39Var.a(this);
            this.c.i(this.i);
            return;
        }
        if (obj == wc4.j) {
            p50 p50Var2 = this.k;
            if (p50Var2 != null) {
                p50Var2.o(cd4Var);
                return;
            }
            r39 r39Var2 = new r39(cd4Var);
            this.k = r39Var2;
            r39Var2.a(this);
            this.c.i(this.k);
            return;
        }
        if (obj == wc4.e && (kw1Var5 = this.m) != null) {
            kw1Var5.c(cd4Var);
            return;
        }
        if (obj == wc4.G && (kw1Var4 = this.m) != null) {
            kw1Var4.f(cd4Var);
            return;
        }
        if (obj == wc4.H && (kw1Var3 = this.m) != null) {
            kw1Var3.d(cd4Var);
            return;
        }
        if (obj == wc4.I && (kw1Var2 = this.m) != null) {
            kw1Var2.e(cd4Var);
        } else {
            if (obj != wc4.J || (kw1Var = this.m) == null) {
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
        return this.d;
    }

    @Override // defpackage.xv1
    public void h(Canvas canvas, Matrix matrix, int i) {
        if (this.e) {
            return;
        }
        yx3.b("FillContent#draw");
        this.b.setColor((nu4.c((int) ((((i / 255.0f) * ((Integer) this.h.h()).intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((tn0) this.g).q() & 16777215));
        p50 p50Var = this.i;
        if (p50Var != null) {
            this.b.setColorFilter((ColorFilter) p50Var.h());
        }
        p50 p50Var2 = this.k;
        if (p50Var2 != null) {
            float floatValue = ((Float) p50Var2.h()).floatValue();
            if (floatValue == 0.0f) {
                this.b.setMaskFilter(null);
            } else if (floatValue != this.l) {
                this.b.setMaskFilter(this.c.x(floatValue));
            }
            this.l = floatValue;
        }
        kw1 kw1Var = this.m;
        if (kw1Var != null) {
            kw1Var.b(this.b);
        }
        this.a.reset();
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            this.a.addPath(((lp5) this.f.get(i2)).getPath(), matrix);
        }
        canvas.drawPath(this.a, this.b);
        yx3.c("FillContent#draw");
    }
}
