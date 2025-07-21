package com.google.android.exoplayer2.source.rtsp;

import android.os.SystemClock;
import defpackage.a47;
import defpackage.a82;
import defpackage.e06;
import defpackage.ei7;
import defpackage.ej1;
import defpackage.ur;
import defpackage.y72;
import defpackage.yo5;
import defpackage.z37;
import defpackage.z72;

/* loaded from: classes2.dex */
final class e implements y72 {
    private final a47 a;
    private final int d;
    private a82 g;
    private boolean h;
    private boolean k;
    private final yo5 b = new yo5(65507);
    private final yo5 c = new yo5();
    private final Object e = new Object();
    private final g f = new g();
    private volatile long i = -9223372036854775807L;
    private volatile int j = -1;
    private long l = -9223372036854775807L;
    private long m = -9223372036854775807L;

    public e(h hVar, int i) {
        this.d = i;
        this.a = (a47) ur.e(new ej1().a(hVar));
    }

    private static long b(long j) {
        return j - 30;
    }

    @Override // defpackage.y72
    public void a(long j, long j2) {
        synchronized (this.e) {
            try {
                if (!this.k) {
                    this.k = true;
                }
                this.l = j;
                this.m = j2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.y72
    public void c(a82 a82Var) {
        this.a.b(a82Var, this.d);
        a82Var.s();
        a82Var.p(new ei7.b(-9223372036854775807L));
        this.g = a82Var;
    }

    @Override // defpackage.y72
    public int d(z72 z72Var, e06 e06Var) {
        ur.e(this.g);
        int read = z72Var.read(this.b.e(), 0, 65507);
        if (read == -1) {
            return -1;
        }
        if (read == 0) {
            return 0;
        }
        this.b.U(0);
        this.b.T(read);
        z37 d = z37.d(this.b);
        if (d == null) {
            return 0;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long b = b(elapsedRealtime);
        this.f.e(d, elapsedRealtime);
        z37 f = this.f.f(b);
        if (f == null) {
            return 0;
        }
        if (!this.h) {
            if (this.i == -9223372036854775807L) {
                this.i = f.h;
            }
            if (this.j == -1) {
                this.j = f.g;
            }
            this.a.c(this.i, this.j);
            this.h = true;
        }
        synchronized (this.e) {
            try {
                if (!this.k) {
                    do {
                        this.c.R(f.k);
                        this.a.d(this.c, f.h, f.g, f.e);
                        f = this.f.f(b);
                    } while (f != null);
                } else if (this.l != -9223372036854775807L && this.m != -9223372036854775807L) {
                    this.f.g();
                    this.a.a(this.l, this.m);
                    this.k = false;
                    this.l = -9223372036854775807L;
                    this.m = -9223372036854775807L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    @Override // defpackage.y72
    public boolean e(z72 z72Var) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    public boolean f() {
        return this.h;
    }

    public void g() {
        synchronized (this.e) {
            this.k = true;
        }
    }

    public void h(int i) {
        this.j = i;
    }

    public void i(long j) {
        this.i = j;
    }

    @Override // defpackage.y72
    public void release() {
    }
}
