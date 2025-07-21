package com.google.android.gms.internal.icing;

/* loaded from: classes3.dex */
abstract class m0 {
    private static final l0 a;
    private static final l0 b;

    static {
        l0 l0Var = null;
        try {
            l0Var = (l0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = l0Var;
        b = new l0();
    }

    static l0 a() {
        return a;
    }

    static l0 b() {
        return b;
    }
}
