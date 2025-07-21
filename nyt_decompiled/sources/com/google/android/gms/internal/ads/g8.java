package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes3.dex */
final class g8 extends j8 implements NavigableSet {
    final /* synthetic */ zzfyt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g8(zzfyt zzfytVar, NavigableMap navigableMap) {
        super(zzfytVar, navigableMap);
        this.d = zzfytVar;
    }

    @Override // com.google.android.gms.internal.ads.j8
    final /* synthetic */ SortedMap a() {
        return (NavigableMap) ((SortedMap) this.a);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.a)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new g8(this.d, ((NavigableMap) ((SortedMap) this.a)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.a)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.j8, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.a)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.a)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return q9.a(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return q9.a(descendingIterator());
    }

    @Override // com.google.android.gms.internal.ads.j8, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.j8, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new g8(this.d, ((NavigableMap) ((SortedMap) this.a)).headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new g8(this.d, ((NavigableMap) ((SortedMap) this.a)).subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new g8(this.d, ((NavigableMap) ((SortedMap) this.a)).tailMap(obj, z));
    }
}
