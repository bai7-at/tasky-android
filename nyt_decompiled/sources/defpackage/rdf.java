package defpackage;

import com.google.android.gms.internal.pal.h7;
import com.google.android.gms.internal.pal.k7;
import com.google.android.gms.internal.pal.zzaby;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class rdf {
    private static final Logger a = Logger.getLogger(rdf.class.getName());
    private static final AtomicReference b = new AtomicReference(new rbf());
    private static final ConcurrentMap c = new ConcurrentHashMap();
    private static final ConcurrentMap d = new ConcurrentHashMap();
    private static final ConcurrentMap e = new ConcurrentHashMap();
    private static final ConcurrentMap f = new ConcurrentHashMap();
    private static final ConcurrentMap g = new ConcurrentHashMap();

    public static iaf a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        ConcurrentMap concurrentMap = e;
        Locale locale = Locale.US;
        lh4.a(concurrentMap.get(str.toLowerCase(locale)));
        String format = String.format("no catalogue found for %s. ", str);
        if (str.toLowerCase(locale).startsWith("tinkaead")) {
            format = format.concat("Maybe call AeadConfig.register().");
        }
        if (str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
            format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
            format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkhybriddecrypt") || str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
            format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkmac")) {
            format = String.valueOf(format).concat("Maybe call MacConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkpublickeysign") || str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
            format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tink")) {
            format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
        }
        throw new GeneralSecurityException(format);
    }

    public static ebf b(String str) {
        return ((rbf) b.get()).b(str);
    }

    public static synchronized h7 c(k7 k7Var) {
        h7 c2;
        synchronized (rdf.class) {
            ebf b2 = b(k7Var.w());
            if (!((Boolean) d.get(k7Var.w())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(k7Var.w())));
            }
            c2 = b2.c(k7Var.v());
        }
        return c2;
    }

    public static synchronized zx9 d(k7 k7Var) {
        zx9 d2;
        synchronized (rdf.class) {
            ebf b2 = b(k7Var.w());
            if (!((Boolean) d.get(k7Var.w())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(k7Var.w())));
            }
            d2 = b2.d(k7Var.v());
        }
        return d2;
    }

    public static Class e(Class cls) {
        mdf mdfVar = (mdf) f.get(cls);
        if (mdfVar == null) {
            return null;
        }
        return mdfVar.zza();
    }

    public static Object f(h7 h7Var, Class cls) {
        return g(h7Var.x(), h7Var.w(), cls);
    }

    public static Object g(String str, zzaby zzabyVar, Class cls) {
        return ((rbf) b.get()).a(str, cls).a(zzabyVar);
    }

    public static Object h(String str, zx9 zx9Var, Class cls) {
        return ((rbf) b.get()).a(str, cls).b(zx9Var);
    }

    public static Object i(jdf jdfVar, Class cls) {
        mdf mdfVar = (mdf) f.get(cls);
        if (mdfVar == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(jdfVar.c().getName()));
        }
        if (mdfVar.zza().equals(jdfVar.c())) {
            return mdfVar.a(jdfVar);
        }
        throw new GeneralSecurityException("Wrong input primitive class, expected " + mdfVar.zza().toString() + ", got " + jdfVar.c().toString());
    }

    static synchronized Map j() {
        Map unmodifiableMap;
        synchronized (rdf.class) {
            unmodifiableMap = Collections.unmodifiableMap(g);
        }
        return unmodifiableMap;
    }

    public static synchronized void k(crf crfVar, dpf dpfVar, boolean z) {
        synchronized (rdf.class) {
            try {
                AtomicReference atomicReference = b;
                rbf rbfVar = new rbf((rbf) atomicReference.get());
                rbfVar.c(crfVar, dpfVar);
                String d2 = crfVar.d();
                String d3 = dpfVar.d();
                n(d2, crfVar.a().c(), true);
                n(d3, Collections.emptyMap(), false);
                if (!((rbf) atomicReference.get()).e(d2)) {
                    c.put(d2, new qdf(crfVar));
                    o(crfVar.d(), crfVar.a().c());
                }
                ConcurrentMap concurrentMap = d;
                concurrentMap.put(d2, Boolean.TRUE);
                concurrentMap.put(d3, Boolean.FALSE);
                atomicReference.set(rbfVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void l(dpf dpfVar, boolean z) {
        synchronized (rdf.class) {
            try {
                AtomicReference atomicReference = b;
                rbf rbfVar = new rbf((rbf) atomicReference.get());
                rbfVar.d(dpfVar);
                String d2 = dpfVar.d();
                n(d2, dpfVar.a().c(), true);
                if (!((rbf) atomicReference.get()).e(d2)) {
                    c.put(d2, new qdf(dpfVar));
                    o(d2, dpfVar.a().c());
                }
                d.put(d2, Boolean.TRUE);
                atomicReference.set(rbfVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void m(mdf mdfVar) {
        synchronized (rdf.class) {
            try {
                if (mdfVar == null) {
                    throw new IllegalArgumentException("wrapper must be non-null");
                }
                Class zzb = mdfVar.zzb();
                ConcurrentMap concurrentMap = f;
                if (concurrentMap.containsKey(zzb)) {
                    mdf mdfVar2 = (mdf) concurrentMap.get(zzb);
                    if (!mdfVar.getClass().getName().equals(mdfVar2.getClass().getName())) {
                        a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(zzb.toString()));
                        throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", zzb.getName(), mdfVar2.getClass().getName(), mdfVar.getClass().getName()));
                    }
                }
                concurrentMap.put(zzb, mdfVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static synchronized void n(String str, Map map, boolean z) {
        synchronized (rdf.class) {
            if (z) {
                try {
                    ConcurrentMap concurrentMap = d;
                    if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                    }
                    if (((rbf) b.get()).e(str)) {
                        for (Map.Entry entry : map.entrySet()) {
                            if (!g.containsKey(entry.getKey())) {
                                throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                            }
                        }
                    } else {
                        for (Map.Entry entry2 : map.entrySet()) {
                            if (g.containsKey(entry2.getKey())) {
                                throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, zx9] */
    private static void o(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            g.put((String) entry.getKey(), xbf.d(str, ((hof) entry.getValue()).a.D(), ((hof) entry.getValue()).b));
        }
    }
}
