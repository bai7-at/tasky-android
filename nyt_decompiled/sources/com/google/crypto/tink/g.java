package com.google.crypto.tink;

import com.google.crypto.tink.f;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.a;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.f0;
import defpackage.bw3;
import defpackage.jw3;
import defpackage.v26;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class g {
    private static final Logger a = Logger.getLogger(g.class.getName());
    private static final ConcurrentMap b = new ConcurrentHashMap();
    private static final ConcurrentMap c = new ConcurrentHashMap();
    private static final ConcurrentMap d = new ConcurrentHashMap();
    private static final ConcurrentMap e = new ConcurrentHashMap();
    private static final ConcurrentMap f = new ConcurrentHashMap();

    class a implements d {
        final /* synthetic */ com.google.crypto.tink.c a;

        a(com.google.crypto.tink.c cVar) {
            this.a = cVar;
        }

        @Override // com.google.crypto.tink.g.d
        public Class a() {
            return this.a.getClass();
        }

        @Override // com.google.crypto.tink.g.d
        public Set b() {
            return this.a.h();
        }

        @Override // com.google.crypto.tink.g.d
        public bw3 c(Class cls) {
            try {
                return new com.google.crypto.tink.b(this.a, cls);
            } catch (IllegalArgumentException e) {
                throw new GeneralSecurityException("Primitive type not supported", e);
            }
        }

        @Override // com.google.crypto.tink.g.d
        public bw3 d() {
            com.google.crypto.tink.c cVar = this.a;
            return new com.google.crypto.tink.b(cVar, cVar.a());
        }
    }

    class b implements c {
        final /* synthetic */ com.google.crypto.tink.c a;

        b(com.google.crypto.tink.c cVar) {
            this.a = cVar;
        }
    }

    private interface c {
    }

    private interface d {
        Class a();

        Set b();

        bw3 c(Class cls);

        bw3 d();
    }

    private static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    private static d b(com.google.crypto.tink.c cVar) {
        return new a(cVar);
    }

    private static c c(com.google.crypto.tink.c cVar) {
        return new b(cVar);
    }

    private static synchronized void d(String str, Class cls, boolean z) {
        synchronized (g.class) {
            ConcurrentMap concurrentMap = b;
            if (concurrentMap.containsKey(str)) {
                d dVar = (d) concurrentMap.get(str);
                if (!dVar.a().equals(cls)) {
                    a.warning("Attempted overwrite of a registered key manager for key type " + str);
                    throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, dVar.a().getName(), cls.getName()));
                }
                if (z && !((Boolean) d.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
            }
        }
    }

    public static Class e(Class cls) {
        v26 v26Var = (v26) f.get(cls);
        if (v26Var == null) {
            return null;
        }
        return v26Var.b();
    }

    private static synchronized d f(String str) {
        d dVar;
        synchronized (g.class) {
            ConcurrentMap concurrentMap = b;
            if (!concurrentMap.containsKey(str)) {
                throw new GeneralSecurityException("No key manager found for key type " + str);
            }
            dVar = (d) concurrentMap.get(str);
        }
        return dVar;
    }

    private static bw3 g(String str, Class cls) {
        d f2 = f(str);
        if (cls == null) {
            return f2.d();
        }
        if (f2.b().contains(cls)) {
            return f2.c(cls);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + f2.a() + ", supported primitives: " + s(f2.b()));
    }

    public static Object h(String str, ByteString byteString, Class cls) {
        return j(str, byteString, (Class) a(cls));
    }

    public static Object i(String str, byte[] bArr, Class cls) {
        return h(str, ByteString.g(bArr), cls);
    }

    private static Object j(String str, ByteString byteString, Class cls) {
        return g(str, cls).c(byteString);
    }

    public static f k(com.google.crypto.tink.d dVar, bw3 bw3Var, Class cls) {
        return m(dVar, bw3Var, (Class) a(cls));
    }

    public static f l(com.google.crypto.tink.d dVar, Class cls) {
        return k(dVar, null, cls);
    }

    private static f m(com.google.crypto.tink.d dVar, bw3 bw3Var, Class cls) {
        h.d(dVar.f());
        f f2 = f.f(cls);
        for (a.c cVar : dVar.f().R()) {
            if (cVar.S() == KeyStatusType.ENABLED) {
                f.b a2 = f2.a((bw3Var == null || !bw3Var.a(cVar.P().Q())) ? j(cVar.P().Q(), cVar.P().R(), cls) : bw3Var.c(cVar.P().R()), cVar);
                if (cVar.Q() == dVar.f().S()) {
                    f2.g(a2);
                }
            }
        }
        return f2;
    }

    public static bw3 n(String str) {
        return f(str).d();
    }

    public static synchronized f0 o(jw3 jw3Var) {
        f0 d2;
        synchronized (g.class) {
            bw3 n = n(jw3Var.Q());
            if (!((Boolean) d.get(jw3Var.Q())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + jw3Var.Q());
            }
            d2 = n.d(jw3Var.R());
        }
        return d2;
    }

    public static synchronized KeyData p(jw3 jw3Var) {
        KeyData b2;
        synchronized (g.class) {
            bw3 n = n(jw3Var.Q());
            if (!((Boolean) d.get(jw3Var.Q())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + jw3Var.Q());
            }
            b2 = n.b(jw3Var.R());
        }
        return b2;
    }

    public static synchronized void q(com.google.crypto.tink.c cVar, boolean z) {
        synchronized (g.class) {
            try {
                if (cVar == null) {
                    throw new IllegalArgumentException("key manager must be non-null.");
                }
                String c2 = cVar.c();
                d(c2, cVar.getClass(), z);
                ConcurrentMap concurrentMap = b;
                if (!concurrentMap.containsKey(c2)) {
                    concurrentMap.put(c2, b(cVar));
                    c.put(c2, c(cVar));
                }
                d.put(c2, Boolean.valueOf(z));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void r(v26 v26Var) {
        synchronized (g.class) {
            try {
                if (v26Var == null) {
                    throw new IllegalArgumentException("wrapper must be non-null");
                }
                Class c2 = v26Var.c();
                ConcurrentMap concurrentMap = f;
                if (concurrentMap.containsKey(c2)) {
                    v26 v26Var2 = (v26) concurrentMap.get(c2);
                    if (!v26Var.getClass().equals(v26Var2.getClass())) {
                        a.warning("Attempted overwrite of a registered SetWrapper for type " + c2);
                        throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", c2.getName(), v26Var2.getClass().getName(), v26Var.getClass().getName()));
                    }
                }
                concurrentMap.put(c2, v26Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static String s(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it2 = set.iterator();
        boolean z = true;
        while (it2.hasNext()) {
            Class cls = (Class) it2.next();
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls.getCanonicalName());
            z = false;
        }
        return sb.toString();
    }

    public static Object t(f fVar, Class cls) {
        v26 v26Var = (v26) f.get(cls);
        if (v26Var == null) {
            throw new GeneralSecurityException("No wrapper found for " + fVar.d().getName());
        }
        if (v26Var.b().equals(fVar.d())) {
            return v26Var.a(fVar);
        }
        throw new GeneralSecurityException("Wrong input primitive class, expected " + v26Var.b() + ", got " + fVar.d());
    }
}
