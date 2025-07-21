package com.google.ads.interactivemedia.omid.library.adsession;

import com.google.ads.interactivemedia.v3.internal.zzcn;
import com.google.ads.interactivemedia.v3.internal.zzcp;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzb {
    private final zzh zza;
    private final zzh zzb;
    private final zzf zzc;
    private final zzg zzd;

    private zzb(zzf zzfVar, zzg zzgVar, zzh zzhVar, zzh zzhVar2, boolean z) {
        this.zzc = zzfVar;
        this.zzd = zzgVar;
        this.zza = zzhVar;
        if (zzhVar2 == null) {
            this.zzb = zzh.NONE;
        } else {
            this.zzb = zzhVar2;
        }
    }

    public static zzb zza(zzf zzfVar, zzg zzgVar, zzh zzhVar, zzh zzhVar2, boolean z) {
        zzcp.zzb(zzfVar, "CreativeType is null");
        zzcp.zzb(zzgVar, "ImpressionType is null");
        zzcp.zzb(zzhVar, "Impression owner is null");
        if (zzhVar == zzh.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (zzfVar == zzf.DEFINED_BY_JAVASCRIPT && zzhVar == zzh.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (zzgVar == zzg.DEFINED_BY_JAVASCRIPT && zzhVar == zzh.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new zzb(zzfVar, zzgVar, zzhVar, zzhVar2, true);
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        zzcn.zze(jSONObject, "impressionOwner", this.zza);
        zzcn.zze(jSONObject, "mediaEventsOwner", this.zzb);
        zzcn.zze(jSONObject, "creativeType", this.zzc);
        zzcn.zze(jSONObject, "impressionType", this.zzd);
        zzcn.zze(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }
}
