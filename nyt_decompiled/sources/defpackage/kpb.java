package defpackage;

/* loaded from: classes3.dex */
final class kpb implements wic {
    private final gqb a;
    private kyd b;
    private kxd c;
    private odc d;
    private g6c e;
    private sic f;
    private kyb g;

    /* synthetic */ kpb(gqb gqbVar, jpb jpbVar) {
        this.a = gqbVar;
    }

    @Override // defpackage.wic
    public final /* synthetic */ wic a(kyb kybVar) {
        this.g = kybVar;
        return this;
    }

    @Override // defpackage.wic
    public final /* synthetic */ wic d(sic sicVar) {
        this.f = sicVar;
        return this;
    }

    @Override // defpackage.wic
    public final /* synthetic */ wic f(odc odcVar) {
        this.d = odcVar;
        return this;
    }

    @Override // defpackage.c6c
    public final /* synthetic */ c6c j(kxd kxdVar) {
        this.c = kxdVar;
        return this;
    }

    @Override // defpackage.wic
    public final /* synthetic */ wic k(g6c g6cVar) {
        this.e = g6cVar;
        return this;
    }

    @Override // defpackage.c6c
    public final /* synthetic */ c6c p(kyd kydVar) {
        this.b = kydVar;
        return this;
    }

    @Override // defpackage.c6c
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final xic zzh() {
        d4f.c(this.d, odc.class);
        d4f.c(this.e, g6c.class);
        d4f.c(this.f, sic.class);
        d4f.c(this.g, kyb.class);
        return new mpb(this.a, this.g, this.f, new i2c(), new a3e(), new m4c(), new nvc(), this.d, this.e, ydd.a(), null, this.b, this.c, null);
    }
}
