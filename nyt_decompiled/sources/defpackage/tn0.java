package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public class tn0 extends sw3 {
    public tn0(List list) {
        super(list);
    }

    public int q() {
        return r(b(), d());
    }

    public int r(rw3 rw3Var, float f) {
        Float f2;
        Integer num;
        if (rw3Var.b == null || rw3Var.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        cd4 cd4Var = this.e;
        return (cd4Var == null || (f2 = rw3Var.h) == null || (num = (Integer) cd4Var.b(rw3Var.g, f2.floatValue(), (Integer) rw3Var.b, (Integer) rw3Var.c, f, e(), f())) == null) ? xv2.c(nu4.b(f, 0.0f, 1.0f), ((Integer) rw3Var.b).intValue(), ((Integer) rw3Var.c).intValue()) : num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.p50
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer i(rw3 rw3Var, float f) {
        return Integer.valueOf(r(rw3Var, f));
    }
}
