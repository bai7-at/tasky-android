package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class xhe {
    public final xhe a;
    final cha b;
    final Map c = new HashMap();
    final Map d = new HashMap();

    public xhe(xhe xheVar, cha chaVar) {
        this.a = xheVar;
        this.b = chaVar;
    }

    public final xhe a() {
        return new xhe(this, this.b);
    }

    public final caa b(caa caaVar) {
        return this.b.a(this, caaVar);
    }

    public final caa c(qx9 qx9Var) {
        caa caaVar = caa.T;
        Iterator j = qx9Var.j();
        while (j.hasNext()) {
            caaVar = this.b.a(this, qx9Var.f(((Integer) j.next()).intValue()));
            if (caaVar instanceof d0a) {
                break;
            }
        }
        return caaVar;
    }

    public final caa d(String str) {
        if (this.c.containsKey(str)) {
            return (caa) this.c.get(str);
        }
        xhe xheVar = this.a;
        if (xheVar != null) {
            return xheVar.d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    public final void e(String str, caa caaVar) {
        if (this.d.containsKey(str)) {
            return;
        }
        if (caaVar == null) {
            this.c.remove(str);
        } else {
            this.c.put(str, caaVar);
        }
    }

    public final void f(String str, caa caaVar) {
        e(str, caaVar);
        this.d.put(str, Boolean.TRUE);
    }

    public final void g(String str, caa caaVar) {
        xhe xheVar;
        if (!this.c.containsKey(str) && (xheVar = this.a) != null && xheVar.h(str)) {
            this.a.g(str, caaVar);
        } else {
            if (this.d.containsKey(str)) {
                return;
            }
            if (caaVar == null) {
                this.c.remove(str);
            } else {
                this.c.put(str, caaVar);
            }
        }
    }

    public final boolean h(String str) {
        if (this.c.containsKey(str)) {
            return true;
        }
        xhe xheVar = this.a;
        if (xheVar != null) {
            return xheVar.h(str);
        }
        return false;
    }
}
