package com.google.common.collect;

import com.google.common.primitives.Ints;
import defpackage.b16;
import defpackage.hc5;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes3.dex */
class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Object j = new Object();
    private transient Object a;
    transient int[] b;
    transient Object[] c;
    transient Object[] d;
    private transient int e;
    private transient int f;
    private transient Set g;
    private transient Set h;
    private transient Collection i;

    class a extends e {
        a() {
            super(CompactHashMap.this, null);
        }

        @Override // com.google.common.collect.CompactHashMap.e
        Object c(int i) {
            return CompactHashMap.this.M(i);
        }
    }

    class b extends e {
        b() {
            super(CompactHashMap.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.CompactHashMap.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry c(int i) {
            return new g(i);
        }
    }

    class c extends e {
        c() {
            super(CompactHashMap.this, null);
        }

        @Override // com.google.common.collect.CompactHashMap.e
        Object c(int i) {
            return CompactHashMap.this.c0(i);
        }
    }

    class d extends AbstractSet {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map C = CompactHashMap.this.C();
            if (C != null) {
                return C.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int J = CompactHashMap.this.J(entry.getKey());
            return J != -1 && hc5.a(CompactHashMap.this.c0(J), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return CompactHashMap.this.E();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map C = CompactHashMap.this.C();
            if (C != null) {
                return C.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (CompactHashMap.this.P()) {
                return false;
            }
            int H = CompactHashMap.this.H();
            int f = com.google.common.collect.g.f(entry.getKey(), entry.getValue(), H, CompactHashMap.this.T(), CompactHashMap.this.R(), CompactHashMap.this.S(), CompactHashMap.this.U());
            if (f == -1) {
                return false;
            }
            CompactHashMap.this.O(f, H);
            CompactHashMap.h(CompactHashMap.this);
            CompactHashMap.this.I();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    class f extends AbstractSet {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return CompactHashMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return CompactHashMap.this.N();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map C = CompactHashMap.this.C();
            return C != null ? C.keySet().remove(obj) : CompactHashMap.this.Q(obj) != CompactHashMap.j;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    final class g extends com.google.common.collect.b {
        private final Object a;
        private int b;

        g(int i) {
            this.a = CompactHashMap.this.M(i);
            this.b = i;
        }

        private void a() {
            int i = this.b;
            if (i == -1 || i >= CompactHashMap.this.size() || !hc5.a(this.a, CompactHashMap.this.M(this.b))) {
                this.b = CompactHashMap.this.J(this.a);
            }
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public Object getKey() {
            return this.a;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public Object getValue() {
            Map C = CompactHashMap.this.C();
            if (C != null) {
                return m.a(C.get(this.a));
            }
            a();
            int i = this.b;
            return i == -1 ? m.b() : CompactHashMap.this.c0(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Map C = CompactHashMap.this.C();
            if (C != 0) {
                return m.a(C.put(this.a, obj));
            }
            a();
            int i = this.b;
            if (i == -1) {
                CompactHashMap.this.put(this.a, obj);
                return m.b();
            }
            Object c0 = CompactHashMap.this.c0(i);
            CompactHashMap.this.b0(this.b, obj);
            return c0;
        }
    }

    class h extends AbstractCollection {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return CompactHashMap.this.d0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    CompactHashMap() {
        K(3);
    }

    public static CompactHashMap B(int i) {
        return new CompactHashMap(i);
    }

    private int D(int i) {
        return R()[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int H() {
        return (1 << (this.e & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int J(Object obj) {
        if (P()) {
            return -1;
        }
        int c2 = i.c(obj);
        int H = H();
        int h2 = com.google.common.collect.g.h(T(), c2 & H);
        if (h2 == 0) {
            return -1;
        }
        int b2 = com.google.common.collect.g.b(c2, H);
        do {
            int i = h2 - 1;
            int D = D(i);
            if (com.google.common.collect.g.b(D, H) == b2 && hc5.a(obj, M(i))) {
                return i;
            }
            h2 = com.google.common.collect.g.c(D, H);
        } while (h2 != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object M(int i) {
        return S()[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object Q(Object obj) {
        if (P()) {
            return j;
        }
        int H = H();
        int f2 = com.google.common.collect.g.f(obj, null, H, T(), R(), S(), null);
        if (f2 == -1) {
            return j;
        }
        Object c0 = c0(f2);
        O(f2, H);
        this.f--;
        I();
        return c0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] R() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] S() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object T() {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] U() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void W(int i) {
        int min;
        int length = R().length;
        if (i <= length || (min = Math.min(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        V(min);
    }

    private int X(int i, int i2, int i3, int i4) {
        Object a2 = com.google.common.collect.g.a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            com.google.common.collect.g.i(a2, i3 & i5, i4 + 1);
        }
        Object T = T();
        int[] R = R();
        for (int i6 = 0; i6 <= i; i6++) {
            int h2 = com.google.common.collect.g.h(T, i6);
            while (h2 != 0) {
                int i7 = h2 - 1;
                int i8 = R[i7];
                int b2 = com.google.common.collect.g.b(i8, i) | i6;
                int i9 = b2 & i5;
                int h3 = com.google.common.collect.g.h(a2, i9);
                com.google.common.collect.g.i(a2, i9, h2);
                R[i7] = com.google.common.collect.g.d(b2, h3, i5);
                h2 = com.google.common.collect.g.c(i8, i);
            }
        }
        this.a = a2;
        Z(i5);
        return i5;
    }

    private void Y(int i, int i2) {
        R()[i] = i2;
    }

    private void Z(int i) {
        this.e = com.google.common.collect.g.d(this.e, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private void a0(int i, Object obj) {
        S()[i] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(int i, Object obj) {
        U()[i] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object c0(int i) {
        return U()[i];
    }

    static /* synthetic */ int h(CompactHashMap compactHashMap) {
        int i = compactHashMap.f;
        compactHashMap.f = i - 1;
        return i;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            StringBuilder sb = new StringBuilder(25);
            sb.append("Invalid size: ");
            sb.append(readInt);
            throw new InvalidObjectException(sb.toString());
        }
        K(readInt);
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    public static CompactHashMap w() {
        return new CompactHashMap();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator E = E();
        while (E.hasNext()) {
            Map.Entry entry = (Map.Entry) E.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    Collection A() {
        return new h();
    }

    Map C() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    Iterator E() {
        Map C = C();
        return C != null ? C.entrySet().iterator() : new b();
    }

    int F() {
        return isEmpty() ? -1 : 0;
    }

    int G(int i) {
        int i2 = i + 1;
        if (i2 < this.f) {
            return i2;
        }
        return -1;
    }

    void I() {
        this.e += 32;
    }

    void K(int i) {
        b16.e(i >= 0, "Expected size must be >= 0");
        this.e = Ints.f(i, 1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    void L(int i, Object obj, Object obj2, int i2, int i3) {
        Y(i, com.google.common.collect.g.d(i2, 0, i3));
        a0(i, obj);
        b0(i, obj2);
    }

    Iterator N() {
        Map C = C();
        return C != null ? C.keySet().iterator() : new a();
    }

    void O(int i, int i2) {
        Object T = T();
        int[] R = R();
        Object[] S = S();
        Object[] U = U();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            S[i] = null;
            U[i] = null;
            R[i] = 0;
            return;
        }
        Object obj = S[i3];
        S[i] = obj;
        U[i] = U[i3];
        S[i3] = null;
        U[i3] = null;
        R[i] = R[i3];
        R[i3] = 0;
        int c2 = i.c(obj) & i2;
        int h2 = com.google.common.collect.g.h(T, c2);
        if (h2 == size) {
            com.google.common.collect.g.i(T, c2, i + 1);
            return;
        }
        while (true) {
            int i4 = h2 - 1;
            int i5 = R[i4];
            int c3 = com.google.common.collect.g.c(i5, i2);
            if (c3 == size) {
                R[i4] = com.google.common.collect.g.d(i5, i + 1, i2);
                return;
            }
            h2 = c3;
        }
    }

    boolean P() {
        return this.a == null;
    }

    void V(int i) {
        this.b = Arrays.copyOf(R(), i);
        this.c = Arrays.copyOf(S(), i);
        this.d = Arrays.copyOf(U(), i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (P()) {
            return;
        }
        I();
        Map C = C();
        if (C != null) {
            this.e = Ints.f(size(), 3, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            C.clear();
            this.a = null;
            this.f = 0;
            return;
        }
        Arrays.fill(S(), 0, this.f, (Object) null);
        Arrays.fill(U(), 0, this.f, (Object) null);
        com.google.common.collect.g.g(T());
        Arrays.fill(R(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map C = C();
        return C != null ? C.containsKey(obj) : J(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map C = C();
        if (C != null) {
            return C.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (hc5.a(obj, c0(i))) {
                return true;
            }
        }
        return false;
    }

    Iterator d0() {
        Map C = C();
        return C != null ? C.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.h;
        if (set != null) {
            return set;
        }
        Set x = x();
        this.h = x;
        return x;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Map C = C();
        if (C != null) {
            return C.get(obj);
        }
        int J = J(obj);
        if (J == -1) {
            return null;
        }
        s(J);
        return c0(J);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.g;
        if (set != null) {
            return set;
        }
        Set z = z();
        this.g = z;
        return z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        int X;
        int i;
        if (P()) {
            u();
        }
        Map C = C();
        if (C != null) {
            return C.put(obj, obj2);
        }
        int[] R = R();
        Object[] S = S();
        Object[] U = U();
        int i2 = this.f;
        int i3 = i2 + 1;
        int c2 = i.c(obj);
        int H = H();
        int i4 = c2 & H;
        int h2 = com.google.common.collect.g.h(T(), i4);
        if (h2 != 0) {
            int b2 = com.google.common.collect.g.b(c2, H);
            int i5 = 0;
            while (true) {
                int i6 = h2 - 1;
                int i7 = R[i6];
                if (com.google.common.collect.g.b(i7, H) == b2 && hc5.a(obj, S[i6])) {
                    Object obj3 = U[i6];
                    U[i6] = obj2;
                    s(i6);
                    return obj3;
                }
                int c3 = com.google.common.collect.g.c(i7, H);
                i5++;
                if (c3 != 0) {
                    h2 = c3;
                } else {
                    if (i5 >= 9) {
                        return v().put(obj, obj2);
                    }
                    if (i3 > H) {
                        X = X(H, com.google.common.collect.g.e(H), c2, i2);
                    } else {
                        R[i6] = com.google.common.collect.g.d(i7, i3, H);
                    }
                }
            }
        } else if (i3 > H) {
            X = X(H, com.google.common.collect.g.e(H), c2, i2);
            i = X;
        } else {
            com.google.common.collect.g.i(T(), i4, i3);
            i = H;
        }
        W(i3);
        L(i2, obj, obj2, c2, i);
        this.f = i3;
        I();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Map C = C();
        if (C != null) {
            return C.remove(obj);
        }
        Object Q = Q(obj);
        if (Q == j) {
            return null;
        }
        return Q;
    }

    void s(int i) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map C = C();
        return C != null ? C.size() : this.f;
    }

    int t(int i, int i2) {
        return i - 1;
    }

    int u() {
        b16.q(P(), "Arrays already allocated");
        int i = this.e;
        int j2 = com.google.common.collect.g.j(i);
        this.a = com.google.common.collect.g.a(j2);
        Z(j2 - 1);
        this.b = new int[i];
        this.c = new Object[i];
        this.d = new Object[i];
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    Map v() {
        Map y = y(H() + 1);
        int F = F();
        while (F >= 0) {
            y.put(M(F), c0(F));
            F = G(F);
        }
        this.a = y;
        this.b = null;
        this.c = null;
        this.d = null;
        I();
        return y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.i;
        if (collection != null) {
            return collection;
        }
        Collection A = A();
        this.i = A;
        return A;
    }

    Set x() {
        return new d();
    }

    Map y(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    Set z() {
        return new f();
    }

    CompactHashMap(int i) {
        K(i);
    }

    private abstract class e implements Iterator {
        int a;
        int b;
        int c;

        private e() {
            this.a = CompactHashMap.this.e;
            this.b = CompactHashMap.this.F();
            this.c = -1;
        }

        private void b() {
            if (CompactHashMap.this.e != this.a) {
                throw new ConcurrentModificationException();
            }
        }

        abstract Object c(int i);

        void d() {
            this.a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b >= 0;
        }

        @Override // java.util.Iterator
        public Object next() {
            b();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.b;
            this.c = i;
            Object c = c(i);
            this.b = CompactHashMap.this.G(this.b);
            return c;
        }

        @Override // java.util.Iterator
        public void remove() {
            b();
            com.google.common.collect.e.c(this.c >= 0);
            d();
            CompactHashMap compactHashMap = CompactHashMap.this;
            compactHashMap.remove(compactHashMap.M(this.c));
            this.b = CompactHashMap.this.t(this.b, this.c);
            this.c = -1;
        }

        /* synthetic */ e(CompactHashMap compactHashMap, a aVar) {
            this();
        }
    }
}
