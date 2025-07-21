package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import defpackage.af;
import defpackage.cn2;
import defpackage.dn2;
import defpackage.e64;
import defpackage.fm1;
import defpackage.lh4;
import defpackage.ss2;

/* loaded from: classes.dex */
final class TypefaceCompatApi26 {
    public static final TypefaceCompatApi26 a = new TypefaceCompatApi26();
    private static ThreadLocal b = new ThreadLocal();

    private TypefaceCompatApi26() {
    }

    private final String b(dn2 dn2Var, Context context) {
        final fm1 a2 = af.a(context);
        return e64.e(dn2Var.a(), null, null, null, 0, null, new ss2() { // from class: androidx.compose.ui.text.font.TypefaceCompatApi26$toAndroidString$1
            {
                super(1);
            }

            public final CharSequence b(cn2 cn2Var) {
                return '\'' + cn2Var.b() + "' " + cn2Var.a(fm1.this);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                return b(null);
            }
        }, 31, null);
    }

    public final Typeface a(Typeface typeface, dn2 dn2Var, Context context) {
        if (typeface == null) {
            return null;
        }
        if (dn2Var.a().isEmpty()) {
            return typeface;
        }
        Paint paint = (Paint) b.get();
        if (paint == null) {
            paint = new Paint();
            b.set(paint);
        }
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(b(dn2Var, context));
        return paint.getTypeface();
    }
}
