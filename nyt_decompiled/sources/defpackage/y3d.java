package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzbym;
import com.google.android.gms.internal.ads.zzecf;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class y3d extends e4d {
    private zzbym h;

    y3d(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.e = context;
        this.f = dyf.v().b();
        this.g = scheduledExecutorService;
    }

    public final synchronized j64 c(zzbym zzbymVar, long j) {
        if (this.b) {
            return zb.o(this.a, j, TimeUnit.MILLISECONDS, this.g);
        }
        this.b = true;
        this.h = zzbymVar;
        a();
        j64 o = zb.o(this.a, j, TimeUnit.MILLISECONDS, this.g);
        o.a(new Runnable() { // from class: x3d
            @Override // java.lang.Runnable
            public final void run() {
                y3d.this.b();
            }
        }, pgb.f);
        return o;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final synchronized void onConnected(Bundle bundle) {
        if (this.c) {
            return;
        }
        this.c = true;
        try {
            this.d.c().D5(this.h, new d4d(this));
        } catch (RemoteException unused) {
            this.a.d(new zzecf(1));
        } catch (Throwable th) {
            dyf.q().w(th, "RemoteAdsServiceProxyClientTask.onConnected");
            this.a.d(th);
        }
    }
}
