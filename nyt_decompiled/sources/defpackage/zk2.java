package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public class zk2 extends sw3 {
    public zk2(List list) {
        super(list);
    }

    public float q() {
        return r(b(), d());
    }

    float r(rw3 rw3Var, float f) {
        Float f2;
        if (rw3Var.b == null || rw3Var.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        cd4 cd4Var = this.e;
        return (cd4Var == null || (f2 = (Float) cd4Var.b(rw3Var.g, rw3Var.h.floatValue(), (Float) rw3Var.b, (Float) rw3Var.c, f, e(), f())) == null) ? nu4.i(rw3Var.g(), rw3Var.d(), f) : f2.floatValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.p50
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Float i(rw3 rw3Var, float f) {
        return Float.valueOf(r(rw3Var, f));
    }
}
