package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.nytimes.subauth.ui.purr.ui.theme.PurrUIColorsKt;

/* loaded from: classes4.dex */
public final class m36 {
    public static final m36 a = new m36();

    private m36() {
    }

    public final t96 a(Composer composer, int i) {
        t96 t96Var;
        if (b.G()) {
            b.S(-1567598362, i, -1, "com.nytimes.subauth.ui.purr.ui.theme.PrivacyTheme.<get-privacySettingColor> (Theme.kt:49)");
        }
        if (r81.a(composer, 0)) {
            composer.z(337289266);
            t96Var = (t96) composer.m(PurrUIColorsKt.a());
            composer.R();
        } else {
            composer.z(337355606);
            t96Var = (t96) composer.m(PurrUIColorsKt.d());
            composer.R();
        }
        if (b.G()) {
            b.R();
        }
        return t96Var;
    }

    public final t96 b(Composer composer, int i) {
        t96 t96Var;
        if (b.G()) {
            b.S(1282104244, i, -1, "com.nytimes.subauth.ui.purr.ui.theme.PrivacyTheme.<get-purrTCFColor> (Theme.kt:59)");
        }
        if (r81.a(composer, 0)) {
            composer.z(1283054440);
            t96Var = (t96) composer.m(PurrUIColorsKt.a());
            composer.R();
        } else {
            composer.z(1283120780);
            t96Var = (t96) composer.m(PurrUIColorsKt.d());
            composer.R();
        }
        if (b.G()) {
            b.R();
        }
        return t96Var;
    }
}
