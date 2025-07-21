package defpackage;

import java.lang.reflect.Array;

/* loaded from: classes3.dex */
public final class n40 {
    private final o40[] a;
    private int b;
    private final int c;
    private final int d;

    n40(int i, int i2) {
        o40[] o40VarArr = new o40[i];
        this.a = o40VarArr;
        int length = o40VarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.a[i3] = new o40(((i2 + 4) * 17) + 1);
        }
        this.d = i2 * 17;
        this.c = i;
        this.b = -1;
    }

    o40 a() {
        return this.a[this.b];
    }

    public byte[][] b(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.c * i2, this.d * i);
        int i3 = this.c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.a[i4 / i2].b(i);
        }
        return bArr;
    }

    void c() {
        this.b++;
    }
}
