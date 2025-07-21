package defpackage;

import androidx.compose.ui.focus.FocusRequester;

/* loaded from: classes4.dex */
public final class b00 {
    private final FocusRequester a;
    private final dy4 b;

    public b00(FocusRequester focusRequester, dy4 dy4Var) {
        zq3.h(focusRequester, "focusRequester");
        zq3.h(dy4Var, "interactionSource");
        this.a = focusRequester;
        this.b = dy4Var;
    }

    public final FocusRequester a() {
        return this.a;
    }

    public final dy4 b() {
        return this.b;
    }
}
