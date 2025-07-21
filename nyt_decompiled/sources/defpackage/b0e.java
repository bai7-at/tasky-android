package defpackage;

import com.google.android.gms.ads.internal.client.zze;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class b0e implements gke {
    final /* synthetic */ nid a;
    final /* synthetic */ q7e b;
    final /* synthetic */ f7e c;
    final /* synthetic */ d0e d;
    final /* synthetic */ e0e e;

    b0e(e0e e0eVar, nid nidVar, q7e q7eVar, f7e f7eVar, d0e d0eVar) {
        this.a = nidVar;
        this.b = q7eVar;
        this.c = f7eVar;
        this.d = d0eVar;
        this.e = e0eVar;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        gyd gydVar;
        uzd uzdVar;
        yqc j;
        v7e v7eVar;
        q7e q7eVar;
        Executor executor;
        gydVar = this.e.e;
        zqc zqcVar = (zqc) gydVar.zzd();
        final zze b = zqcVar == null ? w2e.b(th, null) : zqcVar.zzb().a(th);
        synchronized (this.e) {
            try {
                if (zqcVar != null) {
                    zqcVar.a().n(b);
                    executor = this.e.b;
                    executor.execute(new Runnable() { // from class: zzd
                        @Override // java.lang.Runnable
                        public final void run() {
                            uzd uzdVar2;
                            uzdVar2 = b0e.this.e.d;
                            uzdVar2.n(b);
                        }
                    });
                } else {
                    uzdVar = this.e.d;
                    uzdVar.n(b);
                    j = this.e.j(this.d);
                    j.zzh().zzb().c().zzh();
                }
                r2e.b(b.zza, th, "RewardedAdLoader.onFailure");
                this.a.zza();
                if (!((Boolean) jra.c.e()).booleanValue() || (q7eVar = this.b) == null) {
                    v7eVar = this.e.g;
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
        uzd uzdVar;
        Executor executor;
        final uzd uzdVar2;
        uzd uzdVar3;
        v7e v7eVar;
        q7e q7eVar;
        uqc uqcVar = (uqc) obj;
        synchronized (this.e) {
            try {
                wbc e = uqcVar.e();
                uzdVar = this.e.d;
                e.d(uzdVar);
                this.a.zzb(uqcVar);
                e0e e0eVar = this.e;
                executor = e0eVar.b;
                uzdVar2 = e0eVar.d;
                Objects.requireNonNull(uzdVar2);
                executor.execute(new Runnable() { // from class: a0e
                    @Override // java.lang.Runnable
                    public final void run() {
                        uzd.this.zzr();
                    }
                });
                uzdVar3 = this.e.d;
                uzdVar3.l();
                if (!((Boolean) jra.c.e()).booleanValue() || (q7eVar = this.b) == null) {
                    v7eVar = this.e.g;
                    f7e f7eVar = this.c;
                    f7eVar.a(uqcVar.g().b);
                    f7eVar.I(uqcVar.c().zzg());
                    f7eVar.S(true);
                    v7eVar.b(f7eVar.zzl());
                } else {
                    q7eVar.f(uqcVar.g().b);
                    q7eVar.e(uqcVar.c().zzg());
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
