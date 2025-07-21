package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
public final class zzbp extends zzaet implements zzaga {
    private static final zzbp zzb;
    private int zzd;
    private zzaez zze = zzaet.zzaF();
    private zzadr zzf = zzadr.zzb;
    private int zzg = 1;
    private int zzh = 1;

    static {
        zzbp zzbpVar = new zzbp();
        zzb = zzbpVar;
        zzaet.zzaM(zzbp.class, zzbpVar);
    }

    private zzbp() {
    }

    public static zzbo zza() {
        return (zzbo) zzb.zzay();
    }

    static /* synthetic */ void zzc(zzbp zzbpVar, zzadr zzadrVar) {
        zzaez zzaezVar = zzbpVar.zze;
        if (!zzaezVar.zzc()) {
            zzbpVar.zze = zzaet.zzaG(zzaezVar);
        }
        zzbpVar.zze.add(zzadrVar);
    }

    static /* synthetic */ void zzd(zzbp zzbpVar, zzadr zzadrVar) {
        zzbpVar.zzd |= 1;
        zzbpVar.zzf = zzadrVar;
    }

    static /* synthetic */ void zze(zzbp zzbpVar, int i) {
        zzbpVar.zzh = 4;
        zzbpVar.zzd = 4 | zzbpVar.zzd;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaet.zzaJ(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", zzbj.zza, "zzh", zzbh.zza});
        }
        if (i2 == 3) {
            return new zzbp();
        }
        zzae zzaeVar = null;
        if (i2 == 4) {
            return new zzbo(zzaeVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
