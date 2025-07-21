package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
class l {
    private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    private final FragmentManager b;

    private static final class a {
        final FragmentManager.k a;
        final boolean b;

        a(FragmentManager.k kVar, boolean z) {
            this.a = kVar;
            this.b = z;
        }
    }

    l(FragmentManager fragmentManager) {
        this.b = fragmentManager;
    }

    void a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment B0 = this.b.B0();
        if (B0 != null) {
            B0.getParentFragmentManager().A0().a(fragment, bundle, true);
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            a aVar = (a) it2.next();
            if (!z || aVar.b) {
                aVar.a.d(this.b, fragment, bundle);
            }
        }
    }

    void b(Fragment fragment, boolean z) {
        Context f = this.b.y0().f();
        Fragment B0 = this.b.B0();
        if (B0 != null) {
            B0.getParentFragmentManager().A0().b(fragment, true);
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            a aVar = (a) it2.next();
            if (!z || aVar.b) {
                aVar.a.e(this.b, fragment, f);
            }
        }
    }

    void c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment B0 = this.b.B0();
        if (B0 != null) {
            B0.getParentFragmentManager().A0().c(fragment, bundle, true);
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            a aVar = (a) it2.next();
            if (!z || aVar.b) {
                aVar.a.f(this.b, fragment, bundle);
            }
        }
    }

    void d(Fragment fragment, boolean z) {
        Fragment B0 = this.b.B0();
        if (B0 != null) {
            B0.getParentFragmentManager().A0().d(fragment, true);
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            a aVar = (a) it2.next();
            if (!z || aVar.b) {
                aVar.a.g(this.b, fragment);
            }
        }
    }

    void e(Fragment fragment, boolean z) {
        Fragment B0 = this.b.B0();
        if (B0 != null) {
            B0.getParentFragmentManager().A0().e(fragment, true);
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            a aVar = (a) it2.next();
            if (!z || aVar.b) {
                aVar.a.h(this.b, fragment);
            }
        }
    }

    void f(Fragment fragment, boolean z) {
        Fragment B0 = this.b.B0();
        if (B0 != null) {
            B0.getParentFragmentManager().A0().f(fragment, true);
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            a aVar = (a) it2.next();
            if (!z || aVar.b) {
                aVar.a.i(this.b, fragment);
            }
        }
    }

    void g(Fragment fragment, boolean z) {
        Context f = this.b.y0().f();
        Fragment B0 = this.b.B0();
        if (B0 != null) {
            B0.getParentFragmentManager().A0().g(fragment, true);
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            a aVar = (a) it2.next();
            if (!z || aVar.b) {
                aVar.a.j(this.b, fragment, f);
            }
        }
    }

    void h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment B0 = this.b.B0();
        if (B0 != null) {
            B0.getParentFragmentManager().A0().h(fragment, bundle, true);
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            a aVar = (a) it2.next();
            if (!z || aVar.b) {
                aVar.a.k(this.b, fragment, bundle);
            }
        }
    }

    void i(Fragment fragment, boolean z) {
        Fragment B0 = this.b.B0();
        if (B0 != null) {
            B0.getParentFragmentManager().A0().i(fragment, true);
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            a aVar = (a) it2.next();
            if (!z || aVar.b) {
                aVar.a.l(this.b, fragment);
            }
        }
    }

    void j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment B0 = this.b.B0();
        if (B0 != null) {
            B0.getParentFragmentManager().A0().j(fragment, bundle, true);
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            a aVar = (a) it2.next();
            if (!z || aVar.b) {
                aVar.a.m(this.b, fragment, bundle);
            }
        }
    }

    void k(Fragment fragment, boolean z) {
        Fragment B0 = this.b.B0();
        if (B0 != null) {
            B0.getParentFragmentManager().A0().k(fragment, true);
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            a aVar = (a) it2.next();
            if (!z || aVar.b) {
                aVar.a.n(this.b, fragment);
            }
        }
    }

    void l(Fragment fragment, boolean z) {
        Fragment B0 = this.b.B0();
        if (B0 != null) {
            B0.getParentFragmentManager().A0().l(fragment, true);
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            a aVar = (a) it2.next();
            if (!z || aVar.b) {
                aVar.a.o(this.b, fragment);
            }
        }
    }

    void m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment B0 = this.b.B0();
        if (B0 != null) {
            B0.getParentFragmentManager().A0().m(fragment, view, bundle, true);
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            a aVar = (a) it2.next();
            if (!z || aVar.b) {
                aVar.a.p(this.b, fragment, view, bundle);
            }
        }
    }

    void n(Fragment fragment, boolean z) {
        Fragment B0 = this.b.B0();
        if (B0 != null) {
            B0.getParentFragmentManager().A0().n(fragment, true);
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            a aVar = (a) it2.next();
            if (!z || aVar.b) {
                aVar.a.q(this.b, fragment);
            }
        }
    }

    public void o(FragmentManager.k kVar, boolean z) {
        this.a.add(new a(kVar, z));
    }

    public void p(FragmentManager.k kVar) {
        synchronized (this.a) {
            try {
                int size = this.a.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    if (((a) this.a.get(i)).a == kVar) {
                        this.a.remove(i);
                        break;
                    }
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
