package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.pal.g1;
import com.google.android.gms.internal.pal.h3;
import com.google.android.gms.internal.pal.zzhi;
import io.embrace.android.embracesdk.config.behavior.BackgroundActivityBehavior;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class p2f implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final p3f a;
    private final String b;
    private final String c;
    private final LinkedBlockingQueue d;
    private final HandlerThread e;

    public p2f(Context context, String str, String str2) {
        this.b = str;
        this.c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.e = handlerThread;
        handlerThread.start();
        p3f p3fVar = new p3f(context, handlerThread.getLooper(), this, this, 9200000);
        this.a = p3fVar;
        this.d = new LinkedBlockingQueue();
        p3fVar.checkAvailabilityAndConnect();
    }

    static g1 a() {
        h3 X = g1.X();
        X.n(PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID);
        return (g1) X.g();
    }

    public final g1 b(int i) {
        g1 g1Var;
        try {
            g1Var = (g1) this.d.poll(BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            g1Var = null;
        }
        return g1Var == null ? a() : g1Var;
    }

    public final void c() {
        p3f p3fVar = this.a;
        if (p3fVar != null) {
            if (p3fVar.isConnected() || this.a.isConnecting()) {
                this.a.disconnect();
            }
        }
    }

    protected final a5f d() {
        try {
            return this.a.c();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        a5f d = d();
        if (d != null) {
            try {
                try {
                    this.d.put(d.s4(new zzhi(this.b, this.c)).t0());
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
