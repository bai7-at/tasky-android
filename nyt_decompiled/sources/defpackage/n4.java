package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
class n4 implements w34 {
    private final Set a = Collections.newSetFromMap(new WeakHashMap());
    private boolean b;
    private boolean c;

    n4() {
    }

    @Override // defpackage.w34
    public void a(b44 b44Var) {
        this.a.add(b44Var);
        if (this.c) {
            b44Var.onDestroy();
        } else if (this.b) {
            b44Var.b();
        } else {
            b44Var.a();
        }
    }

    @Override // defpackage.w34
    public void b(b44 b44Var) {
        this.a.remove(b44Var);
    }

    void c() {
        this.c = true;
        Iterator it2 = x19.i(this.a).iterator();
        while (it2.hasNext()) {
            ((b44) it2.next()).onDestroy();
        }
    }

    void d() {
        this.b = true;
        Iterator it2 = x19.i(this.a).iterator();
        while (it2.hasNext()) {
            ((b44) it2.next()).b();
        }
    }

    void e() {
        this.b = false;
        Iterator it2 = x19.i(this.a).iterator();
        while (it2.hasNext()) {
            ((b44) it2.next()).a();
        }
    }
}
