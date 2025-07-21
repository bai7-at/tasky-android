package defpackage;

import com.google.android.gms.internal.ads.ef;
import com.google.android.gms.internal.ads.hf;
import com.google.android.gms.internal.ads.zzgyl;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class cme {
    private static final Logger a = Logger.getLogger(cme.class.getName());
    private static final ConcurrentMap b = new ConcurrentHashMap();
    private static final Set c;
    public static final /* synthetic */ int d = 0;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(qke.class);
        hashSet.add(wke.class);
        hashSet.add(eme.class);
        hashSet.add(zke.class);
        hashSet.add(xke.class);
        hashSet.add(ole.class);
        hashSet.add(yxe.class);
        hashSet.add(yle.class);
        hashSet.add(bme.class);
        c = Collections.unmodifiableSet(hashSet);
    }

    public static synchronized ef a(hf hfVar) {
        ef b2;
        synchronized (cme.class) {
            cle b3 = qse.c().b(hfVar.R());
            if (!qse.c().e(hfVar.R())) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(hfVar.R())));
            }
            b2 = b3.b(hfVar.Q());
        }
        return b2;
    }

    public static Class b(Class cls) {
        try {
            return pte.a().b(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object c(ef efVar, Class cls) {
        return d(efVar.Q(), efVar.P(), cls);
    }

    public static Object d(String str, zzgyl zzgylVar, Class cls) {
        return qse.c().a(str, cls).a(zzgylVar);
    }

    public static synchronized void e(cle cleVar, boolean z) {
        synchronized (cme.class) {
            if (cleVar == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            if (!c.contains(cleVar.zzb())) {
                throw new GeneralSecurityException("Registration of key managers for class " + cleVar.zzb().toString() + " has been disabled. Please file an issue on https://github.com/tink-crypto/tink-java");
            }
            if (!gse.a(1)) {
                throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
            }
            qse.c().d(cleVar, true);
        }
    }

    public static synchronized void f(xle xleVar) {
        synchronized (cme.class) {
            pte.a().f(xleVar);
        }
    }
}
