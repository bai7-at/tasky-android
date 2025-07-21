package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
final class zzwj extends zzxi {
    final /* synthetic */ zzxi zza;

    zzwj(zzxi zzxiVar) {
        this.zza = zzxiVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        return new AtomicLong(((Number) this.zza.read(zzacvVar)).longValue());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        this.zza.write(zzacxVar, Long.valueOf(((AtomicLong) obj).get()));
    }
}
