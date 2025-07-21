package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.engine.m;
import defpackage.cz6;
import defpackage.ov3;
import defpackage.z06;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
final class a {
    private final boolean a;
    private final Executor b;
    final Map c;
    private final ReferenceQueue d;
    private m.a e;
    private volatile boolean f;

    /* renamed from: com.bumptech.glide.load.engine.a$a, reason: collision with other inner class name */
    class ThreadFactoryC0148a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        class RunnableC0149a implements Runnable {
            final /* synthetic */ Runnable a;

            RunnableC0149a(Runnable runnable) {
                this.a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.a.run();
            }
        }

        ThreadFactoryC0148a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0149a(runnable), "glide-active-resources");
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    static final class c extends WeakReference {
        final ov3 a;
        final boolean b;
        cz6 c;

        c(ov3 ov3Var, m mVar, ReferenceQueue referenceQueue, boolean z) {
            super(mVar, referenceQueue);
            this.a = (ov3) z06.d(ov3Var);
            this.c = (mVar.f() && z) ? (cz6) z06.d(mVar.e()) : null;
            this.b = mVar.f();
        }

        void a() {
            this.c = null;
            clear();
        }
    }

    a(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new ThreadFactoryC0148a()));
    }

    synchronized void a(ov3 ov3Var, m mVar) {
        c cVar = (c) this.c.put(ov3Var, new c(ov3Var, mVar, this.d, this.a));
        if (cVar != null) {
            cVar.a();
        }
    }

    void b() {
        while (!this.f) {
            try {
                c((c) this.d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    void c(c cVar) {
        cz6 cz6Var;
        synchronized (this) {
            this.c.remove(cVar.a);
            if (cVar.b && (cz6Var = cVar.c) != null) {
                this.e.a(cVar.a, new m(cz6Var, true, false, cVar.a, this.e));
            }
        }
    }

    synchronized void d(ov3 ov3Var) {
        c cVar = (c) this.c.remove(ov3Var);
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    synchronized m e(ov3 ov3Var) {
        c cVar = (c) this.c.get(ov3Var);
        if (cVar == null) {
            return null;
        }
        m mVar = (m) cVar.get();
        if (mVar == null) {
            c(cVar);
        }
        return mVar;
    }

    void f(m.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.e = aVar;
            }
        }
    }

    a(boolean z, Executor executor) {
        this.c = new HashMap();
        this.d = new ReferenceQueue();
        this.a = z;
        this.b = executor;
        executor.execute(new b());
    }
}
