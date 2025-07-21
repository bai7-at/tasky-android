package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import androidx.compose.ui.graphics.colorspace.c;
import androidx.compose.ui.graphics.colorspace.e;

/* loaded from: classes.dex */
public final class ej {
    public static final ej a = new ej();

    private ej() {
    }

    public static final c a(Bitmap bitmap) {
        c b;
        ColorSpace colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (b = be.b(colorSpace)) == null) ? e.a.w() : b;
    }

    public static final Bitmap b(int i, int i2, int i3, boolean z, c cVar) {
        return Bitmap.createBitmap((DisplayMetrics) null, i, i2, AbstractC0565if.d(i3), z, be.a(cVar));
    }
}
