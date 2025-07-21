package com.instacart.library.truetime;

import android.os.SystemClock;
import com.comscore.util.log.LogLevel;
import defpackage.hg0;
import java.util.Date;

/* loaded from: classes3.dex */
public class d {
    private static final String b = "d";
    private static final d c = new d();
    private static final a d = new a();
    private static final b e = new b();
    private static float f = 100.0f;
    private static float g = 100.0f;
    private static int h = 750;
    private static int i = LogLevel.NONE;
    private String a = "1.us.pool.ntp.org";

    private static long a() {
        b bVar = e;
        long c2 = bVar.k() ? bVar.c() : d.f();
        if (c2 != 0) {
            return c2;
        }
        throw new RuntimeException("expected device time from last boot to be cached. couldn't find it.");
    }

    private static long b() {
        b bVar = e;
        long d2 = bVar.k() ? bVar.d() : d.g();
        if (d2 != 0) {
            return d2;
        }
        throw new RuntimeException("expected SNTP time from last boot to be cached. couldn't find it.");
    }

    public static d c() {
        return c;
    }

    public static void d() {
        d.c();
    }

    public static boolean g() {
        return e.k() || d.h();
    }

    public static Date h() {
        if (!g()) {
            throw new IllegalStateException("You need to call init() on TrueTime at least once.");
        }
        return new Date(b() + (SystemClock.elapsedRealtime() - a()));
    }

    static synchronized void j() {
        synchronized (d.class) {
            b bVar = e;
            if (bVar.k()) {
                d.a(bVar);
            } else {
                c.b(b, "---- SNTP client not available. not caching TrueTime info in disk");
            }
        }
    }

    public void e() {
        f(this.a);
    }

    protected void f(String str) {
        if (g()) {
            c.b(b, "---- TrueTime already initialized from previous boot/init");
        } else {
            i(str);
            j();
        }
    }

    long[] i(String str) {
        return e.h(str, f, g, h, i);
    }

    public synchronized d k(int i2) {
        i = i2;
        return c;
    }

    public synchronized d l(hg0 hg0Var) {
        d.e(hg0Var);
        return c;
    }

    public synchronized d m(boolean z) {
        c.c(z);
        return c;
    }

    public synchronized d n(String str) {
        this.a = str;
        return c;
    }
}
