package com.google.android.gms.internal.ads;

import defpackage.yie;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzgbn extends zzgaf {
    private final transient zzgad c;
    private final transient zzgaa d;

    zzgbn(zzgad zzgadVar, zzgaa zzgaaVar) {
        this.c = zzgadVar;
        this.d = zzgaaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    final int a(Object[] objArr, int i) {
        return this.d.a(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzfzv, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgaf, com.google.android.gms.internal.ads.zzfzv
    public final zzgaa f() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzgaf, com.google.android.gms.internal.ads.zzfzv
    public final yie g() {
        return this.d.listIterator(0);
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
