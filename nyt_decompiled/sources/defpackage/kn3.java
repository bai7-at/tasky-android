package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class kn3 {
    private int[] a = new int[10];
    private int b;

    public final void a() {
        this.b = 0;
    }

    public final int b() {
        return this.b;
    }

    public final int c(int i) {
        int i2 = this.b;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.a[i3] == i) {
                return i3;
            }
        }
        return -1;
    }

    public final boolean d() {
        return this.b == 0;
    }

    public final int e() {
        return this.a[this.b - 1];
    }

    public final int f(int i) {
        return this.a[i];
    }

    public final int g(int i) {
        return this.b > 0 ? e() : i;
    }

    public final int h() {
        int[] iArr = this.a;
        int i = this.b - 1;
        this.b = i;
        return iArr[i];
    }

    public final void i(int i) {
        int i2 = this.b;
        int[] iArr = this.a;
        if (i2 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            zq3.g(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
        int[] iArr2 = this.a;
        int i3 = this.b;
        this.b = i3 + 1;
        iArr2[i3] = i;
    }
}
