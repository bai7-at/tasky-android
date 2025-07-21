package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class g12 implements o9 {
    private final vi3 a;
    private final md4 b;
    private final int c;

    public g12(vi3 vi3Var, md4 md4Var, int i) {
        this.a = vi3Var;
        this.b = md4Var;
        this.c = i;
    }

    @Override // defpackage.o9
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a = this.a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return uf0.a(a, this.b.b(uf0.a(bArr2, a, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // defpackage.o9
    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.c;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.c, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.b.a(copyOfRange2, uf0.a(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        return this.a.b(copyOfRange);
    }
}
