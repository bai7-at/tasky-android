package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzfsi;
import com.google.android.gms.internal.ads.zzfsk;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class ebe implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final rbe a;
    private final String b;
    private final String c;
    private final LinkedBlockingQueue d;
    private final HandlerThread e;
    private final tae f;
    private final long g;
    private final int h;

    public ebe(Context context, int i, int i2, String str, String str2, String str3, tae taeVar) {
        this.b = str;
        this.h = i2;
        this.c = str2;
        this.f = taeVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.e = handlerThread;
        handlerThread.start();
        this.g = System.currentTimeMillis();
        rbe rbeVar = new rbe(context, handlerThread.getLooper(), this, this, 19621000);
        this.a = rbeVar;
        this.d = new LinkedBlockingQueue();
        rbeVar.checkAvailabilityAndConnect();
    }

    static zzfsk a() {
        return new zzfsk(null, 1);
    }

    private final void e(int i, long j, Exception exc) {
        this.f.c(i, System.currentTimeMillis() - j, exc);
    }

    public final zzfsk b(int i) {
        zzfsk zzfskVar;
        try {
            zzfskVar = (zzfsk) this.d.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e(2009, this.g, e);
            zzfskVar = null;
        }
        e(3004, this.g, null);
        if (zzfskVar != null) {
            if (zzfskVar.zzc == 7) {
                tae.g(3);
            } else {
                tae.g(2);
            }
        }
        return zzfskVar == null ? a() : zzfskVar;
    }

    public final void c() {
        rbe rbeVar = this.a;
        if (rbeVar != null) {
            if (rbeVar.isConnected() || this.a.isConnecting()) {
                this.a.disconnect();
            }
        }
    }

    protected final ube d() {
        try {
            return this.a.c();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        ube d = d();
        if (d != null) {
            try {
                zzfsk x4 = d.x4(new zzfsi(1, this.h, this.b, this.c));
                e(5011, this.g, null);
                this.d.put(x4);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            e(4012, this.g, null);
            this.d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            e(4011, this.g, null);
            this.d.put(a());
        } catch (InterruptedException unused) {
        }
    }
}
