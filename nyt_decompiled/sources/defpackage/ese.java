package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes3.dex */
final class ese extends ThreadLocal {
    ese() {
    }

    protected static final Cipher a() {
        boolean d;
        try {
            Cipher cipher = (Cipher) bze.b.a("AES/GCM-SIV/NoPadding");
            d = fse.d(cipher);
            if (d) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
