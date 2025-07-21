package com.google.android.gms.internal.play_billing;

/* loaded from: classes3.dex */
final class x implements n0 {
    private static final x a = new x();

    private x() {
    }

    public static x a() {
        return a;
    }

    @Override // com.google.android.gms.internal.play_billing.n0
    public final m0 zzb(Class cls) {
        if (!z.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (m0) z.f(cls.asSubclass(z.class)).q(3, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.n0
    public final boolean zzc(Class cls) {
        return z.class.isAssignableFrom(cls);
    }
}
