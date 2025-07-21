package defpackage;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.ShapesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.nn0;

/* loaded from: classes.dex */
public final class we0 {
    public static final we0 a = new we0();
    private static final float b;
    private static final float c;
    private static final ym5 d;
    private static final float e;
    private static final ym5 f;
    private static final float g;
    private static final ym5 h;
    private static final float i;
    private static final ym5 j;
    private static final float k;
    private static final float l;
    private static final float m;
    private static final float n;
    public static final int o = 0;

    static {
        float g2 = bu1.g(24);
        b = g2;
        float f2 = 8;
        float g3 = bu1.g(f2);
        c = g3;
        ym5 d2 = PaddingKt.d(g2, g3, g2, g3);
        d = d2;
        float f3 = 16;
        float g4 = bu1.g(f3);
        e = g4;
        f = PaddingKt.d(g4, g3, g2, g3);
        float g5 = bu1.g(12);
        g = g5;
        h = PaddingKt.d(g5, d2.d(), g5, d2.a());
        float g6 = bu1.g(f3);
        i = g6;
        j = PaddingKt.d(g5, d2.d(), g6, d2.a());
        k = bu1.g(58);
        l = bu1.g(40);
        m = sf2.a.i();
        n = bu1.g(f2);
    }

    private we0() {
    }

    public final ue0 a(Composer composer, int i2) {
        composer.z(1449248637);
        if (b.G()) {
            b.S(1449248637, i2, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:546)");
        }
        ue0 d2 = d(zf4.a.a(composer, 6));
        if (b.G()) {
            b.R();
        }
        composer.R();
        return d2;
    }

    public final ButtonElevation b(float f2, float f3, float f4, float f5, float f6, Composer composer, int i2, int i3) {
        composer.z(1827791191);
        if ((i3 & 1) != 0) {
            f2 = sf2.a.b();
        }
        float f7 = f2;
        if ((i3 & 2) != 0) {
            f3 = sf2.a.k();
        }
        float f8 = f3;
        if ((i3 & 4) != 0) {
            f4 = sf2.a.g();
        }
        float f9 = f4;
        if ((i3 & 8) != 0) {
            f5 = sf2.a.h();
        }
        float f10 = f5;
        if ((i3 & 16) != 0) {
            f6 = sf2.a.e();
        }
        float f11 = f6;
        if (b.G()) {
            b.S(1827791191, i2, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:772)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(f7, f8, f9, f10, f11, null);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return buttonElevation;
    }

    public final ym5 c() {
        return d;
    }

    public final ue0 d(go0 go0Var) {
        ue0 b2 = go0Var.b();
        if (b2 != null) {
            return b2;
        }
        sf2 sf2Var = sf2.a;
        ue0 ue0Var = new ue0(ColorSchemeKt.h(go0Var, sf2Var.a()), ColorSchemeKt.h(go0Var, sf2Var.j()), nn0.r(ColorSchemeKt.h(go0Var, sf2Var.d()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), nn0.r(ColorSchemeKt.h(go0Var, sf2Var.f()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        go0Var.O(ue0Var);
        return ue0Var;
    }

    public final ue0 e(go0 go0Var) {
        ue0 e2 = go0Var.e();
        if (e2 != null) {
            return e2;
        }
        nn0.a aVar = nn0.b;
        long f2 = aVar.f();
        hl5 hl5Var = hl5.a;
        ue0 ue0Var = new ue0(f2, ColorSchemeKt.h(go0Var, hl5Var.c()), aVar.f(), nn0.r(ColorSchemeKt.h(go0Var, hl5Var.b()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        go0Var.R(ue0Var);
        return ue0Var;
    }

    public final float f() {
        return l;
    }

    public final float g() {
        return k;
    }

    public final eb0 h(Composer composer, int i2) {
        composer.z(-563957672);
        if (b.G()) {
            b.S(-563957672, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedButtonBorder> (Button.kt:836)");
        }
        hl5 hl5Var = hl5.a;
        eb0 a2 = fb0.a(hl5Var.e(), ColorSchemeKt.j(hl5Var.d(), composer, 6));
        if (b.G()) {
            b.R();
        }
        composer.R();
        return a2;
    }

    public final no7 i(Composer composer, int i2) {
        composer.z(-2045213065);
        if (b.G()) {
            b.S(-2045213065, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedShape> (Button.kt:536)");
        }
        no7 d2 = ShapesKt.d(hl5.a.a(), composer, 6);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return d2;
    }

    public final no7 j(Composer composer, int i2) {
        composer.z(-1234923021);
        if (b.G()) {
            b.S(-1234923021, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:527)");
        }
        no7 d2 = ShapesKt.d(sf2.a.c(), composer, 6);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return d2;
    }

    public final ue0 k(Composer composer, int i2) {
        composer.z(-1344886725);
        if (b.G()) {
            b.S(-1344886725, i2, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:675)");
        }
        ue0 e2 = e(zf4.a.a(composer, 6));
        if (b.G()) {
            b.R();
        }
        composer.R();
        return e2;
    }

    public final ue0 l(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        composer.z(-1778526249);
        long g2 = (i3 & 1) != 0 ? nn0.b.g() : j2;
        long g3 = (i3 & 2) != 0 ? nn0.b.g() : j3;
        long g4 = (i3 & 4) != 0 ? nn0.b.g() : j4;
        long g5 = (i3 & 8) != 0 ? nn0.b.g() : j5;
        if (b.G()) {
            b.S(-1778526249, i2, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:692)");
        }
        ue0 c2 = e(zf4.a.a(composer, 6)).c(g2, g3, g4, g5);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return c2;
    }
}
