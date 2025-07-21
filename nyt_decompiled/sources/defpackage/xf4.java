package defpackage;

import androidx.compose.material.ColorsKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;

/* loaded from: classes.dex */
public abstract class xf4 {
    private static final float a(long j, long j2, long j3) {
        float f = 0.2f;
        float f2 = 0.4f;
        float f3 = 0.4f;
        for (int i = 0; i < 7; i++) {
            float c = (c(j, f2, j2, j3) / 4.5f) - 1.0f;
            if (0.0f <= c && c <= 0.01f) {
                break;
            }
            if (c < 0.0f) {
                f3 = f2;
            } else {
                f = f2;
            }
            f2 = (f3 + f) / 2.0f;
        }
        return f2;
    }

    public static final float b(long j, long j2) {
        float i = wn0.i(j) + 0.05f;
        float i2 = wn0.i(j2) + 0.05f;
        return Math.max(i, i2) / Math.min(i, i2);
    }

    private static final float c(long j, float f, long j2, long j3) {
        long g = wn0.g(nn0.r(j, f, 0.0f, 0.0f, 0.0f, 14, null), j3);
        return b(wn0.g(j2, g), g);
    }

    public static final long d(long j, long j2, long j3) {
        return nn0.r(j, c(j, 0.4f, j2, j3) >= 4.5f ? 0.4f : c(j, 0.2f, j2, j3) < 4.5f ? 0.2f : a(j, j2, j3), 0.0f, 0.0f, 0.0f, 14, null);
    }

    public static final sj8 e(ro0 ro0Var, Composer composer, int i) {
        composer.z(-721696685);
        if (b.G()) {
            b.S(-721696685, i, -1, "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)");
        }
        long j = ro0Var.j();
        long c = ro0Var.c();
        composer.z(35572910);
        long a = ColorsKt.a(ro0Var, c);
        if (a == nn0.b.g()) {
            a = ((nn0) composer.m(ContentColorKt.a())).B();
        }
        long j2 = a;
        composer.R();
        long r = nn0.r(j2, uv0.a.d(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        nn0 j3 = nn0.j(j);
        nn0 j4 = nn0.j(c);
        nn0 j5 = nn0.j(r);
        composer.z(1618982084);
        boolean S = composer.S(j3) | composer.S(j4) | composer.S(j5);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = new sj8(ro0Var.j(), d(j, r, c), null);
            composer.q(A);
        }
        composer.R();
        sj8 sj8Var = (sj8) A;
        if (b.G()) {
            b.R();
        }
        composer.R();
        return sj8Var;
    }
}
