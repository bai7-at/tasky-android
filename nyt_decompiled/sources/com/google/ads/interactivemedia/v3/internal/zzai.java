package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
public final class zzai extends zzaet implements zzaga {
    private static final zzai zzb;
    private int zzd;
    private int zze;

    static {
        zzai zzaiVar = new zzai();
        zzb = zzaiVar;
        zzaet.zzaM(zzai.class, zzaiVar);
    }

    private zzai() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaet.zzaJ(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzd", "zze", zzam.zza});
        }
        if (i2 == 3) {
            return new zzai();
        }
        zzae zzaeVar = null;
        if (i2 == 4) {
            return new zzah(zzaeVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
