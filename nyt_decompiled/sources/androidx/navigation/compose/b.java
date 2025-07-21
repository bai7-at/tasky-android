package androidx.navigation.compose;

import androidx.compose.runtime.b0;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import androidx.navigation.h;
import defpackage.kt2;
import defpackage.ss2;
import defpackage.sy4;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.StateFlow;

@Navigator.b("composable")
/* loaded from: classes.dex */
public final class b extends Navigator {
    public static final a d = new a(null);
    private final sy4 c = b0.e(Boolean.FALSE, null, 2, null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: androidx.navigation.compose.b$b, reason: collision with other inner class name */
    public static final class C0097b extends NavDestination {
        private final kt2 l;
        private ss2 m;
        private ss2 n;
        private ss2 r;
        private ss2 s;

        public C0097b(b bVar, kt2 kt2Var) {
            super(bVar);
            this.l = kt2Var;
        }

        public final kt2 H() {
            return this.l;
        }

        public final ss2 I() {
            return this.m;
        }

        public final ss2 J() {
            return this.n;
        }

        public final ss2 K() {
            return this.r;
        }

        public final ss2 L() {
            return this.s;
        }

        public final void M(ss2 ss2Var) {
            this.m = ss2Var;
        }

        public final void N(ss2 ss2Var) {
            this.n = ss2Var;
        }

        public final void O(ss2 ss2Var) {
            this.r = ss2Var;
        }

        public final void Q(ss2 ss2Var) {
            this.s = ss2Var;
        }
    }

    @Override // androidx.navigation.Navigator
    public void e(List list, h hVar, Navigator.a aVar) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            b().j((NavBackStackEntry) it2.next());
        }
        this.c.setValue(Boolean.FALSE);
    }

    @Override // androidx.navigation.Navigator
    public void j(NavBackStackEntry navBackStackEntry, boolean z) {
        b().h(navBackStackEntry, z);
        this.c.setValue(Boolean.TRUE);
    }

    @Override // androidx.navigation.Navigator
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C0097b a() {
        return new C0097b(this, ComposableSingletons$ComposeNavigatorKt.a.a());
    }

    public final StateFlow m() {
        return b().b();
    }

    public final sy4 n() {
        return this.c;
    }

    public final void o(NavBackStackEntry navBackStackEntry) {
        b().e(navBackStackEntry);
    }
}
