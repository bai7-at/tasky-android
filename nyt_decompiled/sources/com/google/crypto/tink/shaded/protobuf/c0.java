package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
abstract class c0 {
    private static final a0 a = c();
    private static final a0 b = new b0();

    static a0 a() {
        return a;
    }

    static a0 b() {
        return b;
    }

    private static a0 c() {
        try {
            return (a0) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
