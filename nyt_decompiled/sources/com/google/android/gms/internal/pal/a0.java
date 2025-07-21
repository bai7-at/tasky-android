package com.google.android.gms.internal.pal;

/* loaded from: classes3.dex */
final class a0 implements s0 {
    private static final a0 a = new a0();

    private a0() {
    }

    public static a0 a() {
        return a;
    }

    @Override // com.google.android.gms.internal.pal.s0
    public final r0 zzb(Class cls) {
        if (!c0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (r0) c0.k(cls.asSubclass(c0.class)).q(3, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // com.google.android.gms.internal.pal.s0
    public final boolean zzc(Class cls) {
        return c0.class.isAssignableFrom(cls);
    }
}
