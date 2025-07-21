package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzfho;

/* loaded from: classes3.dex */
public final class scd implements l9d {
    private final Context a;
    private final xic b;
    private c4b c;
    private final zzcei d;

    public scd(Context context, xic xicVar, zzcei zzceiVar) {
        this.a = context;
        this.b = xicVar;
        this.d = zzceiVar;
    }

    @Override // defpackage.l9d
    public final /* bridge */ /* synthetic */ Object a(g1e g1eVar, v0e v0eVar, j9d j9dVar) {
        if (!g1eVar.a.a.g.contains(Integer.toString(6))) {
            throw new zzeml(2, "Unified must be used for RTB.");
        }
        rkc g0 = rkc.g0(this.c);
        s1e s1eVar = g1eVar.a.a;
        if (!s1eVar.g.contains(Integer.toString(g0.P()))) {
            throw new zzeml(1, "No corresponding native ad listener");
        }
        tkc d = this.b.d(new k1c(g1eVar, v0eVar, j9dVar.a), new dlc(g0), new anc(null, null, this.c));
        ((jbd) j9dVar.c).x6(d.f());
        return d.h();
    }

    @Override // defpackage.l9d
    public final void b(g1e g1eVar, v0e v0eVar, j9d j9dVar) {
        try {
            ((o5b) j9dVar.b).U(v0eVar.a0);
            qcd qcdVar = null;
            if (this.d.zzc < ((Integer) pla.c().a(mpa.H1)).intValue()) {
                ((o5b) j9dVar.b).O1(v0eVar.V, v0eVar.w.toString(), g1eVar.a.a.d, fc5.l3(this.a), new rcd(this, j9dVar, qcdVar), (t3b) j9dVar.c);
            } else {
                ((o5b) j9dVar.b).t2(v0eVar.V, v0eVar.w.toString(), g1eVar.a.a.d, fc5.l3(this.a), new rcd(this, j9dVar, qcdVar), (t3b) j9dVar.c, g1eVar.a.a.i);
            }
        } catch (RemoteException e) {
            throw new zzfho(e);
        }
    }
}
