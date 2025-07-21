package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
public final class zzbg extends zzaet implements zzaga {
    private static final zzbg zzb;
    private int zzd;
    private zzadr zze;
    private zzadr zzf;
    private zzadr zzg;
    private zzadr zzh;

    static {
        zzbg zzbgVar = new zzbg();
        zzb = zzbgVar;
        zzaet.zzaM(zzbg.class, zzbgVar);
    }

    private zzbg() {
        zzadr zzadrVar = zzadr.zzb;
        this.zze = zzadrVar;
        this.zzf = zzadrVar;
        this.zzg = zzadrVar;
        this.zzh = zzadrVar;
    }

    public static zzbf zza() {
        return (zzbf) zzb.zzay();
    }

    public static zzbg zzc(byte[] bArr, zzaef zzaefVar) throws zzafc {
        return (zzbg) zzaet.zzaD(zzb, bArr, zzaefVar);
    }

    static /* synthetic */ void zzh(zzbg zzbgVar, zzadr zzadrVar) {
        zzbgVar.zzd |= 1;
        zzbgVar.zze = zzadrVar;
    }

    static /* synthetic */ void zzi(zzbg zzbgVar, zzadr zzadrVar) {
        zzbgVar.zzd |= 2;
        zzbgVar.zzf = zzadrVar;
    }

    static /* synthetic */ void zzk(zzbg zzbgVar, zzadr zzadrVar) {
        zzbgVar.zzd |= 4;
        zzbgVar.zzg = zzadrVar;
    }

    static /* synthetic */ void zzl(zzbg zzbgVar, zzadr zzadrVar) {
        zzbgVar.zzd |= 8;
        zzbgVar.zzh = zzadrVar;
    }

    public final zzadr zzd() {
        return this.zze;
    }

    public final zzadr zze() {
        return this.zzf;
    }

    public final zzadr zzf() {
        return this.zzh;
    }

    public final zzadr zzg() {
        return this.zzg;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaet.zzaJ(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzbg();
        }
        zzae zzaeVar = null;
        if (i2 == 4) {
            return new zzbf(zzaeVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
