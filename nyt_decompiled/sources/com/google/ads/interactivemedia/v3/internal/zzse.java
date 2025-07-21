package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
final class zzse extends zzsg {
    final /* synthetic */ zzsh zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzse(zzsh zzshVar) {
        super(zzshVar);
        this.zza = zzshVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int zzc = zzsi.zzc(obj);
        int zzd = this.zza.zzd(obj, zzc);
        if (zzd == -1) {
            return false;
        }
        this.zza.zzm(zzd, zzc);
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsg
    final Object zza(int i) {
        return this.zza.zzb[i];
    }
}
