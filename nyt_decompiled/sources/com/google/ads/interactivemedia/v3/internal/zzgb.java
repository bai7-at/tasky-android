package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import defpackage.og8;
import defpackage.qg8;
import defpackage.vg8;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
final class zzgb implements zzga {
    private final zzok zza;
    private final com.google.ads.interactivemedia.v3.impl.data.zzbc zzb;

    zzgb(Context context, com.google.ads.interactivemedia.v3.impl.data.zzbc zzbcVar) {
        this.zza = new zzor(context);
        this.zzb = zzbcVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzga
    public final com.google.ads.interactivemedia.v3.impl.data.zzbj zza(NetworkRequestData networkRequestData) {
        og8 doRead;
        try {
            final int i = networkRequestData.requestType() == NetworkRequestData.RequestType.GET ? 0 : 1;
            zzok zzokVar = this.zza;
            final String url = networkRequestData.url();
            final String content = networkRequestData.content();
            if (this.zzb.isLimitedAdTracking()) {
                doRead = vg8.d(new zzol(8));
            } else {
                final zzor zzorVar = (zzor) zzokVar;
                doRead = ((zzor) zzokVar).doRead(TaskApiCall.builder().setFeatures(zzqt.zzb).setAutoResolveMissingFeatures(false).run(new RemoteCall() { // from class: com.google.ads.interactivemedia.v3.internal.zzom
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(Object obj, Object obj2) {
                        zzor zzorVar2 = zzor.this;
                        String str = url;
                        int i2 = i;
                        String str2 = content;
                        ((zzof) ((zzos) obj).getService()).zze(new zzog(str, i2, str2), new zzoq(zzorVar2, (qg8) obj2));
                    }
                }).build());
            }
            return com.google.ads.interactivemedia.v3.impl.data.zzbj.forResponse(networkRequestData.id(), (String) vg8.b(doRead, networkRequestData.connectionTimeoutMs() + networkRequestData.readTimeoutMs(), TimeUnit.MILLISECONDS));
        } catch (InterruptedException | TimeoutException unused) {
            return com.google.ads.interactivemedia.v3.impl.data.zzbj.forError(networkRequestData.id(), 101);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof zzol) {
                return com.google.ads.interactivemedia.v3.impl.data.zzbj.forError(networkRequestData.id(), ((zzol) cause).zza());
            }
            return cause instanceof ApiException ? com.google.ads.interactivemedia.v3.impl.data.zzbj.forError(networkRequestData.id(), 102) : com.google.ads.interactivemedia.v3.impl.data.zzbj.forError(networkRequestData.id(), 100);
        }
    }
}
