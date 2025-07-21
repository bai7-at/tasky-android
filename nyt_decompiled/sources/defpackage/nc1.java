package defpackage;

/* loaded from: classes.dex */
public final class nc1 implements yh {
    private final k49 a;
    private final hu8 b;
    private final Object c;
    private final mi d;
    private final mi e;
    private final mi f;
    private final Object g;
    private final long h;
    private final boolean i;

    public nc1(k49 k49Var, hu8 hu8Var, Object obj, mi miVar) {
        this.a = k49Var;
        this.b = hu8Var;
        this.c = obj;
        mi miVar2 = (mi) e().a().invoke(obj);
        this.d = miVar2;
        this.e = ni.e(miVar);
        this.g = e().b().invoke(k49Var.d(miVar2, miVar));
        this.h = k49Var.e(miVar2, miVar);
        mi e = ni.e(k49Var.b(d(), miVar2, miVar));
        this.f = e;
        int b = e.b();
        for (int i = 0; i < b; i++) {
            mi miVar3 = this.f;
            miVar3.e(i, uo6.l(miVar3.a(i), -this.a.a(), this.a.a()));
        }
    }

    @Override // defpackage.yh
    public boolean a() {
        return this.i;
    }

    @Override // defpackage.yh
    public mi b(long j) {
        return !c(j) ? this.a.b(j, this.d, this.e) : this.f;
    }

    @Override // defpackage.yh
    public long d() {
        return this.h;
    }

    @Override // defpackage.yh
    public hu8 e() {
        return this.b;
    }

    @Override // defpackage.yh
    public Object f(long j) {
        return !c(j) ? e().b().invoke(this.a.c(j, this.d, this.e)) : g();
    }

    @Override // defpackage.yh
    public Object g() {
        return this.g;
    }

    public nc1(oc1 oc1Var, hu8 hu8Var, Object obj, mi miVar) {
        this(oc1Var.a(hu8Var), hu8Var, obj, miVar);
    }
}
