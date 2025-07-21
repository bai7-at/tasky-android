package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class zzup extends zzuq {
    final /* synthetic */ zzur zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzup(zzur zzurVar, Callable callable, Executor executor) {
        super(zzurVar, executor);
        this.zza = zzurVar;
        callable.getClass();
        this.zzc = callable;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzvp
    final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzvp
    final String zzb() {
        return this.zzc.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzuq
    final void zzc(Object obj) {
        this.zza.zzc(obj);
    }
}
