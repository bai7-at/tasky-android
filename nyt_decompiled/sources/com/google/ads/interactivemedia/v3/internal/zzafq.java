package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
final class zzafq implements zzafx {
    private final zzafx[] zza;

    zzafq(zzafx... zzafxVarArr) {
        this.zza = zzafxVarArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafx
    public final zzafw zzb(Class cls) {
        zzafx[] zzafxVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzafx zzafxVar = zzafxVarArr[i];
            if (zzafxVar.zzc(cls)) {
                return zzafxVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafx
    public final boolean zzc(Class cls) {
        zzafx[] zzafxVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzafxVarArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
