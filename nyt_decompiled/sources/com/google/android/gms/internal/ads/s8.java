package com.google.android.gms.internal.ads;

import defpackage.tge;
import defpackage.uge;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
abstract class s8 extends AbstractCollection {
    final Collection a;
    final uge b;

    s8(Collection collection, uge ugeVar) {
        this.a = collection;
        this.b = ugeVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        tge.e(this.b.zza(obj));
        return this.a.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            tge.e(this.b.zza(it2.next()));
        }
        return this.a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        n9.b(this.a, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (t8.a(this.a, obj)) {
            return this.b.zza(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        uge ugeVar = this.b;
        Iterator it2 = this.a.iterator();
        tge.c(ugeVar, "predicate");
        int i = 0;
        while (it2.hasNext()) {
            if (ugeVar.zza(it2.next())) {
                return i == -1;
            }
            i++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it2 = this.a.iterator();
        it2.getClass();
        uge ugeVar = this.b;
        ugeVar.getClass();
        return new o9(it2, ugeVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it2 = this.a.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            Object next = it2.next();
            if (this.b.zza(next) && collection.contains(next)) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it2 = this.a.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            Object next = it2.next();
            if (this.b.zza(next) && !collection.contains(next)) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator it2 = this.a.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (this.b.zza(it2.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        Iterator it2 = iterator();
        ArrayList arrayList = new ArrayList();
        q9.c(arrayList, it2);
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Iterator it2 = iterator();
        ArrayList arrayList = new ArrayList();
        q9.c(arrayList, it2);
        return arrayList.toArray(objArr);
    }
}
