package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public abstract class m04 {
    public static final Modifier b(Modifier modifier, n04 n04Var, k04 k04Var, boolean z, LayoutDirection layoutDirection, Orientation orientation, boolean z2, Composer composer, int i) {
        composer.z(1331498025);
        if (b.G()) {
            b.S(1331498025, i, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutBeyondBoundsModifier (LazyLayoutBeyondBoundsModifierLocal.kt:51)");
        }
        if (z2) {
            Object[] objArr = {n04Var, k04Var, Boolean.valueOf(z), layoutDirection, orientation};
            composer.z(-568225417);
            boolean z3 = false;
            for (int i2 = 0; i2 < 5; i2++) {
                z3 |= composer.S(objArr[i2]);
            }
            Object A = composer.A();
            if (z3 || A == Composer.a.a()) {
                A = new l04(n04Var, k04Var, z, layoutDirection, orientation);
                composer.q(A);
            }
            composer.R();
            modifier = modifier.h((Modifier) A);
        }
        if (b.G()) {
            b.R();
        }
        composer.R();
        return modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void c() {
        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
    }
}
