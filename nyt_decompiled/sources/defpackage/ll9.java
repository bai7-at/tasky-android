package defpackage;

import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final class ll9 {
    public static final ll9 a = new ll9();

    private ll9() {
    }

    public final void a(AndroidComposeView androidComposeView) {
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
