package defpackage;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;

/* loaded from: classes.dex */
public abstract class hn5 {
    public static final n04 a(PagerState pagerState, int i, Composer composer, int i2) {
        composer.z(373558254);
        if (b.G()) {
            b.S(373558254, i2, -1, "androidx.compose.foundation.pager.rememberPagerBeyondBoundsState (PagerBeyondBoundsModifier.kt:27)");
        }
        Integer valueOf = Integer.valueOf(i);
        composer.z(511388516);
        boolean S = composer.S(valueOf) | composer.S(pagerState);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = new in5(pagerState, i);
            composer.q(A);
        }
        composer.R();
        in5 in5Var = (in5) A;
        if (b.G()) {
            b.R();
        }
        composer.R();
        return in5Var;
    }
}
