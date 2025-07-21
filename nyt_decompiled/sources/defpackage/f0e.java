package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class f0e {
    private int a;
    private long[] b = new long[32];

    public f0e(int i) {
    }

    public final int a() {
        return this.a;
    }

    public final long b(int i) {
        if (i >= 0 && i < this.a) {
            return this.b[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.a);
    }

    public final void c(long j) {
        int i = this.a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        jArr2[i2] = j;
    }
}
