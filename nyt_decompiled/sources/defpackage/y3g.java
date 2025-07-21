package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class y3g implements r6g {
    private static final ThreadLocal d = new w3g();
    private final SecretKeySpec a;
    private final int b;
    private final int c;

    public y3g(byte[] bArr, int i) {
        if (!cif.a(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        h7g.a(bArr.length);
        this.a = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        int blockSize = ((Cipher) d.get()).getBlockSize();
        this.c = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.b = i;
    }

    @Override // defpackage.r6g
    public final byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i = this.b;
        if (length > Integer.MAX_VALUE - i) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - this.b));
        }
        byte[] bArr2 = new byte[i + length];
        byte[] a = d7g.a(i);
        System.arraycopy(a, 0, bArr2, 0, this.b);
        int i2 = this.b;
        Cipher cipher = (Cipher) d.get();
        byte[] bArr3 = new byte[this.c];
        System.arraycopy(a, 0, bArr3, 0, this.b);
        cipher.init(1, this.a, new IvParameterSpec(bArr3));
        if (cipher.doFinal(bArr, 0, length, bArr2, i2) == length) {
            return bArr2;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
