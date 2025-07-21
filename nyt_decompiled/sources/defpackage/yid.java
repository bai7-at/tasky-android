package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class yid implements oid {
    private final q1e a;
    private final aob b;
    private final Context c;
    private final lid d;
    private final v7e e;
    private j1c f;

    public yid(aob aobVar, Context context, lid lidVar, q1e q1eVar) {
        this.b = aobVar;
        this.c = context;
        this.d = lidVar;
        this.a = q1eVar;
        this.e = aobVar.D();
        q1eVar.L(lidVar.d());
    }

    @Override // defpackage.oid
    public final boolean a(zzl zzlVar, String str, mid midVar, nid nidVar) {
        q7e q7eVar;
        dyf.r();
        if (wxf.g(this.c) && zzlVar.zzs == null) {
            fgb.d("Failed to load the ad because app ID is missing.");
            this.b.c().execute(new Runnable() { // from class: qid
                @Override // java.lang.Runnable
                public final void run() {
                    yid.this.e();
                }
            });
            return false;
        }
        if (str == null) {
            fgb.d("Ad unit ID should not be null for NativeAdLoader.");
            this.b.c().execute(new Runnable() { // from class: rid
                @Override // java.lang.Runnable
                public final void run() {
                    yid.this.f();
                }
            });
            return false;
        }
        r2e.a(this.c, zzlVar.zzf);
        if (((Boolean) pla.c().a(mpa.N8)).booleanValue() && zzlVar.zzf) {
            this.b.p().n(true);
        }
        int i = ((pid) midVar).a;
        q1e q1eVar = this.a;
        q1eVar.e(zzlVar);
        q1eVar.Q(i);
        Context context = this.c;
        s1e g = q1eVar.g();
        f7e b = e7e.b(context, p7e.f(g), 8, zzlVar);
        ucb ucbVar = g.n;
        if (ucbVar != null) {
            this.d.d().K(ucbVar);
        }
        wic m = this.b.m();
        e6c e6cVar = new e6c();
        e6cVar.e(this.c);
        e6cVar.i(g);
        m.k(e6cVar.j());
        mdc mdcVar = new mdc();
        mdcVar.n(this.d.d(), this.b.c());
        m.f(mdcVar.q());
        m.d(this.d.c());
        m.a(new kyb(null));
        xic zzg = m.zzg();
        if (((Boolean) jra.c.e()).booleanValue()) {
            q7e e = zzg.e();
            e.h(8);
            e.b(zzlVar.zzp);
            q7eVar = e;
        } else {
            q7eVar = null;
        }
        this.b.B().c(1);
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        ScheduledExecutorService d = this.b.d();
        g2c a = zzg.a();
        j1c j1cVar = new j1c(kkeVar, d, a.i(a.j()));
        this.f = j1cVar;
        j1cVar.e(new xid(this, nidVar, q7eVar, b, zzg));
        return true;
    }

    final /* synthetic */ void e() {
        this.d.a().n(w2e.d(4, null, null));
    }

    final /* synthetic */ void f() {
        this.d.a().n(w2e.d(6, null, null));
    }

    @Override // defpackage.oid
    public final boolean zza() {
        j1c j1cVar = this.f;
        return j1cVar != null && j1cVar.f();
    }
}
