package defpackage;

import android.graphics.ColorMatrix;

/* loaded from: classes4.dex */
public abstract class zn0 {
    public static void a(ColorMatrix colorMatrix, float f) {
        float c = c(f * 255.0f, 255.0f);
        colorMatrix.set(new float[]{1.0f, 0.0f, 0.0f, 0.0f, c, 0.0f, 1.0f, 0.0f, 0.0f, c, 0.0f, 0.0f, 1.0f, 0.0f, c, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static void b(ColorMatrix colorMatrix, float f) {
        float f2 = f + 1.0f;
        float f3 = (((-0.5f) * f2) + 0.5f) * 255.0f;
        colorMatrix.set(new float[]{f2, 0.0f, 0.0f, 0.0f, f3, 0.0f, f2, 0.0f, 0.0f, f3, 0.0f, 0.0f, f2, 0.0f, f3, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    private static float c(float f, float f2) {
        return Math.min(f2, Math.max(-f2, f));
    }
}
