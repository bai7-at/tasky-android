package com.comscore.android.task;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
class a implements Runnable {
    private AtomicBoolean a;
    private AtomicBoolean b;
    private Runnable c;
    private long d;
    private long e;
    private long f;
    private boolean g;
    private boolean h;
    private Exception i;

    a(Runnable runnable) {
        this(runnable, 0L);
    }

    long a() {
        return this.e;
    }

    Exception b() {
        return this.i;
    }

    long c() {
        return this.d;
    }

    long d() {
        long currentTimeMillis = this.d - System.currentTimeMillis();
        if (currentTimeMillis > 0) {
            return currentTimeMillis;
        }
        return 0L;
    }

    long e() {
        return this.f;
    }

    Runnable f() {
        return this.c;
    }

    boolean g() {
        return this.h;
    }

    boolean h() {
        return this.g;
    }

    boolean i() {
        return this.b.get();
    }

    boolean j() {
        return this.f > 0;
    }

    boolean k() {
        return this.a.get();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.set(true);
        try {
            this.c.run();
        } catch (Exception e) {
            this.i = e;
        }
        this.a.set(false);
        this.b.set(true);
    }

    a(Runnable runnable, long j) {
        this(runnable, j, 0L);
    }

    a(Runnable runnable, long j, long j2) {
        this(runnable, j, j2, true);
    }

    a(Runnable runnable, long j, long j2, boolean z) {
        this.c = runnable;
        this.d = System.currentTimeMillis() + (j <= 0 ? 0L : j);
        this.g = j > 0;
        this.e = System.currentTimeMillis();
        this.f = j2;
        this.a = new AtomicBoolean();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.b = atomicBoolean;
        atomicBoolean.set(false);
        this.a.set(false);
        this.i = null;
        this.h = z;
    }
}
