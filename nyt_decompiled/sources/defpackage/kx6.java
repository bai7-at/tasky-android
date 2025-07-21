package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import org.burnoutcrew.reorderable.ReorderableState;

/* loaded from: classes5.dex */
public abstract class kx6 {
    public static final ReorderableState a(LazyListState lazyListState, Composer composer, int i, int i2) {
        composer.z(502854539);
        if ((i2 & 1) != 0) {
            lazyListState = LazyListStateKt.c(0, 0, composer, 0, 3);
        }
        composer.z(-3687241);
        Object A = composer.A();
        if (A == Composer.a.a()) {
            A = new ReorderableState(lazyListState);
            composer.q(A);
        }
        composer.R();
        ReorderableState reorderableState = (ReorderableState) A;
        composer.R();
        return reorderableState;
    }
}
