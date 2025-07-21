package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: classes.dex */
final class zn5 {
    public static final zn5 a = new zn5();

    private zn5() {
    }

    public static final void a(Paint paint, CharSequence charSequence, int i, int i2, Rect rect) {
        paint.getTextBounds(charSequence, i, i2, rect);
    }
}
