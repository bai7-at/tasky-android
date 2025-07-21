package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public abstract class f {
    public static final Modifier a(Modifier modifier, FocusRequester focusRequester) {
        return modifier.h(new FocusRequesterElement(focusRequester));
    }
}
