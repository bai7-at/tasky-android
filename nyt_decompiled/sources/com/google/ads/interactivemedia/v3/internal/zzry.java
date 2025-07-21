package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
final class zzry extends zzrs {
    final Object zza;
    int zzb;
    final /* synthetic */ zzsh zzc;

    zzry(zzsh zzshVar, int i) {
        this.zzc = zzshVar;
        this.zza = zzshVar.zza[i];
        this.zzb = i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrs, java.util.Map.Entry
    public final Object getKey() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrs, java.util.Map.Entry
    public final Object getValue() {
        zza();
        int i = this.zzb;
        if (i == -1) {
            return null;
        }
        return this.zzc.zzb[i];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrs, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zza();
        int i = this.zzb;
        if (i == -1) {
            this.zzc.zzg(this.zza, obj, false);
            return null;
        }
        Object obj2 = this.zzc.zzb[i];
        if (zzri.zza(obj2, obj)) {
            return obj;
        }
        this.zzc.zzw(this.zzb, obj, false);
        return obj2;
    }

    final void zza() {
        int i = this.zzb;
        if (i != -1) {
            zzsh zzshVar = this.zzc;
            if (i <= zzshVar.zzc && zzri.zza(zzshVar.zza[i], this.zza)) {
                return;
            }
        }
        zzsh zzshVar2 = this.zzc;
        Object obj = this.zza;
        this.zzb = zzshVar2.zzc(obj, zzsi.zzc(obj));
    }
}
