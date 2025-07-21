package defpackage;

import android.graphics.BlendMode;
import android.graphics.Paint;
import androidx.core.graphics.BlendModeCompat;

/* loaded from: classes.dex */
public abstract class bo5 {
    private static final ThreadLocal a = new ThreadLocal();

    static class a {
        static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    static class b {
        static void a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    public static boolean a(Paint paint, String str) {
        return a.a(paint, str);
    }

    public static boolean b(Paint paint, BlendModeCompat blendModeCompat) {
        b.a(paint, blendModeCompat != null ? f90.a(blendModeCompat) : null);
        return true;
    }
}
