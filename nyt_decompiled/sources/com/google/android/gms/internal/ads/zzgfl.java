package com.google.android.gms.internal.ads;

import defpackage.j64;
import defpackage.tge;
import defpackage.zje;

/* loaded from: classes3.dex */
final class zzgfl extends zzgew {
    final /* synthetic */ qc zza;
    private final zje zzb;

    zzgfl(qc qcVar, zje zjeVar) {
        this.zza = qcVar;
        this.zzb = zjeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    final /* bridge */ /* synthetic */ Object a() {
        zje zjeVar = this.zzb;
        j64 zza = zjeVar.zza();
        tge.d(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zjeVar);
        return zza;
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
    final /* synthetic */ void e(Object obj) {
        this.zza.u((j64) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    final boolean f() {
        return this.zza.isDone();
    }
}
