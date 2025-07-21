package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.d;

/* loaded from: classes5.dex */
public final class mv8 implements Collection, yu3 {
    private final int[] a;

    private static final class a implements Iterator, yu3 {
        private final int[] a;
        private int b;

        public a(int[] iArr) {
            zq3.h(iArr, "array");
            this.a = iArr;
        }

        public int c() {
            int i = this.b;
            int[] iArr = this.a;
            if (i >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.b));
            }
            this.b = i + 1;
            return lv8.b(iArr[i]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b < this.a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return lv8.a(c());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ mv8(int[] iArr) {
        this.a = iArr;
    }

    public static final /* synthetic */ mv8 a(int[] iArr) {
        return new mv8(iArr);
    }

    public static int[] c(int i) {
        return f(new int[i]);
    }

    public static int[] f(int[] iArr) {
        zq3.h(iArr, "storage");
        return iArr;
    }

    public static boolean j(int[] iArr, int i) {
        return d.U(iArr, i);
    }

    public static boolean n(int[] iArr, Collection collection) {
        zq3.h(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof lv8) || !d.U(iArr, ((lv8) obj).f())) {
                return false;
            }
        }
        return true;
    }

    public static boolean o(int[] iArr, Object obj) {
        return (obj instanceof mv8) && zq3.c(iArr, ((mv8) obj).z());
    }

    public static final int p(int[] iArr, int i) {
        return lv8.b(iArr[i]);
    }

    public static int t(int[] iArr) {
        return iArr.length;
    }

    public static int u(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean v(int[] iArr) {
        return iArr.length == 0;
    }

    public static Iterator w(int[] iArr) {
        return new a(iArr);
    }

    public static final void x(int[] iArr, int i, int i2) {
        iArr[i] = i2;
    }

    public static String y(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
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
        if (obj instanceof lv8) {
            return g(((lv8) obj).f());
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

    public boolean g(int i) {
        return j(this.a, i);
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

    public final /* synthetic */ int[] z() {
        return this.a;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        zq3.h(objArr, "array");
        return ln0.b(this, objArr);
    }
}
