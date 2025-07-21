package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zb;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class vwd implements oid {
    private final Context a;
    private final Executor b;
    private final aob c;
    private final yhd d;
    private final cid e;
    private final ViewGroup f;
    private qqa g;
    private final w9c h;
    private final v7e i;
    private final ncc j;
    private final q1e k;
    private j64 l;

    public vwd(Context context, Executor executor, zzq zzqVar, aob aobVar, yhd yhdVar, cid cidVar, q1e q1eVar, ncc nccVar) {
        this.a = context;
        this.b = executor;
        this.c = aobVar;
        this.d = yhdVar;
        this.e = cidVar;
        this.k = q1eVar;
        this.h = aobVar.k();
        this.i = aobVar.D();
        this.f = new FrameLayout(context);
        this.j = nccVar;
        q1eVar.I(zzqVar);
    }

    @Override // defpackage.oid
    public final boolean a(zzl zzlVar, String str, mid midVar, nid nidVar) {
        nzb zzh;
        q7e q7eVar;
        if (str == null) {
            fgb.d("Ad unit ID should not be null for banner ad.");
            this.b.execute(new Runnable() { // from class: rwd
                @Override // java.lang.Runnable
                public final void run() {
                    vwd.this.l();
                }
            });
            return false;
        }
        if (!zza()) {
            if (((Boolean) pla.c().a(mpa.N8)).booleanValue() && zzlVar.zzf) {
                this.c.p().n(true);
            }
            q1e q1eVar = this.k;
            q1eVar.J(str);
            q1eVar.e(zzlVar);
            Context context = this.a;
            s1e g = q1eVar.g();
            f7e b = e7e.b(context, p7e.f(g), 3, zzlVar);
            if (!((Boolean) bsa.e.e()).booleanValue() || !this.k.x().zzk) {
                if (((Boolean) pla.c().a(mpa.Z7)).booleanValue()) {
                    mzb j = this.c.j();
                    e6c e6cVar = new e6c();
                    e6cVar.e(this.a);
                    e6cVar.i(g);
                    j.h(e6cVar.j());
                    mdc mdcVar = new mdc();
                    mdcVar.m(this.d, this.b);
                    mdcVar.n(this.d, this.b);
                    j.e(mdcVar.q());
                    j.i(new zfd(this.g));
                    j.d(new sic(clc.h, null));
                    j.o(new k0c(this.h, this.j));
                    j.a(new kyb(this.f));
                    zzh = j.zzh();
                } else {
                    mzb j2 = this.c.j();
                    e6c e6cVar2 = new e6c();
                    e6cVar2.e(this.a);
                    e6cVar2.i(g);
                    j2.h(e6cVar2.j());
                    mdc mdcVar2 = new mdc();
                    mdcVar2.m(this.d, this.b);
                    mdcVar2.d(this.d, this.b);
                    mdcVar2.d(this.e, this.b);
                    mdcVar2.o(this.d, this.b);
                    mdcVar2.g(this.d, this.b);
                    mdcVar2.h(this.d, this.b);
                    mdcVar2.i(this.d, this.b);
                    mdcVar2.e(this.d, this.b);
                    mdcVar2.n(this.d, this.b);
                    mdcVar2.l(this.d, this.b);
                    j2.e(mdcVar2.q());
                    j2.i(new zfd(this.g));
                    j2.d(new sic(clc.h, null));
                    j2.o(new k0c(this.h, this.j));
                    j2.a(new kyb(this.f));
                    zzh = j2.zzh();
                }
                nzb nzbVar = zzh;
                if (((Boolean) jra.c.e()).booleanValue()) {
                    q7e f = nzbVar.f();
                    f.h(3);
                    f.b(zzlVar.zzp);
                    q7eVar = f;
                } else {
                    q7eVar = null;
                }
                g2c d = nzbVar.d();
                j64 i = d.i(d.j());
                this.l = i;
                zb.r(i, new uwd(this, nidVar, q7eVar, b, nzbVar), this.b);
                return true;
            }
            yhd yhdVar = this.d;
            if (yhdVar != null) {
                yhdVar.n(w2e.d(7, null, null));
            }
        }
        return false;
    }

    public final ViewGroup c() {
        return this.f;
    }

    public final q1e h() {
        return this.k;
    }

    final /* synthetic */ void l() {
        this.d.n(w2e.d(6, null, null));
    }

    public final void m() {
        this.h.M0(this.j.a());
    }

    public final void n(koa koaVar) {
        this.e.a(koaVar);
    }

    public final void o(x9c x9cVar) {
        this.h.C0(x9cVar, this.b);
    }

    public final void p(qqa qqaVar) {
        this.g = qqaVar;
    }

    public final boolean q() {
        Object parent = this.f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        dyf.r();
        return wxf.v(view, view.getContext());
    }

    @Override // defpackage.oid
    public final boolean zza() {
        j64 j64Var = this.l;
        return (j64Var == null || j64Var.isDone()) ? false : true;
    }
}
