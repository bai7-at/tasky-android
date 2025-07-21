package com.google.android.gms.internal.play_billing;

/* loaded from: classes3.dex */
abstract class s0 {
    private static final r0 a;
    private static final r0 b;

    static {
        r0 r0Var = null;
        try {
            r0Var = (r0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = r0Var;
        b = new r0();
    }

    static r0 a() {
        return a;
    }

    static r0 b() {
        return b;
    }
}
