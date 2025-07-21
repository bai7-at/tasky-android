package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.nytimes.subauth.ui.ui.theme.ColorKt;

/* loaded from: classes4.dex */
public final class j98 {
    private static f68 b;
    public static final j98 a = new j98();
    public static final int c = 8;

    private j98() {
    }

    public final ro0 a(Composer composer, int i) {
        composer.z(-116013764);
        if (b.G()) {
            b.S(-116013764, i, -1, "com.nytimes.subauth.ui.ui.theme.SubauthTheme.<get-colors> (Theme.kt:90)");
        }
        ro0 a2 = ag4.a.a(composer, ag4.b);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return a2;
    }

    public final b68 b(Composer composer, int i) {
        composer.z(1056528852);
        if (b.G()) {
            b.S(1056528852, i, -1, "com.nytimes.subauth.ui.ui.theme.SubauthTheme.<get-customColors> (Theme.kt:108)");
        }
        b68 b68Var = (b68) composer.m(ColorKt.x());
        if (b.G()) {
            b.R();
        }
        composer.R();
        return b68Var;
    }

    public final k98 c(Composer composer, int i) {
        composer.z(-1095293581);
        if (b.G()) {
            b.S(-1095293581, i, -1, "com.nytimes.subauth.ui.ui.theme.SubauthTheme.<get-customTypography> (Theme.kt:112)");
        }
        k98 k98Var = new k98(b(composer, 8));
        if (b.G()) {
            b.R();
        }
        composer.R();
        return k98Var;
    }

    public final f68 d(Composer composer, int i) {
        composer.z(144267824);
        if (b.G()) {
            b.S(144267824, i, -1, "com.nytimes.subauth.ui.ui.theme.SubauthTheme.<get-subauthConfig> (Theme.kt:116)");
        }
        f68 f68Var = b;
        if (f68Var == null) {
            Resources resources = ((Context) composer.m(AndroidCompositionLocals_androidKt.g())).getResources();
            zq3.g(resources, "getResources(...)");
            f68Var = new uj1(resources, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, 134217726, null).a();
        }
        if (b.G()) {
            b.R();
        }
        composer.R();
        return f68Var;
    }

    public final void e(f68 f68Var) {
        zq3.h(f68Var, "config");
        b = f68Var;
    }
}
