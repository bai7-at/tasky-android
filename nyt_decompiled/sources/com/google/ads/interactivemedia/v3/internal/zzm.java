package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
public final class zzm extends zzaet implements zzaga {
    private static final zzm zzb;
    private int zzd;
    private int zze;
    private boolean zzh;
    private boolean zzf = true;
    private String zzg = "unknown_host";
    private boolean zzi = true;

    static {
        zzm zzmVar = new zzm();
        zzb = zzmVar;
        zzaet.zzaM(zzm.class, zzmVar);
    }

    private zzm() {
    }

    public static zzl zza() {
        return (zzl) zzb.zzay();
    }

    static /* synthetic */ void zzd(zzm zzmVar, boolean z) {
        zzmVar.zzd |= 16;
        zzmVar.zzi = false;
    }

    static /* synthetic */ void zze(zzm zzmVar, String str) {
        zzmVar.zzd |= 4;
        zzmVar.zzg = "a.3.30.3";
    }

    static /* synthetic */ void zzf(zzm zzmVar, boolean z) {
        zzmVar.zzd |= 8;
        zzmVar.zzh = false;
    }

    static /* synthetic */ void zzl(zzm zzmVar, int i) {
        zzmVar.zze = i - 1;
        zzmVar.zzd |= 1;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final boolean zzg() {
        return this.zzh;
    }

    public final boolean zzh() {
        return this.zzi;
    }

    public final boolean zzi() {
        return this.zzf;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaet.zzaJ(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"zzd", "zze", zzo.zza, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzm();
        }
        zzk zzkVar = null;
        if (i2 == 4) {
            return new zzl(zzkVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzk() {
        int zza = zzp.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
