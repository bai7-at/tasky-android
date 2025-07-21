package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class hg8 implements b44 {
    private final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.b44
    public void a() {
        Iterator it2 = x19.i(this.a).iterator();
        while (it2.hasNext()) {
            ((eg8) it2.next()).a();
        }
    }

    @Override // defpackage.b44
    public void b() {
        Iterator it2 = x19.i(this.a).iterator();
        while (it2.hasNext()) {
            ((eg8) it2.next()).b();
        }
    }

    public void k() {
        this.a.clear();
    }

    public List l() {
        return x19.i(this.a);
    }

    public void m(eg8 eg8Var) {
        this.a.add(eg8Var);
    }

    public void n(eg8 eg8Var) {
        this.a.remove(eg8Var);
    }

    @Override // defpackage.b44
    public void onDestroy() {
        Iterator it2 = x19.i(this.a).iterator();
        while (it2.hasNext()) {
            ((eg8) it2.next()).onDestroy();
        }
    }
}
