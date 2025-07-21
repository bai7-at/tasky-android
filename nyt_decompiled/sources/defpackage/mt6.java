package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes.dex */
public abstract class mt6 {
    public static final RectF a(kt6 kt6Var) {
        return new RectF(kt6Var.i(), kt6Var.l(), kt6Var.j(), kt6Var.e());
    }

    public static final bn3 b(Rect rect) {
        return new bn3(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final kt6 c(Rect rect) {
        return new kt6(rect.left, rect.top, rect.right, rect.bottom);
    }
}
