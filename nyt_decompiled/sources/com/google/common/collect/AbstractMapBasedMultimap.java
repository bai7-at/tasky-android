package com.google.common.collect;

import com.google.common.collect.Maps;
import com.google.common.collect.c;
import defpackage.b16;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes3.dex */
abstract class AbstractMapBasedMultimap<K, V> extends com.google.common.collect.c implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    private transient Map e;
    private transient int f;

    class a extends d {
        a(AbstractMapBasedMultimap abstractMapBasedMultimap) {
            super();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.d
        Object b(Object obj, Object obj2) {
            return obj2;
        }
    }

    class b extends d {
        b(AbstractMapBasedMultimap abstractMapBasedMultimap) {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMapBasedMultimap.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry b(Object obj, Object obj2) {
            return Maps.d(obj, obj2);
        }
    }

    private class c extends Maps.e {
        final transient Map c;

        class a extends Maps.b {
            a() {
            }

            @Override // com.google.common.collect.Maps.b
            Map a() {
                return c.this;
            }

            @Override // com.google.common.collect.Maps.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return com.google.common.collect.f.d(c.this.c.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return c.this.new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractMapBasedMultimap.this.x(entry.getKey());
                return true;
            }
        }

        class b implements Iterator {
            final Iterator a;
            Collection b;

            b() {
                this.a = c.this.c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                Map.Entry entry = (Map.Entry) this.a.next();
                this.b = (Collection) entry.getValue();
                return c.this.h(entry);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                b16.q(this.b != null, "no calls to next() since the last call to remove()");
                this.a.remove();
                AbstractMapBasedMultimap.p(AbstractMapBasedMultimap.this, this.b.size());
                this.b.clear();
                this.b = null;
            }
        }

        c(Map map) {
            this.c = map;
        }

        @Override // com.google.common.collect.Maps.e
        protected Set a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.c == AbstractMapBasedMultimap.this.e) {
                AbstractMapBasedMultimap.this.clear();
            } else {
                Iterators.c(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return Maps.h(this.c, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection get(Object obj) {
            Collection collection = (Collection) Maps.i(this.c, obj);
            if (collection == null) {
                return null;
            }
            return AbstractMapBasedMultimap.this.A(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.c.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Collection remove(Object obj) {
            Collection collection = (Collection) this.c.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection s = AbstractMapBasedMultimap.this.s();
            s.addAll(collection);
            AbstractMapBasedMultimap.p(AbstractMapBasedMultimap.this, collection.size());
            collection.clear();
            return s;
        }

        Map.Entry h(Map.Entry entry) {
            Object key = entry.getKey();
            return Maps.d(key, AbstractMapBasedMultimap.this.A(key, (Collection) entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set keySet() {
            return AbstractMapBasedMultimap.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.c.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.c.toString();
        }
    }

    private abstract class d implements Iterator {
        final Iterator a;
        Object b = null;
        Collection c = null;
        Iterator d = Iterators.h();

        d() {
            this.a = AbstractMapBasedMultimap.this.e.entrySet().iterator();
        }

        abstract Object b(Object obj, Object obj2);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext() || this.d.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.d.hasNext()) {
                Map.Entry entry = (Map.Entry) this.a.next();
                this.b = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.c = collection;
                this.d = collection.iterator();
            }
            return b(m.a(this.b), this.d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.d.remove();
            Collection collection = this.c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.a.remove();
            }
            AbstractMapBasedMultimap.n(AbstractMapBasedMultimap.this);
        }
    }

    private class e extends Maps.c {

        class a implements Iterator {
            Map.Entry a;
            final /* synthetic */ Iterator b;

            a(Iterator it2) {
                this.b = it2;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.b.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Map.Entry entry = (Map.Entry) this.b.next();
                this.a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                b16.q(this.a != null, "no calls to next() since the last call to remove()");
                Collection collection = (Collection) this.a.getValue();
                this.b.remove();
                AbstractMapBasedMultimap.p(AbstractMapBasedMultimap.this, collection.size());
                collection.clear();
                this.a = null;
            }
        }

        e(Map map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Iterators.c(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return a().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || a().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return a().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a(a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int i;
            Collection collection = (Collection) a().remove(obj);
            if (collection != null) {
                i = collection.size();
                collection.clear();
                AbstractMapBasedMultimap.p(AbstractMapBasedMultimap.this, i);
            } else {
                i = 0;
            }
            return i > 0;
        }
    }

    class f extends i implements NavigableMap {
        f(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry ceilingEntry(Object obj) {
            Map.Entry<K, V> ceilingEntry = l().ceilingEntry(obj);
            if (ceilingEntry == null) {
                return null;
            }
            return h(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public Object ceilingKey(Object obj) {
            return l().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap descendingMap() {
            return new f(l().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry firstEntry() {
            Map.Entry<K, V> firstEntry = l().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return h(firstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry floorEntry(Object obj) {
            Map.Entry<K, V> floorEntry = l().floorEntry(obj);
            if (floorEntry == null) {
                return null;
            }
            return h(floorEntry);
        }

        @Override // java.util.NavigableMap
        public Object floorKey(Object obj) {
            return l().floorKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry higherEntry(Object obj) {
            Map.Entry<K, V> higherEntry = l().higherEntry(obj);
            if (higherEntry == null) {
                return null;
            }
            return h(higherEntry);
        }

        @Override // java.util.NavigableMap
        public Object higherKey(Object obj) {
            return l().higherKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry lastEntry() {
            Map.Entry<K, V> lastEntry = l().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return h(lastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry lowerEntry(Object obj) {
            Map.Entry<K, V> lowerEntry = l().lowerEntry(obj);
            if (lowerEntry == null) {
                return null;
            }
            return h(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public Object lowerKey(Object obj) {
            return l().lowerKey(obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMapBasedMultimap.i
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableSet i() {
            return new g(l());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public NavigableMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public NavigableSet navigableKeySet() {
            return j();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.i, com.google.common.collect.AbstractMapBasedMultimap.c, java.util.AbstractMap, java.util.Map
        /* renamed from: o, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollFirstEntry() {
            return q(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollLastEntry() {
            return q(descendingMap().entrySet().iterator());
        }

        Map.Entry q(Iterator it2) {
            if (!it2.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            Collection s = AbstractMapBasedMultimap.this.s();
            s.addAll((Collection) entry.getValue());
            it2.remove();
            return Maps.d(entry.getKey(), AbstractMapBasedMultimap.this.z(s));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMapBasedMultimap.i
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public NavigableMap l() {
            return (NavigableMap) super.l();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public NavigableMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public NavigableMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Object obj, boolean z) {
            return new f(l().headMap(obj, z));
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
            return new f(l().subMap(obj, z, obj2, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Object obj, boolean z) {
            return new f(l().tailMap(obj, z));
        }
    }

    class g extends j implements NavigableSet {
        g(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return c().ceilingKey(obj);
        }

        @Override // java.util.NavigableSet
        public Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet descendingSet() {
            return new g(c().descendingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public NavigableSet headSet(Object obj) {
            return headSet(obj, false);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMapBasedMultimap.j
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap c() {
            return (NavigableMap) super.c();
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return c().floorKey(obj);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return c().higherKey(obj);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return c().lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return Iterators.o(iterator());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return Iterators.o(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z) {
            return new g(c().headMap(obj, z));
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
            return new g(c().subMap(obj, z, obj2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z) {
            return new g(c().tailMap(obj, z));
        }
    }

    private class h extends l implements RandomAccess {
        h(AbstractMapBasedMultimap abstractMapBasedMultimap, Object obj, List list, k kVar) {
            super(obj, list, kVar);
        }
    }

    private class i extends c implements SortedMap {
        SortedSet e;

        i(SortedMap sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return l().comparator();
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return l().firstKey();
        }

        public SortedMap headMap(Object obj) {
            return new i(l().headMap(obj));
        }

        SortedSet i() {
            return new j(l());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.c, java.util.AbstractMap, java.util.Map
        /* renamed from: j */
        public SortedSet keySet() {
            SortedSet sortedSet = this.e;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet i = i();
            this.e = i;
            return i;
        }

        SortedMap l() {
            return (SortedMap) this.c;
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return l().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return new i(l().subMap(obj, obj2));
        }

        public SortedMap tailMap(Object obj) {
            return new i(l().tailMap(obj));
        }
    }

    private class j extends e implements SortedSet {
        j(SortedMap sortedMap) {
            super(sortedMap);
        }

        SortedMap c() {
            return (SortedMap) super.a();
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return c().comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return c().firstKey();
        }

        public SortedSet headSet(Object obj) {
            return new j(c().headMap(obj));
        }

        @Override // java.util.SortedSet
        public Object last() {
            return c().lastKey();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return new j(c().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return new j(c().tailMap(obj));
        }
    }

    protected AbstractMapBasedMultimap(Map map) {
        b16.d(map.isEmpty());
        this.e = map;
    }

    static /* synthetic */ int m(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i2 = abstractMapBasedMultimap.f;
        abstractMapBasedMultimap.f = i2 + 1;
        return i2;
    }

    static /* synthetic */ int n(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i2 = abstractMapBasedMultimap.f;
        abstractMapBasedMultimap.f = i2 - 1;
        return i2;
    }

    static /* synthetic */ int o(AbstractMapBasedMultimap abstractMapBasedMultimap, int i2) {
        int i3 = abstractMapBasedMultimap.f + i2;
        abstractMapBasedMultimap.f = i3;
        return i3;
    }

    static /* synthetic */ int p(AbstractMapBasedMultimap abstractMapBasedMultimap, int i2) {
        int i3 = abstractMapBasedMultimap.f - i2;
        abstractMapBasedMultimap.f = i3;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Iterator w(Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(Object obj) {
        Collection collection = (Collection) Maps.j(this.e, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f -= size;
        }
    }

    abstract Collection A(Object obj, Collection collection);

    final List B(Object obj, List list, k kVar) {
        return list instanceof RandomAccess ? new h(this, obj, list, kVar) : new l(obj, list, kVar);
    }

    @Override // com.google.common.collect.c, defpackage.tx4
    public Collection a() {
        return super.a();
    }

    @Override // defpackage.tx4
    public void clear() {
        Iterator<V> it2 = this.e.values().iterator();
        while (it2.hasNext()) {
            ((Collection) it2.next()).clear();
        }
        this.e.clear();
        this.f = 0;
    }

    @Override // com.google.common.collect.c
    Collection f() {
        return new c.a();
    }

    @Override // defpackage.tx4
    public Collection get(Object obj) {
        Collection collection = (Collection) this.e.get(obj);
        if (collection == null) {
            collection = t(obj);
        }
        return A(obj, collection);
    }

    @Override // com.google.common.collect.c
    Collection h() {
        return new c.b();
    }

    @Override // com.google.common.collect.c
    Iterator i() {
        return new b(this);
    }

    @Override // com.google.common.collect.c
    Iterator j() {
        return new a(this);
    }

    @Override // defpackage.tx4
    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.e.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f++;
            return true;
        }
        Collection t = t(obj);
        if (!t.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f++;
        this.e.put(obj, t);
        return true;
    }

    Map r() {
        return this.e;
    }

    abstract Collection s();

    @Override // defpackage.tx4
    public int size() {
        return this.f;
    }

    Collection t(Object obj) {
        return s();
    }

    final Map u() {
        Map map = this.e;
        return map instanceof NavigableMap ? new f((NavigableMap) this.e) : map instanceof SortedMap ? new i((SortedMap) this.e) : new c(this.e);
    }

    final Set v() {
        Map map = this.e;
        return map instanceof NavigableMap ? new g((NavigableMap) this.e) : map instanceof SortedMap ? new j((SortedMap) this.e) : new e(this.e);
    }

    @Override // com.google.common.collect.c, defpackage.tx4
    public Collection values() {
        return super.values();
    }

    final void y(Map map) {
        this.e = map;
        this.f = 0;
        for (V v : map.values()) {
            b16.d(!v.isEmpty());
            this.f += v.size();
        }
    }

    abstract Collection z(Collection collection);

    class k extends AbstractCollection {
        final Object a;
        Collection b;
        final k c;
        final Collection d;

        k(Object obj, Collection collection, k kVar) {
            this.a = obj;
            this.b = collection;
            this.c = kVar;
            this.d = kVar == null ? null : kVar.e();
        }

        /* JADX WARN: Multi-variable type inference failed */
        void a() {
            k kVar = this.c;
            if (kVar != null) {
                kVar.a();
            } else {
                AbstractMapBasedMultimap.this.e.put(this.a, this.b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            g();
            boolean isEmpty = this.b.isEmpty();
            boolean add = this.b.add(obj);
            if (add) {
                AbstractMapBasedMultimap.m(AbstractMapBasedMultimap.this);
                if (isEmpty) {
                    a();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.b.addAll(collection);
            if (addAll) {
                AbstractMapBasedMultimap.o(AbstractMapBasedMultimap.this, this.b.size() - size);
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        k c() {
            return this.c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.b.clear();
            AbstractMapBasedMultimap.p(AbstractMapBasedMultimap.this, size);
            j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            g();
            return this.b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            g();
            return this.b.containsAll(collection);
        }

        Collection e() {
            return this.b;
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            g();
            return this.b.equals(obj);
        }

        Object f() {
            return this.a;
        }

        void g() {
            Collection collection;
            k kVar = this.c;
            if (kVar != null) {
                kVar.g();
                if (this.c.e() != this.d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.b.isEmpty() || (collection = (Collection) AbstractMapBasedMultimap.this.e.get(this.a)) == null) {
                    return;
                }
                this.b = collection;
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            g();
            return this.b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            g();
            return new a();
        }

        void j() {
            k kVar = this.c;
            if (kVar != null) {
                kVar.j();
            } else if (this.b.isEmpty()) {
                AbstractMapBasedMultimap.this.e.remove(this.a);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            g();
            boolean remove = this.b.remove(obj);
            if (remove) {
                AbstractMapBasedMultimap.n(AbstractMapBasedMultimap.this);
                j();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.b.removeAll(collection);
            if (removeAll) {
                AbstractMapBasedMultimap.o(AbstractMapBasedMultimap.this, this.b.size() - size);
                j();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            b16.k(collection);
            int size = size();
            boolean retainAll = this.b.retainAll(collection);
            if (retainAll) {
                AbstractMapBasedMultimap.o(AbstractMapBasedMultimap.this, this.b.size() - size);
                j();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            g();
            return this.b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            g();
            return this.b.toString();
        }

        class a implements Iterator {
            final Iterator a;
            final Collection b;

            a() {
                Collection collection = k.this.b;
                this.b = collection;
                this.a = AbstractMapBasedMultimap.w(collection);
            }

            Iterator b() {
                c();
                return this.a;
            }

            void c() {
                k.this.g();
                if (k.this.b != this.b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                c();
                return this.a.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                c();
                return this.a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.a.remove();
                AbstractMapBasedMultimap.n(AbstractMapBasedMultimap.this);
                k.this.j();
            }

            a(Iterator it2) {
                this.b = k.this.b;
                this.a = it2;
            }
        }
    }

    class l extends k implements List {

        private class a extends k.a implements ListIterator {
            a() {
                super();
            }

            private ListIterator d() {
                return (ListIterator) b();
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                boolean isEmpty = l.this.isEmpty();
                d().add(obj);
                AbstractMapBasedMultimap.m(AbstractMapBasedMultimap.this);
                if (isEmpty) {
                    l.this.a();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return d().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return d().nextIndex();
            }

            @Override // java.util.ListIterator
            public Object previous() {
                return d().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return d().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                d().set(obj);
            }

            public a(int i) {
                super(l.this.k().listIterator(i));
            }
        }

        l(Object obj, List list, k kVar) {
            super(obj, list, kVar);
        }

        @Override // java.util.List
        public void add(int i, Object obj) {
            g();
            boolean isEmpty = e().isEmpty();
            k().add(i, obj);
            AbstractMapBasedMultimap.m(AbstractMapBasedMultimap.this);
            if (isEmpty) {
                a();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = k().addAll(i, collection);
            if (addAll) {
                AbstractMapBasedMultimap.o(AbstractMapBasedMultimap.this, e().size() - size);
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public Object get(int i) {
            g();
            return k().get(i);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            g();
            return k().indexOf(obj);
        }

        List k() {
            return (List) e();
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            g();
            return k().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            g();
            return new a();
        }

        @Override // java.util.List
        public Object remove(int i) {
            g();
            Object remove = k().remove(i);
            AbstractMapBasedMultimap.n(AbstractMapBasedMultimap.this);
            j();
            return remove;
        }

        @Override // java.util.List
        public Object set(int i, Object obj) {
            g();
            return k().set(i, obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.collect.AbstractMapBasedMultimap] */
        /* JADX WARN: Type inference failed for: r3v1, types: [com.google.common.collect.AbstractMapBasedMultimap$k] */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5 */
        @Override // java.util.List
        public List subList(int i, int i2) {
            g();
            ?? r0 = AbstractMapBasedMultimap.this;
            Object f = f();
            List subList = k().subList(i, i2);
            k c = c();
            ?? r3 = this;
            if (c != null) {
                r3 = c();
            }
            return r0.B(f, subList, r3);
        }

        @Override // java.util.List
        public ListIterator listIterator(int i) {
            g();
            return new a(i);
        }
    }
}
