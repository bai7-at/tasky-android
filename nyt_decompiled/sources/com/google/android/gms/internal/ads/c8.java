package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
abstract class c8 implements Iterator {
    final Iterator a;
    Object b;
    Collection c;
    Iterator d;
    final /* synthetic */ zzfyt e;

    c8(zzfyt zzfytVar) {
        Map map;
        this.e = zzfytVar;
        map = zzfytVar.d;
        this.a = map.entrySet().iterator();
        this.b = null;
        this.c = null;
        this.d = zzgai.INSTANCE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext() || this.d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.c = collection;
            this.d = collection.iterator();
        }
        return this.d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        this.d.remove();
        Collection collection = this.c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.a.remove();
        }
        zzfyt zzfytVar = this.e;
        i = zzfytVar.e;
        zzfytVar.e = i - 1;
    }
}
