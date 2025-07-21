package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class i4g implements kaf {
    private static final Collection c = Arrays.asList(64);
    private static final byte[] d = new byte[16];
    private final t6g a;
    private final byte[] b;

    public i4g(byte[] bArr) {
        if (!cif.a(1)) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        Collection collection = c;
        int length = bArr.length;
        if (collection.contains(Integer.valueOf(length))) {
            int i = length >> 1;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
            this.b = Arrays.copyOfRange(bArr, i, length);
            this.a = new t6g(copyOfRange);
            return;
        }
        throw new InvalidKeyException("invalid key size: " + length + " bytes; key must have 64 bytes");
    }

    @Override // defpackage.kaf
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] d2;
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) l5g.e.a("AES/CTR/NoPadding");
        byte[][] bArr3 = {bArr2, bArr};
        byte[] a = this.a.a(d, 16);
        for (int i = 0; i <= 0; i++) {
            byte[] bArr4 = bArr3[i];
            if (bArr4 == null) {
                bArr4 = new byte[0];
            }
            a = q4g.d(ouf.b(a), this.a.a(bArr4, 16));
        }
        byte[] bArr5 = bArr3[1];
        int length = bArr5.length;
        if (length >= 16) {
            int length2 = a.length;
            if (length < length2) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int i2 = length - length2;
            d2 = Arrays.copyOf(bArr5, length);
            for (int i3 = 0; i3 < a.length; i3++) {
                int i4 = i2 + i3;
                d2[i4] = (byte) (d2[i4] ^ a[i3]);
            }
        } else {
            d2 = q4g.d(ouf.a(bArr5), ouf.b(a));
        }
        byte[] a2 = this.a.a(d2, 16);
        byte[] bArr6 = (byte[]) a2.clone();
        bArr6[8] = (byte) (bArr6[8] & Byte.MAX_VALUE);
        bArr6[12] = (byte) (bArr6[12] & Byte.MAX_VALUE);
        cipher.init(1, new SecretKeySpec(this.b, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM), new IvParameterSpec(bArr6));
        return q4g.c(a2, cipher.doFinal(bArr));
    }
}
