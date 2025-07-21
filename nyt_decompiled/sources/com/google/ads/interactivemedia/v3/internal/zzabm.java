package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
final class zzabm implements zzxj {
    final /* synthetic */ Class zza;
    final /* synthetic */ Class zzb;
    final /* synthetic */ zzxi zzc;

    zzabm(Class cls, Class cls2, zzxi zzxiVar) {
        this.zza = cls;
        this.zzb = cls2;
        this.zzc = zzxiVar;
    }

    public final String toString() {
        return "Factory[type=" + this.zza.getName() + "+" + this.zzb.getName() + ",adapter=" + this.zzc.toString() + "]";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxj
    public final zzxi zza(zzwm zzwmVar, zzact zzactVar) {
        Class zzc = zzactVar.zzc();
        if (zzc == this.zza || zzc == this.zzb) {
            return this.zzc;
        }
        return null;
    }
}
