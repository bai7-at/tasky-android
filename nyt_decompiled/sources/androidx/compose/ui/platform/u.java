package androidx.compose.ui.platform;

import android.view.View;

/* loaded from: classes.dex */
final class u {
    public static final u a = new u();

    private u() {
    }

    public final void a(View view, int i) {
        view.setOutlineAmbientShadowColor(i);
    }

    public final void b(View view, int i) {
        view.setOutlineSpotShadowColor(i);
    }
}
