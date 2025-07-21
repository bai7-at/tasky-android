package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import defpackage.gx8;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;

/* loaded from: classes3.dex */
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    static final Map.Entry[] d = new Map.Entry[0];
    private transient ImmutableSet a;
    private transient ImmutableSet b;
    private transient ImmutableCollection c;

    static class SerializedForm<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Object keys;
        private final Object values;

        SerializedForm(ImmutableMap immutableMap) {
            Object[] objArr = new Object[immutableMap.size()];
            Object[] objArr2 = new Object[immutableMap.size()];
            gx8 it2 = immutableMap.entrySet().iterator();
            int i = 0;
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                objArr[i] = entry.getKey();
                objArr2[i] = entry.getValue();
                i++;
            }
            this.keys = objArr;
            this.values = objArr2;
        }

        final Object a() {
            Object[] objArr = (Object[]) this.keys;
            Object[] objArr2 = (Object[]) this.values;
            a b = b(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                b.f(objArr[i], objArr2[i]);
            }
            return b.c();
        }

        a b(int i) {
            return new a(i);
        }

        final Object readResolve() {
            Object obj = this.keys;
            if (!(obj instanceof ImmutableSet)) {
                return a();
            }
            ImmutableSet immutableSet = (ImmutableSet) obj;
            ImmutableCollection immutableCollection = (ImmutableCollection) this.values;
            a b = b(immutableSet.size());
            gx8 it2 = immutableSet.iterator();
            gx8 it3 = immutableCollection.iterator();
            while (it2.hasNext()) {
                b.f(it2.next(), it3.next());
            }
            return b.c();
        }
    }

    public static class a {
        Comparator a;
        Object[] b;
        int c;
        boolean d;
        C0209a e;

        /* renamed from: com.google.common.collect.ImmutableMap$a$a, reason: collision with other inner class name */
        static final class C0209a {
            private final Object a;
            private final Object b;
            private final Object c;

            C0209a(Object obj, Object obj2, Object obj3) {
                this.a = obj;
                this.b = obj2;
                this.c = obj3;
            }

            IllegalArgumentException a() {
                String valueOf = String.valueOf(this.a);
                String valueOf2 = String.valueOf(this.b);
                String valueOf3 = String.valueOf(this.a);
                String valueOf4 = String.valueOf(this.c);
                StringBuilder sb = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
                sb.append("Multiple entries with same key: ");
                sb.append(valueOf);
                sb.append("=");
                sb.append(valueOf2);
                sb.append(" and ");
                sb.append(valueOf3);
                sb.append("=");
                sb.append(valueOf4);
                return new IllegalArgumentException(sb.toString());
            }
        }

        public a() {
            this(4);
        }

        private ImmutableMap b(boolean z) {
            Object[] objArr;
            C0209a c0209a;
            C0209a c0209a2;
            if (z && (c0209a2 = this.e) != null) {
                throw c0209a2.a();
            }
            int i = this.c;
            if (this.a == null) {
                objArr = this.b;
            } else {
                if (this.d) {
                    this.b = Arrays.copyOf(this.b, i * 2);
                }
                objArr = this.b;
                if (!z) {
                    objArr = e(objArr, this.c);
                    if (objArr.length < this.b.length) {
                        i = objArr.length >>> 1;
                    }
                }
                i(objArr, i, this.a);
            }
            this.d = true;
            RegularImmutableMap v = RegularImmutableMap.v(i, objArr, this);
            if (!z || (c0209a = this.e) == null) {
                return v;
            }
            throw c0209a.a();
        }

        private void d(int i) {
            int i2 = i * 2;
            Object[] objArr = this.b;
            if (i2 > objArr.length) {
                this.b = Arrays.copyOf(objArr, ImmutableCollection.b.c(objArr.length, i2));
                this.d = false;
            }
        }

        private Object[] e(Object[] objArr, int i) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                Object obj = objArr[i2 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i2);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i - bitSet.cardinality()) * 2];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i * 2) {
                if (bitSet.get(i3 >>> 1)) {
                    i3 += 2;
                } else {
                    int i5 = i4 + 1;
                    int i6 = i3 + 1;
                    Object obj2 = objArr[i3];
                    Objects.requireNonNull(obj2);
                    objArr2[i4] = obj2;
                    i4 += 2;
                    i3 += 2;
                    Object obj3 = objArr[i6];
                    Objects.requireNonNull(obj3);
                    objArr2[i5] = obj3;
                }
            }
            return objArr2;
        }

        static void i(Object[] objArr, int i, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i];
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 2;
                Object obj = objArr[i3];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i3 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i2] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i, o.a(comparator).e(Maps.l()));
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = i4 * 2;
                objArr[i5] = entryArr[i4].getKey();
                objArr[i5 + 1] = entryArr[i4].getValue();
            }
        }

        public ImmutableMap a() {
            return c();
        }

        public ImmutableMap c() {
            return b(true);
        }

        public a f(Object obj, Object obj2) {
            d(this.c + 1);
            e.a(obj, obj2);
            Object[] objArr = this.b;
            int i = this.c;
            objArr[i * 2] = obj;
            objArr[(i * 2) + 1] = obj2;
            this.c = i + 1;
            return this;
        }

        public a g(Map.Entry entry) {
            return f(entry.getKey(), entry.getValue());
        }

        public a h(Iterable iterable) {
            if (iterable instanceof Collection) {
                d(this.c + ((Collection) iterable).size());
            }
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                g((Map.Entry) it2.next());
            }
            return this;
        }

        a(int i) {
            this.b = new Object[i * 2];
            this.c = 0;
            this.d = false;
        }
    }

    ImmutableMap() {
    }

    public static a a() {
        return new a();
    }

    public static a c(int i) {
        e.b(i, "expectedSize");
        return new a(i);
    }

    public static ImmutableMap d(Iterable iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.h(iterable);
        return aVar.a();
    }

    public static ImmutableMap f(Map map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap immutableMap = (ImmutableMap) map;
            if (!immutableMap.m()) {
                return immutableMap;
            }
        }
        return d(map.entrySet());
    }

    public static ImmutableMap o() {
        return RegularImmutableMap.h;
    }

    public static ImmutableMap q(Object obj, Object obj2) {
        e.a(obj, obj2);
        return RegularImmutableMap.u(1, new Object[]{obj, obj2});
    }

    public static ImmutableMap r(Object obj, Object obj2, Object obj3, Object obj4) {
        e.a(obj, obj2);
        e.a(obj3, obj4);
        return RegularImmutableMap.u(2, new Object[]{obj, obj2, obj3, obj4});
    }

    public static ImmutableMap s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        e.a(obj, obj2);
        e.a(obj3, obj4);
        e.a(obj5, obj6);
        e.a(obj7, obj8);
        return RegularImmutableMap.u(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return Maps.c(this, obj);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    abstract ImmutableSet h();

    @Override // java.util.Map
    public int hashCode() {
        return s.d(entrySet());
    }

    abstract ImmutableSet i();

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    abstract ImmutableCollection j();

    @Override // java.util.Map
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public ImmutableSet entrySet() {
        ImmutableSet immutableSet = this.a;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet h = h();
        this.a = h;
        return h;
    }

    abstract boolean m();

    @Override // java.util.Map
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public ImmutableSet keySet() {
        ImmutableSet immutableSet = this.b;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet i = i();
        this.b = i;
        return i;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection values() {
        ImmutableCollection immutableCollection = this.c;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection j = j();
        this.c = j;
        return j;
    }

    public String toString() {
        return Maps.k(this);
    }

    Object writeReplace() {
        return new SerializedForm(this);
    }
}
