package com.google.android.gms.internal.pal;

/* loaded from: classes3.dex */
abstract class x {
    private static final v a = new w();
    private static final v b;

    static {
        v vVar = null;
        try {
            vVar = (v) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = vVar;
    }

    static v a() {
        v vVar = b;
        if (vVar != null) {
            return vVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static v b() {
        return a;
    }
}
