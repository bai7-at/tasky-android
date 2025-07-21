package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

/* loaded from: classes2.dex */
public final class x74 {
    private Object a;
    private CountDownLatch b;

    public x74(final Callable callable) {
        zq3.h(callable, "callable");
        this.b = new CountDownLatch(1);
        w92.t().execute(new FutureTask(new Callable() { // from class: w74
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void b;
                b = x74.b(x74.this, callable);
                return b;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void b(x74 x74Var, Callable callable) {
        zq3.h(x74Var, "this$0");
        zq3.h(callable, "$callable");
        try {
            x74Var.a = callable.call();
        } finally {
            CountDownLatch countDownLatch = x74Var.b;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }
}
