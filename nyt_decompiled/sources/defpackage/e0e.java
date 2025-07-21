package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzcab;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class e0e implements oid {
    private final Context a;
    private final Executor b;
    private final aob c;
    private final uzd d;
    private final gyd e;
    private final h1e f;
    private final v7e g;
    private final q1e h;
    private j64 i;

    public e0e(Context context, Executor executor, aob aobVar, gyd gydVar, uzd uzdVar, q1e q1eVar, h1e h1eVar) {
        this.a = context;
        this.b = executor;
        this.c = aobVar;
        this.e = gydVar;
        this.d = uzdVar;
        this.h = q1eVar;
        this.f = h1eVar;
        this.g = aobVar.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yqc j(eyd eydVar) {
        yqc n = this.c.n();
        e6c e6cVar = new e6c();
        e6cVar.e(this.a);
        e6cVar.i(((d0e) eydVar).a);
        e6cVar.h(this.f);
        n.c(e6cVar.j());
        n.b(new mdc().q());
        return n;
    }

    @Override // defpackage.oid
    public final boolean a(zzl zzlVar, String str, mid midVar, nid nidVar) {
        q7e q7eVar;
        zzcab zzcabVar = new zzcab(zzlVar, str);
        if (zzcabVar.zzb == null) {
            fgb.d("Ad unit ID should not be null for rewarded video ad.");
            this.b.execute(new Runnable() { // from class: xzd
                @Override // java.lang.Runnable
                public final void run() {
                    e0e.this.h();
                }
            });
            return false;
        }
        j64 j64Var = this.i;
        if (j64Var != null && !j64Var.isDone()) {
            return false;
        }
        if (((Boolean) jra.c.e()).booleanValue()) {
            gyd gydVar = this.e;
            if (gydVar.zzd() != null) {
                q7e zzh = ((zqc) gydVar.zzd()).zzh();
                zzh.h(5);
                zzh.b(zzcabVar.zza.zzp);
                q7eVar = zzh;
                r2e.a(this.a, zzcabVar.zza.zzf);
                if (((Boolean) pla.c().a(mpa.N8)).booleanValue() && zzcabVar.zza.zzf) {
                    this.c.p().n(true);
                }
                q1e q1eVar = this.h;
                q1eVar.J(zzcabVar.zzb);
                q1eVar.I(zzq.K0());
                q1eVar.e(zzcabVar.zza);
                Context context = this.a;
                s1e g = q1eVar.g();
                f7e b = e7e.b(context, p7e.f(g), 5, zzcabVar.zza);
                d0e d0eVar = new d0e(null);
                d0eVar.a = g;
                j64 a = this.e.a(new hyd(d0eVar, null), new fyd() { // from class: yzd
                    @Override // defpackage.fyd
                    public final c6c a(eyd eydVar) {
                        yqc j;
                        j = e0e.this.j(eydVar);
                        return j;
                    }
                }, null);
                this.i = a;
                zb.r(a, new b0e(this, nidVar, q7eVar, b, d0eVar), this.b);
                return true;
            }
        }
        q7eVar = null;
        r2e.a(this.a, zzcabVar.zza.zzf);
        if (((Boolean) pla.c().a(mpa.N8)).booleanValue()) {
            this.c.p().n(true);
        }
        q1e q1eVar2 = this.h;
        q1eVar2.J(zzcabVar.zzb);
        q1eVar2.I(zzq.K0());
        q1eVar2.e(zzcabVar.zza);
        Context context2 = this.a;
        s1e g2 = q1eVar2.g();
        f7e b2 = e7e.b(context2, p7e.f(g2), 5, zzcabVar.zza);
        d0e d0eVar2 = new d0e(null);
        d0eVar2.a = g2;
        j64 a2 = this.e.a(new hyd(d0eVar2, null), new fyd() { // from class: yzd
            @Override // defpackage.fyd
            public final c6c a(eyd eydVar) {
                yqc j;
                j = e0e.this.j(eydVar);
                return j;
            }
        }, null);
        this.i = a2;
        zb.r(a2, new b0e(this, nidVar, q7eVar, b2, d0eVar2), this.b);
        return true;
    }

    final /* synthetic */ void h() {
        this.d.n(w2e.d(6, null, null));
    }

    final void i(int i) {
        this.h.F().a(i);
    }

    @Override // defpackage.oid
    public final boolean zza() {
        throw null;
    }
}
