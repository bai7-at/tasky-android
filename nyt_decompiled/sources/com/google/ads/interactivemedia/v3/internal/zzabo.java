package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
final class zzabo implements zzxj {
    final /* synthetic */ Class zza;
    final /* synthetic */ zzxi zzb;

    zzabo(Class cls, zzxi zzxiVar) {
        this.zza = cls;
        this.zzb = zzxiVar;
    }

    public final String toString() {
        return "Factory[typeHierarchy=" + this.zza.getName() + ",adapter=" + this.zzb.toString() + "]";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxj
    public final zzxi zza(zzwm zzwmVar, zzact zzactVar) {
        Class<?> zzc = zzactVar.zzc();
        if (this.zza.isAssignableFrom(zzc)) {
            return new zzabn(this, zzc);
        }
        return null;
    }
}
