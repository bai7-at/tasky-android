package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public class so extends hs7 implements Map {
    a d;
    c e;
    e f;

    final class a extends AbstractSet {
        a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return so.this.new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return so.this.size();
        }
    }

    final class b extends yi3 {
        b() {
            super(so.this.size());
        }

        @Override // defpackage.yi3
        protected Object c(int i) {
            return so.this.i(i);
        }

        @Override // defpackage.yi3
        protected void d(int i) {
            so.this.l(i);
        }
    }

    final class d implements Iterator, Map.Entry {
        int a;
        int b = -1;
        boolean c;

        d() {
            this.a = so.this.size() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.b++;
            this.c = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return rv0.c(entry.getKey(), so.this.i(this.b)) && rv0.c(entry.getValue(), so.this.n(this.b));
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.c) {
                return so.this.i(this.b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.c) {
                return so.this.n(this.b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b < this.a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object i = so.this.i(this.b);
            Object n = so.this.n(this.b);
            return (i == null ? 0 : i.hashCode()) ^ (n != null ? n.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.c) {
                throw new IllegalStateException();
            }
            so.this.l(this.b);
            this.b--;
            this.a--;
            this.c = false;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.c) {
                return so.this.m(this.b, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class f extends yi3 {
        f() {
            super(so.this.size());
        }

        @Override // defpackage.yi3
        protected Object c(int i) {
            return so.this.n(i);
        }

        @Override // defpackage.yi3
        protected void d(int i) {
            so.this.l(i);
        }
    }

    public so() {
    }

    static boolean q(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // defpackage.hs7, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // defpackage.hs7, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        this.d = aVar2;
        return aVar2;
    }

    @Override // defpackage.hs7, java.util.Map
    public Object get(Object obj) {
        return super.get(obj);
    }

    @Override // java.util.Map
    public Set keySet() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.e = cVar2;
        return cVar2;
    }

    public boolean o(Collection collection) {
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!containsKey(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        c(size() + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean r(Collection collection) {
        int size = size();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            remove(it2.next());
        }
        return size != size();
    }

    @Override // defpackage.hs7, java.util.Map
    public Object remove(Object obj) {
        return super.remove(obj);
    }

    public boolean s(Collection collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(i(size2))) {
                l(size2);
            }
        }
        return size != size();
    }

    @Override // java.util.Map
    public Collection values() {
        e eVar = this.f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        this.f = eVar2;
        return eVar2;
    }

    public so(int i) {
        super(i);
    }

    final class c implements Set {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            so.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return so.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return so.this.o(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return so.q(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int size = so.this.size() - 1; size >= 0; size--) {
                Object i2 = so.this.i(size);
                i += i2 == null ? 0 : i2.hashCode();
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return so.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return so.this.new b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int f = so.this.f(obj);
            if (f < 0) {
                return false;
            }
            so.this.l(f);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return so.this.r(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return so.this.s(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return so.this.size();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int size = so.this.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                objArr[i] = so.this.i(i);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i = 0; i < size; i++) {
                objArr[i] = so.this.i(i);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    final class e implements Collection {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            so.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return so.this.a(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!contains(it2.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return so.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return so.this.new f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int a = so.this.a(obj);
            if (a < 0) {
                return false;
            }
            so.this.l(a);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int size = so.this.size();
            int i = 0;
            boolean z = false;
            while (i < size) {
                if (collection.contains(so.this.n(i))) {
                    so.this.l(i);
                    i--;
                    size--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int size = so.this.size();
            int i = 0;
            boolean z = false;
            while (i < size) {
                if (!collection.contains(so.this.n(i))) {
                    so.this.l(i);
                    i--;
                    size--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return so.this.size();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int size = so.this.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                objArr[i] = so.this.n(i);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i = 0; i < size; i++) {
                objArr[i] = so.this.n(i);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    public so(hs7 hs7Var) {
        super(hs7Var);
    }
}
