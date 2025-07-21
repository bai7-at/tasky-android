package defpackage;

import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzecf;

/* loaded from: classes3.dex */
public abstract class s1d implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final ugb a = new ugb();
    protected final Object b = new Object();
    protected boolean c = false;
    protected boolean d = false;
    protected zzbze e;
    protected u8b f;

    protected final void a() {
        synchronized (this.b) {
            try {
                this.d = true;
                if (!this.f.isConnected()) {
                    if (this.f.isConnecting()) {
                    }
                    Binder.flushPendingCommands();
                }
                this.f.disconnect();
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        fgb.b("Disconnected from remote ad request service.");
        this.a.d(new zzecf(1));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        fgb.b("Cannot connect to remote service, fallback to local instance.");
    }
}
