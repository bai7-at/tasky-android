package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
public final class zzav extends zzaet implements zzaga {
    private static final zzav zzb;
    private int zzd;
    private int zze;
    private long zzf = -1;

    static {
        zzav zzavVar = new zzav();
        zzb = zzavVar;
        zzaet.zzaM(zzav.class, zzavVar);
    }

    private zzav() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaet.zzaJ(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", zzak.zza, "zzf"});
        }
        if (i2 == 3) {
            return new zzav();
        }
        zzae zzaeVar = null;
        if (i2 == 4) {
            return new zzau(zzaeVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
