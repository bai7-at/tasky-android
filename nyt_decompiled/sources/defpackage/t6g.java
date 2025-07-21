package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class t6g implements wvf {
    private final SecretKey a;
    private final byte[] b;
    private final byte[] c;

    public t6g(byte[] bArr) {
        h7g.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        this.a = secretKeySpec;
        Cipher b = b();
        b.init(1, secretKeySpec);
        byte[] b2 = ouf.b(b.doFinal(new byte[16]));
        this.b = b2;
        this.c = ouf.b(b2);
    }

    private static Cipher b() {
        if (cif.a(1)) {
            return (Cipher) l5g.e.a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // defpackage.wvf
    public final byte[] a(byte[] bArr, int i) {
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher b = b();
        b.init(1, this.a);
        int length = bArr.length;
        int max = Math.max(1, (int) Math.ceil(length / 16.0d));
        byte[] e = max * 16 == length ? q4g.e(bArr, (max - 1) * 16, this.b, 0, 16) : q4g.d(ouf.a(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.c);
        byte[] bArr2 = new byte[16];
        for (int i2 = 0; i2 < max - 1; i2++) {
            bArr2 = b.doFinal(q4g.e(bArr2, 0, bArr, i2 * 16, 16));
        }
        return Arrays.copyOf(b.doFinal(q4g.d(e, bArr2)), i);
    }
}
