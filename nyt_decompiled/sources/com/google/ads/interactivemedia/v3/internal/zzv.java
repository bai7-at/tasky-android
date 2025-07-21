package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.event.ProgressEvent;

/* loaded from: classes2.dex */
public final class zzv extends zzaet implements zzaga {
    private static final zzv zzb;
    private int zzd;
    private long zzf;
    private long zzj;
    private long zzk;
    private long zzm;
    private int zzq;
    private String zze = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzl = "";
    private String zzn = "";
    private String zzo = "";
    private zzaez zzp = zzaet.zzaF();

    static {
        zzv zzvVar = new zzv();
        zzb = zzvVar;
        zzaet.zzaM(zzv.class, zzvVar);
    }

    private zzv() {
    }

    public static zzr zza() {
        return (zzr) zzb.zzay();
    }

    static /* synthetic */ void zzc(zzv zzvVar, long j) {
        zzvVar.zzd |= 2;
        zzvVar.zzf = j;
    }

    static /* synthetic */ void zzd(zzv zzvVar, String str) {
        str.getClass();
        zzvVar.zzd |= 4;
        zzvVar.zzg = str;
    }

    static /* synthetic */ void zze(zzv zzvVar, String str) {
        str.getClass();
        zzvVar.zzd |= 8;
        zzvVar.zzh = str;
    }

    static /* synthetic */ void zzf(zzv zzvVar, String str) {
        zzvVar.zzd |= 16;
        zzvVar.zzi = str;
    }

    static /* synthetic */ void zzg(zzv zzvVar, String str) {
        zzvVar.zzd |= 1024;
        zzvVar.zzo = str;
    }

    static /* synthetic */ void zzh(zzv zzvVar, String str) {
        str.getClass();
        zzvVar.zzd |= 1;
        zzvVar.zze = str;
    }

    static /* synthetic */ void zzi(zzv zzvVar, int i) {
        zzvVar.zzq = i - 1;
        zzvVar.zzd |= ProgressEvent.PART_COMPLETED_EVENT_CODE;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaet.zzaJ(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", zzt.class, "zzq", zzu.zza});
        }
        if (i2 == 3) {
            return new zzv();
        }
        zzq zzqVar = null;
        if (i2 == 4) {
            return new zzr(zzqVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
