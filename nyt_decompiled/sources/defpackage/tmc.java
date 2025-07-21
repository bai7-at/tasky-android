package defpackage;

import com.google.android.gms.internal.ads.zb;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class tmc implements t7c {
    private final rkc a;
    private final wkc b;
    private final Executor c;
    private final Executor d;

    public tmc(rkc rkcVar, wkc wkcVar, Executor executor, Executor executor2) {
        this.a = rkcVar;
        this.b = wkcVar;
        this.c = executor;
        this.d = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(final wlb wlbVar) {
        this.c.execute(new Runnable() { // from class: rmc
            @Override // java.lang.Runnable
            public final void run() {
                wlb.this.t("onSdkImpression", new so());
            }
        });
    }

    @Override // defpackage.t7c
    public final void zzq() {
        if (this.b.d()) {
            rkc rkcVar = this.a;
            k8e h0 = rkcVar.h0();
            if (h0 == null && rkcVar.j0() != null && ((Boolean) pla.c().a(mpa.a5)).booleanValue()) {
                rkc rkcVar2 = this.a;
                j64 j0 = rkcVar2.j0();
                ugb c0 = rkcVar2.c0();
                if (j0 == null || c0 == null) {
                    return;
                }
                zb.r(zb.l(j0, c0), new smc(this), this.d);
                return;
            }
            if (h0 != null) {
                rkc rkcVar3 = this.a;
                wlb e0 = rkcVar3.e0();
                wlb f0 = rkcVar3.f0();
                if (e0 == null) {
                    e0 = f0 != null ? f0 : null;
                }
                if (e0 != null) {
                    b(e0);
                }
            }
        }
    }
}
