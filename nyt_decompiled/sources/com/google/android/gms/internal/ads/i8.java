package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes3.dex */
class i8 extends b8 implements SortedMap {
    SortedSet e;
    final /* synthetic */ zzfyt f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i8(zzfyt zzfytVar, SortedMap sortedMap) {
        super(zzfytVar, sortedMap);
        this.f = zzfytVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    SortedMap d() {
        return (SortedMap) this.c;
    }

    SortedSet f() {
        return new j8(this.f, d());
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    @Override // com.google.android.gms.internal.ads.b8, java.util.AbstractMap, java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.e;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet f = f();
        this.e = f;
        return f;
    }

    public SortedMap headMap(Object obj) {
        return new i8(this.f, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new i8(this.f, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new i8(this.f, d().tailMap(obj));
    }
}
