package defpackage;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
public final class u0e {
    private final Clock a;
    private final Object b = new Object();
    private volatile int d = 1;
    private volatile long c = 0;

    public u0e(Clock clock) {
        this.a = clock;
    }

    private final void e() {
        long currentTimeMillis = this.a.currentTimeMillis();
        synchronized (this.b) {
            try {
                if (this.d == 3) {
                    if (this.c + ((Long) pla.c().a(mpa.X5)).longValue() <= currentTimeMillis) {
                        this.d = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void f(int i, int i2) {
        e();
        Object obj = this.b;
        long currentTimeMillis = this.a.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.d != i) {
                    return;
                }
                this.d = i2;
                if (this.d == 3) {
                    this.c = currentTimeMillis;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        f(2, 3);
    }

    public final void b(boolean z) {
        if (z) {
            f(1, 2);
        } else {
            f(2, 1);
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.b) {
            e();
            z = this.d == 3;
        }
        return z;
    }

    public final boolean d() {
        boolean z;
        synchronized (this.b) {
            e();
            z = this.d == 2;
        }
        return z;
    }
}
