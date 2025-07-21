package defpackage;

import android.view.KeyEvent;

/* loaded from: classes.dex */
public abstract class hi8 {
    public static final boolean a(KeyEvent keyEvent) {
        return keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar());
    }
}
