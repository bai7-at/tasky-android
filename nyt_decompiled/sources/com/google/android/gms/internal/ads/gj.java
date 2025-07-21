package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class gj {
    private static final gj f = new gj(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private int d = -1;
    private boolean e;

    private gj(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static gj c() {
        return f;
    }

    static gj e(gj gjVar, gj gjVar2) {
        int i = gjVar.a + gjVar2.a;
        int[] copyOf = Arrays.copyOf(gjVar.b, i);
        System.arraycopy(gjVar2.b, 0, copyOf, gjVar.a, gjVar2.a);
        Object[] copyOf2 = Arrays.copyOf(gjVar.c, i);
        System.arraycopy(gjVar2.c, 0, copyOf2, gjVar.a, gjVar2.a);
        return new gj(i, copyOf, copyOf2, true);
    }

    static gj f() {
        return new gj(0, new int[8], new Object[8], true);
    }

    private final void l(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final int a() {
        int B;
        int b;
        int i;
        int i2 = this.d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.a; i4++) {
            int i5 = this.b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 0) {
                if (i7 == 1) {
                    ((Long) this.c[i4]).longValue();
                    i = lh.B(i6 << 3) + 8;
                } else if (i7 == 2) {
                    int i8 = i6 << 3;
                    zzgyl zzgylVar = (zzgyl) this.c[i4];
                    int B2 = lh.B(i8);
                    int g = zzgylVar.g();
                    i = B2 + lh.B(g) + g;
                } else if (i7 == 3) {
                    int B3 = lh.B(i6 << 3);
                    B = B3 + B3;
                    b = ((gj) this.c[i4]).a();
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException(zzhag.a());
                    }
                    ((Integer) this.c[i4]).intValue();
                    i = lh.B(i6 << 3) + 4;
                }
                i3 += i;
            } else {
                int i9 = i6 << 3;
                long longValue = ((Long) this.c[i4]).longValue();
                B = lh.B(i9);
                b = lh.b(longValue);
            }
            i = B + b;
            i3 += i;
        }
        this.d = i3;
        return i3;
    }

    public final int b() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3] >>> 3;
            zzgyl zzgylVar = (zzgyl) this.c[i3];
            int B = lh.B(8);
            int B2 = lh.B(16) + lh.B(i4);
            int B3 = lh.B(24);
            int g = zzgylVar.g();
            i2 += B + B + B2 + B3 + lh.B(g) + g;
        }
        this.d = i2;
        return i2;
    }

    final gj d(gj gjVar) {
        if (gjVar.equals(f)) {
            return this;
        }
        g();
        int i = this.a + gjVar.a;
        l(i);
        System.arraycopy(gjVar.b, 0, this.b, this.a, gjVar.a);
        System.arraycopy(gjVar.c, 0, this.c, this.a, gjVar.a);
        this.a = i;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gj)) {
            return false;
        }
        gj gjVar = (gj) obj;
        int i = this.a;
        if (i == gjVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = gjVar.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = gjVar.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    final void g() {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.e) {
            this.e = false;
        }
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i + 527;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    final void i(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            oi.b(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
        }
    }

    final void j(int i, Object obj) {
        g();
        l(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void k(mh mhVar) {
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    mhVar.E(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    mhVar.x(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    mhVar.o(i4, (zzgyl) obj);
                } else if (i3 == 3) {
                    mhVar.e(i4);
                    ((gj) obj).k(mhVar);
                    mhVar.s(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(zzhag.a());
                    }
                    mhVar.v(i4, ((Integer) obj).intValue());
                }
            }
        }
    }
}
