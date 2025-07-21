package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.d;

/* loaded from: classes5.dex */
public final class qv8 implements Collection, yu3 {
    private final long[] a;

    private static final class a implements Iterator, yu3 {
        private final long[] a;
        private int b;

        public a(long[] jArr) {
            zq3.h(jArr, "array");
            this.a = jArr;
        }

        public long c() {
            int i = this.b;
            long[] jArr = this.a;
            if (i >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.b));
            }
            this.b = i + 1;
            return pv8.b(jArr[i]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b < this.a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return pv8.a(c());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ qv8(long[] jArr) {
        this.a = jArr;
    }

    public static final /* synthetic */ qv8 a(long[] jArr) {
        return new qv8(jArr);
    }

    public static long[] c(int i) {
        return f(new long[i]);
    }

    public static long[] f(long[] jArr) {
        zq3.h(jArr, "storage");
        return jArr;
    }

    public static boolean j(long[] jArr, long j) {
        return d.V(jArr, j);
    }

    public static boolean n(long[] jArr, Collection collection) {
        zq3.h(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof pv8) || !d.V(jArr, ((pv8) obj).g())) {
                return false;
            }
        }
        return true;
    }

    public static boolean o(long[] jArr, Object obj) {
        return (obj instanceof qv8) && zq3.c(jArr, ((qv8) obj).z());
    }

    public static final long p(long[] jArr, int i) {
        return pv8.b(jArr[i]);
    }

    public static int t(long[] jArr) {
        return jArr.length;
    }

    public static int u(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static boolean v(long[] jArr) {
        return jArr.length == 0;
    }

    public static Iterator w(long[] jArr) {
        return new a(jArr);
    }

    public static final void x(long[] jArr, int i, long j) {
        jArr[i] = j;
    }

    public static String y(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof pv8) {
            return g(((pv8) obj).g());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        zq3.h(collection, "elements");
        return n(this.a, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return o(this.a, obj);
    }

    public boolean g(long j) {
        return j(this.a, j);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return u(this.a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return v(this.a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return w(this.a);
    }

    @Override // java.util.Collection
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public int size() {
        return t(this.a);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return ln0.a(this);
    }

    public String toString() {
        return y(this.a);
    }

    public final /* synthetic */ long[] z() {
        return this.a;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        zq3.h(objArr, "array");
        return ln0.b(this, objArr);
    }
}
