package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class q8f implements bsf {
    private final Executor a;
    private final Object b = new Object();
    private me5 c;

    public q8f(Executor executor, me5 me5Var) {
        this.a = executor;
        this.c = me5Var;
    }

    @Override // defpackage.bsf
    public final void b(og8 og8Var) {
        synchronized (this.b) {
            try {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new m6f(this, og8Var));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
