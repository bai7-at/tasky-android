package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public abstract class dcf {
    private static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static ccf a(String str) {
        Iterator it2 = a.iterator();
        if (!it2.hasNext()) {
            throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
        }
        lh4.a(it2.next());
        throw null;
    }
}
