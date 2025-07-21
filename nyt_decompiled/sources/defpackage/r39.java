package defpackage;

import java.util.Collections;

/* loaded from: classes.dex */
public class r39 extends p50 {
    private final Object i;

    public r39(cd4 cd4Var) {
        this(cd4Var, null);
    }

    @Override // defpackage.p50
    float c() {
        return 1.0f;
    }

    @Override // defpackage.p50
    public Object h() {
        cd4 cd4Var = this.e;
        Object obj = this.i;
        return cd4Var.b(0.0f, 0.0f, obj, obj, f(), f(), f());
    }

    @Override // defpackage.p50
    Object i(rw3 rw3Var, float f) {
        return h();
    }

    @Override // defpackage.p50
    public void l() {
        if (this.e != null) {
            super.l();
        }
    }

    @Override // defpackage.p50
    public void n(float f) {
        this.d = f;
    }

    public r39(cd4 cd4Var, Object obj) {
        super(Collections.emptyList());
        o(cd4Var);
        this.i = obj;
    }
}
