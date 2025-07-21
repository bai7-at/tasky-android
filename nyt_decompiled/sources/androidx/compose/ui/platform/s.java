package androidx.compose.ui.platform;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class s {
    public static final s a = new s();

    private s() {
    }

    public final boolean a(MotionEvent motionEvent, int i) {
        float rawX = motionEvent.getRawX(i);
        if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
            float rawY = motionEvent.getRawY(i);
            if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                return true;
            }
        }
        return false;
    }
}
