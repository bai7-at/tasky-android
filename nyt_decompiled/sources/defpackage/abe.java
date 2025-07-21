package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.n1;
import com.google.android.gms.internal.ads.u0;
import com.google.android.gms.internal.ads.zzfrz;
import io.embrace.android.embracesdk.config.behavior.BackgroundActivityBehavior;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class abe implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final rbe a;
    private final String b;
    private final String c;
    private final LinkedBlockingQueue d;
    private final HandlerThread e;

    public abe(Context context, String str, String str2) {
        this.b = str;
        this.c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.e = handlerThread;
        handlerThread.start();
        rbe rbeVar = new rbe(context, handlerThread.getLooper(), this, this, 9200000);
        this.a = rbeVar;
        this.d = new LinkedBlockingQueue();
        rbeVar.checkAvailabilityAndConnect();
    }

    static n1 a() {
        u0 l0 = n1.l0();
        l0.q(PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID);
        return (n1) l0.i();
    }

    public final n1 b(int i) {
        n1 n1Var;
        try {
            n1Var = (n1) this.d.poll(BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            n1Var = null;
        }
        return n1Var == null ? a() : n1Var;
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
                try {
                    this.d.put(d.s4(new zzfrz(this.b, this.c)).t0());
                } catch (Throwable unused) {
                    this.d.put(a());
                }
            } catch (InterruptedException unused2) {
            } catch (Throwable th) {
                c();
                this.e.quit();
                throw th;
            }
            c();
            this.e.quit();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            this.d.put(a());
        } catch (InterruptedException unused) {
        }
    }
}
