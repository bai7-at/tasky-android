package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes3.dex */
abstract class xi0 implements vi3 {
    private static final int[] c = m(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});
    int[] a;
    private final int b;

    xi0(byte[] bArr, int i) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.a = m(bArr);
        this.b = i;
    }

    private void h(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int remaining = byteBuffer2.remaining();
        int i = remaining / 64;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer c2 = c(bArr, this.b + i3);
            if (i3 == i) {
                uf0.c(byteBuffer, byteBuffer2, c2, remaining % 64);
            } else {
                uf0.c(byteBuffer, byteBuffer2, c2, 64);
            }
        }
    }

    static void i(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int j = j(i5 ^ iArr[i4], 16);
        iArr[i4] = j;
        int i6 = iArr[i3] + j;
        iArr[i3] = i6;
        int j2 = j(iArr[i2] ^ i6, 12);
        iArr[i2] = j2;
        int i7 = iArr[i] + j2;
        iArr[i] = i7;
        int j3 = j(iArr[i4] ^ i7, 8);
        iArr[i4] = j3;
        int i8 = iArr[i3] + j3;
        iArr[i3] = i8;
        iArr[i2] = j(iArr[i2] ^ i8, 7);
    }

    private static int j(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    static void k(int[] iArr, int[] iArr2) {
        int[] iArr3 = c;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    static void l(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            i(iArr, 0, 4, 8, 12);
            i(iArr, 1, 5, 9, 13);
            i(iArr, 2, 6, 10, 14);
            i(iArr, 3, 7, 11, 15);
            i(iArr, 0, 5, 10, 15);
            i(iArr, 1, 6, 11, 12);
            i(iArr, 2, 7, 8, 13);
            i(iArr, 3, 4, 9, 14);
        }
    }

    static int[] m(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    @Override // defpackage.vi3
    public byte[] a(byte[] bArr) {
        if (bArr.length > Integer.MAX_VALUE - g()) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer allocate = ByteBuffer.allocate(g() + bArr.length);
        f(allocate, bArr);
        return allocate.array();
    }

    @Override // defpackage.vi3
    public byte[] b(byte[] bArr) {
        return e(ByteBuffer.wrap(bArr));
    }

    ByteBuffer c(byte[] bArr, int i) {
        int[] d = d(m(bArr), i);
        int[] iArr = (int[]) d.clone();
        l(iArr);
        for (int i2 = 0; i2 < d.length; i2++) {
            d[i2] = d[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(d, 0, 16);
        return order;
    }

    abstract int[] d(int[] iArr, int i);

    byte[] e(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < g()) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr = new byte[g()];
        byteBuffer.get(bArr);
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        h(bArr, allocate, byteBuffer);
        return allocate.array();
    }

    void f(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - g() < bArr.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        byte[] c2 = po6.c(g());
        byteBuffer.put(c2);
        h(c2, byteBuffer, ByteBuffer.wrap(bArr));
    }

    abstract int g();
}
