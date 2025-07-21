package androidx.compose.ui.platform;

import android.view.View;

/* loaded from: classes.dex */
final class m {
    public static final m a = new m();

    private m() {
    }

    public final void a(View view, int i, boolean z) {
        view.setFocusable(i);
        view.setDefaultFocusHighlightEnabled(z);
    }
}
