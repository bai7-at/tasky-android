package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.d;

/* loaded from: classes5.dex */
public final class bw8 implements Collection, yu3 {
    private final short[] a;

    private static final class a implements Iterator, yu3 {
        private final short[] a;
        private int b;

        public a(short[] sArr) {
            zq3.h(sArr, "array");
            this.a = sArr;
        }

        public short c() {
            int i = this.b;
            short[] sArr = this.a;
            if (i >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.b));
            }
            this.b = i + 1;
            return aw8.b(sArr[i]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b < this.a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return aw8.a(c());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ bw8(short[] sArr) {
        this.a = sArr;
    }

    public static final /* synthetic */ bw8 a(short[] sArr) {
        return new bw8(sArr);
    }

    public static short[] c(int i) {
        return f(new short[i]);
    }

    public static short[] f(short[] sArr) {
        zq3.h(sArr, "storage");
        return sArr;
    }

    public static boolean j(short[] sArr, short s) {
        return d.X(sArr, s);
    }

    public static boolean n(short[] sArr, Collection collection) {
        zq3.h(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof aw8) || !d.X(sArr, ((aw8) obj).f())) {
                return false;
            }
        }
        return true;
    }

    public static boolean o(short[] sArr, Object obj) {
        return (obj instanceof bw8) && zq3.c(sArr, ((bw8) obj).z());
    }

    public static final short p(short[] sArr, int i) {
        return aw8.b(sArr[i]);
    }

    public static int t(short[] sArr) {
        return sArr.length;
    }

    public static int u(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean v(short[] sArr) {
        return sArr.length == 0;
    }

    public static Iterator w(short[] sArr) {
        return new a(sArr);
    }

    public static final void x(short[] sArr, int i, short s) {
        sArr[i] = s;
    }

    public static String y(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
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
        if (obj instanceof aw8) {
            return g(((aw8) obj).f());
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

    public boolean g(short s) {
        return j(this.a, s);
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

    public final /* synthetic */ short[] z() {
        return this.a;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        zq3.h(objArr, "array");
        return ln0.b(this, objArr);
    }
}
