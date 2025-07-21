package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzagd implements zzags {
    private final zzafz zza;
    private final zzahj zzb;
    private final boolean zzc;
    private final zzaeg zzd;

    private zzagd(zzahj zzahjVar, zzaeg zzaegVar, zzafz zzafzVar) {
        this.zzb = zzahjVar;
        this.zzc = zzaegVar.zzh(zzafzVar);
        this.zzd = zzaegVar;
        this.zza = zzafzVar;
    }

    static zzagd zzc(zzahj zzahjVar, zzaeg zzaegVar, zzafz zzafzVar) {
        return new zzagd(zzahjVar, zzaegVar, zzafzVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final int zza(Object obj) {
        zzahj zzahjVar = this.zzb;
        int zzb = zzahjVar.zzb(zzahjVar.zzd(obj));
        if (!this.zzc) {
            return zzb;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        if (!this.zzc) {
            return hashCode;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final Object zze() {
        zzafz zzafzVar = this.zza;
        return zzafzVar instanceof zzaet ? ((zzaet) zzafzVar).zzaA() : zzafzVar.zzaH().zzam();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zze(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final void zzg(Object obj, Object obj2) {
        zzagu.zzD(this.zzb, obj, obj2);
        if (this.zzc) {
            this.zzd.zza(obj2);
            throw null;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final void zzh(Object obj, zzagk zzagkVar, zzaef zzaefVar) throws IOException {
        boolean zzO;
        zzahj zzahjVar = this.zzb;
        zzaeg zzaegVar = this.zzd;
        Object zzc = zzahjVar.zzc(obj);
        zzaek zzb = zzaegVar.zzb(obj);
        while (zzagkVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzagkVar.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object zzc2 = zzaegVar.zzc(zzaefVar, this.zza, zzd >>> 3);
                        if (zzc2 != null) {
                            zzaegVar.zzf(zzagkVar, zzc2, zzaefVar, zzb);
                        } else {
                            zzO = zzahjVar.zzq(zzc, zzagkVar);
                        }
                    } else {
                        zzO = zzagkVar.zzO();
                    }
                    if (!zzO) {
                        zzahjVar.zzn(obj, zzc);
                        return;
                    }
                } else {
                    Object obj2 = null;
                    int i = 0;
                    zzadr zzadrVar = null;
                    while (zzagkVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzagkVar.zzd();
                        if (zzd2 == 16) {
                            i = zzagkVar.zzj();
                            obj2 = zzaegVar.zzc(zzaefVar, this.zza, i);
                        } else if (zzd2 == 26) {
                            if (obj2 != null) {
                                zzaegVar.zzf(zzagkVar, obj2, zzaefVar, zzb);
                            } else {
                                zzadrVar = zzagkVar.zzp();
                            }
                        } else if (!zzagkVar.zzO()) {
                            break;
                        }
                    }
                    if (zzagkVar.zzd() != 12) {
                        throw zzafc.zzb();
                    }
                    if (zzadrVar != null) {
                        if (obj2 != null) {
                            zzaegVar.zzg(zzadrVar, obj2, zzaefVar, zzb);
                        } else {
                            zzahjVar.zzk(zzc, i, zzadrVar);
                        }
                    }
                }
            } catch (Throwable th) {
                zzahjVar.zzn(obj, zzc);
                throw th;
            }
        }
        zzahjVar.zzn(obj, zzc);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzade zzadeVar) throws IOException {
        zzaet zzaetVar = (zzaet) obj;
        if (zzaetVar.zzc == zzahk.zzc()) {
            zzaetVar.zzc = zzahk.zzf();
        }
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final void zzj(Object obj, zzaib zzaibVar) throws IOException {
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final boolean zzk(Object obj, Object obj2) {
        if (!this.zzb.zzd(obj).equals(this.zzb.zzd(obj2))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zza(obj);
        this.zzd.zza(obj2);
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final boolean zzl(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }
}
