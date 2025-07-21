package defpackage;

import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes3.dex */
final class xid implements gke {
    final /* synthetic */ nid a;
    final /* synthetic */ q7e b;
    final /* synthetic */ f7e c;
    final /* synthetic */ xic d;
    final /* synthetic */ yid e;

    xid(yid yidVar, nid nidVar, q7e q7eVar, f7e f7eVar, xic xicVar) {
        this.a = nidVar;
        this.b = q7eVar;
        this.c = f7eVar;
        this.d = xicVar;
        this.e = yidVar;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        aob aobVar;
        v7e v7eVar;
        q7e q7eVar;
        final zze a = this.d.a().a(th);
        this.d.b().n(a);
        aobVar = this.e.b;
        aobVar.c().execute(new Runnable() { // from class: tid
            @Override // java.lang.Runnable
            public final void run() {
                lid lidVar;
                lidVar = xid.this.e.d;
                lidVar.a().n(a);
            }
        });
        r2e.b(a.zza, th, "NativeAdLoader.onFailure");
        this.a.zza();
        if (((Boolean) jra.c.e()).booleanValue() && (q7eVar = this.b) != null) {
            q7eVar.c(a);
            f7e f7eVar = this.c;
            f7eVar.d(th);
            f7eVar.S(false);
            q7eVar.a(f7eVar);
            q7eVar.g();
            return;
        }
        yid yidVar = this.e;
        f7e f7eVar2 = this.c;
        v7eVar = yidVar.e;
        f7eVar2.k(a);
        f7eVar2.d(th);
        f7eVar2.S(false);
        v7eVar.b(f7eVar2.zzl());
    }

    @Override // defpackage.gke
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        lid lidVar;
        aob aobVar;
        v7e v7eVar;
        q7e q7eVar;
        u0c u0cVar = (u0c) obj;
        synchronized (this.e) {
            try {
                wbc e = u0cVar.e();
                lidVar = this.e.d;
                e.a(lidVar.d());
                this.a.zzb(u0cVar);
                aobVar = this.e.b;
                aobVar.c().execute(new Runnable() { // from class: sid
                    @Override // java.lang.Runnable
                    public final void run() {
                        lid lidVar2;
                        lidVar2 = xid.this.e.d;
                        lidVar2.b().zzr();
                    }
                });
                if (!((Boolean) jra.c.e()).booleanValue() || (q7eVar = this.b) == null) {
                    v7eVar = this.e.e;
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
