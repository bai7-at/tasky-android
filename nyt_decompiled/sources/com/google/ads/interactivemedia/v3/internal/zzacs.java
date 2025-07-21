package com.google.ads.interactivemedia.v3.internal;

import java.sql.Date;
import java.sql.Timestamp;

/* loaded from: classes2.dex */
public final class zzacs {
    public static final boolean zza;
    public static final zzzs zzb;
    public static final zzzs zzc;
    public static final zzxj zzd;
    public static final zzxj zze;
    public static final zzxj zzf;

    static {
        boolean z;
        zzxj zzxjVar;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        zza = z;
        if (z) {
            zzb = new zzacq(Date.class);
            zzc = new zzacr(Timestamp.class);
            zzd = zzacj.zza;
            zze = zzacm.zza;
            zzxjVar = zzacp.zza;
        } else {
            zzxjVar = null;
            zzb = null;
            zzc = null;
            zzd = null;
            zze = null;
        }
        zzf = zzxjVar;
    }
}
