package com.lyft.kronos.internal.ntp;

import com.lyft.kronos.internal.ntp.SntpClient;
import defpackage.bx7;
import defpackage.cx7;
import defpackage.kd8;
import defpackage.vx3;
import defpackage.xl0;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class SntpServiceImpl implements cx7 {
    private final AtomicReference a;
    private final AtomicLong b;
    private final ExecutorService c;
    private final SntpClient d;
    private final xl0 e;
    private final bx7 f;
    private final kd8 g;
    private final List h;
    private final long i;
    private final long j;
    private final long k;
    private final long l;

    private enum State {
        IDLE,
        SYNCING,
        STOPPED
    }

    static final class a implements ThreadFactory {
        public static final a a = new a();

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "kronos-android");
        }
    }

    static final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SntpServiceImpl.this.f();
        }
    }

    public SntpServiceImpl(SntpClient sntpClient, xl0 xl0Var, bx7 bx7Var, kd8 kd8Var, List list, long j, long j2, long j3, long j4) {
        zq3.h(sntpClient, "sntpClient");
        zq3.h(xl0Var, "deviceClock");
        zq3.h(bx7Var, "responseCache");
        zq3.h(list, "ntpHosts");
        this.d = sntpClient;
        this.e = xl0Var;
        this.f = bx7Var;
        this.g = kd8Var;
        this.h = list;
        this.i = j;
        this.j = j2;
        this.k = j3;
        this.l = j4;
        this.a = new AtomicReference(State.IDLE);
        this.b = new AtomicLong(0L);
        this.c = Executors.newSingleThreadExecutor(a.a);
    }

    private final void c() {
        if (((State) this.a.get()) == State.STOPPED) {
            throw new IllegalStateException("Service already shutdown");
        }
    }

    private final long d() {
        return this.e.c() - this.b.get();
    }

    private final SntpClient.a e() {
        SntpClient.a aVar = this.f.get();
        if (((State) this.a.get()) != State.IDLE || aVar == null || aVar.f()) {
            return aVar;
        }
        this.f.clear();
        return null;
    }

    private final boolean g(String str) {
        AtomicReference atomicReference = this.a;
        State state = State.SYNCING;
        if (((State) atomicReference.getAndSet(state)) == state) {
            return false;
        }
        long c = this.e.c();
        kd8 kd8Var = this.g;
        if (kd8Var != null) {
            kd8Var.a(str);
        }
        try {
            SntpClient.a d = this.d.d(str, Long.valueOf(this.i));
            zq3.g(d, "response");
            if (d.a() < 0) {
                throw new NTPSyncException("Invalid time " + d.a() + " received from " + str);
            }
            long c2 = this.e.c() - c;
            if (c2 <= this.l) {
                this.f.a(d);
                long d2 = d.d();
                kd8 kd8Var2 = this.g;
                if (kd8Var2 != null) {
                    kd8Var2.c(d2, c2);
                }
                this.a.set(State.IDLE);
                this.b.set(this.e.c());
                return true;
            }
            throw new NTPSyncException("Ignoring response from " + str + " because the network latency (" + c2 + " ms) is longer than the required value (" + this.l + " ms");
        } catch (Throwable th) {
            try {
                kd8 kd8Var3 = this.g;
                if (kd8Var3 != null) {
                    kd8Var3.b(str, th);
                }
                return false;
            } finally {
                this.a.set(State.IDLE);
                this.b.set(this.e.c());
            }
        }
    }

    @Override // defpackage.cx7
    public void a() {
        c();
        if (((State) this.a.get()) != State.SYNCING) {
            this.c.submit(new b());
        }
    }

    @Override // defpackage.cx7
    public vx3 b() {
        c();
        SntpClient.a e = e();
        if (e == null) {
            if (d() < this.j) {
                return null;
            }
            a();
            return null;
        }
        long e2 = e.e();
        if (e2 >= this.k && d() >= this.j) {
            a();
        }
        return new vx3(e.a(), Long.valueOf(e2));
    }

    public boolean f() {
        c();
        Iterator it2 = this.h.iterator();
        while (it2.hasNext()) {
            if (g((String) it2.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cx7
    public void shutdown() {
        c();
        this.a.set(State.STOPPED);
        this.c.shutdown();
    }
}
