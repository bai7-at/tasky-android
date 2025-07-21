package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes2.dex */
abstract class zzahj {
    zzahj() {
    }

    abstract int zza(Object obj);

    abstract int zzb(Object obj);

    abstract Object zzc(Object obj);

    abstract Object zzd(Object obj);

    abstract Object zze(Object obj, Object obj2);

    abstract Object zzf();

    abstract Object zzg(Object obj);

    abstract void zzh(Object obj, int i, int i2);

    abstract void zzi(Object obj, int i, long j);

    abstract void zzj(Object obj, int i, Object obj2);

    abstract void zzk(Object obj, int i, zzadr zzadrVar);

    abstract void zzl(Object obj, int i, long j);

    abstract void zzm(Object obj);

    abstract void zzn(Object obj, Object obj2);

    abstract void zzo(Object obj, Object obj2);

    abstract void zzp(Object obj, zzaib zzaibVar) throws IOException;

    final boolean zzq(Object obj, zzagk zzagkVar) throws IOException {
        int zzd = zzagkVar.zzd();
        int i = zzd >>> 3;
        int i2 = zzd & 7;
        if (i2 == 0) {
            zzl(obj, i, zzagkVar.zzl());
            return true;
        }
        if (i2 == 1) {
            zzi(obj, i, zzagkVar.zzk());
            return true;
        }
        if (i2 == 2) {
            zzk(obj, i, zzagkVar.zzp());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzafc.zza();
            }
            zzh(obj, i, zzagkVar.zzf());
            return true;
        }
        Object zzf = zzf();
        int i3 = i << 3;
        while (zzagkVar.zzc() != Integer.MAX_VALUE && zzq(zzf, zzagkVar)) {
        }
        if ((4 | i3) != zzagkVar.zzd()) {
            throw zzafc.zzb();
        }
        zzg(zzf);
        zzj(obj, i, zzf);
        return true;
    }

    abstract boolean zzr(zzagk zzagkVar);
}
