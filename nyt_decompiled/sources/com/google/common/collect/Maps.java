package com.google.common.collect;

import com.google.common.collect.s;
import defpackage.b16;
import defpackage.hc5;
import defpackage.ht2;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class Maps {

    private enum EntryFunction implements ht2 {
        KEY { // from class: com.google.common.collect.Maps.EntryFunction.1
            @Override // com.google.common.collect.Maps.EntryFunction, defpackage.ht2
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE { // from class: com.google.common.collect.Maps.EntryFunction.2
            @Override // com.google.common.collect.Maps.EntryFunction, defpackage.ht2
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        };

        @Override // defpackage.ht2
        public abstract /* synthetic */ Object apply(Object obj);

        /* synthetic */ EntryFunction(l lVar) {
            this();
        }
    }

    class a extends t {
        a(Iterator it2) {
            super(it2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.t
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Object b(Map.Entry entry) {
            return entry.getValue();
        }
    }

    static abstract class b extends s.d {
        b() {
        }

        abstract Map a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // com.google.common.collect.s.d, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) b16.k(collection));
            } catch (UnsupportedOperationException unused) {
                return s.j(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.s.d, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) b16.k(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet g = s.g(collection.size());
                for (Object obj : collection) {
                    if (this.contains(obj) && (obj instanceof Map.Entry)) {
                        g.add(((Map.Entry) obj).getKey());
                    }
                }
                return this.a().keySet().retainAll(g);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }
    }

    static class c extends s.d {
        final Map a;

        c(Map map) {
            this.a = (Map) b16.k(map);
        }

        Map a() {
            return this.a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return a().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }
    }

    static class d extends AbstractCollection {
        final Map a;

        d(Map map) {
            this.a = (Map) b16.k(map);
        }

        final Map a() {
            return this.a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return a().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return Maps.m(a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : this.a().entrySet()) {
                    if (hc5.a(obj, entry.getValue())) {
                        this.a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) b16.k(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f = s.f();
                for (Map.Entry entry : this.a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f.add(entry.getKey());
                    }
                }
                return this.a().keySet().removeAll(f);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) b16.k(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f = s.f();
                for (Map.Entry entry : this.a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f.add(entry.getKey());
                    }
                }
                return this.a().keySet().retainAll(f);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    static abstract class e extends AbstractMap {
        private transient Set a;
        private transient Collection b;

        e() {
        }

        abstract Set a();

        Collection c() {
            return new d(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            Set set = this.a;
            if (set != null) {
                return set;
            }
            Set a = a();
            this.a = a;
            return a;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection values() {
            Collection collection = this.b;
            if (collection != null) {
                return collection;
            }
            Collection c = c();
            this.b = c;
            return c;
        }
    }

    static int a(int i) {
        if (i < 3) {
            com.google.common.collect.e.b(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    static boolean b(Map map, Object obj) {
        return Iterators.d(m(map.entrySet().iterator()), obj);
    }

    static boolean c(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static Map.Entry d(Object obj, Object obj2) {
        return new ImmutableEntry(obj, obj2);
    }

    static ht2 e() {
        return EntryFunction.KEY;
    }

    public static HashMap f(int i) {
        return new HashMap(a(i));
    }

    public static IdentityHashMap g() {
        return new IdentityHashMap();
    }

    static boolean h(Map map, Object obj) {
        b16.k(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static Object i(Map map, Object obj) {
        b16.k(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static Object j(Map map, Object obj) {
        b16.k(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static String k(Map map) {
        StringBuilder c2 = f.c(map.size());
        c2.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                c2.append(", ");
            }
            c2.append(entry.getKey());
            c2.append('=');
            c2.append(entry.getValue());
            z = false;
        }
        c2.append('}');
        return c2.toString();
    }

    static ht2 l() {
        return EntryFunction.VALUE;
    }

    static Iterator m(Iterator it2) {
        return new a(it2);
    }
}
