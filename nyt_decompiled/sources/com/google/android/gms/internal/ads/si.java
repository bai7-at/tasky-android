package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
abstract class si {
    private static final ri a;
    private static final ri b;

    static {
        ri riVar = null;
        try {
            riVar = (ri) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = riVar;
        b = new ri();
    }

    static ri a() {
        return a;
    }

    static ri b() {
        return b;
    }
}
