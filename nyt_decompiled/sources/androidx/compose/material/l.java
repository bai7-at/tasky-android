package androidx.compose.material;

import androidx.compose.runtime.Composer;
import defpackage.ag4;
import defpackage.e27;
import defpackage.nn0;

/* loaded from: classes.dex */
final class l implements androidx.compose.material.ripple.d {
    public static final l b = new l();

    private l() {
    }

    @Override // androidx.compose.material.ripple.d
    public long a(Composer composer, int i) {
        composer.z(550536719);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(550536719, i, -1, "androidx.compose.material.MaterialRippleTheme.defaultColor (MaterialTheme.kt:127)");
        }
        long b2 = androidx.compose.material.ripple.d.a.b(((nn0) composer.m(ContentColorKt.a())).B(), ag4.a.a(composer, 6).o());
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return b2;
    }

    @Override // androidx.compose.material.ripple.d
    public e27 b(Composer composer, int i) {
        composer.z(-1419762518);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1419762518, i, -1, "androidx.compose.material.MaterialRippleTheme.rippleAlpha (MaterialTheme.kt:133)");
        }
        e27 a = androidx.compose.material.ripple.d.a.a(((nn0) composer.m(ContentColorKt.a())).B(), ag4.a.a(composer, 6).o());
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return a;
    }
}
