package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzkv extends zzhz {
    public Long zza;
    public Long zzb;
    public Long zzc;
    public Long zzd;
    public Long zze;
    public Long zzf;
    public Long zzg;
    public Long zzh;
    public Long zzi;
    public Long zzj;
    public Long zzk;

    public zzkv() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzhz
    protected final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        hashMap.put(2, this.zzc);
        hashMap.put(3, this.zzd);
        hashMap.put(4, this.zze);
        hashMap.put(5, this.zzf);
        hashMap.put(6, this.zzg);
        hashMap.put(7, this.zzh);
        hashMap.put(8, this.zzi);
        hashMap.put(9, this.zzj);
        hashMap.put(10, this.zzk);
        return hashMap;
    }

    public zzkv(String str) {
        HashMap zza = zzhz.zza(str);
        if (zza != null) {
            this.zza = (Long) zza.get(0);
            this.zzb = (Long) zza.get(1);
            this.zzc = (Long) zza.get(2);
            this.zzd = (Long) zza.get(3);
            this.zze = (Long) zza.get(4);
            this.zzf = (Long) zza.get(5);
            this.zzg = (Long) zza.get(6);
            this.zzh = (Long) zza.get(7);
            this.zzi = (Long) zza.get(8);
            this.zzj = (Long) zza.get(9);
            this.zzk = (Long) zza.get(10);
        }
    }
}
