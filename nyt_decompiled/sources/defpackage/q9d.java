package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzcei;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class q9d implements g9d {
    private final yxb a;
    private final Context b;
    private final urc c;
    private final s1e d;
    private final Executor e;
    private final zzcei f;
    private final wxa g;
    private final boolean h = ((Boolean) pla.c().a(mpa.M8)).booleanValue();
    private final l8d i;

    public q9d(yxb yxbVar, Context context, Executor executor, urc urcVar, s1e s1eVar, zzcei zzceiVar, wxa wxaVar, l8d l8dVar) {
        this.b = context;
        this.a = yxbVar;
        this.e = executor;
        this.c = urcVar;
        this.d = s1eVar;
        this.f = zzceiVar;
        this.g = wxaVar;
        this.i = l8dVar;
    }

    @Override // defpackage.g9d
    public final j64 a(final g1e g1eVar, final v0e v0eVar) {
        final yrc yrcVar = new yrc();
        j64 n = zb.n(zb.h(null), new ake() { // from class: m9d
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return q9d.this.c(v0eVar, g1eVar, yrcVar, obj);
            }
        }, this.e);
        n.a(new Runnable() { // from class: n9d
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
        final wlb a = this.c.a(this.d.e, v0eVar, g1eVar.b.b);
        a.P(v0eVar.X);
        yrcVar.a(this.b, (View) a);
        ugb ugbVar = new ugb();
        final vxb a2 = this.a.a(new k1c(g1eVar, v0eVar, null), new chc(new w9d(this.f, ugbVar, v0eVar, a, this.d, this.h, this.g, this.i), a), new wxb(v0eVar.b0));
        a2.j().i(a, false, this.h ? this.g : null);
        ugbVar.c(a2);
        a2.b().C0(new t7c() { // from class: o9d
            @Override // defpackage.t7c
            public final void zzq() {
                wlb wlbVar = wlb.this;
                if (wlbVar.zzN() != null) {
                    wlbVar.zzN().zzr();
                }
            }
        }, pgb.f);
        a2.j();
        z0e z0eVar = v0eVar.t;
        return zb.m(trc.j(a, z0eVar.b, z0eVar.a), new gge() { // from class: p9d
            @Override // defpackage.gge
            public final Object apply(Object obj2) {
                wlb wlbVar = a;
                if (v0eVar.N) {
                    wlbVar.U();
                }
                vxb vxbVar = a2;
                wlbVar.V();
                wlbVar.onPause();
                return vxbVar.h();
            }
        }, this.e);
    }
}
