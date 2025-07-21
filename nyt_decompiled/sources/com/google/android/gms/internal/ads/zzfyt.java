package com.google.android.gms.internal.ads;

import defpackage.tge;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes3.dex */
abstract class zzfyt extends q8 implements Serializable {
    private final transient Map d;
    private transient int e;

    protected zzfyt(Map map) {
        tge.e(map.isEmpty());
        this.d = map;
    }

    static /* bridge */ /* synthetic */ void p(zzfyt zzfytVar, Object obj) {
        Object obj2;
        try {
            obj2 = zzfytVar.d.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfytVar.e -= size;
        }
    }

    @Override // defpackage.qie
    public final boolean a(Object obj, Object obj2) {
        Collection collection = (Collection) this.d.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.e++;
            return true;
        }
        Collection g = g();
        if (!g.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.e++;
        this.d.put(obj, g);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.q8
    final Collection b() {
        return new p8(this);
    }

    @Override // com.google.android.gms.internal.ads.q8
    final Iterator c() {
        return new y7(this);
    }

    abstract Collection g();

    abstract Collection h(Collection collection);

    abstract Collection i(Object obj, Collection collection);

    final List k(Object obj, List list, l8 l8Var) {
        return list instanceof RandomAccess ? new h8(this, obj, list, l8Var) : new n8(this, obj, list, l8Var);
    }

    final Map m() {
        Map map = this.d;
        return map instanceof NavigableMap ? new f8(this, (NavigableMap) map) : map instanceof SortedMap ? new i8(this, (SortedMap) map) : new b8(this, map);
    }

    final Set n() {
        Map map = this.d;
        return map instanceof NavigableMap ? new g8(this, (NavigableMap) map) : map instanceof SortedMap ? new j8(this, (SortedMap) map) : new e8(this, map);
    }

    @Override // defpackage.qie
    public final int zze() {
        return this.e;
    }

    @Override // defpackage.qie
    public final void zzp() {
        Iterator it2 = this.d.values().iterator();
        while (it2.hasNext()) {
            ((Collection) it2.next()).clear();
        }
        this.d.clear();
        this.e = 0;
    }
}
