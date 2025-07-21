package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class l5g {
    private static final Logger b = Logger.getLogger(l5g.class.getName());
    private static final List c;
    private static final boolean d;
    public static final l5g e;
    public static final l5g f;
    public static final l5g g;
    public static final l5g h;
    public static final l5g i;
    public static final l5g j;
    public static final l5g k;
    private final l6g a;

    static {
        if (eif.b()) {
            c = b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            d = false;
        } else if (f7g.a()) {
            c = b("GmsCore_OpenSSL", "AndroidOpenSSL");
            d = true;
        } else {
            c = new ArrayList();
            d = true;
        }
        e = new l5g(new x5g());
        f = new l5g(new f6g());
        g = new l5g(new j6g());
        h = new l5g(new h6g());
        i = new l5g(new z5g());
        j = new l5g(new d6g());
        k = new l5g(new b6g());
    }

    public l5g(l6g l6gVar) {
        this.a = l6gVar;
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                b.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    public final Object a(String str) {
        Iterator it2 = c.iterator();
        Exception exc = null;
        while (it2.hasNext()) {
            try {
                return this.a.a(str, (Provider) it2.next());
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
        if (d) {
            return this.a.a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
