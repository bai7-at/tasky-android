package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.layer.a;

/* loaded from: classes.dex */
public class w48 extends d60 {
    private final a r;
    private final String s;
    private final boolean t;
    private final p50 u;
    private p50 v;

    public w48(LottieDrawable lottieDrawable, a aVar, ShapeStroke shapeStroke) {
        super(lottieDrawable, aVar, shapeStroke.b().toPaintCap(), shapeStroke.e().toPaintJoin(), shapeStroke.g(), shapeStroke.i(), shapeStroke.j(), shapeStroke.f(), shapeStroke.d());
        this.r = aVar;
        this.s = shapeStroke.h();
        this.t = shapeStroke.k();
        p50 a = shapeStroke.c().a();
        this.u = a;
        a.a(this);
        aVar.i(a);
    }

    @Override // defpackage.d60, defpackage.hw3
    public void f(Object obj, cd4 cd4Var) {
        super.f(obj, cd4Var);
        if (obj == wc4.b) {
            this.u.o(cd4Var);
            return;
        }
        if (obj == wc4.K) {
            p50 p50Var = this.v;
            if (p50Var != null) {
                this.r.H(p50Var);
            }
            if (cd4Var == null) {
                this.v = null;
                return;
            }
            r39 r39Var = new r39(cd4Var);
            this.v = r39Var;
            r39Var.a(this);
            this.r.i(this.u);
        }
    }

    @Override // defpackage.tv0
    public String getName() {
        return this.s;
    }

    @Override // defpackage.d60, defpackage.xv1
    public void h(Canvas canvas, Matrix matrix, int i) {
        if (this.t) {
            return;
        }
        this.i.setColor(((tn0) this.u).q());
        p50 p50Var = this.v;
        if (p50Var != null) {
            this.i.setColorFilter((ColorFilter) p50Var.h());
        }
        super.h(canvas, matrix, i);
    }
}
