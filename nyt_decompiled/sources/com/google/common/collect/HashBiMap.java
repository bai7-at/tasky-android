package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import defpackage.b16;
import defpackage.c80;
import defpackage.hc5;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes3.dex */
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements c80, Serializable {
    transient Object[] a;
    transient Object[] b;
    transient int c;
    transient int d;
    private transient int[] e;
    private transient int[] f;
    private transient int[] g;
    private transient int[] h;
    private transient int i;
    private transient int j;
    private transient int[] k;
    private transient int[] l;
    private transient Set m;
    private transient Set n;
    private transient Set r;
    private transient c80 s;

    static class Inverse<K, V> extends AbstractMap<V, K> implements c80, Serializable {
        private transient Set a;
        private final HashBiMap<K, V> forward;

        Inverse(HashBiMap hashBiMap) {
            this.forward = hashBiMap;
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            ((HashBiMap) this.forward).s = this;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Set values() {
            return this.forward.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.forward.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.forward.containsValue(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(Object obj) {
            return this.forward.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            Set set = this.a;
            if (set != null) {
                return set;
            }
            d dVar = new d(this.forward);
            this.a = dVar;
            return dVar;
        }

        @Override // defpackage.c80
        public Object g(Object obj, Object obj2) {
            return this.forward.D(obj, obj2, true);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            return this.forward.x(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set keySet() {
            return this.forward.values();
        }

        @Override // defpackage.c80
        public c80 p() {
            return this.forward;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object put(Object obj, Object obj2) {
            return this.forward.D(obj, obj2, false);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object remove(Object obj) {
            return this.forward.I(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.forward.c;
        }
    }

    final class a extends com.google.common.collect.b {
        final Object a;
        int b;

        a(int i) {
            this.a = m.a(HashBiMap.this.a[i]);
            this.b = i;
        }

        void a() {
            int i = this.b;
            if (i != -1) {
                HashBiMap hashBiMap = HashBiMap.this;
                if (i <= hashBiMap.c && hc5.a(hashBiMap.a[i], this.a)) {
                    return;
                }
            }
            this.b = HashBiMap.this.t(this.a);
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public Object getKey() {
            return this.a;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public Object getValue() {
            a();
            int i = this.b;
            return i == -1 ? m.b() : m.a(HashBiMap.this.b[i]);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            a();
            int i = this.b;
            if (i == -1) {
                HashBiMap.this.put(this.a, obj);
                return m.b();
            }
            Object a = m.a(HashBiMap.this.b[i]);
            if (hc5.a(a, obj)) {
                return obj;
            }
            HashBiMap.this.K(this.b, obj, false);
            return a;
        }
    }

    static final class b extends com.google.common.collect.b {
        final HashBiMap a;
        final Object b;
        int c;

        b(HashBiMap hashBiMap, int i) {
            this.a = hashBiMap;
            this.b = m.a(hashBiMap.b[i]);
            this.c = i;
        }

        private void a() {
            int i = this.c;
            if (i != -1) {
                HashBiMap hashBiMap = this.a;
                if (i <= hashBiMap.c && hc5.a(this.b, hashBiMap.b[i])) {
                    return;
                }
            }
            this.c = this.a.v(this.b);
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public Object getKey() {
            return this.b;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public Object getValue() {
            a();
            int i = this.c;
            return i == -1 ? m.b() : m.a(this.a.a[i]);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            a();
            int i = this.c;
            if (i == -1) {
                this.a.D(this.b, obj, false);
                return m.b();
            }
            Object a = m.a(this.a.a[i]);
            if (hc5.a(a, obj)) {
                return obj;
            }
            this.a.J(this.c, obj, false);
            return a;
        }
    }

    final class c extends g {
        c() {
            super(HashBiMap.this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.HashBiMap.g
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry a(int i) {
            return new a(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int t = HashBiMap.this.t(key);
            return t != -1 && hc5.a(value, HashBiMap.this.b[t]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int c = i.c(key);
            int u = HashBiMap.this.u(key, c);
            if (u == -1 || !hc5.a(value, HashBiMap.this.b[u])) {
                return false;
            }
            HashBiMap.this.G(u, c);
            return true;
        }
    }

    static class d extends g {
        d(HashBiMap hashBiMap) {
            super(hashBiMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.HashBiMap.g
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry a(int i) {
            return new b(this.a, i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int v = this.a.v(key);
            return v != -1 && hc5.a(this.a.a[v], value);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int c = i.c(key);
            int w = this.a.w(key, c);
            if (w == -1 || !hc5.a(this.a.a[w], value)) {
                return false;
            }
            this.a.H(w, c);
            return true;
        }
    }

    final class e extends g {
        e() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.g
        Object a(int i) {
            return m.a(HashBiMap.this.a[i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return HashBiMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int c = i.c(obj);
            int u = HashBiMap.this.u(obj, c);
            if (u == -1) {
                return false;
            }
            HashBiMap.this.G(u, c);
            return true;
        }
    }

    final class f extends g {
        f() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.g
        Object a(int i) {
            return m.a(HashBiMap.this.b[i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return HashBiMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int c = i.c(obj);
            int w = HashBiMap.this.w(obj, c);
            if (w == -1) {
                return false;
            }
            HashBiMap.this.H(w, c);
            return true;
        }
    }

    static abstract class g extends AbstractSet {
        final HashBiMap a;

        class a implements Iterator {
            private int a;
            private int b = -1;
            private int c;
            private int d;

            a() {
                this.a = g.this.a.i;
                HashBiMap hashBiMap = g.this.a;
                this.c = hashBiMap.d;
                this.d = hashBiMap.c;
            }

            private void b() {
                if (g.this.a.d != this.c) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.a != -2 && this.d > 0;
            }

            @Override // java.util.Iterator
            public Object next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object a = g.this.a(this.a);
                this.b = this.a;
                this.a = g.this.a.l[this.a];
                this.d--;
                return a;
            }

            @Override // java.util.Iterator
            public void remove() {
                b();
                com.google.common.collect.e.c(this.b != -1);
                g.this.a.E(this.b);
                int i = this.a;
                HashBiMap hashBiMap = g.this.a;
                if (i == hashBiMap.c) {
                    this.a = this.b;
                }
                this.b = -1;
                this.c = hashBiMap.d;
            }
        }

        g(HashBiMap hashBiMap) {
            this.a = hashBiMap;
        }

        abstract Object a(int i);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.a.c;
        }
    }

    private HashBiMap(int i) {
        y(i);
    }

    private void A(int i, int i2) {
        b16.d(i != -1);
        int i3 = i(i2);
        int[] iArr = this.h;
        int[] iArr2 = this.f;
        iArr[i] = iArr2[i3];
        iArr2[i3] = i;
    }

    private void B(int i, int i2) {
        int i3;
        int i4;
        if (i == i2) {
            return;
        }
        int i5 = this.k[i];
        int i6 = this.l[i];
        L(i5, i2);
        L(i2, i6);
        Object[] objArr = this.a;
        Object obj = objArr[i];
        Object[] objArr2 = this.b;
        Object obj2 = objArr2[i];
        objArr[i2] = obj;
        objArr2[i2] = obj2;
        int i7 = i(i.c(obj));
        int[] iArr = this.e;
        int i8 = iArr[i7];
        if (i8 == i) {
            iArr[i7] = i2;
        } else {
            int i9 = this.g[i8];
            while (true) {
                i3 = i8;
                i8 = i9;
                if (i8 == i) {
                    break;
                } else {
                    i9 = this.g[i8];
                }
            }
            this.g[i3] = i2;
        }
        int[] iArr2 = this.g;
        iArr2[i2] = iArr2[i];
        iArr2[i] = -1;
        int i10 = i(i.c(obj2));
        int[] iArr3 = this.f;
        int i11 = iArr3[i10];
        if (i11 == i) {
            iArr3[i10] = i2;
        } else {
            int i12 = this.h[i11];
            while (true) {
                i4 = i11;
                i11 = i12;
                if (i11 == i) {
                    break;
                } else {
                    i12 = this.h[i11];
                }
            }
            this.h[i4] = i2;
        }
        int[] iArr4 = this.h;
        iArr4[i2] = iArr4[i];
        iArr4[i] = -1;
    }

    private void F(int i, int i2, int i3) {
        b16.d(i != -1);
        n(i, i2);
        o(i, i3);
        L(this.k[i], this.l[i]);
        B(this.c - 1, i);
        Object[] objArr = this.a;
        int i4 = this.c;
        objArr[i4 - 1] = null;
        this.b[i4 - 1] = null;
        this.c = i4 - 1;
        this.d++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(int i, Object obj, boolean z) {
        int i2;
        b16.d(i != -1);
        int c2 = i.c(obj);
        int u = u(obj, c2);
        int i3 = this.j;
        if (u == -1) {
            i2 = -2;
        } else {
            if (!z) {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(valueOf.length() + 28);
                sb.append("Key already present in map: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            i3 = this.k[u];
            i2 = this.l[u];
            G(u, c2);
            if (i == this.c) {
                i = u;
            }
        }
        if (i3 == i) {
            i3 = this.k[i];
        } else if (i3 == this.c) {
            i3 = u;
        }
        if (i2 == i) {
            u = this.l[i];
        } else if (i2 != this.c) {
            u = i2;
        }
        L(this.k[i], this.l[i]);
        n(i, i.c(this.a[i]));
        this.a[i] = obj;
        z(i, i.c(obj));
        L(i3, i);
        L(i, u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(int i, Object obj, boolean z) {
        b16.d(i != -1);
        int c2 = i.c(obj);
        int w = w(obj, c2);
        if (w != -1) {
            if (!z) {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(valueOf.length() + 30);
                sb.append("Value already present in map: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            H(w, c2);
            if (i == this.c) {
                i = w;
            }
        }
        o(i, i.c(this.b[i]));
        this.b[i] = obj;
        A(i, c2);
    }

    private void L(int i, int i2) {
        if (i == -2) {
            this.i = i2;
        } else {
            this.l[i] = i2;
        }
        if (i2 == -2) {
            this.j = i;
        } else {
            this.k[i2] = i;
        }
    }

    private int i(int i) {
        return (this.e.length - 1) & i;
    }

    public static HashBiMap j() {
        return l(16);
    }

    public static HashBiMap l(int i) {
        return new HashBiMap(i);
    }

    private static int[] m(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void n(int i, int i2) {
        b16.d(i != -1);
        int i3 = i(i2);
        int[] iArr = this.e;
        int i4 = iArr[i3];
        if (i4 == i) {
            int[] iArr2 = this.g;
            iArr[i3] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i5 = this.g[i4];
        while (true) {
            int i6 = i4;
            i4 = i5;
            if (i4 == -1) {
                String valueOf = String.valueOf(this.a[i]);
                StringBuilder sb = new StringBuilder(valueOf.length() + 32);
                sb.append("Expected to find entry with key ");
                sb.append(valueOf);
                throw new AssertionError(sb.toString());
            }
            if (i4 == i) {
                int[] iArr3 = this.g;
                iArr3[i6] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i5 = this.g[i4];
        }
    }

    private void o(int i, int i2) {
        b16.d(i != -1);
        int i3 = i(i2);
        int[] iArr = this.f;
        int i4 = iArr[i3];
        if (i4 == i) {
            int[] iArr2 = this.h;
            iArr[i3] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i5 = this.h[i4];
        while (true) {
            int i6 = i4;
            i4 = i5;
            if (i4 == -1) {
                String valueOf = String.valueOf(this.b[i]);
                StringBuilder sb = new StringBuilder(valueOf.length() + 34);
                sb.append("Expected to find entry with value ");
                sb.append(valueOf);
                throw new AssertionError(sb.toString());
            }
            if (i4 == i) {
                int[] iArr3 = this.h;
                iArr3[i6] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i5 = this.h[i4];
        }
    }

    private void q(int i) {
        int[] iArr = this.g;
        if (iArr.length < i) {
            int c2 = ImmutableCollection.b.c(iArr.length, i);
            this.a = Arrays.copyOf(this.a, c2);
            this.b = Arrays.copyOf(this.b, c2);
            this.g = r(this.g, c2);
            this.h = r(this.h, c2);
            this.k = r(this.k, c2);
            this.l = r(this.l, c2);
        }
        if (this.e.length < i) {
            int a2 = i.a(i, 1.0d);
            this.e = m(a2);
            this.f = m(a2);
            for (int i2 = 0; i2 < this.c; i2++) {
                int i3 = i(i.c(this.a[i2]));
                int[] iArr2 = this.g;
                int[] iArr3 = this.e;
                iArr2[i2] = iArr3[i3];
                iArr3[i3] = i2;
                int i4 = i(i.c(this.b[i2]));
                int[] iArr4 = this.h;
                int[] iArr5 = this.f;
                iArr4[i2] = iArr5[i4];
                iArr5[i4] = i2;
            }
        }
    }

    private static int[] r(int[] iArr, int i) {
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, i);
        Arrays.fill(copyOf, length, i, -1);
        return copyOf;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int c2 = q.c(objectInputStream);
        y(16);
        q.b(this, objectInputStream, c2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        q.d(this, objectOutputStream);
    }

    private void z(int i, int i2) {
        b16.d(i != -1);
        int i3 = i(i2);
        int[] iArr = this.g;
        int[] iArr2 = this.e;
        iArr[i] = iArr2[i3];
        iArr2[i3] = i;
    }

    Object C(Object obj, Object obj2, boolean z) {
        int c2 = i.c(obj);
        int u = u(obj, c2);
        if (u != -1) {
            Object obj3 = this.b[u];
            if (hc5.a(obj3, obj2)) {
                return obj2;
            }
            K(u, obj2, z);
            return obj3;
        }
        int c3 = i.c(obj2);
        int w = w(obj2, c3);
        if (!z) {
            b16.h(w == -1, "Value already present: %s", obj2);
        } else if (w != -1) {
            H(w, c3);
        }
        q(this.c + 1);
        Object[] objArr = this.a;
        int i = this.c;
        objArr[i] = obj;
        this.b[i] = obj2;
        z(i, c2);
        A(this.c, c3);
        L(this.j, this.c);
        L(this.c, -2);
        this.c++;
        this.d++;
        return null;
    }

    Object D(Object obj, Object obj2, boolean z) {
        int c2 = i.c(obj);
        int w = w(obj, c2);
        if (w != -1) {
            Object obj3 = this.a[w];
            if (hc5.a(obj3, obj2)) {
                return obj2;
            }
            J(w, obj2, z);
            return obj3;
        }
        int i = this.j;
        int c3 = i.c(obj2);
        int u = u(obj2, c3);
        if (!z) {
            b16.h(u == -1, "Key already present: %s", obj2);
        } else if (u != -1) {
            i = this.k[u];
            G(u, c3);
        }
        q(this.c + 1);
        Object[] objArr = this.a;
        int i2 = this.c;
        objArr[i2] = obj2;
        this.b[i2] = obj;
        z(i2, c3);
        A(this.c, c2);
        int i3 = i == -2 ? this.i : this.l[i];
        L(i, this.c);
        L(this.c, i3);
        this.c++;
        this.d++;
        return null;
    }

    void E(int i) {
        G(i, i.c(this.a[i]));
    }

    void G(int i, int i2) {
        F(i, i2, i.c(this.b[i]));
    }

    void H(int i, int i2) {
        F(i, i.c(this.a[i]), i2);
    }

    Object I(Object obj) {
        int c2 = i.c(obj);
        int w = w(obj, c2);
        if (w == -1) {
            return null;
        }
        Object obj2 = this.a[w];
        H(w, c2);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public Set values() {
        Set set = this.n;
        if (set != null) {
            return set;
        }
        f fVar = new f();
        this.n = fVar;
        return fVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.a, 0, this.c, (Object) null);
        Arrays.fill(this.b, 0, this.c, (Object) null);
        Arrays.fill(this.e, -1);
        Arrays.fill(this.f, -1);
        Arrays.fill(this.g, 0, this.c, -1);
        Arrays.fill(this.h, 0, this.c, -1);
        Arrays.fill(this.k, 0, this.c, -1);
        Arrays.fill(this.l, 0, this.c, -1);
        this.c = 0;
        this.i = -2;
        this.j = -2;
        this.d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return t(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        return v(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.r;
        if (set != null) {
            return set;
        }
        c cVar = new c();
        this.r = cVar;
        return cVar;
    }

    @Override // defpackage.c80
    public Object g(Object obj, Object obj2) {
        return C(obj, obj2, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int t = t(obj);
        if (t == -1) {
            return null;
        }
        return this.b[t];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.m;
        if (set != null) {
            return set;
        }
        e eVar = new e();
        this.m = eVar;
        return eVar;
    }

    @Override // defpackage.c80
    public c80 p() {
        c80 c80Var = this.s;
        if (c80Var != null) {
            return c80Var;
        }
        Inverse inverse = new Inverse(this);
        this.s = inverse;
        return inverse;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        return C(obj, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        int c2 = i.c(obj);
        int u = u(obj, c2);
        if (u == -1) {
            return null;
        }
        Object obj2 = this.b[u];
        G(u, c2);
        return obj2;
    }

    int s(Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[i(i)];
        while (i2 != -1) {
            if (hc5.a(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.c;
    }

    int t(Object obj) {
        return u(obj, i.c(obj));
    }

    int u(Object obj, int i) {
        return s(obj, i, this.e, this.g, this.a);
    }

    int v(Object obj) {
        return w(obj, i.c(obj));
    }

    int w(Object obj, int i) {
        return s(obj, i, this.f, this.h, this.b);
    }

    Object x(Object obj) {
        int v = v(obj);
        if (v == -1) {
            return null;
        }
        return this.a[v];
    }

    void y(int i) {
        com.google.common.collect.e.b(i, "expectedSize");
        int a2 = i.a(i, 1.0d);
        this.c = 0;
        this.a = new Object[i];
        this.b = new Object[i];
        this.e = m(a2);
        this.f = m(a2);
        this.g = m(i);
        this.h = m(i);
        this.i = -2;
        this.j = -2;
        this.k = m(i);
        this.l = m(i);
    }
}
