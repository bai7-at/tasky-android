package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.nytimes.android.growthui.common.theme.ColorsKt;
import com.nytimes.android.growthui.common.theme.GrowthUITypographyKt;

/* loaded from: classes4.dex */
public final class c74 {
    public static final c74 a = new c74();

    private c74() {
    }

    public final w43 a(Composer composer, int i) {
        composer.z(400601667);
        if (b.G()) {
            b.S(400601667, i, -1, "com.nytimes.android.growthui.common.theme.LocalGrowthUITheme.<get-colorPalette> (GrowthUITheme.kt:33)");
        }
        w43 w43Var = (w43) composer.m(ColorsKt.c());
        if (b.G()) {
            b.R();
        }
        composer.R();
        return w43Var;
    }

    public final u53 b(Composer composer, int i) {
        composer.z(2029972908);
        if (b.G()) {
            b.S(2029972908, i, -1, "com.nytimes.android.growthui.common.theme.LocalGrowthUITheme.<get-typography> (GrowthUITheme.kt:37)");
        }
        u53 u53Var = (u53) composer.m(GrowthUITypographyKt.a());
        if (b.G()) {
            b.R();
        }
        composer.R();
        return u53Var;
    }
}
