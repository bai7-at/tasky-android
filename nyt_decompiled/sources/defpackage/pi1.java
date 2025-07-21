package defpackage;

import defpackage.ei7;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;

/* loaded from: classes2.dex */
final class pi1 implements pd5 {
    private final od5 a;
    private final long b;
    private final long c;
    private final r38 d;
    private int e;
    private long f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;

    private final class b implements ei7 {
        private b() {
        }

        @Override // defpackage.ei7
        public ei7.a f(long j) {
            return new ei7.a(new gi7(j, z19.r((pi1.this.b + BigInteger.valueOf(pi1.this.d.c(j)).multiply(BigInteger.valueOf(pi1.this.c - pi1.this.b)).divide(BigInteger.valueOf(pi1.this.f)).longValue()) - 30000, pi1.this.b, pi1.this.c - 1)));
        }

        @Override // defpackage.ei7
        public boolean h() {
            return true;
        }

        @Override // defpackage.ei7
        public long i() {
            return pi1.this.d.b(pi1.this.f);
        }
    }

    public pi1(r38 r38Var, long j, long j2, long j3, long j4, boolean z) {
        ur.a(j >= 0 && j2 > j);
        this.d = r38Var;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.f = j4;
            this.e = 4;
        } else {
            this.e = 0;
        }
        this.a = new od5();
    }

    private long i(z72 z72Var) {
        if (this.i == this.j) {
            return -1L;
        }
        long position = z72Var.getPosition();
        if (!this.a.d(z72Var, this.j)) {
            long j = this.i;
            if (j != position) {
                return j;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.a.a(z72Var, false);
        z72Var.g();
        long j2 = this.h;
        od5 od5Var = this.a;
        long j3 = od5Var.c;
        long j4 = j2 - j3;
        int i = od5Var.h + od5Var.i;
        if (0 <= j4 && j4 < 72000) {
            return -1L;
        }
        if (j4 < 0) {
            this.j = position;
            this.l = j3;
        } else {
            this.i = z72Var.getPosition() + i;
            this.k = this.a.c;
        }
        long j5 = this.j;
        long j6 = this.i;
        if (j5 - j6 < 100000) {
            this.j = j6;
            return j6;
        }
        long position2 = z72Var.getPosition() - (i * (j4 <= 0 ? 2L : 1L));
        long j7 = this.j;
        long j8 = this.i;
        return z19.r(position2 + ((j4 * (j7 - j8)) / (this.l - this.k)), j8, j7 - 1);
    }

    private void k(z72 z72Var) {
        while (true) {
            this.a.c(z72Var);
            this.a.a(z72Var, false);
            od5 od5Var = this.a;
            if (od5Var.c > this.h) {
                z72Var.g();
                return;
            } else {
                z72Var.p(od5Var.h + od5Var.i);
                this.i = z72Var.getPosition();
                this.k = this.a.c;
            }
        }
    }

    @Override // defpackage.pd5
    public long b(z72 z72Var) {
        int i = this.e;
        if (i == 0) {
            long position = z72Var.getPosition();
            this.g = position;
            this.e = 1;
            long j = this.c - 65307;
            if (j > position) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long i2 = i(z72Var);
                if (i2 != -1) {
                    return i2;
                }
                this.e = 3;
            } else if (i != 3) {
                if (i == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            k(z72Var);
            this.e = 4;
            return -(this.k + 2);
        }
        this.f = j(z72Var);
        this.e = 4;
        return this.g;
    }

    @Override // defpackage.pd5
    public void c(long j) {
        this.h = z19.r(j, 0L, this.f - 1);
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }

    @Override // defpackage.pd5
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public b a() {
        if (this.f != 0) {
            return new b();
        }
        return null;
    }

    long j(z72 z72Var) {
        this.a.b();
        if (!this.a.c(z72Var)) {
            throw new EOFException();
        }
        this.a.a(z72Var, false);
        od5 od5Var = this.a;
        z72Var.p(od5Var.h + od5Var.i);
        long j = this.a.c;
        while (true) {
            od5 od5Var2 = this.a;
            if ((od5Var2.b & 4) == 4 || !od5Var2.c(z72Var) || z72Var.getPosition() >= this.c || !this.a.a(z72Var, true)) {
                break;
            }
            od5 od5Var3 = this.a;
            if (!b82.e(z72Var, od5Var3.h + od5Var3.i)) {
                break;
            }
            j = this.a.c;
        }
        return j;
    }
}
