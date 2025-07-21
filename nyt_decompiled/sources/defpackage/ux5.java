package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ux5 {
    private int a;
    private long[] b = new long[2];

    public final boolean a(long j) {
        if (d(j)) {
            return false;
        }
        k(this.a, j);
        return true;
    }

    public final boolean b(long j) {
        return a(j);
    }

    public final void c() {
        this.a = 0;
    }

    public final boolean d(long j) {
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public final long e(int i) {
        return tx5.b(this.b[i]);
    }

    public final int f() {
        return this.a;
    }

    public final boolean g() {
        return this.a == 0;
    }

    public final boolean h(long j) {
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (j == e(i2)) {
                j(i2);
                return true;
            }
        }
        return false;
    }

    public final boolean i(long j) {
        return h(j);
    }

    public final boolean j(int i) {
        int i2 = this.a;
        if (i >= i2) {
            return false;
        }
        int i3 = i2 - 1;
        while (i < i3) {
            long[] jArr = this.b;
            int i4 = i + 1;
            jArr[i] = jArr[i4];
            i = i4;
        }
        this.a--;
        return true;
    }

    public final void k(int i, long j) {
        long[] jArr = this.b;
        if (i >= jArr.length) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i + 1, jArr.length * 2));
            zq3.g(copyOf, "copyOf(this, newSize)");
            this.b = copyOf;
        }
        this.b[i] = j;
        if (i >= this.a) {
            this.a = i + 1;
        }
    }
}
