package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class nze implements yxe {
    private final SecretKey a;
    private final byte[] b;
    private final byte[] c;

    public nze(byte[] bArr) {
        rze.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        this.a = secretKeySpec;
        Cipher b = b();
        b.init(1, secretKeySpec);
        byte[] a = exe.a(b.doFinal(new byte[16]));
        this.b = a;
        this.c = exe.a(a);
    }

    private static Cipher b() {
        if (gse.a(1)) {
            return (Cipher) bze.b.a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // defpackage.yxe
    public final byte[] a(byte[] bArr, int i) {
        byte[] c;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKey secretKey = this.a;
        Cipher b = b();
        b.init(1, secretKey);
        int length = bArr.length;
        int max = Math.max(1, (int) Math.ceil(length / 16.0d));
        int i2 = max - 1;
        int i3 = i2 * 16;
        if (max * 16 == length) {
            c = rye.d(bArr, i3, this.b, 0, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i3, length);
            int length2 = copyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[length2] = Byte.MIN_VALUE;
            c = rye.c(copyOf, this.c);
        }
        byte[] bArr2 = new byte[16];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2 = b.doFinal(rye.d(bArr2, 0, bArr, i4 * 16, 16));
        }
        return Arrays.copyOf(b.doFinal(rye.c(c, bArr2)), i);
    }
}
