package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
class n8 extends l8 implements List {
    final /* synthetic */ zzfyt f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n8(zzfyt zzfytVar, Object obj, List list, l8 l8Var) {
        super(zzfytVar, obj, list, l8Var);
        this.f = zzfytVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zzb();
        boolean isEmpty = this.b.isEmpty();
        ((List) this.b).add(i, obj);
        zzfyt zzfytVar = this.f;
        i2 = zzfytVar.e;
        zzfytVar.e = i2 + 1;
        if (isEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.b).addAll(i, collection);
        if (addAll) {
            int size2 = this.b.size();
            zzfyt zzfytVar = this.f;
            i2 = zzfytVar.e;
            zzfytVar.e = i2 + (size2 - size);
            if (size == 0) {
                a();
                return true;
            }
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.b).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new m8(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        zzb();
        Object remove = ((List) this.b).remove(i);
        zzfyt zzfytVar = this.f;
        i2 = zzfytVar.e;
        zzfytVar.e = i2 - 1;
        c();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.b).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        List subList = ((List) this.b).subList(i, i2);
        l8 l8Var = this.c;
        if (l8Var == null) {
            l8Var = this;
        }
        return this.f.k(this.a, subList, l8Var);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new m8(this, i);
    }
}
