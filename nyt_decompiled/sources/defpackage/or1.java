package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserver;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class or1 {
    public static final int d = ScrollObserver.g;
    private final float a;
    private final ScrollObserver b;
    private final LazyListState c;

    public /* synthetic */ or1(float f, ScrollObserver scrollObserver, LazyListState lazyListState, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, scrollObserver, lazyListState);
    }

    public final Object a(int i, by0 by0Var) {
        this.b.j(0.0f);
        Object k = LazyListState.k(this.c, i, 0, by0Var, 2, null);
        return k == a.h() ? k : ww8.a;
    }

    public final LazyListState b() {
        return this.c;
    }

    public final ScrollObserver c() {
        return this.b;
    }

    public final float d() {
        return this.a;
    }

    private or1(float f, ScrollObserver scrollObserver, LazyListState lazyListState) {
        zq3.h(scrollObserver, "toolbarScroller");
        zq3.h(lazyListState, "lazyListState");
        this.a = f;
        this.b = scrollObserver;
        this.c = lazyListState;
    }
}
