package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
public final class zzmm extends zzaet implements zzaga {
    private static final zzmm zzb;
    private int zzd;
    private zzmp zze;
    private zzadr zzf;
    private zzadr zzg;

    static {
        zzmm zzmmVar = new zzmm();
        zzb = zzmmVar;
        zzaet.zzaM(zzmm.class, zzmmVar);
    }

    private zzmm() {
        zzadr zzadrVar = zzadr.zzb;
        this.zzf = zzadrVar;
        this.zzg = zzadrVar;
    }

    public static zzmm zzb(zzadr zzadrVar, zzaef zzaefVar) throws zzafc {
        return (zzmm) zzaet.zzaC(zzb, zzadrVar, zzaefVar);
    }

    public final zzmp zzc() {
        zzmp zzmpVar = this.zze;
        return zzmpVar == null ? zzmp.zzf() : zzmpVar;
    }

    public final zzadr zzd() {
        return this.zzg;
    }

    public final zzadr zze() {
        return this.zzf;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaet.zzaJ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzmm();
        }
        zzmk zzmkVar = null;
        if (i2 == 4) {
            return new zzml(zzmkVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
