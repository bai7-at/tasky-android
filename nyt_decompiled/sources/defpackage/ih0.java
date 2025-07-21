package defpackage;

import androidx.compose.ui.focus.FocusProperties;

/* loaded from: classes.dex */
final class ih0 implements FocusProperties {
    public static final ih0 a = new ih0();
    private static Boolean b;

    private ih0() {
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void g(boolean z) {
        b = Boolean.valueOf(z);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public boolean i() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("canFocus is read before it is written");
    }

    public final boolean k() {
        return b != null;
    }

    public final void l() {
        b = null;
    }
}
