package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.p8b;

/* loaded from: classes3.dex */
abstract class n {
    private static volatile Handler d;
    private final w5 a;
    private final Runnable b;
    private volatile long c;

    n(w5 w5Var) {
        Preconditions.checkNotNull(w5Var);
        this.a = w5Var;
        this.b = new m(this, w5Var);
    }

    private final Handler f() {
        Handler handler;
        if (d != null) {
            return d;
        }
        synchronized (n.class) {
            try {
                if (d == null) {
                    d = new p8b(this.a.zzau().getMainLooper());
                }
                handler = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    final void b() {
        this.c = 0L;
        f().removeCallbacks(this.b);
    }

    public abstract void c();

    public final void d(long j) {
        b();
        if (j >= 0) {
            this.c = this.a.p().currentTimeMillis();
            if (f().postDelayed(this.b, j)) {
                return;
            }
            this.a.o().n().b("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public final boolean e() {
        return this.c != 0;
    }
}
