package androidx.security.crypto;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.ff4;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* loaded from: classes.dex */
public final class MasterKey {
    private final String a;
    private final KeyGenParameterSpec b;

    public enum KeyScheme {
        AES256_GCM
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[KeyScheme.values().length];
            a = iArr;
            try {
                iArr[KeyScheme.AES256_GCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static final class b {
        private final String a;
        private KeyGenParameterSpec b;
        private KeyScheme c;
        private boolean d;
        private int e;
        private boolean f;
        private final Context g;

        public b(Context context) {
            this(context, "_androidx_security_master_key_");
        }

        private MasterKey b() {
            KeyScheme keyScheme = this.c;
            if (keyScheme == null && this.b == null) {
                throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
            }
            if (keyScheme == KeyScheme.AES256_GCM) {
                KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(this.a, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH);
                if (this.d) {
                    keySize.setUserAuthenticationRequired(true).setUserAuthenticationValidityDurationSeconds(this.e);
                }
                if (this.f && this.g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                    keySize.setIsStrongBoxBacked(true);
                }
                this.b = keySize.build();
            }
            KeyGenParameterSpec keyGenParameterSpec = this.b;
            if (keyGenParameterSpec != null) {
                return new MasterKey(ff4.c(keyGenParameterSpec), this.b);
            }
            throw new NullPointerException("KeyGenParameterSpec was null after build() check");
        }

        public MasterKey a() {
            return b();
        }

        public b c(KeyScheme keyScheme) {
            if (a.a[keyScheme.ordinal()] == 1) {
                if (this.b != null) {
                    throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
                }
                this.c = keyScheme;
                return this;
            }
            throw new IllegalArgumentException("Unsupported scheme: " + keyScheme);
        }

        public b(Context context, String str) {
            this.g = context.getApplicationContext();
            this.a = str;
        }
    }

    MasterKey(String str, Object obj) {
        this.a = str;
        this.b = (KeyGenParameterSpec) obj;
    }

    String a() {
        return this.a;
    }

    public boolean b() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.containsAlias(this.a);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.a + ", isKeyStoreBacked=" + b() + "}";
    }
}
