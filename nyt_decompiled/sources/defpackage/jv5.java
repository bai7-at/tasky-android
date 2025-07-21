package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserver;
import kotlin.coroutines.intrinsics.a;

/* loaded from: classes4.dex */
public final class jv5 {
    public static final int d = ScrollObserver.g;
    private final e19 a;
    private final ScrollObserver b;
    private final LazyListState c;

    public jv5(e19 e19Var, ScrollObserver scrollObserver, LazyListState lazyListState) {
        zq3.h(e19Var, "userState");
        zq3.h(scrollObserver, "toolbarScroller");
        zq3.h(lazyListState, "lazyListState");
        this.a = e19Var;
        this.b = scrollObserver;
        this.c = lazyListState;
    }

    public static /* synthetic */ jv5 c(jv5 jv5Var, e19 e19Var, ScrollObserver scrollObserver, LazyListState lazyListState, int i, Object obj) {
        if ((i & 1) != 0) {
            e19Var = jv5Var.a;
        }
        if ((i & 2) != 0) {
            scrollObserver = jv5Var.b;
        }
        if ((i & 4) != 0) {
            lazyListState = jv5Var.c;
        }
        return jv5Var.b(e19Var, scrollObserver, lazyListState);
    }

    public final Object a(int i, by0 by0Var) {
        this.b.j(0.0f);
        Object k = LazyListState.k(this.c, i, 0, by0Var, 2, null);
        return k == a.h() ? k : ww8.a;
    }

    public final jv5 b(e19 e19Var, ScrollObserver scrollObserver, LazyListState lazyListState) {
        zq3.h(e19Var, "userState");
        zq3.h(scrollObserver, "toolbarScroller");
        zq3.h(lazyListState, "lazyListState");
        return new jv5(e19Var, scrollObserver, lazyListState);
    }

    public final LazyListState d() {
        return this.c;
    }

    public final ScrollObserver e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv5)) {
            return false;
        }
        jv5 jv5Var = (jv5) obj;
        return zq3.c(this.a, jv5Var.a) && zq3.c(this.b, jv5Var.b) && zq3.c(this.c, jv5Var.c);
    }

    public final e19 f() {
        return this.a;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "PlayTabState(userState=" + this.a + ", toolbarScroller=" + this.b + ", lazyListState=" + this.c + ")";
    }
}
