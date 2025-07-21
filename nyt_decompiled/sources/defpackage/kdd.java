package defpackage;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class kdd extends add {
    private final aob a;
    private final e6c b;
    private final odc c;
    private final odd d;
    private final h1e e;
    private final k9d f;

    public kdd(aob aobVar, e6c e6cVar, odc odcVar, h1e h1eVar, odd oddVar, k9d k9dVar) {
        this.a = aobVar;
        this.b = e6cVar;
        this.c = odcVar;
        this.e = h1eVar;
        this.d = oddVar;
        this.f = k9dVar;
    }

    @Override // defpackage.add
    protected final j64 c(s1e s1eVar, Bundle bundle, v0e v0eVar, g1e g1eVar) {
        h1e h1eVar;
        e6c e6cVar = this.b;
        e6cVar.i(s1eVar);
        e6cVar.f(bundle);
        e6cVar.g(new y4c(g1eVar, v0eVar, this.d));
        if (((Boolean) pla.c().a(mpa.r3)).booleanValue() && (h1eVar = this.e) != null) {
            this.b.h(h1eVar);
        }
        if (((Boolean) pla.c().a(mpa.s3)).booleanValue()) {
            this.b.d(this.f);
        }
        aob aobVar = this.a;
        e6c e6cVar2 = this.b;
        yqc n = aobVar.n();
        n.c(e6cVar2.j());
        n.b(this.c);
        g2c zzb = n.zze().zzb();
        return zzb.i(zzb.j());
    }
}
