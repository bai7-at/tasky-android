package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AbstractComposeView;

/* loaded from: classes.dex */
public interface ib9 {
    default AbstractComposeView getSubCompositionView() {
        return null;
    }

    default View getViewRoot() {
        return null;
    }
}
