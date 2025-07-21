package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
final class zzrz extends zzrs {
    final zzsh zza;
    final Object zzb;
    int zzc;

    zzrz(zzsh zzshVar, int i) {
        this.zza = zzshVar;
        this.zzb = zzshVar.zzb[i];
        this.zzc = i;
    }

    private final void zza() {
        int i = this.zzc;
        if (i != -1) {
            zzsh zzshVar = this.zza;
            if (i <= zzshVar.zzc && zzri.zza(this.zzb, zzshVar.zzb[i])) {
                return;
            }
        }
        zzsh zzshVar2 = this.zza;
        Object obj = this.zzb;
        this.zzc = zzshVar2.zzd(obj, zzsi.zzc(obj));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrs, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrs, java.util.Map.Entry
    public final Object getValue() {
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return this.zza.zza[i];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrs, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zza();
        int i = this.zzc;
        if (i == -1) {
            this.zza.zzh(this.zzb, obj, false);
            return null;
        }
        Object obj2 = this.zza.zza[i];
        if (zzri.zza(obj2, obj)) {
            return obj;
        }
        this.zza.zzv(this.zzc, obj, false);
        return obj2;
    }
}
