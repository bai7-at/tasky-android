package defpackage;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class kx5 extends sw3 {
    private final PointF i;

    public kx5(List list) {
        super(list);
        this.i = new PointF();
    }

    @Override // defpackage.p50
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF i(rw3 rw3Var, float f) {
        return j(rw3Var, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.p50
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF j(rw3 rw3Var, float f, float f2, float f3) {
        Object obj;
        PointF pointF;
        Object obj2 = rw3Var.b;
        if (obj2 == null || (obj = rw3Var.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF2 = (PointF) obj2;
        PointF pointF3 = (PointF) obj;
        cd4 cd4Var = this.e;
        if (cd4Var != null && (pointF = (PointF) cd4Var.b(rw3Var.g, rw3Var.h.floatValue(), pointF2, pointF3, f, e(), f())) != null) {
            return pointF;
        }
        PointF pointF4 = this.i;
        float f4 = pointF2.x;
        float f5 = f4 + (f2 * (pointF3.x - f4));
        float f6 = pointF2.y;
        pointF4.set(f5, f6 + (f3 * (pointF3.y - f6)));
        return this.i;
    }
}
