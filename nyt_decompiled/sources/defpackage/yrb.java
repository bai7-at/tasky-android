package defpackage;

/* loaded from: classes3.dex */
final class yrb implements aic {
    private final gqb a;
    private kyd b;
    private kxd c;
    private odc d;
    private g6c e;
    private zfd f;

    /* synthetic */ yrb(gqb gqbVar, xrb xrbVar) {
        this.a = gqbVar;
    }

    @Override // defpackage.aic
    public final /* synthetic */ aic g(odc odcVar) {
        this.d = odcVar;
        return this;
    }

    @Override // defpackage.c6c
    public final /* synthetic */ c6c j(kxd kxdVar) {
        this.c = kxdVar;
        return this;
    }

    @Override // defpackage.aic
    public final /* synthetic */ aic l(zfd zfdVar) {
        this.f = zfdVar;
        return this;
    }

    @Override // defpackage.aic
    public final /* synthetic */ aic m(g6c g6cVar) {
        this.e = g6cVar;
        return this;
    }

    @Override // defpackage.c6c
    public final /* synthetic */ c6c p(kyd kydVar) {
        this.b = kydVar;
        return this;
    }

    @Override // defpackage.c6c
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final bic zzh() {
        d4f.c(this.d, odc.class);
        d4f.c(this.e, g6c.class);
        d4f.c(this.f, zfd.class);
        return new asb(this.a, new i2c(), new a3e(), new m4c(), new nvc(), this.d, this.e, ydd.a(), this.f, null, this.b, this.c, null);
    }
}
