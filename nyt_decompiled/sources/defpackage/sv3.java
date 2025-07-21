package defpackage;

import android.view.KeyEvent;

/* loaded from: classes.dex */
public final class sv3 {
    private final KeyEvent a;

    private /* synthetic */ sv3(KeyEvent keyEvent) {
        this.a = keyEvent;
    }

    public static final /* synthetic */ sv3 a(KeyEvent keyEvent) {
        return new sv3(keyEvent);
    }

    public static KeyEvent b(KeyEvent keyEvent) {
        return keyEvent;
    }

    public static boolean c(KeyEvent keyEvent, Object obj) {
        return (obj instanceof sv3) && zq3.c(keyEvent, ((sv3) obj).f());
    }

    public static int d(KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    public static String e(KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public boolean equals(Object obj) {
        return c(this.a, obj);
    }

    public final /* synthetic */ KeyEvent f() {
        return this.a;
    }

    public int hashCode() {
        return d(this.a);
    }

    public String toString() {
        return e(this.a);
    }
}
