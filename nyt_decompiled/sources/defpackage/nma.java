package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzbay;
import com.google.android.gms.internal.ads.zzbbb;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class nma {
    private ScheduledFuture a = null;
    private final Runnable b = new jma(this);
    private final Object c = new Object();
    private vma d;
    private Context e;
    private wma f;

    static /* bridge */ /* synthetic */ void h(nma nmaVar) {
        synchronized (nmaVar.c) {
            try {
                vma vmaVar = nmaVar.d;
                if (vmaVar == null) {
                    return;
                }
                if (vmaVar.isConnected() || nmaVar.d.isConnecting()) {
                    nmaVar.d.disconnect();
                }
                nmaVar.d = null;
                nmaVar.f = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        synchronized (this.c) {
            try {
                if (this.e != null && this.d == null) {
                    vma d = d(new lma(this), new mma(this));
                    this.d = d;
                    d.checkAvailabilityAndConnect();
                }
            } finally {
            }
        }
    }

    public final long a(zzbbb zzbbbVar) {
        synchronized (this.c) {
            try {
                if (this.f == null) {
                    return -2L;
                }
                if (this.d.c()) {
                    try {
                        return this.f.s4(zzbbbVar);
                    } catch (RemoteException e) {
                        fgb.e("Unable to call into cache service.", e);
                    }
                }
                return -2L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzbay b(zzbbb zzbbbVar) {
        synchronized (this.c) {
            if (this.f == null) {
                return new zzbay();
            }
            try {
                if (this.d.c()) {
                    return this.f.Y4(zzbbbVar);
                }
                return this.f.x4(zzbbbVar);
            } catch (RemoteException e) {
                fgb.e("Unable to call into cache service.", e);
                return new zzbay();
            }
        }
    }

    protected final synchronized vma d(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new vma(this.e, dyf.v().b(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    public final void i(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.c) {
            try {
                if (this.e != null) {
                    return;
                }
                this.e = context.getApplicationContext();
                if (((Boolean) pla.c().a(mpa.f4)).booleanValue()) {
                    l();
                } else {
                    if (((Boolean) pla.c().a(mpa.e4)).booleanValue()) {
                        dyf.d().c(new kma(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        if (((Boolean) pla.c().a(mpa.g4)).booleanValue()) {
            synchronized (this.c) {
                try {
                    l();
                    ScheduledFuture scheduledFuture = this.a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.a = pgb.d.schedule(this.b, ((Long) pla.c().a(mpa.h4)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
