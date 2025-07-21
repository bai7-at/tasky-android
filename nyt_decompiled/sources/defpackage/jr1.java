package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserver;

/* loaded from: classes4.dex */
public final class jr1 {
    public static final int c = ScrollObserver.g;
    private final ScrollObserver a;
    private final LazyListState b;

    public jr1(ScrollObserver scrollObserver, LazyListState lazyListState) {
        zq3.h(scrollObserver, "toolbarScroller");
        zq3.h(lazyListState, "lazyListState");
        this.a = scrollObserver;
        this.b = lazyListState;
    }

    public final LazyListState a() {
        return this.b;
    }

    public final ScrollObserver b() {
        return this.a;
    }
}
