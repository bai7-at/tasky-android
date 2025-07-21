package defpackage;

import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class lvd implements gke {
    final /* synthetic */ nid a;
    final /* synthetic */ q7e b;
    final /* synthetic */ f7e c;
    final /* synthetic */ nvd d;
    final /* synthetic */ ovd e;

    lvd(ovd ovdVar, nid nidVar, q7e q7eVar, f7e f7eVar, nvd nvdVar) {
        this.a = nidVar;
        this.b = q7eVar;
        this.c = f7eVar;
        this.d = nvdVar;
        this.e = ovdVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [d6c, java.lang.Object] */
    @Override // defpackage.gke
    public final void zza(Throwable th) {
        gyd gydVar;
        hwd hwdVar;
        c6c l;
        v7e v7eVar;
        q7e q7eVar;
        Executor executor;
        gydVar = this.e.e;
        uxb uxbVar = (uxb) gydVar.zzd();
        final zze b = uxbVar == null ? w2e.b(th, null) : uxbVar.zzb().a(th);
        synchronized (this.e) {
            try {
                this.e.j = null;
                if (uxbVar != null) {
                    uxbVar.zzc().n(b);
                    if (((Boolean) pla.c().a(mpa.a8)).booleanValue()) {
                        executor = this.e.b;
                        executor.execute(new Runnable() { // from class: kvd
                            @Override // java.lang.Runnable
                            public final void run() {
                                hwd hwdVar2;
                                hwdVar2 = lvd.this.e.d;
                                hwdVar2.n(b);
                            }
                        });
                    }
                } else {
                    hwdVar = this.e.d;
                    hwdVar.n(b);
                    l = this.e.l(this.d);
                    l.zzh().zzb().c().zzh();
                }
                r2e.b(b.zza, th, "AppOpenAdLoader.onFailure");
                this.a.zza();
                if (!((Boolean) jra.c.e()).booleanValue() || (q7eVar = this.b) == null) {
                    v7eVar = this.e.h;
                    f7e f7eVar = this.c;
                    f7eVar.k(b);
                    f7eVar.d(th);
                    f7eVar.S(false);
                    v7eVar.b(f7eVar.zzl());
                } else {
                    q7eVar.c(b);
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
        hwd hwdVar;
        u0c u0cVar = (u0c) obj;
        synchronized (this.e) {
            try {
                this.e.j = null;
                if (((Boolean) pla.c().a(mpa.a8)).booleanValue()) {
                    wbc e = u0cVar.e();
                    hwdVar = this.e.d;
                    e.b(hwdVar);
                }
                this.a.zzb(u0cVar);
                if (!((Boolean) jra.c.e()).booleanValue() || (q7eVar = this.b) == null) {
                    v7eVar = this.e.h;
                    f7e f7eVar = this.c;
                    f7eVar.a(u0cVar.g().b);
                    f7eVar.I(u0cVar.c().zzg());
                    f7eVar.S(true);
                    v7eVar.b(f7eVar.zzl());
                } else {
                    q7eVar.f(u0cVar.g().b);
                    q7eVar.e(u0cVar.c().zzg());
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
