package com.google.android.gms.internal.common;

import defpackage.bvf;
import defpackage.twf;
import defpackage.z3a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: classes3.dex */
public abstract class zzag extends zzac implements List, RandomAccess {
    private static final z3a b = new d(zzai.e, 0);

    zzag() {
    }

    static zzag n(Object[] objArr, int i) {
        return i == 0 ? zzai.e : new zzai(objArr, i);
    }

    public static zzag o(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return p((Collection) iterable);
        }
        Iterator it2 = iterable.iterator();
        if (!it2.hasNext()) {
            return zzai.e;
        }
        Object next = it2.next();
        if (!it2.hasNext()) {
            return t(next);
        }
        c cVar = new c(4);
        cVar.b(next);
        cVar.c(it2);
        cVar.c = true;
        return n(cVar.a, cVar.b);
    }

    public static zzag p(Collection collection) {
        if (!(collection instanceof zzac)) {
            Object[] array = collection.toArray();
            int length = array.length;
            e.a(array, length);
            return n(array, length);
        }
        zzag f = ((zzac) collection).f();
        if (!f.g()) {
            return f;
        }
        Object[] array2 = f.toArray();
        return n(array2, array2.length);
    }

    public static zzag q() {
        return zzai.e;
    }

    public static zzag t(Object obj) {
        Object[] objArr = {obj};
        e.a(objArr, 1);
        return n(objArr, 1);
    }

    public static zzag u(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        e.a(objArr, 2);
        return n(objArr, 2);
    }

    @Override // com.google.android.gms.internal.common.zzac
    int a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (bvf.a(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it2 = iterator();
                Iterator it3 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it3.hasNext() || !bvf.a(it2.next(), it3.next())) {
                            break;
                        }
                    } else if (!it3.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final zzag f() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public zzag subList(int i, int i2) {
        twf.c(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? zzai.e : new zzaf(this, i, i3);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final z3a listIterator(int i) {
        twf.b(i, size(), "index");
        return isEmpty() ? b : new d(this, i);
    }
}
