package defpackage;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.colorspace.c;
import defpackage.tf3;

/* renamed from: if, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0565if {
    public static final sf3 a(int i, int i2, int i3, boolean z, c cVar) {
        d(i3);
        return new hf(ej.b(i, i2, i3, z, cVar));
    }

    public static final Bitmap b(sf3 sf3Var) {
        if (sf3Var instanceof hf) {
            return ((hf) sf3Var).c();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final sf3 c(Bitmap bitmap) {
        return new hf(bitmap);
    }

    public static final Bitmap.Config d(int i) {
        tf3.a aVar = tf3.b;
        return tf3.i(i, aVar.b()) ? Bitmap.Config.ARGB_8888 : tf3.i(i, aVar.a()) ? Bitmap.Config.ALPHA_8 : tf3.i(i, aVar.e()) ? Bitmap.Config.RGB_565 : tf3.i(i, aVar.c()) ? Bitmap.Config.RGBA_F16 : tf3.i(i, aVar.d()) ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final int e(Bitmap.Config config) {
        return config == Bitmap.Config.ALPHA_8 ? tf3.b.a() : config == Bitmap.Config.RGB_565 ? tf3.b.e() : config == Bitmap.Config.ARGB_4444 ? tf3.b.b() : config == Bitmap.Config.RGBA_F16 ? tf3.b.c() : config == Bitmap.Config.HARDWARE ? tf3.b.d() : tf3.b.b();
    }
}
