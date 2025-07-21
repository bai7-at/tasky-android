package com.google.android.gms.internal.ads;

import defpackage.gge;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
final class zzgan extends AbstractSequentialList implements Serializable {
    final List zza;
    final gge zzb;

    zzgan(List list, gge ggeVar) {
        this.zza = list;
        this.zzb = ggeVar;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new r9(this, this.zza.listIterator(i));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        this.zza.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
