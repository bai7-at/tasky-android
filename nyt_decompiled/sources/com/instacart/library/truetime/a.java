package com.instacart.library.truetime;

import android.os.SystemClock;
import defpackage.hg0;

/* loaded from: classes3.dex */
class a {
    private static final String b = "a";
    private hg0 a = null;

    a() {
    }

    private boolean b() {
        if (this.a != null) {
            return false;
        }
        c.d(b, "Cannot use disk caching strategy for TrueTime. CacheInterface unavailable");
        return true;
    }

    void a(b bVar) {
        if (b()) {
            return;
        }
        long d = bVar.d();
        long c = bVar.c();
        long j = d - c;
        c.a(b, String.format("Caching true time info to disk sntp [%s] device [%s] boot [%s]", Long.valueOf(d), Long.valueOf(c), Long.valueOf(j)));
        this.a.a("com.instacart.library.truetime.cached_boot_time", j);
        this.a.a("com.instacart.library.truetime.cached_device_uptime", c);
        this.a.a("com.instacart.library.truetime.cached_sntp_time", d);
    }

    void c() {
        d(this.a);
    }

    void d(hg0 hg0Var) {
        if (hg0Var != null) {
            hg0Var.clear();
        }
    }

    void e(hg0 hg0Var) {
        this.a = hg0Var;
    }

    long f() {
        if (b()) {
            return 0L;
        }
        return this.a.get("com.instacart.library.truetime.cached_device_uptime", 0L);
    }

    long g() {
        if (b()) {
            return 0L;
        }
        return this.a.get("com.instacart.library.truetime.cached_sntp_time", 0L);
    }

    boolean h() {
        if (b() || this.a.get("com.instacart.library.truetime.cached_boot_time", 0L) == 0) {
            return false;
        }
        boolean z = SystemClock.elapsedRealtime() < f();
        c.b(b, "---- boot time changed " + z);
        return !z;
    }
}
