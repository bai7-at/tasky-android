package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.q7;
import com.google.android.gms.internal.ads.zzfrw;

/* loaded from: classes3.dex */
final class hbe implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    private final rbe a;
    private final q7 b;
    private final Object c = new Object();
    private boolean d = false;
    private boolean e = false;

    hbe(Context context, Looper looper, q7 q7Var) {
        this.b = q7Var;
        this.a = new rbe(context, looper, this, this, 12800000);
    }

    private final void b() {
        synchronized (this.c) {
            try {
                if (!this.a.isConnected()) {
                    if (this.a.isConnecting()) {
                    }
                    Binder.flushPendingCommands();
                }
                this.a.disconnect();
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final void a() {
        synchronized (this.c) {
            try {
                if (!this.d) {
                    this.d = true;
                    this.a.checkAvailabilityAndConnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.c) {
            try {
                if (this.e) {
                    return;
                }
                this.e = true;
                try {
                    this.a.c().Y4(new zzfrw(this.b.i()));
                } catch (Exception unused) {
                } catch (Throwable th) {
                    b();
                    throw th;
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
