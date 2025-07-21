package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class ah3 extends ImageSpan {
    private WeakReference a;

    public ah3(Drawable drawable) {
        super(drawable, 0);
    }

    private Drawable a() {
        WeakReference weakReference = this.a;
        Drawable drawable = weakReference != null ? (Drawable) weakReference.get() : null;
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = getDrawable();
        this.a = new WeakReference(drawable2);
        return drawable2;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable a = a();
        canvas.save();
        canvas.translate(f, (i4 - a.getIntrinsicHeight()) + 1);
        a.draw(canvas);
        canvas.restore();
    }
}
