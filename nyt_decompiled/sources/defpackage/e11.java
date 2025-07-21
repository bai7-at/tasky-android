package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class e11 {
    private final Executor a;
    private og8 b = vg8.e(null);
    private final Object c = new Object();
    private final ThreadLocal d = new ThreadLocal();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e11.this.d.set(Boolean.TRUE);
        }
    }

    class b implements Callable {
        final /* synthetic */ Runnable a;

        b(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            this.a.run();
            return null;
        }
    }

    class c implements cy0 {
        final /* synthetic */ Callable a;

        c(Callable callable) {
            this.a = callable;
        }

        @Override // defpackage.cy0
        public Object then(og8 og8Var) {
            return this.a.call();
        }
    }

    class d implements cy0 {
        d() {
        }

        @Override // defpackage.cy0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void then(og8 og8Var) {
            return null;
        }
    }

    public e11(Executor executor) {
        this.a = executor;
        executor.execute(new a());
    }

    private og8 d(og8 og8Var) {
        return og8Var.i(this.a, new d());
    }

    private boolean e() {
        return Boolean.TRUE.equals(this.d.get());
    }

    private cy0 f(Callable callable) {
        return new c(callable);
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor c() {
        return this.a;
    }

    og8 g(Runnable runnable) {
        return h(new b(runnable));
    }

    public og8 h(Callable callable) {
        og8 i;
        synchronized (this.c) {
            i = this.b.i(this.a, f(callable));
            this.b = d(i);
        }
        return i;
    }

    public og8 i(Callable callable) {
        og8 k;
        synchronized (this.c) {
            k = this.b.k(this.a, f(callable));
            this.b = d(k);
        }
        return k;
    }
}
