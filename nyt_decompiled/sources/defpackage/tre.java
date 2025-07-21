package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes3.dex */
abstract class tre {
    int[] a;
    private final int b;

    public tre(byte[] bArr, int i) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.a = pre.d(bArr);
        this.b = i;
    }

    abstract int a();

    abstract int[] b(int[] iArr, int i);

    final ByteBuffer c(byte[] bArr, int i) {
        int[] b = b(pre.d(bArr), i);
        int[] iArr = (int[]) b.clone();
        pre.c(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            b[i2] = b[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b, 0, 16);
        return order;
    }

    public final byte[] d(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != a()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + a());
        }
        int remaining = byteBuffer.remaining();
        int i = remaining / 64;
        for (int i2 = 0; i2 < i + 1; i2++) {
            ByteBuffer c = c(bArr, this.b + i2);
            if (i2 == i) {
                rye.a(allocate, byteBuffer, c, remaining % 64);
            } else {
                rye.a(allocate, byteBuffer, c, 64);
            }
        }
        return allocate.array();
    }
}
