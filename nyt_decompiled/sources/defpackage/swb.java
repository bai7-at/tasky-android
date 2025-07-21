package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.vb;
import com.google.android.gms.internal.ads.zb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class swb implements w6c, r8c, t7c, jq9, p7c, sfc {
    private final Context a;
    private final Executor b;
    private final Executor c;
    private final ScheduledExecutorService d;
    private final g1e e;
    private final v0e f;
    private final z7e g;
    private final d2e h;
    private final gfa i;
    private final zqa j;
    private final q7e k;
    private final WeakReference l;
    private final WeakReference m;
    private final y4c n;
    private boolean r;
    private final AtomicBoolean s = new AtomicBoolean();
    private final bra t;

    swb(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, g1e g1eVar, v0e v0eVar, z7e z7eVar, d2e d2eVar, View view, wlb wlbVar, gfa gfaVar, zqa zqaVar, bra braVar, q7e q7eVar, y4c y4cVar) {
        this.a = context;
        this.b = executor;
        this.c = executor2;
        this.d = scheduledExecutorService;
        this.e = g1eVar;
        this.f = v0eVar;
        this.g = z7eVar;
        this.h = d2eVar;
        this.i = gfaVar;
        this.l = new WeakReference(view);
        this.m = new WeakReference(wlbVar);
        this.j = zqaVar;
        this.t = braVar;
        this.k = q7eVar;
        this.n = y4cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I() {
        String str;
        int i;
        List list;
        if (((Boolean) pla.c().a(mpa.ab)).booleanValue() && ((list = this.f.d) == null || list.isEmpty())) {
            return;
        }
        if (((Boolean) pla.c().a(mpa.p3)).booleanValue()) {
            str = this.i.c().zzh(this.a, (View) this.l.get(), null);
        } else {
            str = null;
        }
        if ((((Boolean) pla.c().a(mpa.n0)).booleanValue() && this.e.b.b.g) || !((Boolean) pra.h.e()).booleanValue()) {
            d2e d2eVar = this.h;
            z7e z7eVar = this.g;
            g1e g1eVar = this.e;
            v0e v0eVar = this.f;
            d2eVar.a(z7eVar.d(g1eVar, v0eVar, false, str, null, v0eVar.d));
            return;
        }
        if (((Boolean) pra.g.e()).booleanValue() && ((i = this.f.b) == 1 || i == 2 || i == 5)) {
        }
        zb.r((vb) zb.o(vb.C(zb.h(null)), ((Long) pla.c().a(mpa.V0)).longValue(), TimeUnit.MILLISECONDS, this.d), new rwb(this, str), this.b);
    }

    private final void K(final int i, final int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.l.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            I();
        } else {
            this.d.schedule(new Runnable() { // from class: pwb
                @Override // java.lang.Runnable
                public final void run() {
                    swb.this.F(i, i2);
                }
            }, i2, TimeUnit.MILLISECONDS);
        }
    }

    final /* synthetic */ void E(int i, int i2) {
        K(i - 1, i2);
    }

    final /* synthetic */ void F(final int i, final int i2) {
        this.b.execute(new Runnable() { // from class: nwb
            @Override // java.lang.Runnable
            public final void run() {
                swb.this.E(i, i2);
            }
        });
    }

    @Override // defpackage.w6c
    public final void c(iab iabVar, String str, String str2) {
        z7e z7eVar = this.g;
        v0e v0eVar = this.f;
        this.h.a(z7eVar.e(v0eVar, v0eVar.i, iabVar));
    }

    @Override // defpackage.p7c
    public final void k(zze zzeVar) {
        if (((Boolean) pla.c().a(mpa.v1)).booleanValue()) {
            this.h.a(this.g.c(this.e, this.f, z7e.f(2, zzeVar.zza, this.f.p)));
        }
    }

    @Override // defpackage.jq9
    public final void v() {
        if (!(((Boolean) pla.c().a(mpa.n0)).booleanValue() && this.e.b.b.g) && ((Boolean) pra.d.e()).booleanValue()) {
            zb.r(zb.e(vb.C(this.j.a()), Throwable.class, new gge() { // from class: mwb
                @Override // defpackage.gge
                public final Object apply(Object obj) {
                    return "failure_click_attok";
                }
            }, pgb.f), new qwb(this), this.b);
            return;
        }
        d2e d2eVar = this.h;
        z7e z7eVar = this.g;
        g1e g1eVar = this.e;
        v0e v0eVar = this.f;
        d2eVar.c(z7eVar.c(g1eVar, v0eVar, v0eVar.c), true == dyf.q().z(this.a) ? 2 : 1);
    }

    @Override // defpackage.w6c
    public final void zza() {
    }

    @Override // defpackage.w6c
    public final void zzb() {
    }

    @Override // defpackage.w6c
    public final void zzc() {
    }

    @Override // defpackage.w6c
    public final void zze() {
        z7e z7eVar = this.g;
        g1e g1eVar = this.e;
        v0e v0eVar = this.f;
        this.h.a(z7eVar.c(g1eVar, v0eVar, v0eVar.j));
    }

    @Override // defpackage.w6c
    public final void zzf() {
        z7e z7eVar = this.g;
        g1e g1eVar = this.e;
        v0e v0eVar = this.f;
        this.h.a(z7eVar.c(g1eVar, v0eVar, v0eVar.h));
    }

    final /* synthetic */ void zzm() {
        this.b.execute(new Runnable() { // from class: owb
            @Override // java.lang.Runnable
            public final void run() {
                swb.this.I();
            }
        });
    }

    @Override // defpackage.t7c
    public final void zzq() {
        if (this.s.compareAndSet(false, true)) {
            int intValue = ((Integer) pla.c().a(mpa.y3)).intValue();
            if (intValue > 0) {
                K(intValue, ((Integer) pla.c().a(mpa.z3)).intValue());
                return;
            }
            if (((Boolean) pla.c().a(mpa.x3)).booleanValue()) {
                this.c.execute(new Runnable() { // from class: lwb
                    @Override // java.lang.Runnable
                    public final void run() {
                        swb.this.zzm();
                    }
                });
            } else {
                I();
            }
        }
    }

    @Override // defpackage.r8c
    public final synchronized void zzr() {
        y4c y4cVar;
        try {
            if (this.r) {
                ArrayList arrayList = new ArrayList(this.f.d);
                arrayList.addAll(this.f.g);
                this.h.a(this.g.d(this.e, this.f, true, null, null, arrayList));
            } else {
                d2e d2eVar = this.h;
                z7e z7eVar = this.g;
                g1e g1eVar = this.e;
                v0e v0eVar = this.f;
                d2eVar.a(z7eVar.c(g1eVar, v0eVar, v0eVar.n));
                if (((Boolean) pla.c().a(mpa.u3)).booleanValue() && (y4cVar = this.n) != null) {
                    List h = z7e.h(z7e.g(y4cVar.b().n, y4cVar.a().g()), this.n.a().a());
                    d2e d2eVar2 = this.h;
                    z7e z7eVar2 = this.g;
                    y4c y4cVar2 = this.n;
                    d2eVar2.a(z7eVar2.c(y4cVar2.c(), y4cVar2.b(), h));
                }
                d2e d2eVar3 = this.h;
                z7e z7eVar3 = this.g;
                g1e g1eVar2 = this.e;
                v0e v0eVar2 = this.f;
                d2eVar3.a(z7eVar3.c(g1eVar2, v0eVar2, v0eVar2.g));
            }
            this.r = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.sfc
    public final void zzs() {
        z7e z7eVar = this.g;
        g1e g1eVar = this.e;
        v0e v0eVar = this.f;
        this.h.a(z7eVar.c(g1eVar, v0eVar, v0eVar.u0));
    }
}
