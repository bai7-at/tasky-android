package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzfso;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class bce {
    private static final HashMap g = new HashMap();
    private final Context a;
    private final cce b;
    private final tae c;
    private final oae d;
    private vbe e;
    private final Object f = new Object();

    public bce(Context context, cce cceVar, tae taeVar, oae oaeVar) {
        this.a = context;
        this.b = cceVar;
        this.c = taeVar;
        this.d = oaeVar;
    }

    private final synchronized Class d(wbe wbeVar) {
        String U;
        HashMap hashMap;
        Class cls;
        try {
            U = wbeVar.a().U();
            hashMap = g;
            cls = (Class) hashMap.get(U);
        } catch (Throwable th) {
            throw th;
        }
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.d.a(wbeVar.c())) {
                throw new zzfso(2026, "VM did not pass signature verification");
            }
            try {
                File b = wbeVar.b();
                if (!b.exists()) {
                    b.mkdirs();
                }
                Class<?> loadClass = new DexClassLoader(wbeVar.c().getAbsolutePath(), b.getAbsolutePath(), null, this.a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                hashMap.put(U, loadClass);
                return loadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                throw new zzfso(2008, e);
            }
        } catch (GeneralSecurityException e2) {
            throw new zzfso(2026, e2);
        }
        throw th;
    }

    public final wae a() {
        vbe vbeVar;
        synchronized (this.f) {
            vbeVar = this.e;
        }
        return vbeVar;
    }

    public final wbe b() {
        synchronized (this.f) {
            try {
                vbe vbeVar = this.e;
                if (vbeVar == null) {
                    return null;
                }
                return vbeVar.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(wbe wbeVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                vbe vbeVar = new vbe(d(wbeVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.a, "msa-r", wbeVar.e(), null, new Bundle(), 2), wbeVar, this.b, this.c);
                if (!vbeVar.d()) {
                    throw new zzfso(4000, "init failed");
                }
                int a = vbeVar.a();
                if (a != 0) {
                    throw new zzfso(4001, "ci: " + a);
                }
                synchronized (this.f) {
                    vbe vbeVar2 = this.e;
                    if (vbeVar2 != null) {
                        try {
                            vbeVar2.c();
                        } catch (zzfso e) {
                            this.c.c(e.a(), -1L, e);
                        }
                    }
                    this.e = vbeVar;
                }
                this.c.d(3000, System.currentTimeMillis() - currentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new zzfso(2004, e2);
            }
        } catch (zzfso e3) {
            this.c.c(e3.a(), System.currentTimeMillis() - currentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.c.c(4010, System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        }
    }
}
