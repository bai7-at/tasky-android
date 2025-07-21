package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.gms.internal.ads.zzavn;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class kfa {
    private static Cipher a;
    private static final Object b = new Object();
    private static final Object c = new Object();

    public kfa(SecureRandom secureRandom) {
    }

    private static final Cipher c() {
        Cipher cipher;
        synchronized (c) {
            try {
                if (a == null) {
                    a = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
                }
                cipher = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }

    public final String a(byte[] bArr, byte[] bArr2) {
        byte[] doFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
            synchronized (b) {
                c().init(1, secretKeySpec, (SecureRandom) null);
                doFinal = c().doFinal(bArr2);
                iv = c().getIV();
            }
            int length2 = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length2];
            allocate.get(bArr3);
            return ida.a(bArr3, false);
        } catch (InvalidKeyException e) {
            throw new zzavn(this, e);
        } catch (NoSuchAlgorithmException e2) {
            throw new zzavn(this, e2);
        } catch (BadPaddingException e3) {
            throw new zzavn(this, e3);
        } catch (IllegalBlockSizeException e4) {
            throw new zzavn(this, e4);
        } catch (NoSuchPaddingException e5) {
            throw new zzavn(this, e5);
        }
    }

    public final byte[] b(byte[] bArr, String str) {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] b2 = ida.b(str, false);
            int length2 = b2.length;
            if (length2 <= 16) {
                throw new zzavn(this);
            }
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(b2);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            allocate.get(bArr2);
            allocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
            synchronized (b) {
                c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                doFinal = c().doFinal(bArr3);
            }
            return doFinal;
        } catch (IllegalArgumentException e) {
            throw new zzavn(this, e);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new zzavn(this, e2);
        } catch (InvalidKeyException e3) {
            throw new zzavn(this, e3);
        } catch (NoSuchAlgorithmException e4) {
            throw new zzavn(this, e4);
        } catch (BadPaddingException e5) {
            throw new zzavn(this, e5);
        } catch (IllegalBlockSizeException e6) {
            throw new zzavn(this, e6);
        } catch (NoSuchPaddingException e7) {
            throw new zzavn(this, e7);
        }
    }
}
