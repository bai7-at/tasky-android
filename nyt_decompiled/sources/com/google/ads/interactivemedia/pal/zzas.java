package com.google.ads.interactivemedia.pal;

import android.app.Activity;
import android.content.Context;
import defpackage.cy0;
import defpackage.o6e;
import defpackage.og8;

/* loaded from: classes2.dex */
final class zzas implements cy0 {
    final /* synthetic */ NonceManager zza;

    zzas(NonceManager nonceManager) {
        this.zza = nonceManager;
    }

    @Override // defpackage.cy0
    public final /* bridge */ /* synthetic */ Object then(og8 og8Var) throws Exception {
        Context context;
        Activity zza = NonceManager.zza(this.zza);
        o6e o6eVar = (o6e) og8Var.m();
        context = this.zza.zzd;
        return o6eVar.c(context, null, zza);
    }
}
