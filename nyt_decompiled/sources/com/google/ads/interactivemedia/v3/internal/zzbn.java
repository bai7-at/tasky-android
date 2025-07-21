package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
public final class zzbn extends zzaet implements zzaga {
    private static final zzbn zzb;
    private int zzd;
    private String zze = "";

    static {
        zzbn zzbnVar = new zzbn();
        zzb = zzbnVar;
        zzaet.zzaM(zzbn.class, zzbnVar);
    }

    private zzbn() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaet.zzaJ(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzbn();
        }
        zzae zzaeVar = null;
        if (i2 == 4) {
            return new zzbm(zzaeVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
