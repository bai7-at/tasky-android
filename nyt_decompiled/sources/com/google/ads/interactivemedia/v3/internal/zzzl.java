package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
final class zzzl implements zzxj {
    zzzl() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxj
    public final zzxi zza(zzwm zzwmVar, zzact zzactVar) {
        Type zzd = zzactVar.zzd();
        boolean z = zzd instanceof GenericArrayType;
        if (!z && (!(zzd instanceof Class) || !((Class) zzd).isArray())) {
            return null;
        }
        Type genericComponentType = z ? ((GenericArrayType) zzd).getGenericComponentType() : ((Class) zzd).getComponentType();
        return new zzzm(zzwmVar, zzwmVar.zza(zzact.zzb(genericComponentType)), zzxr.zza(genericComponentType));
    }
}
