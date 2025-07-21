package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;

/* loaded from: classes3.dex */
abstract class zi0 implements o9 {
    private final xi0 a;
    private final xi0 b;

    public zi0(byte[] bArr) {
        this.a = g(bArr, 1);
        this.b = g(bArr, 0);
    }

    private byte[] c(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() < this.a.g() + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int position = byteBuffer.position();
        byte[] bArr2 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr2);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        byte[] bArr3 = new byte[this.a.g()];
        byteBuffer.get(bArr3);
        if (bArr == null) {
            bArr = new byte[0];
        }
        try {
            fz5.f(e(bArr3), f(bArr, byteBuffer), bArr2);
            byteBuffer.position(position);
            return this.a.e(byteBuffer);
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    private void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() < bArr.length + this.a.g() + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int position = byteBuffer.position();
        this.a.f(byteBuffer, bArr);
        byteBuffer.position(position);
        byte[] bArr3 = new byte[this.a.g()];
        byteBuffer.get(bArr3);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] a = fz5.a(e(bArr3), f(bArr2, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(a);
    }

    private byte[] e(byte[] bArr) {
        ByteBuffer c = this.b.c(bArr, 0);
        byte[] bArr2 = new byte[32];
        c.get(bArr2);
        return bArr2;
    }

    private static byte[] f(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int remaining = byteBuffer.remaining();
        int i = remaining % 16;
        int i2 = (i == 0 ? remaining : (remaining + 16) - i) + length;
        ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i2);
        order.putLong(bArr.length);
        order.putLong(remaining);
        return order.array();
    }

    @Override // defpackage.o9
    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 2147483631 - this.a.g()) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + this.a.g() + 16);
        d(allocate, bArr, bArr2);
        return allocate.array();
    }

    @Override // defpackage.o9
    public byte[] b(byte[] bArr, byte[] bArr2) {
        return c(ByteBuffer.wrap(bArr), bArr2);
    }

    abstract xi0 g(byte[] bArr, int i);
}
