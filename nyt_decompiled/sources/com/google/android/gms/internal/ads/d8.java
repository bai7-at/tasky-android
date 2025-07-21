package com.google.android.gms.internal.ads;

import defpackage.tge;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class d8 implements Iterator {
    Map.Entry a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ e8 c;

    d8(e8 e8Var, Iterator it2) {
        this.b = it2;
        this.c = e8Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.b.next();
        this.a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        tge.j(this.a != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.a.getValue();
        this.b.remove();
        zzfyt zzfytVar = this.c.b;
        i = zzfytVar.e;
        zzfytVar.e = i - collection.size();
        collection.clear();
        this.a = null;
    }
}
