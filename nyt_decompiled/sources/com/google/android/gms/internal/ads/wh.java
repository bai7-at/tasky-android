package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class wh implements ni {
    private static final wh a = new wh();

    private wh() {
    }

    public static wh a() {
        return a;
    }

    @Override // com.google.android.gms.internal.ads.ni
    public final mi zzb(Class cls) {
        if (!yh.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (mi) yh.m(cls.asSubclass(yh.class)).I(3, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ni
    public final boolean zzc(Class cls) {
        return yh.class.isAssignableFrom(cls);
    }
}
