package defpackage;

/* loaded from: classes3.dex */
final class hxd implements d4e {
    private final gyd a;

    public hxd(gyd gydVar) {
        this.a = gydVar;
    }

    @Override // defpackage.d4e
    public final void a(s3e s3eVar) {
        s3eVar.a = ((exd) this.a).b();
    }

    @Override // defpackage.d4e
    public final j64 b(e4e e4eVar) {
        ixd ixdVar = (ixd) e4eVar;
        return ((exd) this.a).c(ixdVar.b, ixdVar.a, null);
    }
}
