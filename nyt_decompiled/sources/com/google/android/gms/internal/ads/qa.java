package com.google.android.gms.internal.ads;

import defpackage.ake;
import defpackage.j64;
import defpackage.tge;

/* loaded from: classes3.dex */
final class qa extends sa {
    qa(j64 j64Var, Class cls, ake akeVar) {
        super(j64Var, cls, akeVar);
    }

    @Override // com.google.android.gms.internal.ads.sa
    final /* bridge */ /* synthetic */ Object D(Object obj, Throwable th) {
        ake akeVar = (ake) obj;
        j64 zza = akeVar.zza(th);
        tge.d(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", akeVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.sa
    final /* synthetic */ void E(Object obj) {
        u((j64) obj);
    }
}
