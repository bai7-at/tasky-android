package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class j15 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object c = new Object();
    private static int[] d = new int[10];

    public static final class a {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int[] h;
        public final int i;
        public final int j;
        public final int k;
        public final int l;
        public final float m;
        public final int n;
        public final int o;
        public final int p;

        public a(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int[] iArr, int i7, int i8, int i9, int i10, float f, int i11, int i12, int i13) {
            this.a = i;
            this.b = z;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = iArr;
            this.i = i7;
            this.j = i8;
            this.k = i9;
            this.l = i10;
            this.m = f;
            this.n = i11;
            this.o = i12;
            this.p = i13;
        }
    }

    public static final class b {
        public final int a;
        public final int b;
        public final boolean c;

        public b(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }
    }

    public static final class c {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final float h;
        public final boolean i;
        public final boolean j;
        public final int k;
        public final int l;
        public final int m;
        public final boolean n;
        public final int o;
        public final int p;
        public final int q;

        public c(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, boolean z, boolean z2, int i8, int i9, int i10, boolean z3, int i11, int i12, int i13) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = f;
            this.i = z;
            this.j = z2;
            this.k = i8;
            this.l = i9;
            this.m = i10;
            this.n = z3;
            this.o = i11;
            this.p = i12;
            this.q = i13;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 >= position) {
                byteBuffer.clear();
                return;
            }
            int i4 = byteBuffer.get(i) & 255;
            if (i2 == 3) {
                if (i4 == 1 && (byteBuffer.get(i3) & 31) == 7) {
                    ByteBuffer duplicate = byteBuffer.duplicate();
                    duplicate.position(i - 3);
                    duplicate.limit(position);
                    byteBuffer.position(0);
                    byteBuffer.put(duplicate);
                    return;
                }
            } else if (i4 == 0) {
                i2++;
            }
            if (i4 != 0) {
                i2 = 0;
            }
            i = i3;
        }
    }

    public static int c(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        ur.g(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            a(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            a(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            a(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b2 = bArr[i5];
            if ((b2 & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                    a(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    private static int d(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int e(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    public static int f(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    public static boolean g(String str, byte b2) {
        if ("video/avc".equals(str) && (b2 & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b2 & 126) >> 1) == 39;
    }

    public static a h(byte[] bArr, int i, int i2) {
        return i(bArr, i + 2, i2);
    }

    public static a i(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        zo5 zo5Var = new zo5(bArr, i, i2);
        zo5Var.l(4);
        int e = zo5Var.e(3);
        zo5Var.k();
        int e2 = zo5Var.e(2);
        boolean d2 = zo5Var.d();
        int e3 = zo5Var.e(5);
        int i7 = 0;
        for (int i8 = 0; i8 < 32; i8++) {
            if (zo5Var.d()) {
                i7 |= 1 << i8;
            }
        }
        int[] iArr = new int[6];
        for (int i9 = 0; i9 < 6; i9++) {
            iArr[i9] = zo5Var.e(8);
        }
        int e4 = zo5Var.e(8);
        int i10 = 0;
        for (int i11 = 0; i11 < e; i11++) {
            if (zo5Var.d()) {
                i10 += 89;
            }
            if (zo5Var.d()) {
                i10 += 8;
            }
        }
        zo5Var.l(i10);
        if (e > 0) {
            zo5Var.l((8 - e) * 2);
        }
        int h = zo5Var.h();
        int h2 = zo5Var.h();
        if (h2 == 3) {
            zo5Var.k();
        }
        int h3 = zo5Var.h();
        int h4 = zo5Var.h();
        if (zo5Var.d()) {
            int h5 = zo5Var.h();
            int h6 = zo5Var.h();
            int h7 = zo5Var.h();
            int h8 = zo5Var.h();
            h3 -= ((h2 == 1 || h2 == 2) ? 2 : 1) * (h5 + h6);
            h4 -= (h2 == 1 ? 2 : 1) * (h7 + h8);
        }
        int i12 = h4;
        int i13 = h3;
        int i14 = i12;
        int h9 = zo5Var.h();
        int h10 = zo5Var.h();
        int h11 = zo5Var.h();
        for (int i15 = zo5Var.d() ? 0 : e; i15 <= e; i15++) {
            zo5Var.h();
            zo5Var.h();
            zo5Var.h();
        }
        zo5Var.h();
        zo5Var.h();
        zo5Var.h();
        zo5Var.h();
        zo5Var.h();
        zo5Var.h();
        if (zo5Var.d() && zo5Var.d()) {
            n(zo5Var);
        }
        zo5Var.l(2);
        if (zo5Var.d()) {
            zo5Var.l(8);
            zo5Var.h();
            zo5Var.h();
            zo5Var.k();
        }
        p(zo5Var);
        if (zo5Var.d()) {
            int h12 = zo5Var.h();
            for (int i16 = 0; i16 < h12; i16++) {
                zo5Var.l(h11 + 5);
            }
        }
        zo5Var.l(2);
        int i17 = -1;
        float f = 1.0f;
        if (zo5Var.d()) {
            if (zo5Var.d()) {
                int e5 = zo5Var.e(8);
                if (e5 == 255) {
                    int e6 = zo5Var.e(16);
                    int e7 = zo5Var.e(16);
                    if (e6 != 0 && e7 != 0) {
                        f = e6 / e7;
                    }
                } else {
                    float[] fArr = b;
                    if (e5 < fArr.length) {
                        f = fArr[e5];
                    } else {
                        a84.j("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + e5);
                    }
                }
            }
            if (zo5Var.d()) {
                zo5Var.k();
            }
            if (zo5Var.d()) {
                zo5Var.l(3);
                i4 = zo5Var.d() ? 1 : 2;
                if (zo5Var.d()) {
                    int e8 = zo5Var.e(8);
                    int e9 = zo5Var.e(8);
                    zo5Var.l(8);
                    i17 = sn0.i(e8);
                    i6 = sn0.j(e9);
                } else {
                    i6 = -1;
                }
            } else {
                i6 = -1;
                i4 = -1;
            }
            if (zo5Var.d()) {
                zo5Var.h();
                zo5Var.h();
            }
            zo5Var.k();
            if (zo5Var.d()) {
                i14 *= 2;
            }
            i5 = i6;
            i3 = i17;
        } else {
            i3 = -1;
            i4 = -1;
            i5 = -1;
        }
        return new a(e2, d2, e3, i7, h2, h9, h10, iArr, e4, h, i13, i14, f, i3, i4, i5);
    }

    public static b j(byte[] bArr, int i, int i2) {
        return k(bArr, i + 1, i2);
    }

    public static b k(byte[] bArr, int i, int i2) {
        zo5 zo5Var = new zo5(bArr, i, i2);
        int h = zo5Var.h();
        int h2 = zo5Var.h();
        zo5Var.k();
        return new b(h, h2, zo5Var.d());
    }

    public static c l(byte[] bArr, int i, int i2) {
        return m(bArr, i + 1, i2);
    }

    public static c m(byte[] bArr, int i, int i2) {
        int h;
        boolean d2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        zo5 zo5Var = new zo5(bArr, i, i2);
        int e = zo5Var.e(8);
        int e2 = zo5Var.e(8);
        int e3 = zo5Var.e(8);
        int h2 = zo5Var.h();
        if (e == 100 || e == 110 || e == 122 || e == 244 || e == 44 || e == 83 || e == 86 || e == 118 || e == 128 || e == 138) {
            h = zo5Var.h();
            d2 = h == 3 ? zo5Var.d() : false;
            zo5Var.h();
            zo5Var.h();
            zo5Var.k();
            if (zo5Var.d()) {
                int i10 = h != 3 ? 8 : 12;
                int i11 = 0;
                while (i11 < i10) {
                    if (zo5Var.d()) {
                        o(zo5Var, i11 < 6 ? 16 : 64);
                    }
                    i11++;
                }
            }
        } else {
            h = 1;
            d2 = false;
        }
        int h3 = zo5Var.h() + 4;
        int h4 = zo5Var.h();
        if (h4 == 0) {
            i3 = h;
            z = d2;
            i4 = zo5Var.h() + 4;
            z2 = false;
        } else {
            if (h4 == 1) {
                boolean d3 = zo5Var.d();
                zo5Var.g();
                zo5Var.g();
                z = d2;
                long h5 = zo5Var.h();
                i3 = h;
                for (int i12 = 0; i12 < h5; i12++) {
                    zo5Var.h();
                }
                z2 = d3;
            } else {
                i3 = h;
                z = d2;
                z2 = false;
            }
            i4 = 0;
        }
        int h6 = zo5Var.h();
        zo5Var.k();
        int h7 = zo5Var.h() + 1;
        int h8 = zo5Var.h() + 1;
        boolean d4 = zo5Var.d();
        int i13 = (2 - (d4 ? 1 : 0)) * h8;
        if (!d4) {
            zo5Var.k();
        }
        zo5Var.k();
        int i14 = h7 * 16;
        int i15 = i13 * 16;
        if (zo5Var.d()) {
            int h9 = zo5Var.h();
            int h10 = zo5Var.h();
            int h11 = zo5Var.h();
            int h12 = zo5Var.h();
            if (i3 == 0) {
                i9 = 2 - (d4 ? 1 : 0);
                i8 = 1;
            } else {
                int i16 = i3;
                i8 = i16 == 3 ? 1 : 2;
                i9 = (i16 == 1 ? 2 : 1) * (2 - (d4 ? 1 : 0));
            }
            i14 -= (h9 + h10) * i8;
            i15 -= (h11 + h12) * i9;
        }
        int i17 = i14;
        float f = 1.0f;
        if (zo5Var.d()) {
            if (zo5Var.d()) {
                int e4 = zo5Var.e(8);
                if (e4 == 255) {
                    int e5 = zo5Var.e(16);
                    int e6 = zo5Var.e(16);
                    if (e5 != 0 && e6 != 0) {
                        f = e5 / e6;
                    }
                } else {
                    float[] fArr = b;
                    if (e4 < fArr.length) {
                        f = fArr[e4];
                    } else {
                        a84.j("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + e4);
                    }
                }
            }
            if (zo5Var.d()) {
                zo5Var.k();
            }
            if (zo5Var.d()) {
                zo5Var.l(3);
                int i18 = zo5Var.d() ? 1 : 2;
                if (!zo5Var.d()) {
                    i6 = i18;
                    i5 = -1;
                    i7 = -1;
                    return new c(e, e2, e3, h2, h6, i17, i15, f, z, d4, h3, h4, i4, z2, i5, i6, i7);
                }
                int e7 = zo5Var.e(8);
                int e8 = zo5Var.e(8);
                zo5Var.l(8);
                i5 = sn0.i(e7);
                i7 = sn0.j(e8);
                i6 = i18;
                return new c(e, e2, e3, h2, h6, i17, i15, f, z, d4, h3, h4, i4, z2, i5, i6, i7);
            }
        }
        i5 = -1;
        i6 = -1;
        i7 = -1;
        return new c(e, e2, e3, h2, h6, i17, i15, f, z, d4, h3, h4, i4, z2, i5, i6, i7);
    }

    private static void n(zo5 zo5Var) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (zo5Var.d()) {
                    int min = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        zo5Var.g();
                    }
                    for (int i4 = 0; i4 < min; i4++) {
                        zo5Var.g();
                    }
                } else {
                    zo5Var.h();
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    private static void o(zo5 zo5Var, int i) {
        int i2 = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 != 0) {
                i2 = ((zo5Var.g() + i3) + JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) % JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
            }
            if (i2 != 0) {
                i3 = i2;
            }
        }
    }

    private static void p(zo5 zo5Var) {
        int h = zo5Var.h();
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < h; i3++) {
            if (i3 == 0 || !zo5Var.d()) {
                int h2 = zo5Var.h();
                int h3 = zo5Var.h();
                int[] iArr3 = new int[h2];
                int i4 = 0;
                while (i4 < h2) {
                    iArr3[i4] = (i4 > 0 ? iArr3[i4 - 1] : 0) - (zo5Var.h() + 1);
                    zo5Var.k();
                    i4++;
                }
                int[] iArr4 = new int[h3];
                int i5 = 0;
                while (i5 < h3) {
                    iArr4[i5] = (i5 > 0 ? iArr4[i5 - 1] : 0) + zo5Var.h() + 1;
                    zo5Var.k();
                    i5++;
                }
                i = h2;
                iArr = iArr3;
                i2 = h3;
                iArr2 = iArr4;
            } else {
                int i6 = i + i2;
                int h4 = (1 - ((zo5Var.d() ? 1 : 0) * 2)) * (zo5Var.h() + 1);
                int i7 = i6 + 1;
                boolean[] zArr = new boolean[i7];
                for (int i8 = 0; i8 <= i6; i8++) {
                    if (zo5Var.d()) {
                        zArr[i8] = true;
                    } else {
                        zArr[i8] = zo5Var.d();
                    }
                }
                int[] iArr5 = new int[i7];
                int[] iArr6 = new int[i7];
                int i9 = 0;
                for (int i10 = i2 - 1; i10 >= 0; i10--) {
                    int i11 = iArr2[i10] + h4;
                    if (i11 < 0 && zArr[i + i10]) {
                        iArr5[i9] = i11;
                        i9++;
                    }
                }
                if (h4 < 0 && zArr[i6]) {
                    iArr5[i9] = h4;
                    i9++;
                }
                for (int i12 = 0; i12 < i; i12++) {
                    int i13 = iArr[i12] + h4;
                    if (i13 < 0 && zArr[i12]) {
                        iArr5[i9] = i13;
                        i9++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr5, i9);
                int i14 = 0;
                for (int i15 = i - 1; i15 >= 0; i15--) {
                    int i16 = iArr[i15] + h4;
                    if (i16 > 0 && zArr[i15]) {
                        iArr6[i14] = i16;
                        i14++;
                    }
                }
                if (h4 > 0 && zArr[i6]) {
                    iArr6[i14] = h4;
                    i14++;
                }
                for (int i17 = 0; i17 < i2; i17++) {
                    int i18 = iArr2[i17] + h4;
                    if (i18 > 0 && zArr[i + i17]) {
                        iArr6[i14] = i18;
                        i14++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr6, i14);
                iArr = copyOf;
                i = i9;
                i2 = i14;
            }
        }
    }

    public static int q(byte[] bArr, int i) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                try {
                    i3 = d(bArr, i3, i);
                    if (i3 < i) {
                        int[] iArr = d;
                        if (iArr.length <= i4) {
                            d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        d[i4] = i3;
                        i3 += 3;
                        i4++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
