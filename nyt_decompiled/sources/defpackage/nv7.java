package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;

/* loaded from: classes2.dex */
public abstract class nv7 {
    public static final mv7 a(float f, float f2, int i, Composer composer, int i2) {
        composer.z(-2136847435);
        if (b.G()) {
            b.S(-2136847435, i2, -1, "com.google.accompanist.swiperefresh.rememberUpdatedSlingshot (Slingshot.kt:40)");
        }
        float min = Math.min(1.0f, f / f2);
        float max = (Math.max(min - 0.4f, 0.0f) * 5) / 3;
        float f3 = 2;
        float max2 = Math.max(0.0f, Math.min(Math.abs(f) - f2, f2 * f3) / f2) / 4;
        float pow = (max2 - ((float) Math.pow(max2, 2))) * f3;
        int i3 = (((int) ((f2 * min) + ((f2 * pow) * f3))) + i) - i;
        float h = uo6.h(max * 0.8f, 0.8f);
        float f4 = (((0.4f * max) - 0.25f) + (pow * f3)) * 0.5f;
        float min2 = Math.min(1.0f, max);
        composer.z(-492369756);
        Object A = composer.A();
        if (A == Composer.a.a()) {
            A = new mv7();
            composer.q(A);
        }
        composer.R();
        mv7 mv7Var = (mv7) A;
        mv7Var.h(i3);
        mv7Var.j(0.0f);
        mv7Var.g(h);
        mv7Var.i(f4);
        mv7Var.f(min2);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return mv7Var;
    }
}
