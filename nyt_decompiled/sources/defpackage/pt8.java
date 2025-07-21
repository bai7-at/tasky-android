package defpackage;

/* loaded from: classes2.dex */
final class pt8 {
    private final int a;
    private boolean d;
    private boolean e;
    private boolean f;
    private final qm8 b = new qm8(0);
    private long g = -9223372036854775807L;
    private long h = -9223372036854775807L;
    private long i = -9223372036854775807L;
    private final yo5 c = new yo5();

    pt8(int i) {
        this.a = i;
    }

    private int a(z72 z72Var) {
        this.c.R(z19.f);
        this.d = true;
        z72Var.g();
        return 0;
    }

    private int f(z72 z72Var, e06 e06Var, int i) {
        int min = (int) Math.min(this.a, z72Var.getLength());
        long j = 0;
        if (z72Var.getPosition() != j) {
            e06Var.a = j;
            return 1;
        }
        this.c.Q(min);
        z72Var.g();
        z72Var.r(this.c.e(), 0, min);
        this.g = g(this.c, i);
        this.e = true;
        return 0;
    }

    private long g(yo5 yo5Var, int i) {
        int g = yo5Var.g();
        for (int f = yo5Var.f(); f < g; f++) {
            if (yo5Var.e()[f] == 71) {
                long c = tt8.c(yo5Var, f, i);
                if (c != -9223372036854775807L) {
                    return c;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int h(z72 z72Var, e06 e06Var, int i) {
        long length = z72Var.getLength();
        int min = (int) Math.min(this.a, length);
        long j = length - min;
        if (z72Var.getPosition() != j) {
            e06Var.a = j;
            return 1;
        }
        this.c.Q(min);
        z72Var.g();
        z72Var.r(this.c.e(), 0, min);
        this.h = i(this.c, i);
        this.f = true;
        return 0;
    }

    private long i(yo5 yo5Var, int i) {
        int f = yo5Var.f();
        int g = yo5Var.g();
        for (int i2 = g - 188; i2 >= f; i2--) {
            if (tt8.b(yo5Var.e(), f, g, i2)) {
                long c = tt8.c(yo5Var, i2, i);
                if (c != -9223372036854775807L) {
                    return c;
                }
            }
        }
        return -9223372036854775807L;
    }

    public long b() {
        return this.i;
    }

    public qm8 c() {
        return this.b;
    }

    public boolean d() {
        return this.d;
    }

    public int e(z72 z72Var, e06 e06Var, int i) {
        if (i <= 0) {
            return a(z72Var);
        }
        if (!this.f) {
            return h(z72Var, e06Var, i);
        }
        if (this.h == -9223372036854775807L) {
            return a(z72Var);
        }
        if (!this.e) {
            return f(z72Var, e06Var, i);
        }
        long j = this.g;
        if (j == -9223372036854775807L) {
            return a(z72Var);
        }
        long b = this.b.b(this.h) - this.b.b(j);
        this.i = b;
        if (b < 0) {
            a84.j("TsDurationReader", "Invalid duration: " + this.i + ". Using TIME_UNSET instead.");
            this.i = -9223372036854775807L;
        }
        return a(z72Var);
    }
}
