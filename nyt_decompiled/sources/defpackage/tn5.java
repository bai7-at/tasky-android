package defpackage;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;

/* loaded from: classes.dex */
public abstract class tn5 {
    public static final w04 a(PagerState pagerState, boolean z, boolean z2, Composer composer, int i) {
        composer.z(352210115);
        if (b.G()) {
            b.S(352210115, i, -1, "androidx.compose.foundation.pager.rememberPagerSemanticState (PagerSemantics.kt:29)");
        }
        Boolean valueOf = Boolean.valueOf(z);
        Boolean valueOf2 = Boolean.valueOf(z2);
        composer.z(1618982084);
        boolean S = composer.S(valueOf) | composer.S(pagerState) | composer.S(valueOf2);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = x04.a(pagerState, z2);
            composer.q(A);
        }
        composer.R();
        w04 w04Var = (w04) A;
        if (b.G()) {
            b.R();
        }
        composer.R();
        return w04Var;
    }
}
