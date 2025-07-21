package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.coroutines.intrinsics.a;

/* loaded from: classes4.dex */
public final class om9 {
    private final LazyListState a;

    public om9(LazyListState lazyListState) {
        zq3.h(lazyListState, "interestsLazyListState");
        this.a = lazyListState;
    }

    public final Object a(int i, by0 by0Var) {
        Object k = LazyListState.k(this.a, i, 0, by0Var, 2, null);
        return k == a.h() ? k : ww8.a;
    }

    public final LazyListState b() {
        return this.a;
    }
}
