package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;

/* loaded from: classes.dex */
public final class oo6 {
    public static final oo6 a = new oo6();

    private oo6() {
    }

    public final no6 a(long j, long j2, long j3, Composer composer, int i, int i2) {
        composer.z(1370708026);
        long l = (i2 & 1) != 0 ? ag4.a.a(composer, 6).l() : j;
        long r = (i2 & 2) != 0 ? nn0.r(ag4.a.a(composer, 6).i(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long r2 = (i2 & 4) != 0 ? nn0.r(ag4.a.a(composer, 6).i(), uv0.a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        if (b.G()) {
            b.S(1370708026, i, -1, "androidx.compose.material.RadioButtonDefaults.colors (RadioButton.kt:166)");
        }
        nn0 j4 = nn0.j(l);
        nn0 j5 = nn0.j(r);
        nn0 j6 = nn0.j(r2);
        composer.z(1618982084);
        boolean S = composer.S(j4) | composer.S(j5) | composer.S(j6);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = new bj1(l, r, r2, null);
            composer.q(A);
        }
        composer.R();
        bj1 bj1Var = (bj1) A;
        if (b.G()) {
            b.R();
        }
        composer.R();
        return bj1Var;
    }
}
