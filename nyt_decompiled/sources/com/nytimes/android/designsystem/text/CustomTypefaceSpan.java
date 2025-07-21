package com.nytimes.android.designsystem.text;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;
import defpackage.m07;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class CustomTypefaceSpan extends TypefaceSpan {
    private final Typeface typeFace;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTypefaceSpan(Context context, int i) {
        super("serif");
        zq3.h(context, "context");
        this.typeFace = m07.g(context.getApplicationContext(), i);
    }

    private final void a(Paint paint) {
        Typeface typeface = paint.getTypeface();
        Typeface typeface2 = this.typeFace;
        if (typeface2 != null) {
            if (typeface == null || !zq3.c(typeface, typeface2)) {
                paint.setTypeface(this.typeFace);
            }
        }
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        zq3.h(textPaint, "textPaint");
        a(textPaint);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        zq3.h(textPaint, "paint");
        a(textPaint);
    }
}
