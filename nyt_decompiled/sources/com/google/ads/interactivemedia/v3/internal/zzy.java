package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
public final class zzy extends zzaet implements zzaga {
    private static final zzy zzb;
    private int zzd;
    private zzaa zze;
    private zzad zzf;

    static {
        zzy zzyVar = new zzy();
        zzb = zzyVar;
        zzaet.zzaM(zzy.class, zzyVar);
    }

    private zzy() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaet.zzaJ(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzy();
        }
        zzw zzwVar = null;
        if (i2 == 4) {
            return new zzx(zzwVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
