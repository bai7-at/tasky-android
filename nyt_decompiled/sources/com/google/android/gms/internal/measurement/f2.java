package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
abstract class f2 {
    private static final d2 a = new e2();
    private static final d2 b;

    static {
        d2 d2Var = null;
        try {
            d2Var = (d2) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = d2Var;
    }

    static d2 a() {
        d2 d2Var = b;
        if (d2Var != null) {
            return d2Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static d2 b() {
        return a;
    }
}
