package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import defpackage.yl2;

/* loaded from: classes.dex */
final class g extends Modifier.c implements yl2 {
    private FocusRequester n;

    public g(FocusRequester focusRequester) {
        this.n = focusRequester;
    }

    @Override // androidx.compose.ui.Modifier.c
    public void O1() {
        super.O1();
        this.n.d().b(this);
    }

    @Override // androidx.compose.ui.Modifier.c
    public void P1() {
        this.n.d().w(this);
        super.P1();
    }

    public final FocusRequester e2() {
        return this.n;
    }

    public final void f2(FocusRequester focusRequester) {
        this.n = focusRequester;
    }
}
