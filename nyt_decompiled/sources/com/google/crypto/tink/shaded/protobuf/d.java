package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
abstract class d {
    private static final Class a = a("libcore.io.Memory");
    private static final boolean b;

    static {
        b = a("org.robolectric.Robolectric") != null;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class b() {
        return a;
    }

    static boolean c() {
        return (a == null || b) ? false : true;
    }
}
