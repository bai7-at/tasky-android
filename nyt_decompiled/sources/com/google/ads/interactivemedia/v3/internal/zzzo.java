package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Type;
import java.util.Collection;

/* loaded from: classes2.dex */
public final class zzzo implements zzxj {
    private final zzyl zza;

    public zzzo(zzyl zzylVar) {
        this.zza = zzylVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxj
    public final zzxi zza(zzwm zzwmVar, zzact zzactVar) {
        Type zzd = zzactVar.zzd();
        Class zzc = zzactVar.zzc();
        if (!Collection.class.isAssignableFrom(zzc)) {
            return null;
        }
        Type zzd2 = zzxr.zzd(zzd, zzc);
        return new zzzn(zzwmVar, zzd2, zzwmVar.zza(zzact.zzb(zzd2)), this.zza.zza(zzactVar));
    }
}
