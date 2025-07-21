package defpackage;

import com.comscore.streaming.ContentType;

/* loaded from: classes3.dex */
public abstract class y02 {
    private static final int[] a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static int[] a(l80 l80Var, int i, int i2) {
        int[] iArr = new int[i2];
        int g = l80Var.g() / i;
        for (int i3 = 0; i3 < g; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4 |= l80Var.f((i3 * i) + i5) ? 1 << ((i - i5) - 1) : 0;
            }
            iArr[i3] = i4;
        }
        return iArr;
    }

    private static void b(m80 m80Var, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    m80Var.g(i5, i4);
                    m80Var.g(i5, i6);
                    m80Var.g(i4, i5);
                    m80Var.g(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        m80Var.g(i7, i7);
        int i8 = i7 + 1;
        m80Var.g(i8, i7);
        m80Var.g(i7, i8);
        int i9 = i + i2;
        m80Var.g(i9, i7);
        m80Var.g(i9, i8);
        m80Var.g(i9, i9 - 1);
    }

    private static void c(m80 m80Var, boolean z, int i, l80 l80Var) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (l80Var.f(i3)) {
                    m80Var.g(i4, i2 - 5);
                }
                if (l80Var.f(i3 + 7)) {
                    m80Var.g(i2 + 5, i4);
                }
                if (l80Var.f(20 - i3)) {
                    m80Var.g(i4, i2 + 5);
                }
                if (l80Var.f(27 - i3)) {
                    m80Var.g(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i2 - 5) + i3 + (i3 / 5);
            if (l80Var.f(i3)) {
                m80Var.g(i5, i2 - 7);
            }
            if (l80Var.f(i3 + 10)) {
                m80Var.g(i2 + 7, i5);
            }
            if (l80Var.f(29 - i3)) {
                m80Var.g(i5, i2 + 7);
            }
            if (l80Var.f(39 - i3)) {
                m80Var.g(i2 - 7, i5);
            }
            i3++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b30 d(byte[] bArr, int i, int i2) {
        l80 l80Var;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        l80 a2 = new b83(bArr).a();
        int g = ((a2.g() * i) / 100) + 11;
        int g2 = a2.g() + g;
        int i7 = 1;
        if (i2 == 0) {
            l80 l80Var2 = null;
            int i8 = 0;
            int i9 = 0;
            while (i8 <= 32) {
                boolean z2 = i8 <= 3 ? i7 : 0;
                int i10 = z2 != 0 ? i8 + 1 : i8;
                int i11 = i(i10, z2);
                if (g2 <= i11) {
                    if (l80Var2 == null || i9 != a[i10]) {
                        int i12 = a[i10];
                        i9 = i12;
                        l80Var2 = h(a2, i12);
                    }
                    int i13 = i11 - (i11 % i9);
                    if ((z2 == 0 || l80Var2.g() <= (i9 << 6)) && l80Var2.g() + g <= i13) {
                        l80Var = l80Var2;
                        i3 = i9;
                        z = z2;
                        i4 = i10;
                        i5 = i11;
                    }
                }
                i8++;
                i7 = i7;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        z = i2 < 0;
        i4 = Math.abs(i2);
        if (i4 > (z ? 4 : 32)) {
            throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i2)));
        }
        i5 = i(i4, z);
        i3 = a[i4];
        int i14 = i5 - (i5 % i3);
        l80Var = h(a2, i3);
        if (l80Var.g() + g > i14) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        if (z && l80Var.g() > (i3 << 6)) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        l80 e = e(l80Var, i5, i3);
        int g3 = l80Var.g() / i3;
        l80 f = f(z, i4, g3);
        int i15 = (z ? 11 : 14) + (i4 << 2);
        int[] iArr = new int[i15];
        int i16 = 2;
        if (z) {
            for (int i17 = 0; i17 < i15; i17++) {
                iArr[i17] = i17;
            }
            i6 = i15;
        } else {
            int i18 = i15 / 2;
            i6 = i15 + 1 + (((i18 - 1) / 15) * 2);
            int i19 = i6 / 2;
            for (int i20 = 0; i20 < i18; i20++) {
                iArr[(i18 - i20) - i7] = (i19 - r14) - 1;
                iArr[i18 + i20] = (i20 / 15) + i20 + i19 + i7;
            }
        }
        m80 m80Var = new m80(i6);
        int i21 = 0;
        int i22 = 0;
        while (i21 < i4) {
            int i23 = ((i4 - i21) << i16) + (z ? 9 : 12);
            int i24 = 0;
            while (i24 < i23) {
                int i25 = i24 << 1;
                int i26 = 0;
                while (i26 < i16) {
                    if (e.f(i22 + i25 + i26)) {
                        int i27 = i21 << 1;
                        m80Var.g(iArr[i27 + i26], iArr[i27 + i24]);
                    }
                    if (e.f((i23 << 1) + i22 + i25 + i26)) {
                        int i28 = i21 << 1;
                        m80Var.g(iArr[i28 + i24], iArr[((i15 - 1) - i28) - i26]);
                    }
                    if (e.f((i23 << 2) + i22 + i25 + i26)) {
                        int i29 = (i15 - 1) - (i21 << 1);
                        m80Var.g(iArr[i29 - i26], iArr[i29 - i24]);
                    }
                    if (e.f((i23 * 6) + i22 + i25 + i26)) {
                        int i30 = i21 << 1;
                        m80Var.g(iArr[((i15 - 1) - i30) - i24], iArr[i30 + i26]);
                    }
                    i26++;
                    i16 = 2;
                }
                i24++;
                i16 = 2;
            }
            i22 += i23 << 3;
            i21++;
            i16 = 2;
        }
        c(m80Var, z, i6, f);
        if (z) {
            b(m80Var, i6 / 2, 5);
        } else {
            int i31 = i6 / 2;
            b(m80Var, i31, 7);
            int i32 = 0;
            int i33 = 0;
            while (i33 < (i15 / 2) - 1) {
                for (int i34 = i31 & 1; i34 < i6; i34 += 2) {
                    int i35 = i31 - i32;
                    m80Var.g(i35, i34);
                    int i36 = i31 + i32;
                    m80Var.g(i36, i34);
                    m80Var.g(i34, i35);
                    m80Var.g(i34, i36);
                }
                i33 += 15;
                i32 += 16;
            }
        }
        b30 b30Var = new b30();
        b30Var.c(z);
        b30Var.f(i6);
        b30Var.d(i4);
        b30Var.b(g3);
        b30Var.e(m80Var);
        return b30Var;
    }

    private static l80 e(l80 l80Var, int i, int i2) {
        int g = l80Var.g() / i2;
        st6 st6Var = new st6(g(i2));
        int i3 = i / i2;
        int[] a2 = a(l80Var, i2, i3);
        st6Var.b(a2, i3 - g);
        l80 l80Var2 = new l80();
        l80Var2.c(0, i % i2);
        for (int i4 : a2) {
            l80Var2.c(i4, i2);
        }
        return l80Var2;
    }

    static l80 f(boolean z, int i, int i2) {
        l80 l80Var = new l80();
        if (z) {
            l80Var.c(i - 1, 2);
            l80Var.c(i2 - 1, 6);
            return e(l80Var, 28, 4);
        }
        l80Var.c(i - 1, 5);
        l80Var.c(i2 - 1, 11);
        return e(l80Var, 40, 4);
    }

    private static lx2 g(int i) {
        if (i == 4) {
            return lx2.k;
        }
        if (i == 6) {
            return lx2.j;
        }
        if (i == 8) {
            return lx2.n;
        }
        if (i == 10) {
            return lx2.i;
        }
        if (i == 12) {
            return lx2.h;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i)));
    }

    static l80 h(l80 l80Var, int i) {
        l80 l80Var2 = new l80();
        int g = l80Var.g();
        int i2 = (1 << i) - 2;
        int i3 = 0;
        while (i3 < g) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i3 + i5;
                if (i6 >= g || l80Var.f(i6)) {
                    i4 |= 1 << ((i - 1) - i5);
                }
            }
            int i7 = i4 & i2;
            if (i7 == i2) {
                l80Var2.c(i7, i);
            } else if (i7 == 0) {
                l80Var2.c(i4 | 1, i);
            } else {
                l80Var2.c(i4, i);
                i3 += i;
            }
            i3--;
            i3 += i;
        }
        return l80Var2;
    }

    private static int i(int i, boolean z) {
        return ((z ? 88 : ContentType.LONG_FORM_ON_DEMAND) + (i << 4)) * i;
    }
}
