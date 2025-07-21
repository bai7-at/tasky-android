package defpackage;

import android.graphics.Color;

/* loaded from: classes.dex */
abstract class dh0 {
    static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    static final float[] c = {95.047f, 100.0f, 108.883f};
    static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    static int a(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return qo0.c(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    static float b(int i) {
        return c(g(i));
    }

    static float c(float f) {
        float f2 = f / 100.0f;
        return f2 <= 0.008856452f ? f2 * 903.2963f : (((float) Math.cbrt(f2)) * 116.0f) - 16.0f;
    }

    static float d(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    static float e(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    static void f(int i, float[] fArr) {
        float e = e(Color.red(i));
        float e2 = e(Color.green(i));
        float e3 = e(Color.blue(i));
        float[][] fArr2 = d;
        float[] fArr3 = fArr2[0];
        fArr[0] = (fArr3[0] * e) + (fArr3[1] * e2) + (fArr3[2] * e3);
        float[] fArr4 = fArr2[1];
        fArr[1] = (fArr4[0] * e) + (fArr4[1] * e2) + (fArr4[2] * e3);
        float[] fArr5 = fArr2[2];
        fArr[2] = (e * fArr5[0]) + (e2 * fArr5[1]) + (e3 * fArr5[2]);
    }

    static float g(int i) {
        float e = e(Color.red(i));
        float e2 = e(Color.green(i));
        float e3 = e(Color.blue(i));
        float[] fArr = d[1];
        return (e * fArr[0]) + (e2 * fArr[1]) + (e3 * fArr[2]);
    }

    static float h(float f) {
        return (f > 8.0f ? (float) Math.pow((f + 16.0d) / 116.0d, 3.0d) : f / 903.2963f) * 100.0f;
    }
}
