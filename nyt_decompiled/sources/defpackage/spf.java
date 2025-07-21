package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class spf {
    public static final ivf a = new ppf(null);

    public static uvf a(jdf jdfVar) {
        ubf ubfVar;
        mvf mvfVar = new mvf();
        mvfVar.b(jdfVar.b());
        Iterator it2 = jdfVar.d().iterator();
        while (it2.hasNext()) {
            for (ncf ncfVar : (List) it2.next()) {
                int e = ncfVar.e() - 2;
                if (e == 1) {
                    ubfVar = ubf.b;
                } else if (e == 2) {
                    ubfVar = ubf.c;
                } else {
                    if (e != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    ubfVar = ubf.d;
                }
                mvfVar.a(ubfVar, ncfVar.a(), ncfVar.b());
            }
        }
        if (jdfVar.a() != null) {
            mvfVar.c(jdfVar.a().a());
        }
        try {
            return mvfVar.d();
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
