package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
abstract class p {
    private static final n a = new o();
    private static final n b = c();

    static n a() {
        n nVar = b;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static n b() {
        return a;
    }

    private static n c() {
        try {
            return (n) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
