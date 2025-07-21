package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzecf;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public abstract class e4d implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final ugb a = new ugb();
    protected boolean b = false;
    protected boolean c = false;
    protected v8b d;
    protected Context e;
    protected Looper f;
    protected ScheduledExecutorService g;

    protected final synchronized void a() {
        try {
            if (this.d == null) {
                this.d = new v8b(this.e, this.f, this, this);
            }
            this.d.checkAvailabilityAndConnect();
        } catch (Throwable th) {
            throw th;
        }
    }

    protected final synchronized void b() {
        try {
            this.c = true;
            v8b v8bVar = this.d;
            if (v8bVar == null) {
                return;
            }
            if (!v8bVar.isConnected()) {
                if (this.d.isConnecting()) {
                }
                Binder.flushPendingCommands();
            }
            this.d.disconnect();
            Binder.flushPendingCommands();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        String format = String.format(Locale.US, "Remote ad service connection failed, cause: %d.", Integer.valueOf(connectionResult.getErrorCode()));
        fgb.b(format);
        this.a.d(new zzecf(1, format));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public void onConnectionSuspended(int i) {
        String format = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i));
        fgb.b(format);
        this.a.d(new zzecf(1, format));
    }
}
