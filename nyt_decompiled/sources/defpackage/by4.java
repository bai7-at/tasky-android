package defpackage;

import kotlin.collections.d;

/* loaded from: classes.dex */
public final class by4 extends fn3 {
    private int e;

    public by4(int i) {
        super(null);
        if (i < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        g(ta7.e(i));
    }

    private final void e() {
        this.e = ta7.a(b()) - this.d;
    }

    private final void f(int i) {
        long[] jArr;
        if (i == 0) {
            jArr = ta7.a;
        } else {
            jArr = new long[((i + 15) & (-8)) >> 3];
            d.v(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.a = jArr;
        int i2 = i >> 3;
        long j = 255 << ((i & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        e();
    }

    private final void g(int i) {
        int max = i > 0 ? Math.max(7, ta7.d(i)) : 0;
        this.c = max;
        f(max);
        this.b = new int[max];
    }
}
