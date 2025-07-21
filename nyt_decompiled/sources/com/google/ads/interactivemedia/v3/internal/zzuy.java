package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public abstract class zzuy extends zzuw implements zzvq {
    protected zzuy() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzuw
    protected /* bridge */ /* synthetic */ Future zzb() {
        throw null;
    }

    protected abstract zzvq zzc();

    @Override // com.google.ads.interactivemedia.v3.internal.zzvq
    public final void zzm(Runnable runnable, Executor executor) {
        zzc().zzm(runnable, executor);
    }
}
