package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzecf;

/* loaded from: classes3.dex */
public final class u1d extends s1d {
    u1d(Context context) {
        this.f = new u8b(context, dyf.v().b(), this, this);
    }

    public final j64 b(zzbze zzbzeVar) {
        synchronized (this.b) {
            try {
                if (this.c) {
                    return this.a;
                }
                this.c = true;
                this.e = zzbzeVar;
                this.f.checkAvailabilityAndConnect();
                this.a.a(new Runnable() { // from class: t1d
                    @Override // java.lang.Runnable
                    public final void run() {
                        u1d.this.a();
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
                        try {
                            this.f.c().R3(this.e, new r1d(this));
                        } catch (RemoteException | IllegalArgumentException unused) {
                            this.a.d(new zzecf(1));
                        }
                    } catch (Throwable th) {
                        dyf.q().w(th, "RemoteSignalsClientTask.onConnected");
                        this.a.d(new zzecf(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
