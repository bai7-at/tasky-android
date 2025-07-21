package defpackage;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;

/* loaded from: classes.dex */
public abstract class qx5 {
    public static final Modifier a(Modifier modifier, px5 px5Var, boolean z) {
        return modifier.h(new PointerHoverIconModifierElement(px5Var, z));
    }

    public static /* synthetic */ Modifier b(Modifier modifier, px5 px5Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return a(modifier, px5Var, z);
    }
}
