package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
final class zzabk implements zzxj {
    final /* synthetic */ Class zza;
    final /* synthetic */ zzxi zzb;

    zzabk(Class cls, zzxi zzxiVar) {
        this.zza = cls;
        this.zzb = zzxiVar;
    }

    public final String toString() {
        return "Factory[type=" + this.zza.getName() + ",adapter=" + this.zzb.toString() + "]";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxj
    public final zzxi zza(zzwm zzwmVar, zzact zzactVar) {
        if (zzactVar.zzc() == this.zza) {
            return this.zzb;
        }
        return null;
    }
}
