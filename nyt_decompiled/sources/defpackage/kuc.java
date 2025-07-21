package defpackage;

/* loaded from: classes3.dex */
public final class kuc implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;

    public kuc(l4f l4fVar, l4f l4fVar2, l4f l4fVar3) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        cac cacVar = (guc) this.a.zzb();
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        cac cacVar2 = (x5d) this.c.zzb();
        if (true == ((Boolean) pla.c().a(mpa.z8)).booleanValue()) {
            cacVar = cacVar2;
        }
        return new tfc(cacVar, kkeVar);
    }
}
