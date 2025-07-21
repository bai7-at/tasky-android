package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes4.dex */
public final class uj8 extends CharacterStyle {
    private final float a;
    private final float b;
    private final float c;
    private final int d;

    public uj8(float f, float f2, float f3, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        zq3.h(textPaint, "textPaint");
        textPaint.setShadowLayer(this.a, this.b, this.c, this.d);
    }
}
