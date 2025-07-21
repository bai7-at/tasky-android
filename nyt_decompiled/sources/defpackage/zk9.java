package defpackage;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.work.DirectExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class zk9 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final j64 e(final Executor executor, final qs2 qs2Var) {
        j64 a = CallbackToFutureAdapter.a(new CallbackToFutureAdapter.b() { // from class: wk9
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
            public final Object a(CallbackToFutureAdapter.a aVar) {
                ww8 f;
                f = zk9.f(executor, qs2Var, aVar);
                return f;
            }
        });
        zq3.g(a, "getFuture {\n        val …        }\n        }\n    }");
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ww8 f(Executor executor, final qs2 qs2Var, final CallbackToFutureAdapter.a aVar) {
        zq3.h(aVar, "it");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        aVar.a(new Runnable() { // from class: xk9
            @Override // java.lang.Runnable
            public final void run() {
                zk9.g(atomicBoolean);
            }
        }, DirectExecutor.INSTANCE);
        executor.execute(new Runnable() { // from class: yk9
            @Override // java.lang.Runnable
            public final void run() {
                zk9.h(atomicBoolean, aVar, qs2Var);
            }
        });
        return ww8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.a aVar, qs2 qs2Var) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            aVar.c(qs2Var.mo865invoke());
        } catch (Throwable th) {
            aVar.f(th);
        }
    }
}
