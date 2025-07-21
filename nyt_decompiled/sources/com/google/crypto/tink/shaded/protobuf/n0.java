package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
final class n0 {
    private static final n0 c = new n0();
    private final ConcurrentMap b = new ConcurrentHashMap();
    private final s0 a = new y();

    private n0() {
    }

    public static n0 a() {
        return c;
    }

    public r0 b(Class cls, r0 r0Var) {
        u.b(cls, "messageType");
        u.b(r0Var, "schema");
        return (r0) this.b.putIfAbsent(cls, r0Var);
    }

    public r0 c(Class cls) {
        u.b(cls, "messageType");
        r0 r0Var = (r0) this.b.get(cls);
        if (r0Var != null) {
            return r0Var;
        }
        r0 a = this.a.a(cls);
        r0 b = b(cls, a);
        return b != null ? b : a;
    }

    public r0 d(Object obj) {
        return c(obj.getClass());
    }
}
