package com.google.android.gms.internal.measurement;

import defpackage.tbf;

/* loaded from: classes3.dex */
abstract class t1 {
    static int a(byte[] bArr, int i, s1 s1Var) {
        int j = j(bArr, i, s1Var);
        int i2 = s1Var.a;
        if (i2 < 0) {
            throw zzkm.d();
        }
        if (i2 > bArr.length - j) {
            throw zzkm.f();
        }
        if (i2 == 0) {
            s1Var.c = zzjb.a;
            return j;
        }
        s1Var.c = zzjb.q(bArr, j, i2);
        return j + i2;
    }

    static int b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static int c(h3 h3Var, byte[] bArr, int i, int i2, int i3, s1 s1Var) {
        z2 z2Var = (z2) h3Var;
        Object zze = z2Var.zze();
        int y = z2Var.y(zze, bArr, i, i2, i3, s1Var);
        z2Var.zzf(zze);
        s1Var.c = zze;
        return y;
    }

    static int d(h3 h3Var, byte[] bArr, int i, int i2, s1 s1Var) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = k(i4, bArr, i3, s1Var);
            i4 = s1Var.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzkm.f();
        }
        Object zze = h3Var.zze();
        int i6 = i4 + i5;
        h3Var.d(zze, bArr, i5, i6, s1Var);
        h3Var.zzf(zze);
        s1Var.c = zze;
        return i6;
    }

    static int e(h3 h3Var, int i, byte[] bArr, int i2, int i3, tbf tbfVar, s1 s1Var) {
        int d = d(h3Var, bArr, i2, i3, s1Var);
        tbfVar.add(s1Var.c);
        while (d < i3) {
            int j = j(bArr, d, s1Var);
            if (i != s1Var.a) {
                break;
            }
            d = d(h3Var, bArr, j, i3, s1Var);
            tbfVar.add(s1Var.c);
        }
        return d;
    }

    static int f(byte[] bArr, int i, tbf tbfVar, s1 s1Var) {
        k2 k2Var = (k2) tbfVar;
        int j = j(bArr, i, s1Var);
        int i2 = s1Var.a + j;
        while (j < i2) {
            j = j(bArr, j, s1Var);
            k2Var.zzh(s1Var.a);
        }
        if (j == i2) {
            return j;
        }
        throw zzkm.f();
    }

    static int g(byte[] bArr, int i, s1 s1Var) {
        int j = j(bArr, i, s1Var);
        int i2 = s1Var.a;
        if (i2 < 0) {
            throw zzkm.d();
        }
        if (i2 == 0) {
            s1Var.c = "";
            return j;
        }
        s1Var.c = new String(bArr, j, i2, l2.b);
        return j + i2;
    }

    static int h(byte[] bArr, int i, s1 s1Var) {
        int j = j(bArr, i, s1Var);
        int i2 = s1Var.a;
        if (i2 < 0) {
            throw zzkm.d();
        }
        if (i2 == 0) {
            s1Var.c = "";
            return j;
        }
        s1Var.c = w3.d(bArr, j, i2);
        return j + i2;
    }

    static int i(int i, byte[] bArr, int i2, int i3, m3 m3Var, s1 s1Var) {
        if ((i >>> 3) == 0) {
            throw zzkm.b();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int m = m(bArr, i2, s1Var);
            m3Var.h(i, Long.valueOf(s1Var.b));
            return m;
        }
        if (i4 == 1) {
            m3Var.h(i, Long.valueOf(n(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int j = j(bArr, i2, s1Var);
            int i5 = s1Var.a;
            if (i5 < 0) {
                throw zzkm.d();
            }
            if (i5 > bArr.length - j) {
                throw zzkm.f();
            }
            if (i5 == 0) {
                m3Var.h(i, zzjb.a);
            } else {
                m3Var.h(i, zzjb.q(bArr, j, i5));
            }
            return j + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw zzkm.b();
            }
            m3Var.h(i, Integer.valueOf(b(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        m3 e = m3.e();
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int j2 = j(bArr, i2, s1Var);
            int i8 = s1Var.a;
            if (i8 == i6) {
                i7 = i8;
                i2 = j2;
                break;
            }
            i7 = i8;
            i2 = i(i8, bArr, j2, i3, e, s1Var);
        }
        if (i2 > i3 || i7 != i6) {
            throw zzkm.e();
        }
        m3Var.h(i, e);
        return i2;
    }

    static int j(byte[] bArr, int i, s1 s1Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return k(b, bArr, i2, s1Var);
        }
        s1Var.a = b;
        return i2;
    }

    static int k(int i, byte[] bArr, int i2, s1 s1Var) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            s1Var.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            s1Var.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            s1Var.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            s1Var.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                s1Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int l(int i, byte[] bArr, int i2, int i3, tbf tbfVar, s1 s1Var) {
        k2 k2Var = (k2) tbfVar;
        int j = j(bArr, i2, s1Var);
        k2Var.zzh(s1Var.a);
        while (j < i3) {
            int j2 = j(bArr, j, s1Var);
            if (i != s1Var.a) {
                break;
            }
            j = j(bArr, j2, s1Var);
            k2Var.zzh(s1Var.a);
        }
        return j;
    }

    static int m(byte[] bArr, int i, s1 s1Var) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            s1Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        s1Var.b = j2;
        return i3;
    }

    static long n(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
