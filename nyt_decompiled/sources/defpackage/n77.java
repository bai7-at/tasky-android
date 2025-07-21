package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
class n77 implements Executor {
    private final Executor a;

    static class a implements Runnable {
        private final Runnable a;

        a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.a.run();
            } catch (Exception e) {
                ca4.c("Executor", "Background execution failure.", e);
            }
        }
    }

    n77(Executor executor) {
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.a.execute(new a(runnable));
    }
}
