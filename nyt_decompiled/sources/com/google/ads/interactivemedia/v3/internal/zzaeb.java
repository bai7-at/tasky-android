package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
final class zzaeb implements zzaib {
    private final zzaea zza;

    private zzaeb(zzaea zzaeaVar) {
        byte[] bArr = zzafa.zzd;
        this.zza = zzaeaVar;
        zzaeaVar.zza = this;
    }

    public static zzaeb zza(zzaea zzaeaVar) {
        zzaeb zzaebVar = zzaeaVar.zza;
        return zzaebVar != null ? zzaebVar : new zzaeb(zzaeaVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzA(int i, int i2) throws IOException {
        zzaea zzaeaVar = this.zza;
        zzaeaVar.zzp(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzB(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzaea zzaeaVar = this.zza;
                int intValue = ((Integer) list.get(i2)).intValue();
                zzaeaVar.zzp(i, (intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += zzaea.zzx((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            zzaea zzaeaVar2 = this.zza;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            zzaeaVar2.zzq((intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzC(int i, long j) throws IOException {
        zzaea zzaeaVar = this.zza;
        zzaeaVar.zzr(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzD(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzaea zzaeaVar = this.zza;
                long longValue = ((Long) list.get(i2)).longValue();
                zzaeaVar.zzr(i, (longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += zzaea.zzy((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            zzaea zzaeaVar2 = this.zza;
            long longValue3 = ((Long) list.get(i2)).longValue();
            zzaeaVar2.zzs((longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    @Deprecated
    public final void zzE(int i) throws IOException {
        this.zza.zzo(i, 3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzF(int i, String str) throws IOException {
        this.zza.zzm(i, str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzG(int i, List list) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzafh)) {
            while (i2 < list.size()) {
                this.zza.zzm(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzafh zzafhVar = (zzafh) list;
        while (i2 < list.size()) {
            Object zzf = zzafhVar.zzf(i2);
            if (zzf instanceof String) {
                this.zza.zzm(i, (String) zzf);
            } else {
                this.zza.zze(i, (zzadr) zzf);
            }
            i2++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzH(int i, int i2) throws IOException {
        this.zza.zzp(i, i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzI(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzp(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzaea.zzx(((Integer) list.get(i4)).intValue());
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzq(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzJ(int i, long j) throws IOException {
        this.zza.zzr(i, j);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzK(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzr(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzaea.zzy(((Long) list.get(i4)).longValue());
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzs(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzb(int i, boolean z) throws IOException {
        this.zza.zzd(i, z);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzc(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzd(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).booleanValue();
            i3++;
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzb(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzd(int i, zzadr zzadrVar) throws IOException {
        this.zza.zze(i, zzadrVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zze(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zze(i, (zzadr) list.get(i2));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzf(int i, double d) throws IOException {
        this.zza.zzh(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzg(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).doubleValue();
            i3 += 8;
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    @Deprecated
    public final void zzh(int i) throws IOException {
        this.zza.zzo(i, 4);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzi(int i, int i2) throws IOException {
        this.zza.zzj(i, i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzj(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzj(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzaea.zzu(((Integer) list.get(i4)).intValue());
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzk(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzk(int i, int i2) throws IOException {
        this.zza.zzf(i, i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzl(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzf(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzg(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzm(int i, long j) throws IOException {
        this.zza.zzh(i, j);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzn(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzh(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzi(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzo(int i, float f) throws IOException {
        this.zza.zzf(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzp(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzf(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).floatValue();
            i3 += 4;
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzq(int i, Object obj, zzags zzagsVar) throws IOException {
        zzaea zzaeaVar = this.zza;
        zzaeaVar.zzo(i, 3);
        zzagsVar.zzj((zzafz) obj, zzaeaVar.zza);
        zzaeaVar.zzo(i, 4);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzr(int i, int i2) throws IOException {
        this.zza.zzj(i, i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzs(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzj(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzaea.zzu(((Integer) list.get(i4)).intValue());
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzk(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzt(int i, long j) throws IOException {
        this.zza.zzr(i, j);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzu(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzr(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzaea.zzy(((Long) list.get(i4)).longValue());
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzs(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzv(int i, Object obj, zzags zzagsVar) throws IOException {
        zzafz zzafzVar = (zzafz) obj;
        zzadx zzadxVar = (zzadx) this.zza;
        zzadxVar.zzq((i << 3) | 2);
        zzadxVar.zzq(((zzadb) zzafzVar).zzat(zzagsVar));
        zzagsVar.zzj(zzafzVar, zzadxVar.zza);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzw(int i, int i2) throws IOException {
        this.zza.zzf(i, i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzx(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzf(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzg(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzy(int i, long j) throws IOException {
        this.zza.zzh(i, j);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaib
    public final void zzz(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzh(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzi(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
