package defpackage;

/* loaded from: classes3.dex */
final class c8a {
    private final tx9 a;
    private long b;
    private boolean c;
    private int d;
    private long e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private long k;
    private long l;
    private boolean m;

    public c8a(tx9 tx9Var) {
        this.a = tx9Var;
    }

    private final void f(int i) {
        long j = this.l;
        if (j == -9223372036854775807L) {
            return;
        }
        boolean z = this.m;
        long j2 = this.b - this.k;
        this.a.c(j, z ? 1 : 0, (int) j2, i, null);
    }

    public final void a(long j) {
        this.b = j;
        f(0);
        this.i = false;
    }

    public final void b(long j, int i, boolean z) {
        if (this.j && this.g) {
            this.m = this.c;
            this.j = false;
        } else if (this.h || this.g) {
            if (z && this.i) {
                f(i + ((int) (j - this.b)));
            }
            this.k = this.b;
            this.l = this.e;
            this.m = this.c;
            this.i = true;
        }
    }

    public final void c(byte[] bArr, int i, int i2) {
        if (this.f) {
            int i3 = this.d;
            int i4 = (i + 2) - i3;
            if (i4 >= i2) {
                this.d = i3 + (i2 - i);
            } else {
                this.g = (bArr[i4] & 128) != 0;
                this.f = false;
            }
        }
    }

    public final void d() {
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
    }

    public final void e(long j, int i, int i2, long j2, boolean z) {
        this.g = false;
        this.h = false;
        this.e = j2;
        this.d = 0;
        this.b = j;
        if (i2 >= 32 && i2 != 40) {
            if (this.i && !this.j) {
                if (z) {
                    f(i);
                }
                this.i = false;
            }
            if (i2 <= 35 || i2 == 39) {
                this.h = !this.j;
                this.j = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        this.c = z2;
        this.f = z2 || i2 <= 9;
    }
}
