package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.ads.interactivemedia.pal.zzx;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.internal.pal.zzagc;
import com.google.android.gms.internal.pal.zzgy;
import com.google.android.gms.internal.pal.zzil;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class nqa extends ipa {
    private final cze e;
    private final zzx f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqa(Handler handler, ExecutorService executorService, Context context, zzx zzxVar) {
        super(handler, executorService, zzagc.b(2L));
        d2f d2fVar = new d2f(context);
        this.e = d2fVar;
        this.f = zzxVar;
    }

    @Override // defpackage.ipa
    final zzil a() {
        final Bundle bundle = new Bundle();
        try {
            cze czeVar = this.e;
            final d2f d2fVar = (d2f) czeVar;
            return zzil.f((String) vg8.b(((d2f) czeVar).doRead(TaskApiCall.builder().setAutoResolveMissingFeatures(false).setFeatures(i7f.a).run(new RemoteCall() { // from class: h0f
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(Object obj, Object obj2) {
                    d2f d2fVar2 = d2f.this;
                    ((jye) ((j2f) obj).getService()).d2(bundle, new t1f(d2fVar2, (qg8) obj2));
                }
            }).build()), 5L, TimeUnit.SECONDS));
        } catch (InterruptedException | TimeoutException unused) {
            this.f.zza(2);
            return zzil.e();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof zzgy) {
                Log.d("NonceGenerator", "SignalSdk Error code: " + ((zzgy) cause).a());
                this.f.zza(3);
            }
            return zzil.e();
        }
    }
}
