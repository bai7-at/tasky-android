package defpackage;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
final class rbf {
    private static final Logger b = Logger.getLogger(rbf.class.getName());
    private final ConcurrentMap a;

    rbf() {
        this.a = new ConcurrentHashMap();
    }

    private final synchronized obf f(String str) {
        if (!this.a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (obf) this.a.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        r6.a.putIfAbsent(r0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void g(defpackage.obf r7, boolean r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            ebf r0 = r7.zzb()     // Catch: java.lang.Throwable -> L53
            java.lang.String r0 = r0.zzf()     // Catch: java.lang.Throwable -> L53
            java.util.concurrent.ConcurrentMap r1 = r6.a     // Catch: java.lang.Throwable -> L53
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L53
            obf r1 = (defpackage.obf) r1     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L55
            java.lang.Class r2 = r1.zzc()     // Catch: java.lang.Throwable -> L53
            java.lang.Class r3 = r7.zzc()     // Catch: java.lang.Throwable -> L53
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L22
            goto L55
        L22:
            java.util.logging.Logger r8 = defpackage.rbf.b     // Catch: java.lang.Throwable -> L53
            java.util.logging.Level r2 = java.util.logging.Level.WARNING     // Catch: java.lang.Throwable -> L53
            java.lang.String r3 = "com.google.crypto.tink.KeyManagerRegistry"
            java.lang.String r4 = "registerKeyManagerContainer"
            java.lang.String r5 = "Attempted overwrite of a registered key manager for key type "
            java.lang.String r5 = r5.concat(r0)     // Catch: java.lang.Throwable -> L53
            r8.logp(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L53
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L53
            java.lang.Class r1 = r1.zzc()     // Catch: java.lang.Throwable -> L53
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L53
            java.lang.Class r7 = r7.zzc()     // Catch: java.lang.Throwable -> L53
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L53
            java.lang.Object[] r7 = new java.lang.Object[]{r0, r1, r7}     // Catch: java.lang.Throwable -> L53
            java.lang.String r0 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            java.lang.String r7 = java.lang.String.format(r0, r7)     // Catch: java.lang.Throwable -> L53
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L53
            throw r8     // Catch: java.lang.Throwable -> L53
        L53:
            r7 = move-exception
            goto L65
        L55:
            if (r8 != 0) goto L5e
            java.util.concurrent.ConcurrentMap r8 = r6.a     // Catch: java.lang.Throwable -> L53
            r8.putIfAbsent(r0, r7)     // Catch: java.lang.Throwable -> L53
            monitor-exit(r6)
            return
        L5e:
            java.util.concurrent.ConcurrentMap r8 = r6.a     // Catch: java.lang.Throwable -> L53
            r8.put(r0, r7)     // Catch: java.lang.Throwable -> L53
            monitor-exit(r6)
            return
        L65:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L53
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rbf.g(obf, boolean):void");
    }

    final ebf a(String str, Class cls) {
        obf f = f(str);
        if (f.zze().contains(cls)) {
            return f.zza(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(f.zzc());
        Set<Class> zze = f.zze();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : zze) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", supported primitives: " + sb.toString());
    }

    final ebf b(String str) {
        return f(str).zzb();
    }

    final synchronized void c(crf crfVar, dpf dpfVar) {
        Class zzd;
        try {
            int f = dpfVar.f();
            if (!cif.a(1)) {
                throw new GeneralSecurityException("failed to register key manager " + String.valueOf(crfVar.getClass()) + " as it is not FIPS compatible.");
            }
            if (!cif.a(f)) {
                throw new GeneralSecurityException("failed to register key manager " + String.valueOf(dpfVar.getClass()) + " as it is not FIPS compatible.");
            }
            String d = crfVar.d();
            String d2 = dpfVar.d();
            if (this.a.containsKey(d) && ((obf) this.a.get(d)).zzd() != null && (zzd = ((obf) this.a.get(d)).zzd()) != null && !zzd.getName().equals(dpfVar.getClass().getName())) {
                b.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + d + " with inconsistent public key type " + d2);
                throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", crfVar.getClass().getName(), zzd.getName(), dpfVar.getClass().getName()));
            }
            g(new lbf(crfVar, dpfVar), true);
            g(new ibf(dpfVar), false);
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized void d(dpf dpfVar) {
        if (!cif.a(dpfVar.f())) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(dpfVar.getClass()) + " as it is not FIPS compatible.");
        }
        g(new ibf(dpfVar), false);
    }

    final boolean e(String str) {
        return this.a.containsKey(str);
    }

    rbf(rbf rbfVar) {
        this.a = new ConcurrentHashMap(rbfVar.a);
    }
}
