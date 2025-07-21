package com.google.android.gms.internal.pal;

/* loaded from: classes3.dex */
abstract class x0 {
    private static final w0 a;
    private static final w0 b;

    static {
        w0 w0Var = null;
        try {
            w0Var = (w0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = w0Var;
        b = new w0();
    }

    static w0 a() {
        return a;
    }

    static w0 b() {
        return b;
    }
}
