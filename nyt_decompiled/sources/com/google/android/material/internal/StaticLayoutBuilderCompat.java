package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import defpackage.c18;

/* loaded from: classes3.dex */
final class StaticLayoutBuilderCompat {
    static final int n = 1;
    private CharSequence a;
    private final TextPaint b;
    private final int c;
    private int e;
    private boolean l;
    private int d = 0;
    private Layout.Alignment f = Layout.Alignment.ALIGN_NORMAL;
    private int g = Integer.MAX_VALUE;
    private float h = 0.0f;
    private float i = 1.0f;
    private int j = n;
    private boolean k = true;
    private TextUtils.TruncateAt m = null;

    static class StaticLayoutBuilderCompatException extends Exception {
    }

    private StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i) {
        this.a = charSequence;
        this.b = textPaint;
        this.c = i;
        this.e = charSequence.length();
    }

    public static StaticLayoutBuilderCompat b(CharSequence charSequence, TextPaint textPaint, int i) {
        return new StaticLayoutBuilderCompat(charSequence, textPaint, i);
    }

    public StaticLayout a() {
        if (this.a == null) {
            this.a = "";
        }
        int max = Math.max(0, this.c);
        CharSequence charSequence = this.a;
        if (this.g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.b, max, this.m);
        }
        int min = Math.min(charSequence.length(), this.e);
        this.e = min;
        if (this.l && this.g == 1) {
            this.f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.d, min, this.b, max);
        obtain.setAlignment(this.f);
        obtain.setIncludePad(this.k);
        obtain.setTextDirection(this.l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.m;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.g);
        float f = this.h;
        if (f != 0.0f || this.i != 1.0f) {
            obtain.setLineSpacing(f, this.i);
        }
        if (this.g > 1) {
            obtain.setHyphenationFrequency(this.j);
        }
        return obtain.build();
    }

    public StaticLayoutBuilderCompat c(Layout.Alignment alignment) {
        this.f = alignment;
        return this;
    }

    public StaticLayoutBuilderCompat d(TextUtils.TruncateAt truncateAt) {
        this.m = truncateAt;
        return this;
    }

    public StaticLayoutBuilderCompat e(int i) {
        this.j = i;
        return this;
    }

    public StaticLayoutBuilderCompat f(boolean z) {
        this.k = z;
        return this;
    }

    public StaticLayoutBuilderCompat g(boolean z) {
        this.l = z;
        return this;
    }

    public StaticLayoutBuilderCompat h(float f, float f2) {
        this.h = f;
        this.i = f2;
        return this;
    }

    public StaticLayoutBuilderCompat i(int i) {
        this.g = i;
        return this;
    }

    public StaticLayoutBuilderCompat j(c18 c18Var) {
        return this;
    }
}
