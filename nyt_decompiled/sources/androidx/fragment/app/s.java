package androidx.fragment.app;

import android.view.View;
import defpackage.lq2;
import defpackage.so;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class s {
    public static final s a;
    public static final u b;
    public static final u c;

    static {
        s sVar = new s();
        a = sVar;
        b = new t();
        c = sVar.b();
    }

    private s() {
    }

    public static final void a(Fragment fragment, Fragment fragment2, boolean z, so soVar, boolean z2) {
        zq3.h(fragment, "inFragment");
        zq3.h(fragment2, "outFragment");
        zq3.h(soVar, "sharedElements");
        if (z) {
            fragment2.getEnterTransitionCallback();
        } else {
            fragment.getEnterTransitionCallback();
        }
    }

    private final u b() {
        try {
            zq3.f(lq2.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (u) lq2.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void c(so soVar, so soVar2) {
        zq3.h(soVar, "<this>");
        zq3.h(soVar2, "namedViews");
        int size = soVar.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!soVar2.containsKey((String) soVar.n(size))) {
                soVar.l(size);
            }
        }
    }

    public static final void d(List list, int i) {
        zq3.h(list, "views");
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setVisibility(i);
        }
    }
}
