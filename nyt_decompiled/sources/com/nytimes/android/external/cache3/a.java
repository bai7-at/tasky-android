package com.nytimes.android.external.cache3;

import com.nytimes.android.external.cache3.AbstractFuture;
import defpackage.e16;
import defpackage.i64;
import defpackage.jt2;
import defpackage.tw8;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public abstract class a {

    private static abstract class b extends AbstractFuture.g implements Runnable {
        i64 h;
        Object i;

        b(i64 i64Var, Object obj) {
            this.h = (i64) e16.d(i64Var);
            this.i = e16.d(obj);
        }

        @Override // com.nytimes.android.external.cache3.AbstractFuture
        final void m() {
            q(this.h);
            this.h = null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                i64 i64Var = this.h;
                Object obj = this.i;
                boolean z = true;
                boolean isCancelled = isCancelled() | (i64Var == null);
                if (obj != null) {
                    z = false;
                }
                if (isCancelled || z) {
                    return;
                }
                this.h = null;
                this.i = null;
                try {
                    w(obj, tw8.a(i64Var));
                } catch (CancellationException unused) {
                    cancel(false);
                } catch (ExecutionException e) {
                    u(e.getCause());
                }
            } catch (UndeclaredThrowableException e2) {
                u(e2.getCause());
            } catch (Throwable th) {
                u(th);
            }
        }

        abstract void w(Object obj, Object obj2);
    }

    private static final class c extends b {
        c(i64 i64Var, jt2 jt2Var) {
            super(i64Var, jt2Var);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.nytimes.android.external.cache3.a.b
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void w(jt2 jt2Var, Object obj) {
            t(jt2Var.apply(obj));
        }
    }

    private static class d extends e {
        private final Throwable b;

        d(Throwable th) {
            super();
            this.b = th;
        }

        @Override // com.nytimes.android.external.cache3.a.e, java.util.concurrent.Future
        public Object get() {
            throw new ExecutionException(this.b);
        }
    }

    private static abstract class e implements i64 {
        private static final Logger a = Logger.getLogger(e.class.getName());

        @Override // defpackage.i64
        public void a(Runnable runnable, Executor executor) {
            e16.e(runnable, "Runnable was null.");
            e16.e(executor, "Executor was null.");
            try {
                executor.execute(runnable);
            } catch (RuntimeException e) {
                a.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
            }
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            return false;
        }

        @Override // java.util.concurrent.Future
        public abstract Object get();

        @Override // java.util.concurrent.Future
        public Object get(long j, TimeUnit timeUnit) {
            e16.d(timeUnit);
            return get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return false;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }

        private e() {
        }
    }

    private static class f extends e {
        static final f c = new f(null);
        private final Object b;

        f(Object obj) {
            super();
            this.b = obj;
        }

        @Override // com.nytimes.android.external.cache3.a.e, java.util.concurrent.Future
        public Object get() {
            return this.b;
        }
    }

    public static i64 a(Throwable th) {
        e16.d(th);
        return new d(th);
    }

    public static i64 b(Object obj) {
        return obj == null ? f.c : new f(obj);
    }

    public static i64 c(i64 i64Var, jt2 jt2Var) {
        e16.d(jt2Var);
        c cVar = new c(i64Var, jt2Var);
        i64Var.a(cVar, DirectExecutor.INSTANCE);
        return cVar;
    }
}
