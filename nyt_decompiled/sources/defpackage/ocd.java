package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzeml;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class ocd implements l9d {
    private final Context a;
    private final xic b;
    private final Executor c;

    public ocd(Context context, xic xicVar, Executor executor) {
        this.a = context;
        this.b = xicVar;
        this.c = executor;
    }

    private static final boolean c(g1e g1eVar, int i) {
        return g1eVar.a.a.g.contains(Integer.toString(i));
    }

    @Override // defpackage.l9d
    public final /* bridge */ /* synthetic */ Object a(g1e g1eVar, v0e v0eVar, j9d j9dVar) {
        rkc I;
        y3b d = ((s2e) j9dVar.b).d();
        z3b e = ((s2e) j9dVar.b).e();
        c4b i = ((s2e) j9dVar.b).i();
        if (i != null && c(g1eVar, 6)) {
            I = rkc.g0(i);
        } else if (d != null && c(g1eVar, 6)) {
            I = rkc.J(d);
        } else if (d != null && c(g1eVar, 2)) {
            I = rkc.H(d);
        } else if (e != null && c(g1eVar, 6)) {
            I = rkc.K(e);
        } else {
            if (e == null || !c(g1eVar, 1)) {
                throw new zzeml(1, "No native ad mappers");
            }
            I = rkc.I(e);
        }
        s1e s1eVar = g1eVar.a.a;
        if (!s1eVar.g.contains(Integer.toString(I.P()))) {
            throw new zzeml(1, "No corresponding native ad listener");
        }
        tkc d2 = this.b.d(new k1c(g1eVar, v0eVar, j9dVar.a), new dlc(I), new anc(e, d, i));
        ((jbd) j9dVar.c).x6(d2.g());
        d2.c().C0(new svb((s2e) j9dVar.b), this.c);
        return d2.h();
    }

    @Override // defpackage.l9d
    public final void b(g1e g1eVar, v0e v0eVar, j9d j9dVar) {
        s2e s2eVar = (s2e) j9dVar.b;
        s1e s1eVar = g1eVar.a.a;
        String jSONObject = v0eVar.w.toString();
        String l = t6b.l(v0eVar.t);
        t3b t3bVar = (t3b) j9dVar.c;
        s1e s1eVar2 = g1eVar.a.a;
        s2eVar.u(this.a, s1eVar.d, jSONObject, l, t3bVar, s1eVar2.i, s1eVar2.g);
    }
}
