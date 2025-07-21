package defpackage;

import androidx.navigation.NavBackStackEntry;
import com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserver;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class fe4 {
    public static final int h = 8;
    private final de4 a;
    private final NavBackStackEntry b;
    private final n25 c;
    private final Flow d;
    private final ScrollObserver e;
    private final ss2 f;
    private final Flow g;

    public fe4(de4 de4Var, NavBackStackEntry navBackStackEntry, n25 n25Var, Flow flow, ScrollObserver scrollObserver, ss2 ss2Var, Flow flow2) {
        zq3.h(de4Var, "tabFactory");
        zq3.h(navBackStackEntry, "navBackStackEntry");
        zq3.h(n25Var, "navController");
        zq3.h(flow, "scrollToItemFlow");
        zq3.h(scrollObserver, "toolbarScroller");
        zq3.h(ss2Var, "onNavigateToMainTab");
        zq3.h(flow2, "navigateToDestinationFlow");
        this.a = de4Var;
        this.b = navBackStackEntry;
        this.c = n25Var;
        this.d = flow;
        this.e = scrollObserver;
        this.f = ss2Var;
        this.g = flow2;
    }

    public final Flow a() {
        return this.g;
    }

    public final ss2 b() {
        return this.f;
    }

    public final Flow c() {
        return this.d;
    }

    public final de4 d() {
        return this.a;
    }

    public final ScrollObserver e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe4)) {
            return false;
        }
        fe4 fe4Var = (fe4) obj;
        return zq3.c(this.a, fe4Var.a) && zq3.c(this.b, fe4Var.b) && zq3.c(this.c, fe4Var.c) && zq3.c(this.d, fe4Var.d) && zq3.c(this.e, fe4Var.e) && zq3.c(this.f, fe4Var.f) && zq3.c(this.g, fe4Var.g);
    }

    public int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public String toString() {
        return "MainTabState(tabFactory=" + this.a + ", navBackStackEntry=" + this.b + ", navController=" + this.c + ", scrollToItemFlow=" + this.d + ", toolbarScroller=" + this.e + ", onNavigateToMainTab=" + this.f + ", navigateToDestinationFlow=" + this.g + ")";
    }
}
