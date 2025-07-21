package kotlin.collections;

import defpackage.zq3;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class g extends f {
    public static long[] A(long[] jArr, long[] jArr2) {
        zq3.h(jArr, "<this>");
        zq3.h(jArr2, "elements");
        int length = jArr.length;
        int length2 = jArr2.length;
        long[] copyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(jArr2, 0, copyOf, length, length2);
        zq3.e(copyOf);
        return copyOf;
    }

    public static Object[] B(Object[] objArr, Object obj) {
        zq3.h(objArr, "<this>");
        int length = objArr.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + 1);
        copyOf[length] = obj;
        zq3.e(copyOf);
        return copyOf;
    }

    public static Object[] C(Object[] objArr, Object[] objArr2) {
        zq3.h(objArr, "<this>");
        zq3.h(objArr2, "elements");
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        zq3.e(copyOf);
        return copyOf;
    }

    public static boolean[] D(boolean[] zArr, boolean[] zArr2) {
        zq3.h(zArr, "<this>");
        zq3.h(zArr2, "elements");
        int length = zArr.length;
        int length2 = zArr2.length;
        boolean[] copyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(zArr2, 0, copyOf, length, length2);
        zq3.e(copyOf);
        return copyOf;
    }

    public static void E(int[] iArr) {
        zq3.h(iArr, "<this>");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    public static void F(Object[] objArr) {
        zq3.h(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    public static void G(Object[] objArr, Comparator comparator) {
        zq3.h(objArr, "<this>");
        zq3.h(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static void H(Object[] objArr, Comparator comparator, int i, int i2) {
        zq3.h(objArr, "<this>");
        zq3.h(comparator, "comparator");
        Arrays.sort(objArr, i, i2, comparator);
    }

    public static List e(Object[] objArr) {
        zq3.h(objArr, "<this>");
        List a = h.a(objArr);
        zq3.g(a, "asList(...)");
        return a;
    }

    public static byte[] f(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        zq3.h(bArr, "<this>");
        zq3.h(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    public static char[] g(char[] cArr, char[] cArr2, int i, int i2, int i3) {
        zq3.h(cArr, "<this>");
        zq3.h(cArr2, "destination");
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
        return cArr2;
    }

    public static float[] h(float[] fArr, float[] fArr2, int i, int i2, int i3) {
        zq3.h(fArr, "<this>");
        zq3.h(fArr2, "destination");
        System.arraycopy(fArr, i2, fArr2, i, i3 - i2);
        return fArr2;
    }

    public static int[] i(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        zq3.h(iArr, "<this>");
        zq3.h(iArr2, "destination");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
        return iArr2;
    }

    public static long[] j(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        zq3.h(jArr, "<this>");
        zq3.h(jArr2, "destination");
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
        return jArr2;
    }

    public static Object[] k(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        zq3.h(objArr, "<this>");
        zq3.h(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
        return objArr2;
    }

    public static /* synthetic */ byte[] l(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        return d.f(bArr, bArr2, i, i2, i3);
    }

    public static /* synthetic */ float[] m(float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = fArr.length;
        }
        return d.h(fArr, fArr2, i, i2, i3);
    }

    public static /* synthetic */ int[] n(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        return d.i(iArr, iArr2, i, i2, i3);
    }

    public static /* synthetic */ Object[] o(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return d.k(objArr, objArr2, i, i2, i3);
    }

    public static byte[] p(byte[] bArr, int i, int i2) {
        zq3.h(bArr, "<this>");
        e.c(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        zq3.g(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static Object[] q(Object[] objArr, int i, int i2) {
        zq3.h(objArr, "<this>");
        e.c(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        zq3.g(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void r(int[] iArr, int i, int i2, int i3) {
        zq3.h(iArr, "<this>");
        Arrays.fill(iArr, i2, i3, i);
    }

    public static final void s(long[] jArr, long j, int i, int i2) {
        zq3.h(jArr, "<this>");
        Arrays.fill(jArr, i, i2, j);
    }

    public static void t(Object[] objArr, Object obj, int i, int i2) {
        zq3.h(objArr, "<this>");
        Arrays.fill(objArr, i, i2, obj);
    }

    public static /* synthetic */ void u(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        d.r(iArr, i, i2, i3);
    }

    public static /* synthetic */ void v(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length;
        }
        s(jArr, j, i, i2);
    }

    public static /* synthetic */ void w(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        d.t(objArr, obj, i, i2);
    }

    public static float[] x(float[] fArr, float[] fArr2) {
        zq3.h(fArr, "<this>");
        zq3.h(fArr2, "elements");
        int length = fArr.length;
        int length2 = fArr2.length;
        float[] copyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(fArr2, 0, copyOf, length, length2);
        zq3.e(copyOf);
        return copyOf;
    }

    public static int[] y(int[] iArr, int i) {
        zq3.h(iArr, "<this>");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, length + 1);
        copyOf[length] = i;
        zq3.e(copyOf);
        return copyOf;
    }

    public static int[] z(int[] iArr, int[] iArr2) {
        zq3.h(iArr, "<this>");
        zq3.h(iArr2, "elements");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] copyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, copyOf, length, length2);
        zq3.e(copyOf);
        return copyOf;
    }
}
