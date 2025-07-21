package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;

/* loaded from: classes3.dex */
public final class eed implements l9d {
    private final Context a;
    private final zqc b;

    public eed(Context context, zqc zqcVar) {
        this.a = context;
        this.b = zqcVar;
    }

    @Override // defpackage.l9d
    public final /* bridge */ /* synthetic */ Object a(g1e g1eVar, v0e v0eVar, j9d j9dVar) {
        sbd sbdVar = new sbd(v0eVar, (o5b) j9dVar.b, AdFormat.REWARDED);
        vqc b = this.b.b(new k1c(g1eVar, v0eVar, j9dVar.a), new wqc(sbdVar));
        sbdVar.b(b.b());
        ((jbd) j9dVar.c).x6(b.n());
        return b.k();
    }

    @Override // defpackage.l9d
    public final void b(g1e g1eVar, v0e v0eVar, j9d j9dVar) {
        try {
            ((o5b) j9dVar.b).U(v0eVar.a0);
            if (g1eVar.a.a.o.a == 3) {
                ((o5b) j9dVar.b).y5(v0eVar.V, v0eVar.w.toString(), g1eVar.a.a.d, fc5.l3(this.a), new ded(this, j9dVar, null), (t3b) j9dVar.c);
            } else {
                ((o5b) j9dVar.b).Q5(v0eVar.V, v0eVar.w.toString(), g1eVar.a.a.d, fc5.l3(this.a), new ded(this, j9dVar, null), (t3b) j9dVar.c);
            }
        } catch (RemoteException e) {
            pzc.l("Remote exception loading a rewarded RTB ad", e);
        }
    }
}
