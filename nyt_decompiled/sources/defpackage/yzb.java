package defpackage;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class yzb extends nyb {
    private final kva j;
    private final Runnable k;
    private final Executor l;

    public yzb(t0c t0cVar, kva kvaVar, Runnable runnable, Executor executor) {
        super(t0cVar);
        this.j = kvaVar;
        this.k = runnable;
        this.l = executor;
    }

    static /* synthetic */ void o(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // defpackage.u0c
    public final void b() {
        final wzb wzbVar = new wzb(new AtomicReference(this.k));
        this.l.execute(new Runnable() { // from class: xzb
            @Override // java.lang.Runnable
            public final void run() {
                yzb.this.p(wzbVar);
            }
        });
    }

    @Override // defpackage.nyb
    public final int h() {
        return 0;
    }

    @Override // defpackage.nyb
    public final View i() {
        return null;
    }

    @Override // defpackage.nyb
    public final znc j() {
        return null;
    }

    @Override // defpackage.nyb
    public final w0e k() {
        return null;
    }

    @Override // defpackage.nyb
    public final w0e l() {
        return null;
    }

    @Override // defpackage.nyb
    public final void m() {
    }

    @Override // defpackage.nyb
    public final void n(ViewGroup viewGroup, zzq zzqVar) {
    }

    final /* synthetic */ void p(Runnable runnable) {
        try {
            if (this.j.zze(fc5.l3(runnable))) {
                return;
            }
            o(((wzb) runnable).a);
        } catch (RemoteException unused) {
            o(((wzb) runnable).a);
        }
    }
}
