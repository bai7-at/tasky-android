package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.Navigator;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;

@Navigator.b("navigation")
/* loaded from: classes.dex */
public class f extends Navigator {
    private final k c;

    public f(k kVar) {
        zq3.h(kVar, "navigatorProvider");
        this.c = kVar;
    }

    private final void m(NavBackStackEntry navBackStackEntry, h hVar, Navigator.a aVar) {
        NavDestination e = navBackStackEntry.e();
        zq3.f(e, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        NavGraph navGraph = (NavGraph) e;
        Bundle c = navBackStackEntry.c();
        int Q = navGraph.Q();
        String R = navGraph.R();
        if (Q == 0 && R == null) {
            throw new IllegalStateException(("no start destination defined via app:startDestination for " + navGraph.p()).toString());
        }
        NavDestination M = R != null ? navGraph.M(R, false) : navGraph.K(Q, false);
        if (M != null) {
            this.c.e(M.t()).e(kotlin.collections.i.e(b().a(M, M.j(c))), hVar, aVar);
            return;
        }
        throw new IllegalArgumentException("navigation destination " + navGraph.O() + " is not a direct child of this NavGraph");
    }

    @Override // androidx.navigation.Navigator
    public void e(List list, h hVar, Navigator.a aVar) {
        zq3.h(list, "entries");
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            m((NavBackStackEntry) it2.next(), hVar, aVar);
        }
    }

    @Override // androidx.navigation.Navigator
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public NavGraph a() {
        return new NavGraph(this);
    }
}
