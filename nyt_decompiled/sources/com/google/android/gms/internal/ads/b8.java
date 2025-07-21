package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
class b8 extends x9 {
    final transient Map c;
    final /* synthetic */ zzfyt d;

    b8(zzfyt zzfytVar, Map map) {
        this.d = zzfytVar;
        this.c = map;
    }

    @Override // com.google.android.gms.internal.ads.x9
    protected final Set a() {
        return new z7(this);
    }

    final Map.Entry c(Map.Entry entry) {
        Object key = entry.getKey();
        return new zzfzw(key, this.d.i(key, (Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map;
        zzfyt zzfytVar = this.d;
        Map map2 = this.c;
        map = zzfytVar.d;
        if (map2 == map) {
            zzfytVar.zzp();
        } else {
            q9.b(new a8(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) y9.a(this.c, obj);
        if (collection == null) {
            return null;
        }
        return this.d.i(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.d.f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        int i;
        Collection collection = (Collection) this.c.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection g = this.d.g();
        g.addAll(collection);
        zzfyt zzfytVar = this.d;
        i = zzfytVar.e;
        zzfytVar.e = i - collection.size();
        collection.clear();
        return g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.c.toString();
    }
}
