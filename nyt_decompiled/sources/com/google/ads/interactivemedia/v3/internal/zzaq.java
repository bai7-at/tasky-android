package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
public final class zzaq extends zzaet implements zzaga {
    private static final zzaq zzb;
    private int zzd;
    private long zze = -1;

    static {
        zzaq zzaqVar = new zzaq();
        zzb = zzaqVar;
        zzaet.zzaM(zzaq.class, zzaqVar);
    }

    private zzaq() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaet.zzaJ(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzaq();
        }
        zzae zzaeVar = null;
        if (i2 == 4) {
            return new zzap(zzaeVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
