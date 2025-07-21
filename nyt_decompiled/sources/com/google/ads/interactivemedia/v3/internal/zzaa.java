package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
public final class zzaa extends zzaet implements zzaga {
    private static final zzaa zzb;
    private int zzd;
    private int zze = 2;

    static {
        zzaa zzaaVar = new zzaa();
        zzb = zzaaVar;
        zzaet.zzaM(zzaa.class, zzaaVar);
    }

    private zzaa() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaet.zzaJ(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zzd", "zze", zzab.zza});
        }
        if (i2 == 3) {
            return new zzaa();
        }
        zzw zzwVar = null;
        if (i2 == 4) {
            return new zzz(zzwVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
