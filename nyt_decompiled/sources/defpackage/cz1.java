package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.a;
import defpackage.p50;
import java.util.List;

/* loaded from: classes.dex */
public class cz1 implements lp5, p50.b, iw3 {
    private final String b;
    private final LottieDrawable c;
    private final p50 d;
    private final p50 e;
    private final vk0 f;
    private boolean h;
    private final Path a = new Path();
    private final kt0 g = new kt0();

    public cz1(LottieDrawable lottieDrawable, a aVar, vk0 vk0Var) {
        this.b = vk0Var.b();
        this.c = lottieDrawable;
        p50 a = vk0Var.d().a();
        this.d = a;
        p50 a2 = vk0Var.c().a();
        this.e = a2;
        this.f = vk0Var;
        aVar.i(a);
        aVar.i(a2);
        a.a(this);
        a2.a(this);
    }

    private void e() {
        this.h = false;
        this.c.invalidateSelf();
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
                    this.g.a(bt8Var);
                    bt8Var.e(this);
                }
            }
        }
    }

    @Override // defpackage.hw3
    public void f(Object obj, cd4 cd4Var) {
        if (obj == wc4.k) {
            this.d.o(cd4Var);
        } else if (obj == wc4.n) {
            this.e.o(cd4Var);
        }
    }

    @Override // defpackage.hw3
    public void g(gw3 gw3Var, int i, List list, gw3 gw3Var2) {
        nu4.k(gw3Var, i, list, gw3Var2, this);
    }

    @Override // defpackage.tv0
    public String getName() {
        return this.b;
    }

    @Override // defpackage.lp5
    public Path getPath() {
        if (this.h) {
            return this.a;
        }
        this.a.reset();
        if (this.f.e()) {
            this.h = true;
            return this.a;
        }
        PointF pointF = (PointF) this.d.h();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.a.reset();
        if (this.f.f()) {
            float f5 = -f2;
            this.a.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.a.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.a.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.a.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.a.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.a.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.a.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.a.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointF2 = (PointF) this.e.h();
        this.a.offset(pointF2.x, pointF2.y);
        this.a.close();
        this.g.b(this.a);
        this.h = true;
        return this.a;
    }
}
