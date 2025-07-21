package com.google.ads.interactivemedia.v3.internal;

import com.appsflyer.oaid.BuildConfig;
import com.comscore.streaming.EventType;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class zzagc<T> implements zzags<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzaht.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzafz zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzafn zzn;
    private final zzahj zzo;
    private final zzaeg zzp;
    private final zzage zzq;
    private final zzafu zzr;

    private zzagc(int[] iArr, Object[] objArr, int i, int i2, zzafz zzafzVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzage zzageVar, zzafn zzafnVar, zzahj zzahjVar, zzaeg zzaegVar, zzafu zzafuVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzafzVar instanceof zzaet;
        this.zzj = z;
        boolean z3 = false;
        if (zzaegVar != null && zzaegVar.zzh(zzafzVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzk = iArr2;
        this.zzl = i3;
        this.zzm = i4;
        this.zzq = zzageVar;
        this.zzn = zzafnVar;
        this.zzo = zzahjVar;
        this.zzp = zzaegVar;
        this.zzg = zzafzVar;
        this.zzr = zzafuVar;
    }

    private static long zzA(Object obj, long j) {
        return ((Long) zzaht.zzf(obj, j)).longValue();
    }

    private final zzaex zzB(int i) {
        int i2 = i / 3;
        return (zzaex) this.zzd[i2 + i2 + 1];
    }

    private final zzags zzC(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzags zzagsVar = (zzags) this.zzd[i3];
        if (zzagsVar != null) {
            return zzagsVar;
        }
        zzags zzb2 = zzagh.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzD(Object obj, int i, Object obj2, zzahj zzahjVar, Object obj3) {
        int i2 = this.zzc[i];
        Object zzf = zzaht.zzf(obj, zzz(i) & 1048575);
        if (zzf == null || zzB(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzE(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzF(Object obj, int i) {
        zzags zzC = zzC(i);
        int zzz = zzz(i) & 1048575;
        if (!zzT(obj, i)) {
            return zzC.zze();
        }
        Object object = zzb.getObject(obj, zzz);
        if (zzW(object)) {
            return object;
        }
        Object zze = zzC.zze();
        if (object != null) {
            zzC.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzG(Object obj, int i, int i2) {
        zzags zzC = zzC(i2);
        if (!zzX(obj, i, i2)) {
            return zzC.zze();
        }
        Object object = zzb.getObject(obj, zzz(i2) & 1048575);
        if (zzW(object)) {
            return object;
        }
        Object zze = zzC.zze();
        if (object != null) {
            zzC.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzH(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void zzI(Object obj) {
        if (!zzW(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzJ(Object obj, Object obj2, int i) {
        if (zzT(obj2, i)) {
            int zzz = zzz(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzz;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzags zzC = zzC(i);
            if (!zzT(obj, i)) {
                if (zzW(object)) {
                    Object zze = zzC.zze();
                    zzC.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzM(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzW(object2)) {
                Object zze2 = zzC.zze();
                zzC.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzC.zzg(object2, object);
        }
    }

    private final void zzK(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzX(obj2, i2, i)) {
            int zzz = zzz(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzz;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzags zzC = zzC(i);
            if (!zzX(obj, i2, i)) {
                if (zzW(object)) {
                    Object zze = zzC.zze();
                    zzC.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzN(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzW(object2)) {
                Object zze2 = zzC.zze();
                zzC.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzC.zzg(object2, object);
        }
    }

    private final void zzL(Object obj, int i, zzagk zzagkVar) throws IOException {
        if (zzS(i)) {
            zzaht.zzs(obj, i & 1048575, zzagkVar.zzs());
        } else if (this.zzi) {
            zzaht.zzs(obj, i & 1048575, zzagkVar.zzr());
        } else {
            zzaht.zzs(obj, i & 1048575, zzagkVar.zzp());
        }
    }

    private final void zzM(Object obj, int i) {
        int zzw = zzw(i);
        long j = 1048575 & zzw;
        if (j == 1048575) {
            return;
        }
        zzaht.zzq(obj, j, (1 << (zzw >>> 20)) | zzaht.zzc(obj, j));
    }

    private final void zzN(Object obj, int i, int i2) {
        zzaht.zzq(obj, zzw(i2) & 1048575, i);
    }

    private final void zzO(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzz(i) & 1048575, obj2);
        zzM(obj, i);
    }

    private final void zzP(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzz(i2) & 1048575, obj2);
        zzN(obj, i, i2);
    }

    private final void zzQ(zzaib zzaibVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzR(Object obj, Object obj2, int i) {
        return zzT(obj, i) == zzT(obj2, i);
    }

    private static boolean zzS(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzT(Object obj, int i) {
        int zzw = zzw(i);
        long j = zzw & 1048575;
        if (j != 1048575) {
            return ((1 << (zzw >>> 20)) & zzaht.zzc(obj, j)) != 0;
        }
        int zzz = zzz(i);
        long j2 = zzz & 1048575;
        switch (zzy(zzz)) {
            case 0:
                return Double.doubleToRawLongBits(zzaht.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzaht.zzb(obj, j2)) != 0;
            case 2:
                return zzaht.zzd(obj, j2) != 0;
            case 3:
                return zzaht.zzd(obj, j2) != 0;
            case 4:
                return zzaht.zzc(obj, j2) != 0;
            case 5:
                return zzaht.zzd(obj, j2) != 0;
            case 6:
                return zzaht.zzc(obj, j2) != 0;
            case 7:
                return zzaht.zzw(obj, j2);
            case 8:
                Object zzf = zzaht.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzadr) {
                    return !zzadr.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzaht.zzf(obj, j2) != null;
            case 10:
                return !zzadr.zzb.equals(zzaht.zzf(obj, j2));
            case 11:
                return zzaht.zzc(obj, j2) != 0;
            case 12:
                return zzaht.zzc(obj, j2) != 0;
            case 13:
                return zzaht.zzc(obj, j2) != 0;
            case 14:
                return zzaht.zzd(obj, j2) != 0;
            case 15:
                return zzaht.zzc(obj, j2) != 0;
            case 16:
                return zzaht.zzd(obj, j2) != 0;
            case 17:
                return zzaht.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzU(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzT(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzV(Object obj, int i, zzags zzagsVar) {
        return zzagsVar.zzl(zzaht.zzf(obj, i & 1048575));
    }

    private static boolean zzW(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzaet) {
            return ((zzaet) obj).zzaQ();
        }
        return true;
    }

    private final boolean zzX(Object obj, int i, int i2) {
        return zzaht.zzc(obj, (long) (zzw(i2) & 1048575)) == i;
    }

    private static boolean zzY(Object obj, long j) {
        return ((Boolean) zzaht.zzf(obj, j)).booleanValue();
    }

    private static final void zzZ(int i, Object obj, zzaib zzaibVar) throws IOException {
        if (obj instanceof String) {
            zzaibVar.zzF(i, (String) obj);
        } else {
            zzaibVar.zzd(i, (zzadr) obj);
        }
    }

    static zzahk zzd(Object obj) {
        zzaet zzaetVar = (zzaet) obj;
        zzahk zzahkVar = zzaetVar.zzc;
        if (zzahkVar != zzahk.zzc()) {
            return zzahkVar;
        }
        zzahk zzf = zzahk.zzf();
        zzaetVar.zzc = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.ads.interactivemedia.v3.internal.zzagc zzm(java.lang.Class r32, com.google.ads.interactivemedia.v3.internal.zzafw r33, com.google.ads.interactivemedia.v3.internal.zzage r34, com.google.ads.interactivemedia.v3.internal.zzafn r35, com.google.ads.interactivemedia.v3.internal.zzahj r36, com.google.ads.interactivemedia.v3.internal.zzaeg r37, com.google.ads.interactivemedia.v3.internal.zzafu r38) {
        /*
            Method dump skipped, instructions count: 1015
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzagc.zzm(java.lang.Class, com.google.ads.interactivemedia.v3.internal.zzafw, com.google.ads.interactivemedia.v3.internal.zzage, com.google.ads.interactivemedia.v3.internal.zzafn, com.google.ads.interactivemedia.v3.internal.zzahj, com.google.ads.interactivemedia.v3.internal.zzaeg, com.google.ads.interactivemedia.v3.internal.zzafu):com.google.ads.interactivemedia.v3.internal.zzagc");
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzaht.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzaht.zzf(obj, j)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzp(Object obj) {
        int i;
        int zzx;
        int zzx2;
        int zzy;
        int zzx3;
        int zzx4;
        int zzx5;
        int zzx6;
        int zzt;
        boolean z;
        int zzc;
        int zzh;
        int zzx7;
        int zzx8;
        int i2;
        int zzx9;
        int zzx10;
        int zzx11;
        int zzx12;
        Unsafe unsafe = zzb;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < this.zzc.length) {
            int zzz = zzz(i5);
            int[] iArr = this.zzc;
            int i8 = iArr[i5];
            int zzy2 = zzy(zzz);
            if (zzy2 <= 17) {
                int i9 = iArr[i5 + 2];
                int i10 = i9 & i3;
                int i11 = i9 >>> 20;
                if (i10 != i4) {
                    i7 = unsafe.getInt(obj, i10);
                    i4 = i10;
                }
                i = 1 << i11;
            } else {
                i = 0;
            }
            long j = zzz & i3;
            switch (zzy2) {
                case 0:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzx = zzaea.zzx(i8 << 3);
                        zzx4 = zzx + 8;
                        i6 += zzx4;
                        break;
                    }
                case 1:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzx2 = zzaea.zzx(i8 << 3);
                        zzx4 = zzx2 + 4;
                        i6 += zzx4;
                        break;
                    }
                case 2:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzy = zzaea.zzy(unsafe.getLong(obj, j));
                        zzx3 = zzaea.zzx(i8 << 3);
                        i6 += zzx3 + zzy;
                        break;
                    }
                case 3:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzy = zzaea.zzy(unsafe.getLong(obj, j));
                        zzx3 = zzaea.zzx(i8 << 3);
                        i6 += zzx3 + zzy;
                        break;
                    }
                case 4:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzy = zzaea.zzu(unsafe.getInt(obj, j));
                        zzx3 = zzaea.zzx(i8 << 3);
                        i6 += zzx3 + zzy;
                        break;
                    }
                case 5:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzx = zzaea.zzx(i8 << 3);
                        zzx4 = zzx + 8;
                        i6 += zzx4;
                        break;
                    }
                case 6:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzx2 = zzaea.zzx(i8 << 3);
                        zzx4 = zzx2 + 4;
                        i6 += zzx4;
                        break;
                    }
                case 7:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzx4 = zzaea.zzx(i8 << 3) + 1;
                        i6 += zzx4;
                        break;
                    }
                case 8:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (!(object instanceof zzadr)) {
                            zzy = zzaea.zzw((String) object);
                            zzx3 = zzaea.zzx(i8 << 3);
                            i6 += zzx3 + zzy;
                            break;
                        } else {
                            int i12 = zzaea.zzb;
                            int zzd = ((zzadr) object).zzd();
                            zzx5 = zzaea.zzx(zzd) + zzd;
                            zzx6 = zzaea.zzx(i8 << 3);
                            zzx4 = zzx6 + zzx5;
                            i6 += zzx4;
                            break;
                        }
                    }
                case 9:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzx4 = zzagu.zzn(i8, unsafe.getObject(obj, j), zzC(i5));
                        i6 += zzx4;
                        break;
                    }
                case 10:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzadr zzadrVar = (zzadr) unsafe.getObject(obj, j);
                        int i13 = zzaea.zzb;
                        int zzd2 = zzadrVar.zzd();
                        zzx5 = zzaea.zzx(zzd2) + zzd2;
                        zzx6 = zzaea.zzx(i8 << 3);
                        zzx4 = zzx6 + zzx5;
                        i6 += zzx4;
                        break;
                    }
                case 11:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzy = zzaea.zzx(unsafe.getInt(obj, j));
                        zzx3 = zzaea.zzx(i8 << 3);
                        i6 += zzx3 + zzy;
                        break;
                    }
                case 12:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzy = zzaea.zzu(unsafe.getInt(obj, j));
                        zzx3 = zzaea.zzx(i8 << 3);
                        i6 += zzx3 + zzy;
                        break;
                    }
                case 13:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzx2 = zzaea.zzx(i8 << 3);
                        zzx4 = zzx2 + 4;
                        i6 += zzx4;
                        break;
                    }
                case 14:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzx = zzaea.zzx(i8 << 3);
                        zzx4 = zzx + 8;
                        i6 += zzx4;
                        break;
                    }
                case 15:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        int i14 = unsafe.getInt(obj, j);
                        zzx3 = zzaea.zzx(i8 << 3);
                        zzy = zzaea.zzx((i14 >> 31) ^ (i14 + i14));
                        i6 += zzx3 + zzy;
                        break;
                    }
                case 16:
                    if ((i & i7) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        i6 += zzaea.zzx(i8 << 3) + zzaea.zzy((j2 >> 63) ^ (j2 + j2));
                        break;
                    }
                case 17:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzx4 = zzaea.zzt(i8, (zzafz) unsafe.getObject(obj, j), zzC(i5));
                        i6 += zzx4;
                        break;
                    }
                case 18:
                    zzx4 = zzagu.zzg(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzx4;
                    break;
                case 19:
                    zzx4 = zzagu.zze(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzx4;
                    break;
                case 20:
                    zzx4 = zzagu.zzl(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzx4;
                    break;
                case 21:
                    zzx4 = zzagu.zzw(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzx4;
                    break;
                case 22:
                    zzx4 = zzagu.zzj(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzx4;
                    break;
                case 23:
                    zzx4 = zzagu.zzg(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzx4;
                    break;
                case 24:
                    zzx4 = zzagu.zze(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzx4;
                    break;
                case EventType.SUBS /* 25 */:
                    zzx4 = zzagu.zza(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzx4;
                    break;
                case EventType.CDN /* 26 */:
                    zzt = zzagu.zzt(i8, (List) unsafe.getObject(obj, j));
                    i6 += zzt;
                    break;
                case 27:
                    zzt = zzagu.zzo(i8, (List) unsafe.getObject(obj, j), zzC(i5));
                    i6 += zzt;
                    break;
                case 28:
                    zzt = zzagu.zzb(i8, (List) unsafe.getObject(obj, j));
                    i6 += zzt;
                    break;
                case BuildConfig.VERSION_CODE /* 29 */:
                    zzt = zzagu.zzu(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzt;
                    break;
                case 30:
                    z = false;
                    zzc = zzagu.zzc(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzc;
                    break;
                case 31:
                    z = false;
                    zzc = zzagu.zze(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzc;
                    break;
                case 32:
                    z = false;
                    zzc = zzagu.zzg(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzc;
                    break;
                case 33:
                    z = false;
                    zzc = zzagu.zzp(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzc;
                    break;
                case 34:
                    z = false;
                    zzc = zzagu.zzr(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzc;
                    break;
                case 35:
                    zzh = zzagu.zzh((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzaea.zzx(zzh);
                        zzx8 = zzaea.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 36:
                    zzh = zzagu.zzf((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzaea.zzx(zzh);
                        zzx8 = zzaea.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 37:
                    zzh = zzagu.zzm((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzaea.zzx(zzh);
                        zzx8 = zzaea.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 38:
                    zzh = zzagu.zzx((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzaea.zzx(zzh);
                        zzx8 = zzaea.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 39:
                    zzh = zzagu.zzk((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzaea.zzx(zzh);
                        zzx8 = zzaea.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 40:
                    zzh = zzagu.zzh((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzaea.zzx(zzh);
                        zzx8 = zzaea.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 41:
                    zzh = zzagu.zzf((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzaea.zzx(zzh);
                        zzx8 = zzaea.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j);
                    int i15 = zzagu.zza;
                    zzh = list.size();
                    if (zzh > 0) {
                        zzx7 = zzaea.zzx(zzh);
                        zzx8 = zzaea.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 43:
                    zzh = zzagu.zzv((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzaea.zzx(zzh);
                        zzx8 = zzaea.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 44:
                    zzh = zzagu.zzd((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzaea.zzx(zzh);
                        zzx8 = zzaea.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 45:
                    zzh = zzagu.zzf((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzaea.zzx(zzh);
                        zzx8 = zzaea.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 46:
                    zzh = zzagu.zzh((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzaea.zzx(zzh);
                        zzx8 = zzaea.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 47:
                    zzh = zzagu.zzq((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzaea.zzx(zzh);
                        zzx8 = zzaea.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 48:
                    zzh = zzagu.zzs((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzaea.zzx(zzh);
                        zzx8 = zzaea.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 49:
                    zzt = zzagu.zzi(i8, (List) unsafe.getObject(obj, j), zzC(i5));
                    i6 += zzt;
                    break;
                case 50:
                    zzafu.zza(i8, unsafe.getObject(obj, j), zzE(i5));
                    break;
                case 51:
                    if (zzX(obj, i8, i5)) {
                        zzx9 = zzaea.zzx(i8 << 3);
                        zzt = zzx9 + 8;
                        i6 += zzt;
                    }
                    break;
                case 52:
                    if (zzX(obj, i8, i5)) {
                        zzx10 = zzaea.zzx(i8 << 3);
                        zzt = zzx10 + 4;
                        i6 += zzt;
                    }
                    break;
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (zzX(obj, i8, i5)) {
                        zzh = zzaea.zzy(zzA(obj, j));
                        i2 = zzaea.zzx(i8 << 3);
                        i6 += i2 + zzh;
                    }
                    break;
                case 54:
                    if (zzX(obj, i8, i5)) {
                        zzh = zzaea.zzy(zzA(obj, j));
                        i2 = zzaea.zzx(i8 << 3);
                        i6 += i2 + zzh;
                    }
                    break;
                case 55:
                    if (zzX(obj, i8, i5)) {
                        zzh = zzaea.zzu(zzq(obj, j));
                        i2 = zzaea.zzx(i8 << 3);
                        i6 += i2 + zzh;
                    }
                    break;
                case 56:
                    if (zzX(obj, i8, i5)) {
                        zzx9 = zzaea.zzx(i8 << 3);
                        zzt = zzx9 + 8;
                        i6 += zzt;
                    }
                    break;
                case 57:
                    if (zzX(obj, i8, i5)) {
                        zzx10 = zzaea.zzx(i8 << 3);
                        zzt = zzx10 + 4;
                        i6 += zzt;
                    }
                    break;
                case 58:
                    if (zzX(obj, i8, i5)) {
                        zzt = zzaea.zzx(i8 << 3) + 1;
                        i6 += zzt;
                    }
                    break;
                case 59:
                    if (zzX(obj, i8, i5)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzadr) {
                            int i16 = zzaea.zzb;
                            int zzd3 = ((zzadr) object2).zzd();
                            zzx11 = zzaea.zzx(zzd3) + zzd3;
                            zzx12 = zzaea.zzx(i8 << 3);
                            zzt = zzx12 + zzx11;
                            i6 += zzt;
                        } else {
                            zzh = zzaea.zzw((String) object2);
                            i2 = zzaea.zzx(i8 << 3);
                            i6 += i2 + zzh;
                        }
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzX(obj, i8, i5)) {
                        zzt = zzagu.zzn(i8, unsafe.getObject(obj, j), zzC(i5));
                        i6 += zzt;
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzX(obj, i8, i5)) {
                        zzadr zzadrVar2 = (zzadr) unsafe.getObject(obj, j);
                        int i17 = zzaea.zzb;
                        int zzd4 = zzadrVar2.zzd();
                        zzx11 = zzaea.zzx(zzd4) + zzd4;
                        zzx12 = zzaea.zzx(i8 << 3);
                        zzt = zzx12 + zzx11;
                        i6 += zzt;
                    }
                    break;
                case 62:
                    if (zzX(obj, i8, i5)) {
                        zzh = zzaea.zzx(zzq(obj, j));
                        i2 = zzaea.zzx(i8 << 3);
                        i6 += i2 + zzh;
                    }
                    break;
                case 63:
                    if (zzX(obj, i8, i5)) {
                        zzh = zzaea.zzu(zzq(obj, j));
                        i2 = zzaea.zzx(i8 << 3);
                        i6 += i2 + zzh;
                    }
                    break;
                case 64:
                    if (zzX(obj, i8, i5)) {
                        zzx10 = zzaea.zzx(i8 << 3);
                        zzt = zzx10 + 4;
                        i6 += zzt;
                    }
                    break;
                case 65:
                    if (zzX(obj, i8, i5)) {
                        zzx9 = zzaea.zzx(i8 << 3);
                        zzt = zzx9 + 8;
                        i6 += zzt;
                    }
                    break;
                case 66:
                    if (zzX(obj, i8, i5)) {
                        int zzq = zzq(obj, j);
                        i2 = zzaea.zzx(i8 << 3);
                        zzh = zzaea.zzx((zzq >> 31) ^ (zzq + zzq));
                        i6 += i2 + zzh;
                    }
                    break;
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (zzX(obj, i8, i5)) {
                        long zzA = zzA(obj, j);
                        i6 += zzaea.zzx(i8 << 3) + zzaea.zzy((zzA >> 63) ^ (zzA + zzA));
                    }
                    break;
                case 68:
                    if (zzX(obj, i8, i5)) {
                        zzt = zzaea.zzt(i8, (zzafz) unsafe.getObject(obj, j), zzC(i5));
                        i6 += zzt;
                    }
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
        zzahj zzahjVar = this.zzo;
        int zza2 = i6 + zzahjVar.zza(zzahjVar.zzd(obj));
        if (!this.zzh) {
            return zza2;
        }
        this.zzp.zza(obj);
        throw null;
    }

    private static int zzq(Object obj, long j) {
        return ((Integer) zzaht.zzf(obj, j)).intValue();
    }

    private final int zzr(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzade zzadeVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzE = zzE(i3);
        Object object = unsafe.getObject(obj, j);
        if (zzafu.zzb(object)) {
            zzaft zzb2 = zzaft.zza().zzb();
            zzafu.zzc(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        throw null;
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzade zzadeVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzadf.zzp(bArr, i))));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzadf.zzb(bArr, i))));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
            case 54:
                if (i5 == 0) {
                    int zzm = zzadf.zzm(bArr, i, zzadeVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzadeVar.zzb));
                    unsafe.putInt(obj, j2, i4);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int zzj = zzadf.zzj(bArr, i, zzadeVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzadeVar.zza));
                    unsafe.putInt(obj, j2, i4);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzadf.zzp(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzadf.zzb(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int zzm2 = zzadf.zzm(bArr, i, zzadeVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzadeVar.zzb != 0));
                    unsafe.putInt(obj, j2, i4);
                    return zzm2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int zzj2 = zzadf.zzj(bArr, i, zzadeVar);
                    int i13 = zzadeVar.zza;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !zzahy.zzi(bArr, zzj2, zzj2 + i13)) {
                            throw zzafc.zzd();
                        }
                        unsafe.putObject(obj, j, new String(bArr, zzj2, i13, zzafa.zzb));
                        zzj2 += i13;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzj2;
                }
                break;
            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                if (i5 == 2) {
                    Object zzG = zzG(obj, i4, i8);
                    int zzo = zzadf.zzo(zzG, zzC(i8), bArr, i, i2, zzadeVar);
                    zzP(obj, i4, i8, zzG);
                    return zzo;
                }
                break;
            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                if (i5 == 2) {
                    int zza2 = zzadf.zza(bArr, i, zzadeVar);
                    unsafe.putObject(obj, j, zzadeVar.zzc);
                    unsafe.putInt(obj, j2, i4);
                    return zza2;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int zzj3 = zzadf.zzj(bArr, i, zzadeVar);
                    int i14 = zzadeVar.zza;
                    zzaex zzB = zzB(i8);
                    if (zzB != null && !zzB.zza(i14)) {
                        zzd(obj).zzj(i3, Long.valueOf(i14));
                        return zzj3;
                    }
                    unsafe.putObject(obj, j, Integer.valueOf(i14));
                    unsafe.putInt(obj, j2, i4);
                    return zzj3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int zzj4 = zzadf.zzj(bArr, i, zzadeVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzadv.zzs(zzadeVar.zza)));
                    unsafe.putInt(obj, j2, i4);
                    return zzj4;
                }
                break;
            case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                if (i5 == 0) {
                    int zzm3 = zzadf.zzm(bArr, i, zzadeVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzadv.zzt(zzadeVar.zzb)));
                    unsafe.putInt(obj, j2, i4);
                    return zzm3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object zzG2 = zzG(obj, i4, i8);
                    int zzn = zzadf.zzn(zzG2, zzC(i8), bArr, i, i2, (i3 & (-8)) | 4, zzadeVar);
                    zzP(obj, i4, i8, zzG2);
                    return zzn;
                }
                break;
        }
        return i;
    }

    private final int zzt(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzade zzadeVar) throws IOException {
        int i8;
        int zzl;
        Unsafe unsafe = zzb;
        zzaez zzaezVar = (zzaez) unsafe.getObject(obj, j2);
        if (!zzaezVar.zzc()) {
            int size = zzaezVar.size();
            zzaezVar = zzaezVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzaezVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzaec zzaecVar = (zzaec) zzaezVar;
                    int zzj = zzadf.zzj(bArr, i, zzadeVar);
                    int i9 = zzadeVar.zza + zzj;
                    while (zzj < i9) {
                        zzaecVar.zze(Double.longBitsToDouble(zzadf.zzp(bArr, zzj)));
                        zzj += 8;
                    }
                    if (zzj == i9) {
                        return zzj;
                    }
                    throw zzafc.zzi();
                }
                if (i5 == 1) {
                    zzaec zzaecVar2 = (zzaec) zzaezVar;
                    zzaecVar2.zze(Double.longBitsToDouble(zzadf.zzp(bArr, i)));
                    int i10 = i + 8;
                    while (i10 < i2) {
                        int zzj2 = zzadf.zzj(bArr, i10, zzadeVar);
                        if (i3 != zzadeVar.zza) {
                            return i10;
                        }
                        zzaecVar2.zze(Double.longBitsToDouble(zzadf.zzp(bArr, zzj2)));
                        i10 = zzj2 + 8;
                    }
                    return i10;
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzaem zzaemVar = (zzaem) zzaezVar;
                    int zzj3 = zzadf.zzj(bArr, i, zzadeVar);
                    int i11 = zzadeVar.zza + zzj3;
                    while (zzj3 < i11) {
                        zzaemVar.zze(Float.intBitsToFloat(zzadf.zzb(bArr, zzj3)));
                        zzj3 += 4;
                    }
                    if (zzj3 == i11) {
                        return zzj3;
                    }
                    throw zzafc.zzi();
                }
                if (i5 == 5) {
                    zzaem zzaemVar2 = (zzaem) zzaezVar;
                    zzaemVar2.zze(Float.intBitsToFloat(zzadf.zzb(bArr, i)));
                    int i12 = i + 4;
                    while (i12 < i2) {
                        int zzj4 = zzadf.zzj(bArr, i12, zzadeVar);
                        if (i3 != zzadeVar.zza) {
                            return i12;
                        }
                        zzaemVar2.zze(Float.intBitsToFloat(zzadf.zzb(bArr, zzj4)));
                        i12 = zzj4 + 4;
                    }
                    return i12;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    zzafo zzafoVar = (zzafo) zzaezVar;
                    int zzj5 = zzadf.zzj(bArr, i, zzadeVar);
                    int i13 = zzadeVar.zza + zzj5;
                    while (zzj5 < i13) {
                        zzj5 = zzadf.zzm(bArr, zzj5, zzadeVar);
                        zzafoVar.zzf(zzadeVar.zzb);
                    }
                    if (zzj5 == i13) {
                        return zzj5;
                    }
                    throw zzafc.zzi();
                }
                if (i5 == 0) {
                    zzafo zzafoVar2 = (zzafo) zzaezVar;
                    int zzm = zzadf.zzm(bArr, i, zzadeVar);
                    zzafoVar2.zzf(zzadeVar.zzb);
                    while (zzm < i2) {
                        int zzj6 = zzadf.zzj(bArr, zzm, zzadeVar);
                        if (i3 != zzadeVar.zza) {
                            return zzm;
                        }
                        zzm = zzadf.zzm(bArr, zzj6, zzadeVar);
                        zzafoVar2.zzf(zzadeVar.zzb);
                    }
                    return zzm;
                }
                break;
            case 22:
            case BuildConfig.VERSION_CODE /* 29 */:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzadf.zzf(bArr, i, zzaezVar, zzadeVar);
                }
                if (i5 == 0) {
                    return zzadf.zzl(i3, bArr, i, i2, zzaezVar, zzadeVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzafo zzafoVar3 = (zzafo) zzaezVar;
                    int zzj7 = zzadf.zzj(bArr, i, zzadeVar);
                    int i14 = zzadeVar.zza + zzj7;
                    while (zzj7 < i14) {
                        zzafoVar3.zzf(zzadf.zzp(bArr, zzj7));
                        zzj7 += 8;
                    }
                    if (zzj7 == i14) {
                        return zzj7;
                    }
                    throw zzafc.zzi();
                }
                if (i5 == 1) {
                    zzafo zzafoVar4 = (zzafo) zzaezVar;
                    zzafoVar4.zzf(zzadf.zzp(bArr, i));
                    int i15 = i + 8;
                    while (i15 < i2) {
                        int zzj8 = zzadf.zzj(bArr, i15, zzadeVar);
                        if (i3 != zzadeVar.zza) {
                            return i15;
                        }
                        zzafoVar4.zzf(zzadf.zzp(bArr, zzj8));
                        i15 = zzj8 + 8;
                    }
                    return i15;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    zzaeu zzaeuVar = (zzaeu) zzaezVar;
                    int zzj9 = zzadf.zzj(bArr, i, zzadeVar);
                    int i16 = zzadeVar.zza + zzj9;
                    while (zzj9 < i16) {
                        zzaeuVar.zzg(zzadf.zzb(bArr, zzj9));
                        zzj9 += 4;
                    }
                    if (zzj9 == i16) {
                        return zzj9;
                    }
                    throw zzafc.zzi();
                }
                if (i5 == 5) {
                    zzaeu zzaeuVar2 = (zzaeu) zzaezVar;
                    zzaeuVar2.zzg(zzadf.zzb(bArr, i));
                    int i17 = i + 4;
                    while (i17 < i2) {
                        int zzj10 = zzadf.zzj(bArr, i17, zzadeVar);
                        if (i3 != zzadeVar.zza) {
                            return i17;
                        }
                        zzaeuVar2.zzg(zzadf.zzb(bArr, zzj10));
                        i17 = zzj10 + 4;
                    }
                    return i17;
                }
                break;
            case EventType.SUBS /* 25 */:
            case 42:
                if (i5 == 2) {
                    zzadg zzadgVar = (zzadg) zzaezVar;
                    int zzj11 = zzadf.zzj(bArr, i, zzadeVar);
                    int i18 = zzadeVar.zza + zzj11;
                    while (zzj11 < i18) {
                        zzj11 = zzadf.zzm(bArr, zzj11, zzadeVar);
                        zzadgVar.zze(zzadeVar.zzb != 0);
                    }
                    if (zzj11 == i18) {
                        return zzj11;
                    }
                    throw zzafc.zzi();
                }
                if (i5 == 0) {
                    zzadg zzadgVar2 = (zzadg) zzaezVar;
                    int zzm2 = zzadf.zzm(bArr, i, zzadeVar);
                    zzadgVar2.zze(zzadeVar.zzb != 0);
                    while (zzm2 < i2) {
                        int zzj12 = zzadf.zzj(bArr, zzm2, zzadeVar);
                        if (i3 != zzadeVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzadf.zzm(bArr, zzj12, zzadeVar);
                        zzadgVar2.zze(zzadeVar.zzb != 0);
                    }
                    return zzm2;
                }
                break;
            case EventType.CDN /* 26 */:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int zzj13 = zzadf.zzj(bArr, i, zzadeVar);
                        int i19 = zzadeVar.zza;
                        if (i19 < 0) {
                            throw zzafc.zzf();
                        }
                        if (i19 == 0) {
                            zzaezVar.add("");
                        } else {
                            zzaezVar.add(new String(bArr, zzj13, i19, zzafa.zzb));
                            zzj13 += i19;
                        }
                        while (zzj13 < i2) {
                            int zzj14 = zzadf.zzj(bArr, zzj13, zzadeVar);
                            if (i3 != zzadeVar.zza) {
                                return zzj13;
                            }
                            zzj13 = zzadf.zzj(bArr, zzj14, zzadeVar);
                            int i20 = zzadeVar.zza;
                            if (i20 < 0) {
                                throw zzafc.zzf();
                            }
                            if (i20 == 0) {
                                zzaezVar.add("");
                            } else {
                                zzaezVar.add(new String(bArr, zzj13, i20, zzafa.zzb));
                                zzj13 += i20;
                            }
                        }
                        return zzj13;
                    }
                    int zzj15 = zzadf.zzj(bArr, i, zzadeVar);
                    int i21 = zzadeVar.zza;
                    if (i21 < 0) {
                        throw zzafc.zzf();
                    }
                    if (i21 == 0) {
                        zzaezVar.add("");
                        i8 = zzj15;
                    } else {
                        i8 = zzj15 + i21;
                        if (!zzahy.zzi(bArr, zzj15, i8)) {
                            throw zzafc.zzd();
                        }
                        zzaezVar.add(new String(bArr, zzj15, i21, zzafa.zzb));
                    }
                    while (i8 < i2) {
                        int zzj16 = zzadf.zzj(bArr, i8, zzadeVar);
                        if (i3 != zzadeVar.zza) {
                            return i8;
                        }
                        i8 = zzadf.zzj(bArr, zzj16, zzadeVar);
                        int i22 = zzadeVar.zza;
                        if (i22 < 0) {
                            throw zzafc.zzf();
                        }
                        if (i22 == 0) {
                            zzaezVar.add("");
                        } else {
                            int i23 = i8 + i22;
                            if (!zzahy.zzi(bArr, i8, i23)) {
                                throw zzafc.zzd();
                            }
                            zzaezVar.add(new String(bArr, i8, i22, zzafa.zzb));
                            i8 = i23;
                        }
                    }
                    return i8;
                }
                break;
            case 27:
                if (i5 == 2) {
                    return zzadf.zze(zzC(i6), i3, bArr, i, i2, zzaezVar, zzadeVar);
                }
                break;
            case 28:
                if (i5 == 2) {
                    int zzj17 = zzadf.zzj(bArr, i, zzadeVar);
                    int i24 = zzadeVar.zza;
                    if (i24 < 0) {
                        throw zzafc.zzf();
                    }
                    if (i24 > bArr.length - zzj17) {
                        throw zzafc.zzi();
                    }
                    if (i24 == 0) {
                        zzaezVar.add(zzadr.zzb);
                    } else {
                        zzaezVar.add(zzadr.zzs(bArr, zzj17, i24));
                        zzj17 += i24;
                    }
                    while (zzj17 < i2) {
                        int zzj18 = zzadf.zzj(bArr, zzj17, zzadeVar);
                        if (i3 != zzadeVar.zza) {
                            return zzj17;
                        }
                        zzj17 = zzadf.zzj(bArr, zzj18, zzadeVar);
                        int i25 = zzadeVar.zza;
                        if (i25 < 0) {
                            throw zzafc.zzf();
                        }
                        if (i25 > bArr.length - zzj17) {
                            throw zzafc.zzi();
                        }
                        if (i25 == 0) {
                            zzaezVar.add(zzadr.zzb);
                        } else {
                            zzaezVar.add(zzadr.zzs(bArr, zzj17, i25));
                            zzj17 += i25;
                        }
                    }
                    return zzj17;
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    zzl = zzadf.zzf(bArr, i, zzaezVar, zzadeVar);
                } else if (i5 == 0) {
                    zzl = zzadf.zzl(i3, bArr, i, i2, zzaezVar, zzadeVar);
                }
                zzagu.zzB(obj, i4, zzaezVar, zzB(i6), null, this.zzo);
                return zzl;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzaeu zzaeuVar3 = (zzaeu) zzaezVar;
                    int zzj19 = zzadf.zzj(bArr, i, zzadeVar);
                    int i26 = zzadeVar.zza + zzj19;
                    while (zzj19 < i26) {
                        zzj19 = zzadf.zzj(bArr, zzj19, zzadeVar);
                        zzaeuVar3.zzg(zzadv.zzs(zzadeVar.zza));
                    }
                    if (zzj19 == i26) {
                        return zzj19;
                    }
                    throw zzafc.zzi();
                }
                if (i5 == 0) {
                    zzaeu zzaeuVar4 = (zzaeu) zzaezVar;
                    int zzj20 = zzadf.zzj(bArr, i, zzadeVar);
                    zzaeuVar4.zzg(zzadv.zzs(zzadeVar.zza));
                    while (zzj20 < i2) {
                        int zzj21 = zzadf.zzj(bArr, zzj20, zzadeVar);
                        if (i3 != zzadeVar.zza) {
                            return zzj20;
                        }
                        zzj20 = zzadf.zzj(bArr, zzj21, zzadeVar);
                        zzaeuVar4.zzg(zzadv.zzs(zzadeVar.zza));
                    }
                    return zzj20;
                }
                break;
            case 34:
            case 48:
                if (i5 == 2) {
                    zzafo zzafoVar5 = (zzafo) zzaezVar;
                    int zzj22 = zzadf.zzj(bArr, i, zzadeVar);
                    int i27 = zzadeVar.zza + zzj22;
                    while (zzj22 < i27) {
                        zzj22 = zzadf.zzm(bArr, zzj22, zzadeVar);
                        zzafoVar5.zzf(zzadv.zzt(zzadeVar.zzb));
                    }
                    if (zzj22 == i27) {
                        return zzj22;
                    }
                    throw zzafc.zzi();
                }
                if (i5 == 0) {
                    zzafo zzafoVar6 = (zzafo) zzaezVar;
                    int zzm3 = zzadf.zzm(bArr, i, zzadeVar);
                    zzafoVar6.zzf(zzadv.zzt(zzadeVar.zzb));
                    while (zzm3 < i2) {
                        int zzj23 = zzadf.zzj(bArr, zzm3, zzadeVar);
                        if (i3 != zzadeVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzadf.zzm(bArr, zzj23, zzadeVar);
                        zzafoVar6.zzf(zzadv.zzt(zzadeVar.zzb));
                    }
                    return zzm3;
                }
                break;
            default:
                if (i5 == 3) {
                    zzags zzC = zzC(i6);
                    int i28 = (i3 & (-8)) | 4;
                    int zzc = zzadf.zzc(zzC, bArr, i, i2, i28, zzadeVar);
                    zzaezVar.add(zzadeVar.zzc);
                    while (zzc < i2) {
                        int zzj24 = zzadf.zzj(bArr, zzc, zzadeVar);
                        if (i3 != zzadeVar.zza) {
                            return zzc;
                        }
                        zzc = zzadf.zzc(zzC, bArr, zzj24, i2, i28, zzadeVar);
                        zzaezVar.add(zzadeVar.zzc);
                    }
                    return zzc;
                }
                break;
        }
        return i;
    }

    private final int zzu(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzx(i, 0);
    }

    private final int zzv(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzx(i, i2);
    }

    private final int zzw(int i) {
        return this.zzc[i + 2];
    }

    private final int zzx(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzy(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzz(int i) {
        return this.zzc[i + 1];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final int zza(Object obj) {
        int zzx;
        int zzx2;
        int zzy;
        int zzx3;
        int zzx4;
        int zzx5;
        int zzx6;
        int zzn;
        int zzx7;
        int zzy2;
        int zzx8;
        int zzx9;
        if (!this.zzj) {
            return zzp(obj);
        }
        Unsafe unsafe = zzb;
        int i = 0;
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int zzz = zzz(i2);
            int zzy3 = zzy(zzz);
            int i3 = this.zzc[i2];
            int i4 = zzz & 1048575;
            if (zzy3 >= zzael.zzJ.zza() && zzy3 <= zzael.zzW.zza()) {
                int i5 = this.zzc[i2 + 2];
            }
            long j = i4;
            switch (zzy3) {
                case 0:
                    if (zzT(obj, i2)) {
                        zzx = zzaea.zzx(i3 << 3);
                        zzn = zzx + 8;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzT(obj, i2)) {
                        zzx2 = zzaea.zzx(i3 << 3);
                        zzn = zzx2 + 4;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzT(obj, i2)) {
                        zzy = zzaea.zzy(zzaht.zzd(obj, j));
                        zzx3 = zzaea.zzx(i3 << 3);
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzT(obj, i2)) {
                        zzy = zzaea.zzy(zzaht.zzd(obj, j));
                        zzx3 = zzaea.zzx(i3 << 3);
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzT(obj, i2)) {
                        zzy = zzaea.zzu(zzaht.zzc(obj, j));
                        zzx3 = zzaea.zzx(i3 << 3);
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzT(obj, i2)) {
                        zzx = zzaea.zzx(i3 << 3);
                        zzn = zzx + 8;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzT(obj, i2)) {
                        zzx2 = zzaea.zzx(i3 << 3);
                        zzn = zzx2 + 4;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzT(obj, i2)) {
                        zzx4 = zzaea.zzx(i3 << 3);
                        zzn = zzx4 + 1;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzT(obj, i2)) {
                        Object zzf = zzaht.zzf(obj, j);
                        if (zzf instanceof zzadr) {
                            int i6 = i3 << 3;
                            int i7 = zzaea.zzb;
                            int zzd = ((zzadr) zzf).zzd();
                            zzx5 = zzaea.zzx(zzd) + zzd;
                            zzx6 = zzaea.zzx(i6);
                            zzn = zzx6 + zzx5;
                            i += zzn;
                            break;
                        } else {
                            zzy = zzaea.zzw((String) zzf);
                            zzx3 = zzaea.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (zzT(obj, i2)) {
                        zzn = zzagu.zzn(i3, zzaht.zzf(obj, j), zzC(i2));
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzT(obj, i2)) {
                        zzadr zzadrVar = (zzadr) zzaht.zzf(obj, j);
                        int i8 = i3 << 3;
                        int i9 = zzaea.zzb;
                        int zzd2 = zzadrVar.zzd();
                        zzx5 = zzaea.zzx(zzd2) + zzd2;
                        zzx6 = zzaea.zzx(i8);
                        zzn = zzx6 + zzx5;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzT(obj, i2)) {
                        zzy = zzaea.zzx(zzaht.zzc(obj, j));
                        zzx3 = zzaea.zzx(i3 << 3);
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzT(obj, i2)) {
                        zzy = zzaea.zzu(zzaht.zzc(obj, j));
                        zzx3 = zzaea.zzx(i3 << 3);
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzT(obj, i2)) {
                        zzx2 = zzaea.zzx(i3 << 3);
                        zzn = zzx2 + 4;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzT(obj, i2)) {
                        zzx = zzaea.zzx(i3 << 3);
                        zzn = zzx + 8;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzT(obj, i2)) {
                        int zzc = zzaht.zzc(obj, j);
                        zzx3 = zzaea.zzx(i3 << 3);
                        zzy = zzaea.zzx((zzc >> 31) ^ (zzc + zzc));
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzT(obj, i2)) {
                        long zzd3 = zzaht.zzd(obj, j);
                        zzx7 = zzaea.zzx(i3 << 3);
                        zzy2 = zzaea.zzy((zzd3 + zzd3) ^ (zzd3 >> 63));
                        zzn = zzx7 + zzy2;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzT(obj, i2)) {
                        zzn = zzaea.zzt(i3, (zzafz) zzaht.zzf(obj, j), zzC(i2));
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzn = zzagu.zzg(i3, (List) zzaht.zzf(obj, j), false);
                    i += zzn;
                    break;
                case 19:
                    zzn = zzagu.zze(i3, (List) zzaht.zzf(obj, j), false);
                    i += zzn;
                    break;
                case 20:
                    zzn = zzagu.zzl(i3, (List) zzaht.zzf(obj, j), false);
                    i += zzn;
                    break;
                case 21:
                    zzn = zzagu.zzw(i3, (List) zzaht.zzf(obj, j), false);
                    i += zzn;
                    break;
                case 22:
                    zzn = zzagu.zzj(i3, (List) zzaht.zzf(obj, j), false);
                    i += zzn;
                    break;
                case 23:
                    zzn = zzagu.zzg(i3, (List) zzaht.zzf(obj, j), false);
                    i += zzn;
                    break;
                case 24:
                    zzn = zzagu.zze(i3, (List) zzaht.zzf(obj, j), false);
                    i += zzn;
                    break;
                case EventType.SUBS /* 25 */:
                    zzn = zzagu.zza(i3, (List) zzaht.zzf(obj, j), false);
                    i += zzn;
                    break;
                case EventType.CDN /* 26 */:
                    zzn = zzagu.zzt(i3, (List) zzaht.zzf(obj, j));
                    i += zzn;
                    break;
                case 27:
                    zzn = zzagu.zzo(i3, (List) zzaht.zzf(obj, j), zzC(i2));
                    i += zzn;
                    break;
                case 28:
                    zzn = zzagu.zzb(i3, (List) zzaht.zzf(obj, j));
                    i += zzn;
                    break;
                case BuildConfig.VERSION_CODE /* 29 */:
                    zzn = zzagu.zzu(i3, (List) zzaht.zzf(obj, j), false);
                    i += zzn;
                    break;
                case 30:
                    zzn = zzagu.zzc(i3, (List) zzaht.zzf(obj, j), false);
                    i += zzn;
                    break;
                case 31:
                    zzn = zzagu.zze(i3, (List) zzaht.zzf(obj, j), false);
                    i += zzn;
                    break;
                case 32:
                    zzn = zzagu.zzg(i3, (List) zzaht.zzf(obj, j), false);
                    i += zzn;
                    break;
                case 33:
                    zzn = zzagu.zzp(i3, (List) zzaht.zzf(obj, j), false);
                    i += zzn;
                    break;
                case 34:
                    zzn = zzagu.zzr(i3, (List) zzaht.zzf(obj, j), false);
                    i += zzn;
                    break;
                case 35:
                    zzy = zzagu.zzh((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i10 = i3 << 3;
                        zzx8 = zzaea.zzx(zzy);
                        zzx9 = zzaea.zzx(i10);
                        zzx3 = zzx9 + zzx8;
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzy = zzagu.zzf((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i11 = i3 << 3;
                        zzx8 = zzaea.zzx(zzy);
                        zzx9 = zzaea.zzx(i11);
                        zzx3 = zzx9 + zzx8;
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzy = zzagu.zzm((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i12 = i3 << 3;
                        zzx8 = zzaea.zzx(zzy);
                        zzx9 = zzaea.zzx(i12);
                        zzx3 = zzx9 + zzx8;
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzy = zzagu.zzx((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i13 = i3 << 3;
                        zzx8 = zzaea.zzx(zzy);
                        zzx9 = zzaea.zzx(i13);
                        zzx3 = zzx9 + zzx8;
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzy = zzagu.zzk((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i14 = i3 << 3;
                        zzx8 = zzaea.zzx(zzy);
                        zzx9 = zzaea.zzx(i14);
                        zzx3 = zzx9 + zzx8;
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzy = zzagu.zzh((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i15 = i3 << 3;
                        zzx8 = zzaea.zzx(zzy);
                        zzx9 = zzaea.zzx(i15);
                        zzx3 = zzx9 + zzx8;
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzy = zzagu.zzf((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i16 = i3 << 3;
                        zzx8 = zzaea.zzx(zzy);
                        zzx9 = zzaea.zzx(i16);
                        zzx3 = zzx9 + zzx8;
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(obj, j);
                    int i17 = zzagu.zza;
                    zzy = list.size();
                    if (zzy > 0) {
                        int i18 = i3 << 3;
                        zzx8 = zzaea.zzx(zzy);
                        zzx9 = zzaea.zzx(i18);
                        zzx3 = zzx9 + zzx8;
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzy = zzagu.zzv((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i19 = i3 << 3;
                        zzx8 = zzaea.zzx(zzy);
                        zzx9 = zzaea.zzx(i19);
                        zzx3 = zzx9 + zzx8;
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzy = zzagu.zzd((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i20 = i3 << 3;
                        zzx8 = zzaea.zzx(zzy);
                        zzx9 = zzaea.zzx(i20);
                        zzx3 = zzx9 + zzx8;
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzy = zzagu.zzf((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i21 = i3 << 3;
                        zzx8 = zzaea.zzx(zzy);
                        zzx9 = zzaea.zzx(i21);
                        zzx3 = zzx9 + zzx8;
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzy = zzagu.zzh((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i22 = i3 << 3;
                        zzx8 = zzaea.zzx(zzy);
                        zzx9 = zzaea.zzx(i22);
                        zzx3 = zzx9 + zzx8;
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzy = zzagu.zzq((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i23 = i3 << 3;
                        zzx8 = zzaea.zzx(zzy);
                        zzx9 = zzaea.zzx(i23);
                        zzx3 = zzx9 + zzx8;
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzy = zzagu.zzs((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i24 = i3 << 3;
                        zzx8 = zzaea.zzx(zzy);
                        zzx9 = zzaea.zzx(i24);
                        zzx3 = zzx9 + zzx8;
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzn = zzagu.zzi(i3, (List) zzaht.zzf(obj, j), zzC(i2));
                    i += zzn;
                    break;
                case 50:
                    zzafu.zza(i3, zzaht.zzf(obj, j), zzE(i2));
                    break;
                case 51:
                    if (zzX(obj, i3, i2)) {
                        zzx = zzaea.zzx(i3 << 3);
                        zzn = zzx + 8;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzX(obj, i3, i2)) {
                        zzx2 = zzaea.zzx(i3 << 3);
                        zzn = zzx2 + 4;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (zzX(obj, i3, i2)) {
                        zzy = zzaea.zzy(zzA(obj, j));
                        zzx3 = zzaea.zzx(i3 << 3);
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzX(obj, i3, i2)) {
                        zzy = zzaea.zzy(zzA(obj, j));
                        zzx3 = zzaea.zzx(i3 << 3);
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzX(obj, i3, i2)) {
                        zzy = zzaea.zzu(zzq(obj, j));
                        zzx3 = zzaea.zzx(i3 << 3);
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzX(obj, i3, i2)) {
                        zzx = zzaea.zzx(i3 << 3);
                        zzn = zzx + 8;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzX(obj, i3, i2)) {
                        zzx2 = zzaea.zzx(i3 << 3);
                        zzn = zzx2 + 4;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzX(obj, i3, i2)) {
                        zzx4 = zzaea.zzx(i3 << 3);
                        zzn = zzx4 + 1;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzX(obj, i3, i2)) {
                        Object zzf2 = zzaht.zzf(obj, j);
                        if (zzf2 instanceof zzadr) {
                            int i25 = i3 << 3;
                            int i26 = zzaea.zzb;
                            int zzd4 = ((zzadr) zzf2).zzd();
                            zzx5 = zzaea.zzx(zzd4) + zzd4;
                            zzx6 = zzaea.zzx(i25);
                            zzn = zzx6 + zzx5;
                            i += zzn;
                            break;
                        } else {
                            zzy = zzaea.zzw((String) zzf2);
                            zzx3 = zzaea.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        }
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzX(obj, i3, i2)) {
                        zzn = zzagu.zzn(i3, zzaht.zzf(obj, j), zzC(i2));
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzX(obj, i3, i2)) {
                        zzadr zzadrVar2 = (zzadr) zzaht.zzf(obj, j);
                        int i27 = i3 << 3;
                        int i28 = zzaea.zzb;
                        int zzd5 = zzadrVar2.zzd();
                        zzx5 = zzaea.zzx(zzd5) + zzd5;
                        zzx6 = zzaea.zzx(i27);
                        zzn = zzx6 + zzx5;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzX(obj, i3, i2)) {
                        zzy = zzaea.zzx(zzq(obj, j));
                        zzx3 = zzaea.zzx(i3 << 3);
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzX(obj, i3, i2)) {
                        zzy = zzaea.zzu(zzq(obj, j));
                        zzx3 = zzaea.zzx(i3 << 3);
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzX(obj, i3, i2)) {
                        zzx2 = zzaea.zzx(i3 << 3);
                        zzn = zzx2 + 4;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzX(obj, i3, i2)) {
                        zzx = zzaea.zzx(i3 << 3);
                        zzn = zzx + 8;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzX(obj, i3, i2)) {
                        int zzq = zzq(obj, j);
                        zzx3 = zzaea.zzx(i3 << 3);
                        zzy = zzaea.zzx((zzq >> 31) ^ (zzq + zzq));
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (zzX(obj, i3, i2)) {
                        long zzA = zzA(obj, j);
                        zzx7 = zzaea.zzx(i3 << 3);
                        zzy2 = zzaea.zzy((zzA + zzA) ^ (zzA >> 63));
                        zzn = zzx7 + zzy2;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzX(obj, i3, i2)) {
                        zzn = zzaea.zzt(i3, (zzafz) zzaht.zzf(obj, j), zzC(i2));
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzahj zzahjVar = this.zzo;
        return i + zzahjVar.zza(zzahjVar.zzd(obj));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzz = zzz(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzz;
            int i5 = 37;
            switch (zzy(zzz)) {
                case 0:
                    i = i2 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzaht.zza(obj, j));
                    byte[] bArr = zzafa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 1:
                    i = i2 * 53;
                    floatToIntBits = Float.floatToIntBits(zzaht.zzb(obj, j));
                    i2 = i + floatToIntBits;
                    break;
                case 2:
                    i = i2 * 53;
                    doubleToLongBits = zzaht.zzd(obj, j);
                    byte[] bArr2 = zzafa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 3:
                    i = i2 * 53;
                    doubleToLongBits = zzaht.zzd(obj, j);
                    byte[] bArr3 = zzafa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 4:
                    i = i2 * 53;
                    floatToIntBits = zzaht.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 5:
                    i = i2 * 53;
                    doubleToLongBits = zzaht.zzd(obj, j);
                    byte[] bArr4 = zzafa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 6:
                    i = i2 * 53;
                    floatToIntBits = zzaht.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 7:
                    i = i2 * 53;
                    floatToIntBits = zzafa.zza(zzaht.zzw(obj, j));
                    i2 = i + floatToIntBits;
                    break;
                case 8:
                    i = i2 * 53;
                    floatToIntBits = ((String) zzaht.zzf(obj, j)).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 9:
                    Object zzf = zzaht.zzf(obj, j);
                    if (zzf != null) {
                        i5 = zzf.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    floatToIntBits = zzaht.zzf(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 11:
                    i = i2 * 53;
                    floatToIntBits = zzaht.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 12:
                    i = i2 * 53;
                    floatToIntBits = zzaht.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 13:
                    i = i2 * 53;
                    floatToIntBits = zzaht.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 14:
                    i = i2 * 53;
                    doubleToLongBits = zzaht.zzd(obj, j);
                    byte[] bArr5 = zzafa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 15:
                    i = i2 * 53;
                    floatToIntBits = zzaht.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 16:
                    i = i2 * 53;
                    doubleToLongBits = zzaht.zzd(obj, j);
                    byte[] bArr6 = zzafa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 17:
                    Object zzf2 = zzaht.zzf(obj, j);
                    if (zzf2 != null) {
                        i5 = zzf2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case EventType.SUBS /* 25 */:
                case EventType.CDN /* 26 */:
                case 27:
                case 28:
                case BuildConfig.VERSION_CODE /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    floatToIntBits = zzaht.zzf(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 50:
                    i = i2 * 53;
                    floatToIntBits = zzaht.zzf(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 51:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zzafa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzA(obj, j);
                        byte[] bArr8 = zzafa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzA(obj, j);
                        byte[] bArr9 = zzafa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzq(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzA(obj, j);
                        byte[] bArr10 = zzafa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzq(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzafa.zza(zzY(obj, j));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = ((String) zzaht.zzf(obj, j)).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzaht.zzf(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzaht.zzf(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzq(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzq(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzq(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzA(obj, j);
                        byte[] bArr11 = zzafa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzq(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzA(obj, j);
                        byte[] bArr12 = zzafa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzaht.zzf(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzo.zzd(obj).hashCode();
        if (!this.zzh) {
            return hashCode;
        }
        this.zzp.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:195:0x0361, code lost:
    
        if (r0 != r13) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0363, code lost:
    
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r9 = r36;
        r8 = r18;
        r5 = r19;
        r3 = r19;
        r6 = r21;
        r2 = r23;
        r1 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x037f, code lost:
    
        r2 = r0;
        r7 = r19;
        r6 = r21;
        r0 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03b5, code lost:
    
        if (r0 != r15) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03da, code lost:
    
        if (r0 != r15) goto L109;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int zzc(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, com.google.ads.interactivemedia.v3.internal.zzade r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzagc.zzc(java.lang.Object, byte[], int, int, int, com.google.ads.interactivemedia.v3.internal.zzade):int");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final Object zze() {
        return ((zzaet) this.zzg).zzaA();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final void zzf(Object obj) {
        if (zzW(obj)) {
            if (obj instanceof zzaet) {
                zzaet zzaetVar = (zzaet) obj;
                zzaetVar.zzaN(Integer.MAX_VALUE);
                zzaetVar.zza = 0;
                zzaetVar.zzaL();
            }
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzz = zzz(i);
                int i2 = 1048575 & zzz;
                int zzy = zzy(zzz);
                long j = i2;
                if (zzy != 9) {
                    if (zzy != 60 && zzy != 68) {
                        switch (zzy) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case EventType.SUBS /* 25 */:
                            case EventType.CDN /* 26 */:
                            case 27:
                            case 28:
                            case BuildConfig.VERSION_CODE /* 29 */:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.zzn.zzb(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzaft) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzX(obj, this.zzc[i], i)) {
                        zzC(i).zzf(zzb.getObject(obj, j));
                    }
                }
                if (zzT(obj, i)) {
                    zzC(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzo.zzm(obj);
            if (this.zzh) {
                this.zzp.zze(obj);
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final void zzg(Object obj, Object obj2) {
        zzI(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzz = zzz(i);
            int i2 = this.zzc[i];
            long j = 1048575 & zzz;
            switch (zzy(zzz)) {
                case 0:
                    if (zzT(obj2, i)) {
                        zzaht.zzo(obj, j, zzaht.zza(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzT(obj2, i)) {
                        zzaht.zzp(obj, j, zzaht.zzb(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzT(obj2, i)) {
                        zzaht.zzr(obj, j, zzaht.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzT(obj2, i)) {
                        zzaht.zzr(obj, j, zzaht.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzT(obj2, i)) {
                        zzaht.zzq(obj, j, zzaht.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzT(obj2, i)) {
                        zzaht.zzr(obj, j, zzaht.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzT(obj2, i)) {
                        zzaht.zzq(obj, j, zzaht.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzT(obj2, i)) {
                        zzaht.zzm(obj, j, zzaht.zzw(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzT(obj2, i)) {
                        zzaht.zzs(obj, j, zzaht.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzJ(obj, obj2, i);
                    break;
                case 10:
                    if (zzT(obj2, i)) {
                        zzaht.zzs(obj, j, zzaht.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzT(obj2, i)) {
                        zzaht.zzq(obj, j, zzaht.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzT(obj2, i)) {
                        zzaht.zzq(obj, j, zzaht.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzT(obj2, i)) {
                        zzaht.zzq(obj, j, zzaht.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzT(obj2, i)) {
                        zzaht.zzr(obj, j, zzaht.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzT(obj2, i)) {
                        zzaht.zzq(obj, j, zzaht.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzT(obj2, i)) {
                        zzaht.zzr(obj, j, zzaht.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzJ(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case EventType.SUBS /* 25 */:
                case EventType.CDN /* 26 */:
                case 27:
                case 28:
                case BuildConfig.VERSION_CODE /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzn.zzc(obj, obj2, j);
                    break;
                case 50:
                    int i3 = zzagu.zza;
                    zzaht.zzs(obj, j, zzafu.zzc(zzaht.zzf(obj, j), zzaht.zzf(obj2, j)));
                    break;
                case 51:
                case 52:
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzX(obj2, i2, i)) {
                        zzaht.zzs(obj, j, zzaht.zzf(obj2, j));
                        zzN(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    zzK(obj, obj2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (zzX(obj2, i2, i)) {
                        zzaht.zzs(obj, j, zzaht.zzf(obj2, j));
                        zzN(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzK(obj, obj2, i);
                    break;
            }
        }
        zzagu.zzD(this.zzo, obj, obj2);
        if (this.zzh) {
            this.zzp.zza(obj2);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0662 A[LOOP:2: B:36:0x065e->B:38:0x0662, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0631 A[Catch: all -> 0x0103, TryCatch #1 {all -> 0x0103, blocks: (B:16:0x00db, B:44:0x062c, B:46:0x0631, B:47:0x0636), top: B:15:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x063c A[SYNTHETIC] */
    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r18, com.google.ads.interactivemedia.v3.internal.zzagk r19, com.google.ads.interactivemedia.v3.internal.zzaef r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzagc.zzh(java.lang.Object, com.google.ads.interactivemedia.v3.internal.zzagk, com.google.ads.interactivemedia.v3.internal.zzaef):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x02e7, code lost:
    
        if (r0 != r24) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x02e9, code lost:
    
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r15;
        r10 = r18;
        r1 = r23;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0301, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0331, code lost:
    
        if (r0 != r14) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0350, code lost:
    
        if (r0 != r14) goto L103;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x0095. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.ads.interactivemedia.v3.internal.zzade r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzagc.zzi(java.lang.Object, byte[], int, int, com.google.ads.interactivemedia.v3.internal.zzade):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final void zzj(Object obj, zzaib zzaibVar) throws IOException {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 1048575;
        if (this.zzj) {
            if (this.zzh) {
                this.zzp.zza(obj);
                throw null;
            }
            int length = this.zzc.length;
            for (int i6 = 0; i6 < length; i6 += 3) {
                int zzz = zzz(i6);
                int i7 = this.zzc[i6];
                switch (zzy(zzz)) {
                    case 0:
                        if (zzT(obj, i6)) {
                            zzaibVar.zzf(i7, zzaht.zza(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzT(obj, i6)) {
                            zzaibVar.zzo(i7, zzaht.zzb(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzT(obj, i6)) {
                            zzaibVar.zzt(i7, zzaht.zzd(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzT(obj, i6)) {
                            zzaibVar.zzJ(i7, zzaht.zzd(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzT(obj, i6)) {
                            zzaibVar.zzr(i7, zzaht.zzc(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzT(obj, i6)) {
                            zzaibVar.zzm(i7, zzaht.zzd(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzT(obj, i6)) {
                            zzaibVar.zzk(i7, zzaht.zzc(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzT(obj, i6)) {
                            zzaibVar.zzb(i7, zzaht.zzw(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzT(obj, i6)) {
                            zzZ(i7, zzaht.zzf(obj, zzz & 1048575), zzaibVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzT(obj, i6)) {
                            zzaibVar.zzv(i7, zzaht.zzf(obj, zzz & 1048575), zzC(i6));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzT(obj, i6)) {
                            zzaibVar.zzd(i7, (zzadr) zzaht.zzf(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzT(obj, i6)) {
                            zzaibVar.zzH(i7, zzaht.zzc(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzT(obj, i6)) {
                            zzaibVar.zzi(i7, zzaht.zzc(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzT(obj, i6)) {
                            zzaibVar.zzw(i7, zzaht.zzc(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzT(obj, i6)) {
                            zzaibVar.zzy(i7, zzaht.zzd(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzT(obj, i6)) {
                            zzaibVar.zzA(i7, zzaht.zzc(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzT(obj, i6)) {
                            zzaibVar.zzC(i7, zzaht.zzd(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzT(obj, i6)) {
                            zzaibVar.zzq(i7, zzaht.zzf(obj, zzz & 1048575), zzC(i6));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzagu.zzH(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                        break;
                    case 19:
                        zzagu.zzL(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                        break;
                    case 20:
                        zzagu.zzO(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                        break;
                    case 21:
                        zzagu.zzW(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                        break;
                    case 22:
                        zzagu.zzN(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                        break;
                    case 23:
                        zzagu.zzK(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                        break;
                    case 24:
                        zzagu.zzJ(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                        break;
                    case EventType.SUBS /* 25 */:
                        zzagu.zzF(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                        break;
                    case EventType.CDN /* 26 */:
                        zzagu.zzU(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar);
                        break;
                    case 27:
                        zzagu.zzP(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, zzC(i6));
                        break;
                    case 28:
                        zzagu.zzG(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar);
                        break;
                    case BuildConfig.VERSION_CODE /* 29 */:
                        zzagu.zzV(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                        break;
                    case 30:
                        zzagu.zzI(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                        break;
                    case 31:
                        zzagu.zzQ(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                        break;
                    case 32:
                        zzagu.zzR(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                        break;
                    case 33:
                        zzagu.zzS(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                        break;
                    case 34:
                        zzagu.zzT(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                        break;
                    case 35:
                        zzagu.zzH(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                        break;
                    case 36:
                        zzagu.zzL(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                        break;
                    case 37:
                        zzagu.zzO(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                        break;
                    case 38:
                        zzagu.zzW(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                        break;
                    case 39:
                        zzagu.zzN(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                        break;
                    case 40:
                        zzagu.zzK(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                        break;
                    case 41:
                        zzagu.zzJ(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                        break;
                    case 42:
                        zzagu.zzF(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                        break;
                    case 43:
                        zzagu.zzV(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                        break;
                    case 44:
                        zzagu.zzI(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                        break;
                    case 45:
                        zzagu.zzQ(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                        break;
                    case 46:
                        zzagu.zzR(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                        break;
                    case 47:
                        zzagu.zzS(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                        break;
                    case 48:
                        zzagu.zzT(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                        break;
                    case 49:
                        zzagu.zzM(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, zzC(i6));
                        break;
                    case 50:
                        zzQ(zzaibVar, i7, zzaht.zzf(obj, zzz & 1048575), i6);
                        break;
                    case 51:
                        if (zzX(obj, i7, i6)) {
                            zzaibVar.zzf(i7, zzn(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzX(obj, i7, i6)) {
                            zzaibVar.zzo(i7, zzo(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                        if (zzX(obj, i7, i6)) {
                            zzaibVar.zzt(i7, zzA(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzX(obj, i7, i6)) {
                            zzaibVar.zzJ(i7, zzA(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzX(obj, i7, i6)) {
                            zzaibVar.zzr(i7, zzq(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzX(obj, i7, i6)) {
                            zzaibVar.zzm(i7, zzA(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzX(obj, i7, i6)) {
                            zzaibVar.zzk(i7, zzq(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzX(obj, i7, i6)) {
                            zzaibVar.zzb(i7, zzY(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzX(obj, i7, i6)) {
                            zzZ(i7, zzaht.zzf(obj, zzz & 1048575), zzaibVar);
                            break;
                        } else {
                            break;
                        }
                    case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                        if (zzX(obj, i7, i6)) {
                            zzaibVar.zzv(i7, zzaht.zzf(obj, zzz & 1048575), zzC(i6));
                            break;
                        } else {
                            break;
                        }
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                        if (zzX(obj, i7, i6)) {
                            zzaibVar.zzd(i7, (zzadr) zzaht.zzf(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzX(obj, i7, i6)) {
                            zzaibVar.zzH(i7, zzq(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzX(obj, i7, i6)) {
                            zzaibVar.zzi(i7, zzq(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzX(obj, i7, i6)) {
                            zzaibVar.zzw(i7, zzq(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzX(obj, i7, i6)) {
                            zzaibVar.zzy(i7, zzA(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzX(obj, i7, i6)) {
                            zzaibVar.zzA(i7, zzq(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                        if (zzX(obj, i7, i6)) {
                            zzaibVar.zzC(i7, zzA(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzX(obj, i7, i6)) {
                            zzaibVar.zzq(i7, zzaht.zzf(obj, zzz & 1048575), zzC(i6));
                            break;
                        } else {
                            break;
                        }
                }
            }
            zzahj zzahjVar = this.zzo;
            zzahjVar.zzp(zzahjVar.zzd(obj), zzaibVar);
            return;
        }
        if (this.zzh) {
            this.zzp.zza(obj);
            throw null;
        }
        int length2 = this.zzc.length;
        Unsafe unsafe = zzb;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1048575;
        while (i8 < length2) {
            int zzz2 = zzz(i8);
            int[] iArr = this.zzc;
            int i11 = iArr[i8];
            int zzy = zzy(zzz2);
            if (zzy <= 17) {
                int i12 = iArr[i8 + 2];
                int i13 = i12 & i5;
                if (i13 != i10) {
                    i9 = unsafe.getInt(obj, i13);
                    i10 = i13;
                }
                i = 1 << (i12 >>> 20);
            } else {
                i = i4;
            }
            long j = zzz2 & i5;
            switch (zzy) {
                case 0:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzaibVar.zzf(i11, zzaht.zza(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzaibVar.zzo(i11, zzaht.zzb(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzaibVar.zzt(i11, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzaibVar.zzJ(i11, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzaibVar.zzr(i11, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzaibVar.zzm(i11, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzaibVar.zzk(i11, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzaibVar.zzb(i11, zzaht.zzw(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzZ(i11, unsafe.getObject(obj, j), zzaibVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzaibVar.zzv(i11, unsafe.getObject(obj, j), zzC(i8));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzaibVar.zzd(i11, (zzadr) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzaibVar.zzH(i11, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzaibVar.zzi(i11, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzaibVar.zzw(i11, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzaibVar.zzy(i11, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzaibVar.zzA(i11, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzaibVar.zzC(i11, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    i2 = 0;
                    if ((i9 & i) != 0) {
                        zzaibVar.zzq(i11, unsafe.getObject(obj, j), zzC(i8));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i2 = 0;
                    zzagu.zzH(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, false);
                    break;
                case 19:
                    i2 = 0;
                    zzagu.zzL(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, false);
                    break;
                case 20:
                    i2 = 0;
                    zzagu.zzO(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, false);
                    break;
                case 21:
                    i2 = 0;
                    zzagu.zzW(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, false);
                    break;
                case 22:
                    i2 = 0;
                    zzagu.zzN(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, false);
                    break;
                case 23:
                    i2 = 0;
                    zzagu.zzK(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, false);
                    break;
                case 24:
                    i2 = 0;
                    zzagu.zzJ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, false);
                    break;
                case EventType.SUBS /* 25 */:
                    i2 = 0;
                    zzagu.zzF(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, false);
                    break;
                case EventType.CDN /* 26 */:
                    zzagu.zzU(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar);
                    i2 = 0;
                    break;
                case 27:
                    zzagu.zzP(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, zzC(i8));
                    i2 = 0;
                    break;
                case 28:
                    zzagu.zzG(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar);
                    i2 = 0;
                    break;
                case BuildConfig.VERSION_CODE /* 29 */:
                    i3 = 0;
                    zzagu.zzV(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, false);
                    i2 = i3;
                    break;
                case 30:
                    i3 = 0;
                    zzagu.zzI(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, false);
                    i2 = i3;
                    break;
                case 31:
                    i3 = 0;
                    zzagu.zzQ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, false);
                    i2 = i3;
                    break;
                case 32:
                    i3 = 0;
                    zzagu.zzR(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, false);
                    i2 = i3;
                    break;
                case 33:
                    i3 = 0;
                    zzagu.zzS(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, false);
                    i2 = i3;
                    break;
                case 34:
                    i3 = 0;
                    zzagu.zzT(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, false);
                    i2 = i3;
                    break;
                case 35:
                    zzagu.zzH(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, true);
                    i2 = 0;
                    break;
                case 36:
                    zzagu.zzL(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, true);
                    i2 = 0;
                    break;
                case 37:
                    zzagu.zzO(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, true);
                    i2 = 0;
                    break;
                case 38:
                    zzagu.zzW(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, true);
                    i2 = 0;
                    break;
                case 39:
                    zzagu.zzN(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, true);
                    i2 = 0;
                    break;
                case 40:
                    zzagu.zzK(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, true);
                    i2 = 0;
                    break;
                case 41:
                    zzagu.zzJ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, true);
                    i2 = 0;
                    break;
                case 42:
                    zzagu.zzF(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, true);
                    i2 = 0;
                    break;
                case 43:
                    zzagu.zzV(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, true);
                    i2 = 0;
                    break;
                case 44:
                    zzagu.zzI(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, true);
                    i2 = 0;
                    break;
                case 45:
                    zzagu.zzQ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, true);
                    i2 = 0;
                    break;
                case 46:
                    zzagu.zzR(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, true);
                    i2 = 0;
                    break;
                case 47:
                    zzagu.zzS(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, true);
                    i2 = 0;
                    break;
                case 48:
                    zzagu.zzT(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, true);
                    i2 = 0;
                    break;
                case 49:
                    zzagu.zzM(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, zzC(i8));
                    i2 = 0;
                    break;
                case 50:
                    zzQ(zzaibVar, i11, unsafe.getObject(obj, j), i8);
                    i2 = 0;
                    break;
                case 51:
                    if (zzX(obj, i11, i8)) {
                        zzaibVar.zzf(i11, zzn(obj, j));
                    }
                    i2 = 0;
                    break;
                case 52:
                    if (zzX(obj, i11, i8)) {
                        zzaibVar.zzo(i11, zzo(obj, j));
                    }
                    i2 = 0;
                    break;
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    if (zzX(obj, i11, i8)) {
                        zzaibVar.zzt(i11, zzA(obj, j));
                    }
                    i2 = 0;
                    break;
                case 54:
                    if (zzX(obj, i11, i8)) {
                        zzaibVar.zzJ(i11, zzA(obj, j));
                    }
                    i2 = 0;
                    break;
                case 55:
                    if (zzX(obj, i11, i8)) {
                        zzaibVar.zzr(i11, zzq(obj, j));
                    }
                    i2 = 0;
                    break;
                case 56:
                    if (zzX(obj, i11, i8)) {
                        zzaibVar.zzm(i11, zzA(obj, j));
                    }
                    i2 = 0;
                    break;
                case 57:
                    if (zzX(obj, i11, i8)) {
                        zzaibVar.zzk(i11, zzq(obj, j));
                    }
                    i2 = 0;
                    break;
                case 58:
                    if (zzX(obj, i11, i8)) {
                        zzaibVar.zzb(i11, zzY(obj, j));
                    }
                    i2 = 0;
                    break;
                case 59:
                    if (zzX(obj, i11, i8)) {
                        zzZ(i11, unsafe.getObject(obj, j), zzaibVar);
                    }
                    i2 = 0;
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzX(obj, i11, i8)) {
                        zzaibVar.zzv(i11, unsafe.getObject(obj, j), zzC(i8));
                    }
                    i2 = 0;
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzX(obj, i11, i8)) {
                        zzaibVar.zzd(i11, (zzadr) unsafe.getObject(obj, j));
                    }
                    i2 = 0;
                    break;
                case 62:
                    if (zzX(obj, i11, i8)) {
                        zzaibVar.zzH(i11, zzq(obj, j));
                    }
                    i2 = 0;
                    break;
                case 63:
                    if (zzX(obj, i11, i8)) {
                        zzaibVar.zzi(i11, zzq(obj, j));
                    }
                    i2 = 0;
                    break;
                case 64:
                    if (zzX(obj, i11, i8)) {
                        zzaibVar.zzw(i11, zzq(obj, j));
                    }
                    i2 = 0;
                    break;
                case 65:
                    if (zzX(obj, i11, i8)) {
                        zzaibVar.zzy(i11, zzA(obj, j));
                    }
                    i2 = 0;
                    break;
                case 66:
                    if (zzX(obj, i11, i8)) {
                        zzaibVar.zzA(i11, zzq(obj, j));
                    }
                    i2 = 0;
                    break;
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (zzX(obj, i11, i8)) {
                        zzaibVar.zzC(i11, zzA(obj, j));
                    }
                    i2 = 0;
                    break;
                case 68:
                    if (zzX(obj, i11, i8)) {
                        zzaibVar.zzq(i11, unsafe.getObject(obj, j), zzC(i8));
                    }
                    i2 = 0;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            i8 += 3;
            i4 = i2;
            i5 = 1048575;
        }
        zzahj zzahjVar2 = this.zzo;
        zzahjVar2.zzp(zzahjVar2.zzd(obj), zzaibVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final boolean zzk(Object obj, Object obj2) {
        boolean zzX;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzz = zzz(i);
            long j = zzz & 1048575;
            switch (zzy(zzz)) {
                case 0:
                    if (zzR(obj, obj2, i) && Double.doubleToLongBits(zzaht.zza(obj, j)) == Double.doubleToLongBits(zzaht.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzR(obj, obj2, i) && Float.floatToIntBits(zzaht.zzb(obj, j)) == Float.floatToIntBits(zzaht.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzR(obj, obj2, i) && zzaht.zzd(obj, j) == zzaht.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzR(obj, obj2, i) && zzaht.zzd(obj, j) == zzaht.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzR(obj, obj2, i) && zzaht.zzc(obj, j) == zzaht.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzR(obj, obj2, i) && zzaht.zzd(obj, j) == zzaht.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzR(obj, obj2, i) && zzaht.zzc(obj, j) == zzaht.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzR(obj, obj2, i) && zzaht.zzw(obj, j) == zzaht.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzR(obj, obj2, i) && zzagu.zzX(zzaht.zzf(obj, j), zzaht.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzR(obj, obj2, i) && zzagu.zzX(zzaht.zzf(obj, j), zzaht.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzR(obj, obj2, i) && zzagu.zzX(zzaht.zzf(obj, j), zzaht.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzR(obj, obj2, i) && zzaht.zzc(obj, j) == zzaht.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzR(obj, obj2, i) && zzaht.zzc(obj, j) == zzaht.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzR(obj, obj2, i) && zzaht.zzc(obj, j) == zzaht.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzR(obj, obj2, i) && zzaht.zzd(obj, j) == zzaht.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzR(obj, obj2, i) && zzaht.zzc(obj, j) == zzaht.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzR(obj, obj2, i) && zzaht.zzd(obj, j) == zzaht.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzR(obj, obj2, i) && zzagu.zzX(zzaht.zzf(obj, j), zzaht.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case EventType.SUBS /* 25 */:
                case EventType.CDN /* 26 */:
                case 27:
                case 28:
                case BuildConfig.VERSION_CODE /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzX = zzagu.zzX(zzaht.zzf(obj, j), zzaht.zzf(obj2, j));
                    break;
                case 50:
                    zzX = zzagu.zzX(zzaht.zzf(obj, j), zzaht.zzf(obj2, j));
                    break;
                case 51:
                case 52:
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                case 68:
                    long zzw = zzw(i) & 1048575;
                    if (zzaht.zzc(obj, zzw) == zzaht.zzc(obj2, zzw) && zzagu.zzX(zzaht.zzf(obj, j), zzaht.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzX) {
                return false;
            }
        }
        if (!this.zzo.zzd(obj).equals(this.zzo.zzd(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzp.zza(obj);
        this.zzp.zza(obj2);
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.zzl) {
            int i6 = this.zzk[i4];
            int i7 = this.zzc[i6];
            int zzz = zzz(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = zzb.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                i = i5;
                i2 = i3;
            }
            if ((268435456 & zzz) != 0 && !zzU(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzy = zzy(zzz);
            if (zzy != 9 && zzy != 17) {
                if (zzy != 27) {
                    if (zzy == 60 || zzy == 68) {
                        if (zzX(obj, i7, i6) && !zzV(obj, zzz, zzC(i6))) {
                            return false;
                        }
                    } else if (zzy != 49) {
                        if (zzy == 50 && !((zzaft) zzaht.zzf(obj, zzz & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzaht.zzf(obj, zzz & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzags zzC = zzC(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzC.zzl(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzU(obj, i6, i, i2, i10) && !zzV(obj, zzz, zzC(i6))) {
                return false;
            }
            i4++;
            i5 = i;
            i3 = i2;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzp.zza(obj);
        throw null;
    }
}
