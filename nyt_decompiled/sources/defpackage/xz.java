package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class xz {
    public static final a m = new a(null);
    public tc8 a;
    private final Handler b;
    private Runnable c;
    private final Object d;
    private long e;
    private final Executor f;
    private int g;
    private long h;
    private sc8 i;
    private boolean j;
    private final Runnable k;
    private final Runnable l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public xz(long j, TimeUnit timeUnit, Executor executor) {
        zq3.h(timeUnit, "autoCloseTimeUnit");
        zq3.h(executor, "autoCloseExecutor");
        this.b = new Handler(Looper.getMainLooper());
        this.d = new Object();
        this.e = timeUnit.toMillis(j);
        this.f = executor;
        this.h = SystemClock.uptimeMillis();
        this.k = new Runnable() { // from class: vz
            @Override // java.lang.Runnable
            public final void run() {
                xz.f(xz.this);
            }
        };
        this.l = new Runnable() { // from class: wz
            @Override // java.lang.Runnable
            public final void run() {
                xz.c(xz.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(xz xzVar) {
        ww8 ww8Var;
        zq3.h(xzVar, "this$0");
        synchronized (xzVar.d) {
            try {
                if (SystemClock.uptimeMillis() - xzVar.h < xzVar.e) {
                    return;
                }
                if (xzVar.g != 0) {
                    return;
                }
                Runnable runnable = xzVar.c;
                if (runnable != null) {
                    runnable.run();
                    ww8Var = ww8.a;
                } else {
                    ww8Var = null;
                }
                if (ww8Var == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                sc8 sc8Var = xzVar.i;
                if (sc8Var != null && sc8Var.isOpen()) {
                    sc8Var.close();
                }
                xzVar.i = null;
                ww8 ww8Var2 = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(xz xzVar) {
        zq3.h(xzVar, "this$0");
        xzVar.f.execute(xzVar.l);
    }

    public final void d() {
        synchronized (this.d) {
            try {
                this.j = true;
                sc8 sc8Var = this.i;
                if (sc8Var != null) {
                    sc8Var.close();
                }
                this.i = null;
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.d) {
            try {
                int i = this.g;
                if (i <= 0) {
                    throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
                }
                int i2 = i - 1;
                this.g = i2;
                if (i2 == 0) {
                    if (this.i == null) {
                        return;
                    } else {
                        this.b.postDelayed(this.k, this.e);
                    }
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object g(ss2 ss2Var) {
        zq3.h(ss2Var, "block");
        try {
            return ss2Var.invoke(j());
        } finally {
            e();
        }
    }

    public final sc8 h() {
        return this.i;
    }

    public final tc8 i() {
        tc8 tc8Var = this.a;
        if (tc8Var != null) {
            return tc8Var;
        }
        zq3.z("delegateOpenHelper");
        return null;
    }

    public final sc8 j() {
        synchronized (this.d) {
            this.b.removeCallbacks(this.k);
            this.g++;
            if (this.j) {
                throw new IllegalStateException("Attempting to open already closed database.");
            }
            sc8 sc8Var = this.i;
            if (sc8Var != null && sc8Var.isOpen()) {
                return sc8Var;
            }
            sc8 o = i().o();
            this.i = o;
            return o;
        }
    }

    public final void k(tc8 tc8Var) {
        zq3.h(tc8Var, "delegateOpenHelper");
        n(tc8Var);
    }

    public final boolean l() {
        return !this.j;
    }

    public final void m(Runnable runnable) {
        zq3.h(runnable, "onAutoClose");
        this.c = runnable;
    }

    public final void n(tc8 tc8Var) {
        zq3.h(tc8Var, "<set-?>");
        this.a = tc8Var;
    }
}
