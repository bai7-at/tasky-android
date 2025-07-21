package androidx.datastore.preferences.protobuf;

import defpackage.lh4;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
abstract class u0 extends AbstractMap {
    private final int a;
    private List b;
    private Map c;
    private boolean d;
    private volatile g e;
    private Map f;
    private volatile c g;

    static class a extends u0 {
        a(int i) {
            super(i, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            lh4.a(obj);
            return super.w(null, obj2);
        }

        @Override // androidx.datastore.preferences.protobuf.u0
        public void u() {
            if (!t()) {
                if (o() > 0) {
                    lh4.a(n(0).getKey());
                    throw null;
                }
                Iterator it2 = r().iterator();
                if (it2.hasNext()) {
                    lh4.a(((Map.Entry) it2.next()).getKey());
                    throw null;
                }
            }
            super.u();
        }
    }

    private class c extends g {
        private c() {
            super(u0.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.u0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(u0.this, null);
        }

        /* synthetic */ c(u0 u0Var, a aVar) {
            this();
        }
    }

    private static class d {
        private static final Iterator a = new a();
        private static final Iterable b = new b();

        static class a implements Iterator {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        static class b implements Iterable {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return d.a;
            }
        }

        static Iterable b() {
            return b;
        }
    }

    private class e implements Map.Entry, Comparable {
        private final Comparable a;
        private Object b;

        e(u0 u0Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        @Override // java.util.Map.Entry
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b(this.a, entry.getKey()) && b(this.b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.a;
            int hashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.b;
            return hashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            u0.this.j();
            Object obj2 = this.b;
            this.b = obj;
            return obj2;
        }

        public String toString() {
            return this.a + "=" + this.b;
        }

        e(Comparable comparable, Object obj) {
            this.a = comparable;
            this.b = obj;
        }
    }

    private class g extends AbstractSet {
        private g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            u0.this.w((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            u0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = u0.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new f(u0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            u0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return u0.this.size();
        }

        /* synthetic */ g(u0 u0Var, a aVar) {
            this();
        }
    }

    /* synthetic */ u0(int i, a aVar) {
        this(i);
    }

    private int i(Comparable comparable) {
        int i;
        int size = this.b.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((e) this.b.get(i2)).getKey());
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((e) this.b.get(i4)).getKey());
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        i = i3 + 1;
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.d) {
            throw new UnsupportedOperationException();
        }
    }

    private void m() {
        j();
        if (!this.b.isEmpty() || (this.b instanceof ArrayList)) {
            return;
        }
        this.b = new ArrayList(this.a);
    }

    private SortedMap s() {
        j();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    static u0 v(int i) {
        return new a(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object x(int i) {
        j();
        Object value = ((e) this.b.remove(i)).getValue();
        if (!this.c.isEmpty()) {
            Iterator it2 = s().entrySet().iterator();
            this.b.add(new e(this, (Map.Entry) it2.next()));
            it2.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        j();
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        if (this.c.isEmpty()) {
            return;
        }
        this.c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return i(comparable) >= 0 || this.c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.e == null) {
            this.e = new g(this, null);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return super.equals(obj);
        }
        u0 u0Var = (u0) obj;
        int size = size();
        if (size != u0Var.size()) {
            return false;
        }
        int o = o();
        if (o != u0Var.o()) {
            return entrySet().equals(u0Var.entrySet());
        }
        for (int i = 0; i < o; i++) {
            if (!n(i).equals(u0Var.n(i))) {
                return false;
            }
        }
        if (o != size) {
            return this.c.equals(u0Var.c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int i = i(comparable);
        return i >= 0 ? ((e) this.b.get(i)).getValue() : this.c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int o = o();
        int i = 0;
        for (int i2 = 0; i2 < o; i2++) {
            i += ((e) this.b.get(i2)).hashCode();
        }
        return q() > 0 ? i + this.c.hashCode() : i;
    }

    Set l() {
        if (this.g == null) {
            this.g = new c(this, null);
        }
        return this.g;
    }

    public Map.Entry n(int i) {
        return (Map.Entry) this.b.get(i);
    }

    public int o() {
        return this.b.size();
    }

    public int q() {
        return this.c.size();
    }

    public Iterable r() {
        return this.c.isEmpty() ? d.b() : this.c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        j();
        Comparable comparable = (Comparable) obj;
        int i = i(comparable);
        if (i >= 0) {
            return x(i);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.b.size() + this.c.size();
    }

    public boolean t() {
        return this.d;
    }

    public void u() {
        if (this.d) {
            return;
        }
        this.c = this.c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.c);
        this.f = this.f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f);
        this.d = true;
    }

    public Object w(Comparable comparable, Object obj) {
        j();
        int i = i(comparable);
        if (i >= 0) {
            return ((e) this.b.get(i)).setValue(obj);
        }
        m();
        int i2 = -(i + 1);
        if (i2 >= this.a) {
            return s().put(comparable, obj);
        }
        int size = this.b.size();
        int i3 = this.a;
        if (size == i3) {
            e eVar = (e) this.b.remove(i3 - 1);
            s().put(eVar.getKey(), eVar.getValue());
        }
        this.b.add(i2, new e(comparable, obj));
        return null;
    }

    private class b implements Iterator {
        private int a;
        private Iterator b;

        private b() {
            this.a = u0.this.b.size();
        }

        private Iterator b() {
            if (this.b == null) {
                this.b = u0.this.f.entrySet().iterator();
            }
            return this.b;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (b().hasNext()) {
                return (Map.Entry) b().next();
            }
            List list = u0.this.b;
            int i = this.a - 1;
            this.a = i;
            return (Map.Entry) list.get(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.a;
            return (i > 0 && i <= u0.this.b.size()) || b().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(u0 u0Var, a aVar) {
            this();
        }
    }

    private class f implements Iterator {
        private int a;
        private boolean b;
        private Iterator c;

        private f() {
            this.a = -1;
        }

        private Iterator b() {
            if (this.c == null) {
                this.c = u0.this.c.entrySet().iterator();
            }
            return this.c;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.b = true;
            int i = this.a + 1;
            this.a = i;
            return i < u0.this.b.size() ? (Map.Entry) u0.this.b.get(this.a) : (Map.Entry) b().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.a + 1 >= u0.this.b.size()) {
                return !u0.this.c.isEmpty() && b().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.b = false;
            u0.this.j();
            if (this.a >= u0.this.b.size()) {
                b().remove();
                return;
            }
            u0 u0Var = u0.this;
            int i = this.a;
            this.a = i - 1;
            u0Var.x(i);
        }

        /* synthetic */ f(u0 u0Var, a aVar) {
            this();
        }
    }

    private u0(int i) {
        this.a = i;
        this.b = Collections.emptyList();
        this.c = Collections.emptyMap();
        this.f = Collections.emptyMap();
    }
}
