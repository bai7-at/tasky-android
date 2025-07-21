package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* loaded from: classes2.dex */
public final class zzaho extends AbstractList implements RandomAccess, zzafh {
    private final zzafh zza;

    public zzaho(zzafh zzafhVar) {
        this.zza = zzafhVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((zzafg) this.zza).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzahn(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new zzahm(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafh
    public final zzafh zze() {
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafh
    public final Object zzf(int i) {
        return this.zza.zzf(i);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafh
    public final List zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafh
    public final void zzi(zzadr zzadrVar) {
        throw new UnsupportedOperationException();
    }
}
