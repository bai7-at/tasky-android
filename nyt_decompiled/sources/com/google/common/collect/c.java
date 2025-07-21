package com.google.common.collect;

import com.google.common.collect.Multimaps;
import defpackage.tx4;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
abstract class c implements tx4 {
    private transient Collection a;
    private transient Set b;
    private transient Collection c;
    private transient Map d;

    class a extends Multimaps.a {
        a() {
        }

        @Override // com.google.common.collect.Multimaps.a
        tx4 a() {
            return c.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return c.this.i();
        }
    }

    class b extends AbstractCollection {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            c.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return c.this.d(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return c.this.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return c.this.size();
        }
    }

    c() {
    }

    @Override // defpackage.tx4
    public Collection a() {
        Collection collection = this.a;
        if (collection != null) {
            return collection;
        }
        Collection f = f();
        this.a = f;
        return f;
    }

    @Override // defpackage.tx4
    public boolean b(Object obj, Object obj2) {
        Collection collection = (Collection) c().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // defpackage.tx4
    public Map c() {
        Map map = this.d;
        if (map != null) {
            return map;
        }
        Map e = e();
        this.d = e;
        return e;
    }

    public boolean d(Object obj) {
        Iterator it2 = c().values().iterator();
        while (it2.hasNext()) {
            if (((Collection) it2.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    abstract Map e();

    public boolean equals(Object obj) {
        return Multimaps.a(this, obj);
    }

    abstract Collection f();

    abstract Set g();

    abstract Collection h();

    public int hashCode() {
        return c().hashCode();
    }

    abstract Iterator i();

    abstract Iterator j();

    @Override // defpackage.tx4
    public Set keySet() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        Set g = g();
        this.b = g;
        return g;
    }

    @Override // defpackage.tx4
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) c().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return c().toString();
    }

    @Override // defpackage.tx4
    public Collection values() {
        Collection collection = this.c;
        if (collection != null) {
            return collection;
        }
        Collection h = h();
        this.c = h;
        return h;
    }
}
