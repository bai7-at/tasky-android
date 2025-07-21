package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;

/* loaded from: classes.dex */
public abstract class a14 {
    public static final n04 a(LazyListState lazyListState, int i, Composer composer, int i2) {
        composer.z(-1877443446);
        if (b.G()) {
            b.S(-1877443446, i2, -1, "androidx.compose.foundation.lazy.rememberLazyListBeyondBoundsState (LazyListBeyondBoundsModifier.kt:26)");
        }
        Integer valueOf = Integer.valueOf(i);
        composer.z(511388516);
        boolean S = composer.S(valueOf) | composer.S(lazyListState);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = new b14(lazyListState, i);
            composer.q(A);
        }
        composer.R();
        b14 b14Var = (b14) A;
        if (b.G()) {
            b.R();
        }
        composer.R();
        return b14Var;
    }
}
