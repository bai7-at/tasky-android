package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;

/* loaded from: classes.dex */
public abstract class cs0 {
    public static final int a(Composer composer, int i) {
        if (b.G()) {
            b.S(524444915, i, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:224)");
        }
        int O = composer.O();
        if (b.G()) {
            b.R();
        }
        return O;
    }

    public static final ft6 b(Composer composer, int i) {
        if (b.G()) {
            b.S(394957799, i, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:192)");
        }
        ft6 x = composer.x();
        if (x == null) {
            throw new IllegalStateException("no recompose scope found");
        }
        composer.I(x);
        if (b.G()) {
            b.R();
        }
        return x;
    }

    public static final void c() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final c d(Composer composer, int i) {
        composer.z(-1165786124);
        if (b.G()) {
            b.S(-1165786124, i, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:480)");
        }
        c P = composer.P();
        if (b.G()) {
            b.R();
        }
        composer.R();
        return P;
    }
}
