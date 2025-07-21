package com.google.android.gms.internal.icing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
final class v0 {
    private static final v0 c = new v0();
    private final ConcurrentMap b = new ConcurrentHashMap();
    private final z0 a = new k0();

    private v0() {
    }

    public static v0 a() {
        return c;
    }

    public final y0 b(Class cls) {
        b0.b(cls, "messageType");
        y0 y0Var = (y0) this.b.get(cls);
        if (y0Var == null) {
            y0Var = this.a.zza(cls);
            b0.b(cls, "messageType");
            b0.b(y0Var, "schema");
            y0 y0Var2 = (y0) this.b.putIfAbsent(cls, y0Var);
            if (y0Var2 != null) {
                return y0Var2;
            }
        }
        return y0Var;
    }
}
