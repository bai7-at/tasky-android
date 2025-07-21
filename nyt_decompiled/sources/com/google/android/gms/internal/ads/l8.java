package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
abstract class l8 extends AbstractCollection {
    final Object a;
    Collection b;
    final l8 c;
    final Collection d;
    final /* synthetic */ zzfyt e;

    l8(zzfyt zzfytVar, Object obj, Collection collection, l8 l8Var) {
        this.e = zzfytVar;
        this.a = obj;
        this.b = collection;
        this.c = l8Var;
        this.d = l8Var == null ? null : l8Var.b;
    }

    final void a() {
        Map map;
        l8 l8Var = this.c;
        if (l8Var != null) {
            l8Var.a();
            return;
        }
        zzfyt zzfytVar = this.e;
        Object obj = this.a;
        map = zzfytVar.d;
        map.put(obj, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        zzb();
        boolean isEmpty = this.b.isEmpty();
        boolean add = this.b.add(obj);
        if (add) {
            zzfyt zzfytVar = this.e;
            i = zzfytVar.e;
            zzfytVar.e = i + 1;
            if (isEmpty) {
                a();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.b.addAll(collection);
        if (addAll) {
            int size2 = this.b.size();
            zzfyt zzfytVar = this.e;
            i = zzfytVar.e;
            zzfytVar.e = i + (size2 - size);
            if (size == 0) {
                a();
                return true;
            }
        }
        return addAll;
    }

    final void c() {
        Map map;
        l8 l8Var = this.c;
        if (l8Var != null) {
            l8Var.c();
        } else if (this.b.isEmpty()) {
            zzfyt zzfytVar = this.e;
            Object obj = this.a;
            map = zzfytVar.d;
            map.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i;
        int size = size();
        if (size == 0) {
            return;
        }
        this.b.clear();
        zzfyt zzfytVar = this.e;
        i = zzfytVar.e;
        zzfytVar.e = i - size;
        c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new k8(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        zzb();
        boolean remove = this.b.remove(obj);
        if (remove) {
            zzfyt zzfytVar = this.e;
            i = zzfytVar.e;
            zzfytVar.e = i - 1;
            c();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.b.removeAll(collection);
        if (removeAll) {
            int size2 = this.b.size();
            zzfyt zzfytVar = this.e;
            int i2 = size2 - size;
            i = zzfytVar.e;
            zzfytVar.e = i + i2;
            c();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        collection.getClass();
        int size = size();
        boolean retainAll = this.b.retainAll(collection);
        if (retainAll) {
            int size2 = this.b.size();
            zzfyt zzfytVar = this.e;
            int i2 = size2 - size;
            i = zzfytVar.e;
            zzfytVar.e = i + i2;
            c();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.b.toString();
    }

    final void zzb() {
        Map map;
        l8 l8Var = this.c;
        if (l8Var != null) {
            l8Var.zzb();
            l8 l8Var2 = this.c;
            if (l8Var2.b != this.d) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.b.isEmpty()) {
            zzfyt zzfytVar = this.e;
            Object obj = this.a;
            map = zzfytVar.d;
            Collection collection = (Collection) map.get(obj);
            if (collection != null) {
                this.b = collection;
            }
        }
    }
}
