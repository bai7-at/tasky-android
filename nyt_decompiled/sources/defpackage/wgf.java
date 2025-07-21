package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes3.dex */
abstract class wgf {
    int[] a;
    private final int b;

    public wgf(byte[] bArr, int i) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.a = mgf.d(bArr);
        this.b = i;
    }

    abstract int a();

    abstract int[] b(int[] iArr, int i);

    final ByteBuffer c(byte[] bArr, int i) {
        int[] b = b(mgf.d(bArr), i);
        int[] iArr = (int[]) b.clone();
        mgf.c(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            b[i2] = b[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b, 0, 16);
        return order;
    }

    public final void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr2);
        if (bArr.length != a()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + a());
        }
        int remaining = wrap.remaining();
        int i = remaining / 64;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer c = c(bArr, this.b + i3);
            if (i3 == i) {
                q4g.a(byteBuffer, wrap, c, remaining % 64);
            } else {
                q4g.a(byteBuffer, wrap, c, 64);
            }
        }
    }
}
