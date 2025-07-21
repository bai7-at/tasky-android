package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
final class u0 {
    private static final u0 c = new u0();
    private final ConcurrentMap b = new ConcurrentHashMap();
    private final x0 a = new j0();

    private u0() {
    }

    public static u0 a() {
        return c;
    }

    public final w0 b(Class cls) {
        b0.c(cls, "messageType");
        w0 w0Var = (w0) this.b.get(cls);
        if (w0Var == null) {
            w0Var = this.a.zza(cls);
            b0.c(cls, "messageType");
            w0 w0Var2 = (w0) this.b.putIfAbsent(cls, w0Var);
            if (w0Var2 != null) {
                return w0Var2;
            }
        }
        return w0Var;
    }
}
