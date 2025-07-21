package kotlin.collections;

import defpackage.ln0;
import defpackage.no;
import defpackage.yu3;
import defpackage.zq3;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes5.dex */
final class b implements Collection, yu3 {
    private final Object[] a;
    private final boolean b;

    public b(Object[] objArr, boolean z) {
        zq3.h(objArr, "values");
        this.a = objArr;
        this.b = z;
    }

    public int a() {
        return this.a.length;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
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
    public boolean contains(Object obj) {
        return d.W(this.a, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        zq3.h(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it2 = collection2.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return no.a(this.a);
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
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        zq3.h(objArr, "array");
        return ln0.b(this, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return j.b(this.a, this.b);
    }
}
