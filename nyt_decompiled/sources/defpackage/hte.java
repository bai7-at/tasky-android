package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class hte {
    private static final hte b = new hte();
    private final Map a = new HashMap();

    public static hte b() {
        return b;
    }

    private final synchronized ble d(ple pleVar, Integer num) {
        gte gteVar;
        gteVar = (gte) this.a.get(pleVar.getClass());
        if (gteVar == null) {
            throw new GeneralSecurityException("Cannot create a new key for parameters " + String.valueOf(pleVar) + ": no key creator for this class was registered.");
        }
        return gteVar.a(pleVar, null);
    }

    public final ble a(ple pleVar, Integer num) {
        return d(pleVar, null);
    }

    public final synchronized void c(gte gteVar, Class cls) {
        try {
            gte gteVar2 = (gte) this.a.get(cls);
            if (gteVar2 != null && !gteVar2.equals(gteVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls.toString() + " already inserted");
            }
            this.a.put(cls, gteVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
