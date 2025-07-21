package defpackage;

import android.content.Context;
import android.view.Display;
import android.view.Surface;

/* loaded from: classes3.dex */
public final class ls9 {
    private final er9 a = new er9();
    private final ds9 b;
    private final js9 c;
    private boolean d;
    private Surface e;
    private float f;
    private float g;
    private float h;
    private float i;
    private int j;
    private long k;
    private long l;
    private long m;
    private long n;
    private long o;
    private long p;
    private long q;

    public ls9(Context context) {
        ds9 ds9Var;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            int i = khe.a;
            ds9Var = hs9.b(applicationContext);
            if (ds9Var == null) {
                ds9Var = fs9.b(applicationContext);
            }
        } else {
            ds9Var = null;
        }
        this.b = ds9Var;
        this.c = ds9Var != null ? js9.a() : null;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public static /* synthetic */ void b(ls9 ls9Var, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            ls9Var.k = refreshRate;
            ls9Var.l = (refreshRate * 80) / 100;
        } else {
            ezd.f("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            ls9Var.k = -9223372036854775807L;
            ls9Var.l = -9223372036854775807L;
        }
    }

    private final void k() {
        Surface surface;
        if (khe.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == 0.0f) {
            return;
        }
        this.h = 0.0f;
        bs9.a(surface, 0.0f);
    }

    private final void l() {
        this.m = 0L;
        this.p = -1L;
        this.n = -1L;
    }

    private final void m() {
        if (khe.a < 30 || this.e == null) {
            return;
        }
        float a = this.a.g() ? this.a.a() : this.f;
        float f = this.g;
        if (a != f) {
            if (a != -1.0f && f != -1.0f) {
                float f2 = 1.0f;
                if (this.a.g() && this.a.d() >= 5000000000L) {
                    f2 = 0.02f;
                }
                if (Math.abs(a - this.g) < f2) {
                    return;
                }
            } else if (a == -1.0f && this.a.b() < 30) {
                return;
            }
            this.g = a;
            n(false);
        }
    }

    private final void n(boolean z) {
        Surface surface;
        if (khe.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        float f = 0.0f;
        if (this.d) {
            float f2 = this.g;
            if (f2 != -1.0f) {
                f = this.i * f2;
            }
        }
        if (z || this.h != f) {
            this.h = f;
            bs9.a(surface, f);
        }
    }

    public final long a(long j) {
        long j2;
        if (this.p != -1 && this.a.g()) {
            long c = this.a.c();
            long j3 = this.q + ((long) ((c * (this.m - this.p)) / this.i));
            if (Math.abs(j - j3) > 20000000) {
                l();
            } else {
                j = j3;
            }
        }
        this.n = this.m;
        this.o = j;
        js9 js9Var = this.c;
        if (js9Var != null && this.k != -9223372036854775807L) {
            long j4 = js9Var.a;
            if (j4 != -9223372036854775807L) {
                long j5 = this.k;
                long j6 = j4 + (((j - j4) / j5) * j5);
                if (j <= j6) {
                    j2 = j6 - j5;
                } else {
                    j6 = j5 + j6;
                    j2 = j6;
                }
                long j7 = this.l;
                if (j6 - j >= j - j2) {
                    j6 = j2;
                }
                return j6 - j7;
            }
        }
        return j;
    }

    public final void c(float f) {
        this.f = f;
        this.a.f();
        m();
    }

    public final void d(long j) {
        long j2 = this.n;
        if (j2 != -1) {
            this.p = j2;
            this.q = this.o;
        }
        this.m++;
        this.a.e(j * 1000);
        m();
    }

    public final void e(float f) {
        this.i = f;
        l();
        n(false);
    }

    public final void f() {
        l();
    }

    public final void g() {
        this.d = true;
        l();
        if (this.b != null) {
            js9 js9Var = this.c;
            js9Var.getClass();
            js9Var.b();
            this.b.a(new xr9(this));
        }
        n(false);
    }

    public final void h() {
        this.d = false;
        ds9 ds9Var = this.b;
        if (ds9Var != null) {
            ds9Var.zza();
            js9 js9Var = this.c;
            js9Var.getClass();
            js9Var.c();
        }
        k();
    }

    public final void i(Surface surface) {
        int i = khe.a;
        boolean a = zr9.a(surface);
        Surface surface2 = this.e;
        if (true == a) {
            surface = null;
        }
        if (surface2 == surface) {
            return;
        }
        k();
        this.e = surface;
        n(true);
    }

    public final void j(int i) {
        if (this.j == i) {
            return;
        }
        this.j = i;
        n(true);
    }
}
