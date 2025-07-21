package com.google.android.gms.internal.ads;

import defpackage.tge;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class a8 implements Iterator {
    final Iterator a;
    Collection b;
    final /* synthetic */ b8 c;

    a8(b8 b8Var) {
        this.c = b8Var;
        this.a = b8Var.c.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        this.b = (Collection) entry.getValue();
        return this.c.c(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        tge.j(this.b != null, "no calls to next() since the last call to remove()");
        this.a.remove();
        zzfyt zzfytVar = this.c.d;
        i = zzfytVar.e;
        zzfytVar.e = i - this.b.size();
        this.b.clear();
        this.b = null;
    }
}
