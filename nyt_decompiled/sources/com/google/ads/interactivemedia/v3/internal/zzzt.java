package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
public final class zzzt implements zzxj {
    private final zzyl zza;

    public zzzt(zzyl zzylVar) {
        this.zza = zzylVar;
    }

    static final zzxi zzb(zzyl zzylVar, zzwm zzwmVar, zzact zzactVar, zzxk zzxkVar) {
        zzwy zzwyVar;
        zzxi zzaalVar;
        Object zza = zzylVar.zza(zzact.zza(zzxkVar.zza())).zza();
        boolean zzb = zzxkVar.zzb();
        if (zza instanceof zzxi) {
            zzaalVar = (zzxi) zza;
        } else if (zza instanceof zzxj) {
            zzaalVar = ((zzxj) zza).zza(zzwmVar, zzactVar);
        } else {
            if (zza instanceof zzwy) {
                zzwyVar = (zzwy) zza;
            } else {
                if (!(zza instanceof zzwq)) {
                    throw new IllegalArgumentException("Invalid attempt to bind an instance of " + zza.getClass().getName() + " as a @JsonAdapter for " + zzactVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                }
                zzwyVar = null;
            }
            zzaalVar = new zzaal(zzwyVar, zza instanceof zzwq ? (zzwq) zza : null, zzwmVar, zzactVar, null, zzb);
            zzb = false;
        }
        return (zzaalVar == null || !zzb) ? zzaalVar : zzaalVar.nullSafe();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxj
    public final zzxi zza(zzwm zzwmVar, zzact zzactVar) {
        zzxk zzxkVar = (zzxk) zzactVar.zzc().getAnnotation(zzxk.class);
        if (zzxkVar == null) {
            return null;
        }
        return zzb(this.zza, zzwmVar, zzactVar, zzxkVar);
    }
}
