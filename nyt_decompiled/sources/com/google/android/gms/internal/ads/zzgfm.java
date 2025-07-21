package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class zzgfm extends zzgew {
    final /* synthetic */ qc zza;
    private final Callable zzb;

    zzgfm(qc qcVar, Callable callable) {
        this.zza = qcVar;
        callable.getClass();
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    final Object a() {
        return this.zzb.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    final String b() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    final void d(Throwable th) {
        this.zza.g(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    final void e(Object obj) {
        this.zza.f(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    final boolean f() {
        return this.zza.isDone();
    }
}
