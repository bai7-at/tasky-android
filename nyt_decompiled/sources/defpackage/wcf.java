package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class wcf implements bsf {
    private final Executor a;
    private final Object b = new Object();
    private ue5 c;

    public wcf(Executor executor, ue5 ue5Var) {
        this.a = executor;
        this.c = ue5Var;
    }

    @Override // defpackage.bsf
    public final void b(og8 og8Var) {
        if (og8Var.q() || og8Var.o()) {
            return;
        }
        synchronized (this.b) {
            try {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new qaf(this, og8Var));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
