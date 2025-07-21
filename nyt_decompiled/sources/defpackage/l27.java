package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.y;

/* loaded from: classes.dex */
public abstract class l27 {
    private static final eu8 a = new eu8(15, 0, xx1.d(), 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final ci c(bo3 bo3Var) {
        if (bo3Var instanceof ka3) {
            return a;
        }
        if (!(bo3Var instanceof sl2) && !(bo3Var instanceof ou1)) {
            return a;
        }
        return new eu8(45, 0, xx1.d(), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ci d(bo3 bo3Var) {
        if (!(bo3Var instanceof ka3) && !(bo3Var instanceof sl2) && (bo3Var instanceof ou1)) {
            return new eu8(150, 0, xx1.d(), 2, null);
        }
        return a;
    }

    public static final ej3 e(boolean z, float f, long j, Composer composer, int i, int i2) {
        composer.z(1635163520);
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            f = bu1.b.c();
        }
        if ((i2 & 4) != 0) {
            j = nn0.b.g();
        }
        if (b.G()) {
            b.S(1635163520, i, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:80)");
        }
        x08 o = y.o(nn0.j(j), composer, (i >> 6) & 14);
        Boolean valueOf = Boolean.valueOf(z);
        bu1 d = bu1.d(f);
        composer.z(511388516);
        boolean S = composer.S(valueOf) | composer.S(d);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = new androidx.compose.material.ripple.b(z, f, o, null);
            composer.q(A);
        }
        composer.R();
        androidx.compose.material.ripple.b bVar = (androidx.compose.material.ripple.b) A;
        if (b.G()) {
            b.R();
        }
        composer.R();
        return bVar;
    }
}
