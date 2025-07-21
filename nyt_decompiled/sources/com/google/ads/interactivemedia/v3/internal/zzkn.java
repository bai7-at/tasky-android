package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import com.chartbeat.androidsdk.QueryKeys;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzkn implements zzql {
    private final zzpa zza;
    private final zzpp zzb;
    private final zzla zzc;
    private final zzkm zzd;
    private final zzjw zze;
    private final zzlc zzf;
    private final zzku zzg;
    private final zzkl zzh;

    zzkn(zzpa zzpaVar, zzpp zzppVar, zzla zzlaVar, zzkm zzkmVar, zzjw zzjwVar, zzlc zzlcVar, zzku zzkuVar, zzkl zzklVar) {
        this.zza = zzpaVar;
        this.zzb = zzppVar;
        this.zzc = zzlaVar;
        this.zzd = zzkmVar;
        this.zze = zzjwVar;
        this.zzf = zzlcVar;
        this.zzg = zzkuVar;
        this.zzh = zzklVar;
    }

    private final Map zze() {
        HashMap hashMap = new HashMap();
        zzbc zzb = this.zzb.zzb();
        hashMap.put(QueryKeys.INTERNAL_REFERRER, this.zza.zzb());
        hashMap.put("gms", Boolean.valueOf(this.zza.zzc()));
        hashMap.put("int", zzb.zzg());
        hashMap.put("up", Boolean.valueOf(this.zzd.zza()));
        hashMap.put(QueryKeys.TOKEN, new Throwable());
        zzku zzkuVar = this.zzg;
        if (zzkuVar != null) {
            hashMap.put("tcq", Long.valueOf(zzkuVar.zzc()));
            hashMap.put("tpq", Long.valueOf(this.zzg.zzg()));
            hashMap.put("tcv", Long.valueOf(this.zzg.zzd()));
            hashMap.put("tpv", Long.valueOf(this.zzg.zzh()));
            hashMap.put("tchv", Long.valueOf(this.zzg.zzb()));
            hashMap.put("tphv", Long.valueOf(this.zzg.zzf()));
            hashMap.put("tcc", Long.valueOf(this.zzg.zza()));
            hashMap.put("tpc", Long.valueOf(this.zzg.zze()));
        }
        return hashMap;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzql
    public final Map zza() {
        Map zze = zze();
        zze.put("lts", Long.valueOf(this.zzc.zza()));
        return zze;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzql
    public final Map zzb() {
        Map zze = zze();
        zzbc zza = this.zzb.zza();
        zze.put("gai", Boolean.valueOf(this.zza.zzd()));
        zze.put("did", zza.zzf());
        zze.put("dst", Integer.valueOf(zza.zzal() - 1));
        zze.put("doo", Boolean.valueOf(zza.zzai()));
        zzjw zzjwVar = this.zze;
        if (zzjwVar != null) {
            zze.put("nt", Long.valueOf(zzjwVar.zza()));
        }
        zzlc zzlcVar = this.zzf;
        if (zzlcVar != null) {
            zze.put("vs", Long.valueOf(zzlcVar.zzc()));
            zze.put("vf", Long.valueOf(this.zzf.zzb()));
        }
        return zze;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzql
    public final Map zzc() {
        Map zze = zze();
        zzkl zzklVar = this.zzh;
        if (zzklVar != null) {
            zze.put("vst", zzklVar.zza());
        }
        return zze;
    }

    final void zzd(View view) {
        this.zzc.zzd(view);
    }
}
