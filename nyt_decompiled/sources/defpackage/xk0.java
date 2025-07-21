package defpackage;

import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class xk0 {
    private int[] a;
    private int b;
    private int c;
    private int d;

    public xk0() {
        this(0, 1, null);
    }

    private final void c() {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = this.b;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i3];
        d.i(iArr, iArr2, 0, i, length);
        d.i(this.a, iArr2, i2, 0, this.b);
        this.a = iArr2;
        this.b = 0;
        this.c = length;
        this.d = i3 - 1;
    }

    public final void a(int i) {
        int[] iArr = this.a;
        int i2 = this.c;
        iArr[i2] = i;
        int i3 = this.d & (i2 + 1);
        this.c = i3;
        if (i3 == this.b) {
            c();
        }
    }

    public final void b() {
        this.c = this.b;
    }

    public final boolean d() {
        return this.b == this.c;
    }

    public final int e() {
        int i = this.b;
        if (i == this.c) {
            jn0 jn0Var = jn0.a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = this.a[i];
        this.b = (i + 1) & this.d;
        return i2;
    }

    public xk0(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.d = i - 1;
        this.a = new int[i];
    }

    public /* synthetic */ xk0(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 8 : i);
    }
}
