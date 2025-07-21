package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
abstract class li {
    private static final ki a;
    private static final ki b;

    static {
        ki kiVar = null;
        try {
            kiVar = (ki) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = kiVar;
        b = new ki();
    }

    static ki a() {
        return a;
    }

    static ki b() {
        return b;
    }
}
