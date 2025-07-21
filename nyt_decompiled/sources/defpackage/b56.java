package defpackage;

import defpackage.a56;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
abstract class b56 {
    public static a56 a(byte[] bArr, int i) {
        ArrayList arrayList;
        yo5 yo5Var = new yo5(bArr);
        try {
            arrayList = c(yo5Var) ? f(yo5Var) : e(yo5Var);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            return new a56((a56.a) arrayList.get(0), i);
        }
        if (size != 2) {
            return null;
        }
        return new a56((a56.a) arrayList.get(0), (a56.a) arrayList.get(1), i);
    }

    private static int b(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    private static boolean c(yo5 yo5Var) {
        yo5Var.V(4);
        int q = yo5Var.q();
        yo5Var.U(0);
        return q == 1886547818;
    }

    private static a56.a d(yo5 yo5Var) {
        int q = yo5Var.q();
        if (q > 10000) {
            return null;
        }
        float[] fArr = new float[q];
        for (int i = 0; i < q; i++) {
            fArr[i] = yo5Var.p();
        }
        int q2 = yo5Var.q();
        if (q2 > 32000) {
            return null;
        }
        double d = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(q * 2.0d) / log);
        xo5 xo5Var = new xo5(yo5Var.e());
        int i2 = 8;
        xo5Var.p(yo5Var.f() * 8);
        float[] fArr2 = new float[q2 * 5];
        int i3 = 5;
        int[] iArr = new int[5];
        int i4 = 0;
        int i5 = 0;
        while (i4 < q2) {
            int i6 = 0;
            while (i6 < i3) {
                int b = iArr[i6] + b(xo5Var.h(ceil));
                if (b >= q || b < 0) {
                    return null;
                }
                fArr2[i5] = fArr[b];
                iArr[i6] = b;
                i6++;
                i5++;
                i3 = 5;
            }
            i4++;
            i3 = 5;
        }
        xo5Var.p((xo5Var.e() + 7) & (-8));
        int i7 = 32;
        int h = xo5Var.h(32);
        a56.b[] bVarArr = new a56.b[h];
        int i8 = 0;
        while (i8 < h) {
            int h2 = xo5Var.h(i2);
            int h3 = xo5Var.h(i2);
            int h4 = xo5Var.h(i7);
            if (h4 > 128000) {
                return null;
            }
            int ceil2 = (int) Math.ceil(Math.log(q2 * d) / log);
            float[] fArr3 = new float[h4 * 3];
            float[] fArr4 = new float[h4 * 2];
            int i9 = 0;
            for (int i10 = 0; i10 < h4; i10++) {
                i9 += b(xo5Var.h(ceil2));
                if (i9 < 0 || i9 >= q2) {
                    return null;
                }
                int i11 = i10 * 3;
                int i12 = i9 * 5;
                fArr3[i11] = fArr2[i12];
                fArr3[i11 + 1] = fArr2[i12 + 1];
                fArr3[i11 + 2] = fArr2[i12 + 2];
                int i13 = i10 * 2;
                fArr4[i13] = fArr2[i12 + 3];
                fArr4[i13 + 1] = fArr2[i12 + 4];
            }
            bVarArr[i8] = new a56.b(h2, fArr3, fArr4, h3);
            i8++;
            i7 = 32;
            d = 2.0d;
            i2 = 8;
        }
        return new a56.a(bVarArr);
    }

    private static ArrayList e(yo5 yo5Var) {
        if (yo5Var.H() != 0) {
            return null;
        }
        yo5Var.V(7);
        int q = yo5Var.q();
        if (q == 1684433976) {
            yo5 yo5Var2 = new yo5();
            Inflater inflater = new Inflater(true);
            try {
                if (!z19.s0(yo5Var, yo5Var2, inflater)) {
                    return null;
                }
                inflater.end();
                yo5Var = yo5Var2;
            } finally {
                inflater.end();
            }
        } else if (q != 1918990112) {
            return null;
        }
        return g(yo5Var);
    }

    private static ArrayList f(yo5 yo5Var) {
        int q;
        yo5Var.V(8);
        int f = yo5Var.f();
        int g = yo5Var.g();
        while (f < g && (q = yo5Var.q() + f) > f && q <= g) {
            int q2 = yo5Var.q();
            if (q2 == 2037673328 || q2 == 1836279920) {
                yo5Var.T(q);
                return e(yo5Var);
            }
            yo5Var.U(q);
            f = q;
        }
        return null;
    }

    private static ArrayList g(yo5 yo5Var) {
        ArrayList arrayList = new ArrayList();
        int f = yo5Var.f();
        int g = yo5Var.g();
        while (f < g) {
            int q = yo5Var.q() + f;
            if (q <= f || q > g) {
                return null;
            }
            if (yo5Var.q() == 1835365224) {
                a56.a d = d(yo5Var);
                if (d == null) {
                    return null;
                }
                arrayList.add(d);
            }
            yo5Var.U(q);
            f = q;
        }
        return arrayList;
    }
}
