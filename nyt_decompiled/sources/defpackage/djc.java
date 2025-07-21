package defpackage;

/* loaded from: classes3.dex */
public final class djc implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;
    private final l4f d;
    private final l4f e;
    private final l4f f;

    public djc(l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4, l4f l4fVar5, l4f l4fVar6) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
        this.d = l4fVar4;
        this.e = l4fVar5;
        this.f = l4fVar6;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        aob aobVar = (aob) this.a.zzb();
        e6c a = ((o6c) this.b).a();
        odc a2 = ((lec) this.c).a();
        sic a3 = ((uic) this.d).a();
        w9c zzb = ((myb) this.e).zzb();
        odd oddVar = (odd) this.f.zzb();
        mzb j = aobVar.j();
        j.h(a.j());
        j.e(a2);
        j.d(a3);
        j.i(new zfd(null));
        j.o(new k0c(zzb, null));
        j.a(new kyb(null));
        if (((Boolean) pla.c().a(mpa.v3)).booleanValue()) {
            j.n(wdd.b(oddVar));
        }
        x0c c = j.zzh().c();
        d4f.b(c);
        return c;
    }
}
