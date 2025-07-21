package com.nytimes.android.performancewatcher.thread;

import android.os.Handler;
import android.os.Looper;
import com.nytimes.android.performancewatcher.thread.ThreadWatcher;
import defpackage.qs2;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zk8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class a implements Runnable {
    private final qs2 a;
    private final ThreadWatcher.Config b;
    private boolean c;
    private boolean d;

    public a(qs2 qs2Var, ThreadWatcher.Config config) {
        zq3.h(qs2Var, "threadLooper");
        zq3.h(config, "config");
        this.a = qs2Var;
        this.b = config;
        this.d = true;
    }

    private final synchronized void a() {
        if (this.c) {
            Thread.sleep(this.b.a());
            if (this.c) {
                c(false);
                throw new InterruptedException();
            }
        }
    }

    private final void d(Runnable runnable) {
        zq3.f(runnable, "null cannot be cast to non-null type java.lang.Object");
        runnable.wait();
    }

    private final void e(Runnable runnable, long j) {
        zq3.f(runnable, "null cannot be cast to non-null type java.lang.Object");
        runnable.wait(j);
    }

    public final synchronized boolean b() {
        return this.d;
    }

    public final synchronized void c(boolean z) {
        try {
            if (((Boolean) this.b.c().mo865invoke()).booleanValue() && z) {
                ul8.a.a("BlockedThreadDetector - Requesting stop...", new Object[0]);
            }
            this.c = z;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (((Boolean) this.b.c().mo865invoke()).booleanValue()) {
            ul8.a.a("BlockedThreadDetector - Start", new Object[0]);
        }
        this.d = false;
        Looper looper = (Looper) this.a.mo865invoke();
        Handler handler = new Handler(looper);
        while (!Thread.interrupted()) {
            try {
                zk8 zk8Var = new zk8();
                synchronized (zk8Var) {
                    try {
                        if (((Boolean) this.b.c().mo865invoke()).booleanValue()) {
                            ul8.a.a("Thread - Ping", new Object[0]);
                        }
                        handler.post(zk8Var);
                        e(zk8Var, this.b.b());
                        if (!zk8Var.b()) {
                            Thread thread = looper.getThread();
                            zq3.g(thread, "getThread(...)");
                            UnresponsiveThreadException unresponsiveThreadException = new UnresponsiveThreadException(thread);
                            if (((Boolean) this.b.c().mo865invoke()).booleanValue()) {
                                ul8.a.e(unresponsiveThreadException);
                            }
                            ThreadWatcher.Companion.b(unresponsiveThreadException);
                            d(zk8Var);
                            if (((Boolean) this.b.c().mo865invoke()).booleanValue()) {
                                ul8.a.u("Thread - BLOCK - " + zk8Var.a() + "ms", new Object[0]);
                            }
                        } else if (((Boolean) this.b.c().mo865invoke()).booleanValue()) {
                            ul8.a.a("Thread - ACK - " + zk8Var.a() + "ms", new Object[0]);
                        }
                        ww8 ww8Var = ww8.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                a();
                Thread.sleep(this.b.a());
            } catch (InterruptedException unused) {
                if (((Boolean) this.b.c().mo865invoke()).booleanValue()) {
                    ul8.a.a("BlockedThreadDetector - requestStop success", new Object[0]);
                }
            }
        }
        this.d = true;
        if (((Boolean) this.b.c().mo865invoke()).booleanValue()) {
            ul8.a.a("BlockedThreadDetector - Stopped", new Object[0]);
        }
    }
}
