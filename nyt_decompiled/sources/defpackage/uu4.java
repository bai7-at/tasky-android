package defpackage;

import androidx.compose.ui.window.SecureFlagPolicy;

/* loaded from: classes.dex */
public final class uu4 {
    public static final uu4 a = new uu4();

    private uu4() {
    }

    public static /* synthetic */ vu4 b(uu4 uu4Var, SecureFlagPolicy secureFlagPolicy, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            secureFlagPolicy = SecureFlagPolicy.Inherit;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return uu4Var.a(secureFlagPolicy, z, z2);
    }

    public final vu4 a(SecureFlagPolicy secureFlagPolicy, boolean z, boolean z2) {
        return new vu4(secureFlagPolicy, z, z2);
    }
}
