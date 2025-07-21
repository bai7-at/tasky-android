package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class zye implements aze {
    private final kze a;

    @Override // defpackage.aze
    public final Object a(String str) {
        Iterator it2 = bze.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
        Exception exc = null;
        while (it2.hasNext()) {
            try {
                return this.a.a(str, (Provider) it2.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
