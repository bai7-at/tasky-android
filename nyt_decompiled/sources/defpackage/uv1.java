package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.size.Scale;

/* loaded from: classes.dex */
public final class uv1 {
    public static final uv1 a = new uv1();

    private uv1() {
    }

    private final boolean b(Bitmap bitmap, Bitmap.Config config) {
        return bitmap.getConfig() == a.e(config);
    }

    private final boolean c(boolean z, Bitmap bitmap, au7 au7Var, Scale scale) {
        if (z) {
            return true;
        }
        return tc1.c(bitmap.getWidth(), bitmap.getHeight(), q.a(au7Var) ? bitmap.getWidth() : s.z(au7Var.d(), scale), q.a(au7Var) ? bitmap.getHeight() : s.z(au7Var.c(), scale), scale) == 1.0d;
    }

    public final Bitmap a(Drawable drawable, Bitmap.Config config, au7 au7Var, Scale scale, boolean z) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (b(bitmap, config) && c(z, bitmap, au7Var, scale)) {
                return bitmap;
            }
        }
        Drawable mutate = drawable.mutate();
        int p = s.p(mutate);
        if (p <= 0) {
            p = 512;
        }
        int i = s.i(mutate);
        int i2 = i > 0 ? i : 512;
        double c = tc1.c(p, i2, q.a(au7Var) ? p : s.z(au7Var.d(), scale), q.a(au7Var) ? i2 : s.z(au7Var.c(), scale), scale);
        int c2 = dg4.c(p * c);
        int c3 = dg4.c(c * i2);
        Bitmap createBitmap = Bitmap.createBitmap(c2, c3, a.e(config));
        zq3.g(createBitmap, "createBitmap(width, height, config)");
        Rect bounds = mutate.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        mutate.setBounds(0, 0, c2, c3);
        mutate.draw(new Canvas(createBitmap));
        mutate.setBounds(i3, i4, i5, i6);
        return createBitmap;
    }
}
