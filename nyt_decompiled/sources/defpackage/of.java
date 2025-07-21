package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* loaded from: classes3.dex */
public final class of implements jx3 {
    private static final String c = "of";
    private final String a;
    private KeyStore b;

    public static final class b {
        String a = null;
        KeyStore b;

        public b() {
            this.b = null;
            if (!of.f()) {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.b = keyStore;
                keyStore.load(null);
            } catch (IOException | GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }

        public of a() {
            return new of(this);
        }

        public b b(KeyStore keyStore) {
            if (keyStore == null) {
                throw new IllegalArgumentException("val cannot be null");
            }
            this.b = keyStore;
            return this;
        }
    }

    public static void d(String str) {
        if (new of().e(str)) {
            throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", str));
        }
        String b2 = q39.b("android-keystore://", str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance(JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM, "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(b2, 3).setKeySize(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean f() {
        return true;
    }

    private static o9 g(o9 o9Var) {
        byte[] c2 = po6.c(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(c2, o9Var.b(o9Var.a(c2, bArr), bArr))) {
            return o9Var;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        if (r3.toLowerCase(java.util.Locale.US).startsWith("android-keystore://") != false) goto L17;
     */
    @Override // defpackage.jx3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean a(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2.a     // Catch: java.lang.Throwable -> Le
            r1 = 1
            if (r0 == 0) goto L10
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            monitor-exit(r2)
            return r1
        Le:
            r3 = move-exception
            goto L26
        L10:
            java.lang.String r0 = r2.a     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L23
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = r3.toLowerCase(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = "android-keystore://"
            boolean r3 = r3.startsWith(r0)     // Catch: java.lang.Throwable -> Le
            if (r3 == 0) goto L23
            goto L24
        L23:
            r1 = 0
        L24:
            monitor-exit(r2)
            return r1
        L26:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of.a(java.lang.String):boolean");
    }

    @Override // defpackage.jx3
    public synchronized o9 b(String str) {
        try {
            String str2 = this.a;
            if (str2 != null && !str2.equals(str)) {
                throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.a, str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return g(new nf(q39.b("android-keystore://", str), this.b));
    }

    synchronized boolean e(String str) {
        String b2;
        b2 = q39.b("android-keystore://", str);
        try {
        } catch (NullPointerException unused) {
            Log.w(c, "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again.");
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.b = keyStore;
                keyStore.load(null);
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            } catch (InterruptedException unused2) {
            }
            return this.b.containsAlias(b2);
        }
        return this.b.containsAlias(b2);
    }

    public of() {
        this(new b());
    }

    private of(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
    }
}
