package defpackage;

import com.google.android.gms.internal.ads.s6;
import com.google.android.gms.internal.ads.zzflg;

/* loaded from: classes3.dex */
public final class xfd implements g9d {
    private final qqa a;
    private final kke b;
    private final s6 c;
    private final ggd d;

    public xfd(s6 s6Var, kke kkeVar, qqa qqaVar, ggd ggdVar) {
        this.c = s6Var;
        this.b = kkeVar;
        this.a = qqaVar;
        this.d = ggdVar;
    }

    @Override // defpackage.g9d
    public final j64 a(g1e g1eVar, v0e v0eVar) {
        ugb ugbVar = new ugb();
        cgd cgdVar = new cgd();
        cgdVar.a(new wfd(this, ugbVar, g1eVar, v0eVar, cgdVar));
        z0e z0eVar = v0eVar.t;
        final fqa fqaVar = new fqa(cgdVar, z0eVar.b, z0eVar.a);
        zzflg zzflgVar = zzflg.CUSTOM_RENDER_SYN;
        return m5e.d(new g5e() { // from class: vfd
            @Override // defpackage.g5e
            public final void zza() {
                xfd.this.c(fqaVar);
            }
        }, this.b, zzflgVar, this.c).b(zzflg.CUSTOM_RENDER_ACK).d(ugbVar).a();
    }

    @Override // defpackage.g9d
    public final boolean b(g1e g1eVar, v0e v0eVar) {
        z0e z0eVar;
        return (this.a == null || (z0eVar = v0eVar.t) == null || z0eVar.a == null) ? false : true;
    }

    final /* synthetic */ void c(fqa fqaVar) {
        this.a.M4(fqaVar);
    }
}
