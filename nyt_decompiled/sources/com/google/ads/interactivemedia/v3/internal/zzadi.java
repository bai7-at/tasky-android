package com.google.ads.interactivemedia.v3.internal;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class zzadi extends zzadk {
    final /* synthetic */ zzadr zza;
    private int zzb = 0;
    private final int zzc;

    zzadi(zzadr zzadrVar) {
        this.zza = zzadrVar;
        this.zzc = zzadrVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadm
    public final byte zza() {
        int i = this.zzb;
        if (i >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i + 1;
        return this.zza.zzb(i);
    }
}
