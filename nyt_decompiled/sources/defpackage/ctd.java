package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class ctd implements vf5, ue5, le5, bsf {
    private final Executor a;
    private final cy0 b;
    private final w1g c;

    public ctd(Executor executor, cy0 cy0Var, w1g w1gVar) {
        this.a = executor;
        this.b = cy0Var;
        this.c = w1gVar;
    }

    @Override // defpackage.le5
    public final void a() {
        this.c.v();
    }

    @Override // defpackage.bsf
    public final void b(og8 og8Var) {
        this.a.execute(new jzc(this, og8Var));
    }

    @Override // defpackage.ue5
    public final void onFailure(Exception exc) {
        this.c.t(exc);
    }

    @Override // defpackage.vf5
    public final void onSuccess(Object obj) {
        this.c.u(obj);
    }
}
