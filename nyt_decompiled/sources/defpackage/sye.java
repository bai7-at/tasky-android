package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class sye implements qke {
    private final ure a;
    private final byte[] b;

    private sye(byte[] bArr, byte[] bArr2) {
        this.a = new ure(bArr);
        this.b = bArr2;
    }

    public static qke a(ipe ipeVar) {
        return new sye(ipeVar.d().d(ale.a()), ipeVar.c().c());
    }

    private final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.a.b(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }

    @Override // defpackage.qke
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.b;
        if (bArr3.length == 0) {
            return b(bArr, bArr2);
        }
        if (!bve.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.b;
        return b(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }
}
