package defpackage;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class idd extends add {
    private final aob a;
    private final e6c b;
    private final zfd c;
    private final odc d;
    private final odd e;
    private final k9d f;

    public idd(aob aobVar, e6c e6cVar, zfd zfdVar, odc odcVar, odd oddVar, k9d k9dVar) {
        this.a = aobVar;
        this.b = e6cVar;
        this.c = zfdVar;
        this.d = odcVar;
        this.e = oddVar;
        this.f = k9dVar;
    }

    @Override // defpackage.add
    protected final j64 c(s1e s1eVar, Bundle bundle, v0e v0eVar, g1e g1eVar) {
        e6c e6cVar = this.b;
        e6cVar.i(s1eVar);
        e6cVar.f(bundle);
        e6cVar.g(new y4c(g1eVar, v0eVar, this.e));
        if (((Boolean) pla.c().a(mpa.s3)).booleanValue()) {
            this.b.d(this.f);
        }
        aob aobVar = this.a;
        e6c e6cVar2 = this.b;
        aic l = aobVar.l();
        l.m(e6cVar2.j());
        l.g(this.d);
        l.l(this.c);
        g2c a = l.zzf().a();
        return a.i(a.j());
    }
}
