package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.VersionInfo;
import com.google.ads.interactivemedia.v3.api.signals.SecureSignalsAdapter;
import com.google.ads.interactivemedia.v3.api.signals.SecureSignalsCollectSignalsCallback;
import defpackage.qg8;

/* loaded from: classes2.dex */
final class zzhj implements SecureSignalsCollectSignalsCallback {
    final /* synthetic */ qg8 zza;
    final /* synthetic */ zzhk zzb;

    zzhj(zzhk zzhkVar, qg8 qg8Var) {
        this.zzb = zzhkVar;
        this.zza = qg8Var;
    }

    @Override // com.google.ads.interactivemedia.v3.api.signals.SecureSignalsCollectSignalsCallback
    public final void onFailure(Exception exc) {
        this.zza.d(exc);
    }

    @Override // com.google.ads.interactivemedia.v3.api.signals.SecureSignalsCollectSignalsCallback
    public final void onSuccess(String str) {
        SecureSignalsAdapter secureSignalsAdapter;
        SecureSignalsAdapter secureSignalsAdapter2;
        secureSignalsAdapter = this.zzb.zza;
        VersionInfo version = secureSignalsAdapter.getVersion();
        secureSignalsAdapter2 = this.zzb.zza;
        this.zza.e(com.google.ads.interactivemedia.v3.impl.data.zzbo.createBy3rdPartyData(version, secureSignalsAdapter2.getSDKVersion(), this.zzb.zze(), str));
    }
}
