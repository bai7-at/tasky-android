package com.google.ads.interactivemedia.v3.internal;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzib extends zzhz {
    public String zza;
    public long zzb;
    public String zzc;
    public String zzd;
    public String zze;

    public zzib() {
        this.zza = QueryKeys.ENGAGED_SECONDS;
        this.zzb = -1L;
        this.zzc = QueryKeys.ENGAGED_SECONDS;
        this.zzd = QueryKeys.ENGAGED_SECONDS;
        this.zze = QueryKeys.ENGAGED_SECONDS;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzhz
    protected final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(4, this.zze);
        hashMap.put(3, this.zzd);
        hashMap.put(2, this.zzc);
        hashMap.put(1, Long.valueOf(this.zzb));
        return hashMap;
    }

    public zzib(String str) {
        String str2 = QueryKeys.ENGAGED_SECONDS;
        this.zza = QueryKeys.ENGAGED_SECONDS;
        this.zzb = -1L;
        this.zzc = QueryKeys.ENGAGED_SECONDS;
        this.zzd = QueryKeys.ENGAGED_SECONDS;
        this.zze = QueryKeys.ENGAGED_SECONDS;
        HashMap zza = zzhz.zza(str);
        if (zza != null) {
            this.zza = zza.get(0) == null ? QueryKeys.ENGAGED_SECONDS : (String) zza.get(0);
            this.zzb = zza.get(1) != null ? ((Long) zza.get(1)).longValue() : -1L;
            this.zzc = zza.get(2) == null ? QueryKeys.ENGAGED_SECONDS : (String) zza.get(2);
            this.zzd = zza.get(3) == null ? QueryKeys.ENGAGED_SECONDS : (String) zza.get(3);
            this.zze = zza.get(4) != null ? (String) zza.get(4) : str2;
        }
    }
}
