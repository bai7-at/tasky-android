package com.squareup.moshi;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes4.dex */
final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Comparator a = new a();
    final Comparator<? super K> comparator;
    private LinkedHashTreeMap<K, V>.d entrySet;
    final g header;
    private LinkedHashTreeMap<K, V>.e keySet;
    int modCount;
    int size;
    g[] table;
    int threshold;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    static final class b {
        private g a;
        private int b;
        private int c;
        private int d;

        b() {
        }

        void a(g gVar) {
            gVar.c = null;
            gVar.a = null;
            gVar.b = null;
            gVar.i = 1;
            int i = this.b;
            if (i > 0) {
                int i2 = this.d;
                if ((i2 & 1) == 0) {
                    this.d = i2 + 1;
                    this.b = i - 1;
                    this.c++;
                }
            }
            gVar.a = this.a;
            this.a = gVar;
            int i3 = this.d;
            int i4 = i3 + 1;
            this.d = i4;
            int i5 = this.b;
            if (i5 > 0 && (i4 & 1) == 0) {
                this.d = i3 + 2;
                this.b = i5 - 1;
                this.c++;
            }
            int i6 = 4;
            while (true) {
                int i7 = i6 - 1;
                if ((this.d & i7) != i7) {
                    return;
                }
                int i8 = this.c;
                if (i8 == 0) {
                    g gVar2 = this.a;
                    g gVar3 = gVar2.a;
                    g gVar4 = gVar3.a;
                    gVar3.a = gVar4.a;
                    this.a = gVar3;
                    gVar3.b = gVar4;
                    gVar3.c = gVar2;
                    gVar3.i = gVar2.i + 1;
                    gVar4.a = gVar3;
                    gVar2.a = gVar3;
                } else if (i8 == 1) {
                    g gVar5 = this.a;
                    g gVar6 = gVar5.a;
                    this.a = gVar6;
                    gVar6.c = gVar5;
                    gVar6.i = gVar5.i + 1;
                    gVar5.a = gVar6;
                    this.c = 0;
                } else if (i8 == 2) {
                    this.c = 0;
                }
                i6 *= 2;
            }
        }

        void b(int i) {
            this.b = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.d = 0;
            this.c = 0;
            this.a = null;
        }

        g c() {
            g gVar = this.a;
            if (gVar.a == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    static class c {
        private g a;

        c() {
        }

        public g a() {
            g gVar = this.a;
            if (gVar == null) {
                return null;
            }
            g gVar2 = gVar.a;
            gVar.a = null;
            g gVar3 = gVar.c;
            while (true) {
                g gVar4 = gVar2;
                gVar2 = gVar3;
                if (gVar2 == null) {
                    this.a = gVar4;
                    return gVar;
                }
                gVar2.a = gVar4;
                gVar3 = gVar2.b;
            }
        }

        void b(g gVar) {
            g gVar2 = null;
            while (gVar != null) {
                gVar.a = gVar2;
                gVar2 = gVar;
                gVar = gVar.b;
            }
            this.a = gVar2;
        }
    }

    final class d extends AbstractSet {

        class a extends f {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                return b();
            }
        }

        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedHashTreeMap.this.h((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            g h;
            if (!(obj instanceof Map.Entry) || (h = LinkedHashTreeMap.this.h((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedHashTreeMap.this.l(h, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    final class e extends AbstractSet {

        class a extends f {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return b().f;
            }
        }

        e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedHashTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return LinkedHashTreeMap.this.m(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    abstract class f implements Iterator {
        g a;
        g b = null;
        int c;

        f() {
            this.a = LinkedHashTreeMap.this.header.d;
            this.c = LinkedHashTreeMap.this.modCount;
        }

        final g b() {
            g gVar = this.a;
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            if (gVar == linkedHashTreeMap.header) {
                throw new NoSuchElementException();
            }
            if (linkedHashTreeMap.modCount != this.c) {
                throw new ConcurrentModificationException();
            }
            this.a = gVar.d;
            this.b = gVar;
            return gVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a != LinkedHashTreeMap.this.header;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g gVar = this.b;
            if (gVar == null) {
                throw new IllegalStateException();
            }
            LinkedHashTreeMap.this.l(gVar, true);
            this.b = null;
            this.c = LinkedHashTreeMap.this.modCount;
        }
    }

    LinkedHashTreeMap() {
        this(null);
    }

    private void a() {
        g[] c2 = c(this.table);
        this.table = c2;
        this.threshold = (c2.length / 2) + (c2.length / 4);
    }

    static g[] c(g[] gVarArr) {
        int length = gVarArr.length;
        g[] gVarArr2 = new g[length * 2];
        c cVar = new c();
        b bVar = new b();
        b bVar2 = new b();
        for (int i = 0; i < length; i++) {
            g gVar = gVarArr[i];
            if (gVar != null) {
                cVar.b(gVar);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    g a2 = cVar.a();
                    if (a2 == null) {
                        break;
                    }
                    if ((a2.g & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                bVar.b(i2);
                bVar2.b(i3);
                cVar.b(gVar);
                while (true) {
                    g a3 = cVar.a();
                    if (a3 == null) {
                        break;
                    }
                    if ((a3.g & length) == 0) {
                        bVar.a(a3);
                    } else {
                        bVar2.a(a3);
                    }
                }
                gVarArr2[i] = i2 > 0 ? bVar.c() : null;
                gVarArr2[i + length] = i3 > 0 ? bVar2.c() : null;
            }
        }
        return gVarArr2;
    }

    private boolean d(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void j(g gVar, boolean z) {
        while (gVar != null) {
            g gVar2 = gVar.b;
            g gVar3 = gVar.c;
            int i = gVar2 != null ? gVar2.i : 0;
            int i2 = gVar3 != null ? gVar3.i : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                g gVar4 = gVar3.b;
                g gVar5 = gVar3.c;
                int i4 = (gVar4 != null ? gVar4.i : 0) - (gVar5 != null ? gVar5.i : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    q(gVar3);
                }
                o(gVar);
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                g gVar6 = gVar2.b;
                g gVar7 = gVar2.c;
                int i5 = (gVar6 != null ? gVar6.i : 0) - (gVar7 != null ? gVar7.i : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    o(gVar2);
                }
                q(gVar);
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                gVar.i = i + 1;
                if (z) {
                    return;
                }
            } else {
                gVar.i = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            gVar = gVar.a;
        }
    }

    private void n(g gVar, g gVar2) {
        g gVar3 = gVar.a;
        gVar.a = null;
        if (gVar2 != null) {
            gVar2.a = gVar3;
        }
        if (gVar3 == null) {
            int i = gVar.g;
            this.table[i & (r2.length - 1)] = gVar2;
        } else if (gVar3.b == gVar) {
            gVar3.b = gVar2;
        } else {
            gVar3.c = gVar2;
        }
    }

    private void o(g gVar) {
        g gVar2 = gVar.b;
        g gVar3 = gVar.c;
        g gVar4 = gVar3.b;
        g gVar5 = gVar3.c;
        gVar.c = gVar4;
        if (gVar4 != null) {
            gVar4.a = gVar;
        }
        n(gVar, gVar3);
        gVar3.b = gVar;
        gVar.a = gVar3;
        int max = Math.max(gVar2 != null ? gVar2.i : 0, gVar4 != null ? gVar4.i : 0) + 1;
        gVar.i = max;
        gVar3.i = Math.max(max, gVar5 != null ? gVar5.i : 0) + 1;
    }

    private void q(g gVar) {
        g gVar2 = gVar.b;
        g gVar3 = gVar.c;
        g gVar4 = gVar2.b;
        g gVar5 = gVar2.c;
        gVar.b = gVar5;
        if (gVar5 != null) {
            gVar5.a = gVar;
        }
        n(gVar, gVar2);
        gVar2.c = gVar;
        gVar.a = gVar2;
        int max = Math.max(gVar3 != null ? gVar3.i : 0, gVar5 != null ? gVar5.i : 0) + 1;
        gVar.i = max;
        gVar2.i = Math.max(max, gVar4 != null ? gVar4.i : 0) + 1;
    }

    private static int r(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.table, (Object) null);
        this.size = 0;
        this.modCount++;
        g gVar = this.header;
        g gVar2 = gVar.d;
        while (gVar2 != gVar) {
            g gVar3 = gVar2.d;
            gVar2.e = null;
            gVar2.d = null;
            gVar2 = gVar3;
        }
        gVar.e = gVar;
        gVar.d = gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return i(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        LinkedHashTreeMap<K, V>.d dVar = this.entrySet;
        if (dVar != null) {
            return dVar;
        }
        LinkedHashTreeMap<K, V>.d dVar2 = new d();
        this.entrySet = dVar2;
        return dVar2;
    }

    g f(Object obj, boolean z) {
        int i;
        g gVar;
        Comparator<? super K> comparator = this.comparator;
        g[] gVarArr = this.table;
        int r = r(obj.hashCode());
        int length = (gVarArr.length - 1) & r;
        g gVar2 = gVarArr[length];
        if (gVar2 != null) {
            Comparable comparable = comparator == a ? (Comparable) obj : null;
            while (true) {
                i = comparable != null ? comparable.compareTo(gVar2.f) : comparator.compare(obj, (Object) gVar2.f);
                if (i == 0) {
                    return gVar2;
                }
                g gVar3 = i < 0 ? gVar2.b : gVar2.c;
                if (gVar3 == null) {
                    break;
                }
                gVar2 = gVar3;
            }
        } else {
            i = 0;
        }
        g gVar4 = gVar2;
        int i2 = i;
        if (!z) {
            return null;
        }
        g gVar5 = this.header;
        if (gVar4 != null) {
            gVar = new g(gVar4, obj, r, gVar5, gVar5.e);
            if (i2 < 0) {
                gVar4.b = gVar;
            } else {
                gVar4.c = gVar;
            }
            j(gVar4, true);
        } else {
            if (comparator == a && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
            }
            gVar = new g(gVar4, obj, r, gVar5, gVar5.e);
            gVarArr[length] = gVar;
        }
        int i3 = this.size;
        this.size = i3 + 1;
        if (i3 > this.threshold) {
            a();
        }
        this.modCount++;
        return gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        g i = i(obj);
        if (i != null) {
            return i.h;
        }
        return null;
    }

    g h(Map.Entry entry) {
        g i = i(entry.getKey());
        if (i == null || !d(i.h, entry.getValue())) {
            return null;
        }
        return i;
    }

    g i(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return f(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        LinkedHashTreeMap<K, V>.e eVar = this.keySet;
        if (eVar != null) {
            return eVar;
        }
        LinkedHashTreeMap<K, V>.e eVar2 = new e();
        this.keySet = eVar2;
        return eVar2;
    }

    void l(g gVar, boolean z) {
        int i;
        if (z) {
            g gVar2 = gVar.e;
            gVar2.d = gVar.d;
            gVar.d.e = gVar2;
            gVar.e = null;
            gVar.d = null;
        }
        g gVar3 = gVar.b;
        g gVar4 = gVar.c;
        g gVar5 = gVar.a;
        int i2 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                n(gVar, gVar3);
                gVar.b = null;
            } else if (gVar4 != null) {
                n(gVar, gVar4);
                gVar.c = null;
            } else {
                n(gVar, null);
            }
            j(gVar5, false);
            this.size--;
            this.modCount++;
            return;
        }
        g b2 = gVar3.i > gVar4.i ? gVar3.b() : gVar4.a();
        l(b2, false);
        g gVar6 = gVar.b;
        if (gVar6 != null) {
            i = gVar6.i;
            b2.b = gVar6;
            gVar6.a = b2;
            gVar.b = null;
        } else {
            i = 0;
        }
        g gVar7 = gVar.c;
        if (gVar7 != null) {
            i2 = gVar7.i;
            b2.c = gVar7;
            gVar7.a = b2;
            gVar.c = null;
        }
        b2.i = Math.max(i, i2) + 1;
        n(gVar, b2);
    }

    g m(Object obj) {
        g i = i(obj);
        if (i != null) {
            l(i, true);
        }
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        g f2 = f(obj, true);
        Object obj3 = f2.h;
        f2.h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        g m = m(obj);
        if (m != null) {
            return m.h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    LinkedHashTreeMap(Comparator comparator) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator == null ? a : comparator;
        this.header = new g();
        g[] gVarArr = new g[16];
        this.table = gVarArr;
        this.threshold = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    static final class g implements Map.Entry {
        g a;
        g b;
        g c;
        g d;
        g e;
        final Object f;
        final int g;
        Object h;
        int i;

        g() {
            this.f = null;
            this.g = -1;
            this.e = this;
            this.d = this;
        }

        public g a() {
            g gVar = this.b;
            while (true) {
                g gVar2 = gVar;
                g gVar3 = this;
                this = gVar2;
                if (this == null) {
                    return gVar3;
                }
                gVar = this.b;
            }
        }

        public g b() {
            g gVar = this.c;
            while (true) {
                g gVar2 = gVar;
                g gVar3 = this;
                this = gVar2;
                if (this == null) {
                    return gVar3;
                }
                gVar = this.c;
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f;
            if (obj2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!obj2.equals(entry.getKey())) {
                return false;
            }
            Object obj3 = this.h;
            if (obj3 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!obj3.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f;
            int hashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.h;
            return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object obj2 = this.h;
            this.h = obj;
            return obj2;
        }

        public String toString() {
            return this.f + "=" + this.h;
        }

        g(g gVar, Object obj, int i, g gVar2, g gVar3) {
            this.a = gVar;
            this.f = obj;
            this.g = i;
            this.i = 1;
            this.d = gVar2;
            this.e = gVar3;
            gVar3.d = this;
            gVar2.e = this;
        }
    }
}
