package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
final class e3 {
    private static final e3 c = new e3();
    private final ConcurrentMap b = new ConcurrentHashMap();
    private final i3 a = new t2();

    private e3() {
    }

    public static e3 a() {
        return c;
    }

    public final h3 b(Class cls) {
        l2.f(cls, "messageType");
        h3 h3Var = (h3) this.b.get(cls);
        if (h3Var == null) {
            h3Var = this.a.zza(cls);
            l2.f(cls, "messageType");
            l2.f(h3Var, "schema");
            h3 h3Var2 = (h3) this.b.putIfAbsent(cls, h3Var);
            if (h3Var2 != null) {
                return h3Var2;
            }
        }
        return h3Var;
    }
}
