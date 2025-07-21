package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
public final class zzt extends zzaet implements zzaga {
    private static final zzt zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzt zztVar = new zzt();
        zzb = zztVar;
        zzaet.zzaM(zzt.class, zztVar);
    }

    private zzt() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaet.zzaJ(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzt();
        }
        zzq zzqVar = null;
        if (i2 == 4) {
            return new zzs(zzqVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
