package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzadf {
    static int zza(byte[] bArr, int i, zzade zzadeVar) throws zzafc {
        int zzj = zzj(bArr, i, zzadeVar);
        int i2 = zzadeVar.zza;
        if (i2 < 0) {
            throw zzafc.zzf();
        }
        if (i2 > bArr.length - zzj) {
            throw zzafc.zzi();
        }
        if (i2 == 0) {
            zzadeVar.zzc = zzadr.zzb;
            return zzj;
        }
        zzadeVar.zzc = zzadr.zzs(bArr, zzj, i2);
        return zzj + i2;
    }

    static int zzb(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static int zzc(zzags zzagsVar, byte[] bArr, int i, int i2, int i3, zzade zzadeVar) throws IOException {
        Object zze = zzagsVar.zze();
        int zzn = zzn(zze, zzagsVar, bArr, i, i2, i3, zzadeVar);
        zzagsVar.zzf(zze);
        zzadeVar.zzc = zze;
        return zzn;
    }

    static int zzd(zzags zzagsVar, byte[] bArr, int i, int i2, zzade zzadeVar) throws IOException {
        Object zze = zzagsVar.zze();
        int zzo = zzo(zze, zzagsVar, bArr, i, i2, zzadeVar);
        zzagsVar.zzf(zze);
        zzadeVar.zzc = zze;
        return zzo;
    }

    static int zze(zzags zzagsVar, int i, byte[] bArr, int i2, int i3, zzaez zzaezVar, zzade zzadeVar) throws IOException {
        int zzd = zzd(zzagsVar, bArr, i2, i3, zzadeVar);
        zzaezVar.add(zzadeVar.zzc);
        while (zzd < i3) {
            int zzj = zzj(bArr, zzd, zzadeVar);
            if (i != zzadeVar.zza) {
                break;
            }
            zzd = zzd(zzagsVar, bArr, zzj, i3, zzadeVar);
            zzaezVar.add(zzadeVar.zzc);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i, zzaez zzaezVar, zzade zzadeVar) throws IOException {
        zzaeu zzaeuVar = (zzaeu) zzaezVar;
        int zzj = zzj(bArr, i, zzadeVar);
        int i2 = zzadeVar.zza + zzj;
        while (zzj < i2) {
            zzj = zzj(bArr, zzj, zzadeVar);
            zzaeuVar.zzg(zzadeVar.zza);
        }
        if (zzj == i2) {
            return zzj;
        }
        throw zzafc.zzi();
    }

    static int zzg(byte[] bArr, int i, zzade zzadeVar) throws zzafc {
        int zzj = zzj(bArr, i, zzadeVar);
        int i2 = zzadeVar.zza;
        if (i2 < 0) {
            throw zzafc.zzf();
        }
        if (i2 == 0) {
            zzadeVar.zzc = "";
            return zzj;
        }
        zzadeVar.zzc = new String(bArr, zzj, i2, zzafa.zzb);
        return zzj + i2;
    }

    static int zzh(byte[] bArr, int i, zzade zzadeVar) throws zzafc {
        int zzj = zzj(bArr, i, zzadeVar);
        int i2 = zzadeVar.zza;
        if (i2 < 0) {
            throw zzafc.zzf();
        }
        if (i2 == 0) {
            zzadeVar.zzc = "";
            return zzj;
        }
        zzadeVar.zzc = zzahy.zzg(bArr, zzj, i2);
        return zzj + i2;
    }

    static int zzi(int i, byte[] bArr, int i2, int i3, zzahk zzahkVar, zzade zzadeVar) throws zzafc {
        if ((i >>> 3) == 0) {
            throw zzafc.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int zzm = zzm(bArr, i2, zzadeVar);
            zzahkVar.zzj(i, Long.valueOf(zzadeVar.zzb));
            return zzm;
        }
        if (i4 == 1) {
            zzahkVar.zzj(i, Long.valueOf(zzp(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int zzj = zzj(bArr, i2, zzadeVar);
            int i5 = zzadeVar.zza;
            if (i5 < 0) {
                throw zzafc.zzf();
            }
            if (i5 > bArr.length - zzj) {
                throw zzafc.zzi();
            }
            if (i5 == 0) {
                zzahkVar.zzj(i, zzadr.zzb);
            } else {
                zzahkVar.zzj(i, zzadr.zzs(bArr, zzj, i5));
            }
            return zzj + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw zzafc.zzc();
            }
            zzahkVar.zzj(i, Integer.valueOf(zzb(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzahk zzf = zzahk.zzf();
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int zzj2 = zzj(bArr, i2, zzadeVar);
            int i8 = zzadeVar.zza;
            i7 = i8;
            if (i8 == i6) {
                i2 = zzj2;
                break;
            }
            int zzi = zzi(i7, bArr, zzj2, i3, zzf, zzadeVar);
            i7 = i8;
            i2 = zzi;
        }
        if (i2 > i3 || i7 != i6) {
            throw zzafc.zzg();
        }
        zzahkVar.zzj(i, zzf);
        return i2;
    }

    static int zzj(byte[] bArr, int i, zzade zzadeVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzk(b, bArr, i2, zzadeVar);
        }
        zzadeVar.zza = b;
        return i2;
    }

    static int zzk(int i, byte[] bArr, int i2, zzade zzadeVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            zzadeVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzadeVar.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzadeVar.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzadeVar.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzadeVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzl(int i, byte[] bArr, int i2, int i3, zzaez zzaezVar, zzade zzadeVar) {
        zzaeu zzaeuVar = (zzaeu) zzaezVar;
        int zzj = zzj(bArr, i2, zzadeVar);
        zzaeuVar.zzg(zzadeVar.zza);
        while (zzj < i3) {
            int zzj2 = zzj(bArr, zzj, zzadeVar);
            if (i != zzadeVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzadeVar);
            zzaeuVar.zzg(zzadeVar.zza);
        }
        return zzj;
    }

    static int zzm(byte[] bArr, int i, zzade zzadeVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzadeVar.zzb = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        zzadeVar.zzb = j2;
        return i3;
    }

    static int zzn(Object obj, zzags zzagsVar, byte[] bArr, int i, int i2, int i3, zzade zzadeVar) throws IOException {
        int zzc = ((zzagc) zzagsVar).zzc(obj, bArr, i, i2, i3, zzadeVar);
        zzadeVar.zzc = obj;
        return zzc;
    }

    static int zzo(Object obj, zzags zzagsVar, byte[] bArr, int i, int i2, zzade zzadeVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzk(i4, bArr, i3, zzadeVar);
            i4 = zzadeVar.zza;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzafc.zzi();
        }
        int i6 = i4 + i5;
        zzagsVar.zzi(obj, bArr, i5, i6, zzadeVar);
        zzadeVar.zzc = obj;
        return i6;
    }

    static long zzp(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}
