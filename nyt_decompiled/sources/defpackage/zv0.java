package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;
import defpackage.p50;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class zv0 implements xv1, lp5, p50.b, hw3 {
    private final Paint a;
    private final RectF b;
    private final Matrix c;
    private final Path d;
    private final RectF e;
    private final String f;
    private final boolean g;
    private final List h;
    private final LottieDrawable i;
    private List j;
    private uq8 k;

    public zv0(LottieDrawable lottieDrawable, a aVar, xo7 xo7Var, LottieComposition lottieComposition) {
        this(lottieDrawable, aVar, xo7Var.c(), xo7Var.d(), e(lottieDrawable, lottieComposition, aVar, xo7Var.b()), i(xo7Var.b()));
    }

    private static List e(LottieDrawable lottieDrawable, LottieComposition lottieComposition, a aVar, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            tv0 a = ((pw0) list.get(i)).a(lottieDrawable, lottieComposition, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    static qh i(List list) {
        for (int i = 0; i < list.size(); i++) {
            pw0 pw0Var = (pw0) list.get(i);
            if (pw0Var instanceof qh) {
                return (qh) pw0Var;
            }
        }
        return null;
    }

    private boolean m() {
        int i = 0;
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            if ((this.h.get(i2) instanceof xv1) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // p50.b
    public void a() {
        this.i.invalidateSelf();
    }

    @Override // defpackage.tv0
    public void b(List list, List list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.h.size());
        arrayList.addAll(list);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            tv0 tv0Var = (tv0) this.h.get(size);
            tv0Var.b(arrayList, this.h.subList(0, size));
            arrayList.add(tv0Var);
        }
    }

    @Override // defpackage.xv1
    public void d(RectF rectF, Matrix matrix, boolean z) {
        this.c.set(matrix);
        uq8 uq8Var = this.k;
        if (uq8Var != null) {
            this.c.preConcat(uq8Var.f());
        }
        this.e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            tv0 tv0Var = (tv0) this.h.get(size);
            if (tv0Var instanceof xv1) {
                ((xv1) tv0Var).d(this.e, this.c, z);
                rectF.union(this.e);
            }
        }
    }

    @Override // defpackage.hw3
    public void f(Object obj, cd4 cd4Var) {
        uq8 uq8Var = this.k;
        if (uq8Var != null) {
            uq8Var.c(obj, cd4Var);
        }
    }

    @Override // defpackage.hw3
    public void g(gw3 gw3Var, int i, List list, gw3 gw3Var2) {
        if (gw3Var.g(getName(), i) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                gw3Var2 = gw3Var2.a(getName());
                if (gw3Var.c(getName(), i)) {
                    list.add(gw3Var2.i(this));
                }
            }
            if (gw3Var.h(getName(), i)) {
                int e = i + gw3Var.e(getName(), i);
                for (int i2 = 0; i2 < this.h.size(); i2++) {
                    tv0 tv0Var = (tv0) this.h.get(i2);
                    if (tv0Var instanceof hw3) {
                        ((hw3) tv0Var).g(gw3Var, e, list, gw3Var2);
                    }
                }
            }
        }
    }

    @Override // defpackage.tv0
    public String getName() {
        return this.f;
    }

    @Override // defpackage.lp5
    public Path getPath() {
        this.c.reset();
        uq8 uq8Var = this.k;
        if (uq8Var != null) {
            this.c.set(uq8Var.f());
        }
        this.d.reset();
        if (this.g) {
            return this.d;
        }
        for (int size = this.h.size() - 1; size >= 0; size--) {
            tv0 tv0Var = (tv0) this.h.get(size);
            if (tv0Var instanceof lp5) {
                this.d.addPath(((lp5) tv0Var).getPath(), this.c);
            }
        }
        return this.d;
    }

    @Override // defpackage.xv1
    public void h(Canvas canvas, Matrix matrix, int i) {
        if (this.g) {
            return;
        }
        this.c.set(matrix);
        uq8 uq8Var = this.k;
        if (uq8Var != null) {
            this.c.preConcat(uq8Var.f());
            i = (int) (((((this.k.h() == null ? 100 : ((Integer) this.k.h().h()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.i.g0() && m() && i != 255;
        if (z) {
            this.b.set(0.0f, 0.0f, 0.0f, 0.0f);
            d(this.b, this.c, true);
            this.a.setAlpha(i);
            l29.m(canvas, this.b, this.a);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.h.size() - 1; size >= 0; size--) {
            Object obj = this.h.get(size);
            if (obj instanceof xv1) {
                ((xv1) obj).h(canvas, this.c, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    public List j() {
        return this.h;
    }

    List k() {
        if (this.j == null) {
            this.j = new ArrayList();
            for (int i = 0; i < this.h.size(); i++) {
                tv0 tv0Var = (tv0) this.h.get(i);
                if (tv0Var instanceof lp5) {
                    this.j.add((lp5) tv0Var);
                }
            }
        }
        return this.j;
    }

    Matrix l() {
        uq8 uq8Var = this.k;
        if (uq8Var != null) {
            return uq8Var.f();
        }
        this.c.reset();
        return this.c;
    }

    zv0(LottieDrawable lottieDrawable, a aVar, String str, boolean z, List list, qh qhVar) {
        this.a = new zx3();
        this.b = new RectF();
        this.c = new Matrix();
        this.d = new Path();
        this.e = new RectF();
        this.f = str;
        this.i = lottieDrawable;
        this.g = z;
        this.h = list;
        if (qhVar != null) {
            uq8 b = qhVar.b();
            this.k = b;
            b.a(aVar);
            this.k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            tv0 tv0Var = (tv0) list.get(size);
            if (tv0Var instanceof j33) {
                arrayList.add((j33) tv0Var);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((j33) arrayList.get(size2)).e(list.listIterator(list.size()));
        }
    }
}
