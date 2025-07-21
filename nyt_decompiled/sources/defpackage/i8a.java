package defpackage;

/* loaded from: classes3.dex */
public final class i8a implements r8a {
    private l6a a;
    private pfe b;
    private tx9 c;

    public i8a(String str) {
        x3a x3aVar = new x3a();
        x3aVar.w(str);
        this.a = x3aVar.D();
    }

    @Override // defpackage.r8a
    public final void a(pfe pfeVar, sv9 sv9Var, m9a m9aVar) {
        this.b = pfeVar;
        m9aVar.c();
        tx9 zzw = sv9Var.zzw(m9aVar.a(), 5);
        this.c = zzw;
        zzw.f(this.a);
    }

    @Override // defpackage.r8a
    public final void b(b9e b9eVar) {
        wad.b(this.b);
        int i = khe.a;
        long e = this.b.e();
        long f = this.b.f();
        if (e == -9223372036854775807L || f == -9223372036854775807L) {
            return;
        }
        l6a l6aVar = this.a;
        if (f != l6aVar.p) {
            x3a b = l6aVar.b();
            b.B(f);
            l6a D = b.D();
            this.a = D;
            this.c.f(D);
        }
        int q = b9eVar.q();
        this.c.b(b9eVar, q);
        this.c.c(e, 1, q, 0, null);
    }
}
