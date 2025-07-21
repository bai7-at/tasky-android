package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes.dex */
public final class kg4 {
    public static final a b = new a(null);
    private final float[] a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ kg4(float[] fArr) {
        this.a = fArr;
    }

    public static final /* synthetic */ kg4 a(float[] fArr) {
        return new kg4(fArr);
    }

    public static float[] b(float[] fArr) {
        return fArr;
    }

    public static /* synthetic */ float[] c(float[] fArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return b(fArr);
    }

    public static boolean d(float[] fArr, Object obj) {
        return (obj instanceof kg4) && zq3.c(fArr, ((kg4) obj).o());
    }

    public static int e(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static final long f(float[] fArr, long j) {
        float o = fd5.o(j);
        float p = fd5.p(j);
        float f = 1 / (((fArr[3] * o) + (fArr[7] * p)) + fArr[15]);
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            f = 0.0f;
        }
        return hd5.a(((fArr[0] * o) + (fArr[4] * p) + fArr[12]) * f, f * ((fArr[1] * o) + (fArr[5] * p) + fArr[13]));
    }

    public static final void g(float[] fArr, my4 my4Var) {
        long f = f(fArr, hd5.a(my4Var.b(), my4Var.d()));
        long f2 = f(fArr, hd5.a(my4Var.b(), my4Var.a()));
        long f3 = f(fArr, hd5.a(my4Var.c(), my4Var.d()));
        long f4 = f(fArr, hd5.a(my4Var.c(), my4Var.a()));
        my4Var.i(Math.min(Math.min(fd5.o(f), fd5.o(f2)), Math.min(fd5.o(f3), fd5.o(f4))));
        my4Var.k(Math.min(Math.min(fd5.p(f), fd5.p(f2)), Math.min(fd5.p(f3), fd5.p(f4))));
        my4Var.j(Math.max(Math.max(fd5.o(f), fd5.o(f2)), Math.max(fd5.o(f3), fd5.o(f4))));
        my4Var.h(Math.max(Math.max(fd5.p(f), fd5.p(f2)), Math.max(fd5.p(f3), fd5.p(f4))));
    }

    public static final void h(float[] fArr) {
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            while (i2 < 4) {
                fArr[(i2 * 4) + i] = i == i2 ? 1.0f : 0.0f;
                i2++;
            }
            i++;
        }
    }

    public static final void i(float[] fArr, float f) {
        double d = (f * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f2 = fArr[0];
        float f3 = fArr[4];
        float f4 = -sin;
        float f5 = fArr[1];
        float f6 = fArr[5];
        float f7 = fArr[2];
        float f8 = fArr[6];
        float f9 = fArr[3];
        float f10 = fArr[7];
        fArr[0] = (cos * f2) + (sin * f3);
        fArr[1] = (cos * f5) + (sin * f6);
        fArr[2] = (cos * f7) + (sin * f8);
        fArr[3] = (cos * f9) + (sin * f10);
        fArr[4] = (f2 * f4) + (f3 * cos);
        fArr[5] = (f5 * f4) + (f6 * cos);
        fArr[6] = (f7 * f4) + (f8 * cos);
        fArr[7] = (f4 * f9) + (cos * f10);
    }

    public static final void j(float[] fArr, float f, float f2, float f3) {
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        fArr[3] = fArr[3] * f;
        fArr[4] = fArr[4] * f2;
        fArr[5] = fArr[5] * f2;
        fArr[6] = fArr[6] * f2;
        fArr[7] = fArr[7] * f2;
        fArr[8] = fArr[8] * f3;
        fArr[9] = fArr[9] * f3;
        fArr[10] = fArr[10] * f3;
        fArr[11] = fArr[11] * f3;
    }

    public static final void k(float[] fArr, float[] fArr2) {
        float b2;
        float b3;
        float b4;
        float b5;
        float b6;
        float b7;
        float b8;
        float b9;
        float b10;
        float b11;
        float b12;
        float b13;
        float b14;
        float b15;
        float b16;
        float b17;
        b2 = lg4.b(fArr, 0, fArr2, 0);
        b3 = lg4.b(fArr, 0, fArr2, 1);
        b4 = lg4.b(fArr, 0, fArr2, 2);
        b5 = lg4.b(fArr, 0, fArr2, 3);
        b6 = lg4.b(fArr, 1, fArr2, 0);
        b7 = lg4.b(fArr, 1, fArr2, 1);
        b8 = lg4.b(fArr, 1, fArr2, 2);
        b9 = lg4.b(fArr, 1, fArr2, 3);
        b10 = lg4.b(fArr, 2, fArr2, 0);
        b11 = lg4.b(fArr, 2, fArr2, 1);
        b12 = lg4.b(fArr, 2, fArr2, 2);
        b13 = lg4.b(fArr, 2, fArr2, 3);
        b14 = lg4.b(fArr, 3, fArr2, 0);
        b15 = lg4.b(fArr, 3, fArr2, 1);
        b16 = lg4.b(fArr, 3, fArr2, 2);
        b17 = lg4.b(fArr, 3, fArr2, 3);
        fArr[0] = b2;
        fArr[1] = b3;
        fArr[2] = b4;
        fArr[3] = b5;
        fArr[4] = b6;
        fArr[5] = b7;
        fArr[6] = b8;
        fArr[7] = b9;
        fArr[8] = b10;
        fArr[9] = b11;
        fArr[10] = b12;
        fArr[11] = b13;
        fArr[12] = b14;
        fArr[13] = b15;
        fArr[14] = b16;
        fArr[15] = b17;
    }

    public static String l(float[] fArr) {
        return h.f("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    public static final void m(float[] fArr, float f, float f2, float f3) {
        float f4 = (fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * f3) + fArr[12];
        float f5 = (fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * f3) + fArr[13];
        float f6 = (fArr[2] * f) + (fArr[6] * f2) + (fArr[10] * f3) + fArr[14];
        float f7 = (fArr[3] * f) + (fArr[7] * f2) + (fArr[11] * f3) + fArr[15];
        fArr[12] = f4;
        fArr[13] = f5;
        fArr[14] = f6;
        fArr[15] = f7;
    }

    public static /* synthetic */ void n(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        m(fArr, f, f2, f3);
    }

    public boolean equals(Object obj) {
        return d(this.a, obj);
    }

    public int hashCode() {
        return e(this.a);
    }

    public final /* synthetic */ float[] o() {
        return this.a;
    }

    public String toString() {
        return l(this.a);
    }
}
