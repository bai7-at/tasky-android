package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* loaded from: classes2.dex */
abstract class yw7 {
    private static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 : a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(z72 z72Var) {
        return c(z72Var, true, false);
    }

    private static boolean c(z72 z72Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        boolean z6;
        boolean z7;
        long length = z72Var.getLength();
        long j = -1;
        int i2 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j2 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (i2 != 0 && length <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j2 = length;
        }
        int i3 = (int) j2;
        yo5 yo5Var = new yo5(64);
        boolean z8 = false;
        int i4 = 0;
        boolean z9 = false;
        while (i4 < i3) {
            yo5Var.Q(8);
            if (!z72Var.e(yo5Var.e(), z8 ? 1 : 0, 8, true)) {
                break;
            }
            long J = yo5Var.J();
            int q = yo5Var.q();
            if (J == 1) {
                z72Var.r(yo5Var.e(), 8, 8);
                yo5Var.T(16);
                i = 16;
                J = yo5Var.A();
            } else {
                if (J == 0) {
                    long length2 = z72Var.getLength();
                    if (length2 != j) {
                        J = (length2 - z72Var.l()) + 8;
                    }
                }
                i = 8;
            }
            long j3 = i;
            if (J < j3) {
                return z8;
            }
            i4 += i;
            if (q == 1836019574) {
                i3 += (int) J;
                if (i2 != 0 && i3 > length) {
                    i3 = (int) length;
                }
            } else {
                if (q == 1836019558 || q == 1836475768) {
                    z3 = z8 ? 1 : 0;
                    z4 = true;
                    z5 = true;
                    break;
                }
                int i5 = i2;
                if ((i4 + J) - j3 >= i3) {
                    z3 = false;
                    z4 = true;
                    break;
                }
                int i6 = (int) (J - j3);
                i4 += i6;
                if (q != 1718909296) {
                    z6 = false;
                    z9 = z9;
                    if (i6 != 0) {
                        z72Var.n(i6);
                        z9 = z9;
                    }
                } else {
                    if (i6 < 8) {
                        return false;
                    }
                    yo5Var.Q(i6);
                    z72Var.r(yo5Var.e(), 0, i6);
                    int i7 = i6 / 4;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= i7) {
                            z7 = z9;
                            break;
                        }
                        if (i8 == 1) {
                            yo5Var.V(4);
                        } else if (a(yo5Var.q(), z2)) {
                            z7 = true;
                            break;
                        }
                        i8++;
                    }
                    if (!z7) {
                        return false;
                    }
                    z6 = false;
                    z9 = z7;
                }
                z8 = z6;
                i2 = i5;
            }
            j = -1;
            z9 = z9;
        }
        z3 = z8 ? 1 : 0;
        z4 = true;
        z5 = z3;
        return (z9 && z == z5) ? z4 : z3;
    }

    public static boolean d(z72 z72Var, boolean z) {
        return c(z72Var, false, z);
    }
}
