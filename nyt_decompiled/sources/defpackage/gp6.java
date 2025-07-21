package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes5.dex */
public final class gp6 extends AbstractMap {
    private final List a;
    private final int b;

    final class a extends c {
        a() {
            super();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            int d;
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() == null || (d = gp6.this.d(entry.getKey())) == -1) {
                    return false;
                }
                return gp6.this.h(d + 1).equals(entry.getValue());
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // gp6.c
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry c(int i) {
            return new AbstractMap.SimpleImmutableEntry(gp6.this.f(i), gp6.this.h(i + 1));
        }
    }

    final class b extends c {
        b() {
            super();
        }

        @Override // gp6.c
        Object c(int i) {
            return gp6.this.f(i);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return gp6.this.containsKey(obj);
        }
    }

    abstract class c implements Set {

        final class a implements Iterator {
            int a = 0;

            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.a < gp6.this.a.size();
            }

            @Override // java.util.Iterator
            public Object next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object c = c.this.c(this.a);
                this.a += 2;
                return c;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        c() {
        }

        Object[] a(Object[] objArr) {
            int i = 0;
            int i2 = 0;
            while (i < gp6.this.a.size()) {
                objArr[i2] = c(i);
                i += 2;
                i2++;
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        abstract Object c(int i);

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            if (collection == null) {
                return false;
            }
            if (collection.isEmpty()) {
                return true;
            }
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!contains(it2.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return gp6.this.b;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return a(new Object[gp6.this.b]);
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            if (objArr.length < gp6.this.b) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size());
            }
            return a(objArr);
        }
    }

    final class d extends c {
        d() {
            super();
        }

        @Override // gp6.c
        Object c(int i) {
            return gp6.this.h(i + 1);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return gp6.this.containsValue(obj);
        }
    }

    private gp6(List list) {
        this.a = list;
        this.b = list.size() / 2;
    }

    public static Map i(List list) {
        return list.isEmpty() ? Collections.emptyMap() : new gp6(list);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return (obj == null || d(obj) == -1) ? false : true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        for (int i = 0; i < this.a.size(); i += 2) {
            if (h(i + 1).equals(obj)) {
                return true;
            }
        }
        return false;
    }

    int d(Object obj) {
        for (int i = 0; i < this.a.size(); i += 2) {
            if (obj.equals(f(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return new a();
    }

    Object f(int i) {
        return this.a.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int d2;
        if (obj == null || (d2 = d(obj)) == -1) {
            return null;
        }
        return h(d2 + 1);
    }

    Object h(int i) {
        return this.a.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return new b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.b;
    }

    @Override // java.util.AbstractMap
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ReadOnlyArrayMap{");
        for (int i = 0; i < this.a.size(); i += 2) {
            sb.append(f(i));
            sb.append('=');
            sb.append(h(i + 1));
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        return new d();
    }
}
