package defpackage;

import android.os.Bundle;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class ddd extends add {
    private final aob a;
    private final e6c b;
    private final zfd c;
    private final odc d;
    private final sic e;
    private final w9c f;
    private final ViewGroup g;
    private final ncc h;
    private final odd i;
    private final k9d j;

    public ddd(aob aobVar, e6c e6cVar, zfd zfdVar, odc odcVar, sic sicVar, w9c w9cVar, ViewGroup viewGroup, ncc nccVar, odd oddVar, k9d k9dVar) {
        this.a = aobVar;
        this.b = e6cVar;
        this.c = zfdVar;
        this.d = odcVar;
        this.e = sicVar;
        this.f = w9cVar;
        this.g = viewGroup;
        this.h = nccVar;
        this.i = oddVar;
        this.j = k9dVar;
    }

    @Override // defpackage.add
    protected final j64 c(s1e s1eVar, Bundle bundle, v0e v0eVar, g1e g1eVar) {
        e6c e6cVar = this.b;
        e6cVar.i(s1eVar);
        e6cVar.f(bundle);
        e6cVar.g(new y4c(g1eVar, v0eVar, this.i));
        if (((Boolean) pla.c().a(mpa.s3)).booleanValue()) {
            this.b.d(this.j);
        }
        aob aobVar = this.a;
        e6c e6cVar2 = this.b;
        mzb j = aobVar.j();
        j.h(e6cVar2.j());
        j.e(this.d);
        j.i(this.c);
        j.d(this.e);
        j.o(new k0c(this.f, this.h));
        j.a(new kyb(this.g));
        g2c d = j.zzk().d();
        return d.i(d.j());
    }
}
