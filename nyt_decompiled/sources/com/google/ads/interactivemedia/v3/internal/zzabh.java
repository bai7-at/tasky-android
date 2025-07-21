package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
final class zzabh implements zzxj {
    zzabh() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxj
    public final zzxi zza(zzwm zzwmVar, zzact zzactVar) {
        Class zzc = zzactVar.zzc();
        if (!Enum.class.isAssignableFrom(zzc) || zzc == Enum.class) {
            return null;
        }
        if (!zzc.isEnum()) {
            zzc = zzc.getSuperclass();
        }
        return new zzabx(zzc);
    }
}
