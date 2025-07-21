package defpackage;

import android.view.KeyEvent;

/* loaded from: classes.dex */
public abstract class wv3 {
    public static final long a(KeyEvent keyEvent) {
        return mw3.a(keyEvent.getKeyCode());
    }

    public static final int b(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        return action != 0 ? action != 1 ? vv3.a.c() : vv3.a.b() : vv3.a.a();
    }

    public static final int c(KeyEvent keyEvent) {
        return keyEvent.getUnicodeChar();
    }

    public static final boolean d(KeyEvent keyEvent) {
        return keyEvent.isAltPressed();
    }

    public static final boolean e(KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    public static final boolean f(KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }
}
