package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class jte {
    private static final jte b = new jte();
    private final Map a = new HashMap();

    public static jte a() {
        return b;
    }

    public final synchronized void b(ite iteVar, Class cls) {
        try {
            ite iteVar2 = (ite) this.a.get(cls);
            if (iteVar2 != null && !iteVar2.equals(iteVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.a.put(cls, iteVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
