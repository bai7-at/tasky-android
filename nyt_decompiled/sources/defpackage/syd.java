package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zb;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class syd implements oid {
    private final Context a;
    private final Executor b;
    private final aob c;
    private final yhd d;
    private final uzd e;
    private qqa f;
    private final v7e g;
    private final q1e h;
    private j64 i;

    public syd(Context context, Executor executor, aob aobVar, yhd yhdVar, uzd uzdVar, q1e q1eVar) {
        this.a = context;
        this.b = executor;
        this.c = aobVar;
        this.d = yhdVar;
        this.h = q1eVar;
        this.e = uzdVar;
        this.g = aobVar.D();
    }

    @Override // defpackage.oid
    public final boolean a(zzl zzlVar, String str, mid midVar, nid nidVar) {
        bic zzh;
        q7e q7eVar;
        if (str == null) {
            fgb.d("Ad unit ID should not be null for interstitial ad.");
            this.b.execute(new Runnable() { // from class: myd
                @Override // java.lang.Runnable
                public final void run() {
                    syd.this.g();
                }
            });
            return false;
        }
        if (zza()) {
            return false;
        }
        if (((Boolean) pla.c().a(mpa.N8)).booleanValue() && zzlVar.zzf) {
            this.c.p().n(true);
        }
        zzq zzqVar = ((lyd) midVar).a;
        q1e q1eVar = this.h;
        q1eVar.J(str);
        q1eVar.I(zzqVar);
        q1eVar.e(zzlVar);
        Context context = this.a;
        s1e g = q1eVar.g();
        f7e b = e7e.b(context, p7e.f(g), 4, zzlVar);
        if (((Boolean) pla.c().a(mpa.b8)).booleanValue()) {
            aic l = this.c.l();
            e6c e6cVar = new e6c();
            e6cVar.e(this.a);
            e6cVar.i(g);
            l.m(e6cVar.j());
            mdc mdcVar = new mdc();
            mdcVar.m(this.d, this.b);
            mdcVar.n(this.d, this.b);
            l.g(mdcVar.q());
            l.l(new zfd(this.f));
            zzh = l.zzh();
        } else {
            mdc mdcVar2 = new mdc();
            uzd uzdVar = this.e;
            if (uzdVar != null) {
                mdcVar2.h(uzdVar, this.b);
                mdcVar2.i(this.e, this.b);
                mdcVar2.e(this.e, this.b);
            }
            aic l2 = this.c.l();
            e6c e6cVar2 = new e6c();
            e6cVar2.e(this.a);
            e6cVar2.i(g);
            l2.m(e6cVar2.j());
            mdcVar2.m(this.d, this.b);
            mdcVar2.h(this.d, this.b);
            mdcVar2.i(this.d, this.b);
            mdcVar2.e(this.d, this.b);
            mdcVar2.d(this.d, this.b);
            mdcVar2.o(this.d, this.b);
            mdcVar2.n(this.d, this.b);
            mdcVar2.l(this.d, this.b);
            mdcVar2.f(this.d, this.b);
            l2.g(mdcVar2.q());
            l2.l(new zfd(this.f));
            zzh = l2.zzh();
        }
        bic bicVar = zzh;
        if (((Boolean) jra.c.e()).booleanValue()) {
            q7e d = bicVar.d();
            d.h(4);
            d.b(zzlVar.zzp);
            q7eVar = d;
        } else {
            q7eVar = null;
        }
        g2c a = bicVar.a();
        j64 i = a.i(a.j());
        this.i = i;
        zb.r(i, new ryd(this, nidVar, q7eVar, b, bicVar), this.b);
        return true;
    }

    final /* synthetic */ void g() {
        this.d.n(w2e.d(6, null, null));
    }

    public final void h(qqa qqaVar) {
        this.f = qqaVar;
    }

    @Override // defpackage.oid
    public final boolean zza() {
        j64 j64Var = this.i;
        return (j64Var == null || j64Var.isDone()) ? false : true;
    }
}
