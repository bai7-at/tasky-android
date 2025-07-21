package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.s6;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzflg;

/* loaded from: classes3.dex */
public final class sfd implements g9d {
    private final Context a;
    private final nzb b;
    private final qqa c;
    private final kke d;
    private final s6 e;

    public sfd(Context context, nzb nzbVar, s6 s6Var, kke kkeVar, qqa qqaVar) {
        this.a = context;
        this.b = nzbVar;
        this.e = s6Var;
        this.d = kkeVar;
        this.c = qqaVar;
    }

    @Override // defpackage.g9d
    public final j64 a(g1e g1eVar, v0e v0eVar) {
        qfd qfdVar = new qfd(this, new View(this.a), null, new s0c() { // from class: ofd
            @Override // defpackage.s0c
            public final znc zza() {
                return null;
            }
        }, (w0e) v0eVar.v.get(0));
        oyb a = this.b.a(new k1c(g1eVar, v0eVar, null), qfdVar);
        rfd k = a.k();
        z0e z0eVar = v0eVar.t;
        final fqa fqaVar = new fqa(k, z0eVar.b, z0eVar.a);
        zzflg zzflgVar = zzflg.CUSTOM_RENDER_SYN;
        return m5e.d(new g5e() { // from class: pfd
            @Override // defpackage.g5e
            public final void zza() {
                sfd.this.c(fqaVar);
            }
        }, this.d, zzflgVar, this.e).b(zzflg.CUSTOM_RENDER_ACK).d(zb.h(a.h())).a();
    }

    @Override // defpackage.g9d
    public final boolean b(g1e g1eVar, v0e v0eVar) {
        z0e z0eVar;
        return (this.c == null || (z0eVar = v0eVar.t) == null || z0eVar.a == null) ? false : true;
    }

    final /* synthetic */ void c(fqa fqaVar) {
        this.c.M4(fqaVar);
    }
}
