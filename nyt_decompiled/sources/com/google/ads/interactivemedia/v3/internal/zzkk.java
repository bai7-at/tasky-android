package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzkk extends zzhz {
    public Long zza;
    public Boolean zzb;
    public Boolean zzc;

    public zzkk() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzhz
    protected final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        hashMap.put(2, this.zzc);
        return hashMap;
    }

    public zzkk(String str) {
        HashMap zza = zzhz.zza(str);
        if (zza != null) {
            this.zza = (Long) zza.get(0);
            this.zzb = (Boolean) zza.get(1);
            this.zzc = (Boolean) zza.get(2);
        }
    }
}
