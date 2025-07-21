package defpackage;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class j7g {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] copyOf = Arrays.copyOf(bArr, 32);
        int i = 0;
        copyOf[0] = (byte) (copyOf[0] & 248);
        int i2 = copyOf[31] & Byte.MAX_VALUE;
        copyOf[31] = (byte) i2;
        copyOf[31] = (byte) (i2 | 64);
        byte[][] bArr3 = u4g.a;
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] copyOf2 = Arrays.copyOf(bArr2, 32);
        copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
        for (int i3 = 0; i3 < 7; i3++) {
            byte[][] bArr4 = u4g.a;
            if (q4g.b(bArr4[i3], copyOf2)) {
                throw new InvalidKeyException("Banned public key: ".concat(p6g.a(bArr4[i3])));
            }
        }
        long[] k = n6g.k(copyOf2);
        long[] jArr2 = new long[19];
        long[] jArr3 = new long[19];
        jArr3[0] = 1;
        long[] jArr4 = new long[19];
        jArr4[0] = 1;
        long[] jArr5 = new long[19];
        long[] jArr6 = new long[19];
        long[] jArr7 = new long[19];
        jArr7[0] = 1;
        long[] jArr8 = new long[19];
        long[] jArr9 = new long[19];
        jArr9[0] = 1;
        int i4 = 10;
        System.arraycopy(k, 0, jArr2, 0, 10);
        while (i < 32) {
            int i5 = copyOf[31 - i] & 255;
            int i6 = 0;
            while (i6 < 8) {
                int i7 = (i5 >> (7 - i6)) & 1;
                u4g.a(jArr4, jArr2, i7);
                u4g.a(jArr5, jArr3, i7);
                byte[] bArr5 = copyOf;
                long[] copyOf3 = Arrays.copyOf(jArr4, 10);
                int i8 = i5;
                long[] jArr10 = new long[19];
                long[] jArr11 = jArr;
                long[] jArr12 = new long[19];
                int i9 = i;
                long[] jArr13 = new long[19];
                int i10 = i6;
                long[] jArr14 = new long[19];
                long[] jArr15 = new long[19];
                long[] jArr16 = jArr9;
                long[] jArr17 = new long[19];
                long[] jArr18 = new long[19];
                n6g.i(jArr4, jArr4, jArr5);
                n6g.h(jArr5, copyOf3, jArr5);
                long[] copyOf4 = Arrays.copyOf(jArr2, 10);
                n6g.i(jArr2, jArr2, jArr3);
                n6g.h(jArr3, copyOf4, jArr3);
                n6g.b(jArr14, jArr2, jArr5);
                n6g.b(jArr15, jArr4, jArr3);
                n6g.e(jArr14);
                n6g.d(jArr14);
                n6g.e(jArr15);
                n6g.d(jArr15);
                long[] jArr19 = jArr2;
                System.arraycopy(jArr14, 0, copyOf4, 0, 10);
                n6g.i(jArr14, jArr14, jArr15);
                n6g.h(jArr15, copyOf4, jArr15);
                n6g.g(jArr18, jArr14);
                n6g.g(jArr17, jArr15);
                n6g.b(jArr15, jArr17, k);
                n6g.e(jArr15);
                n6g.d(jArr15);
                System.arraycopy(jArr18, 0, jArr6, 0, 10);
                System.arraycopy(jArr15, 0, jArr7, 0, 10);
                n6g.g(jArr12, jArr4);
                n6g.g(jArr13, jArr5);
                n6g.b(jArr8, jArr12, jArr13);
                n6g.e(jArr8);
                n6g.d(jArr8);
                n6g.h(jArr13, jArr12, jArr13);
                Arrays.fill(jArr10, 10, 18, 0L);
                n6g.f(jArr10, jArr13, 121665L);
                n6g.d(jArr10);
                n6g.i(jArr10, jArr10, jArr12);
                n6g.b(jArr16, jArr13, jArr10);
                n6g.e(jArr16);
                n6g.d(jArr16);
                u4g.a(jArr8, jArr6, i7);
                u4g.a(jArr16, jArr7, i7);
                i6 = i10 + 1;
                jArr2 = jArr6;
                jArr9 = jArr5;
                i5 = i8;
                jArr = jArr11;
                i = i9;
                jArr6 = jArr19;
                jArr5 = jArr16;
                copyOf = bArr5;
                long[] jArr20 = jArr3;
                jArr3 = jArr7;
                jArr7 = jArr20;
                long[] jArr21 = jArr4;
                jArr4 = jArr8;
                jArr8 = jArr21;
            }
            i++;
            copyOf = copyOf;
            i4 = 10;
        }
        long[] jArr22 = jArr;
        int i11 = i4;
        long[] jArr23 = new long[i11];
        long[] jArr24 = new long[i11];
        long[] jArr25 = new long[i11];
        long[] jArr26 = new long[i11];
        long[] jArr27 = new long[i11];
        long[] jArr28 = new long[i11];
        long[] jArr29 = new long[i11];
        long[] jArr30 = new long[i11];
        long[] jArr31 = new long[i11];
        long[] jArr32 = new long[i11];
        long[] jArr33 = jArr2;
        long[] jArr34 = new long[i11];
        n6g.g(jArr24, jArr5);
        n6g.g(jArr34, jArr24);
        n6g.g(jArr32, jArr34);
        n6g.a(jArr25, jArr32, jArr5);
        n6g.a(jArr26, jArr25, jArr24);
        n6g.g(jArr32, jArr26);
        n6g.a(jArr27, jArr32, jArr25);
        n6g.g(jArr32, jArr27);
        n6g.g(jArr34, jArr32);
        n6g.g(jArr32, jArr34);
        n6g.g(jArr34, jArr32);
        n6g.g(jArr32, jArr34);
        n6g.a(jArr28, jArr32, jArr27);
        n6g.g(jArr32, jArr28);
        n6g.g(jArr34, jArr32);
        int i12 = 2;
        for (int i13 = 10; i12 < i13; i13 = 10) {
            n6g.g(jArr32, jArr34);
            n6g.g(jArr34, jArr32);
            i12 += 2;
        }
        n6g.a(jArr29, jArr34, jArr28);
        n6g.g(jArr32, jArr29);
        n6g.g(jArr34, jArr32);
        for (int i14 = 2; i14 < 20; i14 += 2) {
            n6g.g(jArr32, jArr34);
            n6g.g(jArr34, jArr32);
        }
        n6g.a(jArr32, jArr34, jArr29);
        n6g.g(jArr34, jArr32);
        n6g.g(jArr32, jArr34);
        for (int i15 = 2; i15 < 10; i15 += 2) {
            n6g.g(jArr34, jArr32);
            n6g.g(jArr32, jArr34);
        }
        n6g.a(jArr30, jArr32, jArr28);
        n6g.g(jArr32, jArr30);
        n6g.g(jArr34, jArr32);
        for (int i16 = 2; i16 < 50; i16 += 2) {
            n6g.g(jArr32, jArr34);
            n6g.g(jArr34, jArr32);
        }
        n6g.a(jArr31, jArr34, jArr30);
        n6g.g(jArr34, jArr31);
        n6g.g(jArr32, jArr34);
        for (int i17 = 2; i17 < 100; i17 += 2) {
            n6g.g(jArr34, jArr32);
            n6g.g(jArr32, jArr34);
        }
        n6g.a(jArr34, jArr32, jArr31);
        n6g.g(jArr32, jArr34);
        n6g.g(jArr34, jArr32);
        for (int i18 = 2; i18 < 50; i18 += 2) {
            n6g.g(jArr32, jArr34);
            n6g.g(jArr34, jArr32);
        }
        n6g.a(jArr32, jArr34, jArr30);
        n6g.g(jArr34, jArr32);
        n6g.g(jArr32, jArr34);
        n6g.g(jArr34, jArr32);
        n6g.g(jArr32, jArr34);
        n6g.g(jArr34, jArr32);
        n6g.a(jArr23, jArr34, jArr26);
        n6g.a(jArr22, jArr4, jArr23);
        long[] jArr35 = new long[10];
        long[] jArr36 = new long[10];
        long[] jArr37 = new long[11];
        long[] jArr38 = new long[11];
        long[] jArr39 = new long[11];
        n6g.a(jArr35, k, jArr22);
        n6g.i(jArr36, k, jArr22);
        long[] jArr40 = new long[10];
        jArr40[0] = 486662;
        n6g.i(jArr38, jArr36, jArr40);
        n6g.a(jArr38, jArr38, jArr3);
        n6g.i(jArr38, jArr38, jArr33);
        n6g.a(jArr38, jArr38, jArr35);
        n6g.a(jArr38, jArr38, jArr33);
        n6g.f(jArr37, jArr38, 4L);
        n6g.d(jArr37);
        n6g.a(jArr38, jArr35, jArr3);
        n6g.h(jArr38, jArr38, jArr3);
        n6g.a(jArr39, jArr36, jArr33);
        n6g.i(jArr38, jArr38, jArr39);
        n6g.g(jArr38, jArr38);
        if (q4g.b(n6g.j(jArr37), n6g.j(jArr38))) {
            return n6g.j(jArr22);
        }
        throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(p6g.a(bArr2)));
    }

    public static byte[] b() {
        byte[] a = d7g.a(32);
        a[0] = (byte) (a[0] | 7);
        int i = a[31] & 63;
        a[31] = (byte) i;
        a[31] = (byte) (i | 128);
        return a;
    }

    public static byte[] c(byte[] bArr) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        byte[] bArr2 = new byte[32];
        bArr2[0] = 9;
        return a(bArr, bArr2);
    }
}
