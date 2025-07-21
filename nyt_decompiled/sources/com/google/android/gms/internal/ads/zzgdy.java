package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class zzgdy extends zzgdz {
    final /* synthetic */ tb zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgdy(tb tbVar, Callable callable, Executor executor) {
        super(tbVar, executor);
        this.zza = tbVar;
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    final Object a() {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    final String b() {
        return this.zzc.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgdz
    final void h(Object obj) {
        this.zza.f(obj);
    }
}
