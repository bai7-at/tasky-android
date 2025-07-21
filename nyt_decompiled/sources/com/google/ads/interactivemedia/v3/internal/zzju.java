package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzju extends zzhz {
    public Long zza;
    public Long zzb;
    public Long zzc;

    public zzju() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzhz
    protected final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        hashMap.put(2, this.zzc);
        return hashMap;
    }

    public zzju(String str) {
        HashMap zza = zzhz.zza(str);
        if (zza != null) {
            this.zza = (Long) zza.get(0);
            this.zzb = (Long) zza.get(1);
            this.zzc = (Long) zza.get(2);
        }
    }
}
