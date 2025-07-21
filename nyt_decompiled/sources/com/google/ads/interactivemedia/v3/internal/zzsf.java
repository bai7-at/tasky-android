package com.google.ads.interactivemedia.v3.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class zzsf implements Iterator {
    final /* synthetic */ zzsg zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;

    zzsf(zzsg zzsgVar) {
        int i;
        this.zza = zzsgVar;
        i = zzsgVar.zzb.zzi;
        this.zzb = i;
        this.zzc = -1;
        zzsh zzshVar = zzsgVar.zzb;
        this.zzd = zzshVar.zzd;
        this.zze = zzshVar.zzc;
    }

    private final void zza() {
        if (this.zza.zzb.zzd != this.zzd) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zzb != -2 && this.zze > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int[] iArr;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object zza = this.zza.zza(this.zzb);
        this.zzc = this.zzb;
        iArr = this.zza.zzb.zzl;
        this.zzb = iArr[this.zzb];
        this.zze--;
        return zza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zza();
        zzrm.zzh(this.zzc != -1, "no calls to next() since the last call to remove()");
        zzsh zzshVar = this.zza.zzb;
        int i = this.zzc;
        zzshVar.zzl(i, zzsi.zzc(zzshVar.zza[i]));
        int i2 = this.zzb;
        zzsh zzshVar2 = this.zza.zzb;
        if (i2 == zzshVar2.zzc) {
            this.zzb = this.zzc;
        }
        this.zzc = -1;
        this.zzd = zzshVar2.zzd;
    }
}
