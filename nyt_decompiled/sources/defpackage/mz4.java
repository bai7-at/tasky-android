package defpackage;

/* loaded from: classes.dex */
public abstract class mz4 {
    private static final void b(jn3 jn3Var, hq1 hq1Var) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < jn3Var.c()) {
            int i4 = i + 2;
            int b = jn3Var.b(i) - jn3Var.b(i4);
            int b2 = jn3Var.b(i + 1) - jn3Var.b(i4);
            int b3 = jn3Var.b(i4);
            i += 3;
            while (i2 < b) {
                hq1Var.a(i3, i2);
                i2++;
            }
            while (i3 < b2) {
                hq1Var.c(i3);
                i3++;
            }
            while (true) {
                int i5 = b3 - 1;
                if (b3 > 0) {
                    hq1Var.d(i2, i3);
                    i2++;
                    i3++;
                    b3 = i5;
                }
            }
        }
    }

    private static final boolean c(int i, int i2, int i3, int i4, hq1 hq1Var, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        int b;
        int i6;
        int i7;
        int i8 = (i2 - i) - (i4 - i3);
        boolean z = i8 % 2 == 0;
        int i9 = -i5;
        for (int i10 = i9; i10 <= i5; i10 += 2) {
            if (i10 == i9 || (i10 != i5 && ui0.b(iArr2, i10 + 1) < ui0.b(iArr2, i10 - 1))) {
                b = ui0.b(iArr2, i10 + 1);
                i6 = b;
            } else {
                b = ui0.b(iArr2, i10 - 1);
                i6 = b - 1;
            }
            int i11 = i4 - ((i2 - i6) - i10);
            int i12 = (i5 == 0 || i6 != b) ? i11 : i11 + 1;
            while (i6 > i && i11 > i3) {
                if (!hq1Var.b(i6 - 1, i11 - 1)) {
                    break;
                }
                i6--;
                i11--;
            }
            ui0.d(iArr2, i10, i6);
            if (z && (i7 = i8 - i10) >= i9 && i7 <= i5) {
                if (ui0.b(iArr, i7) >= i6) {
                    f(i6, i11, b, i12, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final jn3 d(int i, int i2, hq1 hq1Var) {
        int i3 = ((i + i2) + 1) / 2;
        jn3 jn3Var = new jn3(i3 * 3);
        jn3 jn3Var2 = new jn3(i3 * 4);
        jn3Var2.h(0, i, 0, i2);
        int i4 = (i3 * 2) + 1;
        int[] a = ui0.a(new int[i4]);
        int[] a2 = ui0.a(new int[i4]);
        int[] b = cw7.b(new int[5]);
        while (jn3Var2.d()) {
            int f = jn3Var2.f();
            int f2 = jn3Var2.f();
            int f3 = jn3Var2.f();
            int f4 = jn3Var2.f();
            int[] iArr = a;
            int[] iArr2 = a2;
            if (h(f4, f3, f2, f, hq1Var, a, a2, b)) {
                if (cw7.c(b) > 0) {
                    cw7.a(b, jn3Var);
                }
                jn3Var2.h(f4, cw7.h(b), f2, cw7.i(b));
                jn3Var2.h(cw7.d(b), f3, cw7.e(b), f);
            }
            a = iArr;
            a2 = iArr2;
        }
        jn3Var.j();
        jn3Var.g(i, i2, 0);
        return jn3Var;
    }

    public static final void e(int i, int i2, hq1 hq1Var) {
        b(d(i, i2, hq1Var), hq1Var);
    }

    public static final void f(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        iArr[4] = z ? 1 : 0;
    }

    private static final boolean g(int i, int i2, int i3, int i4, hq1 hq1Var, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        int b;
        int i6;
        int i7;
        int i8 = (i2 - i) - (i4 - i3);
        boolean z = Math.abs(i8) % 2 == 1;
        int i9 = -i5;
        for (int i10 = i9; i10 <= i5; i10 += 2) {
            if (i10 == i9 || (i10 != i5 && ui0.b(iArr, i10 + 1) > ui0.b(iArr, i10 - 1))) {
                b = ui0.b(iArr, i10 + 1);
                i6 = b;
            } else {
                b = ui0.b(iArr, i10 - 1);
                i6 = b + 1;
            }
            int i11 = (i3 + (i6 - i)) - i10;
            int i12 = (i5 == 0 || i6 != b) ? i11 : i11 - 1;
            while (i6 < i2 && i11 < i4) {
                if (!hq1Var.b(i6, i11)) {
                    break;
                }
                i6++;
                i11++;
            }
            ui0.d(iArr, i10, i6);
            if (z && (i7 = i8 - i10) >= i9 + 1 && i7 <= i5 - 1) {
                if (ui0.b(iArr2, i7) <= i6) {
                    f(b, i12, i6, i11, false, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final boolean h(int i, int i2, int i3, int i4, hq1 hq1Var, int[] iArr, int[] iArr2, int[] iArr3) {
        int i5 = i2 - i;
        int i6 = i4 - i3;
        if (i5 >= 1 && i6 >= 1) {
            int i7 = ((i5 + i6) + 1) / 2;
            ui0.d(iArr, 1, i);
            ui0.d(iArr2, 1, i2);
            int i8 = 0;
            while (i8 < i7) {
                int i9 = i8;
                if (g(i, i2, i3, i4, hq1Var, iArr, iArr2, i8, iArr3) || c(i, i2, i3, i4, hq1Var, iArr, iArr2, i9, iArr3)) {
                    return true;
                }
                i8 = i9 + 1;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }
}
