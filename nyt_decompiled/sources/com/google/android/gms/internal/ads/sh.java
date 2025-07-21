package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
abstract class sh {
    private static final qh a = new rh();
    private static final qh b;

    static {
        qh qhVar = null;
        try {
            qhVar = (qh) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = qhVar;
    }

    static qh a() {
        qh qhVar = b;
        if (qhVar != null) {
            return qhVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static qh b() {
        return a;
    }
}
