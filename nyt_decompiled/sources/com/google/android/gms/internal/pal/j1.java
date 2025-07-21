package com.google.android.gms.internal.pal;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class j1 {
    private static final j1 f = new j1(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private int d = -1;
    private boolean e;

    private j1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static j1 c() {
        return f;
    }

    static j1 d(j1 j1Var, j1 j1Var2) {
        int i = j1Var.a + j1Var2.a;
        int[] copyOf = Arrays.copyOf(j1Var.b, i);
        System.arraycopy(j1Var2.b, 0, copyOf, j1Var.a, j1Var2.a);
        Object[] copyOf2 = Arrays.copyOf(j1Var.c, i);
        System.arraycopy(j1Var2.c, 0, copyOf2, j1Var.a, j1Var2.a);
        return new j1(i, copyOf, copyOf2, true);
    }

    static j1 e() {
        return new j1(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int a;
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
                    i = s.a(i6 << 3) + 8;
                } else if (i7 == 2) {
                    zzaby zzabyVar = (zzaby) this.c[i4];
                    int a2 = s.a(i6 << 3);
                    int e = zzabyVar.e();
                    i3 += a2 + s.a(e) + e;
                } else if (i7 == 3) {
                    int C = s.C(i6);
                    a = C + C;
                    b = ((j1) this.c[i4]).a();
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException(zzadi.a());
                    }
                    ((Integer) this.c[i4]).intValue();
                    i = s.a(i6 << 3) + 4;
                }
                i3 += i;
            } else {
                long longValue = ((Long) this.c[i4]).longValue();
                a = s.a(i6 << 3);
                b = s.b(longValue);
            }
            i = a + b;
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
            int i4 = this.b[i3];
            zzaby zzabyVar = (zzaby) this.c[i3];
            int a = s.a(8);
            int e = zzabyVar.e();
            i2 += a + a + s.a(16) + s.a(i4 >>> 3) + s.a(24) + s.a(e) + e;
        }
        this.d = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        int i = this.a;
        if (i == j1Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = j1Var.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = j1Var.c;
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

    public final void f() {
        this.e = false;
    }

    final void g(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            t0.b(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
        }
    }

    final void h(int i, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.b = Arrays.copyOf(iArr, i3);
            this.c = Arrays.copyOf(this.c, i3);
        }
        int[] iArr2 = this.b;
        int i4 = this.a;
        iArr2[i4] = i;
        this.c[i4] = obj;
        this.a = i4 + 1;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final void i(v1 v1Var) {
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    v1Var.zzt(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    v1Var.zzm(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    v1Var.c(i3, (zzaby) obj);
                } else if (i4 == 3) {
                    v1Var.zzE(i3);
                    ((j1) obj).i(v1Var);
                    v1Var.zzh(i3);
                } else {
                    if (i4 != 5) {
                        throw new RuntimeException(zzadi.a());
                    }
                    v1Var.zzk(i3, ((Integer) obj).intValue());
                }
            }
        }
    }
}
