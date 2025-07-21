package defpackage;

import java.security.Provider;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class vye implements aze {
    private final kze a;

    @Override // defpackage.aze
    public final Object a(String str) {
        Iterator it2 = bze.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        while (it2.hasNext()) {
            try {
                return this.a.a(str, (Provider) it2.next());
            } catch (Exception unused) {
            }
        }
        return this.a.a(str, null);
    }
}
