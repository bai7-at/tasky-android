package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zb;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class kad implements g9d {
    private final nzb a;
    private final Context b;
    private final urc c;
    private final s1e d;
    private final Executor e;
    private final gge f;

    public kad(nzb nzbVar, Context context, Executor executor, urc urcVar, s1e s1eVar, gge ggeVar) {
        this.b = context;
        this.a = nzbVar;
        this.e = executor;
        this.c = urcVar;
        this.d = s1eVar;
        this.f = ggeVar;
    }

    @Override // defpackage.g9d
    public final j64 a(final g1e g1eVar, final v0e v0eVar) {
        return zb.n(zb.h(null), new ake() { // from class: jad
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return kad.this.c(g1eVar, v0eVar, obj);
            }
        }, this.e);
    }

    @Override // defpackage.g9d
    public final boolean b(g1e g1eVar, v0e v0eVar) {
        z0e z0eVar = v0eVar.t;
        return (z0eVar == null || z0eVar.a == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ j64 c(g1e g1eVar, v0e v0eVar, Object obj) {
        View xrcVar;
        zzq a = y1e.a(this.b, v0eVar.v);
        final wlb a2 = this.c.a(a, v0eVar, g1eVar.b.b);
        a2.P(v0eVar.X);
        if (((Boolean) pla.c().a(mpa.I7)).booleanValue() && v0eVar.h0) {
            xrcVar = e0c.a(this.b, (View) a2, v0eVar);
        } else {
            xrcVar = new xrc(this.b, (View) a2, (rda) this.f.apply(v0eVar));
        }
        final oyb a3 = this.a.a(new k1c(g1eVar, v0eVar, null), new uyb(xrcVar, a2, new s0c() { // from class: ead
            @Override // defpackage.s0c
            public final znc zza() {
                return wlb.this.zzq();
            }
        }, y1e.b(a)));
        a3.j().i(a2, false, null);
        r7c b = a3.b();
        t7c t7cVar = new t7c() { // from class: fad
            @Override // defpackage.t7c
            public final void zzq() {
                wlb wlbVar = wlb.this;
                if (wlbVar.zzN() != null) {
                    wlbVar.zzN().zzr();
                }
            }
        };
        kke kkeVar = pgb.f;
        b.C0(t7cVar, kkeVar);
        a3.j();
        z0e z0eVar = v0eVar.t;
        j64 j = trc.j(a2, z0eVar.b, z0eVar.a);
        if (v0eVar.N) {
            j.a(new Runnable() { // from class: gad
                @Override // java.lang.Runnable
                public final void run() {
                    wlb.this.U();
                }
            }, this.e);
        }
        j.a(new Runnable() { // from class: had
            @Override // java.lang.Runnable
            public final void run() {
                kad.this.d(a2);
            }
        }, this.e);
        return zb.m(j, new gge() { // from class: iad
            @Override // defpackage.gge
            public final Object apply(Object obj2) {
                return oyb.this.h();
            }
        }, kkeVar);
    }

    final /* synthetic */ void d(wlb wlbVar) {
        wlbVar.V();
        ymb zzq = wlbVar.zzq();
        zzfk zzfkVar = this.d.a;
        if (zzfkVar != null && zzq != null) {
            zzq.A6(zzfkVar);
        }
        if (!((Boolean) pla.c().a(mpa.i1)).booleanValue() || wlbVar.isAttachedToWindow()) {
            return;
        }
        wlbVar.onPause();
        wlbVar.W(true);
    }
}
