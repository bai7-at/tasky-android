package defpackage;

import android.os.Bundle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes.dex */
public abstract class c35 {
    private final ReentrantLock a = new ReentrantLock(true);
    private final MutableStateFlow b;
    private final MutableStateFlow c;
    private boolean d;
    private final StateFlow e;
    private final StateFlow f;

    public c35() {
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(i.l());
        this.b = MutableStateFlow;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(b0.e());
        this.c = MutableStateFlow2;
        this.e = FlowKt.asStateFlow(MutableStateFlow);
        this.f = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public abstract NavBackStackEntry a(NavDestination navDestination, Bundle bundle);

    public final StateFlow b() {
        return this.e;
    }

    public final StateFlow c() {
        return this.f;
    }

    public final boolean d() {
        return this.d;
    }

    public void e(NavBackStackEntry navBackStackEntry) {
        zq3.h(navBackStackEntry, "entry");
        MutableStateFlow mutableStateFlow = this.c;
        mutableStateFlow.setValue(b0.l((Set) mutableStateFlow.getValue(), navBackStackEntry));
    }

    public void f(NavBackStackEntry navBackStackEntry) {
        int i;
        zq3.h(navBackStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            List a1 = i.a1((Collection) this.e.getValue());
            ListIterator listIterator = a1.listIterator(a1.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i = -1;
                    break;
                } else if (zq3.c(((NavBackStackEntry) listIterator.previous()).f(), navBackStackEntry.f())) {
                    i = listIterator.nextIndex();
                    break;
                }
            }
            a1.set(i, navBackStackEntry);
            this.b.setValue(a1);
            ww8 ww8Var = ww8.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void g(NavBackStackEntry navBackStackEntry, boolean z) {
        zq3.h(navBackStackEntry, "popUpTo");
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            MutableStateFlow mutableStateFlow = this.b;
            Iterable iterable = (Iterable) mutableStateFlow.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (zq3.c((NavBackStackEntry) obj, navBackStackEntry)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            mutableStateFlow.setValue(arrayList);
            ww8 ww8Var = ww8.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void h(NavBackStackEntry navBackStackEntry, boolean z) {
        Object obj;
        zq3.h(navBackStackEntry, "popUpTo");
        Iterable iterable = (Iterable) this.c.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it2 = iterable.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((NavBackStackEntry) it2.next()) == navBackStackEntry) {
                    Iterable iterable2 = (Iterable) this.e.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it3 = iterable2.iterator();
                    while (it3.hasNext()) {
                        if (((NavBackStackEntry) it3.next()) == navBackStackEntry) {
                        }
                    }
                    return;
                }
            }
        }
        MutableStateFlow mutableStateFlow = this.c;
        mutableStateFlow.setValue(b0.n((Set) mutableStateFlow.getValue(), navBackStackEntry));
        List list = (List) this.e.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
            if (!zq3.c(navBackStackEntry2, navBackStackEntry) && ((List) this.e.getValue()).lastIndexOf(navBackStackEntry2) < ((List) this.e.getValue()).lastIndexOf(navBackStackEntry)) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) obj;
        if (navBackStackEntry3 != null) {
            MutableStateFlow mutableStateFlow2 = this.c;
            mutableStateFlow2.setValue(b0.n((Set) mutableStateFlow2.getValue(), navBackStackEntry3));
        }
        g(navBackStackEntry, z);
    }

    public void i(NavBackStackEntry navBackStackEntry) {
        zq3.h(navBackStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            MutableStateFlow mutableStateFlow = this.b;
            mutableStateFlow.setValue(i.G0((Collection) mutableStateFlow.getValue(), navBackStackEntry));
            ww8 ww8Var = ww8.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j(NavBackStackEntry navBackStackEntry) {
        zq3.h(navBackStackEntry, "backStackEntry");
        Iterable iterable = (Iterable) this.c.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it2 = iterable.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((NavBackStackEntry) it2.next()) == navBackStackEntry) {
                    Iterable iterable2 = (Iterable) this.e.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it3 = iterable2.iterator();
                        while (it3.hasNext()) {
                            if (((NavBackStackEntry) it3.next()) == navBackStackEntry) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) i.y0((List) this.e.getValue());
        if (navBackStackEntry2 != null) {
            MutableStateFlow mutableStateFlow = this.c;
            mutableStateFlow.setValue(b0.n((Set) mutableStateFlow.getValue(), navBackStackEntry2));
        }
        MutableStateFlow mutableStateFlow2 = this.c;
        mutableStateFlow2.setValue(b0.n((Set) mutableStateFlow2.getValue(), navBackStackEntry));
        i(navBackStackEntry);
    }

    public final void k(boolean z) {
        this.d = z;
    }
}
