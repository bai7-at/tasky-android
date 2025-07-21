package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class y4 extends v5 {
    private static final AtomicLong l = new AtomicLong(Long.MIN_VALUE);
    private x4 c;
    private x4 d;
    private final PriorityBlockingQueue e;
    private final BlockingQueue f;
    private final Thread.UncaughtExceptionHandler g;
    private final Thread.UncaughtExceptionHandler h;
    private final Object i;
    private final Semaphore j;
    private volatile boolean k;

    y4(a5 a5Var) {
        super(a5Var);
        this.i = new Object();
        this.j = new Semaphore(2);
        this.e = new PriorityBlockingQueue();
        this.f = new LinkedBlockingQueue();
        this.g = new v4(this, "Thread death: Uncaught exception on worker thread");
        this.h = new v4(this, "Thread death: Uncaught exception on network thread");
    }

    static /* bridge */ /* synthetic */ boolean A(y4 y4Var) {
        boolean z = y4Var.k;
        return false;
    }

    private final void C(w4 w4Var) {
        synchronized (this.i) {
            try {
                this.e.add(w4Var);
                x4 x4Var = this.c;
                if (x4Var == null) {
                    x4 x4Var2 = new x4(this, "Measurement Worker", this.e);
                    this.c = x4Var2;
                    x4Var2.setUncaughtExceptionHandler(this.g);
                    this.c.start();
                } else {
                    x4Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean B() {
        return Thread.currentThread() == this.c;
    }

    @Override // com.google.android.gms.measurement.internal.u5
    public final void b() {
        if (Thread.currentThread() != this.d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.u5
    public final void c() {
        if (Thread.currentThread() != this.c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.v5
    protected final boolean f() {
        return false;
    }

    final Object n(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.a.e().y(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                this.a.o().v().a("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.a.o().v().a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final Future r(Callable callable) {
        g();
        Preconditions.checkNotNull(callable);
        w4 w4Var = new w4(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            if (!this.e.isEmpty()) {
                this.a.o().v().a("Callable skipped the worker queue.");
            }
            w4Var.run();
        } else {
            C(w4Var);
        }
        return w4Var;
    }

    public final Future s(Callable callable) {
        g();
        Preconditions.checkNotNull(callable);
        w4 w4Var = new w4(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            w4Var.run();
        } else {
            C(w4Var);
        }
        return w4Var;
    }

    public final void x(Runnable runnable) {
        g();
        Preconditions.checkNotNull(runnable);
        w4 w4Var = new w4(this, runnable, false, "Task exception on network thread");
        synchronized (this.i) {
            try {
                this.f.add(w4Var);
                x4 x4Var = this.d;
                if (x4Var == null) {
                    x4 x4Var2 = new x4(this, "Measurement Network", this.f);
                    this.d = x4Var2;
                    x4Var2.setUncaughtExceptionHandler(this.h);
                    this.d.start();
                } else {
                    x4Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(Runnable runnable) {
        g();
        Preconditions.checkNotNull(runnable);
        C(new w4(this, runnable, false, "Task exception on worker thread"));
    }

    public final void z(Runnable runnable) {
        g();
        Preconditions.checkNotNull(runnable);
        C(new w4(this, runnable, true, "Task exception on worker thread"));
    }
}
