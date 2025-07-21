package com.google.android.gms.internal.pal;

import defpackage.mw9;

/* loaded from: classes3.dex */
abstract class h {
    static int a(byte[] bArr, int i, g gVar) {
        int j = j(bArr, i, gVar);
        int i2 = gVar.a;
        if (i2 < 0) {
            throw zzadi.f();
        }
        if (i2 > bArr.length - j) {
            throw zzadi.i();
        }
        if (i2 == 0) {
            gVar.c = zzaby.a;
            return j;
        }
        gVar.c = zzaby.v(bArr, j, i2);
        return j + i2;
    }

    static int b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static int c(d1 d1Var, byte[] bArr, int i, int i2, int i3, g gVar) {
        u0 u0Var = (u0) d1Var;
        Object zze = u0Var.zze();
        int B = u0Var.B(zze, bArr, i, i2, i3, gVar);
        u0Var.zzf(zze);
        gVar.c = zze;
        return B;
    }

    static int d(d1 d1Var, byte[] bArr, int i, int i2, g gVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = k(i4, bArr, i3, gVar);
            i4 = gVar.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzadi.i();
        }
        Object zze = d1Var.zze();
        int i6 = i4 + i5;
        d1Var.a(zze, bArr, i5, i6, gVar);
        d1Var.zzf(zze);
        gVar.c = zze;
        return i6;
    }

    static int e(d1 d1Var, int i, byte[] bArr, int i2, int i3, mw9 mw9Var, g gVar) {
        int d = d(d1Var, bArr, i2, i3, gVar);
        mw9Var.add(gVar.c);
        while (d < i3) {
            int j = j(bArr, d, gVar);
            if (i != gVar.a) {
                break;
            }
            d = d(d1Var, bArr, j, i3, gVar);
            mw9Var.add(gVar.c);
        }
        return d;
    }

    static int f(byte[] bArr, int i, mw9 mw9Var, g gVar) {
        e0 e0Var = (e0) mw9Var;
        int j = j(bArr, i, gVar);
        int i2 = gVar.a + j;
        while (j < i2) {
            j = j(bArr, j, gVar);
            e0Var.f(gVar.a);
        }
        if (j == i2) {
            return j;
        }
        throw zzadi.i();
    }

    static int g(byte[] bArr, int i, g gVar) {
        int j = j(bArr, i, gVar);
        int i2 = gVar.a;
        if (i2 < 0) {
            throw zzadi.f();
        }
        if (i2 == 0) {
            gVar.c = "";
            return j;
        }
        gVar.c = new String(bArr, j, i2, f0.b);
        return j + i2;
    }

    static int h(byte[] bArr, int i, g gVar) {
        int j = j(bArr, i, gVar);
        int i2 = gVar.a;
        if (i2 < 0) {
            throw zzadi.f();
        }
        if (i2 == 0) {
            gVar.c = "";
            return j;
        }
        gVar.c = t1.d(bArr, j, i2);
        return j + i2;
    }

    static int i(int i, byte[] bArr, int i2, int i3, j1 j1Var, g gVar) {
        if ((i >>> 3) == 0) {
            throw zzadi.c();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int m = m(bArr, i2, gVar);
            j1Var.h(i, Long.valueOf(gVar.b));
            return m;
        }
        if (i4 == 1) {
            j1Var.h(i, Long.valueOf(n(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int j = j(bArr, i2, gVar);
            int i5 = gVar.a;
            if (i5 < 0) {
                throw zzadi.f();
            }
            if (i5 > bArr.length - j) {
                throw zzadi.i();
            }
            if (i5 == 0) {
                j1Var.h(i, zzaby.a);
            } else {
                j1Var.h(i, zzaby.v(bArr, j, i5));
            }
            return j + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw zzadi.c();
            }
            j1Var.h(i, Integer.valueOf(b(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        j1 e = j1.e();
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int j2 = j(bArr, i2, gVar);
            int i8 = gVar.a;
            if (i8 == i6) {
                i7 = i8;
                i2 = j2;
                break;
            }
            i7 = i8;
            i2 = i(i8, bArr, j2, i3, e, gVar);
        }
        if (i2 > i3 || i7 != i6) {
            throw zzadi.g();
        }
        j1Var.h(i, e);
        return i2;
    }

    static int j(byte[] bArr, int i, g gVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return k(b, bArr, i2, gVar);
        }
        gVar.a = b;
        return i2;
    }

    static int k(int i, byte[] bArr, int i2, g gVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            gVar.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            gVar.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            gVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            gVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                gVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int l(int i, byte[] bArr, int i2, int i3, mw9 mw9Var, g gVar) {
        e0 e0Var = (e0) mw9Var;
        int j = j(bArr, i2, gVar);
        e0Var.f(gVar.a);
        while (j < i3) {
            int j2 = j(bArr, j, gVar);
            if (i != gVar.a) {
                break;
            }
            j = j(bArr, j2, gVar);
            e0Var.f(gVar.a);
        }
        return j;
    }

    static int m(byte[] bArr, int i, g gVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            gVar.b = j;
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
        gVar.b = j2;
        return i3;
    }

    static long n(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
