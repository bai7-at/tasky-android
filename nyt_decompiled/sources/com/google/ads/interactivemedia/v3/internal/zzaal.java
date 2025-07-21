package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzaal<T> extends zzaah<T> {
    final zzwm zza;
    private final zzwy zzb;
    private final zzwq zzc;
    private final zzact zzd;
    private final zzxj zze;
    private final zzaaj zzf = new zzaaj(this, null);
    private final boolean zzg;
    private volatile zzxi zzh;

    public zzaal(zzwy zzwyVar, zzwq zzwqVar, zzwm zzwmVar, zzact zzactVar, zzxj zzxjVar, boolean z) {
        this.zzb = zzwyVar;
        this.zzc = zzwqVar;
        this.zza = zzwmVar;
        this.zzd = zzactVar;
        this.zze = zzxjVar;
        this.zzg = z;
    }

    public static zzxj zzb(zzact zzactVar, Object obj) {
        return new zzaak(obj, zzactVar, zzactVar.zzd() == zzactVar.zzc(), null);
    }

    private final zzxi zzc() {
        zzxi zzxiVar = this.zzh;
        if (zzxiVar != null) {
            return zzxiVar;
        }
        zzxi zzb = this.zza.zzb(this.zze, this.zzd);
        this.zzh = zzb;
        return zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final T read(zzacv zzacvVar) throws IOException {
        if (this.zzc == null) {
            return (T) zzc().read(zzacvVar);
        }
        zzwr zza = zzzf.zza(zzacvVar);
        if (this.zzg && (zza instanceof zzwt)) {
            return null;
        }
        zzwq zzwqVar = this.zzc;
        this.zzd.zzd();
        return (T) zzwqVar.zza();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final void write(zzacx zzacxVar, T t) throws IOException {
        zzwy zzwyVar = this.zzb;
        if (zzwyVar == null) {
            zzc().write(zzacxVar, t);
        } else if (this.zzg && t == null) {
            zzacxVar.zzf();
        } else {
            ((zzabg) zzaby.zzV).write(zzacxVar, zzwyVar.zza(t, this.zzd.zzd(), this.zzf));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaah
    public final zzxi zza() {
        return this.zzb != null ? this : zzc();
    }
}
