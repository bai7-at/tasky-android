package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
abstract class v2 {
    private static final u2 a;
    private static final u2 b;

    static {
        u2 u2Var = null;
        try {
            u2Var = (u2) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = u2Var;
        b = new u2();
    }

    static u2 a() {
        return a;
    }

    static u2 b() {
        return b;
    }
}
