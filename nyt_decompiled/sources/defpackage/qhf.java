package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class qhf implements bsf {
    private final Executor a;
    private final Object b = new Object();
    private vf5 c;

    public qhf(Executor executor, vf5 vf5Var) {
        this.a = executor;
        this.c = vf5Var;
    }

    @Override // defpackage.bsf
    public final void b(og8 og8Var) {
        if (og8Var.q()) {
            synchronized (this.b) {
                try {
                    if (this.c == null) {
                        return;
                    }
                    this.a.execute(new bff(this, og8Var));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
