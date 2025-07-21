package defpackage;

import com.chartbeat.androidsdk.QueryKeys;

/* loaded from: classes2.dex */
public final class ui5 {
    public static final ui5 a = new ui5();

    private ui5() {
    }

    public static final void a(ld4 ld4Var, ld4 ld4Var2) {
        if (c11.d(ui5.class)) {
            return;
        }
        try {
            zq3.h(ld4Var, QueryKeys.SCROLL_POSITION_TOP);
            zq3.h(ld4Var2, "b");
            int b = ld4Var.b(0);
            int b2 = ld4Var.b(1);
            int b3 = ld4Var.b(2);
            float[] a2 = ld4Var.a();
            float[] a3 = ld4Var2.a();
            if (b <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (b2 > 0) {
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        if (b3 > 0) {
                            int i5 = 0;
                            while (true) {
                                int i6 = i5 + 1;
                                int i7 = (i * b2 * b3) + (i3 * b3) + i5;
                                a2[i7] = a2[i7] + a3[i5];
                                if (i6 >= b3) {
                                    break;
                                } else {
                                    i5 = i6;
                                }
                            }
                        }
                        if (i4 >= b2) {
                            break;
                        } else {
                            i3 = i4;
                        }
                    }
                }
                if (i2 >= b) {
                    return;
                } else {
                    i = i2;
                }
            }
        } catch (Throwable th) {
            c11.b(th, ui5.class);
        }
    }

    public static final ld4 b(ld4[] ld4VarArr) {
        int i;
        if (c11.d(ui5.class)) {
            return null;
        }
        try {
            zq3.h(ld4VarArr, "tensors");
            int i2 = 0;
            int b = ld4VarArr[0].b(0);
            int length = ld4VarArr.length - 1;
            if (length >= 0) {
                int i3 = 0;
                i = 0;
                while (true) {
                    int i4 = i3 + 1;
                    i += ld4VarArr[i3].b(1);
                    if (i4 > length) {
                        break;
                    }
                    i3 = i4;
                }
            } else {
                i = 0;
            }
            ld4 ld4Var = new ld4(new int[]{b, i});
            float[] a2 = ld4Var.a();
            if (b > 0) {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    int i7 = i5 * i;
                    int length2 = ld4VarArr.length - 1;
                    if (length2 >= 0) {
                        int i8 = i2;
                        while (true) {
                            int i9 = i8 + 1;
                            float[] a3 = ld4VarArr[i8].a();
                            int b2 = ld4VarArr[i8].b(1);
                            System.arraycopy(a3, i5 * b2, a2, i7, b2);
                            i7 += b2;
                            if (i9 > length2) {
                                break;
                            }
                            i8 = i9;
                        }
                    }
                    if (i6 >= b) {
                        break;
                    }
                    i5 = i6;
                    i2 = 0;
                }
            }
            return ld4Var;
        } catch (Throwable th) {
            c11.b(th, ui5.class);
            return null;
        }
    }

    public static final ld4 c(ld4 ld4Var, ld4 ld4Var2) {
        Class<ui5> cls;
        ld4 ld4Var3;
        Class<ui5> cls2 = ui5.class;
        if (c11.d(cls2)) {
            return null;
        }
        try {
            zq3.h(ld4Var, QueryKeys.SCROLL_POSITION_TOP);
            zq3.h(ld4Var2, QueryKeys.SCROLL_WINDOW_HEIGHT);
            int i = 0;
            int b = ld4Var.b(0);
            int b2 = ld4Var.b(1);
            int b3 = ld4Var.b(2);
            int b4 = ld4Var2.b(0);
            int i2 = (b2 - b4) + 1;
            int b5 = ld4Var2.b(2);
            ld4 ld4Var4 = new ld4(new int[]{b, i2, b5});
            float[] a2 = ld4Var.a();
            float[] a3 = ld4Var4.a();
            float[] a4 = ld4Var2.a();
            if (b <= 0) {
                return ld4Var4;
            }
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (b5 > 0) {
                    int i5 = i;
                    while (true) {
                        int i6 = i5 + 1;
                        if (i2 > 0) {
                            int i7 = 0;
                            while (true) {
                                int i8 = i7 + 1;
                                float f = 0.0f;
                                if (b4 > 0) {
                                    int i9 = 0;
                                    while (true) {
                                        cls = cls2;
                                        int i10 = i9 + 1;
                                        if (b3 > 0) {
                                            int i11 = 0;
                                            while (true) {
                                                ld4Var3 = ld4Var4;
                                                int i12 = i11 + 1;
                                                try {
                                                    f += a2[(b2 * b3 * i3) + ((i9 + i7) * b3) + i11] * a4[(((i9 * b3) + i11) * b5) + i5];
                                                    if (i12 >= b3) {
                                                        break;
                                                    }
                                                    i11 = i12;
                                                    ld4Var4 = ld4Var3;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    c11.b(th, cls);
                                                    return null;
                                                }
                                            }
                                        } else {
                                            ld4Var3 = ld4Var4;
                                        }
                                        if (i10 >= b4) {
                                            break;
                                        }
                                        i9 = i10;
                                        cls2 = cls;
                                        ld4Var4 = ld4Var3;
                                    }
                                } else {
                                    cls = cls2;
                                    ld4Var3 = ld4Var4;
                                }
                                a3[(i2 * b5 * i3) + (i7 * b5) + i5] = f;
                                if (i8 >= i2) {
                                    break;
                                }
                                i7 = i8;
                                cls2 = cls;
                                ld4Var4 = ld4Var3;
                            }
                        } else {
                            cls = cls2;
                            ld4Var3 = ld4Var4;
                        }
                        if (i6 >= b5) {
                            break;
                        }
                        i5 = i6;
                        cls2 = cls;
                        ld4Var4 = ld4Var3;
                    }
                } else {
                    cls = cls2;
                    ld4Var3 = ld4Var4;
                }
                if (i4 >= b) {
                    return ld4Var3;
                }
                i3 = i4;
                cls2 = cls;
                ld4Var4 = ld4Var3;
                i = 0;
            }
        } catch (Throwable th2) {
            th = th2;
            cls = cls2;
        }
    }

    public static final ld4 d(ld4 ld4Var, ld4 ld4Var2, ld4 ld4Var3) {
        if (c11.d(ui5.class)) {
            return null;
        }
        try {
            zq3.h(ld4Var, QueryKeys.SCROLL_POSITION_TOP);
            zq3.h(ld4Var2, QueryKeys.SCROLL_WINDOW_HEIGHT);
            zq3.h(ld4Var3, "b");
            int b = ld4Var.b(0);
            int b2 = ld4Var3.b(0);
            ld4 h = h(ld4Var, ld4Var2);
            float[] a2 = ld4Var3.a();
            float[] a3 = h.a();
            if (b > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (b2 > 0) {
                        int i3 = 0;
                        while (true) {
                            int i4 = i3 + 1;
                            int i5 = (i * b2) + i3;
                            a3[i5] = a3[i5] + a2[i3];
                            if (i4 >= b2) {
                                break;
                            }
                            i3 = i4;
                        }
                    }
                    if (i2 >= b) {
                        break;
                    }
                    i = i2;
                }
            }
            return h;
        } catch (Throwable th) {
            c11.b(th, ui5.class);
            return null;
        }
    }

    public static final ld4 e(String[] strArr, int i, ld4 ld4Var) {
        if (c11.d(ui5.class)) {
            return null;
        }
        try {
            zq3.h(strArr, "texts");
            zq3.h(ld4Var, QueryKeys.SCROLL_WINDOW_HEIGHT);
            int length = strArr.length;
            int b = ld4Var.b(1);
            ld4 ld4Var2 = new ld4(new int[]{length, i, b});
            float[] a2 = ld4Var2.a();
            float[] a3 = ld4Var.a();
            if (length > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    int[] d = m29.a.d(strArr[i2], i);
                    if (i > 0) {
                        int i4 = 0;
                        while (true) {
                            int i5 = i4 + 1;
                            System.arraycopy(a3, d[i4] * b, a2, (b * i * i2) + (i4 * b), b);
                            if (i5 >= i) {
                                break;
                            }
                            i4 = i5;
                        }
                    }
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return ld4Var2;
        } catch (Throwable th) {
            c11.b(th, ui5.class);
            return null;
        }
    }

    public static final void f(ld4 ld4Var, int i) {
        if (c11.d(ui5.class)) {
            return;
        }
        try {
            zq3.h(ld4Var, QueryKeys.SCROLL_POSITION_TOP);
            if (i >= ld4Var.c()) {
                return;
            }
            int c = ld4Var.c();
            int i2 = 1;
            if (i < c) {
                int i3 = i;
                while (true) {
                    int i4 = i3 + 1;
                    i2 *= ld4Var.b(i3);
                    if (i4 >= c) {
                        break;
                    } else {
                        i3 = i4;
                    }
                }
            }
            int[] iArr = new int[i + 1];
            if (i > 0) {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    iArr[i5] = ld4Var.b(i5);
                    if (i6 >= i) {
                        break;
                    } else {
                        i5 = i6;
                    }
                }
            }
            iArr[i] = i2;
            ld4Var.d(iArr);
        } catch (Throwable th) {
            c11.b(th, ui5.class);
        }
    }

    public static final ld4 g(ld4 ld4Var, int i) {
        int i2;
        if (c11.d(ui5.class)) {
            return null;
        }
        try {
            zq3.h(ld4Var, QueryKeys.SCROLL_POSITION_TOP);
            int i3 = 0;
            int b = ld4Var.b(0);
            int b2 = ld4Var.b(1);
            int b3 = ld4Var.b(2);
            int i4 = (b2 - i) + 1;
            ld4 ld4Var2 = new ld4(new int[]{b, i4, b3});
            float[] a2 = ld4Var.a();
            float[] a3 = ld4Var2.a();
            if (b > 0) {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    if (b3 > 0) {
                        int i7 = i3;
                        while (true) {
                            int i8 = i7 + 1;
                            if (i4 > 0) {
                                int i9 = i3;
                                while (true) {
                                    int i10 = i9 + 1;
                                    int i11 = i9 * b3;
                                    int i12 = (i5 * i4 * b3) + i11 + i7;
                                    int i13 = (i5 * b2 * b3) + i11 + i7;
                                    a3[i12] = Float.MIN_VALUE;
                                    if (i > 0) {
                                        int i14 = 0;
                                        while (true) {
                                            int i15 = i14 + 1;
                                            i2 = b2;
                                            a3[i12] = Math.max(a3[i12], a2[i13 + (i14 * b3)]);
                                            if (i15 >= i) {
                                                break;
                                            }
                                            i14 = i15;
                                            b2 = i2;
                                        }
                                    } else {
                                        i2 = b2;
                                    }
                                    if (i10 >= i4) {
                                        break;
                                    }
                                    i9 = i10;
                                    b2 = i2;
                                }
                            } else {
                                i2 = b2;
                            }
                            if (i8 >= b3) {
                                break;
                            }
                            i7 = i8;
                            b2 = i2;
                            i3 = 0;
                        }
                    } else {
                        i2 = b2;
                    }
                    if (i6 >= b) {
                        break;
                    }
                    i5 = i6;
                    b2 = i2;
                    i3 = 0;
                }
            }
            return ld4Var2;
        } catch (Throwable th) {
            c11.b(th, ui5.class);
            return null;
        }
    }

    public static final ld4 h(ld4 ld4Var, ld4 ld4Var2) {
        if (c11.d(ui5.class)) {
            return null;
        }
        try {
            zq3.h(ld4Var, QueryKeys.SCROLL_POSITION_TOP);
            zq3.h(ld4Var2, QueryKeys.SCROLL_WINDOW_HEIGHT);
            int i = 0;
            int b = ld4Var.b(0);
            int b2 = ld4Var2.b(0);
            int b3 = ld4Var2.b(1);
            ld4 ld4Var3 = new ld4(new int[]{b, b3});
            float[] a2 = ld4Var.a();
            float[] a3 = ld4Var2.a();
            float[] a4 = ld4Var3.a();
            if (b > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    if (b3 > 0) {
                        int i4 = i;
                        while (true) {
                            int i5 = i4 + 1;
                            int i6 = (i2 * b3) + i4;
                            a4[i6] = 0.0f;
                            if (b2 > 0) {
                                int i7 = i;
                                while (true) {
                                    int i8 = i7 + 1;
                                    a4[i6] = a4[i6] + (a2[(i2 * b2) + i7] * a3[(i7 * b3) + i4]);
                                    if (i8 >= b2) {
                                        break;
                                    }
                                    i7 = i8;
                                }
                            }
                            if (i5 >= b3) {
                                break;
                            }
                            i4 = i5;
                            i = 0;
                        }
                    }
                    if (i3 >= b) {
                        break;
                    }
                    i2 = i3;
                    i = 0;
                }
            }
            return ld4Var3;
        } catch (Throwable th) {
            c11.b(th, ui5.class);
            return null;
        }
    }

    public static final void i(ld4 ld4Var) {
        if (c11.d(ui5.class)) {
            return;
        }
        try {
            zq3.h(ld4Var, QueryKeys.SCROLL_POSITION_TOP);
            float[] a2 = ld4Var.a();
            int length = a2.length - 1;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (a2[i] < 0.0f) {
                    a2[i] = 0.0f;
                }
                if (i2 > length) {
                    return;
                } else {
                    i = i2;
                }
            }
        } catch (Throwable th) {
            c11.b(th, ui5.class);
        }
    }

    public static final void j(ld4 ld4Var) {
        if (c11.d(ui5.class)) {
            return;
        }
        try {
            zq3.h(ld4Var, QueryKeys.SCROLL_POSITION_TOP);
            int i = 0;
            int b = ld4Var.b(0);
            int b2 = ld4Var.b(1);
            float[] a2 = ld4Var.a();
            if (b <= 0) {
                return;
            }
            while (true) {
                int i2 = i + 1;
                int i3 = i * b2;
                int i4 = i3 + b2;
                float f = Float.MIN_VALUE;
                if (i3 < i4) {
                    int i5 = i3;
                    while (true) {
                        int i6 = i5 + 1;
                        float f2 = a2[i5];
                        if (f2 > f) {
                            f = f2;
                        }
                        if (i6 >= i4) {
                            break;
                        } else {
                            i5 = i6;
                        }
                    }
                }
                float f3 = 0.0f;
                if (i3 < i4) {
                    int i7 = i3;
                    while (true) {
                        int i8 = i7 + 1;
                        float exp = (float) Math.exp(a2[i7] - f);
                        a2[i7] = exp;
                        f3 += exp;
                        if (i8 >= i4) {
                            break;
                        } else {
                            i7 = i8;
                        }
                    }
                }
                if (i3 < i4) {
                    while (true) {
                        int i9 = i3 + 1;
                        a2[i3] = a2[i3] / f3;
                        if (i9 >= i4) {
                            break;
                        } else {
                            i3 = i9;
                        }
                    }
                }
                if (i2 >= b) {
                    return;
                } else {
                    i = i2;
                }
            }
        } catch (Throwable th) {
            c11.b(th, ui5.class);
        }
    }

    public static final ld4 k(ld4 ld4Var) {
        if (c11.d(ui5.class)) {
            return null;
        }
        try {
            zq3.h(ld4Var, QueryKeys.SCROLL_POSITION_TOP);
            int b = ld4Var.b(0);
            int b2 = ld4Var.b(1);
            ld4 ld4Var2 = new ld4(new int[]{b2, b});
            float[] a2 = ld4Var.a();
            float[] a3 = ld4Var2.a();
            if (b > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (b2 > 0) {
                        int i3 = 0;
                        while (true) {
                            int i4 = i3 + 1;
                            a3[(i3 * b) + i] = a2[(i * b2) + i3];
                            if (i4 >= b2) {
                                break;
                            }
                            i3 = i4;
                        }
                    }
                    if (i2 >= b) {
                        break;
                    }
                    i = i2;
                }
            }
            return ld4Var2;
        } catch (Throwable th) {
            c11.b(th, ui5.class);
            return null;
        }
    }

    public static final ld4 l(ld4 ld4Var) {
        if (c11.d(ui5.class)) {
            return null;
        }
        try {
            zq3.h(ld4Var, QueryKeys.SCROLL_POSITION_TOP);
            int b = ld4Var.b(0);
            int b2 = ld4Var.b(1);
            int b3 = ld4Var.b(2);
            ld4 ld4Var2 = new ld4(new int[]{b3, b2, b});
            float[] a2 = ld4Var.a();
            float[] a3 = ld4Var2.a();
            if (b > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (b2 > 0) {
                        int i3 = 0;
                        while (true) {
                            int i4 = i3 + 1;
                            if (b3 > 0) {
                                int i5 = 0;
                                while (true) {
                                    int i6 = i5 + 1;
                                    a3[(i5 * b * b2) + (i3 * b) + i] = a2[(i * b2 * b3) + (i3 * b3) + i5];
                                    if (i6 >= b3) {
                                        break;
                                    }
                                    i5 = i6;
                                }
                            }
                            if (i4 >= b2) {
                                break;
                            }
                            i3 = i4;
                        }
                    }
                    if (i2 >= b) {
                        break;
                    }
                    i = i2;
                }
            }
            return ld4Var2;
        } catch (Throwable th) {
            c11.b(th, ui5.class);
            return null;
        }
    }
}
