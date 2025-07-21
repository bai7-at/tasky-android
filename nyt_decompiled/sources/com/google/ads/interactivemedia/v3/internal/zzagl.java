package com.google.ads.interactivemedia.v3.internal;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class zzagl extends zzadk {
    final zzagp zza;
    zzadm zzb = zzb();
    final /* synthetic */ zzagr zzc;

    zzagl(zzagr zzagrVar) {
        this.zzc = zzagrVar;
        this.zza = new zzagp(zzagrVar, null);
    }

    private final zzadm zzb() {
        zzagp zzagpVar = this.zza;
        if (zzagpVar.hasNext()) {
            return zzagpVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadm
    public final byte zza() {
        zzadm zzadmVar = this.zzb;
        if (zzadmVar == null) {
            throw new NoSuchElementException();
        }
        byte zza = zzadmVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return zza;
    }
}
