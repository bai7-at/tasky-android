package defpackage;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.MenuKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;

/* loaded from: classes.dex */
public final class vp4 {
    public static final vp4 a = new vp4();
    private static final ym5 b;

    static {
        float f;
        f = MenuKt.b;
        b = PaddingKt.b(f, bu1.g(0));
    }

    private vp4() {
    }

    public final bq4 a(go0 go0Var) {
        bq4 d = go0Var.d();
        if (d != null) {
            return d;
        }
        mq4 mq4Var = mq4.a;
        bq4 bq4Var = new bq4(ColorSchemeKt.h(go0Var, mq4Var.h()), ColorSchemeKt.h(go0Var, mq4Var.j()), ColorSchemeKt.h(go0Var, mq4Var.l()), nn0.r(ColorSchemeKt.h(go0Var, mq4Var.e()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), nn0.r(ColorSchemeKt.h(go0Var, mq4Var.f()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), nn0.r(ColorSchemeKt.h(go0Var, mq4Var.g()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        go0Var.Q(bq4Var);
        return bq4Var;
    }

    public final ym5 b() {
        return b;
    }

    public final bq4 c(Composer composer, int i) {
        composer.z(1326531516);
        if (b.G()) {
            b.S(1326531516, i, -1, "androidx.compose.material3.MenuDefaults.itemColors (Menu.kt:67)");
        }
        bq4 a2 = a(zf4.a.a(composer, 6));
        if (b.G()) {
            b.R();
        }
        composer.R();
        return a2;
    }
}
