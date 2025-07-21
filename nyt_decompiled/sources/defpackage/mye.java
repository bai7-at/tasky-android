package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class mye implements mze {
    private static final ThreadLocal d = new lye();
    private final SecretKeySpec a;
    private final int b;
    private final int c;

    public mye(byte[] bArr, int i) {
        if (!gse.a(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        rze.a(bArr.length);
        this.a = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        int blockSize = ((Cipher) d.get()).getBlockSize();
        this.c = blockSize;
        if (i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.b = i;
    }

    @Override // defpackage.mze
    public final byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i = this.b;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        int i2 = this.b;
        int i3 = length - i2;
        byte[] bArr3 = new byte[i3];
        Cipher cipher = (Cipher) d.get();
        byte[] bArr4 = new byte[this.c];
        System.arraycopy(bArr2, 0, bArr4, 0, this.b);
        cipher.init(2, this.a, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i2, i3, bArr3, 0) == i3) {
            return bArr3;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
