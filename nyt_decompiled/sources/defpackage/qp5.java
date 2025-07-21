package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class qp5 extends sw3 {
    private final PointF i;
    private final float[] j;
    private final float[] k;
    private final PathMeasure l;
    private pp5 m;

    public qp5(List list) {
        super(list);
        this.i = new PointF();
        this.j = new float[2];
        this.k = new float[2];
        this.l = new PathMeasure();
    }

    @Override // defpackage.p50
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF i(rw3 rw3Var, float f) {
        PointF pointF;
        pp5 pp5Var = (pp5) rw3Var;
        Path k = pp5Var.k();
        if (k == null) {
            return (PointF) rw3Var.b;
        }
        cd4 cd4Var = this.e;
        if (cd4Var != null && (pointF = (PointF) cd4Var.b(pp5Var.g, pp5Var.h.floatValue(), (PointF) pp5Var.b, (PointF) pp5Var.c, e(), f, f())) != null) {
            return pointF;
        }
        if (this.m != pp5Var) {
            this.l.setPath(k, false);
            this.m = pp5Var;
        }
        float length = this.l.getLength();
        float f2 = f * length;
        this.l.getPosTan(f2, this.j, this.k);
        PointF pointF2 = this.i;
        float[] fArr = this.j;
        pointF2.set(fArr[0], fArr[1]);
        if (f2 < 0.0f) {
            PointF pointF3 = this.i;
            float[] fArr2 = this.k;
            pointF3.offset(fArr2[0] * f2, fArr2[1] * f2);
        } else if (f2 > length) {
            PointF pointF4 = this.i;
            float[] fArr3 = this.k;
            float f3 = f2 - length;
            pointF4.offset(fArr3[0] * f3, fArr3[1] * f3);
        }
        return this.i;
    }
}
