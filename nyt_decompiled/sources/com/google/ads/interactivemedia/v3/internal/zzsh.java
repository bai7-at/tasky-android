package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzsh extends AbstractMap implements Serializable, zzrt {
    transient Object[] zza;
    transient Object[] zzb;
    transient int zzc;
    transient int zzd;
    private transient int[] zze;
    private transient int[] zzf;
    private transient int[] zzg;
    private transient int[] zzh;
    private transient int zzi;
    private transient int zzj;
    private transient int[] zzk;
    private transient int[] zzl;
    private transient Set zzm;
    private transient Set zzn;
    private transient Set zzo;
    private transient zzrt zzp;

    private zzsh(int i) {
        int zza = zzsi.zza(2, 1.0d);
        this.zzc = 0;
        this.zza = new Object[2];
        this.zzb = new Object[2];
        this.zze = zzy(zza);
        this.zzf = zzy(zza);
        this.zzg = zzy(2);
        this.zzh = zzy(2);
        this.zzi = -2;
        this.zzj = -2;
        this.zzk = zzy(2);
        this.zzl = zzy(2);
    }

    public static zzsh zzf(int i) {
        return new zzsh(2);
    }

    private final int zzo(int i) {
        return (this.zze.length - 1) & i;
    }

    private final void zzp(int i, int i2) {
        zzrm.zzd(i != -1);
        int zzo = zzo(i2);
        int[] iArr = this.zze;
        int i3 = iArr[zzo];
        if (i3 == i) {
            int[] iArr2 = this.zzg;
            iArr[zzo] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.zzg[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                throw new AssertionError("Expected to find entry with key ".concat(String.valueOf(this.zza[i])));
            }
            if (i3 == i) {
                int[] iArr3 = this.zzg;
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = this.zzg[i3];
        }
    }

    private final void zzq(int i, int i2) {
        zzrm.zzd(i != -1);
        int zzo = zzo(i2);
        int[] iArr = this.zzf;
        int i3 = iArr[zzo];
        if (i3 == i) {
            int[] iArr2 = this.zzh;
            iArr[zzo] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.zzh[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                throw new AssertionError("Expected to find entry with value ".concat(String.valueOf(this.zzb[i])));
            }
            if (i3 == i) {
                int[] iArr3 = this.zzh;
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = this.zzh[i3];
        }
    }

    private final void zzr(int i) {
        int length = this.zzg.length;
        if (length < i) {
            int zza = zzsj.zza(length, i);
            this.zza = Arrays.copyOf(this.zza, zza);
            this.zzb = Arrays.copyOf(this.zzb, zza);
            this.zzg = zzz(this.zzg, zza);
            this.zzh = zzz(this.zzh, zza);
            this.zzk = zzz(this.zzk, zza);
            this.zzl = zzz(this.zzl, zza);
        }
        if (this.zze.length < i) {
            int zza2 = zzsi.zza(i, 1.0d);
            this.zze = zzy(zza2);
            this.zzf = zzy(zza2);
            for (int i2 = 0; i2 < this.zzc; i2++) {
                int zzo = zzo(zzsi.zzc(this.zza[i2]));
                int[] iArr = this.zzg;
                int[] iArr2 = this.zze;
                iArr[i2] = iArr2[zzo];
                iArr2[zzo] = i2;
                int zzo2 = zzo(zzsi.zzc(this.zzb[i2]));
                int[] iArr3 = this.zzh;
                int[] iArr4 = this.zzf;
                iArr3[i2] = iArr4[zzo2];
                iArr4[zzo2] = i2;
            }
        }
    }

    private final void zzs(int i, int i2) {
        zzrm.zzd(i != -1);
        int zzo = zzo(i2);
        int[] iArr = this.zzg;
        int[] iArr2 = this.zze;
        iArr[i] = iArr2[zzo];
        iArr2[zzo] = i;
    }

    private final void zzt(int i, int i2) {
        zzrm.zzd(i != -1);
        int zzo = zzo(i2);
        int[] iArr = this.zzh;
        int[] iArr2 = this.zzf;
        iArr[i] = iArr2[zzo];
        iArr2[zzo] = i;
    }

    private final void zzu(int i, int i2, int i3) {
        int i4;
        int i5;
        zzrm.zzd(i != -1);
        zzp(i, i2);
        zzq(i, i3);
        zzx(this.zzk[i], this.zzl[i]);
        int i6 = this.zzc - 1;
        if (i6 != i) {
            int i7 = this.zzk[i6];
            int i8 = this.zzl[i6];
            zzx(i7, i);
            zzx(i, i8);
            Object[] objArr = this.zza;
            Object obj = objArr[i6];
            Object[] objArr2 = this.zzb;
            Object obj2 = objArr2[i6];
            objArr[i] = obj;
            objArr2[i] = obj2;
            int zzo = zzo(zzsi.zzc(obj));
            int[] iArr = this.zze;
            int i9 = iArr[zzo];
            if (i9 == i6) {
                iArr[zzo] = i;
            } else {
                int i10 = this.zzg[i9];
                while (true) {
                    i4 = i9;
                    i9 = i10;
                    if (i9 == i6) {
                        break;
                    } else {
                        i10 = this.zzg[i9];
                    }
                }
                this.zzg[i4] = i;
            }
            int[] iArr2 = this.zzg;
            iArr2[i] = iArr2[i6];
            iArr2[i6] = -1;
            int zzo2 = zzo(zzsi.zzc(obj2));
            int[] iArr3 = this.zzf;
            int i11 = iArr3[zzo2];
            if (i11 == i6) {
                iArr3[zzo2] = i;
            } else {
                int i12 = this.zzh[i11];
                while (true) {
                    i5 = i11;
                    i11 = i12;
                    if (i11 == i6) {
                        break;
                    } else {
                        i12 = this.zzh[i11];
                    }
                }
                this.zzh[i5] = i;
            }
            int[] iArr4 = this.zzh;
            iArr4[i] = iArr4[i6];
            iArr4[i6] = -1;
        }
        Object[] objArr3 = this.zza;
        int i13 = this.zzc - 1;
        objArr3[i13] = null;
        this.zzb[i13] = null;
        this.zzc = i13;
        this.zzd++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv(int i, Object obj, boolean z) {
        zzrm.zzd(i != -1);
        int zzc = zzc(obj, zzsi.zzc(obj));
        int i2 = this.zzj;
        if (zzc != -1) {
            throw new IllegalArgumentException("Key already present in map: ".concat(String.valueOf(obj)));
        }
        if (i2 == i) {
            i2 = this.zzk[i];
        } else if (i2 == this.zzc) {
            i2 = zzc;
        }
        if (i == -2) {
            zzc = this.zzl[-2];
        } else if (this.zzc != -2) {
            zzc = -2;
        }
        zzx(this.zzk[i], this.zzl[i]);
        zzp(i, zzsi.zzc(this.zza[i]));
        this.zza[i] = obj;
        zzs(i, zzsi.zzc(obj));
        zzx(i2, i);
        zzx(i, zzc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzw(int i, Object obj, boolean z) {
        zzrm.zzd(i != -1);
        int zzc = zzsi.zzc(obj);
        if (zzd(obj, zzc) != -1) {
            throw new IllegalArgumentException("Value already present in map: ".concat(String.valueOf(obj)));
        }
        zzq(i, zzsi.zzc(this.zzb[i]));
        this.zzb[i] = obj;
        zzt(i, zzc);
    }

    private final void zzx(int i, int i2) {
        if (i == -2) {
            this.zzi = i2;
        } else {
            this.zzl[i] = i2;
        }
        if (i2 == -2) {
            this.zzj = i;
        } else {
            this.zzk[i2] = i;
        }
    }

    private static int[] zzy(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private static int[] zzz(int[] iArr, int i) {
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, i);
        Arrays.fill(copyOf, length, i, -1);
        return copyOf;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.zza, 0, this.zzc, (Object) null);
        Arrays.fill(this.zzb, 0, this.zzc, (Object) null);
        Arrays.fill(this.zze, -1);
        Arrays.fill(this.zzf, -1);
        Arrays.fill(this.zzg, 0, this.zzc, -1);
        Arrays.fill(this.zzh, 0, this.zzc, -1);
        Arrays.fill(this.zzk, 0, this.zzc, -1);
        Arrays.fill(this.zzl, 0, this.zzc, -1);
        this.zzc = 0;
        this.zzi = -2;
        this.zzj = -2;
        this.zzd++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return zzc(obj, zzsi.zzc(obj)) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return zzd(obj, zzsi.zzc(obj)) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzo;
        if (set != null) {
            return set;
        }
        zzsa zzsaVar = new zzsa(this);
        this.zzo = zzsaVar;
        return zzsaVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        int zzc = zzc(obj, zzsi.zzc(obj));
        if (zzc == -1) {
            return null;
        }
        return this.zzb[zzc];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzm;
        if (set != null) {
            return set;
        }
        zzsd zzsdVar = new zzsd(this);
        this.zzm = zzsdVar;
        return zzsdVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        return zzg(obj, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int zzc = zzsi.zzc(obj);
        int zzc2 = zzc(obj, zzc);
        if (zzc2 == -1) {
            return null;
        }
        Object obj2 = this.zzb[zzc2];
        zzl(zzc2, zzc);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzc;
    }

    final int zzb(Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[zzo(i)];
        while (i2 != -1) {
            if (zzri.zza(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    final int zzc(Object obj, int i) {
        return zzb(obj, i, this.zze, this.zzg, this.zza);
    }

    final int zzd(Object obj, int i) {
        return zzb(obj, i, this.zzf, this.zzh, this.zzb);
    }

    public final zzrt zze() {
        zzrt zzrtVar = this.zzp;
        if (zzrtVar != null) {
            return zzrtVar;
        }
        zzsb zzsbVar = new zzsb(this);
        this.zzp = zzsbVar;
        return zzsbVar;
    }

    final Object zzg(Object obj, Object obj2, boolean z) {
        int zzc = zzsi.zzc(obj);
        int zzc2 = zzc(obj, zzc);
        if (zzc2 != -1) {
            Object obj3 = this.zzb[zzc2];
            if (zzri.zza(obj3, obj2)) {
                return obj2;
            }
            zzw(zzc2, obj2, false);
            return obj3;
        }
        int zzc3 = zzsi.zzc(obj2);
        zzrm.zzf(zzd(obj2, zzc3) == -1, "Value already present: %s", obj2);
        zzr(this.zzc + 1);
        Object[] objArr = this.zza;
        int i = this.zzc;
        objArr[i] = obj;
        this.zzb[i] = obj2;
        zzs(i, zzc);
        zzt(this.zzc, zzc3);
        zzx(this.zzj, this.zzc);
        zzx(this.zzc, -2);
        this.zzc++;
        this.zzd++;
        return null;
    }

    final Object zzh(Object obj, Object obj2, boolean z) {
        int zzc = zzsi.zzc(obj);
        int zzd = zzd(obj, zzc);
        if (zzd != -1) {
            Object obj3 = this.zza[zzd];
            if (zzri.zza(obj3, obj2)) {
                return obj2;
            }
            zzv(zzd, obj2, false);
            return obj3;
        }
        int i = this.zzj;
        int zzc2 = zzsi.zzc(obj2);
        zzrm.zzf(zzc(obj2, zzc2) == -1, "Key already present: %s", obj2);
        zzr(this.zzc + 1);
        Object[] objArr = this.zza;
        int i2 = this.zzc;
        objArr[i2] = obj2;
        this.zzb[i2] = obj;
        zzs(i2, zzc2);
        zzt(this.zzc, zzc);
        int i3 = i == -2 ? this.zzi : this.zzl[i];
        zzx(i, this.zzc);
        zzx(this.zzc, i3);
        this.zzc++;
        this.zzd++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final Set values() {
        Set set = this.zzn;
        if (set != null) {
            return set;
        }
        zzse zzseVar = new zzse(this);
        this.zzn = zzseVar;
        return zzseVar;
    }

    final void zzl(int i, int i2) {
        zzu(i, i2, zzsi.zzc(this.zzb[i]));
    }

    final void zzm(int i, int i2) {
        zzu(i, zzsi.zzc(this.zza[i]), i2);
    }
}
