package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
abstract class ahf {
    private final wgf a;
    private final wgf b;

    public ahf(byte[] bArr) {
        if (!cif.a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.a = a(bArr, 1);
        this.b = a(bArr, 0);
    }

    abstract wgf a(byte[] bArr, int i);

    public final void b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int position = byteBuffer.position();
        this.a.d(byteBuffer, bArr, bArr2);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        ByteBuffer c = this.b.c(bArr, 0);
        byte[] bArr4 = new byte[32];
        c.get(bArr4);
        int remaining = byteBuffer.remaining();
        int i = remaining % 16;
        int i2 = i == 0 ? remaining : (remaining + 16) - i;
        ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr3);
        order.position(0);
        order.put(byteBuffer);
        order.position(i2);
        order.putLong(0L);
        order.putLong(remaining);
        byte[] a = ghf.a(bArr4, order.array());
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(a);
    }

    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int length = bArr2.length;
        if (length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer allocate = ByteBuffer.allocate(length + 16);
        b(allocate, bArr, bArr2, bArr3);
        return allocate.array();
    }
}
