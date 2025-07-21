package defpackage;

/* loaded from: classes3.dex */
public abstract class o9a {
    public static int a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long b(b9e b9eVar, int i, int i2) {
        b9eVar.k(i);
        if (b9eVar.q() < 5) {
            return -9223372036854775807L;
        }
        int v = b9eVar.v();
        if ((8388608 & v) != 0 || ((v >> 8) & 8191) != i2 || (v & 32) == 0 || b9eVar.B() < 7 || b9eVar.q() < 7 || (b9eVar.B() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        b9eVar.g(bArr, 0, 6);
        long j = bArr[0];
        long j2 = bArr[1];
        long j3 = bArr[2];
        long j4 = bArr[3] & 255;
        return ((j & 255) << 25) | ((j2 & 255) << 17) | ((j3 & 255) << 9) | (j4 + j4) | ((bArr[4] & 255) >> 7);
    }
}
