package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraph;
import androidx.navigation.compose.a;
import androidx.navigation.compose.b;
import defpackage.it2;
import defpackage.kt2;
import defpackage.l15;
import defpackage.m25;
import defpackage.ss2;
import defpackage.uh;
import defpackage.ww8;
import defpackage.zr0;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes.dex */
public abstract class NavGraphBuilderKt {
    public static final void a(m25 m25Var, String str, List list, List list2, ss2 ss2Var, ss2 ss2Var2, ss2 ss2Var3, ss2 ss2Var4, kt2 kt2Var) {
        b.C0097b c0097b = new b.C0097b((b) m25Var.e().d(b.class), kt2Var);
        c0097b.E(str);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            l15 l15Var = (l15) it2.next();
            c0097b.c(l15Var.a(), l15Var.b());
        }
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            c0097b.f((NavDeepLink) it3.next());
        }
        c0097b.M(ss2Var);
        c0097b.N(ss2Var2);
        c0097b.O(ss2Var3);
        c0097b.Q(ss2Var4);
        m25Var.c(c0097b);
    }

    public static final /* synthetic */ void b(m25 m25Var, String str, List list, List list2, final it2 it2Var) {
        b.C0097b c0097b = new b.C0097b((b) m25Var.e().d(b.class), zr0.c(484185514, true, new kt2() { // from class: androidx.navigation.compose.NavGraphBuilderKt$composable$1
            {
                super(4);
            }

            @Override // defpackage.kt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((uh) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
                return ww8.a;
            }

            public final void invoke(uh uhVar, NavBackStackEntry navBackStackEntry, Composer composer, int i) {
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(484185514, i, -1, "androidx.navigation.compose.composable.<anonymous> (NavGraphBuilder.kt:52)");
                }
                it2.this.invoke(navBackStackEntry, composer, 8);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }));
        c0097b.E(str);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            l15 l15Var = (l15) it2.next();
            c0097b.c(l15Var.a(), l15Var.b());
        }
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            c0097b.f((NavDeepLink) it3.next());
        }
        m25Var.c(c0097b);
    }

    public static /* synthetic */ void c(m25 m25Var, String str, List list, List list2, ss2 ss2Var, ss2 ss2Var2, ss2 ss2Var3, ss2 ss2Var4, kt2 kt2Var, int i, Object obj) {
        List l = (i & 2) != 0 ? i.l() : list;
        List l2 = (i & 4) != 0 ? i.l() : list2;
        ss2 ss2Var5 = (i & 8) != 0 ? null : ss2Var;
        ss2 ss2Var6 = (i & 16) != 0 ? null : ss2Var2;
        a(m25Var, str, l, l2, ss2Var5, ss2Var6, (i & 32) != 0 ? ss2Var5 : ss2Var3, (i & 64) != 0 ? ss2Var6 : ss2Var4, kt2Var);
    }

    public static /* synthetic */ void d(m25 m25Var, String str, List list, List list2, it2 it2Var, int i, Object obj) {
        if ((i & 2) != 0) {
            list = i.l();
        }
        if ((i & 4) != 0) {
            list2 = i.l();
        }
        b(m25Var, str, list, list2, it2Var);
    }

    public static final void e(m25 m25Var, String str, String str2, List list, List list2, ss2 ss2Var, ss2 ss2Var2, ss2 ss2Var3, ss2 ss2Var4, ss2 ss2Var5) {
        m25 m25Var2 = new m25(m25Var.e(), str, str2);
        ss2Var5.invoke(m25Var2);
        NavGraph d = m25Var2.d();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            l15 l15Var = (l15) it2.next();
            d.c(l15Var.a(), l15Var.b());
        }
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            d.f((NavDeepLink) it3.next());
        }
        if (d instanceof a.C0096a) {
            a.C0096a c0096a = (a.C0096a) d;
            c0096a.d0(ss2Var);
            c0096a.e0(ss2Var2);
            c0096a.f0(ss2Var3);
            c0096a.g0(ss2Var4);
        }
        m25Var.c(d);
    }

    public static /* synthetic */ void f(m25 m25Var, String str, String str2, List list, List list2, ss2 ss2Var, ss2 ss2Var2, ss2 ss2Var3, ss2 ss2Var4, ss2 ss2Var5, int i, Object obj) {
        List l = (i & 4) != 0 ? i.l() : list;
        List l2 = (i & 8) != 0 ? i.l() : list2;
        ss2 ss2Var6 = (i & 16) != 0 ? null : ss2Var;
        ss2 ss2Var7 = (i & 32) != 0 ? null : ss2Var2;
        e(m25Var, str, str2, l, l2, ss2Var6, ss2Var7, (i & 64) != 0 ? ss2Var6 : ss2Var3, (i & 128) != 0 ? ss2Var7 : ss2Var4, ss2Var5);
    }
}
