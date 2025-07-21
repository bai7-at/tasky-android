package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import defpackage.qg8;
import defpackage.vg8;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class zzgp {
    private final zzok zza;
    private final zzhc zzb;
    private final int zzc;

    public zzgp(Context context, int i, zzhc zzhcVar) {
        this.zza = new zzor(context);
        this.zzb = zzhcVar;
        this.zzc = i;
    }

    public final String zza() {
        if (this.zzc <= 0) {
            zzhd.zzc("AdsIdentityTokenLoader: invalid parameter for gksTimeoutMs");
            return "";
        }
        try {
            final Bundle bundle = new Bundle();
            zzok zzokVar = this.zza;
            final zzor zzorVar = (zzor) zzokVar;
            return (String) vg8.b(((zzor) zzokVar).doRead(TaskApiCall.builder().setAutoResolveMissingFeatures(false).setFeatures(zzqt.zza).run(new RemoteCall() { // from class: com.google.ads.interactivemedia.v3.internal.zzon
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(Object obj, Object obj2) {
                    zzor zzorVar2 = zzor.this;
                    ((zzof) ((zzos) obj).getService()).zzf(bundle, new zzop(zzorVar2, (qg8) obj2));
                }
            }).build()), this.zzc, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.zzb.zzb(com.google.ads.interactivemedia.v3.impl.data.zzbe.ADS_IDENTITY_TOKEN_LOADER, com.google.ads.interactivemedia.v3.impl.data.zzbf.GET_ADSIDENTITY_TOKEN, e);
            return "";
        }
    }
}
