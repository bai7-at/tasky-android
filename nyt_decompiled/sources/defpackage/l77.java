package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class l77 implements Iterable {
    c a;
    private c b;
    private final WeakHashMap c = new WeakHashMap();
    private int d = 0;

    static class a extends e {
        a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // l77.e
        c c(c cVar) {
            return cVar.d;
        }

        @Override // l77.e
        c d(c cVar) {
            return cVar.c;
        }
    }

    private static class b extends e {
        b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // l77.e
        c c(c cVar) {
            return cVar.c;
        }

        @Override // l77.e
        c d(c cVar) {
            return cVar.d;
        }
    }

    static class c implements Map.Entry {
        final Object a;
        final Object b;
        c c;
        c d;

        c(Object obj, Object obj2) {
            this.a = obj;
            this.b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b.equals(cVar.b);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.b.hashCode() ^ this.a.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.a + "=" + this.b;
        }
    }

    public class d extends f implements Iterator {
        private c a;
        private boolean b = true;

        d() {
        }

        @Override // l77.f
        void b(c cVar) {
            c cVar2 = this.a;
            if (cVar == cVar2) {
                c cVar3 = cVar2.d;
                this.a = cVar3;
                this.b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.b) {
                this.b = false;
                this.a = l77.this.a;
            } else {
                c cVar = this.a;
                this.a = cVar != null ? cVar.c : null;
            }
            return this.a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.b) {
                return l77.this.a != null;
            }
            c cVar = this.a;
            return (cVar == null || cVar.c == null) ? false : true;
        }
    }

    private static abstract class e extends f implements Iterator {
        c a;
        c b;

        e(c cVar, c cVar2) {
            this.a = cVar2;
            this.b = cVar;
        }

        private c f() {
            c cVar = this.b;
            c cVar2 = this.a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // l77.f
        public void b(c cVar) {
            if (this.a == cVar && cVar == this.b) {
                this.b = null;
                this.a = null;
            }
            c cVar2 = this.a;
            if (cVar2 == cVar) {
                this.a = c(cVar2);
            }
            if (this.b == cVar) {
                this.b = f();
            }
        }

        abstract c c(c cVar);

        abstract c d(c cVar);

        @Override // java.util.Iterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.b;
            this.b = f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b != null;
        }
    }

    public static abstract class f {
        abstract void b(c cVar);
    }

    public Map.Entry a() {
        return this.a;
    }

    protected c c(Object obj) {
        c cVar = this.a;
        while (cVar != null && !cVar.a.equals(obj)) {
            cVar = cVar.c;
        }
        return cVar;
    }

    public Iterator descendingIterator() {
        b bVar = new b(this.b, this.a);
        this.c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public d e() {
        d dVar = new d();
        this.c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l77)) {
            return false;
        }
        l77 l77Var = (l77) obj;
        if (size() != l77Var.size()) {
            return false;
        }
        Iterator it2 = iterator();
        Iterator it3 = l77Var.iterator();
        while (it2.hasNext() && it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object next = it3.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it2.hasNext() || it3.hasNext()) ? false : true;
    }

    public Map.Entry f() {
        return this.b;
    }

    c g(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.d++;
        c cVar2 = this.b;
        if (cVar2 == null) {
            this.a = cVar;
            this.b = cVar;
            return cVar;
        }
        cVar2.c = cVar;
        cVar.d = cVar2;
        this.b = cVar;
        return cVar;
    }

    public int hashCode() {
        Iterator it2 = iterator();
        int i = 0;
        while (it2.hasNext()) {
            i += ((Map.Entry) it2.next()).hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.a, this.b);
        this.c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public Object j(Object obj, Object obj2) {
        c c2 = c(obj);
        if (c2 != null) {
            return c2.b;
        }
        g(obj, obj2);
        return null;
    }

    public Object k(Object obj) {
        c c2 = c(obj);
        if (c2 == null) {
            return null;
        }
        this.d--;
        if (!this.c.isEmpty()) {
            Iterator it2 = this.c.keySet().iterator();
            while (it2.hasNext()) {
                ((f) it2.next()).b(c2);
            }
        }
        c cVar = c2.d;
        if (cVar != null) {
            cVar.c = c2.c;
        } else {
            this.a = c2.c;
        }
        c cVar2 = c2.c;
        if (cVar2 != null) {
            cVar2.d = cVar;
        } else {
            this.b = cVar;
        }
        c2.c = null;
        c2.d = null;
        return c2.b;
    }

    public int size() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it2 = iterator();
        while (it2.hasNext()) {
            sb.append(((Map.Entry) it2.next()).toString());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
