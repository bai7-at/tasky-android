package androidx.concurrent.futures;

import defpackage.j64;
import defpackage.zy6;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class CallbackToFutureAdapter {

    static final class FutureGarbageCollectedException extends Throwable {
        FutureGarbageCollectedException(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public static final class a {
        Object a;
        c b;
        private zy6 c = zy6.r();
        private boolean d;

        a() {
        }

        private void e() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        public void a(Runnable runnable, Executor executor) {
            zy6 zy6Var = this.c;
            if (zy6Var != null) {
                zy6Var.a(runnable, executor);
            }
        }

        void b() {
            this.a = null;
            this.b = null;
            this.c.o(null);
        }

        public boolean c(Object obj) {
            this.d = true;
            c cVar = this.b;
            boolean z = cVar != null && cVar.c(obj);
            if (z) {
                e();
            }
            return z;
        }

        public boolean d() {
            this.d = true;
            c cVar = this.b;
            boolean z = cVar != null && cVar.b(true);
            if (z) {
                e();
            }
            return z;
        }

        public boolean f(Throwable th) {
            this.d = true;
            c cVar = this.b;
            boolean z = cVar != null && cVar.d(th);
            if (z) {
                e();
            }
            return z;
        }

        protected void finalize() {
            zy6 zy6Var;
            c cVar = this.b;
            if (cVar != null && !cVar.isDone()) {
                cVar.d(new FutureGarbageCollectedException("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a));
            }
            if (this.d || (zy6Var = this.c) == null) {
                return;
            }
            zy6Var.o(null);
        }
    }

    public interface b {
        Object a(a aVar);
    }

    private static final class c implements j64 {
        final WeakReference a;
        private final AbstractResolvableFuture b = new a();

        class a extends AbstractResolvableFuture {
            a() {
            }

            @Override // androidx.concurrent.futures.AbstractResolvableFuture
            protected String l() {
                a aVar = (a) c.this.a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.a + "]";
            }
        }

        c(a aVar) {
            this.a = new WeakReference(aVar);
        }

        @Override // defpackage.j64
        public void a(Runnable runnable, Executor executor) {
            this.b.a(runnable, executor);
        }

        boolean b(boolean z) {
            return this.b.cancel(z);
        }

        boolean c(Object obj) {
            return this.b.o(obj);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            a aVar = (a) this.a.get();
            boolean cancel = this.b.cancel(z);
            if (cancel && aVar != null) {
                aVar.b();
            }
            return cancel;
        }

        boolean d(Throwable th) {
            return this.b.p(th);
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.b.isDone();
        }

        public String toString() {
            return this.b.toString();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j, TimeUnit timeUnit) {
            return this.b.get(j, timeUnit);
        }
    }

    public static j64 a(b bVar) {
        a aVar = new a();
        c cVar = new c(aVar);
        aVar.b = cVar;
        aVar.a = bVar.getClass();
        try {
            Object a2 = bVar.a(aVar);
            if (a2 != null) {
                aVar.a = a2;
            }
        } catch (Exception e) {
            cVar.d(e);
        }
        return cVar;
    }
}
