package com.google.android.gms.internal.ads;

import defpackage.ake;
import defpackage.j64;
import defpackage.tge;

/* loaded from: classes3.dex */
final class gb extends ib {
    gb(j64 j64Var, ake akeVar) {
        super(j64Var, akeVar);
    }

    @Override // com.google.android.gms.internal.ads.ib
    final /* bridge */ /* synthetic */ Object D(Object obj, Object obj2) {
        ake akeVar = (ake) obj;
        j64 zza = akeVar.zza(obj2);
        tge.d(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", akeVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.ib
    final /* synthetic */ void E(Object obj) {
        u((j64) obj);
    }
}
