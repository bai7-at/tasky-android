package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes4.dex */
public class e37 implements bh3 {
    private final float a;
    private final int b;
    private final String c;

    public e37(float f, int i) {
        this.a = f;
        this.b = i;
        this.c = "RoundedTransformation(radius=" + f + ", margin=" + i + ")";
    }

    private void c(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.b;
        int i2 = this.b;
        RectF rectF = new RectF(i2, i2, f - i, f2 - i);
        float f3 = this.a;
        canvas.drawRoundRect(rectF, f3, f3, paint);
    }

    @Override // defpackage.bh3
    public String a() {
        return this.c;
    }

    @Override // defpackage.bh3
    public Bitmap b(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        c(canvas, paint, width, height);
        bitmap.recycle();
        return createBitmap;
    }
}
