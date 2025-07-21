package defpackage;

import android.window.BackEvent;

/* loaded from: classes.dex */
public final class jj {
    public static final jj a = new jj();

    private jj() {
    }

    public final BackEvent a(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }

    public final float b(BackEvent backEvent) {
        zq3.h(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        zq3.h(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        zq3.h(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        zq3.h(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
