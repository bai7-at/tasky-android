package defpackage;

import defpackage.o12;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class n12 {
    private static final Logger d = Logger.getLogger(n12.class.getName());
    private static final List e;
    public static final n12 f;
    public static final n12 g;
    public static final n12 h;
    public static final n12 i;
    public static final n12 j;
    public static final n12 k;
    public static final n12 l;
    private o12 a;
    private List b = e;
    private boolean c = true;

    static {
        if (ac8.b()) {
            e = b("GmsCore_OpenSSL", "AndroidOpenSSL");
        } else {
            e = new ArrayList();
        }
        f = new n12(new o12.a());
        g = new n12(new o12.e());
        h = new n12(new o12.g());
        i = new n12(new o12.f());
        j = new n12(new o12.b());
        k = new n12(new o12.d());
        l = new n12(new o12.c());
    }

    public n12(o12 o12Var) {
        this.a = o12Var;
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                d.info(String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    public Object a(String str) {
        Iterator it2 = this.b.iterator();
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
        if (this.c) {
            return this.a.a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
