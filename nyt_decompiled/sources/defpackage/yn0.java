package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;

/* loaded from: classes4.dex */
public class yn0 implements bh3 {
    private final ColorMatrix a;
    private final String b;

    public yn0(ColorMatrix colorMatrix) {
        this.a = colorMatrix;
        this.b = "ColorMatrixTransformation(colorMatrix=" + colorMatrix.toString() + ")";
    }

    @Override // defpackage.bh3
    public String a() {
        return this.b;
    }

    @Override // defpackage.bh3
    public Bitmap b(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(this.a);
        Paint paint = new Paint(1);
        paint.setColorFilter(colorMatrixColorFilter);
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        bitmap.recycle();
        return createBitmap;
    }
}
