package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class qj2 {
    private boolean c;
    private boolean d;
    private int f;
    private a a = new a();
    private a b = new a();
    private long e = -9223372036854775807L;

    private static final class a {
        private long a;
        private long b;
        private long c;
        private long d;
        private long e;
        private long f;
        private final boolean[] g = new boolean[15];
        private int h;

        private static int c(long j) {
            return (int) (j % 15);
        }

        public long a() {
            long j = this.e;
            if (j == 0) {
                return 0L;
            }
            return this.f / j;
        }

        public long b() {
            return this.f;
        }

        public boolean d() {
            long j = this.d;
            if (j == 0) {
                return false;
            }
            return this.g[c(j - 1)];
        }

        public boolean e() {
            return this.d > 15 && this.h == 0;
        }

        public void f(long j) {
            long j2 = this.d;
            if (j2 == 0) {
                this.a = j;
            } else if (j2 == 1) {
                long j3 = j - this.a;
                this.b = j3;
                this.f = j3;
                this.e = 1L;
            } else {
                long j4 = j - this.c;
                int c = c(j2);
                if (Math.abs(j4 - this.b) <= 1000000) {
                    this.e++;
                    this.f += j4;
                    boolean[] zArr = this.g;
                    if (zArr[c]) {
                        zArr[c] = false;
                        this.h--;
                    }
                } else {
                    boolean[] zArr2 = this.g;
                    if (!zArr2[c]) {
                        zArr2[c] = true;
                        this.h++;
                    }
                }
            }
            this.d++;
            this.c = j;
        }

        public void g() {
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.h = 0;
            Arrays.fill(this.g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f;
    }

    public long d() {
        if (e()) {
            return this.a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.a.e();
    }

    public void f(long j) {
        this.a.f(j);
        if (this.a.e() && !this.d) {
            this.c = false;
        } else if (this.e != -9223372036854775807L) {
            if (!this.c || this.b.d()) {
                this.b.g();
                this.b.f(this.e);
            }
            this.c = true;
            this.b.f(j);
        }
        if (this.c && this.b.e()) {
            a aVar = this.a;
            this.a = this.b;
            this.b = aVar;
            this.c = false;
            this.d = false;
        }
        this.e = j;
        this.f = this.a.e() ? 0 : this.f + 1;
    }

    public void g() {
        this.a.g();
        this.b.g();
        this.c = false;
        this.e = -9223372036854775807L;
        this.f = 0;
    }
}
