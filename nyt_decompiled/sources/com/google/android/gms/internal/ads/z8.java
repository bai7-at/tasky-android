package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class z8 extends AbstractSet {
    final /* synthetic */ zzfzj a;

    z8(zzfzj zzfzjVar) {
        this.a = zzfzjVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfzj zzfzjVar = this.a;
        Map t = zzfzjVar.t();
        return t != null ? t.keySet().iterator() : new u8(zzfzjVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object G;
        Object obj2;
        Map t = this.a.t();
        if (t != null) {
            return t.keySet().remove(obj);
        }
        G = this.a.G(obj);
        obj2 = zzfzj.j;
        return G != obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
