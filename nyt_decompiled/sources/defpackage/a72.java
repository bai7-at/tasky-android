package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import coil.decode.ExifOrientationPolicy;

/* loaded from: classes.dex */
public final class a72 {
    public static final a72 a = new a72();
    private static final Paint b = new Paint(3);

    private a72() {
    }

    public final u62 a(String str, sd0 sd0Var, ExifOrientationPolicy exifOrientationPolicy) {
        if (!b72.c(exifOrientationPolicy, str)) {
            return u62.d;
        }
        v62 v62Var = new v62(new x62(sd0Var.peek().t1()));
        return new u62(v62Var.t(), v62Var.l());
    }

    public final Bitmap b(Bitmap bitmap, u62 u62Var) {
        Bitmap createBitmap;
        if (!u62Var.b() && !b72.a(u62Var)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width = bitmap.getWidth() / 2.0f;
        float height = bitmap.getHeight() / 2.0f;
        if (u62Var.b()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (b72.a(u62Var)) {
            matrix.postRotate(u62Var.a(), width, height);
        }
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        float f = rectF.left;
        if (f != 0.0f || rectF.top != 0.0f) {
            matrix.postTranslate(-f, -rectF.top);
        }
        if (b72.b(u62Var)) {
            createBitmap = Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), a.c(bitmap));
            zq3.g(createBitmap, "createBitmap(width, height, config)");
        } else {
            createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), a.c(bitmap));
            zq3.g(createBitmap, "createBitmap(width, height, config)");
        }
        new Canvas(createBitmap).drawBitmap(bitmap, matrix, b);
        bitmap.recycle();
        return createBitmap;
    }
}
