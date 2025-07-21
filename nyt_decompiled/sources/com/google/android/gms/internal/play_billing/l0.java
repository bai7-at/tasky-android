package com.google.android.gms.internal.play_billing;

/* loaded from: classes3.dex */
abstract class l0 {
    private static final k0 a;
    private static final k0 b;

    static {
        k0 k0Var = null;
        try {
            k0Var = (k0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = k0Var;
        b = new k0();
    }

    static k0 a() {
        return a;
    }

    static k0 b() {
        return b;
    }
}
