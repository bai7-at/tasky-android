package defpackage;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.y;

/* loaded from: classes.dex */
public abstract class ei8 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final x08 b(boolean z, boolean z2, eo3 eo3Var, di8 di8Var, float f, float f2, Composer composer, int i) {
        x08 o;
        composer.z(1097899920);
        if (b.G()) {
            b.S(1097899920, i, -1, "androidx.compose.material.animateBorderStrokeAsState (TextFieldDefaults.kt:892)");
        }
        x08 a = FocusInteractionKt.a(eo3Var, composer, (i >> 6) & 14);
        x08 i2 = di8Var.i(z, z2, eo3Var, composer, i & 8190);
        float f3 = c(a) ? f : f2;
        if (z) {
            composer.z(1685713622);
            o = AnimateAsStateKt.c(f3, di.k(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.R();
        } else {
            composer.z(1685713720);
            o = y.o(bu1.d(f2), composer, (i >> 15) & 14);
            composer.R();
        }
        x08 o2 = y.o(new eb0(((bu1) o.getValue()).n(), new ox7(((nn0) i2.getValue()).B(), null), null), composer, 0);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return o2;
    }

    private static final boolean c(x08 x08Var) {
        return ((Boolean) x08Var.getValue()).booleanValue();
    }
}
