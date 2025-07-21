package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class kre {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object c = new Object();
    private static int[] d = new int[10];

    public static int a(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        wad.f(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            f(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            f(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            f(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b2 = bArr[i5];
            if ((b2 & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                    f(zArr);
                    return i6;
                }
                i5 = i6;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static int b(byte[] bArr, int i) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    try {
                        if (i3 >= i - 2) {
                            i3 = i;
                            break;
                        }
                        int i5 = i3 + 1;
                        if (bArr[i3] == 0 && bArr[i5] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3 = i5;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = d;
                    int length = iArr.length;
                    if (length <= i4) {
                        d = Arrays.copyOf(iArr, length + length);
                    }
                    d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = d[i8] - i6;
                System.arraycopy(bArr, i6, bArr, i7, i9);
                int i10 = i7 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i7 = i10 + 2;
                bArr[i11] = 0;
                i6 += i9 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i7, i2 - i7);
        }
        return i2;
    }

    public static eoe c(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr;
        int i10;
        int i11;
        mse mseVar = new mse(bArr, i, i2);
        int i12 = 4;
        mseVar.e(4);
        int a2 = mseVar.a(3);
        mseVar.d();
        int a3 = mseVar.a(2);
        boolean f = mseVar.f();
        int a4 = mseVar.a(5);
        int i13 = 0;
        for (int i14 = 0; i14 < 32; i14++) {
            if (mseVar.f()) {
                i13 |= 1 << i14;
            }
        }
        int i15 = 6;
        int[] iArr2 = new int[6];
        for (int i16 = 0; i16 < 6; i16++) {
            iArr2[i16] = mseVar.a(8);
        }
        int a5 = mseVar.a(8);
        int i17 = 0;
        for (int i18 = 0; i18 < a2; i18++) {
            if (mseVar.f()) {
                i17 += 89;
            }
            if (mseVar.f()) {
                i17 += 8;
            }
        }
        mseVar.e(i17);
        if (a2 > 0) {
            int i19 = 8 - a2;
            mseVar.e(i19 + i19);
        }
        int c2 = mseVar.c();
        int c3 = mseVar.c();
        if (c3 == 3) {
            mseVar.d();
            c3 = 3;
        }
        int c4 = mseVar.c();
        int c5 = mseVar.c();
        if (mseVar.f()) {
            int c6 = mseVar.c();
            int c7 = mseVar.c();
            int c8 = mseVar.c();
            int c9 = mseVar.c();
            if (c3 == 1) {
                i11 = 2;
            } else if (c3 == 2) {
                c3 = 2;
                i11 = 2;
            } else {
                i11 = 1;
            }
            c4 -= i11 * (c6 + c7);
            c5 -= (c3 == 1 ? 2 : 1) * (c8 + c9);
        }
        int i20 = c4;
        int i21 = c3;
        int i22 = c5;
        int c10 = mseVar.c();
        int c11 = mseVar.c();
        int c12 = mseVar.c();
        for (int i23 = true != mseVar.f() ? a2 : 0; i23 <= a2; i23++) {
            mseVar.c();
            mseVar.c();
            mseVar.c();
        }
        mseVar.c();
        mseVar.c();
        mseVar.c();
        mseVar.c();
        mseVar.c();
        mseVar.c();
        if (mseVar.f() && mseVar.f()) {
            int i24 = 0;
            while (i24 < i12) {
                int i25 = 0;
                while (i25 < i15) {
                    if (mseVar.f()) {
                        int min = Math.min(64, 1 << ((i24 + i24) + 4));
                        if (i24 > 1) {
                            mseVar.b();
                        }
                        for (int i26 = 0; i26 < min; i26++) {
                            mseVar.b();
                        }
                    } else {
                        mseVar.c();
                    }
                    i25 += i24 == 3 ? 3 : 1;
                    i15 = 6;
                }
                i24++;
                i12 = 4;
                i15 = 6;
            }
        }
        mseVar.e(2);
        if (mseVar.f()) {
            mseVar.e(8);
            mseVar.c();
            mseVar.c();
            mseVar.d();
        }
        int c13 = mseVar.c();
        int i27 = 0;
        int[] iArr3 = new int[0];
        int[] iArr4 = new int[0];
        int i28 = -1;
        int i29 = -1;
        int i30 = -1;
        while (i27 < c13) {
            if (i27 == 0 || !mseVar.f()) {
                i7 = c13;
                i8 = i13;
                i9 = i21;
                iArr = iArr2;
                int c14 = mseVar.c();
                int c15 = mseVar.c();
                int[] iArr5 = new int[c14];
                int i31 = 0;
                while (i31 < c14) {
                    iArr5[i31] = (i31 > 0 ? iArr5[i31 - 1] : 0) - (mseVar.c() + 1);
                    mseVar.d();
                    i31++;
                }
                int[] iArr6 = new int[c15];
                int i32 = 0;
                while (i32 < c15) {
                    iArr6[i32] = (i32 > 0 ? iArr6[i32 - 1] : 0) + mseVar.c() + 1;
                    mseVar.d();
                    i32++;
                }
                i30 = c15;
                iArr4 = iArr6;
                i29 = c14;
                iArr3 = iArr5;
            } else {
                int i33 = i29 + i30;
                boolean f2 = mseVar.f();
                int c16 = mseVar.c() + 1;
                int i34 = 1 - ((f2 ? 1 : 0) + (f2 ? 1 : 0));
                int i35 = i33 + 1;
                i7 = c13;
                boolean[] zArr = new boolean[i35];
                iArr = iArr2;
                for (int i36 = 0; i36 <= i33; i36++) {
                    if (mseVar.f()) {
                        zArr[i36] = true;
                    } else {
                        zArr[i36] = mseVar.f();
                    }
                }
                int i37 = i30 - 1;
                int[] iArr7 = new int[i35];
                int[] iArr8 = new int[i35];
                int i38 = 0;
                while (true) {
                    i10 = i34 * c16;
                    if (i37 < 0) {
                        break;
                    }
                    int i39 = iArr4[i37] + i10;
                    if (i39 < 0 && zArr[i29 + i37]) {
                        iArr7[i38] = i39;
                        i38++;
                    }
                    i37--;
                }
                if (i10 < 0 && zArr[i33]) {
                    iArr7[i38] = i10;
                    i38++;
                }
                i8 = i13;
                i9 = i21;
                int i40 = i38;
                for (int i41 = 0; i41 < i29; i41++) {
                    int i42 = iArr3[i41] + i10;
                    if (i42 < 0 && zArr[i41]) {
                        iArr7[i40] = i42;
                        i40++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr7, i40);
                int i43 = 0;
                for (int i44 = i29 - 1; i44 >= 0; i44--) {
                    int i45 = iArr3[i44] + i10;
                    if (i45 > 0 && zArr[i44]) {
                        iArr8[i43] = i45;
                        i43++;
                    }
                }
                if (i10 > 0 && zArr[i33]) {
                    iArr8[i43] = i10;
                    i43++;
                }
                int i46 = i43;
                for (int i47 = 0; i47 < i30; i47++) {
                    int i48 = iArr4[i47] + i10;
                    if (i48 > 0 && zArr[i29 + i47]) {
                        iArr8[i46] = i48;
                        i46++;
                    }
                }
                iArr4 = Arrays.copyOf(iArr8, i46);
                i30 = i46;
                iArr3 = copyOf;
                i29 = i40;
            }
            i27++;
            i21 = i9;
            i13 = i8;
            c13 = i7;
            iArr2 = iArr;
        }
        int i49 = i13;
        int i50 = i21;
        int[] iArr9 = iArr2;
        if (mseVar.f()) {
            int c17 = mseVar.c();
            for (int i51 = 0; i51 < c17; i51++) {
                mseVar.e(c12 + 5);
            }
        }
        mseVar.e(2);
        float f3 = 1.0f;
        if (mseVar.f()) {
            if (mseVar.f()) {
                int a6 = mseVar.a(8);
                if (a6 == 255) {
                    int a7 = mseVar.a(16);
                    int a8 = mseVar.a(16);
                    if (a7 != 0 && a8 != 0) {
                        f3 = a7 / a8;
                    }
                } else if (a6 < 17) {
                    f3 = b[a6];
                } else {
                    ezd.f("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + a6);
                }
            }
            if (mseVar.f()) {
                mseVar.d();
            }
            if (mseVar.f()) {
                mseVar.e(3);
                int i52 = true != mseVar.f() ? 2 : 1;
                if (mseVar.f()) {
                    int a9 = mseVar.a(8);
                    int a10 = mseVar.a(8);
                    mseVar.e(8);
                    int a11 = ayf.a(a9);
                    i6 = ayf.b(a10);
                    i4 = a11;
                } else {
                    i4 = -1;
                    i6 = -1;
                }
                i28 = i52;
            } else {
                i4 = -1;
                i6 = -1;
            }
            if (mseVar.f()) {
                mseVar.c();
                mseVar.c();
            }
            mseVar.d();
            if (mseVar.f()) {
                i22 += i22;
            }
            i5 = i6;
            i3 = i22;
        } else {
            i3 = i22;
            i4 = -1;
            i5 = -1;
        }
        return new eoe(a3, f, a4, i49, i50, c10, c11, iArr9, a5, c2, i20, i3, f3, i4, i28, i5);
    }

    public static gpe d(byte[] bArr, int i, int i2) {
        mse mseVar = new mse(bArr, 4, i2);
        int c2 = mseVar.c();
        int c3 = mseVar.c();
        mseVar.d();
        return new gpe(c2, c3, mseVar.f());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.iqe e(byte[] r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kre.e(byte[], int, int):iqe");
    }

    public static void f(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
