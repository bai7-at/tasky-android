package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

/* loaded from: classes.dex */
final class g {
    public static final g a = new g();

    private g() {
    }

    public final void a(AccessibilityNodeInfo accessibilityNodeInfo, List<String> list) {
        accessibilityNodeInfo.setAvailableExtraData(list);
    }
}
