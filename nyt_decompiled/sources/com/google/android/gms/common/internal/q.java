package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.stats.ConnectionTracker;
import defpackage.j6f;
import io.embrace.android.embracesdk.config.behavior.BackgroundActivityBehavior;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class q extends GmsClientSupervisor {
    private final HashMap a = new HashMap();
    private final Context b;
    private volatile Handler c;
    private final p d;
    private final ConnectionTracker e;
    private final long f;
    private final long g;
    private volatile Executor h;

    q(Context context, Looper looper, Executor executor) {
        p pVar = new p(this, null);
        this.d = pVar;
        this.b = context.getApplicationContext();
        this.c = new j6f(looper, pVar);
        this.e = ConnectionTracker.getInstance();
        this.f = BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT;
        this.g = 300000L;
        this.h = executor;
    }

    final void f(Executor executor) {
        synchronized (this.a) {
            this.h = executor;
        }
    }

    final void g(Looper looper) {
        synchronized (this.a) {
            this.c = new j6f(looper, this.d);
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final void zza(zzo zzoVar, ServiceConnection serviceConnection, String str) {
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.a) {
            try {
                o oVar = (o) this.a.get(zzoVar);
                if (oVar == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + zzoVar.toString());
                }
                if (!oVar.h(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + zzoVar.toString());
                }
                oVar.f(serviceConnection, str);
                if (oVar.i()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, zzoVar), this.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final boolean zzc(zzo zzoVar, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j;
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.a) {
            try {
                o oVar = (o) this.a.get(zzoVar);
                if (executor == null) {
                    executor = this.h;
                }
                if (oVar == null) {
                    oVar = new o(this, zzoVar);
                    oVar.d(serviceConnection, serviceConnection, str);
                    oVar.e(str, executor);
                    this.a.put(zzoVar, oVar);
                } else {
                    this.c.removeMessages(0, zzoVar);
                    if (oVar.h(serviceConnection)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + zzoVar.toString());
                    }
                    oVar.d(serviceConnection, serviceConnection, str);
                    int a = oVar.a();
                    if (a == 1) {
                        serviceConnection.onServiceConnected(oVar.b(), oVar.c());
                    } else if (a == 2) {
                        oVar.e(str, executor);
                    }
                }
                j = oVar.j();
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }
}
