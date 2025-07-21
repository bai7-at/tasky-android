package defpackage;

/* loaded from: classes3.dex */
public abstract class u0c implements pdd {
    protected final g1e a;
    protected final v0e b;
    private final y7c c;
    private final p8c d;
    private final dyd e;
    private final p6c f;
    private final ybc g;
    private final t8c h;
    private final qfc i;

    protected u0c(t0c t0cVar) {
        g1e g1eVar;
        v0e v0eVar;
        y7c y7cVar;
        p8c p8cVar;
        dyd dydVar;
        p6c p6cVar;
        ybc ybcVar;
        t8c t8cVar;
        qfc qfcVar;
        g1eVar = t0cVar.a;
        this.a = g1eVar;
        v0eVar = t0cVar.b;
        this.b = v0eVar;
        y7cVar = t0cVar.c;
        this.c = y7cVar;
        p8cVar = t0cVar.d;
        this.d = p8cVar;
        dydVar = t0cVar.e;
        this.e = dydVar;
        p6cVar = t0cVar.f;
        this.f = p6cVar;
        ybcVar = t0cVar.g;
        this.g = ybcVar;
        t8cVar = t0cVar.h;
        this.h = t8cVar;
        qfcVar = t0cVar.i;
        this.i = qfcVar;
    }

    public void a() {
        this.c.M0(null);
    }

    public void b() {
        this.d.zzr();
        this.h.E(this);
    }

    public final p6c c() {
        return this.f;
    }

    public final y7c d() {
        return this.c;
    }

    public final wbc e() {
        return this.g.n();
    }

    public final dyd f() {
        return this.e;
    }

    public final g1e g() {
        return this.a;
    }

    @Override // defpackage.pdd
    public final void zzq() {
        this.i.zzs();
    }
}
