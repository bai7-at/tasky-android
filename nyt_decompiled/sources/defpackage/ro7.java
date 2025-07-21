package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.a;
import defpackage.p50;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ro7 implements lp5, p50.b, iw3 {
    private final String b;
    private final boolean c;
    private final LottieDrawable d;
    private final zo7 e;
    private boolean f;
    private final Path a = new Path();
    private final kt0 g = new kt0();

    public ro7(LottieDrawable lottieDrawable, a aVar, dp7 dp7Var) {
        this.b = dp7Var.b();
        this.c = dp7Var.d();
        this.d = lottieDrawable;
        zo7 a = dp7Var.c().a();
        this.e = a;
        aVar.i(a);
        a.a(this);
    }

    private void e() {
        this.f = false;
        this.d.invalidateSelf();
    }

    @Override // p50.b
    public void a() {
        e();
    }

    @Override // defpackage.tv0
    public void b(List list, List list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            tv0 tv0Var = (tv0) list.get(i);
            if (tv0Var instanceof bt8) {
                bt8 bt8Var = (bt8) tv0Var;
                if (bt8Var.j() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.g.a(bt8Var);
                    bt8Var.e(this);
                }
            }
            if (tv0Var instanceof bp7) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((bp7) tv0Var);
            }
        }
        this.e.r(arrayList);
    }

    @Override // defpackage.hw3
    public void f(Object obj, cd4 cd4Var) {
        if (obj == wc4.P) {
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
        if (this.f && !this.e.k()) {
            return this.a;
        }
        this.a.reset();
        if (this.c) {
            this.f = true;
            return this.a;
        }
        Path path = (Path) this.e.h();
        if (path == null) {
            return this.a;
        }
        this.a.set(path);
        this.a.setFillType(Path.FillType.EVEN_ODD);
        this.g.b(this.a);
        this.f = true;
        return this.a;
    }
}
