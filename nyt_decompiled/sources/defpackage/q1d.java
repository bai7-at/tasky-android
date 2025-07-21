package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.zzecf;

/* loaded from: classes3.dex */
public final class q1d extends s1d {
    public q1d(Context context) {
        this.f = new u8b(context, dyf.v().b(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.b) {
            try {
                if (!this.d) {
                    this.d = true;
                    try {
                        try {
                            this.f.c().X4(this.e, new r1d(this));
                        } catch (RemoteException | IllegalArgumentException unused) {
                            this.a.d(new zzecf(1));
                        }
                    } catch (Throwable th) {
                        dyf.q().w(th, "RemoteAdRequestClientTask.onConnected");
                        this.a.d(new zzecf(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.s1d, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        fgb.b("Cannot connect to remote service, fallback to local instance.");
        this.a.d(new zzecf(1));
    }
}
