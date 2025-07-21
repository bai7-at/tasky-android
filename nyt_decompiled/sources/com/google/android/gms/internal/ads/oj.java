package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
abstract class oj {
    oj() {
    }

    static final String d(ByteBuffer byteBuffer, int i, int i2) {
        int i3;
        if ((((byteBuffer.limit() - i) - i2) | i | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i4 = i + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (i < i4) {
            byte b = byteBuffer.get(i);
            if (!nj.d(b)) {
                break;
            }
            i++;
            cArr[i5] = (char) b;
            i5++;
        }
        int i6 = i5;
        while (i < i4) {
            int i7 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (nj.d(b2)) {
                cArr[i6] = (char) b2;
                i6++;
                i = i7;
                while (i < i4) {
                    byte b3 = byteBuffer.get(i);
                    if (nj.d(b3)) {
                        i++;
                        cArr[i6] = (char) b3;
                        i6++;
                    }
                }
            } else {
                if (nj.f(b2)) {
                    if (i7 >= i4) {
                        throw zzhag.d();
                    }
                    i3 = i6 + 1;
                    i += 2;
                    nj.c(b2, byteBuffer.get(i7), cArr, i6);
                } else if (nj.e(b2)) {
                    if (i7 >= i4 - 1) {
                        throw zzhag.d();
                    }
                    i3 = i6 + 1;
                    int i8 = i + 2;
                    i += 3;
                    nj.b(b2, byteBuffer.get(i7), byteBuffer.get(i8), cArr, i6);
                } else {
                    if (i7 >= i4 - 2) {
                        throw zzhag.d();
                    }
                    byte b4 = byteBuffer.get(i7);
                    int i9 = i + 3;
                    byte b5 = byteBuffer.get(i + 2);
                    i += 4;
                    nj.a(b2, b4, b5, byteBuffer.get(i9), cArr, i6);
                    i6 += 2;
                }
                i6 = i3;
            }
        }
        return new String(cArr, 0, i6);
    }

    abstract int a(int i, byte[] bArr, int i2, int i3);

    abstract String b(byte[] bArr, int i, int i2);

    final boolean c(byte[] bArr, int i, int i2) {
        return a(0, bArr, i, i2) == 0;
    }
}
