package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.a;
import defpackage.p50;
import java.util.List;

/* loaded from: classes.dex */
public class ot6 implements p50.b, iw3, lp5 {
    private final String c;
    private final boolean d;
    private final LottieDrawable e;
    private final p50 f;
    private final p50 g;
    private final p50 h;
    private boolean k;
    private final Path a = new Path();
    private final RectF b = new RectF();
    private final kt0 i = new kt0();
    private p50 j = null;

    public ot6(LottieDrawable lottieDrawable, a aVar, pt6 pt6Var) {
        this.c = pt6Var.c();
        this.d = pt6Var.f();
        this.e = lottieDrawable;
        p50 a = pt6Var.d().a();
        this.f = a;
        p50 a2 = pt6Var.e().a();
        this.g = a2;
        p50 a3 = pt6Var.b().a();
        this.h = a3;
        aVar.i(a);
        aVar.i(a2);
        aVar.i(a3);
        a.a(this);
        a2.a(this);
        a3.a(this);
    }

    private void e() {
        this.k = false;
        this.e.invalidateSelf();
    }

    @Override // p50.b
    public void a() {
        e();
    }

    @Override // defpackage.tv0
    public void b(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            tv0 tv0Var = (tv0) list.get(i);
            if (tv0Var instanceof bt8) {
                bt8 bt8Var = (bt8) tv0Var;
                if (bt8Var.j() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.i.a(bt8Var);
                    bt8Var.e(this);
                }
            }
            if (tv0Var instanceof h37) {
                this.j = ((h37) tv0Var).g();
            }
        }
    }

    @Override // defpackage.hw3
    public void f(Object obj, cd4 cd4Var) {
        if (obj == wc4.l) {
            this.g.o(cd4Var);
        } else if (obj == wc4.n) {
            this.f.o(cd4Var);
        } else if (obj == wc4.m) {
            this.h.o(cd4Var);
        }
    }

    @Override // defpackage.hw3
    public void g(gw3 gw3Var, int i, List list, gw3 gw3Var2) {
        nu4.k(gw3Var, i, list, gw3Var2, this);
    }

    @Override // defpackage.tv0
    public String getName() {
        return this.c;
    }

    @Override // defpackage.lp5
    public Path getPath() {
        p50 p50Var;
        if (this.k) {
            return this.a;
        }
        this.a.reset();
        if (this.d) {
            this.k = true;
            return this.a;
        }
        PointF pointF = (PointF) this.g.h();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        p50 p50Var2 = this.h;
        float q = p50Var2 == null ? 0.0f : ((zk2) p50Var2).q();
        if (q == 0.0f && (p50Var = this.j) != null) {
            q = Math.min(((Float) p50Var.h()).floatValue(), Math.min(f, f2));
        }
        float min = Math.min(f, f2);
        if (q > min) {
            q = min;
        }
        PointF pointF2 = (PointF) this.f.h();
        this.a.moveTo(pointF2.x + f, (pointF2.y - f2) + q);
        this.a.lineTo(pointF2.x + f, (pointF2.y + f2) - q);
        if (q > 0.0f) {
            RectF rectF = this.b;
            float f3 = pointF2.x;
            float f4 = q * 2.0f;
            float f5 = pointF2.y;
            rectF.set((f3 + f) - f4, (f5 + f2) - f4, f3 + f, f5 + f2);
            this.a.arcTo(this.b, 0.0f, 90.0f, false);
        }
        this.a.lineTo((pointF2.x - f) + q, pointF2.y + f2);
        if (q > 0.0f) {
            RectF rectF2 = this.b;
            float f6 = pointF2.x;
            float f7 = pointF2.y;
            float f8 = q * 2.0f;
            rectF2.set(f6 - f, (f7 + f2) - f8, (f6 - f) + f8, f7 + f2);
            this.a.arcTo(this.b, 90.0f, 90.0f, false);
        }
        this.a.lineTo(pointF2.x - f, (pointF2.y - f2) + q);
        if (q > 0.0f) {
            RectF rectF3 = this.b;
            float f9 = pointF2.x;
            float f10 = pointF2.y;
            float f11 = q * 2.0f;
            rectF3.set(f9 - f, f10 - f2, (f9 - f) + f11, (f10 - f2) + f11);
            this.a.arcTo(this.b, 180.0f, 90.0f, false);
        }
        this.a.lineTo((pointF2.x + f) - q, pointF2.y - f2);
        if (q > 0.0f) {
            RectF rectF4 = this.b;
            float f12 = pointF2.x;
            float f13 = q * 2.0f;
            float f14 = pointF2.y;
            rectF4.set((f12 + f) - f13, f14 - f2, f12 + f, (f14 - f2) + f13);
            this.a.arcTo(this.b, 270.0f, 90.0f, false);
        }
        this.a.close();
        this.i.b(this.a);
        this.k = true;
        return this.a;
    }
}
