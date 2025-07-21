package defpackage;

import android.graphics.Canvas;

/* loaded from: classes.dex */
final class wh0 {
    public static final wh0 a = new wh0();

    private wh0() {
    }

    public final void a(Canvas canvas, boolean z) {
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
