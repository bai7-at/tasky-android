package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
public final class zzbb extends zzaet implements zzaga {
    private static final zzbb zzb;
    private int zzd;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;

    static {
        zzbb zzbbVar = new zzbb();
        zzb = zzbbVar;
        zzaet.zzaM(zzbb.class, zzbbVar);
    }

    private zzbb() {
    }

    public static zzba zza() {
        return (zzba) zzb.zzay();
    }

    static /* synthetic */ void zzc(zzbb zzbbVar, long j) {
        zzbbVar.zzd |= 1;
        zzbbVar.zze = j;
    }

    static /* synthetic */ void zzd(zzbb zzbbVar, long j) {
        zzbbVar.zzd |= 4;
        zzbbVar.zzg = j;
    }

    static /* synthetic */ void zze(zzbb zzbbVar, long j) {
        zzbbVar.zzd |= 8;
        zzbbVar.zzh = j;
    }

    static /* synthetic */ void zzf(zzbb zzbbVar, long j) {
        zzbbVar.zzd |= 16;
        zzbbVar.zzi = j;
    }

    static /* synthetic */ void zzg(zzbb zzbbVar, long j) {
        zzbbVar.zzd |= 32;
        zzbbVar.zzj = j;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaet.zzaJ(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzbb();
        }
        zzae zzaeVar = null;
        if (i2 == 4) {
            return new zzba(zzaeVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
