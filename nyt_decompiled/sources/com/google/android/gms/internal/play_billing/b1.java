package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b1 {
    private static final b1 f = new b1(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private int d = -1;
    private boolean e;

    private b1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static b1 c() {
        return f;
    }

    static b1 e(b1 b1Var, b1 b1Var2) {
        int i = b1Var.a + b1Var2.a;
        int[] copyOf = Arrays.copyOf(b1Var.b, i);
        System.arraycopy(b1Var2.b, 0, copyOf, b1Var.a, b1Var2.a);
        Object[] copyOf2 = Arrays.copyOf(b1Var.c, i);
        System.arraycopy(b1Var2.c, 0, copyOf2, b1Var.a, b1Var2.a);
        return new b1(i, copyOf, copyOf2, true);
    }

    static b1 f() {
        return new b1(0, new int[8], new Object[8], true);
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
        int z;
        int y;
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
                    i = o.y(i6 << 3) + 8;
                } else if (i7 == 2) {
                    zzba zzbaVar = (zzba) this.c[i4];
                    int i8 = o.d;
                    int e = zzbaVar.e();
                    i = o.y(i6 << 3) + o.y(e) + e;
                } else if (i7 == 3) {
                    int i9 = i6 << 3;
                    int i10 = o.d;
                    z = ((b1) this.c[i4]).a();
                    int y2 = o.y(i9);
                    y = y2 + y2;
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException(zzci.a());
                    }
                    ((Integer) this.c[i4]).intValue();
                    i = o.y(i6 << 3) + 4;
                }
                i3 += i;
            } else {
                int i11 = i6 << 3;
                z = o.z(((Long) this.c[i4]).longValue());
                y = o.y(i11);
            }
            i = y + z;
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
            zzba zzbaVar = (zzba) this.c[i3];
            int i5 = o.d;
            int e = zzbaVar.e();
            int y = o.y(e) + e;
            int y2 = o.y(16);
            int y3 = o.y(i4);
            int y4 = o.y(8);
            i2 += y4 + y4 + y2 + y3 + o.y(24) + y;
        }
        this.d = i2;
        return i2;
    }

    final b1 d(b1 b1Var) {
        if (b1Var.equals(f)) {
            return this;
        }
        g();
        int i = this.a + b1Var.a;
        l(i);
        System.arraycopy(b1Var.b, 0, this.b, this.a, b1Var.a);
        System.arraycopy(b1Var.c, 0, this.c, this.a, b1Var.a);
        this.a = i;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        int i = this.a;
        if (i == b1Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = b1Var.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = b1Var.c;
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
        int i6 = (i2 * 31) + i4;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return (i6 * 31) + i3;
    }

    final void i(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            o0.b(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
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

    public final void k(m1 m1Var) {
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    m1Var.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    m1Var.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    m1Var.a(i4, (zzba) obj);
                } else if (i3 == 3) {
                    m1Var.zzE(i4);
                    ((b1) obj).k(m1Var);
                    m1Var.zzh(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(zzci.a());
                    }
                    m1Var.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }
}
