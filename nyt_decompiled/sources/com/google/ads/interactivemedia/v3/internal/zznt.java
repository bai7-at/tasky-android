package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
public final class zznt {
    private final String zza;
    private final Object zzb;

    protected zznt(String str, Object obj, int i) {
        this.zza = str;
        this.zzb = obj;
    }

    public static zznt zza(String str, boolean z) {
        return new zznt(str, Boolean.valueOf(z), 1);
    }

    public final Object zzb() {
        zznw zza = zzny.zza();
        if (zza != null) {
            return zza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (zzny.zzb() != null) {
            zzny.zzb().zza();
        }
        return this.zzb;
    }
}
