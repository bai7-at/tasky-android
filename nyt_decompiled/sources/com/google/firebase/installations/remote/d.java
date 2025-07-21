package com.google.firebase.installations.remote;

import com.google.firebase.installations.h;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
class d {
    private static final long d = TimeUnit.HOURS.toMillis(24);
    private static final long e = TimeUnit.MINUTES.toMillis(30);
    private final h a = h.c();
    private long b;
    private int c;

    d() {
    }

    private synchronized long a(int i) {
        if (c(i)) {
            return (long) Math.min(Math.pow(2.0d, this.c) + this.a.e(), e);
        }
        return d;
    }

    private static boolean c(int i) {
        return i == 429 || (i >= 500 && i < 600);
    }

    private static boolean d(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    private synchronized void e() {
        this.c = 0;
    }

    public synchronized boolean b() {
        boolean z;
        if (this.c != 0) {
            z = this.a.a() > this.b;
        }
        return z;
    }

    public synchronized void f(int i) {
        if (d(i)) {
            e();
            return;
        }
        this.c++;
        this.b = this.a.a() + a(i);
    }
}
