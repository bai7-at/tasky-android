package defpackage;

import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.ShapesKt;
import androidx.compose.material3.TypographyKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;

/* loaded from: classes.dex */
public final class zf4 {
    public static final zf4 a = new zf4();
    public static final int b = 0;

    private zf4() {
    }

    public final go0 a(Composer composer, int i) {
        if (b.G()) {
            b.S(-561618718, i, -1, "androidx.compose.material3.MaterialTheme.<get-colorScheme> (MaterialTheme.kt:86)");
        }
        go0 go0Var = (go0) composer.m(ColorSchemeKt.i());
        if (b.G()) {
            b.R();
        }
        return go0Var;
    }

    public final jp7 b(Composer composer, int i) {
        if (b.G()) {
            b.S(419509830, i, -1, "androidx.compose.material3.MaterialTheme.<get-shapes> (MaterialTheme.kt:102)");
        }
        jp7 jp7Var = (jp7) composer.m(ShapesKt.c());
        if (b.G()) {
            b.R();
        }
        return jp7Var;
    }

    public final zu8 c(Composer composer, int i) {
        if (b.G()) {
            b.S(-942794935, i, -1, "androidx.compose.material3.MaterialTheme.<get-typography> (MaterialTheme.kt:94)");
        }
        zu8 zu8Var = (zu8) composer.m(TypographyKt.b());
        if (b.G()) {
            b.R();
        }
        return zu8Var;
    }
}
