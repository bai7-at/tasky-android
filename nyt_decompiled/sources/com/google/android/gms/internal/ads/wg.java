package com.google.android.gms.internal.ads;

import defpackage.n1f;

/* loaded from: classes3.dex */
abstract class wg {
    static int a(byte[] bArr, int i, vg vgVar) {
        int h = h(bArr, i, vgVar);
        int i2 = vgVar.a;
        if (i2 < 0) {
            throw zzhag.f();
        }
        if (i2 > bArr.length - h) {
            throw zzhag.j();
        }
        if (i2 == 0) {
            vgVar.c = zzgyl.a;
            return h;
        }
        vgVar.c = zzgyl.D(bArr, h, i2);
        return h + i2;
    }

    static int b(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static int c(bj bjVar, byte[] bArr, int i, int i2, int i3, vg vgVar) {
        Object zze = bjVar.zze();
        int l = l(zze, bjVar, bArr, i, i2, i3, vgVar);
        bjVar.zzf(zze);
        vgVar.c = zze;
        return l;
    }

    static int d(bj bjVar, byte[] bArr, int i, int i2, vg vgVar) {
        Object zze = bjVar.zze();
        int m = m(zze, bjVar, bArr, i, i2, vgVar);
        bjVar.zzf(zze);
        vgVar.c = zze;
        return m;
    }

    static int e(bj bjVar, int i, byte[] bArr, int i2, int i3, n1f n1fVar, vg vgVar) {
        int d = d(bjVar, bArr, i2, i3, vgVar);
        n1fVar.add(vgVar.c);
        while (d < i3) {
            int h = h(bArr, d, vgVar);
            if (i != vgVar.a) {
                break;
            }
            d = d(bjVar, bArr, h, i3, vgVar);
            n1fVar.add(vgVar.c);
        }
        return d;
    }

    static int f(byte[] bArr, int i, n1f n1fVar, vg vgVar) {
        zh zhVar = (zh) n1fVar;
        int h = h(bArr, i, vgVar);
        int i2 = vgVar.a + h;
        while (h < i2) {
            h = h(bArr, h, vgVar);
            zhVar.zzh(vgVar.a);
        }
        if (h == i2) {
            return h;
        }
        throw zzhag.j();
    }

    static int g(int i, byte[] bArr, int i2, int i3, gj gjVar, vg vgVar) {
        if ((i >>> 3) == 0) {
            throw zzhag.c();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int k = k(bArr, i2, vgVar);
            gjVar.j(i, Long.valueOf(vgVar.b));
            return k;
        }
        if (i4 == 1) {
            gjVar.j(i, Long.valueOf(n(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int h = h(bArr, i2, vgVar);
            int i5 = vgVar.a;
            if (i5 < 0) {
                throw zzhag.f();
            }
            if (i5 > bArr.length - h) {
                throw zzhag.j();
            }
            if (i5 == 0) {
                gjVar.j(i, zzgyl.a);
            } else {
                gjVar.j(i, zzgyl.D(bArr, h, i5));
            }
            return h + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw zzhag.c();
            }
            gjVar.j(i, Integer.valueOf(b(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        gj f = gj.f();
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int h2 = h(bArr, i2, vgVar);
            int i8 = vgVar.a;
            i7 = i8;
            if (i8 == i6) {
                i2 = h2;
                break;
            }
            int g = g(i7, bArr, h2, i3, f, vgVar);
            i7 = i8;
            i2 = g;
        }
        if (i2 > i3 || i7 != i6) {
            throw zzhag.g();
        }
        gjVar.j(i, f);
        return i2;
    }

    static int h(byte[] bArr, int i, vg vgVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return i(b, bArr, i2, vgVar);
        }
        vgVar.a = b;
        return i2;
    }

    static int i(int i, byte[] bArr, int i2, vg vgVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            vgVar.a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            vgVar.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            vgVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            vgVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                vgVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int j(int i, byte[] bArr, int i2, int i3, n1f n1fVar, vg vgVar) {
        zh zhVar = (zh) n1fVar;
        int h = h(bArr, i2, vgVar);
        zhVar.zzh(vgVar.a);
        while (h < i3) {
            int h2 = h(bArr, h, vgVar);
            if (i != vgVar.a) {
                break;
            }
            h = h(bArr, h2, vgVar);
            zhVar.zzh(vgVar.a);
        }
        return h;
    }

    static int k(byte[] bArr, int i, vg vgVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            vgVar.b = j;
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
        vgVar.b = j2;
        return i3;
    }

    static int l(Object obj, bj bjVar, byte[] bArr, int i, int i2, int i3, vg vgVar) {
        int z = ((pi) bjVar).z(obj, bArr, i, i2, i3, vgVar);
        vgVar.c = obj;
        return z;
    }

    static int m(Object obj, bj bjVar, byte[] bArr, int i, int i2, vg vgVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = i(i4, bArr, i3, vgVar);
            i4 = vgVar.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzhag.j();
        }
        int i6 = i4 + i5;
        bjVar.c(obj, bArr, i5, i6, vgVar);
        vgVar.c = obj;
        return i6;
    }

    static long n(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}
