package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class tb extends lb {
    private zzgdz s;

    tb(zzfzv zzfzvVar, boolean z, Executor executor, Callable callable) {
        super(zzfzvVar, z, false);
        this.s = new zzgdy(this, callable, executor);
        R();
    }

    @Override // com.google.android.gms.internal.ads.lb
    final void P(int i, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.lb
    final void Q() {
        zzgdz zzgdzVar = this.s;
        if (zzgdzVar != null) {
            zzgdzVar.i();
        }
    }

    @Override // com.google.android.gms.internal.ads.lb
    final void U(int i) {
        super.U(i);
        if (i == 1) {
            this.s = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.eb
    protected final void s() {
        zzgdz zzgdzVar = this.s;
        if (zzgdzVar != null) {
            zzgdzVar.g();
        }
    }
}
