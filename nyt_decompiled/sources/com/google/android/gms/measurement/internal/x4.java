package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* loaded from: classes3.dex */
final class x4 extends Thread {
    private final Object a;
    private final BlockingQueue b;
    private boolean c = false;
    final /* synthetic */ y4 d;

    public x4(y4 y4Var, String str, BlockingQueue blockingQueue) {
        this.d = y4Var;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.a = new Object();
        this.b = blockingQueue;
        setName(str);
    }

    private final void b() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        x4 x4Var;
        x4 x4Var2;
        obj = this.d.i;
        synchronized (obj) {
            try {
                if (!this.c) {
                    semaphore = this.d.j;
                    semaphore.release();
                    obj2 = this.d.i;
                    obj2.notifyAll();
                    y4 y4Var = this.d;
                    x4Var = y4Var.c;
                    if (this == x4Var) {
                        y4Var.c = null;
                    } else {
                        x4Var2 = y4Var.d;
                        if (this == x4Var2) {
                            y4Var.d = null;
                        } else {
                            y4Var.a.o().n().a("Current scheduler thread is neither worker nor network");
                        }
                    }
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c(InterruptedException interruptedException) {
        this.d.a.o().v().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public final void a() {
        synchronized (this.a) {
            this.a.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        Object obj;
        boolean z = false;
        while (!z) {
            try {
                semaphore = this.d.j;
                semaphore.acquire();
                z = true;
            } catch (InterruptedException e) {
                c(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                w4 w4Var = (w4) this.b.poll();
                if (w4Var != null) {
                    Process.setThreadPriority(true != w4Var.b ? 10 : threadPriority);
                    w4Var.run();
                } else {
                    synchronized (this.a) {
                        if (this.b.peek() == null) {
                            y4.A(this.d);
                            try {
                                this.a.wait(30000L);
                            } catch (InterruptedException e2) {
                                c(e2);
                            }
                        }
                    }
                    obj = this.d.i;
                    synchronized (obj) {
                        try {
                            if (this.b.peek() == null) {
                                break;
                            }
                        } finally {
                        }
                    }
                }
            }
            if (this.d.a.y().A(null, m3.h0)) {
                b();
            }
            b();
        } catch (Throwable th) {
            b();
            throw th;
        }
    }
}
