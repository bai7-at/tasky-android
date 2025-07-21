package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public abstract class kx3 {
    private static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static jx3 a(String str) {
        Iterator it2 = a.iterator();
        while (it2.hasNext()) {
            jx3 jx3Var = (jx3) it2.next();
            if (jx3Var.a(str)) {
                return jx3Var;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
