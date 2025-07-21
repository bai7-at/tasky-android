package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
final class jn3 {
    private int[] a;
    private int b;

    public jn3(int i) {
        this.a = new int[i];
    }

    private final boolean a(int i, int i2) {
        int[] iArr = this.a;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        if (i3 >= i4) {
            return i3 == i4 && iArr[i + 1] <= iArr[i2 + 1];
        }
        return true;
    }

    private final int e(int i, int i2, int i3) {
        int i4 = i - i3;
        while (i < i2) {
            if (a(i, i2)) {
                i4 += i3;
                k(i4, i);
            }
            i += i3;
        }
        int i5 = i4 + i3;
        k(i5, i2);
        return i5;
    }

    private final void i(int i, int i2, int i3) {
        if (i < i2) {
            int e = e(i, i2, i3);
            i(i, e - i3, i3);
            i(e + i3, i2, i3);
        }
    }

    private final void k(int i, int i2) {
        int[] iArr = this.a;
        mz4.i(iArr, i, i2);
        mz4.i(iArr, i + 1, i2 + 1);
        mz4.i(iArr, i + 2, i2 + 2);
    }

    public final int b(int i) {
        return this.a[i];
    }

    public final int c() {
        return this.b;
    }

    public final boolean d() {
        return this.b != 0;
    }

    public final int f() {
        int[] iArr = this.a;
        int i = this.b - 1;
        this.b = i;
        return iArr[i];
    }

    public final void g(int i, int i2, int i3) {
        int i4 = this.b;
        int i5 = i4 + 3;
        int[] iArr = this.a;
        if (i5 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            zq3.g(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
        int[] iArr2 = this.a;
        iArr2[i4] = i + i3;
        iArr2[i4 + 1] = i2 + i3;
        iArr2[i4 + 2] = i3;
        this.b = i5;
    }

    public final void h(int i, int i2, int i3, int i4) {
        int i5 = this.b;
        int i6 = i5 + 4;
        int[] iArr = this.a;
        if (i6 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            zq3.g(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
        int[] iArr2 = this.a;
        iArr2[i5] = i;
        iArr2[i5 + 1] = i2;
        iArr2[i5 + 2] = i3;
        iArr2[i5 + 3] = i4;
        this.b = i6;
    }

    public final void j() {
        int i = this.b;
        if (i % 3 != 0) {
            throw new IllegalStateException("Array size not a multiple of 3");
        }
        if (i > 3) {
            i(0, i - 3, 3);
        }
    }
}
