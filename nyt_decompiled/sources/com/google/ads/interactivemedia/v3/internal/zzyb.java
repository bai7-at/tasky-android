package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
final class zzyb implements zzyz {
    final /* synthetic */ Class zza;

    zzyb(zzyl zzylVar, Class cls) {
        this.zza = cls;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzyz
    public final Object zza() {
        try {
            return zzzk.zzc.zza(this.zza);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + String.valueOf(this.zza) + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }
}
