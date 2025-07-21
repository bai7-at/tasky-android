package androidx.compose.material.ripple;

import androidx.compose.runtime.Composer;
import defpackage.e27;
import defpackage.nn0;

/* loaded from: classes.dex */
final class a implements d {
    public static final a b = new a();

    private a() {
    }

    @Override // androidx.compose.material.ripple.d
    public long a(Composer composer, int i) {
        composer.z(2042140174);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(2042140174, i, -1, "androidx.compose.material.ripple.DebugRippleTheme.defaultColor (RippleTheme.kt:214)");
        }
        long b2 = d.a.b(nn0.b.a(), true);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return b2;
    }

    @Override // androidx.compose.material.ripple.d
    public e27 b(Composer composer, int i) {
        composer.z(-1629816343);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1629816343, i, -1, "androidx.compose.material.ripple.DebugRippleTheme.rippleAlpha (RippleTheme.kt:217)");
        }
        e27 a = d.a.a(nn0.b.a(), true);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return a;
    }
}
