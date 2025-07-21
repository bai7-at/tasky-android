package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes3.dex */
abstract class zzgew extends AtomicReference implements Runnable {
    private static final Runnable a = new ec(null);
    private static final Runnable b = new ec(null);

    zzgew() {
    }

    private final void c(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzget zzgetVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof zzget)) {
                if (runnable != b) {
                    break;
                }
            } else {
                zzgetVar = (zzget) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(zzgetVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    abstract Object a();

    abstract String b();

    abstract void d(Throwable th);

    abstract void e(Object obj);

    abstract boolean f();

    final void g() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzget zzgetVar = new zzget(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, zzgetVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(a)) == b) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(a)) == b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean f = f();
            if (!f) {
                try {
                    obj = a();
                } catch (Throwable th) {
                    try {
                        mc.a(th);
                        if (!compareAndSet(currentThread, a)) {
                            c(currentThread);
                        }
                        d(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, a)) {
                            c(currentThread);
                        }
                        e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, a)) {
                c(currentThread);
            }
            if (f) {
                return;
            }
            e(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == a) {
            str = "running=[DONE]";
        } else if (runnable instanceof zzget) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + b();
    }
}
