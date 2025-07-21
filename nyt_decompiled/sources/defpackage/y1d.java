package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzecf;

/* loaded from: classes3.dex */
public final class y1d extends s1d {
    private String g;
    private int h = 1;

    y1d(Context context) {
        this.f = new u8b(context, dyf.v().b(), this, this);
    }

    public final j64 b(zzbze zzbzeVar) {
        synchronized (this.b) {
            try {
                int i = this.h;
                if (i != 1 && i != 2) {
                    return zb.g(new zzecf(2));
                }
                if (this.c) {
                    return this.a;
                }
                this.h = 2;
                this.c = true;
                this.e = zzbzeVar;
                this.f.checkAvailabilityAndConnect();
                this.a.a(new Runnable() { // from class: w1d
                    @Override // java.lang.Runnable
                    public final void run() {
                        y1d.this.a();
                    }
                }, pgb.f);
                return this.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final j64 c(String str) {
        synchronized (this.b) {
            try {
                int i = this.h;
                if (i != 1 && i != 3) {
                    return zb.g(new zzecf(2));
                }
                if (this.c) {
                    return this.a;
                }
                this.h = 3;
                this.c = true;
                this.g = str;
                this.f.checkAvailabilityAndConnect();
                this.a.a(new Runnable() { // from class: x1d
                    @Override // java.lang.Runnable
                    public final void run() {
                        y1d.this.a();
                    }
                }, pgb.f);
                return this.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.b) {
            try {
                if (!this.d) {
                    this.d = true;
                    try {
                        int i = this.h;
                        if (i == 2) {
                            this.f.c().o4(this.e, new r1d(this));
                        } else if (i == 3) {
                            this.f.c().Z5(this.g, new r1d(this));
                        } else {
                            this.a.d(new zzecf(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.a.d(new zzecf(1));
                    } catch (Throwable th) {
                        dyf.q().w(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
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
