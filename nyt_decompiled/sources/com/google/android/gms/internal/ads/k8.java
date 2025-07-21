package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
class k8 implements Iterator {
    final Iterator a;
    final Collection b;
    final /* synthetic */ l8 c;

    k8(l8 l8Var, Iterator it2) {
        this.c = l8Var;
        this.b = l8Var.b;
        this.a = it2;
    }

    final void b() {
        this.c.zzb();
        if (this.c.b != this.b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        b();
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        b();
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        this.a.remove();
        zzfyt zzfytVar = this.c.e;
        i = zzfytVar.e;
        zzfytVar.e = i - 1;
        this.c.c();
    }

    k8(l8 l8Var) {
        this.c = l8Var;
        Collection collection = l8Var.b;
        this.b = collection;
        this.a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}
