package com.google.ads.interactivemedia.v3.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
abstract class zzyw implements Iterator {
    zzyx zza;
    zzyx zzb = null;
    int zzc;
    final /* synthetic */ zzyy zzd;

    zzyw(zzyy zzyyVar) {
        this.zzd = zzyyVar;
        this.zza = zzyyVar.zzd.zzd;
        this.zzc = zzyyVar.zzc;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza != this.zzd.zzd;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzyx zzyxVar = this.zzb;
        if (zzyxVar == null) {
            throw new IllegalStateException();
        }
        this.zzd.zze(zzyxVar, true);
        this.zzb = null;
        this.zzc = this.zzd.zzc;
    }

    final zzyx zza() {
        zzyx zzyxVar = this.zza;
        zzyy zzyyVar = this.zzd;
        if (zzyxVar == zzyyVar.zzd) {
            throw new NoSuchElementException();
        }
        if (zzyyVar.zzc != this.zzc) {
            throw new ConcurrentModificationException();
        }
        this.zza = zzyxVar.zzd;
        this.zzb = zzyxVar;
        return zzyxVar;
    }
}
