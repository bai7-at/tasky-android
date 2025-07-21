package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;

/* loaded from: classes.dex */
public final class jk0 {
    public static final jk0 a = new jk0();

    private jk0() {
    }

    public final ik0 a(long j, long j2, long j3, long j4, long j5, Composer composer, int i, int i2) {
        composer.z(469524104);
        long l = (i2 & 1) != 0 ? ag4.a.a(composer, 6).l() : j;
        long r = (i2 & 2) != 0 ? nn0.r(ag4.a.a(composer, 6).i(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long n = (i2 & 4) != 0 ? ag4.a.a(composer, 6).n() : j3;
        long r2 = (i2 & 8) != 0 ? nn0.r(ag4.a.a(composer, 6).i(), uv0.a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j4;
        long r3 = (i2 & 16) != 0 ? nn0.r(l, uv0.a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j5;
        if (b.G()) {
            b.S(469524104, i, -1, "androidx.compose.material.CheckboxDefaults.colors (Checkbox.kt:232)");
        }
        Object[] objArr = {nn0.j(l), nn0.j(r), nn0.j(n), nn0.j(r2), nn0.j(r3)};
        composer.z(-568225417);
        boolean z = false;
        for (int i3 = 0; i3 < 5; i3++) {
            z |= composer.S(objArr[i3]);
        }
        Object A = composer.A();
        if (z || A == Composer.a.a()) {
            A = new qg1(n, nn0.r(n, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), l, nn0.r(l, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), r2, nn0.r(r2, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), r3, l, r, r2, r3, null);
            composer.q(A);
        }
        composer.R();
        qg1 qg1Var = (qg1) A;
        if (b.G()) {
            b.R();
        }
        composer.R();
        return qg1Var;
    }
}
