package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;

/* loaded from: classes.dex */
public abstract class o14 {
    public static final w04 a(LazyListState lazyListState, boolean z, Composer composer, int i) {
        composer.z(596174919);
        if (b.G()) {
            b.S(596174919, i, -1, "androidx.compose.foundation.lazy.rememberLazyListSemanticState (LazyListSemantics.kt:26)");
        }
        Boolean valueOf = Boolean.valueOf(z);
        composer.z(511388516);
        boolean S = composer.S(valueOf) | composer.S(lazyListState);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = y04.a(lazyListState, z);
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
