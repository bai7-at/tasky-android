package defpackage;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class aq4 {
    private final Runnable a;
    private final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    private final Map c = new HashMap();

    private static class a {
        final Lifecycle a;
        private g b;

        a(Lifecycle lifecycle, g gVar) {
            this.a = lifecycle;
            this.b = gVar;
            lifecycle.a(gVar);
        }

        void a() {
            this.a.d(this.b);
            this.b = null;
        }
    }

    public aq4(Runnable runnable) {
        this.a = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(lq4 lq4Var, d44 d44Var, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            l(lq4Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(Lifecycle.State state, lq4 lq4Var, d44 d44Var, Lifecycle.Event event) {
        if (event == Lifecycle.Event.upTo(state)) {
            c(lq4Var);
            return;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            l(lq4Var);
        } else if (event == Lifecycle.Event.downFrom(state)) {
            this.b.remove(lq4Var);
            this.a.run();
        }
    }

    public void c(lq4 lq4Var) {
        this.b.add(lq4Var);
        this.a.run();
    }

    public void d(final lq4 lq4Var, d44 d44Var) {
        c(lq4Var);
        Lifecycle lifecycle = d44Var.getLifecycle();
        a aVar = (a) this.c.remove(lq4Var);
        if (aVar != null) {
            aVar.a();
        }
        this.c.put(lq4Var, new a(lifecycle, new g() { // from class: zp4
            @Override // androidx.lifecycle.g
            public final void h(d44 d44Var2, Lifecycle.Event event) {
                aq4.this.f(lq4Var, d44Var2, event);
            }
        }));
    }

    public void e(final lq4 lq4Var, d44 d44Var, final Lifecycle.State state) {
        Lifecycle lifecycle = d44Var.getLifecycle();
        a aVar = (a) this.c.remove(lq4Var);
        if (aVar != null) {
            aVar.a();
        }
        this.c.put(lq4Var, new a(lifecycle, new g() { // from class: yp4
            @Override // androidx.lifecycle.g
            public final void h(d44 d44Var2, Lifecycle.Event event) {
                aq4.this.g(state, lq4Var, d44Var2, event);
            }
        }));
    }

    public void h(Menu menu, MenuInflater menuInflater) {
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            ((lq4) it2.next()).d(menu, menuInflater);
        }
    }

    public void i(Menu menu) {
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            ((lq4) it2.next()).a(menu);
        }
    }

    public boolean j(MenuItem menuItem) {
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            if (((lq4) it2.next()).c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void k(Menu menu) {
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            ((lq4) it2.next()).b(menu);
        }
    }

    public void l(lq4 lq4Var) {
        this.b.remove(lq4Var);
        a aVar = (a) this.c.remove(lq4Var);
        if (aVar != null) {
            aVar.a();
        }
        this.a.run();
    }
}
