package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
public final class zzbl extends zzaet implements zzaga {
    private static final zzbl zzb;
    private int zzd;
    private long zze;
    private String zzf = "";
    private zzadr zzg = zzadr.zzb;

    static {
        zzbl zzblVar = new zzbl();
        zzb = zzblVar;
        zzaet.zzaM(zzbl.class, zzblVar);
    }

    private zzbl() {
    }

    public static zzbl zzc() {
        return zzb;
    }

    public final long zza() {
        return this.zze;
    }

    public final boolean zzd() {
        return (this.zzd & 1) != 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaet.zzaJ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzbl();
        }
        zzae zzaeVar = null;
        if (i2 == 4) {
            return new zzbk(zzaeVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
