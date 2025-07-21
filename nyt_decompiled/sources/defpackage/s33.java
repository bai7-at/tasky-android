package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
class s33 {
    private final a a = new a();
    private final Map b = new HashMap();

    private static class a {
        final Object a;
        private List b;
        a c;
        a d;

        a() {
            this(null);
        }

        public void a(Object obj) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            this.b.add(obj);
        }

        public Object b() {
            int c = c();
            if (c > 0) {
                return this.b.remove(c - 1);
            }
            return null;
        }

        public int c() {
            List list = this.b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(Object obj) {
            this.d = this;
            this.c = this;
            this.a = obj;
        }
    }

    s33() {
    }

    private void b(a aVar) {
        e(aVar);
        a aVar2 = this.a;
        aVar.d = aVar2;
        aVar.c = aVar2.c;
        g(aVar);
    }

    private void c(a aVar) {
        e(aVar);
        a aVar2 = this.a;
        aVar.d = aVar2.d;
        aVar.c = aVar2;
        g(aVar);
    }

    private static void e(a aVar) {
        a aVar2 = aVar.d;
        aVar2.c = aVar.c;
        aVar.c.d = aVar2;
    }

    private static void g(a aVar) {
        aVar.c.d = aVar;
        aVar.d.c = aVar;
    }

    public Object a(nz5 nz5Var) {
        a aVar = (a) this.b.get(nz5Var);
        if (aVar == null) {
            aVar = new a(nz5Var);
            this.b.put(nz5Var, aVar);
        } else {
            nz5Var.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(nz5 nz5Var, Object obj) {
        a aVar = (a) this.b.get(nz5Var);
        if (aVar == null) {
            aVar = new a(nz5Var);
            c(aVar);
            this.b.put(nz5Var, aVar);
        } else {
            nz5Var.a();
        }
        aVar.a(obj);
    }

    public Object f() {
        for (a aVar = this.a.d; !aVar.equals(this.a); aVar = aVar.d) {
            Object b = aVar.b();
            if (b != null) {
                return b;
            }
            e(aVar);
            this.b.remove(aVar.a);
            ((nz5) aVar.a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.a.c;
        boolean z = false;
        while (!aVar.equals(this.a)) {
            sb.append('{');
            sb.append(aVar.a);
            sb.append(':');
            sb.append(aVar.c());
            sb.append("}, ");
            aVar = aVar.c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
