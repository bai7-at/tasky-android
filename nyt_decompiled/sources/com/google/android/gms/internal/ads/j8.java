package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes3.dex */
class j8 extends e8 implements SortedSet {
    final /* synthetic */ zzfyt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j8(zzfyt zzfytVar, SortedMap sortedMap) {
        super(zzfytVar, sortedMap);
        this.c = zzfytVar;
    }

    SortedMap a() {
        return (SortedMap) this.a;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new j8(this.c, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new j8(this.c, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new j8(this.c, a().tailMap(obj));
    }
}
