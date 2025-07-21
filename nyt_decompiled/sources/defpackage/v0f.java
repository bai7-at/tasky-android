package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class v0f implements bsf {
    private final Executor a;
    private final Object b = new Object();
    private le5 c;

    public v0f(Executor executor, le5 le5Var) {
        this.a = executor;
        this.c = le5Var;
    }

    @Override // defpackage.bsf
    public final void b(og8 og8Var) {
        if (og8Var.o()) {
            synchronized (this.b) {
                try {
                    if (this.c == null) {
                        return;
                    }
                    this.a.execute(new aie(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
