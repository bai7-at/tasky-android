package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* loaded from: classes3.dex */
abstract class g3a {
    private static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(ov9 ov9Var) {
        return c(ov9Var, true, false);
    }

    public static boolean b(ov9 ov9Var, boolean z) {
        return c(ov9Var, false, z);
    }

    private static boolean c(ov9 ov9Var, boolean z, boolean z2) {
        boolean z3;
        long j;
        int i;
        b9e b9eVar;
        boolean z4;
        long zzd = ov9Var.zzd();
        long j2 = -1;
        long j3 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (zzd != -1 && zzd <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j3 = zzd;
        }
        b9e b9eVar2 = new b9e(64);
        int i2 = (int) j3;
        boolean z5 = false;
        int i3 = 0;
        boolean z6 = false;
        while (i3 < i2) {
            b9eVar2.h(8);
            if (!ov9Var.d(b9eVar2.m(), z5 ? 1 : 0, 8, true)) {
                z3 = z5 ? 1 : 0;
                break;
            }
            long J = b9eVar2.J();
            int v = b9eVar2.v();
            if (J == 1) {
                ov9Var.j(b9eVar2.m(), 8, 8);
                i = 16;
                b9eVar2.j(16);
                j = b9eVar2.I();
            } else {
                if (J == 0) {
                    long zzd2 = ov9Var.zzd();
                    if (zzd2 != j2) {
                        J = (zzd2 - ov9Var.zze()) + 8;
                    }
                }
                j = J;
                i = 8;
            }
            long j4 = i;
            if (j < j4) {
                return z5;
            }
            i3 += i;
            if (v == 1836019574) {
                i2 += (int) j;
                if (zzd != -1 && i2 > zzd) {
                    i2 = (int) zzd;
                }
                j2 = -1;
            } else {
                if (v == 1836019558 || v == 1836475768) {
                    z3 = true;
                    break;
                }
                z6 = (!(v == 1835295092 ? z5 ? 1 : 0 : true)) | z6;
                b9e b9eVar3 = b9eVar2;
                if ((i3 + j) - j4 >= i2) {
                    break;
                }
                int i4 = (int) (j - j4);
                i3 += i4;
                if (v != 1718909296) {
                    b9eVar = b9eVar3;
                    if (i4 != 0) {
                        ov9Var.zzg(i4);
                    }
                } else {
                    if (i4 < 8) {
                        return false;
                    }
                    b9eVar = b9eVar3;
                    b9eVar.h(i4);
                    ov9Var.j(b9eVar.m(), 0, i4);
                    int i5 = i4 >> 2;
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (i6 != 1) {
                            int v2 = b9eVar.v();
                            if ((v2 >>> 8) != 3368816) {
                                if (v2 == 1751476579) {
                                    if (!z2) {
                                        v2 = 1751476579;
                                    }
                                }
                                int[] iArr = a;
                                for (int i7 = 0; i7 < 29; i7++) {
                                    if (iArr[i7] != v2) {
                                    }
                                }
                            }
                            z4 = true;
                            break;
                        }
                        b9eVar.l(4);
                    }
                    z4 = z6;
                    if (!z4) {
                        return false;
                    }
                    z6 = z4;
                }
                b9eVar2 = b9eVar;
                j2 = -1;
                z5 = false;
            }
        }
        z3 = false;
        return z6 && z == z3;
    }
}
