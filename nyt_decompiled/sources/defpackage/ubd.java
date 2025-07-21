package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzdkv;
import com.google.android.gms.internal.ads.zzfho;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class ubd implements l9d {
    private final Context a;
    private final bic b;
    private final zzcei c;
    private final Executor d;

    public ubd(Context context, zzcei zzceiVar, bic bicVar, Executor executor) {
        this.a = context;
        this.c = zzceiVar;
        this.b = bicVar;
        this.d = executor;
    }

    @Override // defpackage.l9d
    public final /* bridge */ /* synthetic */ Object a(g1e g1eVar, v0e v0eVar, final j9d j9dVar) {
        zgc c = this.b.c(new k1c(g1eVar, v0eVar, j9dVar.a), new chc(new iic() { // from class: tbd
            @Override // defpackage.iic
            public final void a(boolean z, Context context, m7c m7cVar) {
                ubd.this.c(j9dVar, z, context, m7cVar);
            }
        }, null));
        c.c().C0(new svb((s2e) j9dVar.b), this.d);
        ((jbd) j9dVar.c).x6(c.g());
        return c.i();
    }

    @Override // defpackage.l9d
    public final void b(g1e g1eVar, v0e v0eVar, j9d j9dVar) {
        s2e s2eVar = (s2e) j9dVar.b;
        s1e s1eVar = g1eVar.a.a;
        s2eVar.t(this.a, s1eVar.d, v0eVar.w.toString(), t6b.l(v0eVar.t), (t3b) j9dVar.c);
    }

    final /* synthetic */ void c(j9d j9dVar, boolean z, Context context, m7c m7cVar) {
        try {
            ((s2e) j9dVar.b).A(z);
            if (this.c.zzc < ((Integer) pla.c().a(mpa.H0)).intValue()) {
                ((s2e) j9dVar.b).C();
            } else {
                ((s2e) j9dVar.b).D(context);
            }
        } catch (zzfho e) {
            fgb.f("Cannot show interstitial.");
            throw new zzdkv(e.getCause());
        }
    }
}
