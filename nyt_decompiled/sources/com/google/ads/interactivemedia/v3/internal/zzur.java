package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class zzur extends zzui {
    private zzuq zza;

    zzur(zzsk zzskVar, boolean z, Executor executor, Callable callable) {
        super(zzskVar, false, false);
        this.zza = new zzup(this, callable, executor);
        zzq();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzub
    protected final void zzn() {
        zzuq zzuqVar = this.zza;
        if (zzuqVar != null) {
            zzuqVar.zzh();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzui
    final void zzp() {
        zzuq zzuqVar = this.zza;
        if (zzuqVar != null) {
            zzuqVar.zzf();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzui
    final void zzr(int i) {
        super.zzr(i);
        if (i == 1) {
            this.zza = null;
        }
    }
}
