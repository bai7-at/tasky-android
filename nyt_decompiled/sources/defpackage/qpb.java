package defpackage;

/* loaded from: classes3.dex */
final class qpb implements xrd {
    private final gqb a;
    private bud b;

    @Override // defpackage.xrd
    public final /* synthetic */ xrd a(bud budVar) {
        this.b = budVar;
        return this;
    }

    @Override // defpackage.xrd
    public final yrd zzb() {
        d4f.c(this.b, bud.class);
        return new spb(this.a, this.b, null);
    }
}
