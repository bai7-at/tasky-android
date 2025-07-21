package defpackage;

import defpackage.ei7;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class sk0 {
    protected final yp8 a;
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

    public sk0(int i, int i2, long j, int i3, yp8 yp8Var) {
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        ur.a(z);
        this.d = j;
        this.e = i3;
        this.a = yp8Var;
        this.b = d(i, i2 == 2 ? 1667497984 : 1651965952);
        this.c = i2 == 2 ? d(i, 1650720768) : -1;
        this.k = new long[512];
        this.l = new int[512];
    }

    private static int d(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    private long e(int i) {
        return (this.d * i) / this.e;
    }

    private gi7 h(int i) {
        return new gi7(this.l[i] * g(), this.k[i]);
    }

    public void a() {
        this.h++;
    }

    public void b(long j) {
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

    public void c() {
        this.k = Arrays.copyOf(this.k, this.j);
        this.l = Arrays.copyOf(this.l, this.j);
    }

    public long f() {
        return e(this.h);
    }

    public long g() {
        return e(1);
    }

    public ei7.a i(long j) {
        int g = (int) (j / g());
        int h = z19.h(this.l, g, true, true);
        if (this.l[h] == g) {
            return new ei7.a(h(h));
        }
        gi7 h2 = h(h);
        int i = h + 1;
        return i < this.k.length ? new ei7.a(h2, h(i)) : new ei7.a(h2);
    }

    public boolean j(int i) {
        return this.b == i || this.c == i;
    }

    public void k() {
        this.i++;
    }

    public boolean l() {
        return Arrays.binarySearch(this.l, this.h) >= 0;
    }

    public boolean m(z72 z72Var) {
        int i = this.g;
        int e = i - this.a.e(z72Var, i, false);
        this.g = e;
        boolean z = e == 0;
        if (z) {
            if (this.f > 0) {
                this.a.b(f(), l() ? 1 : 0, this.f, 0, null);
            }
            a();
        }
        return z;
    }

    public void n(int i) {
        this.f = i;
        this.g = i;
    }

    public void o(long j) {
        if (this.j == 0) {
            this.h = 0;
        } else {
            this.h = this.l[z19.i(this.k, j, true, true)];
        }
    }
}
