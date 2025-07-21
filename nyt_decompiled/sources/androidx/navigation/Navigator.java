package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.Navigator;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.c35;
import defpackage.p25;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class Navigator {
    private c35 a;
    private boolean b;

    public interface a {
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
        String value();
    }

    public abstract NavDestination a();

    protected final c35 b() {
        c35 c35Var = this.a;
        if (c35Var != null) {
            return c35Var;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public final boolean c() {
        return this.b;
    }

    public NavDestination d(NavDestination navDestination, Bundle bundle, h hVar, a aVar) {
        zq3.h(navDestination, "destination");
        return navDestination;
    }

    public void e(List list, final h hVar, final a aVar) {
        zq3.h(list, "entries");
        Iterator it2 = kotlin.sequences.d.l(kotlin.sequences.d.r(kotlin.collections.i.Z(list), new ss2(hVar, aVar) { // from class: androidx.navigation.Navigator$navigate$1
            final /* synthetic */ h $navOptions;
            final /* synthetic */ Navigator.a $navigatorExtras;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final NavBackStackEntry invoke(NavBackStackEntry navBackStackEntry) {
                NavDestination d;
                zq3.h(navBackStackEntry, "backStackEntry");
                NavDestination e = navBackStackEntry.e();
                if (e == null) {
                    e = null;
                }
                if (e != null && (d = Navigator.this.d(e, navBackStackEntry.c(), this.$navOptions, null)) != null) {
                    return zq3.c(d, e) ? navBackStackEntry : Navigator.this.b().a(d, d.j(navBackStackEntry.c()));
                }
                return null;
            }
        })).iterator();
        while (it2.hasNext()) {
            b().i((NavBackStackEntry) it2.next());
        }
    }

    public void f(c35 c35Var) {
        zq3.h(c35Var, TransferTable.COLUMN_STATE);
        this.a = c35Var;
        this.b = true;
    }

    public void g(NavBackStackEntry navBackStackEntry) {
        zq3.h(navBackStackEntry, "backStackEntry");
        NavDestination e = navBackStackEntry.e();
        if (e == null) {
            e = null;
        }
        if (e == null) {
            return;
        }
        d(e, null, p25.a(new ss2() { // from class: androidx.navigation.Navigator$onLaunchSingleTop$1
            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((i) obj);
                return ww8.a;
            }

            public final void invoke(i iVar) {
                zq3.h(iVar, "$this$navOptions");
                iVar.e(true);
            }
        }), null);
        b().f(navBackStackEntry);
    }

    public void h(Bundle bundle) {
        zq3.h(bundle, "savedState");
    }

    public Bundle i() {
        return null;
    }

    public void j(NavBackStackEntry navBackStackEntry, boolean z) {
        zq3.h(navBackStackEntry, "popUpTo");
        List list = (List) b().b().getValue();
        if (!list.contains(navBackStackEntry)) {
            throw new IllegalStateException(("popBackStack was called with " + navBackStackEntry + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        NavBackStackEntry navBackStackEntry2 = null;
        while (k()) {
            navBackStackEntry2 = (NavBackStackEntry) listIterator.previous();
            if (zq3.c(navBackStackEntry2, navBackStackEntry)) {
                break;
            }
        }
        if (navBackStackEntry2 != null) {
            b().g(navBackStackEntry2, z);
        }
    }

    public boolean k() {
        return true;
    }
}
