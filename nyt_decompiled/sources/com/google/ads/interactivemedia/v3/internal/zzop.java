package com.google.ads.interactivemedia.v3.internal;

import android.os.Bundle;
import defpackage.qg8;

/* loaded from: classes2.dex */
final class zzop extends zzob {
    final /* synthetic */ qg8 zza;

    zzop(zzor zzorVar, qg8 qg8Var) {
        this.zza = qg8Var;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzoc
    public final void zzb(int i) {
        this.zza.d(new zzol(i));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzoc
    public final void zzc(Bundle bundle) {
        this.zza.e(bundle.getString("newToken"));
    }
}
