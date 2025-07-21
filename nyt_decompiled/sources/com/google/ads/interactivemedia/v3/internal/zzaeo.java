package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
final class zzaeo implements zzafx {
    private static final zzaeo zza = new zzaeo();

    private zzaeo() {
    }

    public static zzaeo zza() {
        return zza;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafx
    public final zzafw zzb(Class cls) {
        if (!zzaet.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzafw) zzaet.zzaz(cls.asSubclass(zzaet.class)).zzj(3, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafx
    public final boolean zzc(Class cls) {
        return zzaet.class.isAssignableFrom(cls);
    }
}
