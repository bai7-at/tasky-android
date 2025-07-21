package defpackage;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class ycd extends add {
    private final aob a;
    private final sic b;
    private final e6c c;
    private final odc d;
    private final odd e;
    private final k9d f;

    public ycd(aob aobVar, sic sicVar, e6c e6cVar, odc odcVar, odd oddVar, k9d k9dVar) {
        this.a = aobVar;
        this.b = sicVar;
        this.c = e6cVar;
        this.d = odcVar;
        this.e = oddVar;
        this.f = k9dVar;
    }

    @Override // defpackage.add
    protected final j64 c(s1e s1eVar, Bundle bundle, v0e v0eVar, g1e g1eVar) {
        e6c e6cVar = this.c;
        e6cVar.i(s1eVar);
        e6cVar.f(bundle);
        e6cVar.g(new y4c(g1eVar, v0eVar, this.e));
        if (((Boolean) pla.c().a(mpa.s3)).booleanValue()) {
            this.c.d(this.f);
        }
        aob aobVar = this.a;
        e6c e6cVar2 = this.c;
        wic m = aobVar.m();
        m.k(e6cVar2.j());
        m.f(this.d);
        m.d(this.b);
        m.a(new kyb(null));
        g2c a = m.zzg().a();
        return a.i(a.j());
    }
}
