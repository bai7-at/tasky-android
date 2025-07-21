package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;

/* loaded from: classes4.dex */
public final class yh8 extends Drawable {
    private final TextPaint a;
    private final int b;
    private final int c;
    private final StaticLayout d;

    public yh8(Paint paint, int i, CharSequence charSequence) {
        zq3.h(paint, "paint");
        zq3.h(charSequence, "text");
        TextPaint textPaint = new TextPaint(paint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        textPaint.setColor(i);
        this.a = textPaint;
        int measureText = (int) (textPaint.measureText(charSequence, 0, charSequence.length()) + 0.5d);
        this.b = measureText;
        int fontMetricsInt = textPaint.getFontMetricsInt(null);
        this.c = fontMetricsInt;
        StaticLayout build = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, measureText).build();
        zq3.g(build, "build(...)");
        this.d = build;
        setBounds(0, 0, measureText, fontMetricsInt);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        zq3.h(canvas, "canvas");
        canvas.translate(0.0f, -((this.d.getHeight() - this.c) / 2));
        this.d.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
