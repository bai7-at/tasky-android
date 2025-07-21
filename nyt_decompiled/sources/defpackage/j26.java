package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class j26 implements i26 {
    private final SecretKey a;
    private byte[] b;
    private byte[] c;

    public j26(byte[] bArr) {
        q39.a(bArr.length);
        this.a = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        b();
    }

    private void b() {
        Cipher c = c();
        c.init(1, this.a);
        byte[] b = xa.b(c.doFinal(new byte[16]));
        this.b = b;
        this.c = xa.b(b);
    }

    private static Cipher c() {
        return (Cipher) n12.f.a("AES/ECB/NoPadding");
    }

    @Override // defpackage.i26
    public byte[] a(byte[] bArr, int i) {
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher c = c();
        c.init(1, this.a);
        int max = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
        byte[] d = max * 16 == bArr.length ? uf0.d(bArr, (max - 1) * 16, this.b, 0, 16) : uf0.e(xa.a(Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length)), this.c);
        byte[] bArr2 = new byte[16];
        for (int i2 = 0; i2 < max - 1; i2++) {
            bArr2 = c.doFinal(uf0.d(bArr2, 0, bArr, i2 * 16, 16));
        }
        return Arrays.copyOf(c.doFinal(uf0.e(d, bArr2)), i);
    }
}
