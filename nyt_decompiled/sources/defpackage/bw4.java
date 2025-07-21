package defpackage;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public abstract class bw4 {
    public static int a(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    public static boolean b(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
