package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
abstract class c3 {
    private static final b3 a;
    private static final b3 b;

    static {
        b3 b3Var = null;
        try {
            b3Var = (b3) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = b3Var;
        b = new b3();
    }

    static b3 a() {
        return a;
    }

    static b3 b() {
        return b;
    }
}
