package androidx.compose.ui.platform;

import android.view.PointerIcon;
import android.view.View;
import defpackage.eg;
import defpackage.px5;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes.dex */
final class l {
    public static final l a = new l();

    private l() {
    }

    public final void a(View view, px5 px5Var) {
        PointerIcon systemIcon = px5Var instanceof eg ? PointerIcon.getSystemIcon(view.getContext(), ((eg) px5Var).a()) : PointerIcon.getSystemIcon(view.getContext(), NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT);
        if (zq3.c(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
