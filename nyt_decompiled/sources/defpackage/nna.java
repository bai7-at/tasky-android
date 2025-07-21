package defpackage;

import android.os.RemoteException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class nna {
    private final byte[] a;
    private int b;
    final /* synthetic */ ona c;

    /* synthetic */ nna(ona onaVar, byte[] bArr, mna mnaVar) {
        this.c = onaVar;
        this.a = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void d() {
        try {
            ona onaVar = this.c;
            if (onaVar.b) {
                onaVar.a.zzj(this.a);
                this.c.a.zzi(0);
                this.c.a.zzg(this.b);
                this.c.a.zzh(null);
                this.c.a.zzf();
            }
        } catch (RemoteException e) {
            fgb.c("Clearcut log failed", e);
        }
    }

    public final nna a(int i) {
        this.b = i;
        return this;
    }

    public final synchronized void c() {
        ExecutorService executorService;
        executorService = this.c.c;
        executorService.execute(new Runnable() { // from class: lna
            @Override // java.lang.Runnable
            public final void run() {
                nna.this.d();
            }
        });
    }
}
