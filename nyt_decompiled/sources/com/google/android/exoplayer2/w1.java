package com.google.android.exoplayer2;

import android.os.Looper;
import defpackage.ur;
import defpackage.vl0;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class w1 {
    private final b a;
    private final a b;
    private final vl0 c;
    private final g2 d;
    private int e;
    private Object f;
    private Looper g;
    private int h;
    private long i = -9223372036854775807L;
    private boolean j = true;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;

    public interface a {
        void d(w1 w1Var);
    }

    public interface b {
        void s(int i, Object obj);
    }

    public w1(a aVar, b bVar, g2 g2Var, int i, vl0 vl0Var, Looper looper) {
        this.b = aVar;
        this.a = bVar;
        this.d = g2Var;
        this.g = looper;
        this.c = vl0Var;
        this.h = i;
    }

    public synchronized boolean a(long j) {
        boolean z;
        try {
            ur.g(this.k);
            ur.g(this.g.getThread() != Thread.currentThread());
            long elapsedRealtime = this.c.elapsedRealtime() + j;
            while (true) {
                z = this.m;
                if (z || j <= 0) {
                    break;
                }
                this.c.c();
                wait(j);
                j = elapsedRealtime - this.c.elapsedRealtime();
            }
            if (!z) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.l;
    }

    public boolean b() {
        return this.j;
    }

    public Looper c() {
        return this.g;
    }

    public int d() {
        return this.h;
    }

    public Object e() {
        return this.f;
    }

    public long f() {
        return this.i;
    }

    public b g() {
        return this.a;
    }

    public g2 h() {
        return this.d;
    }

    public int i() {
        return this.e;
    }

    public synchronized boolean j() {
        return this.n;
    }

    public synchronized void k(boolean z) {
        this.l = z | this.l;
        this.m = true;
        notifyAll();
    }

    public w1 l() {
        ur.g(!this.k);
        if (this.i == -9223372036854775807L) {
            ur.a(this.j);
        }
        this.k = true;
        this.b.d(this);
        return this;
    }

    public w1 m(Object obj) {
        ur.g(!this.k);
        this.f = obj;
        return this;
    }

    public w1 n(int i) {
        ur.g(!this.k);
        this.e = i;
        return this;
    }
}
