package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import defpackage.ag4;
import defpackage.bu1;
import defpackage.eb0;
import defpackage.fb0;
import defpackage.nn0;
import defpackage.uv0;
import defpackage.ve0;
import defpackage.wn0;
import defpackage.xe0;
import defpackage.ym5;

/* loaded from: classes.dex */
public final class a {
    public static final a a = new a();
    private static final float b;
    private static final float c;
    private static final ym5 d;
    private static final float e;
    private static final float f;
    private static final float g;
    private static final float h;
    private static final float i;
    private static final float j;
    private static final ym5 k;
    public static final int l = 0;

    static {
        float g2 = bu1.g(16);
        b = g2;
        float f2 = 8;
        float g3 = bu1.g(f2);
        c = g3;
        ym5 d2 = PaddingKt.d(g2, g3, g2, g3);
        d = d2;
        e = bu1.g(64);
        f = bu1.g(36);
        g = bu1.g(18);
        h = bu1.g(f2);
        i = bu1.g(1);
        float g4 = bu1.g(f2);
        j = g4;
        k = PaddingKt.d(g4, d2.d(), g4, d2.a());
    }

    private a() {
    }

    public final ve0 a(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        long j6;
        composer.z(1870371134);
        long j7 = (i3 & 1) != 0 ? ag4.a.a(composer, 6).j() : j2;
        long b2 = (i3 & 2) != 0 ? ColorsKt.b(j7, composer, i2 & 14) : j3;
        if ((i3 & 4) != 0) {
            ag4 ag4Var = ag4.a;
            j6 = wn0.g(nn0.r(ag4Var.a(composer, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ag4Var.a(composer, 6).n());
        } else {
            j6 = j4;
        }
        long r = (i3 & 8) != 0 ? nn0.r(ag4.a.a(composer, 6).i(), uv0.a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j5;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1870371134, i2, -1, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:411)");
        }
        c cVar = new c(j7, b2, j6, r, null);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return cVar;
    }

    public final xe0 b(float f2, float f3, float f4, float f5, float f6, Composer composer, int i2, int i3) {
        composer.z(-737170518);
        if ((i3 & 1) != 0) {
            f2 = bu1.g(2);
        }
        float f7 = f2;
        if ((i3 & 2) != 0) {
            f3 = bu1.g(8);
        }
        float f8 = f3;
        if ((i3 & 4) != 0) {
            f4 = bu1.g(0);
        }
        float f9 = f4;
        if ((i3 & 8) != 0) {
            f5 = bu1.g(4);
        }
        float f10 = f5;
        if ((i3 & 16) != 0) {
            f6 = bu1.g(4);
        }
        float f11 = f6;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-737170518, i2, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:376)");
        }
        Object[] objArr = {bu1.d(f7), bu1.d(f8), bu1.d(f9), bu1.d(f10), bu1.d(f11)};
        composer.z(-568225417);
        boolean z = false;
        for (int i4 = 0; i4 < 5; i4++) {
            z |= composer.S(objArr[i4]);
        }
        Object A = composer.A();
        if (z || A == Composer.a.a()) {
            A = new DefaultButtonElevation(f7, f8, f9, f10, f11, null);
            composer.q(A);
        }
        composer.R();
        DefaultButtonElevation defaultButtonElevation = (DefaultButtonElevation) A;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return defaultButtonElevation;
    }

    public final ym5 c() {
        return d;
    }

    public final float d() {
        return g;
    }

    public final float e() {
        return h;
    }

    public final float f() {
        return f;
    }

    public final float g() {
        return e;
    }

    public final eb0 h(Composer composer, int i2) {
        composer.z(-2091313033);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-2091313033, i2, -1, "androidx.compose.material.ButtonDefaults.<get-outlinedBorder> (Button.kt:475)");
        }
        eb0 a2 = fb0.a(i, nn0.r(ag4.a.a(composer, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return a2;
    }

    public final ym5 i() {
        return k;
    }

    public final ve0 j(long j2, long j3, long j4, Composer composer, int i2, int i3) {
        composer.z(-2124406093);
        long n = (i3 & 1) != 0 ? ag4.a.a(composer, 6).n() : j2;
        long j5 = (i3 & 2) != 0 ? ag4.a.a(composer, 6).j() : j3;
        long r = (i3 & 4) != 0 ? nn0.r(ag4.a.a(composer, 6).i(), uv0.a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-2124406093, i2, -1, "androidx.compose.material.ButtonDefaults.outlinedButtonColors (Button.kt:432)");
        }
        c cVar = new c(n, j5, n, r, null);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return cVar;
    }

    public final ve0 k(long j2, long j3, long j4, Composer composer, int i2, int i3) {
        composer.z(182742216);
        long f2 = (i3 & 1) != 0 ? nn0.b.f() : j2;
        long j5 = (i3 & 2) != 0 ? ag4.a.a(composer, 6).j() : j3;
        long r = (i3 & 4) != 0 ? nn0.r(ag4.a.a(composer, 6).i(), uv0.a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(182742216, i2, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:453)");
        }
        c cVar = new c(f2, j5, f2, r, null);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return cVar;
    }
}
