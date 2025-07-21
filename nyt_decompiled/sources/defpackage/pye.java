package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class pye implements qke {
    private static final ThreadLocal f = new nye();
    private static final ThreadLocal g = new oye();
    private final byte[] a;
    private final byte[] b;
    private final byte[] c;
    private final SecretKeySpec d;
    private final int e;

    private pye(byte[] bArr, int i, byte[] bArr2) {
        if (!gse.a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.e = i;
        rze.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        this.d = secretKeySpec;
        Cipher cipher = (Cipher) f.get();
        cipher.init(1, secretKeySpec);
        byte[] b = b(cipher.doFinal(new byte[16]));
        this.a = b;
        this.b = b(b);
        this.c = bArr2;
    }

    public static qke a(lne lneVar) {
        if (!gse.a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        lneVar.a();
        return new pye(lneVar.c().d(ale.a()), lneVar.a().b(), lneVar.b().c());
    }

    private static byte[] b(byte[] bArr) {
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

    private final byte[] c(Cipher cipher, int i, byte[] bArr, int i2, int i3) {
        byte[] copyOf;
        int length;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(e(bArr2, this.a));
        }
        byte[] doFinal = cipher.doFinal(bArr2);
        int i4 = 0;
        int i5 = 0;
        while (i3 - i5 > 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                doFinal[i6] = (byte) (bArr[(i2 + i5) + i6] ^ doFinal[i6]);
            }
            doFinal = cipher.doFinal(doFinal);
            i5 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i5 + i2, i2 + i3);
        if (copyOfRange.length == 16) {
            copyOf = e(copyOfRange, this.a);
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
        return cipher.doFinal(e(doFinal, copyOf));
    }

    private final byte[] d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = (length - this.e) - 16;
        if (i < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = (Cipher) f.get();
        cipher.init(1, this.d);
        byte[] c = c(cipher, 0, bArr, 0, this.e);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        byte[] c2 = c(cipher, 1, bArr3, 0, bArr3.length);
        byte[] c3 = c(cipher, 2, bArr, this.e, i);
        int i2 = length - 16;
        byte b = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            b = (byte) (b | (((bArr[i2 + i3] ^ c2[i3]) ^ c[i3]) ^ c3[i3]));
        }
        if (b != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) g.get();
        cipher2.init(1, this.d, new IvParameterSpec(c));
        return cipher2.doFinal(bArr, this.e, i);
    }

    private static byte[] e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    @Override // defpackage.qke
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.c;
        if (bArr3.length == 0) {
            return d(bArr, bArr2);
        }
        if (!bve.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.c;
        return d(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }
}
