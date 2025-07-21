package com.google.android.gms.internal.pal;

/* loaded from: classes3.dex */
abstract class q0 {
    private static final p0 a;
    private static final p0 b;

    static {
        p0 p0Var = null;
        try {
            p0Var = (p0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = p0Var;
        b = new p0();
    }

    static p0 a() {
        return a;
    }

    static p0 b() {
        return b;
    }
}
