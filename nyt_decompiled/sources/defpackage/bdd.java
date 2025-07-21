package defpackage;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class bdd extends add {
    private final aob a;
    private final e6c b;
    private final odc c;
    private final odd d;
    private final k9d e;

    bdd(aob aobVar, e6c e6cVar, odc odcVar, odd oddVar, k9d k9dVar) {
        this.a = aobVar;
        this.b = e6cVar;
        this.c = odcVar;
        this.d = oddVar;
        this.e = k9dVar;
    }

    @Override // defpackage.add
    protected final j64 c(s1e s1eVar, Bundle bundle, v0e v0eVar, g1e g1eVar) {
        e6c e6cVar = this.b;
        e6cVar.i(s1eVar);
        e6cVar.f(bundle);
        e6cVar.g(new y4c(g1eVar, v0eVar, this.d));
        if (((Boolean) pla.c().a(mpa.s3)).booleanValue()) {
            this.b.d(this.e);
        }
        aob aobVar = this.a;
        e6c e6cVar2 = this.b;
        xxb i = aobVar.i();
        i.c(e6cVar2.j());
        i.b(this.c);
        g2c zzb = i.zze().zzb();
        return zzb.i(zzb.j());
    }
}
