package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class my9 {
    protected final tx9 a;
    private final int b;
    private final int c;
    private final long d;
    private final int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private long[] k;
    private int[] l;

    public my9(int i, int i2, long j, int i3, tx9 tx9Var) {
        i2 = i2 != 1 ? 2 : i2;
        this.d = j;
        this.e = i3;
        this.a = tx9Var;
        this.b = i(i, i2 == 2 ? 1667497984 : 1651965952);
        this.c = i2 == 2 ? i(i, 1650720768) : -1;
        this.k = new long[512];
        this.l = new int[512];
    }

    private static int i(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    private final long j(int i) {
        return (this.d * i) / this.e;
    }

    private final hx9 k(int i) {
        return new hx9(this.l[i] * j(1), this.k[i]);
    }

    public final ex9 a(long j) {
        int j2 = (int) (j / j(1));
        int q = khe.q(this.l, j2, true, true);
        if (this.l[q] == j2) {
            hx9 k = k(q);
            return new ex9(k, k);
        }
        hx9 k2 = k(q);
        int i = q + 1;
        return i < this.k.length ? new ex9(k2, k(i)) : new ex9(k2, k2);
    }

    public final void b(long j) {
        if (this.j == this.l.length) {
            long[] jArr = this.k;
            this.k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.l;
            this.l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.k;
        int i = this.j;
        jArr2[i] = j;
        this.l[i] = this.i;
        this.j = i + 1;
    }

    public final void c() {
        this.k = Arrays.copyOf(this.k, this.j);
        this.l = Arrays.copyOf(this.l, this.j);
    }

    public final void d() {
        this.i++;
    }

    public final void e(int i) {
        this.f = i;
        this.g = i;
    }

    public final void f(long j) {
        if (this.j == 0) {
            this.h = 0;
        } else {
            this.h = this.l[khe.r(this.k, j, true, true)];
        }
    }

    public final boolean g(int i) {
        return this.b == i || this.c == i;
    }

    public final boolean h(ov9 ov9Var) {
        int i = this.g;
        int a = i - this.a.a(ov9Var, i, false);
        this.g = a;
        boolean z = a == 0;
        if (z) {
            if (this.f > 0) {
                this.a.c(j(this.h), Arrays.binarySearch(this.l, this.h) >= 0 ? 1 : 0, this.f, 0, null);
            }
            this.h++;
        }
        return z;
    }
}
