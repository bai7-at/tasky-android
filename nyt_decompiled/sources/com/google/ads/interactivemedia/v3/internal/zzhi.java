package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.signals.SecureSignalsInitializeCallback;
import defpackage.qg8;

/* loaded from: classes2.dex */
final class zzhi implements SecureSignalsInitializeCallback {
    final /* synthetic */ zzhk zza;

    zzhi(zzhk zzhkVar) {
        this.zza = zzhkVar;
    }

    @Override // com.google.ads.interactivemedia.v3.api.signals.SecureSignalsInitializeCallback
    public final void onFailure(Exception exc) {
        qg8 qg8Var;
        qg8Var = this.zza.zzd;
        qg8Var.d(exc);
    }

    @Override // com.google.ads.interactivemedia.v3.api.signals.SecureSignalsInitializeCallback
    public final void onSuccess() {
        qg8 qg8Var;
        qg8Var = this.zza.zzd;
        qg8Var.e(null);
    }
}
