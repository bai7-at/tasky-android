package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
final class zzfw implements zzuz {
    final /* synthetic */ String zza;
    final /* synthetic */ zzgc zzb;

    zzfw(zzgc zzgcVar, String str) {
        this.zzb = zzgcVar;
        this.zza = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzuz
    public final void zza(Throwable th) {
        zzhd.zzb("Failure to make Native-layer network request", th);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzuz
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfr zzfrVar;
        zzff zzffVar = new zzff(zzfd.nativeXhr, zzfe.nativeResponse, this.zza, (com.google.ads.interactivemedia.v3.impl.data.zzbj) obj);
        zzfrVar = this.zzb.zzb;
        zzfrVar.zzp(zzffVar);
    }
}
