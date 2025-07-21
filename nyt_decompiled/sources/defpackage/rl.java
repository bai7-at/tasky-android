package defpackage;

import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.PersistedEvents;

/* loaded from: classes2.dex */
public final class rl {
    public static final rl a = new rl();
    private static final String b;

    static {
        String name = rl.class.getName();
        zq3.g(name, "AppEventStore::class.java.name");
        b = name;
    }

    private rl() {
    }

    public static final synchronized void a(hl hlVar) {
        synchronized (rl.class) {
            if (c11.d(rl.class)) {
                return;
            }
            try {
                zq3.h(hlVar, "eventsToPersist");
                sl.b();
                PersistedEvents a2 = il.a();
                for (AccessTokenAppIdPair accessTokenAppIdPair : hlVar.f()) {
                    el7 c = hlVar.c(accessTokenAppIdPair);
                    if (c == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    a2.a(accessTokenAppIdPair, c.d());
                }
                il.b(a2);
            } catch (Throwable th) {
                c11.b(th, rl.class);
            }
        }
    }

    public static final synchronized void b(AccessTokenAppIdPair accessTokenAppIdPair, el7 el7Var) {
        synchronized (rl.class) {
            if (c11.d(rl.class)) {
                return;
            }
            try {
                zq3.h(accessTokenAppIdPair, "accessTokenAppIdPair");
                zq3.h(el7Var, "appEvents");
                sl.b();
                PersistedEvents a2 = il.a();
                a2.a(accessTokenAppIdPair, el7Var.d());
                il.b(a2);
            } catch (Throwable th) {
                c11.b(th, rl.class);
            }
        }
    }
}
