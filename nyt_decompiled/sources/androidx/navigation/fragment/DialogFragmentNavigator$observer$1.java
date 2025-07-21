package androidx.navigation.fragment;

import android.util.Log;
import androidx.fragment.app.e;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import androidx.navigation.NavBackStackEntry;
import defpackage.aq1;
import defpackage.d44;
import defpackage.zq3;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.i;

/* loaded from: classes.dex */
public final class DialogFragmentNavigator$observer$1 implements g {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    @Override // androidx.lifecycle.g
    public void h(d44 d44Var, Lifecycle.Event event) {
        int i;
        zq3.h(d44Var, "source");
        zq3.h(event, "event");
        int i2 = a.a[event.ordinal()];
        if (i2 == 1) {
            e eVar = (e) d44Var;
            Iterable iterable = (Iterable) aq1.l(null).b().getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    if (zq3.c(((NavBackStackEntry) it2.next()).f(), eVar.getTag())) {
                        return;
                    }
                }
            }
            eVar.dismiss();
            return;
        }
        if (i2 == 2) {
            e eVar2 = (e) d44Var;
            Object obj = null;
            for (Object obj2 : (Iterable) aq1.l(null).c().getValue()) {
                if (zq3.c(((NavBackStackEntry) obj2).f(), eVar2.getTag())) {
                    obj = obj2;
                }
            }
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
            if (navBackStackEntry != null) {
                aq1.l(null).e(navBackStackEntry);
                return;
            }
            return;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                return;
            }
            e eVar3 = (e) d44Var;
            Object obj3 = null;
            for (Object obj4 : (Iterable) aq1.l(null).c().getValue()) {
                if (zq3.c(((NavBackStackEntry) obj4).f(), eVar3.getTag())) {
                    obj3 = obj4;
                }
            }
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj3;
            if (navBackStackEntry2 != null) {
                aq1.l(null).e(navBackStackEntry2);
            }
            eVar3.getLifecycle().d(this);
            return;
        }
        e eVar4 = (e) d44Var;
        if (eVar4.requireDialog().isShowing()) {
            return;
        }
        List list = (List) aq1.l(null).b().getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (zq3.c(((NavBackStackEntry) listIterator.previous()).f(), eVar4.getTag())) {
                    i = listIterator.nextIndex();
                    break;
                }
            } else {
                i = -1;
                break;
            }
        }
        NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) i.n0(list, i);
        if (!zq3.c(i.y0(list), navBackStackEntry3)) {
            Log.i("DialogFragmentNavigator", "Dialog " + eVar4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
        }
        if (navBackStackEntry3 != null) {
            aq1.m(null, i, navBackStackEntry3, false);
        }
    }
}
