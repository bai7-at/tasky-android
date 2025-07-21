package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.zzfho;

/* loaded from: classes3.dex */
public final class cad implements l9d {
    private final Context a;
    private final yxb b;

    cad(Context context, yxb yxbVar) {
        this.a = context;
        this.b = yxbVar;
    }

    @Override // defpackage.l9d
    public final /* bridge */ /* synthetic */ Object a(g1e g1eVar, v0e v0eVar, j9d j9dVar) {
        sbd sbdVar = new sbd(v0eVar, (o5b) j9dVar.b, AdFormat.APP_OPEN_AD);
        vxb a = this.b.a(new k1c(g1eVar, v0eVar, j9dVar.a), new chc(sbdVar, null), new wxb(v0eVar.b0));
        sbdVar.b(a.b());
        ((jbd) j9dVar.c).x6(a.f());
        return a.h();
    }

    @Override // defpackage.l9d
    public final void b(g1e g1eVar, v0e v0eVar, j9d j9dVar) {
        try {
            ((o5b) j9dVar.b).U(v0eVar.a0);
            ((o5b) j9dVar.b).N4(v0eVar.V, v0eVar.w.toString(), g1eVar.a.a.d, fc5.l3(this.a), new bad(j9dVar, null), (t3b) j9dVar.c);
        } catch (RemoteException e) {
            pzc.l("Remote exception loading an app open RTB ad", e);
            throw new zzfho(e);
        }
    }
}
