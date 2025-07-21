package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzaae extends zzaac {
    private final zzyz zzb;

    zzaae(zzyz zzyzVar, Map map) {
        super(map);
        this.zzb = zzyzVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaac
    final Object zza() {
        return this.zzb.zza();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaac
    final Object zzb(Object obj) {
        return obj;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaac
    final void zzc(Object obj, zzacv zzacvVar, zzaad zzaadVar) throws IllegalAccessException, IOException {
        zzaadVar.zzb(zzacvVar, obj);
    }
}
