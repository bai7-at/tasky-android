package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzbay;
import com.google.android.gms.internal.ads.zzbbb;
import java.io.IOException;

/* loaded from: classes3.dex */
final class cna implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbbb a;
    final /* synthetic */ ugb b;
    final /* synthetic */ ena c;

    cna(ena enaVar, zzbbb zzbbbVar, ugb ugbVar) {
        this.a = zzbbbVar;
        this.b = ugbVar;
        this.c = enaVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        boolean z;
        final vma vmaVar;
        obj = this.c.d;
        synchronized (obj) {
            try {
                ena enaVar = this.c;
                z = enaVar.b;
                if (z) {
                    return;
                }
                enaVar.b = true;
                vmaVar = this.c.a;
                if (vmaVar == null) {
                    return;
                }
                kke kkeVar = pgb.a;
                final zzbbb zzbbbVar = this.a;
                final ugb ugbVar = this.b;
                final j64 l = kkeVar.l(new Runnable() { // from class: zma
                    @Override // java.lang.Runnable
                    public final void run() {
                        cna cnaVar = cna.this;
                        vma vmaVar2 = vmaVar;
                        ugb ugbVar2 = ugbVar;
                        try {
                            wma d = vmaVar2.d();
                            boolean c = vmaVar2.c();
                            zzbbb zzbbbVar2 = zzbbbVar;
                            zzbay Y4 = c ? d.Y4(zzbbbVar2) : d.x4(zzbbbVar2);
                            if (!Y4.X0()) {
                                ugbVar2.d(new RuntimeException("No entry contents."));
                                ena.e(cnaVar.c);
                                return;
                            }
                            bna bnaVar = new bna(cnaVar, Y4.H0(), 1);
                            int read = bnaVar.read();
                            if (read == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            bnaVar.unread(read);
                            ugbVar2.c(gna.b(bnaVar, Y4.K0(), Y4.v1(), Y4.t0(), Y4.u1()));
                        } catch (RemoteException | IOException e) {
                            fgb.e("Unable to obtain a cache service instance.", e);
                            ugbVar2.d(e);
                            ena.e(cnaVar.c);
                        }
                    }
                });
                final ugb ugbVar2 = this.b;
                ugbVar2.a(new Runnable() { // from class: ana
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ugb.this.isCancelled()) {
                            l.cancel(true);
                        }
                    }
                }, pgb.f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
