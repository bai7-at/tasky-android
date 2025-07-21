package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;
import defpackage.p50;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class px6 implements xv1, lp5, j33, p50.b, iw3 {
    private final Matrix a = new Matrix();
    private final Path b = new Path();
    private final LottieDrawable c;
    private final a d;
    private final String e;
    private final boolean f;
    private final p50 g;
    private final p50 h;
    private final uq8 i;
    private zv0 j;

    public px6(LottieDrawable lottieDrawable, a aVar, ox6 ox6Var) {
        this.c = lottieDrawable;
        this.d = aVar;
        this.e = ox6Var.c();
        this.f = ox6Var.f();
        p50 a = ox6Var.b().a();
        this.g = a;
        aVar.i(a);
        a.a(this);
        p50 a2 = ox6Var.d().a();
        this.h = a2;
        aVar.i(a2);
        a2.a(this);
        uq8 b = ox6Var.e().b();
        this.i = b;
        b.a(aVar);
        b.b(this);
    }

    @Override // p50.b
    public void a() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.tv0
    public void b(List list, List list2) {
        this.j.b(list, list2);
    }

    @Override // defpackage.xv1
    public void d(RectF rectF, Matrix matrix, boolean z) {
        this.j.d(rectF, matrix, z);
    }

    @Override // defpackage.j33
    public void e(ListIterator listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((tv0) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new zv0(this.c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override // defpackage.hw3
    public void f(Object obj, cd4 cd4Var) {
        if (this.i.c(obj, cd4Var)) {
            return;
        }
        if (obj == wc4.u) {
            this.g.o(cd4Var);
        } else if (obj == wc4.v) {
            this.h.o(cd4Var);
        }
    }

    @Override // defpackage.hw3
    public void g(gw3 gw3Var, int i, List list, gw3 gw3Var2) {
        nu4.k(gw3Var, i, list, gw3Var2, this);
        for (int i2 = 0; i2 < this.j.j().size(); i2++) {
            tv0 tv0Var = (tv0) this.j.j().get(i2);
            if (tv0Var instanceof iw3) {
                nu4.k(gw3Var, i, list, gw3Var2, (iw3) tv0Var);
            }
        }
    }

    @Override // defpackage.tv0
    public String getName() {
        return this.e;
    }

    @Override // defpackage.lp5
    public Path getPath() {
        Path path = this.j.getPath();
        this.b.reset();
        float floatValue = ((Float) this.g.h()).floatValue();
        float floatValue2 = ((Float) this.h.h()).floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.a.set(this.i.g(i + floatValue2));
            this.b.addPath(path, this.a);
        }
        return this.b;
    }

    @Override // defpackage.xv1
    public void h(Canvas canvas, Matrix matrix, int i) {
        float floatValue = ((Float) this.g.h()).floatValue();
        float floatValue2 = ((Float) this.h.h()).floatValue();
        float floatValue3 = ((Float) this.i.i().h()).floatValue() / 100.0f;
        float floatValue4 = ((Float) this.i.e().h()).floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.a.set(matrix);
            float f = i2;
            this.a.preConcat(this.i.g(f + floatValue2));
            this.j.h(canvas, this.a, (int) (i * nu4.i(floatValue3, floatValue4, f / floatValue)));
        }
    }
}
