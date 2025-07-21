package defpackage;

import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class ryd implements gke {
    final /* synthetic */ nid a;
    final /* synthetic */ q7e b;
    final /* synthetic */ f7e c;
    final /* synthetic */ bic d;
    final /* synthetic */ syd e;

    ryd(syd sydVar, nid nidVar, q7e q7eVar, f7e f7eVar, bic bicVar) {
        this.a = nidVar;
        this.b = q7eVar;
        this.c = f7eVar;
        this.d = bicVar;
        this.e = sydVar;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        v7e v7eVar;
        q7e q7eVar;
        Executor executor;
        Executor executor2;
        final zze a = this.d.a().a(th);
        synchronized (this.e) {
            try {
                this.e.i = null;
                this.d.b().n(a);
                if (((Boolean) pla.c().a(mpa.b8)).booleanValue()) {
                    executor = this.e.b;
                    executor.execute(new Runnable() { // from class: nyd
                        @Override // java.lang.Runnable
                        public final void run() {
                            yhd yhdVar;
                            yhdVar = ryd.this.e.d;
                            yhdVar.n(a);
                        }
                    });
                    executor2 = this.e.b;
                    executor2.execute(new Runnable() { // from class: oyd
                        @Override // java.lang.Runnable
                        public final void run() {
                            uzd uzdVar;
                            uzdVar = ryd.this.e.e;
                            uzdVar.n(a);
                        }
                    });
                }
                r2e.b(a.zza, th, "InterstitialAdLoader.onFailure");
                this.a.zza();
                if (!((Boolean) jra.c.e()).booleanValue() || (q7eVar = this.b) == null) {
                    v7eVar = this.e.g;
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
        v7e v7eVar;
        q7e q7eVar;
        Executor executor;
        Executor executor2;
        yhd yhdVar;
        uzd uzdVar;
        ygc ygcVar = (ygc) obj;
        synchronized (this.e) {
            try {
                this.e.i = null;
                zoa zoaVar = mpa.b8;
                if (((Boolean) pla.c().a(zoaVar)).booleanValue()) {
                    wbc e = ygcVar.e();
                    yhdVar = this.e.d;
                    e.a(yhdVar);
                    uzdVar = this.e.e;
                    e.d(uzdVar);
                }
                this.a.zzb(ygcVar);
                if (((Boolean) pla.c().a(zoaVar)).booleanValue()) {
                    executor = this.e.b;
                    executor.execute(new Runnable() { // from class: pyd
                        @Override // java.lang.Runnable
                        public final void run() {
                            yhd yhdVar2;
                            yhdVar2 = ryd.this.e.d;
                            yhdVar2.zzr();
                        }
                    });
                    executor2 = this.e.b;
                    executor2.execute(new Runnable() { // from class: qyd
                        @Override // java.lang.Runnable
                        public final void run() {
                            uzd uzdVar2;
                            uzdVar2 = ryd.this.e.e;
                            uzdVar2.zzr();
                        }
                    });
                }
                if (!((Boolean) jra.c.e()).booleanValue() || (q7eVar = this.b) == null) {
                    v7eVar = this.e.g;
                    f7e f7eVar = this.c;
                    f7eVar.a(ygcVar.g().b);
                    f7eVar.I(ygcVar.c().zzg());
                    f7eVar.S(true);
                    v7eVar.b(f7eVar.zzl());
                } else {
                    q7eVar.f(ygcVar.g().b);
                    q7eVar.e(ygcVar.c().zzg());
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
