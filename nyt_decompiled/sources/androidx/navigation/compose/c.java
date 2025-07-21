package androidx.navigation.compose;

import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import androidx.navigation.h;
import defpackage.eq1;
import defpackage.hl2;
import defpackage.it2;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.StateFlow;

@Navigator.b("dialog")
/* loaded from: classes.dex */
public final class c extends Navigator {
    public static final a c = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // androidx.navigation.Navigator
    public void e(List list, h hVar, Navigator.a aVar) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            b().i((NavBackStackEntry) it2.next());
        }
    }

    @Override // androidx.navigation.Navigator
    public void j(NavBackStackEntry navBackStackEntry, boolean z) {
        b().h(navBackStackEntry, z);
        int o0 = i.o0((Iterable) b().c().getValue(), navBackStackEntry);
        int i = 0;
        for (Object obj : (Iterable) b().c().getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                i.v();
            }
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
            if (i > o0) {
                p(navBackStackEntry2);
            }
            i = i2;
        }
    }

    @Override // androidx.navigation.Navigator
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this, null, ComposableSingletons$DialogNavigatorKt.a.a(), 2, null);
    }

    public final void m(NavBackStackEntry navBackStackEntry) {
        j(navBackStackEntry, false);
    }

    public final StateFlow n() {
        return b().b();
    }

    public final StateFlow o() {
        return b().c();
    }

    public final void p(NavBackStackEntry navBackStackEntry) {
        b().e(navBackStackEntry);
    }

    public static final class b extends NavDestination implements hl2 {
        private final eq1 l;
        private final it2 m;

        public /* synthetic */ b(c cVar, eq1 eq1Var, it2 it2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(cVar, (i & 2) != 0 ? new eq1(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null) : eq1Var, it2Var);
        }

        public final it2 H() {
            return this.m;
        }

        public final eq1 I() {
            return this.l;
        }

        public b(c cVar, eq1 eq1Var, it2 it2Var) {
            super(cVar);
            this.l = eq1Var;
            this.m = it2Var;
        }
    }
}
