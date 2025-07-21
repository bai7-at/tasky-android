package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzabn extends zzxi {
    final /* synthetic */ Class zza;
    final /* synthetic */ zzabo zzb;

    zzabn(zzabo zzaboVar, Class cls) {
        this.zzb = zzaboVar;
        this.zza = cls;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final Object read(zzacv zzacvVar) throws IOException {
        Object read = this.zzb.zzb.read(zzacvVar);
        if (read == null || this.zza.isInstance(read)) {
            return read;
        }
        throw new zzwz("Expected a " + this.zza.getName() + " but was " + read.getClass().getName() + "; at path " + zzacvVar.zzf());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final void write(zzacx zzacxVar, Object obj) throws IOException {
        this.zzb.zzb.write(zzacxVar, obj);
    }
}
