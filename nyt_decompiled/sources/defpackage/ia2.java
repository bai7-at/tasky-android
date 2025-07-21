package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public class ia2 extends Drawable {
    protected Bitmap a;
    protected Paint b;
    protected int c;
    protected int d;

    public ia2(Bitmap bitmap) {
        this.a = bitmap;
        if (bitmap != null) {
            this.c = bitmap.getWidth();
            this.d = this.a.getHeight();
        } else {
            this.c = 0;
            this.d = 0;
        }
        Paint paint = new Paint();
        this.b = paint;
        paint.setDither(true);
        this.b.setFilterBitmap(true);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.a;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            canvas.drawBitmap(this.a, 0.0f, 0.0f, this.b);
        } else {
            canvas.drawBitmap(this.a, (Rect) null, bounds, this.b);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
