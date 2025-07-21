package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzecf;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class b4d extends e4d {
    private zzbyi h;

    b4d(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.e = context;
        this.f = dyf.v().b();
        this.g = scheduledExecutorService;
    }

    public final synchronized j64 c(zzbyi zzbyiVar, long j) {
        if (this.b) {
            return zb.o(this.a, j, TimeUnit.MILLISECONDS, this.g);
        }
        this.b = true;
        this.h = zzbyiVar;
        a();
        j64 o = zb.o(this.a, j, TimeUnit.MILLISECONDS, this.g);
        o.a(new Runnable() { // from class: a4d
            @Override // java.lang.Runnable
            public final void run() {
                b4d.this.b();
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
            this.d.c().U0(this.h, new d4d(this));
        } catch (RemoteException unused) {
            this.a.d(new zzecf(1));
        } catch (Throwable th) {
            dyf.q().w(th, "RemoteAdsServiceSignalClientTask.onConnected");
            this.a.d(th);
        }
    }

    @Override // defpackage.e4d, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        String format = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i));
        fgb.b(format);
        this.a.d(new zzecf(1, format));
    }
}
