package defpackage;

/* loaded from: classes3.dex */
public final class luc implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;

    public luc(l4f l4fVar, l4f l4fVar2, l4f l4fVar3) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        d6e d6eVar = (cvc) this.a.zzb();
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        d6e d6eVar2 = (e6d) this.c.zzb();
        if (true == ((Boolean) pla.c().a(mpa.z8)).booleanValue()) {
            d6eVar = d6eVar2;
        }
        return new tfc(d6eVar, kkeVar);
    }
}
