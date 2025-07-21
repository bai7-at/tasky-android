package defpackage;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.zze;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class uwd implements gke {
    final /* synthetic */ nid a;
    final /* synthetic */ q7e b;
    final /* synthetic */ f7e c;
    final /* synthetic */ nzb d;
    final /* synthetic */ vwd e;

    uwd(vwd vwdVar, nid nidVar, q7e q7eVar, f7e f7eVar, nzb nzbVar) {
        this.a = nidVar;
        this.b = q7eVar;
        this.c = f7eVar;
        this.d = nzbVar;
        this.e = vwdVar;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        w9c w9cVar;
        ncc nccVar;
        v7e v7eVar;
        q7e q7eVar;
        Executor executor;
        final zze a = this.d.d().a(th);
        synchronized (this.e) {
            try {
                this.e.l = null;
                this.d.e().n(a);
                if (((Boolean) pla.c().a(mpa.Z7)).booleanValue()) {
                    executor = this.e.b;
                    executor.execute(new Runnable() { // from class: swd
                        @Override // java.lang.Runnable
                        public final void run() {
                            yhd yhdVar;
                            yhdVar = uwd.this.e.d;
                            yhdVar.n(a);
                        }
                    });
                }
                vwd vwdVar = this.e;
                w9cVar = vwdVar.h;
                nccVar = vwdVar.j;
                w9cVar.M0(nccVar.a());
                r2e.b(a.zza, th, "BannerAdLoader.onFailure");
                this.a.zza();
                if (!((Boolean) jra.c.e()).booleanValue() || (q7eVar = this.b) == null) {
                    v7eVar = this.e.i;
                    f7e f7eVar = this.c;
                    f7eVar.k(a);
                    f7eVar.d(th);
                    f7eVar.S(false);
                    v7eVar.b(f7eVar.zzl());
                } else {
                    q7eVar.c(a);
                    f7e f7eVar2 = this.c;
                    f7eVar2.d(th);
                    f7eVar2.S(false);
                    q7eVar.a(f7eVar2);
                    q7eVar.g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.gke
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        w9c w9cVar;
        v7e v7eVar;
        q7e q7eVar;
        Executor executor;
        final yhd yhdVar;
        yhd yhdVar2;
        cid cidVar;
        nyb nybVar = (nyb) obj;
        synchronized (this.e) {
            try {
                this.e.l = null;
                viewGroup = this.e.f;
                viewGroup.removeAllViews();
                if (nybVar.i() != null) {
                    ViewParent parent = nybVar.i().getParent();
                    if (parent instanceof ViewGroup) {
                        fgb.g("Banner view provided from " + (nybVar.c() != null ? nybVar.c().zzg() : "") + " already has a parent view. Removing its old parent.");
                        ((ViewGroup) parent).removeView(nybVar.i());
                    }
                }
                zoa zoaVar = mpa.Z7;
                if (((Boolean) pla.c().a(zoaVar)).booleanValue()) {
                    wbc e = nybVar.e();
                    yhdVar2 = this.e.d;
                    e.a(yhdVar2);
                    cidVar = this.e.e;
                    e.c(cidVar);
                }
                viewGroup2 = this.e.f;
                viewGroup2.addView(nybVar.i());
                this.a.zzb(nybVar);
                if (((Boolean) pla.c().a(zoaVar)).booleanValue()) {
                    vwd vwdVar = this.e;
                    executor = vwdVar.b;
                    yhdVar = vwdVar.d;
                    Objects.requireNonNull(yhdVar);
                    executor.execute(new Runnable() { // from class: twd
                        @Override // java.lang.Runnable
                        public final void run() {
                            yhd.this.zzr();
                        }
                    });
                }
                w9cVar = this.e.h;
                w9cVar.M0(nybVar.h());
                if (!((Boolean) jra.c.e()).booleanValue() || (q7eVar = this.b) == null) {
                    v7eVar = this.e.i;
                    f7e f7eVar = this.c;
                    f7eVar.a(nybVar.g().b);
                    f7eVar.I(nybVar.c().zzg());
                    f7eVar.S(true);
                    v7eVar.b(f7eVar.zzl());
                } else {
                    q7eVar.f(nybVar.g().b);
                    q7eVar.e(nybVar.c().zzg());
                    f7e f7eVar2 = this.c;
                    f7eVar2.S(true);
                    q7eVar.a(f7eVar2);
                    q7eVar.g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
