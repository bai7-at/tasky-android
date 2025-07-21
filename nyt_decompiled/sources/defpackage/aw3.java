package defpackage;

import com.nytimes.android.internal.auth.key.data.KeystoreType;
import java.io.InputStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;

/* loaded from: classes4.dex */
public final class aw3 {
    public static final aw3 a = new aw3();

    private aw3() {
    }

    public final PrivateKey a(InputStream inputStream, String str, String str2, KeystoreType keystoreType) {
        zq3.h(inputStream, "keystoreStream");
        zq3.h(str, "aliasName");
        zq3.h(str2, "p12Password");
        zq3.h(keystoreType, "keystoreType");
        KeyStore keyStore = KeyStore.getInstance(keystoreType.name());
        char[] charArray = str2.toCharArray();
        zq3.g(charArray, "toCharArray(...)");
        keyStore.load(inputStream, charArray);
        char[] charArray2 = str2.toCharArray();
        zq3.g(charArray2, "toCharArray(...)");
        Key key = keyStore.getKey(str, charArray2);
        zq3.f(key, "null cannot be cast to non-null type java.security.PrivateKey");
        return (PrivateKey) key;
    }
}
