package defpackage;

import android.os.Build;
import android.view.View;

/* loaded from: classes4.dex */
public final class v63 {
    private final int a;

    public v63() {
        this.a = Build.VERSION.SDK_INT >= 30 ? 16 : 6;
    }

    public final void a(View view) {
        zq3.h(view, "view");
        view.setHapticFeedbackEnabled(true);
        view.performHapticFeedback(this.a, 2);
    }
}
