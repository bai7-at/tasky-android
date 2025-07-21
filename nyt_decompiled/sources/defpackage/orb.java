package defpackage;

/* loaded from: classes3.dex */
final class orb implements ewc {
    private final gqb a;
    private final urb b;
    private Long c;
    private String d;

    /* synthetic */ orb(gqb gqbVar, urb urbVar, nrb nrbVar) {
        this.a = gqbVar;
        this.b = urbVar;
    }

    @Override // defpackage.ewc
    public final /* synthetic */ ewc a(String str) {
        str.getClass();
        this.d = str;
        return this;
    }

    @Override // defpackage.ewc
    public final /* bridge */ /* synthetic */ ewc b(long j) {
        this.c = Long.valueOf(j);
        return this;
    }

    @Override // defpackage.ewc
    public final fwc zzc() {
        d4f.c(this.c, Long.class);
        d4f.c(this.d, String.class);
        return new qrb(this.a, this.b, this.c, this.d, null);
    }
}
