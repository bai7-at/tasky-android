package com.google.android.gms.internal.icing;

/* loaded from: classes3.dex */
abstract class v {
    private static final t a = new u();
    private static final t b;

    static {
        t tVar = null;
        try {
            tVar = (t) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = tVar;
    }

    static t a() {
        return a;
    }

    static t b() {
        t tVar = b;
        if (tVar != null) {
            return tVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
