package defpackage;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes3.dex */
public final class nf implements o9 {
    private static final String b = "nf";
    private final SecretKey a;

    nf(String str, KeyStore keyStore) {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.a = secretKey;
        if (secretKey != null) {
            return;
        }
        throw new InvalidKeyException("Keystore cannot load the key with ID: " + str);
    }

    private byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, this.a, gCMParameterSpec);
        cipher.updateAAD(bArr2);
        return cipher.doFinal(bArr, 12, bArr.length - 12);
    }

    private byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, this.a);
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
        System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
        return bArr3;
    }

    private static void e() {
        try {
            Thread.sleep((int) (Math.random() * 100.0d));
        } catch (InterruptedException unused) {
        }
    }

    @Override // defpackage.o9
    public byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            return d(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w(b, "encountered a potentially transient KeyStore error, will wait and retry", e);
            e();
            return this.d(bArr, bArr2);
        }
    }

    @Override // defpackage.o9
    public byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            return c(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w(b, "encountered a potentially transient KeyStore error, will wait and retry", e);
            e();
            return this.c(bArr, bArr2);
        }
    }
}
