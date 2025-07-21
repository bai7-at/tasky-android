package defpackage;

import com.google.android.exoplayer2.t0;
import defpackage.ei7;

/* loaded from: classes2.dex */
abstract class r38 {
    private yp8 b;
    private a82 c;
    private pd5 d;
    private long e;
    private long f;
    private long g;
    private int h;
    private int i;
    private long k;
    private boolean l;
    private boolean m;
    private final nd5 a = new nd5();
    private b j = new b();

    static class b {
        t0 a;
        pd5 b;

        b() {
        }
    }

    private static final class c implements pd5 {
        private c() {
        }

        @Override // defpackage.pd5
        public ei7 a() {
            return new ei7.b(-9223372036854775807L);
        }

        @Override // defpackage.pd5
        public long b(z72 z72Var) {
            return -1L;
        }

        @Override // defpackage.pd5
        public void c(long j) {
        }
    }

    private void a() {
        ur.i(this.b);
        z19.j(this.c);
    }

    private boolean h(z72 z72Var) {
        while (this.a.d(z72Var)) {
            this.k = z72Var.getPosition() - this.f;
            if (!i(this.a.c(), this.f, this.j)) {
                return true;
            }
            this.f = z72Var.getPosition();
        }
        this.h = 3;
        return false;
    }

    private int j(z72 z72Var) {
        if (!h(z72Var)) {
            return -1;
        }
        t0 t0Var = this.j.a;
        this.i = t0Var.N;
        if (!this.m) {
            this.b.d(t0Var);
            this.m = true;
        }
        pd5 pd5Var = this.j.b;
        if (pd5Var != null) {
            this.d = pd5Var;
        } else if (z72Var.getLength() == -1) {
            this.d = new c();
        } else {
            od5 b2 = this.a.b();
            this.d = new pi1(this, this.f, z72Var.getLength(), b2.h + b2.i, b2.c, (b2.b & 4) != 0);
        }
        this.h = 2;
        this.a.f();
        return 0;
    }

    private int k(z72 z72Var, e06 e06Var) {
        long b2 = this.d.b(z72Var);
        if (b2 >= 0) {
            e06Var.a = b2;
            return 1;
        }
        if (b2 < -1) {
            e(-(b2 + 2));
        }
        if (!this.l) {
            this.c.p((ei7) ur.i(this.d.a()));
            this.l = true;
        }
        if (this.k <= 0 && !this.a.d(z72Var)) {
            this.h = 3;
            return -1;
        }
        this.k = 0L;
        yo5 c2 = this.a.c();
        long f = f(c2);
        if (f >= 0) {
            long j = this.g;
            if (j + f >= this.e) {
                long b3 = b(j);
                this.b.a(c2, c2.g());
                this.b.b(b3, 1, c2.g(), 0, null);
                this.e = -1L;
            }
        }
        this.g += f;
        return 0;
    }

    protected long b(long j) {
        return (j * 1000000) / this.i;
    }

    protected long c(long j) {
        return (this.i * j) / 1000000;
    }

    void d(a82 a82Var, yp8 yp8Var) {
        this.c = a82Var;
        this.b = yp8Var;
        l(true);
    }

    protected void e(long j) {
        this.g = j;
    }

    protected abstract long f(yo5 yo5Var);

    final int g(z72 z72Var, e06 e06Var) {
        a();
        int i = this.h;
        if (i == 0) {
            return j(z72Var);
        }
        if (i == 1) {
            z72Var.p((int) this.f);
            this.h = 2;
            return 0;
        }
        if (i == 2) {
            z19.j(this.d);
            return k(z72Var, e06Var);
        }
        if (i == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    protected abstract boolean i(yo5 yo5Var, long j, b bVar);

    protected void l(boolean z) {
        if (z) {
            this.j = new b();
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }

    final void m(long j, long j2) {
        this.a.e();
        if (j == 0) {
            l(!this.l);
        } else if (this.h != 0) {
            this.e = c(j2);
            ((pd5) z19.j(this.d)).c(this.e);
            this.h = 2;
        }
    }
}
