package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzwl<T> extends zzaah<T> {
    private zzxi zza = null;

    zzwl() {
    }

    private final zzxi zzc() {
        zzxi zzxiVar = this.zza;
        if (zzxiVar != null) {
            return zzxiVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final T read(zzacv zzacvVar) throws IOException {
        return (T) zzc().read(zzacvVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final void write(zzacx zzacxVar, T t) throws IOException {
        zzc().write(zzacxVar, t);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaah
    public final zzxi zza() {
        return zzc();
    }

    public final void zzb(zzxi zzxiVar) {
        if (this.zza != null) {
            throw new AssertionError("Delegate is already set");
        }
        this.zza = zzxiVar;
    }
}
