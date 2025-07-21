package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzahk {
    private static final zzahk zza = new zzahk(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzahk(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzahk zzc() {
        return zza;
    }

    static zzahk zze(zzahk zzahkVar, zzahk zzahkVar2) {
        int i = zzahkVar.zzb + zzahkVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzahkVar.zzc, i);
        System.arraycopy(zzahkVar2.zzc, 0, copyOf, zzahkVar.zzb, zzahkVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzahkVar.zzd, i);
        System.arraycopy(zzahkVar2.zzd, 0, copyOf2, zzahkVar.zzb, zzahkVar2.zzb);
        return new zzahk(i, copyOf, copyOf2, true);
    }

    static zzahk zzf() {
        return new zzahk(0, new int[8], new Object[8], true);
    }

    private final void zzl(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzahk)) {
            return false;
        }
        zzahk zzahkVar = (zzahk) obj;
        int i = this.zzb;
        if (i == zzahkVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzahkVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzahkVar.zzd;
                    int i3 = this.zzb;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 * 31) + i4;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return (i6 * 31) + i3;
    }

    public final int zza() {
        int zzy;
        int zzx;
        int i;
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            int i5 = this.zzc[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 0) {
                if (i7 == 1) {
                    ((Long) this.zzd[i4]).longValue();
                    i = zzaea.zzx(i6 << 3) + 8;
                } else if (i7 == 2) {
                    zzadr zzadrVar = (zzadr) this.zzd[i4];
                    int i8 = zzaea.zzb;
                    int zzd = zzadrVar.zzd();
                    i = zzaea.zzx(i6 << 3) + zzaea.zzx(zzd) + zzd;
                } else if (i7 == 3) {
                    int i9 = i6 << 3;
                    int i10 = zzaea.zzb;
                    zzy = ((zzahk) this.zzd[i4]).zza();
                    int zzx2 = zzaea.zzx(i9);
                    zzx = zzx2 + zzx2;
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException(zzafc.zza());
                    }
                    ((Integer) this.zzd[i4]).intValue();
                    i = zzaea.zzx(i6 << 3) + 4;
                }
                i3 += i;
            } else {
                int i11 = i6 << 3;
                zzy = zzaea.zzy(((Long) this.zzd[i4]).longValue());
                zzx = zzaea.zzx(i11);
            }
            i = zzx + zzy;
            i3 += i;
        }
        this.zze = i3;
        return i3;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3] >>> 3;
            zzadr zzadrVar = (zzadr) this.zzd[i3];
            int i5 = zzaea.zzb;
            int zzd = zzadrVar.zzd();
            int zzx = zzaea.zzx(zzd) + zzd;
            int zzx2 = zzaea.zzx(16);
            int zzx3 = zzaea.zzx(i4);
            int zzx4 = zzaea.zzx(8);
            i2 += zzx4 + zzx4 + zzx2 + zzx3 + zzaea.zzx(24) + zzx;
        }
        this.zze = i2;
        return i2;
    }

    final zzahk zzd(zzahk zzahkVar) {
        if (zzahkVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzahkVar.zzb;
        zzl(i);
        System.arraycopy(zzahkVar.zzc, 0, this.zzc, this.zzb, zzahkVar.zzb);
        System.arraycopy(zzahkVar.zzd, 0, this.zzd, this.zzb, zzahkVar.zzb);
        this.zzb = i;
        return this;
    }

    final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzagb.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    final void zzj(int i, Object obj) {
        zzg();
        zzl(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final void zzk(zzaib zzaibVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzaibVar.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzaibVar.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzaibVar.zzd(i4, (zzadr) obj);
                } else if (i3 == 3) {
                    zzaibVar.zzE(i4);
                    ((zzahk) obj).zzk(zzaibVar);
                    zzaibVar.zzh(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(zzafc.zza());
                    }
                    zzaibVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzahk() {
        this(0, new int[8], new Object[8], true);
    }
}
