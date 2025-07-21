package androidx.navigation;

import androidx.navigation.NavDestination;
import defpackage.py7;
import defpackage.ry7;
import defpackage.ss2;
import defpackage.yu3;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public class NavGraph extends NavDestination implements Iterable, yu3 {
    public static final Companion s = new Companion(null);
    private final py7 l;
    private int m;
    private String n;
    private String r;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NavDestination a(NavGraph navGraph) {
            zq3.h(navGraph, "<this>");
            return (NavDestination) kotlin.sequences.d.q(kotlin.sequences.d.f(navGraph.J(navGraph.Q()), new ss2() { // from class: androidx.navigation.NavGraph$Companion$findStartDestination$1
                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final NavDestination invoke(NavDestination navDestination) {
                    zq3.h(navDestination, "it");
                    if (!(navDestination instanceof NavGraph)) {
                        return null;
                    }
                    NavGraph navGraph2 = (NavGraph) navDestination;
                    return navGraph2.J(navGraph2.Q());
                }
            }));
        }

        private Companion() {
        }
    }

    public static final class a implements Iterator, yu3 {
        private int a = -1;
        private boolean b;

        a() {
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public NavDestination next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.b = true;
            py7 N = NavGraph.this.N();
            int i = this.a + 1;
            this.a = i;
            Object n = N.n(i);
            zq3.g(n, "nodes.valueAt(++index)");
            return (NavDestination) n;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a + 1 < NavGraph.this.N().m();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.b) {
                throw new IllegalStateException("You must call next() before you can remove an element");
            }
            py7 N = NavGraph.this.N();
            ((NavDestination) N.n(this.a)).D(null);
            N.k(this.a);
            this.a--;
            this.b = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraph(Navigator navigator) {
        super(navigator);
        zq3.h(navigator, "navGraphNavigator");
        this.l = new py7();
    }

    private final void V(int i) {
        if (i != q()) {
            if (this.r != null) {
                W(null);
            }
            this.m = i;
            this.n = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i + " cannot use the same id as the graph " + this).toString());
    }

    private final void W(String str) {
        int hashCode;
        if (str == null) {
            hashCode = 0;
        } else {
            if (zq3.c(str, v())) {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
            }
            if (kotlin.text.h.d0(str)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            hashCode = NavDestination.j.a(str).hashCode();
        }
        this.m = hashCode;
        this.r = str;
    }

    public final void H(NavDestination navDestination) {
        zq3.h(navDestination, "node");
        int q = navDestination.q();
        String v = navDestination.v();
        if (q == 0 && v == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        if (v() != null && zq3.c(v, v())) {
            throw new IllegalArgumentException(("Destination " + navDestination + " cannot have the same route as graph " + this).toString());
        }
        if (q == q()) {
            throw new IllegalArgumentException(("Destination " + navDestination + " cannot have the same id as graph " + this).toString());
        }
        NavDestination navDestination2 = (NavDestination) this.l.e(q);
        if (navDestination2 == navDestination) {
            return;
        }
        if (navDestination.u() != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (navDestination2 != null) {
            navDestination2.D(null);
        }
        navDestination.D(this);
        this.l.i(navDestination.q(), navDestination);
    }

    public final void I(Collection collection) {
        zq3.h(collection, "nodes");
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            NavDestination navDestination = (NavDestination) it2.next();
            if (navDestination != null) {
                H(navDestination);
            }
        }
    }

    public final NavDestination J(int i) {
        return K(i, true);
    }

    public final NavDestination K(int i, boolean z) {
        NavDestination navDestination = (NavDestination) this.l.e(i);
        if (navDestination != null) {
            return navDestination;
        }
        if (!z || u() == null) {
            return null;
        }
        NavGraph u = u();
        zq3.e(u);
        return u.J(i);
    }

    public final NavDestination L(String str) {
        if (str == null || kotlin.text.h.d0(str)) {
            return null;
        }
        return M(str, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    public final NavDestination M(String str, boolean z) {
        NavDestination navDestination;
        zq3.h(str, "route");
        NavDestination navDestination2 = (NavDestination) this.l.e(NavDestination.j.a(str).hashCode());
        if (navDestination2 == null) {
            Iterator it2 = kotlin.sequences.d.c(ry7.b(this.l)).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    navDestination = 0;
                    break;
                }
                navDestination = it2.next();
                if (((NavDestination) navDestination).z(str) != null) {
                    break;
                }
            }
            navDestination2 = navDestination;
        }
        if (navDestination2 != null) {
            return navDestination2;
        }
        if (!z || u() == null) {
            return null;
        }
        NavGraph u = u();
        zq3.e(u);
        return u.L(str);
    }

    public final py7 N() {
        return this.l;
    }

    public final String O() {
        if (this.n == null) {
            String str = this.r;
            if (str == null) {
                str = String.valueOf(this.m);
            }
            this.n = str;
        }
        String str2 = this.n;
        zq3.e(str2);
        return str2;
    }

    public final int Q() {
        return this.m;
    }

    public final String R() {
        return this.r;
    }

    public final NavDestination.a S(e eVar) {
        zq3.h(eVar, "request");
        return super.y(eVar);
    }

    public final void T(int i) {
        V(i);
    }

    public final void U(String str) {
        zq3.h(str, "startDestRoute");
        W(str);
    }

    @Override // androidx.navigation.NavDestination
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavGraph)) {
            return false;
        }
        if (super.equals(obj)) {
            NavGraph navGraph = (NavGraph) obj;
            if (this.l.m() == navGraph.l.m() && Q() == navGraph.Q()) {
                for (NavDestination navDestination : kotlin.sequences.d.c(ry7.b(this.l))) {
                    if (!zq3.c(navDestination, navGraph.l.e(navDestination.q()))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.navigation.NavDestination
    public int hashCode() {
        int Q = Q();
        py7 py7Var = this.l;
        int m = py7Var.m();
        for (int i = 0; i < m; i++) {
            Q = (((Q * 31) + py7Var.h(i)) * 31) + ((NavDestination) py7Var.n(i)).hashCode();
        }
        return Q;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new a();
    }

    @Override // androidx.navigation.NavDestination
    public String p() {
        return q() != 0 ? super.p() : "the root navigation";
    }

    @Override // androidx.navigation.NavDestination
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        NavDestination L = L(this.r);
        if (L == null) {
            L = J(Q());
        }
        sb.append(" startDestination=");
        if (L == null) {
            String str = this.r;
            if (str != null) {
                sb.append(str);
            } else {
                String str2 = this.n;
                if (str2 != null) {
                    sb.append(str2);
                } else {
                    sb.append("0x" + Integer.toHexString(this.m));
                }
            }
        } else {
            sb.append("{");
            sb.append(L.toString());
            sb.append("}");
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "sb.toString()");
        return sb2;
    }

    @Override // androidx.navigation.NavDestination
    public NavDestination.a y(e eVar) {
        zq3.h(eVar, "navDeepLinkRequest");
        NavDestination.a y = super.y(eVar);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = iterator();
        while (it2.hasNext()) {
            NavDestination.a y2 = ((NavDestination) it2.next()).y(eVar);
            if (y2 != null) {
                arrayList.add(y2);
            }
        }
        return (NavDestination.a) kotlin.collections.i.z0(kotlin.collections.i.q(y, (NavDestination.a) kotlin.collections.i.z0(arrayList)));
    }
}
