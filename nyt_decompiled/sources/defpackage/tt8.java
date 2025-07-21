package defpackage;

/* loaded from: classes2.dex */
public abstract class tt8 {
    public static int a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static boolean b(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        for (int i5 = -4; i5 <= 4; i5++) {
            int i6 = (i5 * 188) + i3;
            if (i6 < i || i6 >= i2 || bArr[i6] != 71) {
                i4 = 0;
            } else {
                i4++;
                if (i4 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long c(yo5 yo5Var, int i, int i2) {
        yo5Var.U(i);
        if (yo5Var.a() < 5) {
            return -9223372036854775807L;
        }
        int q = yo5Var.q();
        if ((8388608 & q) != 0 || ((2096896 & q) >> 8) != i2 || (q & 32) == 0 || yo5Var.H() < 7 || yo5Var.a() < 7 || (yo5Var.H() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        yo5Var.l(bArr, 0, 6);
        return d(bArr);
    }

    private static long d(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
