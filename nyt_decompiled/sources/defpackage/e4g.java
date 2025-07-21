package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class e4g implements haf {
    private static final ThreadLocal e = new a4g();
    private static final ThreadLocal f = new c4g();
    private final byte[] a;
    private final byte[] b;
    private final SecretKeySpec c;
    private final int d;

    public e4g(byte[] bArr, int i) {
        if (!cif.a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.d = i;
        h7g.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        this.c = secretKeySpec;
        Cipher cipher = (Cipher) e.get();
        cipher.init(1, secretKeySpec);
        byte[] a = a(cipher.doFinal(new byte[16]));
        this.a = a;
        this.b = a(a);
    }

    private static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            byte b = bArr[i];
            int i2 = i + 1;
            bArr2[i] = (byte) (((b + b) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        byte b2 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b2 + b2));
        return bArr2;
    }

    private final byte[] b(Cipher cipher, int i, byte[] bArr, int i2, int i3) {
        byte[] copyOf;
        int length;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(c(bArr2, this.a));
        }
        byte[] doFinal = cipher.doFinal(bArr2);
        int i4 = 0;
        int i5 = 0;
        while (i3 - i5 > 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                doFinal[i6] = (byte) (doFinal[i6] ^ bArr[(i2 + i5) + i6]);
            }
            doFinal = cipher.doFinal(doFinal);
            i5 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i5 + i2, i2 + i3);
        if (copyOfRange.length == 16) {
            copyOf = c(copyOfRange, this.a);
        } else {
            copyOf = Arrays.copyOf(this.b, 16);
            while (true) {
                length = copyOfRange.length;
                if (i4 >= length) {
                    break;
                }
                copyOf[i4] = (byte) (copyOf[i4] ^ copyOfRange[i4]);
                i4++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
        }
        return cipher.doFinal(c(doFinal, copyOf));
    }

    private static byte[] c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    @Override // defpackage.haf
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.d;
        if (length > 2147483631 - i) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[i + length + 16];
        byte[] a = d7g.a(i);
        System.arraycopy(a, 0, bArr3, 0, this.d);
        Cipher cipher = (Cipher) e.get();
        cipher.init(1, this.c);
        byte[] b = b(cipher, 0, a, 0, a.length);
        byte[] b2 = b(cipher, 1, bArr2, 0, 0);
        Cipher cipher2 = (Cipher) f.get();
        cipher2.init(1, this.c, new IvParameterSpec(b));
        cipher2.doFinal(bArr, 0, length, bArr3, this.d);
        byte[] b3 = b(cipher, 2, bArr3, this.d, length);
        int i2 = length + this.d;
        for (int i3 = 0; i3 < 16; i3++) {
            bArr3[i2 + i3] = (byte) ((b2[i3] ^ b[i3]) ^ b3[i3]);
        }
        return bArr3;
    }
}
