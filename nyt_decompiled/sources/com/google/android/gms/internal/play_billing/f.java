package com.google.android.gms.internal.play_billing;

import defpackage.ehb;
import defpackage.lh4;

/* loaded from: classes3.dex */
abstract class f {
    static int a(byte[] bArr, int i, e eVar) {
        int j = j(bArr, i, eVar);
        int i2 = eVar.a;
        if (i2 < 0) {
            throw zzci.d();
        }
        if (i2 > bArr.length - j) {
            throw zzci.g();
        }
        if (i2 == 0) {
            eVar.c = zzba.a;
            return j;
        }
        eVar.c = zzba.q(bArr, j, i2);
        return j + i2;
    }

    static int b(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static int c(w0 w0Var, byte[] bArr, int i, int i2, int i3, e eVar) {
        Object zze = w0Var.zze();
        int n = n(zze, w0Var, bArr, i, i2, i3, eVar);
        w0Var.zzf(zze);
        eVar.c = zze;
        return n;
    }

    static int d(w0 w0Var, byte[] bArr, int i, int i2, e eVar) {
        Object zze = w0Var.zze();
        int o = o(zze, w0Var, bArr, i, i2, eVar);
        w0Var.zzf(zze);
        eVar.c = zze;
        return o;
    }

    static int e(w0 w0Var, int i, byte[] bArr, int i2, int i3, ehb ehbVar, e eVar) {
        int d = d(w0Var, bArr, i2, i3, eVar);
        ehbVar.add(eVar.c);
        while (d < i3) {
            int j = j(bArr, d, eVar);
            if (i != eVar.a) {
                break;
            }
            d = d(w0Var, bArr, j, i3, eVar);
            ehbVar.add(eVar.c);
        }
        return d;
    }

    static int f(byte[] bArr, int i, ehb ehbVar, e eVar) {
        lh4.a(ehbVar);
        int j = j(bArr, i, eVar);
        int i2 = eVar.a + j;
        if (j < i2) {
            j(bArr, j, eVar);
            throw null;
        }
        if (j == i2) {
            return j;
        }
        throw zzci.g();
    }

    static int g(byte[] bArr, int i, e eVar) {
        int j = j(bArr, i, eVar);
        int i2 = eVar.a;
        if (i2 < 0) {
            throw zzci.d();
        }
        if (i2 == 0) {
            eVar.c = "";
            return j;
        }
        eVar.c = new String(bArr, j, i2, b0.b);
        return j + i2;
    }

    static int h(byte[] bArr, int i, e eVar) {
        int j = j(bArr, i, eVar);
        int i2 = eVar.a;
        if (i2 < 0) {
            throw zzci.d();
        }
        if (i2 == 0) {
            eVar.c = "";
            return j;
        }
        int i3 = l1.b;
        int length = bArr.length;
        if ((((length - j) - i2) | j | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(j), Integer.valueOf(i2)));
        }
        int i4 = j + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (j < i4) {
            byte b = bArr[j];
            if (!i1.d(b)) {
                break;
            }
            j++;
            cArr[i5] = (char) b;
            i5++;
        }
        int i6 = i5;
        while (j < i4) {
            int i7 = j + 1;
            byte b2 = bArr[j];
            if (i1.d(b2)) {
                cArr[i6] = (char) b2;
                i6++;
                j = i7;
                while (j < i4) {
                    byte b3 = bArr[j];
                    if (i1.d(b3)) {
                        j++;
                        cArr[i6] = (char) b3;
                        i6++;
                    }
                }
            } else if (b2 < -32) {
                if (i7 >= i4) {
                    throw zzci.c();
                }
                j += 2;
                i1.c(b2, bArr[i7], cArr, i6);
                i6++;
            } else if (b2 < -16) {
                if (i7 >= i4 - 1) {
                    throw zzci.c();
                }
                int i8 = j + 2;
                j += 3;
                i1.b(b2, bArr[i7], bArr[i8], cArr, i6);
                i6++;
            } else {
                if (i7 >= i4 - 2) {
                    throw zzci.c();
                }
                byte b4 = bArr[i7];
                int i9 = j + 3;
                byte b5 = bArr[j + 2];
                j += 4;
                i1.a(b2, b4, b5, bArr[i9], cArr, i6);
                i6 += 2;
            }
        }
        eVar.c = new String(cArr, 0, i6);
        return i4;
    }

    static int i(int i, byte[] bArr, int i2, int i3, b1 b1Var, e eVar) {
        if ((i >>> 3) == 0) {
            throw zzci.b();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int m = m(bArr, i2, eVar);
            b1Var.j(i, Long.valueOf(eVar.b));
            return m;
        }
        if (i4 == 1) {
            b1Var.j(i, Long.valueOf(p(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int j = j(bArr, i2, eVar);
            int i5 = eVar.a;
            if (i5 < 0) {
                throw zzci.d();
            }
            if (i5 > bArr.length - j) {
                throw zzci.g();
            }
            if (i5 == 0) {
                b1Var.j(i, zzba.a);
            } else {
                b1Var.j(i, zzba.q(bArr, j, i5));
            }
            return j + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw zzci.b();
            }
            b1Var.j(i, Integer.valueOf(b(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        b1 f = b1.f();
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int j2 = j(bArr, i2, eVar);
            int i8 = eVar.a;
            i7 = i8;
            if (i8 == i6) {
                i2 = j2;
                break;
            }
            int i9 = i(i7, bArr, j2, i3, f, eVar);
            i7 = i8;
            i2 = i9;
        }
        if (i2 > i3 || i7 != i6) {
            throw zzci.e();
        }
        b1Var.j(i, f);
        return i2;
    }

    static int j(byte[] bArr, int i, e eVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return k(b, bArr, i2, eVar);
        }
        eVar.a = b;
        return i2;
    }

    static int k(int i, byte[] bArr, int i2, e eVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            eVar.a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            eVar.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            eVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            eVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                eVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int l(int i, byte[] bArr, int i2, int i3, ehb ehbVar, e eVar) {
        lh4.a(ehbVar);
        j(bArr, i2, eVar);
        int i4 = eVar.a;
        throw null;
    }

    static int m(byte[] bArr, int i, e eVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            eVar.b = j;
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
        eVar.b = j2;
        return i3;
    }

    static int n(Object obj, w0 w0Var, byte[] bArr, int i, int i2, int i3, e eVar) {
        int A = ((p0) w0Var).A(obj, bArr, i, i2, i3, eVar);
        eVar.c = obj;
        return A;
    }

    static int o(Object obj, w0 w0Var, byte[] bArr, int i, int i2, e eVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = k(i4, bArr, i3, eVar);
            i4 = eVar.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzci.g();
        }
        int i6 = i4 + i5;
        w0Var.d(obj, bArr, i5, i6, eVar);
        eVar.c = obj;
        return i6;
    }

    static long p(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}
