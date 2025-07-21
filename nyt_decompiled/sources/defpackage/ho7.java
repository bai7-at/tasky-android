package defpackage;

import android.graphics.Shader;
import defpackage.nn0;

/* loaded from: classes.dex */
public abstract class ho7 extends yc0 {
    private Shader c;
    private long d;

    public ho7() {
        super(null);
        this.d = zt7.b.a();
    }

    @Override // defpackage.yc0
    public final void a(long j, ao5 ao5Var, float f) {
        Shader shader = this.c;
        if (shader == null || !zt7.f(this.d, j)) {
            if (zt7.k(j)) {
                shader = null;
                this.c = null;
                this.d = zt7.b.a();
            } else {
                shader = b(j);
                this.c = shader;
                this.d = j;
            }
        }
        long b = ao5Var.b();
        nn0.a aVar = nn0.b;
        if (!nn0.t(b, aVar.a())) {
            ao5Var.k(aVar.a());
        }
        if (!zq3.c(ao5Var.r(), shader)) {
            ao5Var.q(shader);
        }
        if (ao5Var.a() == f) {
            return;
        }
        ao5Var.c(f);
    }

    public abstract Shader b(long j);
}
