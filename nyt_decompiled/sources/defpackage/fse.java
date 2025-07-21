package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class fse implements qke {
    private static final byte[] c = lze.b("7a806c");
    private static final byte[] d = lze.b("46bb91c3c5");
    private static final byte[] e = lze.b("36864200e0eaf5284d884a0e77d31646");
    private static final byte[] f = lze.b("bae8e37fc83441b16034566b");
    private static final byte[] g = lze.b("af60eb711bd85bc1e4d3e0a462e074eea428a8");
    private static final ThreadLocal h = new ese();
    private final SecretKey a;
    private final byte[] b;

    private fse(byte[] bArr, byte[] bArr2) {
        this.b = bArr2;
        rze.a(bArr.length);
        this.a = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
    }

    public static qke a(roe roeVar) {
        return new fse(roeVar.c().d(ale.a()), roeVar.b().c());
    }

    private static AlgorithmParameterSpec c(byte[] bArr, int i, int i2) {
        return new GCMParameterSpec(128, bArr, 0, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(Cipher cipher) {
        try {
            byte[] bArr = f;
            cipher.init(2, new SecretKeySpec(e, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM), c(bArr, 0, bArr.length));
            cipher.updateAAD(d);
            byte[] bArr2 = g;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), c);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    private final byte[] e(byte[] bArr, byte[] bArr2) {
        Cipher cipher = (Cipher) h.get();
        if (cipher == null) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.");
        }
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        cipher.init(2, this.a, c(bArr, 0, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, 12, length - 12);
    }

    @Override // defpackage.qke
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.b;
        if (bArr3.length == 0) {
            return e(bArr, bArr2);
        }
        if (!bve.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.b;
        return e(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }
}
