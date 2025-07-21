package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class ga implements o9 {
    private static final ThreadLocal e = new a();
    private static final ThreadLocal f = new b();
    private final byte[] a;
    private final byte[] b;
    private final SecretKeySpec c;
    private final int d;

    class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) n12.f.a("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    class b extends ThreadLocal {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) n12.f.a("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public ga(byte[] bArr, int i) {
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.d = i;
        q39.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        this.c = secretKeySpec;
        Cipher cipher = (Cipher) e.get();
        cipher.init(1, secretKeySpec);
        byte[] c = c(cipher.doFinal(new byte[16]));
        this.a = c;
        this.b = c(c);
    }

    private static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            int i2 = i + 1;
            bArr2[i] = (byte) (((bArr[i] << 1) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        bArr2[15] = (byte) ((bArr[15] << 1) ^ ((bArr[0] & 128) != 0 ? 135 : 0));
        return bArr2;
    }

    private byte[] d(Cipher cipher, int i, byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(f(bArr2, this.a));
        }
        byte[] doFinal = cipher.doFinal(bArr2);
        int i4 = 0;
        while (i3 - i4 > 16) {
            for (int i5 = 0; i5 < 16; i5++) {
                doFinal[i5] = (byte) (doFinal[i5] ^ bArr[(i2 + i4) + i5]);
            }
            doFinal = cipher.doFinal(doFinal);
            i4 += 16;
        }
        return cipher.doFinal(f(doFinal, e(Arrays.copyOfRange(bArr, i4 + i2, i2 + i3))));
    }

    private byte[] e(byte[] bArr) {
        if (bArr.length == 16) {
            return f(bArr, this.a);
        }
        byte[] copyOf = Arrays.copyOf(this.b, 16);
        for (int i = 0; i < bArr.length; i++) {
            copyOf[i] = (byte) (copyOf[i] ^ bArr[i]);
        }
        copyOf[bArr.length] = (byte) (copyOf[bArr.length] ^ 128);
        return copyOf;
    }

    private static byte[] f(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    @Override // defpackage.o9
    public byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.d;
        if (length > 2147483631 - i) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + i + 16];
        byte[] c = po6.c(i);
        System.arraycopy(c, 0, bArr3, 0, this.d);
        Cipher cipher = (Cipher) e.get();
        cipher.init(1, this.c);
        byte[] d = d(cipher, 0, c, 0, c.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] d2 = d(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = (Cipher) f.get();
        cipher2.init(1, this.c, new IvParameterSpec(d));
        cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.d);
        byte[] d3 = d(cipher, 2, bArr3, this.d, bArr.length);
        int length2 = bArr.length + this.d;
        for (int i2 = 0; i2 < 16; i2++) {
            bArr3[length2 + i2] = (byte) ((d2[i2] ^ d[i2]) ^ d3[i2]);
        }
        return bArr3;
    }

    @Override // defpackage.o9
    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = (bArr.length - this.d) - 16;
        if (length < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = (Cipher) e.get();
        cipher.init(1, this.c);
        byte[] d = d(cipher, 0, bArr, 0, this.d);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        byte[] d2 = d(cipher, 1, bArr3, 0, bArr3.length);
        byte[] d3 = d(cipher, 2, bArr, this.d, length);
        int length2 = bArr.length - 16;
        byte b2 = 0;
        for (int i = 0; i < 16; i++) {
            b2 = (byte) (b2 | (((bArr[length2 + i] ^ d2[i]) ^ d[i]) ^ d3[i]));
        }
        if (b2 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f.get();
        cipher2.init(1, this.c, new IvParameterSpec(d));
        return cipher2.doFinal(bArr, this.d, length);
    }
}
