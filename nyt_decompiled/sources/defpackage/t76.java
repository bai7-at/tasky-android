package defpackage;

/* loaded from: classes2.dex */
final class t76 {
    private boolean c;
    private boolean d;
    private boolean e;
    private final qm8 a = new qm8(0);
    private long f = -9223372036854775807L;
    private long g = -9223372036854775807L;
    private long h = -9223372036854775807L;
    private final yo5 b = new yo5();

    t76() {
    }

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int b(z72 z72Var) {
        this.b.R(z19.f);
        this.c = true;
        z72Var.g();
        return 0;
    }

    private int f(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
    }

    private int h(z72 z72Var, e06 e06Var) {
        int min = (int) Math.min(20000L, z72Var.getLength());
        long j = 0;
        if (z72Var.getPosition() != j) {
            e06Var.a = j;
            return 1;
        }
        this.b.Q(min);
        z72Var.g();
        z72Var.r(this.b.e(), 0, min);
        this.f = i(this.b);
        this.d = true;
        return 0;
    }

    private long i(yo5 yo5Var) {
        int g = yo5Var.g();
        for (int f = yo5Var.f(); f < g - 3; f++) {
            if (f(yo5Var.e(), f) == 442) {
                yo5Var.U(f + 4);
                long l = l(yo5Var);
                if (l != -9223372036854775807L) {
                    return l;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int j(z72 z72Var, e06 e06Var) {
        long length = z72Var.getLength();
        int min = (int) Math.min(20000L, length);
        long j = length - min;
        if (z72Var.getPosition() != j) {
            e06Var.a = j;
            return 1;
        }
        this.b.Q(min);
        z72Var.g();
        z72Var.r(this.b.e(), 0, min);
        this.g = k(this.b);
        this.e = true;
        return 0;
    }

    private long k(yo5 yo5Var) {
        int f = yo5Var.f();
        for (int g = yo5Var.g() - 4; g >= f; g--) {
            if (f(yo5Var.e(), g) == 442) {
                yo5Var.U(g + 4);
                long l = l(yo5Var);
                if (l != -9223372036854775807L) {
                    return l;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long l(yo5 yo5Var) {
        int f = yo5Var.f();
        if (yo5Var.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        yo5Var.l(bArr, 0, 9);
        yo5Var.U(f);
        if (a(bArr)) {
            return m(bArr);
        }
        return -9223372036854775807L;
    }

    private static long m(byte[] bArr) {
        byte b = bArr[0];
        long j = (((b & 56) >> 3) << 30) | ((b & 3) << 28) | ((bArr[1] & 255) << 20);
        byte b2 = bArr[2];
        return j | (((b2 & 248) >> 3) << 15) | ((b2 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public long c() {
        return this.h;
    }

    public qm8 d() {
        return this.a;
    }

    public boolean e() {
        return this.c;
    }

    public int g(z72 z72Var, e06 e06Var) {
        if (!this.e) {
            return j(z72Var, e06Var);
        }
        if (this.g == -9223372036854775807L) {
            return b(z72Var);
        }
        if (!this.d) {
            return h(z72Var, e06Var);
        }
        long j = this.f;
        if (j == -9223372036854775807L) {
            return b(z72Var);
        }
        long b = this.a.b(this.g) - this.a.b(j);
        this.h = b;
        if (b < 0) {
            a84.j("PsDurationReader", "Invalid duration: " + this.h + ". Using TIME_UNSET instead.");
            this.h = -9223372036854775807L;
        }
        return b(z72Var);
    }
}
