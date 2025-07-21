package com.google.android.gms.internal.play_billing;

/* loaded from: classes3.dex */
abstract class u {
    private static final s a = new t();
    private static final s b;

    static {
        s sVar = null;
        try {
            sVar = (s) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = sVar;
    }

    static s a() {
        s sVar = b;
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static s b() {
        return a;
    }
}
