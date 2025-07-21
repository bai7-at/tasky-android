package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class fte {
    public static final qxe a = new ete(null);

    public static xxe a(wle wleVar) {
        dle dleVar;
        sxe sxeVar = new sxe();
        sxeVar.b(wleVar.b());
        Iterator it2 = wleVar.d().iterator();
        while (it2.hasNext()) {
            for (sle sleVar : (List) it2.next()) {
                int h = sleVar.h() - 2;
                if (h == 1) {
                    dleVar = dle.b;
                } else if (h == 2) {
                    dleVar = dle.c;
                } else {
                    if (h != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    dleVar = dle.d;
                }
                int a2 = sleVar.a();
                String f = sleVar.f();
                if (f.startsWith("type.googleapis.com/google.crypto.")) {
                    f = f.substring(34);
                }
                sxeVar.a(dleVar, a2, f, sleVar.c().name());
            }
        }
        if (wleVar.a() != null) {
            sxeVar.c(wleVar.a().a());
        }
        try {
            return sxeVar.d();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
