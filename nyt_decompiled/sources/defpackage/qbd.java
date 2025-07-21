package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzcei;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class qbd implements g9d {
    private final Context a;
    private final urc b;
    private final bic c;
    private final s1e d;
    private final Executor e;
    private final zzcei f;
    private final wxa g;
    private final boolean h = ((Boolean) pla.c().a(mpa.M8)).booleanValue();
    private final l8d i;

    public qbd(Context context, zzcei zzceiVar, s1e s1eVar, Executor executor, bic bicVar, urc urcVar, wxa wxaVar, l8d l8dVar) {
        this.a = context;
        this.d = s1eVar;
        this.c = bicVar;
        this.e = executor;
        this.f = zzceiVar;
        this.b = urcVar;
        this.g = wxaVar;
        this.i = l8dVar;
    }

    @Override // defpackage.g9d
    public final j64 a(final g1e g1eVar, final v0e v0eVar) {
        final yrc yrcVar = new yrc();
        j64 n = zb.n(zb.h(null), new ake() { // from class: nbd
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return qbd.this.c(v0eVar, g1eVar, yrcVar, obj);
            }
        }, this.e);
        n.a(new Runnable() { // from class: obd
            @Override // java.lang.Runnable
            public final void run() {
                yrc.this.b();
            }
        }, this.e);
        return n;
    }

    @Override // defpackage.g9d
    public final boolean b(g1e g1eVar, v0e v0eVar) {
        z0e z0eVar = v0eVar.t;
        return (z0eVar == null || z0eVar.a == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ j64 c(final v0e v0eVar, g1e g1eVar, yrc yrcVar, Object obj) {
        final wlb a = this.b.a(this.d.e, v0eVar, g1eVar.b.b);
        a.P(v0eVar.X);
        yrcVar.a(this.a, (View) a);
        ugb ugbVar = new ugb();
        final zgc c = this.c.c(new k1c(g1eVar, v0eVar, null), new chc(new pbd(this.a, this.f, ugbVar, v0eVar, a, this.d, this.h, this.g, this.i), a));
        ugbVar.c(c);
        c.b().C0(new t7c() { // from class: lbd
            @Override // defpackage.t7c
            public final void zzq() {
                wlb wlbVar = wlb.this;
                if (wlbVar.zzN() != null) {
                    wlbVar.zzN().zzr();
                }
            }
        }, pgb.f);
        c.k().i(a, true, this.h ? this.g : null);
        c.k();
        z0e z0eVar = v0eVar.t;
        return zb.m(trc.j(a, z0eVar.b, z0eVar.a), new gge() { // from class: mbd
            @Override // defpackage.gge
            public final Object apply(Object obj2) {
                wlb wlbVar = a;
                if (v0eVar.N) {
                    wlbVar.U();
                }
                zgc zgcVar = c;
                wlbVar.V();
                wlbVar.onPause();
                return zgcVar.i();
            }
        }, this.e);
    }
}
