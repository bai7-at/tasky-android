package io.embrace.android.embracesdk.network.logging;

import android.util.Base64;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes5.dex */
class NetworkCaptureEncryptionManager {
    private static final String UTF_8 = "UTF-8";
    private static final int mDecryptionBlockSize = 256;
    private static final int mEncryptionBlockSize = 245;
    private final InternalEmbraceLogger logger;
    private final String transformation = "RSA/ECB/PKCS1Padding";

    NetworkCaptureEncryptionManager(InternalEmbraceLogger internalEmbraceLogger) {
        this.logger = internalEmbraceLogger;
    }

    private byte[] append(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = bArr[i];
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            bArr3[bArr.length + i2] = bArr2[i2];
        }
        return bArr3;
    }

    private byte[] decodeWithBuffer(Cipher cipher, byte[] bArr, int i) throws IllegalBlockSizeException, BadPaddingException {
        byte[] bArr2 = new byte[0];
        byte[] bArr3 = new byte[bArr.length > i ? i : bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (i2 > 0 && i2 % i == 0) {
                bArr2 = append(bArr2, cipher.doFinal(bArr3));
                bArr3 = new byte[i2 + i > bArr.length ? bArr.length - i2 : i];
            }
            bArr3[i2 % i] = bArr[i2];
        }
        return append(bArr2, cipher.doFinal(bArr3));
    }

    private Key getKeyFromText(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        } catch (InvalidKeySpecException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public String decrypt(String str, Key key) {
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(2, key);
            return new String(decodeWithBuffer(cipher, Base64.decode(str, 0), 256), "UTF-8");
        } catch (IOException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            this.logger.logError("data cannot be encrypted", e);
            return null;
        }
    }

    public String encrypt(String str, String str2) {
        try {
            Key keyFromText = getKeyFromText(str2);
            if (keyFromText != null) {
                return encrypt(str, keyFromText);
            }
            this.logger.logError("wrong public key");
            return null;
        } catch (Exception e) {
            this.logger.logError("data cannot be encrypted", e);
            return null;
        }
    }

    private String encrypt(String str, Key key) {
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, key);
            return "" + Base64.encodeToString(decodeWithBuffer(cipher, str.getBytes("UTF-8"), mEncryptionBlockSize), 0);
        } catch (IOException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            this.logger.logError("data cannot be encrypted", e);
            return "";
        }
    }
}
