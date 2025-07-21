package defpackage;

import defpackage.ad0;

/* loaded from: classes5.dex */
public abstract class b {
    private static final byte[] a = an9.a("0123456789abcdef");

    public static final ad0.c a(ad0 ad0Var, ad0.c cVar) {
        zq3.h(ad0Var, "<this>");
        zq3.h(cVar, "unsafeCursor");
        ad0.c g = p.g(cVar);
        if (g.a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        g.a = ad0Var;
        g.b = true;
        return g;
    }

    public static final byte[] b() {
        return a;
    }

    public static final boolean c(ji7 ji7Var, int i, byte[] bArr, int i2, int i3) {
        zq3.h(ji7Var, "segment");
        zq3.h(bArr, "bytes");
        int i4 = ji7Var.c;
        byte[] bArr2 = ji7Var.a;
        while (i2 < i3) {
            if (i == i4) {
                ji7Var = ji7Var.f;
                zq3.e(ji7Var);
                byte[] bArr3 = ji7Var.a;
                bArr2 = bArr3;
                i = ji7Var.b;
                i4 = ji7Var.c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String d(ad0 ad0Var, long j) {
        zq3.h(ad0Var, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (ad0Var.r(j2) == 13) {
                String s0 = ad0Var.s0(j2);
                ad0Var.skip(2L);
                return s0;
            }
        }
        String s02 = ad0Var.s0(j);
        ad0Var.skip(1L);
        return s02;
    }

    public static final int e(ad0 ad0Var, tk5 tk5Var, boolean z) {
        int i;
        int i2;
        ji7 ji7Var;
        int i3;
        int i4;
        zq3.h(ad0Var, "<this>");
        zq3.h(tk5Var, "options");
        ji7 ji7Var2 = ad0Var.a;
        if (ji7Var2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = ji7Var2.a;
        int i5 = ji7Var2.b;
        int i6 = ji7Var2.c;
        int[] j = tk5Var.j();
        ji7 ji7Var3 = ji7Var2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = j[i8];
            int i11 = i8 + 2;
            int i12 = j[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (ji7Var3 == null) {
                break;
            }
            if (i10 >= 0) {
                i = i5 + 1;
                int i13 = bArr[i5] & 255;
                int i14 = i11 + i10;
                while (i11 != i14) {
                    if (i13 == j[i11]) {
                        i2 = j[i11 + i10];
                        if (i == i6) {
                            ji7Var3 = ji7Var3.f;
                            zq3.e(ji7Var3);
                            i = ji7Var3.b;
                            bArr = ji7Var3.a;
                            i6 = ji7Var3.c;
                            if (ji7Var3 == ji7Var2) {
                                ji7Var3 = null;
                            }
                        }
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i15 = i11 + (i10 * (-1));
            while (true) {
                int i16 = i5 + 1;
                int i17 = i11 + 1;
                if ((bArr[i5] & 255) != j[i11]) {
                    return i7;
                }
                boolean z2 = i17 == i15;
                if (i16 == i6) {
                    zq3.e(ji7Var3);
                    ji7 ji7Var4 = ji7Var3.f;
                    zq3.e(ji7Var4);
                    i4 = ji7Var4.b;
                    byte[] bArr2 = ji7Var4.a;
                    i3 = ji7Var4.c;
                    if (ji7Var4 != ji7Var2) {
                        ji7Var = ji7Var4;
                        bArr = bArr2;
                    } else {
                        if (!z2) {
                            break loop0;
                        }
                        bArr = bArr2;
                        ji7Var = null;
                    }
                } else {
                    ji7Var = ji7Var3;
                    i3 = i6;
                    i4 = i16;
                }
                if (z2) {
                    i2 = j[i17];
                    i = i4;
                    i6 = i3;
                    ji7Var3 = ji7Var;
                    break;
                }
                i5 = i4;
                i6 = i3;
                ji7Var3 = ji7Var;
                i11 = i17;
            }
            if (i2 >= 0) {
                return i2;
            }
            i8 = -i2;
            i5 = i;
        }
        if (z) {
            return -2;
        }
        return i7;
    }

    public static /* synthetic */ int f(ad0 ad0Var, tk5 tk5Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return e(ad0Var, tk5Var, z);
    }
}
