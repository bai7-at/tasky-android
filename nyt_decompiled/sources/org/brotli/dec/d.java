package org.brotli.dec;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import okhttp3.internal.http2.Settings;

/* loaded from: classes5.dex */
abstract class d {
    private static final int[] a = {1, 2, 3, 4, 0, 5, 17, 6, 16, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    private static final int[] b = {3, 2, 1, 0, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2};
    private static final int[] c = {0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3};
    private static final int[] d = {131072, 131076, 131075, 196610, 131072, 131076, 131075, 262145, 131072, 131076, 131075, 196610, 131072, 131076, 131075, 262149};

    private static void a(j jVar) {
        a aVar = jVar.c;
        byte[] bArr = jVar.d;
        int i = jVar.g;
        if (i <= 0) {
            a.k(aVar);
            jVar.a = 1;
            return;
        }
        int min = Math.min(jVar.Q - jVar.r, i);
        a.c(aVar, bArr, jVar.r, min);
        jVar.g -= min;
        int i2 = jVar.r + min;
        jVar.r = i2;
        int i3 = jVar.Q;
        if (i2 != i3) {
            a.k(aVar);
            jVar.a = 1;
        } else {
            jVar.b = 5;
            jVar.Y = i3;
            jVar.X = 0;
            jVar.a = 12;
        }
    }

    private static void b(j jVar, int i) {
        a aVar = jVar.c;
        int[] iArr = jVar.p;
        int i2 = i * 2;
        a.d(aVar);
        int i3 = i * 1080;
        int r = r(jVar.e, i3, aVar);
        jVar.n[i] = m(jVar.f, i3, aVar);
        int i4 = r == 1 ? iArr[i2 + 1] + 1 : r == 0 ? iArr[i2] : r - 2;
        int i5 = jVar.o[i];
        if (i4 >= i5) {
            i4 -= i5;
        }
        int i6 = i2 + 1;
        iArr[i2] = iArr[i6];
        iArr[i6] = i4;
    }

    private static void c(j jVar) {
        b(jVar, 1);
        jVar.F = jVar.l.c[jVar.p[3]];
    }

    private static int d(int i, byte[] bArr, a aVar) {
        a.j(aVar);
        int h = h(aVar) + 1;
        if (h == 1) {
            l.a(bArr, 0, i);
            return h;
        }
        int i2 = a.i(aVar, 1) == 1 ? a.i(aVar, 4) + 1 : 0;
        int[] iArr = new int[1080];
        n(h + i2, iArr, 0, aVar);
        int i3 = 0;
        while (i3 < i) {
            a.j(aVar);
            a.d(aVar);
            int r = r(iArr, 0, aVar);
            if (r == 0) {
                bArr[i3] = 0;
            } else if (r <= i2) {
                for (int i4 = (1 << r) + a.i(aVar, r); i4 != 0; i4--) {
                    if (i3 >= i) {
                        throw new BrotliRuntimeException("Corrupted context map");
                    }
                    bArr[i3] = 0;
                    i3++;
                }
            } else {
                bArr[i3] = (byte) (r - i2);
            }
            i3++;
        }
        if (a.i(aVar, 1) == 1) {
            j(bArr, i);
        }
        return h;
    }

    private static void e(j jVar) {
        b(jVar, 2);
        jVar.C = jVar.p[5] << 2;
    }

    private static void f(j jVar) {
        b(jVar, 0);
        int i = jVar.p[1];
        int i2 = i << 6;
        jVar.B = i2;
        int i3 = jVar.A[i2] & 255;
        jVar.v = i3;
        jVar.w = jVar.k.c[i3];
        byte b2 = jVar.z[i];
        int[] iArr = c.b;
        jVar.D = iArr[b2];
        jVar.E = iArr[b2 + 1];
    }

    private static void g(a aVar, j jVar) {
        boolean z = a.i(aVar, 1) == 1;
        jVar.h = z;
        jVar.g = 0;
        jVar.i = false;
        jVar.j = false;
        if (!z || a.i(aVar, 1) == 0) {
            int i = a.i(aVar, 2) + 4;
            if (i == 7) {
                jVar.j = true;
                if (a.i(aVar, 1) != 0) {
                    throw new BrotliRuntimeException("Corrupted reserved bit");
                }
                int i2 = a.i(aVar, 2);
                if (i2 == 0) {
                    return;
                }
                for (int i3 = 0; i3 < i2; i3++) {
                    int i4 = a.i(aVar, 8);
                    if (i4 == 0 && i3 + 1 == i2 && i2 > 1) {
                        throw new BrotliRuntimeException("Exuberant nibble");
                    }
                    jVar.g = (i4 << (i3 * 8)) | jVar.g;
                }
            } else {
                for (int i5 = 0; i5 < i; i5++) {
                    int i6 = a.i(aVar, 4);
                    if (i6 == 0 && i5 + 1 == i && i > 4) {
                        throw new BrotliRuntimeException("Exuberant nibble");
                    }
                    jVar.g = (i6 << (i5 * 4)) | jVar.g;
                }
            }
            jVar.g++;
            if (jVar.h) {
                return;
            }
            jVar.i = a.i(aVar, 1) == 1;
        }
    }

    private static int h(a aVar) {
        if (a.i(aVar, 1) == 0) {
            return 0;
        }
        int i = a.i(aVar, 3);
        if (i == 0) {
            return 1;
        }
        return a.i(aVar, i) + (1 << i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x00a6, code lost:
    
        throw new org.brotli.dec.BrotliRuntimeException("Invalid backward reference");
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0307 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0013 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0013 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013b A[LOOP:2: B:55:0x013b->B:136:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void i(org.brotli.dec.j r19) {
        /*
            Method dump skipped, instructions count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.brotli.dec.d.i(org.brotli.dec.j):void");
    }

    private static void j(byte[] bArr, int i) {
        int[] iArr = new int[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = bArr[i3] & 255;
            bArr[i3] = (byte) iArr[i4];
            if (i4 != 0) {
                l(iArr, i4);
            }
        }
    }

    private static void k(j jVar) {
        int i;
        int i2 = jVar.P;
        long j = i2;
        long j2 = jVar.R;
        if (j > j2) {
            while (true) {
                int i3 = i2 >> 1;
                if (i3 <= ((int) j2) + jVar.S.length) {
                    break;
                } else {
                    i2 = i3;
                }
            }
            if (!jVar.h && i2 < 16384 && jVar.P >= 16384) {
                i2 = 16384;
            }
        }
        int i4 = jVar.Q;
        if (i2 <= i4) {
            return;
        }
        byte[] bArr = new byte[i2 + 37];
        byte[] bArr2 = jVar.d;
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr, 0, i4);
        } else {
            byte[] bArr3 = jVar.S;
            if (bArr3.length != 0) {
                int length = bArr3.length;
                int i5 = jVar.O;
                if (length > i5) {
                    i = length - i5;
                } else {
                    i5 = length;
                    i = 0;
                }
                System.arraycopy(bArr3, i, bArr, 0, i5);
                jVar.r = i5;
                jVar.T = i5;
            }
        }
        jVar.d = bArr;
        jVar.Q = i2;
    }

    private static void l(int[] iArr, int i) {
        int i2 = iArr[i];
        while (i > 0) {
            iArr[i] = iArr[i - 1];
            i--;
        }
        iArr[0] = i2;
    }

    private static int m(int[] iArr, int i, a aVar) {
        a.d(aVar);
        int r = r(iArr, i, aVar);
        return i.a[r] + a.i(aVar, i.b[r]);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void n(int r15, int[] r16, int r17, org.brotli.dec.a r18) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.brotli.dec.d.n(int, int[], int, org.brotli.dec.a):void");
    }

    private static void o(int[] iArr, int i, int[] iArr2, a aVar) {
        int[] iArr3 = new int[32];
        f.a(iArr3, 0, 5, iArr, 18);
        int i2 = 8;
        int i3 = 32768;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < i && i3 > 0) {
            a.j(aVar);
            a.d(aVar);
            long j = aVar.f;
            int i7 = aVar.g;
            int i8 = iArr3[((int) (j >>> i7)) & 31];
            aVar.g = i7 + (i8 >> 16);
            int i9 = i8 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            if (i9 < 16) {
                int i10 = i4 + 1;
                iArr2[i4] = i9;
                if (i9 != 0) {
                    i3 -= 32768 >> i9;
                    i4 = i10;
                    i2 = i9;
                } else {
                    i4 = i10;
                }
                i6 = 0;
            } else {
                int i11 = i9 - 14;
                int i12 = i9 == 16 ? i2 : 0;
                if (i5 != i12) {
                    i6 = 0;
                    i5 = i12;
                }
                int i13 = (i6 > 0 ? (i6 - 2) << i11 : i6) + a.i(aVar, i11) + 3;
                int i14 = i13 - i6;
                if (i4 + i14 > i) {
                    throw new BrotliRuntimeException("symbol + repeatDelta > numSymbols");
                }
                int i15 = 0;
                while (i15 < i14) {
                    iArr2[i4] = i5;
                    i15++;
                    i4++;
                }
                if (i5 != 0) {
                    i3 -= i14 << (15 - i5);
                }
                i6 = i13;
            }
        }
        if (i3 != 0) {
            throw new BrotliRuntimeException("Unused space");
        }
        l.b(iArr2, i4, i - i4);
    }

    private static void p(j jVar) {
        int i;
        int[] iArr;
        a aVar = jVar.c;
        for (int i2 = 0; i2 < 3; i2++) {
            jVar.o[i2] = h(aVar) + 1;
            jVar.n[i2] = 268435456;
            int i3 = jVar.o[i2];
            if (i3 > 1) {
                int i4 = i2 * 1080;
                n(i3 + 2, jVar.e, i4, aVar);
                n(26, jVar.f, i4, aVar);
                jVar.n[i2] = m(jVar.f, i4, aVar);
            }
        }
        a.j(aVar);
        jVar.K = a.i(aVar, 2);
        int i5 = a.i(aVar, 4);
        int i6 = jVar.K;
        int i7 = (i5 << i6) + 16;
        jVar.I = i7;
        jVar.J = (1 << i6) - 1;
        int i8 = i7 + (48 << i6);
        jVar.z = new byte[jVar.o[0]];
        int i9 = 0;
        while (true) {
            i = jVar.o[0];
            if (i9 >= i) {
                break;
            }
            int min = Math.min(i9 + 96, i);
            while (i9 < min) {
                jVar.z[i9] = (byte) (a.i(aVar, 2) << 1);
                i9++;
            }
            a.j(aVar);
        }
        byte[] bArr = new byte[i << 6];
        jVar.A = bArr;
        int d2 = d(i << 6, bArr, aVar);
        jVar.u = true;
        int i10 = 0;
        while (true) {
            iArr = jVar.o;
            if (i10 >= (iArr[0] << 6)) {
                break;
            }
            if (jVar.A[i10] != (i10 >> 6)) {
                jVar.u = false;
                break;
            }
            i10++;
        }
        int i11 = iArr[2];
        byte[] bArr2 = new byte[i11 << 2];
        jVar.H = bArr2;
        int d3 = d(i11 << 2, bArr2, aVar);
        g.b(jVar.k, JceEncryptionConstants.SYMMETRIC_KEY_LENGTH, d2);
        g.b(jVar.l, 704, jVar.o[1]);
        g.b(jVar.m, i8, d3);
        g.a(jVar.k, aVar);
        g.a(jVar.l, aVar);
        g.a(jVar.m, aVar);
        jVar.B = 0;
        jVar.C = 0;
        int[] iArr2 = c.b;
        byte b2 = jVar.z[0];
        jVar.D = iArr2[b2];
        jVar.E = iArr2[b2 + 1];
        jVar.v = 0;
        jVar.w = jVar.k.c[0];
        jVar.F = jVar.l.c[0];
        int[] iArr3 = jVar.p;
        iArr3[4] = 1;
        iArr3[2] = 1;
        iArr3[0] = 1;
        iArr3[5] = 0;
        iArr3[3] = 0;
        iArr3[1] = 0;
    }

    private static void q(j jVar) {
        a aVar = jVar.c;
        if (jVar.h) {
            jVar.b = 10;
            jVar.Y = jVar.r;
            jVar.X = 0;
            jVar.a = 12;
            return;
        }
        g gVar = jVar.k;
        gVar.b = null;
        gVar.c = null;
        g gVar2 = jVar.l;
        gVar2.b = null;
        gVar2.c = null;
        g gVar3 = jVar.m;
        gVar3.b = null;
        gVar3.c = null;
        a.j(aVar);
        g(aVar, jVar);
        if (jVar.g != 0 || jVar.j) {
            if (jVar.i || jVar.j) {
                a.g(aVar);
                jVar.a = jVar.j ? 4 : 5;
            } else {
                jVar.a = 2;
            }
            if (jVar.j) {
                return;
            }
            jVar.R += jVar.g;
            if (jVar.Q < jVar.P) {
                k(jVar);
            }
        }
    }

    private static int r(int[] iArr, int i, a aVar) {
        long j = aVar.f;
        int i2 = aVar.g;
        int i3 = (int) (j >>> i2);
        int i4 = i + (i3 & 255);
        int i5 = iArr[i4];
        int i6 = i5 >> 16;
        int i7 = i5 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        if (i6 <= 8) {
            aVar.g = i2 + i6;
            return i7;
        }
        int i8 = iArr[i4 + i7 + ((i3 & ((1 << i6) - 1)) >>> 8)];
        aVar.g = i2 + (i8 >> 16) + 8;
        return i8 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    }

    static void s(j jVar, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        jVar.S = bArr;
    }

    private static int t(int i, int[] iArr, int i2) {
        return i < 16 ? iArr[(i2 + b[i]) & 3] + c[i] : i - 15;
    }

    private static boolean u(j jVar) {
        int i = jVar.T;
        if (i != 0) {
            jVar.X += i;
            jVar.T = 0;
        }
        int min = Math.min(jVar.V - jVar.W, jVar.Y - jVar.X);
        if (min != 0) {
            System.arraycopy(jVar.d, jVar.X, jVar.Z, jVar.U + jVar.W, min);
            jVar.W += min;
            jVar.X += min;
        }
        return jVar.W < jVar.V;
    }
}
