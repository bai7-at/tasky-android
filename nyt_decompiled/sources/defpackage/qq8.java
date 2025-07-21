package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class qq8 implements Executor {
    private final Executor a;
    private final ArrayDeque b;
    private Runnable c;
    private final Object d;

    public qq8(Executor executor) {
        zq3.h(executor, "executor");
        this.a = executor;
        this.b = new ArrayDeque();
        this.d = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Runnable runnable, qq8 qq8Var) {
        zq3.h(runnable, "$command");
        zq3.h(qq8Var, "this$0");
        try {
            runnable.run();
        } finally {
            qq8Var.d();
        }
    }

    public final void d() {
        synchronized (this.d) {
            try {
                Object poll = this.b.poll();
                Runnable runnable = (Runnable) poll;
                this.c = runnable;
                if (poll != null) {
                    this.a.execute(runnable);
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        zq3.h(runnable, "command");
        synchronized (this.d) {
            try {
                this.b.offer(new Runnable() { // from class: pq8
                    @Override // java.lang.Runnable
                    public final void run() {
                        qq8.c(runnable, this);
                    }
                });
                if (this.c == null) {
                    d();
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
