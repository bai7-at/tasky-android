package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
abstract class l {
    static final Class a = c();

    public static m a() {
        m b = b("getEmptyRegistry");
        return b != null ? b : m.d;
    }

    private static final m b(String str) {
        Class cls = a;
        if (cls == null) {
            return null;
        }
        try {
            return (m) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class c() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
