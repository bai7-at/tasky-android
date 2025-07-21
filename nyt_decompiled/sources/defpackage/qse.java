package defpackage;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class qse {
    private static final Logger c = Logger.getLogger(qse.class.getName());
    private static final qse d = new qse();
    private final ConcurrentMap a = new ConcurrentHashMap();
    private final ConcurrentMap b = new ConcurrentHashMap();

    public static qse c() {
        return d;
    }

    private final synchronized pse g(String str) {
        if (!this.a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (pse) this.a.get(str);
    }

    private final synchronized void h(pse pseVar, boolean z, boolean z2) {
        try {
            String str = ((zse) pseVar.a).a;
            if (this.b.containsKey(str) && !((Boolean) this.b.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            pse pseVar2 = (pse) this.a.get(str);
            if (pseVar2 != null && !pseVar2.a().equals(pseVar.a())) {
                c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, pseVar2.a().getName(), pseVar.a().getName()));
            }
            this.a.putIfAbsent(str, pseVar);
            this.b.put(str, Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final cle a(String str, Class cls) {
        pse g = g(str);
        if (g.b().contains(cls)) {
            if (((zse) g.a).b.equals(cls)) {
                return g.a;
            }
            throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
        }
        String name = cls.getName();
        String valueOf = String.valueOf(g.a());
        Set<Class> b = g.b();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : b) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", supported primitives: " + sb.toString());
    }

    public final cle b(String str) {
        return g(str).a;
    }

    public final synchronized void d(cle cleVar, boolean z) {
        f(cleVar, 1, true);
    }

    public final boolean e(String str) {
        return ((Boolean) this.b.get(str)).booleanValue();
    }

    public final synchronized void f(cle cleVar, int i, boolean z) {
        if (!gse.a(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        h(new pse(cleVar), false, true);
    }
}
