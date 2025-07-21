package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
final class zzaei {
    private static final zzaeg zza = new zzaeh();
    private static final zzaeg zzb;

    static {
        zzaeg zzaegVar = null;
        try {
            zzaegVar = (zzaeg) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zzb = zzaegVar;
    }

    static zzaeg zza() {
        zzaeg zzaegVar = zzb;
        if (zzaegVar != null) {
            return zzaegVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static zzaeg zzb() {
        return zza;
    }
}
