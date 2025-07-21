package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class h2 implements x2 {
    private static final h2 a = new h2();

    private h2() {
    }

    public static h2 a() {
        return a;
    }

    @Override // com.google.android.gms.internal.measurement.x2
    public final w2 zzb(Class cls) {
        if (!j2.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (w2) j2.h(cls.asSubclass(j2.class)).q(3, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.x2
    public final boolean zzc(Class cls) {
        return j2.class.isAssignableFrom(cls);
    }
}
