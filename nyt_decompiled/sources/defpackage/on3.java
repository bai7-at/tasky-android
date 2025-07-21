package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public class on3 extends sw3 {
    public on3(List list) {
        super(list);
    }

    public int q() {
        return r(b(), d());
    }

    int r(rw3 rw3Var, float f) {
        Integer num;
        if (rw3Var.b == null || rw3Var.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        cd4 cd4Var = this.e;
        return (cd4Var == null || (num = (Integer) cd4Var.b(rw3Var.g, rw3Var.h.floatValue(), (Integer) rw3Var.b, (Integer) rw3Var.c, f, e(), f())) == null) ? nu4.j(rw3Var.h(), rw3Var.e(), f) : num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.p50
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer i(rw3 rw3Var, float f) {
        return Integer.valueOf(r(rw3Var, f));
    }
}
