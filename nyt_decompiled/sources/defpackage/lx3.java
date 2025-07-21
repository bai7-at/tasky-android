package defpackage;

import com.google.crypto.tink.g;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class lx3 implements o9 {
    private static final byte[] c = new byte[0];
    private final jw3 a;
    private final o9 b;

    public lx3(jw3 jw3Var, o9 o9Var) {
        this.a = jw3Var;
        this.b = o9Var;
    }

    private byte[] c(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }

    @Override // defpackage.o9
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] f = g.o(this.a).f();
        return c(this.b.a(f, c), ((o9) g.i(this.a.Q(), f, o9.class)).a(bArr, bArr2));
    }

    @Override // defpackage.o9
    public byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((o9) g.i(this.a.Q(), this.b.b(bArr3, c), o9.class)).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
