package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import defpackage.ei7;

/* loaded from: classes2.dex */
public abstract class i80 {
    protected final a a;
    protected final f b;
    protected c c;
    private final int d;

    public static class a implements ei7 {
        private final d a;
        private final long b;
        private final long c;
        private final long d;
        private final long e;
        private final long f;
        private final long g;

        public a(d dVar, long j, long j2, long j3, long j4, long j5, long j6) {
            this.a = dVar;
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
        }

        @Override // defpackage.ei7
        public ei7.a f(long j) {
            return new ei7.a(new gi7(j, c.h(this.a.a(j), this.c, this.d, this.e, this.f, this.g)));
        }

        @Override // defpackage.ei7
        public boolean h() {
            return true;
        }

        @Override // defpackage.ei7
        public long i() {
            return this.b;
        }

        public long k(long j) {
            return this.a.a(j);
        }
    }

    public static final class b implements d {
        @Override // i80.d
        public long a(long j) {
            return j;
        }
    }

    protected static class c {
        private final long a;
        private final long b;
        private final long c;
        private long d;
        private long e;
        private long f;
        private long g;
        private long h;

        protected c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.a = j;
            this.b = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
            this.c = j7;
            this.h = h(j2, j3, j4, j5, j6, j7);
        }

        protected static long h(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
            return z19.r(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return this.g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long j() {
            return this.f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long k() {
            return this.h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long l() {
            return this.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long m() {
            return this.b;
        }

        private void n() {
            this.h = h(this.b, this.d, this.e, this.f, this.g, this.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(long j, long j2) {
            this.e = j;
            this.g = j2;
            n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(long j, long j2) {
            this.d = j;
            this.f = j2;
            n();
        }
    }

    protected interface d {
        long a(long j);
    }

    public static final class e {
        public static final e d = new e(-3, -9223372036854775807L, -1);
        private final int a;
        private final long b;
        private final long c;

        private e(int i, long j, long j2) {
            this.a = i;
            this.b = j;
            this.c = j2;
        }

        public static e d(long j, long j2) {
            return new e(-1, j, j2);
        }

        public static e e(long j) {
            return new e(0, -9223372036854775807L, j);
        }

        public static e f(long j, long j2) {
            return new e(-2, j, j2);
        }
    }

    protected interface f {
        e a(z72 z72Var, long j);

        default void b() {
        }
    }

    protected i80(d dVar, f fVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.b = fVar;
        this.d = i;
        this.a = new a(dVar, j, j2, j3, j4, j5, j6);
    }

    protected c a(long j) {
        return new c(j, this.a.k(j), this.a.c, this.a.d, this.a.e, this.a.f, this.a.g);
    }

    public final ei7 b() {
        return this.a;
    }

    public int c(z72 z72Var, e06 e06Var) {
        while (true) {
            c cVar = (c) ur.i(this.c);
            long j = cVar.j();
            long i = cVar.i();
            long k = cVar.k();
            if (i - j <= this.d) {
                e(false, j);
                return g(z72Var, j, e06Var);
            }
            if (!i(z72Var, k)) {
                return g(z72Var, k, e06Var);
            }
            z72Var.g();
            e a2 = this.b.a(z72Var, cVar.m());
            int i2 = a2.a;
            if (i2 == -3) {
                e(false, k);
                return g(z72Var, k, e06Var);
            }
            if (i2 == -2) {
                cVar.p(a2.b, a2.c);
            } else {
                if (i2 != -1) {
                    if (i2 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    i(z72Var, a2.c);
                    e(true, a2.c);
                    return g(z72Var, a2.c, e06Var);
                }
                cVar.o(a2.b, a2.c);
            }
        }
    }

    public final boolean d() {
        return this.c != null;
    }

    protected final void e(boolean z, long j) {
        this.c = null;
        this.b.b();
        f(z, j);
    }

    protected void f(boolean z, long j) {
    }

    protected final int g(z72 z72Var, long j, e06 e06Var) {
        if (j == z72Var.getPosition()) {
            return 0;
        }
        e06Var.a = j;
        return 1;
    }

    public final void h(long j) {
        c cVar = this.c;
        if (cVar == null || cVar.l() != j) {
            this.c = a(j);
        }
    }

    protected final boolean i(z72 z72Var, long j) {
        long position = j - z72Var.getPosition();
        if (position < 0 || position > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        z72Var.p((int) position);
        return true;
    }
}
