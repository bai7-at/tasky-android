package com.google.android.gms.internal.ads;

import defpackage.mge;
import defpackage.tge;
import defpackage.yie;
import defpackage.zie;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public abstract class zzgaa<E> extends zzfzv<E> implements List<E>, RandomAccess {
    private static final zie b = new i9(zzgbk.f, 0);
    public static final /* synthetic */ int c = 0;

    zzgaa() {
    }

    static zzgaa o(Object[] objArr, int i) {
        return i == 0 ? zzgbk.f : new zzgbk(objArr, i);
    }

    public static zzgaa p(Collection collection) {
        if (!(collection instanceof zzfzv)) {
            Object[] array = collection.toArray();
            int length = array.length;
            fa.b(array, length);
            return o(array, length);
        }
        zzgaa f = ((zzfzv) collection).f();
        if (!f.j()) {
            return f;
        }
        Object[] array2 = f.toArray();
        return o(array2, array2.length);
    }

    public static zzgaa q(Object[] objArr) {
        if (objArr.length == 0) {
            return zzgbk.f;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        fa.b(objArr2, length);
        return o(objArr2, length);
    }

    public static zzgaa t() {
        return zzgbk.f;
    }

    public static zzgaa u(Object obj) {
        Object[] objArr = {obj};
        fa.b(objArr, 1);
        return o(objArr, 1);
    }

    public static zzgaa v(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        fa.b(objArr, 2);
        return o(objArr, 2);
    }

    public static zzgaa w(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        fa.b(objArr, 3);
        return o(objArr, 3);
    }

    public static zzgaa x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        fa.b(objArr, 5);
        return o(objArr, 5);
    }

    public static zzgaa y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        fa.b(objArr, 6);
        return o(objArr, 6);
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    int a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfzv, java.util.AbstractCollection, java.util.Collection
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
                        if (mge.a(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it2 = iterator();
                Iterator<E> it3 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it3.hasNext() || !mge.a(it2.next(), it3.next())) {
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

    @Override // com.google.android.gms.internal.ads.zzfzv
    public final zzgaa f() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    public final yie g() {
        return listIterator(0);
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
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public zzgaa subList(int i, int i2) {
        tge.h(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? zzgbk.f : new zzfzz(this, i, i3);
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
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final zie listIterator(int i) {
        tge.b(i, size(), "index");
        return isEmpty() ? b : new i9(this, i);
    }
}
