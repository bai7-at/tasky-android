package defpackage;

import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class hj {
    public static final hj a = new hj();

    private hj() {
    }

    public final int a(AccessibilityManager accessibilityManager, int i, int i2) {
        return accessibilityManager.getRecommendedTimeoutMillis(i, i2);
    }
}
