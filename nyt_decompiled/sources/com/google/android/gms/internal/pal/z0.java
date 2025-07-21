package com.google.android.gms.internal.pal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
final class z0 {
    private static final z0 c = new z0();
    private final ConcurrentMap b = new ConcurrentHashMap();
    private final e1 a = new n0();

    private z0() {
    }

    public static z0 a() {
        return c;
    }

    public final d1 b(Class cls) {
        f0.f(cls, "messageType");
        d1 d1Var = (d1) this.b.get(cls);
        if (d1Var == null) {
            d1Var = this.a.zza(cls);
            f0.f(cls, "messageType");
            f0.f(d1Var, "schema");
            d1 d1Var2 = (d1) this.b.putIfAbsent(cls, d1Var);
            if (d1Var2 != null) {
                return d1Var2;
            }
        }
        return d1Var;
    }
}
