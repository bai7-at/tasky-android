package defpackage;

/* loaded from: classes3.dex */
final class usb implements iie {
    private final gqb a;
    private g6c b;
    private ox9 c;

    /* synthetic */ usb(gqb gqbVar, tsb tsbVar) {
        this.a = gqbVar;
    }

    @Override // defpackage.iie
    public final /* synthetic */ iie a(g6c g6cVar) {
        this.b = g6cVar;
        return this;
    }

    @Override // defpackage.iie
    public final /* synthetic */ iie b(ox9 ox9Var) {
        this.c = ox9Var;
        return this;
    }

    @Override // defpackage.iie
    public final a1f zzc() {
        d4f.c(this.b, g6c.class);
        d4f.c(this.c, ox9.class);
        return new wsb(this.a, this.c, new i2c(), new nvc(), this.b, null, null, null);
    }
}
