package defpackage;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public abstract class k29 {
    private static final ExecutorService a = r62.c("awaitEvenIfOnMainThread task continuation executor");

    class a implements Runnable {
        final /* synthetic */ Callable a;
        final /* synthetic */ qg8 b;

        /* renamed from: k29$a$a, reason: collision with other inner class name */
        class C0494a implements cy0 {
            C0494a() {
            }

            @Override // defpackage.cy0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void then(og8 og8Var) {
                if (og8Var.q()) {
                    a.this.b.c(og8Var.m());
                    return null;
                }
                a.this.b.b(og8Var.l());
                return null;
            }
        }

        a(Callable callable, qg8 qg8Var) {
            this.a = callable;
            this.b = qg8Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ((og8) this.a.call()).h(new C0494a());
            } catch (Exception e) {
                this.b.b(e);
            }
        }
    }

    public static Object d(og8 og8Var) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        og8Var.i(a, new cy0() { // from class: h29
            @Override // defpackage.cy0
            public final Object then(og8 og8Var2) {
                Object f;
                f = k29.f(countDownLatch, og8Var2);
                return f;
            }
        });
        countDownLatch.await(4L, TimeUnit.SECONDS);
        if (og8Var.q()) {
            return og8Var.m();
        }
        if (og8Var.o()) {
            throw new CancellationException("Task is already canceled");
        }
        if (og8Var.p()) {
            throw new IllegalStateException(og8Var.l());
        }
        throw new TimeoutException();
    }

    public static og8 e(Executor executor, Callable callable) {
        qg8 qg8Var = new qg8();
        executor.execute(new a(callable, qg8Var));
        return qg8Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object f(CountDownLatch countDownLatch, og8 og8Var) {
        countDownLatch.countDown();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void g(qg8 qg8Var, og8 og8Var) {
        if (og8Var.q()) {
            qg8Var.e(og8Var.m());
            return null;
        }
        Exception l = og8Var.l();
        Objects.requireNonNull(l);
        qg8Var.d(l);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void h(qg8 qg8Var, og8 og8Var) {
        if (og8Var.q()) {
            qg8Var.e(og8Var.m());
            return null;
        }
        Exception l = og8Var.l();
        Objects.requireNonNull(l);
        qg8Var.d(l);
        return null;
    }

    public static og8 i(og8 og8Var, og8 og8Var2) {
        final qg8 qg8Var = new qg8();
        cy0 cy0Var = new cy0() { // from class: j29
            @Override // defpackage.cy0
            public final Object then(og8 og8Var3) {
                Void g;
                g = k29.g(qg8.this, og8Var3);
                return g;
            }
        };
        og8Var.h(cy0Var);
        og8Var2.h(cy0Var);
        return qg8Var.a();
    }

    public static og8 j(Executor executor, og8 og8Var, og8 og8Var2) {
        final qg8 qg8Var = new qg8();
        cy0 cy0Var = new cy0() { // from class: i29
            @Override // defpackage.cy0
            public final Object then(og8 og8Var3) {
                Void h;
                h = k29.h(qg8.this, og8Var3);
                return h;
            }
        };
        og8Var.i(executor, cy0Var);
        og8Var2.i(executor, cy0Var);
        return qg8Var.a();
    }
}
