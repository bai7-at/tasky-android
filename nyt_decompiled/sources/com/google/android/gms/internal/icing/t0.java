package com.google.android.gms.internal.icing;

/* loaded from: classes3.dex */
abstract class t0 {
    private static final s0 a;
    private static final s0 b;

    static {
        s0 s0Var = null;
        try {
            s0Var = (s0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = s0Var;
        b = new s0();
    }

    static s0 a() {
        return a;
    }

    static s0 b() {
        return b;
    }
}
