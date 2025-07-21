package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.LottieComposition;

/* loaded from: classes.dex */
public class pp5 extends rw3 {
    private Path q;
    private final rw3 r;

    public pp5(LottieComposition lottieComposition, rw3 rw3Var) {
        super(lottieComposition, (PointF) rw3Var.b, (PointF) rw3Var.c, rw3Var.d, rw3Var.e, rw3Var.f, rw3Var.g, rw3Var.h);
        this.r = rw3Var;
        j();
    }

    public void j() {
        Object obj;
        Object obj2;
        Object obj3 = this.c;
        boolean z = (obj3 == null || (obj2 = this.b) == null || !((PointF) obj2).equals(((PointF) obj3).x, ((PointF) obj3).y)) ? false : true;
        Object obj4 = this.b;
        if (obj4 == null || (obj = this.c) == null || z) {
            return;
        }
        rw3 rw3Var = this.r;
        this.q = l29.d((PointF) obj4, (PointF) obj, rw3Var.o, rw3Var.p);
    }

    Path k() {
        return this.q;
    }
}
