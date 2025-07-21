package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzjz extends zzhz {
    public long zza;
    public long zzb;

    public zzjz() {
        this.zza = -1L;
        this.zzb = -1L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzhz
    protected final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, Long.valueOf(this.zza));
        hashMap.put(1, Long.valueOf(this.zzb));
        return hashMap;
    }

    public zzjz(String str) {
        this.zza = -1L;
        this.zzb = -1L;
        HashMap zza = zzhz.zza(str);
        if (zza != null) {
            this.zza = ((Long) zza.get(0)).longValue();
            this.zzb = ((Long) zza.get(1)).longValue();
        }
    }
}
