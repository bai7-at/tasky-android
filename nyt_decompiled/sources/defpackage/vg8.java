package defpackage;

import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public abstract class vg8 {
    public static Object a(og8 og8Var) {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotNull(og8Var, "Task must not be null");
        if (og8Var.p()) {
            return k(og8Var);
        }
        bw9 bw9Var = new bw9(null);
        l(og8Var, bw9Var);
        bw9Var.b();
        return k(og8Var);
    }

    public static Object b(og8 og8Var, long j, TimeUnit timeUnit) {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotNull(og8Var, "Task must not be null");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        if (og8Var.p()) {
            return k(og8Var);
        }
        bw9 bw9Var = new bw9(null);
        l(og8Var, bw9Var);
        if (bw9Var.c(j, timeUnit)) {
            return k(og8Var);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static og8 c(Executor executor, Callable callable) {
        Preconditions.checkNotNull(executor, "Executor must not be null");
        Preconditions.checkNotNull(callable, "Callback must not be null");
        w1g w1gVar = new w1g();
        executor.execute(new e8g(w1gVar, callable));
        return w1gVar;
    }

    public static og8 d(Exception exc) {
        w1g w1gVar = new w1g();
        w1gVar.t(exc);
        return w1gVar;
    }

    public static og8 e(Object obj) {
        w1g w1gVar = new w1g();
        w1gVar.u(obj);
        return w1gVar;
    }

    public static og8 f(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return e(null);
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            if (((og8) it2.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        w1g w1gVar = new w1g();
        cz9 cz9Var = new cz9(collection.size(), w1gVar);
        Iterator it3 = collection.iterator();
        while (it3.hasNext()) {
            l((og8) it3.next(), cz9Var);
        }
        return w1gVar;
    }

    public static og8 g(og8... og8VarArr) {
        return (og8VarArr == null || og8VarArr.length == 0) ? e(null) : f(Arrays.asList(og8VarArr));
    }

    public static og8 h(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return e(Collections.emptyList());
        }
        return f(collection).k(tg8.a, new ws9(collection));
    }

    public static og8 i(og8... og8VarArr) {
        return (og8VarArr == null || og8VarArr.length == 0) ? e(Collections.emptyList()) : h(Arrays.asList(og8VarArr));
    }

    public static og8 j(og8 og8Var, long j, TimeUnit timeUnit) {
        Preconditions.checkNotNull(og8Var, "Task must not be null");
        Preconditions.checkArgument(j > 0, "Timeout must be positive");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        final zka zkaVar = new zka();
        final qg8 qg8Var = new qg8(zkaVar);
        final zp9 zp9Var = new zp9(Looper.getMainLooper());
        zp9Var.postDelayed(new Runnable() { // from class: h3g
            @Override // java.lang.Runnable
            public final void run() {
                qg8.this.d(new TimeoutException());
            }
        }, timeUnit.toMillis(j));
        og8Var.b(new me5() { // from class: v5g
            @Override // defpackage.me5
            public final void onComplete(og8 og8Var2) {
                zp9 zp9Var2 = zp9.this;
                qg8 qg8Var2 = qg8Var;
                zka zkaVar2 = zkaVar;
                zp9Var2.removeCallbacksAndMessages(null);
                if (og8Var2.q()) {
                    qg8Var2.e(og8Var2.m());
                } else {
                    if (og8Var2.o()) {
                        zkaVar2.b();
                        return;
                    }
                    Exception l = og8Var2.l();
                    l.getClass();
                    qg8Var2.d(l);
                }
            }
        });
        return qg8Var.a();
    }

    private static Object k(og8 og8Var) {
        if (og8Var.q()) {
            return og8Var.m();
        }
        if (og8Var.o()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(og8Var.l());
    }

    private static void l(og8 og8Var, rx9 rx9Var) {
        Executor executor = tg8.b;
        og8Var.g(executor, rx9Var);
        og8Var.e(executor, rx9Var);
        og8Var.a(executor, rx9Var);
    }
}
