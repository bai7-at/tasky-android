package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import defpackage.e27;
import defpackage.nn0;

/* loaded from: classes.dex */
final class d implements androidx.compose.material.ripple.d {
    public static final d b = new d();

    private d() {
    }

    @Override // androidx.compose.material.ripple.d
    public long a(Composer composer, int i) {
        composer.z(-2059468846);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-2059468846, i, -1, "androidx.compose.material3.MaterialRippleTheme.defaultColor (MaterialTheme.kt:110)");
        }
        long B = ((nn0) composer.m(ContentColorKt.a())).B();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return B;
    }

    @Override // androidx.compose.material.ripple.d
    public e27 b(Composer composer, int i) {
        e27 e27Var;
        composer.z(1285764247);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1285764247, i, -1, "androidx.compose.material3.MaterialRippleTheme.rippleAlpha (MaterialTheme.kt:114)");
        }
        e27Var = MaterialThemeKt.a;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return e27Var;
    }
}
