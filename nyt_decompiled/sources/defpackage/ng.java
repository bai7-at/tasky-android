package defpackage;

import android.text.TextPaint;

/* loaded from: classes.dex */
public abstract class ng {
    public static final void a(TextPaint textPaint, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        textPaint.setAlpha(dg4.d(uo6.l(f, 0.0f, 1.0f) * 255));
    }
}
