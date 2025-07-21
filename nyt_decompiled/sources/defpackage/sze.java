package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class sze implements qke {
    private final xre a;
    private final byte[] b;

    private sze(byte[] bArr, byte[] bArr2) {
        this.a = new xre(bArr);
        this.b = bArr2;
    }

    public static qke a(bre breVar) {
        return new sze(breVar.d().d(ale.a()), breVar.c().c());
    }

    private final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.a.b(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
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
