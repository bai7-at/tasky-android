package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class fk7 implements ek7 {
    private final Executor b;
    private Runnable c;
    private final ArrayDeque a = new ArrayDeque();
    final Object d = new Object();

    static class a implements Runnable {
        final fk7 a;
        final Runnable b;

        a(fk7 fk7Var, Runnable runnable) {
            this.a = fk7Var;
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.b.run();
                synchronized (this.a.d) {
                    this.a.b();
                }
            } catch (Throwable th) {
                synchronized (this.a.d) {
                    this.a.b();
                    throw th;
                }
            }
        }
    }

    public fk7(Executor executor) {
        this.b = executor;
    }

    void b() {
        Runnable runnable = (Runnable) this.a.poll();
        this.c = runnable;
        if (runnable != null) {
            this.b.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.d) {
            try {
                this.a.add(new a(this, runnable));
                if (this.c == null) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ek7
    public boolean s() {
        boolean z;
        synchronized (this.d) {
            z = !this.a.isEmpty();
        }
        return z;
    }
}
