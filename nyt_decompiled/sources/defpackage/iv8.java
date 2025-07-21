package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.d;

/* loaded from: classes5.dex */
public final class iv8 implements Collection, yu3 {
    private final byte[] a;

    private static final class a implements Iterator, yu3 {
        private final byte[] a;
        private int b;

        public a(byte[] bArr) {
            zq3.h(bArr, "array");
            this.a = bArr;
        }

        public byte c() {
            int i = this.b;
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.b));
            }
            this.b = i + 1;
            return hv8.b(bArr[i]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b < this.a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return hv8.a(c());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ iv8(byte[] bArr) {
        this.a = bArr;
    }

    public static final /* synthetic */ iv8 a(byte[] bArr) {
        return new iv8(bArr);
    }

    public static byte[] c(int i) {
        return f(new byte[i]);
    }

    public static byte[] f(byte[] bArr) {
        zq3.h(bArr, "storage");
        return bArr;
    }

    public static boolean j(byte[] bArr, byte b) {
        return d.S(bArr, b);
    }

    public static boolean n(byte[] bArr, Collection collection) {
        zq3.h(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof hv8) || !d.S(bArr, ((hv8) obj).f())) {
                return false;
            }
        }
        return true;
    }

    public static boolean o(byte[] bArr, Object obj) {
        return (obj instanceof iv8) && zq3.c(bArr, ((iv8) obj).z());
    }

    public static final byte p(byte[] bArr, int i) {
        return hv8.b(bArr[i]);
    }

    public static int t(byte[] bArr) {
        return bArr.length;
    }

    public static int u(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean v(byte[] bArr) {
        return bArr.length == 0;
    }

    public static Iterator w(byte[] bArr) {
        return new a(bArr);
    }

    public static final void x(byte[] bArr, int i, byte b) {
        bArr[i] = b;
    }

    public static String y(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
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
        if (obj instanceof hv8) {
            return g(((hv8) obj).f());
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

    public boolean g(byte b) {
        return j(this.a, b);
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

    public final /* synthetic */ byte[] z() {
        return this.a;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        zq3.h(objArr, "array");
        return ln0.b(this, objArr);
    }
}
