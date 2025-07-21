package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;

/* loaded from: classes4.dex */
public final class s44 implements LineHeightSpan.WithDensity {
    private final int a;

    public s44(int i) {
        this.a = i;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        zq3.h(charSequence, "text");
        zq3.h(fontMetricsInt, "fm");
        chooseHeight(charSequence, i, i2, i3, i4, fontMetricsInt, null);
    }

    @Override // android.text.style.LineHeightSpan.WithDensity
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt, TextPaint textPaint) {
        zq3.h(charSequence, "text");
        zq3.h(fontMetricsInt, "fm");
        int i5 = this.a;
        fontMetricsInt.top = fontMetricsInt.bottom - i5;
        fontMetricsInt.ascent = fontMetricsInt.descent - i5;
    }
}
