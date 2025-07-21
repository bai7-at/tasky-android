package defpackage;

/* loaded from: classes3.dex */
final class kqb implements xxb {
    private final gqb a;
    private kyd b;
    private kxd c;
    private odc d;
    private g6c e;

    /* synthetic */ kqb(gqb gqbVar, jqb jqbVar) {
        this.a = gqbVar;
    }

    @Override // defpackage.xxb
    public final /* synthetic */ xxb b(odc odcVar) {
        this.d = odcVar;
        return this;
    }

    @Override // defpackage.xxb
    public final /* synthetic */ xxb c(g6c g6cVar) {
        this.e = g6cVar;
        return this;
    }

    @Override // defpackage.c6c
    public final /* synthetic */ c6c j(kxd kxdVar) {
        this.c = kxdVar;
        return this;
    }

    @Override // defpackage.c6c
    public final /* synthetic */ c6c p(kyd kydVar) {
        this.b = kydVar;
        return this;
    }

    @Override // defpackage.c6c
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final yxb zzh() {
        d4f.c(this.d, odc.class);
        d4f.c(this.e, g6c.class);
        return new mqb(this.a, new i2c(), new a3e(), new m4c(), new nvc(), this.d, this.e, ydd.a(), null, this.b, this.c, null);
    }
}
