package defpackage;

import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public abstract class x2 {
    public static int a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static void b(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }
}
