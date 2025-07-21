package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
public final class zzbe extends zzaet implements zzaga {
    private static final zzbe zzb;
    private int zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzaey zzh = zzaet.zzaE();
    private long zzi;

    static {
        zzbe zzbeVar = new zzbe();
        zzb = zzbeVar;
        zzaet.zzaM(zzbe.class, zzbeVar);
    }

    private zzbe() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaet.zzaJ(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzbe();
        }
        zzae zzaeVar = null;
        if (i2 == 4) {
            return new zzbd(zzaeVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
