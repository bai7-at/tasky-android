package com.google.android.gms.internal.atv_ads_framework;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzaj extends zzaf {
    private final transient zzae c;
    private final transient zzab d;

    zzaj(zzae zzaeVar, zzab zzabVar) {
        this.c = zzaeVar;
        this.d = zzabVar;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    final int a(Object[] objArr, int i) {
        return this.d.a(objArr, 0);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzaf, com.google.android.gms.internal.atv_ads_framework.zzy
    public final zzab f() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c.size();
    }
}
