package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class k5c implements bsf {
    private final Executor a;
    private final cy0 b;
    private final w1g c;

    public k5c(Executor executor, cy0 cy0Var, w1g w1gVar) {
        this.a = executor;
        this.b = cy0Var;
        this.c = w1gVar;
    }

    @Override // defpackage.bsf
    public final void b(og8 og8Var) {
        this.a.execute(new abb(this, og8Var));
    }
}
