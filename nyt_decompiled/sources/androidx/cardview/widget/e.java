package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
abstract class e extends Drawable {
    private static final double a = Math.cos(Math.toRadians(45.0d));

    static float a(float f, float f2, boolean z) {
        return z ? (float) (f + ((1.0d - a) * f2)) : f;
    }

    static float b(float f, float f2, boolean z) {
        return z ? (float) ((f * 1.5f) + ((1.0d - a) * f2)) : f * 1.5f;
    }
}
