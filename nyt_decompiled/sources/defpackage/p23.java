package defpackage;

import android.graphics.Rect;
import android.view.Gravity;

/* loaded from: classes.dex */
public abstract class p23 {
    public static void a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        Gravity.apply(i, i2, i3, rect, rect2, i4);
    }

    public static int b(int i, int i2) {
        return Gravity.getAbsoluteGravity(i, i2);
    }
}
