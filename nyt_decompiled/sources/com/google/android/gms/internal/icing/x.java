package com.google.android.gms.internal.icing;

/* loaded from: classes3.dex */
final class x implements o0 {
    private static final x a = new x();

    private x() {
    }

    public static x a() {
        return a;
    }

    @Override // com.google.android.gms.internal.icing.o0
    public final boolean zzb(Class cls) {
        return z.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.icing.o0
    public final n0 zzc(Class cls) {
        if (!z.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (n0) z.h(cls.asSubclass(z.class)).f(3, null, null);
        } catch (Exception e) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e);
        }
    }
}
